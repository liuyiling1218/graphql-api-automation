package fc.test.api.graphql.proxy;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import fc.test.api.graphql.Autheration;
import fc.test.api.graphql.annotation.*;
import fc.test.api.graphql.entity.GraphqlConifg;
import fc.test.api.graphql.entity.GrpahqlClient;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import java.lang.reflect.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import static io.restassured.RestAssured.given;


/**
 * 动态代理 Graphql请求
 *
 * @author SUIWEI WU
 * @date 2021/10/9 16:21
 */
@Slf4j
@Component
public class ApiProxy<T> implements InvocationHandler, ApplicationContextAware {

    private final Class<T> apiType;

    public ApiProxy(Class<T> apiType) {
        this.apiType = apiType;

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        String clientUrl = "";
        //接口返回结果解析
        GraphqlGroup graphqlGroup = apiType.getAnnotation(GraphqlGroup.class);


        List<GrpahqlClient> clients = GraphqlConifg.clients;
        for (GrpahqlClient grpahqlClient : clients) {
            if (grpahqlClient.getClientType() == graphqlGroup.client()) {
                clientUrl = grpahqlClient.getClientUrl();
            }
        }
        if (StringUtils.isBlank(clientUrl)) {
            throw new IllegalArgumentException("请正常配置测试地址~");
        }
        Class<?> returnType = method.getReturnType();
        //请求body封装
        String requestPayload = "{" +
                "\"operationName\": \"" + method.getName() + "\", " +
                "\"query\": \"" + queryDocument(method) + "\", " +
                "\"variables\": " + queryVariables(method, args) +
                "}";


        //方法的描述
        String methodDesc = "";
        if (method.isAnnotationPresent(GraphqlQuery.class)) {
            GraphqlQuery annotation = method.getAnnotation(GraphqlQuery.class);
            methodDesc = annotation.value();
        } else if (method.isAnnotationPresent(GraphqlMutation.class)) {
            GraphqlMutation annotation = method.getAnnotation(GraphqlMutation.class);
            methodDesc = annotation.value();
        }


        log.info("[" + graphqlGroup.value() + "] [" + methodDesc + "] 请求参数如下：\\n");
        RequestSpecification requestSpecification = given()
                .log().all()
                .header("Accept-Encoding", "gzip")
                .header("Connection", "Keep-Alive")
                .header("app-version", "46")
                .header("appversioncode", "46")
                .header("platform", "android")
                .header("accept", "*/*")
                .header("User-Agent", "okhttp/3.12.12")
                .urlEncodingEnabled(true)
                .contentType(ContentType.JSON)
                .body(requestPayload);
        if (Autheration.required == true && Autheration.token != null) {
            requestSpecification.header("authorization", Autheration.token);
        } else {
            Autheration.required = true;
        }
        Response response = requestSpecification.post(clientUrl);

        response.prettyPrint();


        if (response.statusCode() != 200 || JSONObject.parseObject(response.getBody().asString()) == null) {
            String message = JSONObject.parseObject(JSONObject.parseObject(response.getBody().asString()).getJSONArray("errors").get(0).toString()).getJSONObject("extensions").get("message").toString();
            throw new RuntimeException(apiType.getName() + "." + method.getName() + "(" + methodDesc + ")" + "请求异常，message: " + message);
        } else if (JSONObject.parseObject(response.getBody().asString()).getJSONObject("data") == null) {
            String message = JSONObject.parseObject(JSONObject.parseObject(response.getBody().asString()).getJSONArray("errors").get(0).toString()).get("message").toString();
            throw new RuntimeException(apiType.getName() + "." + method.getName() + "(" + methodDesc + ")" + "请求异常，message: " + message);
        } else if (JSONObject.parseObject(response.getBody().asString()).getJSONObject("data").get(method.getName()) == null) {
            String message = JSONObject.parseObject(JSONObject.parseObject(response.getBody().asString()).getJSONArray("errors").get(0).toString()).getJSONObject("extensions").get("message").toString();
            throw new RuntimeException(apiType.getName() + "." + method.getName() + "(" + methodDesc + ")" + "请求异常，message: " + message);
        } else {
            log.info(apiType.getName() + "." + method.getName() + "(" + methodDesc + ")" + "接口调用正常");
            JSONObject responseBody = JSONObject.parseObject(response.getBody().asString());
            JSONObject data = responseBody.getJSONObject("data");
            return (Object) parseResponseBody(method, data);
        }
    }

    /**
     * 解析response data
     *
     * @param method
     * @param data
     * @return
     */
    private Object parseResponseBody(Method method, JSONObject data) {
        Class<?> returnType = method.getReturnType();
        if (String.class.isAssignableFrom(returnType) ||
                Integer.class.isAssignableFrom(returnType) ||
                Boolean.class.isAssignableFrom(returnType) ||
                BigDecimal.class.isAssignableFrom(returnType) ||
                Date.class.isAssignableFrom(returnType) ||
                returnType.isPrimitive()) {
            return data.get(method.getName());
        } else if (Long.class.isAssignableFrom(returnType)) {
            //JsonObject 在接收Long类型时，如果小于Integer.Max_Value,则自动转为了Integer类型，这里强转为Long类型
            Number number = (Number) data.get(method.getName());
            return number.longValue();
        } else if (List.class.isAssignableFrom(method.getReturnType())) {
            Class<?> listGenericClazz = null;
            Type genericReturnType = method.getGenericReturnType();
            ParameterizedType parameterizedType = (ParameterizedType) genericReturnType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (Type type : actualTypeArguments) {
                if (type instanceof Class) {
                    listGenericClazz = (Class<?>) type;
                }
            }
            JSONArray entity = data.getJSONArray(method.getName());
            return JSON.parseArray(entity.toJSONString(), listGenericClazz);
        } else {
            JSONObject entity = data.getJSONObject(method.getName());
            return JSONObject.parseObject(entity.toJSONString(), method.getReturnType());
        }
    }

//
//        //dgs graphql client 实现接口调用
//

//
//        //方法名
//        String methodName = method.getName();
//        //参数类型
//        Class<?>[] parameterTypes = method.getParameterTypes();
//        //参数名称
//        Parameter[] parameters = method.getParameters();
//        //返回类型
//        Class<?> returnType = method.getReturnType();
//
//        //封装variables
//        String variables = "{}";
//        if (null == args) {
//            variables = "{}";
//        } else {
//            variables = "{";
//            for (int i = 0; i < args.length; i++) {
//                variables = variables + "\"" + parameters[i].getName() + "\":" + JSON.toJSONString(args[i]);
//                if (i != args.length - 1) {
//                    variables = variables + ",";
//                }
//            }
//            variables = variables + "}";
//        }
//
//        //封装query
//        String query = "";
//        if (method.isAnnotationPresent(GraphqlQuery.class)) {
//            query = query + "query ";
//        } else if (method.isAnnotationPresent(GraphqlMutation.class)) {
//            query = query + "mutation ";
//        }
//        //封装方法及入参
//        String operationMethodString = "";
//        if (parameters.length != 0) {
//            operationMethodString = "(";
//            for (int i = 0; i < parameterTypes.length; i++) {
//                operationMethodString = operationMethodString + "$" + parameters[i].getName() + ":" + parameterTypes[i].getSimpleName();
//                if (i != parameterTypes.length - 1) {
//                    operationMethodString = operationMethodString + ",";
//                }
//            }
//            operationMethodString = operationMethodString + ")";
//        }
//
//        //input2
//        String inputConvertString = "";
//        if (parameters.length != 0) {
//            inputConvertString = "(";
//            for (int i = 0; i < parameterTypes.length; i++) {
//                inputConvertString = inputConvertString + parameters[i].getName() + ":" + "$" + parameters[i].getName();
//                if (i != parameterTypes.length - 1) {
//                    inputConvertString = inputConvertString + ",";
//                }
//            }
//            inputConvertString = inputConvertString + ")";
//        }
//
//
//        query = query + methodName + operationMethodString + "{" + methodName + inputConvertString + returnString + "}";
//
//        GraphqlRequestBody graphqlRequestBody = new GraphqlRequestBody();
//        graphqlRequestBody.setOperationName(methodName);
//        graphqlRequestBody.setVariables(JSONObject.parseObject(variables));
//        graphqlRequestBody.setQuery(query);
//        log.info("请求参数如下：");
//        Response response = given().log().all()
//                .header("token", token).contentType(ContentType.JSON).body(JSON.toJSONString(graphqlRequestBody))
//                .post(serverUrl);
//        log.info("返回参数如下：");
//        response.prettyPeek();
//
//        //将结果转换为接口方法的返回值类型
//        if (response.getStatusCode() == 200) {
//            String responseString = response.getBody().asString();
//            ResponseBody responseBody = JSON.parseObject(responseString, ResponseBody.class);
//
//            JSONObject jsonObject = JSONObject.parseObject(responseBody.getData().toString());
//            if (jsonObject.get(methodName) == null) {
//                return "null";
//            } else {
//                String result = jsonObject.get(methodName).toString();
//                if (String.class.isAssignableFrom(returnType) || ((Class) returnType.getField("TYPE").get(null)).isPrimitive() || returnType.isPrimitive()) {
//                    if (returnType == int.class || returnType == Integer.class) {
//                        return Integer.valueOf(result);
//                    } else if (returnType == long.class || returnType == Long.class) {
//                        return Long.valueOf(result);
//                    } else if (returnType == boolean.class || returnType == Boolean.class) {
//                        return Boolean.valueOf(result);
//                    }
//                    return result;
//                } else if (Collection.class.isAssignableFrom(returnType)) {
//                    return JSONArray.parseArray(result, Object.class);
//                } else if (Map.class.isAssignableFrom(returnType)) {
//                    return JSON.parseObject(result, Map.class);
//                } else {
//                    return JSONObject.parseObject(result, returnType);
//                }
//            }
//        } else {
//            return "请求失败,错误状态码：" + response.statusCode();
//        }


    /**
     * 构建query.queryDocument
     *
     * @param method
     * @return
     */
    private String queryDocument(Method method) {
        String queryDocument = "";
        if (method.isAnnotationPresent(GraphqlQuery.class)) {
            queryDocument = queryDocument + "query ";
        } else if (method.isAnnotationPresent(GraphqlMutation.class)) {
            queryDocument = queryDocument + "mutation ";
        }

        //构建($input: SendCodeMsgInput)
        StringBuilder input = new StringBuilder();
        //构建(input: $input)
        StringBuilder input2 = new StringBuilder();

        Parameter[] parameters = method.getParameters();
        Class<?>[] parameterTypes = method.getParameterTypes();
        if (method.getParameters().length != 0) {
            input.append("(");
            input2.append("(");
            for (int i = 0; i < parameters.length; i++) {
                String parameterTypeName;
                if ("int".equals(parameterTypes[i].getSimpleName()) || "Integer".equals(parameterTypes[i].getSimpleName())) {
                    parameterTypeName = "Int";
                } else if (parameters[i].isAnnotationPresent(ID.class)) {
                    parameterTypeName = "ID";
                } else if ("long".equals(parameterTypes[i].getSimpleName())) {
                    parameterTypeName = "Long";
                } else {
                    parameterTypeName = parameterTypes[i].getSimpleName();
                }
                input.append("$").append(parameters[i].getName()).append(":").append(parameterTypeName);
                if (parameters[i].isAnnotationPresent(Needed.class)) {
                    input.append("!");
                }
                if (i != parameters.length - 1) {
                    input.append(",");
                }
                input2.append(parameters[i].getName()).append(":").append("$").append(parameters[i].getName());
                if (i != parameters.length - 1) {
                    input2.append(",");
                }
            }
            input.append(")");
            input2.append(")");
        }
        //构建返回结果
        String output = generateReturnFeildString(method);

        //
        return queryDocument + method.getName() + input + "{" + method.getName() + input2 + output + "}";
    }

    /**
     * 构建query.variables
     *
     * @param method
     * @param args
     * @return
     */
    private String queryVariables(Method method, Object[] args) {
        StringBuilder variables = new StringBuilder();
        if (null == args) {
            variables.append("{}");
        } else {
            variables.append("{");
            Parameter[] parameters = method.getParameters();
            Class<?> type = parameters[0].getType();
            if (
                    type != null && (String.class.isAssignableFrom(type) ||
                            Integer.class.isAssignableFrom(type) ||
                            Long.class.isAssignableFrom(type) ||
                            Boolean.class.isAssignableFrom(type) ||
                            BigDecimal.class.isAssignableFrom(type) ||
                            Date.class.isAssignableFrom(type) ||
                            type.isPrimitive())
            ) {
                variables.append("\"").append(parameters[0].getName()).append("\":").append(args[0]);
            } else {
                for (int i = 0; i < args.length; i++) {
                    if (args[i] != null) {
                        if (!(args[i].equals(0) || "".equals(args[i]))) {
                            variables.append("\"").append(parameters[i].getName()).append("\":").append(JSON.toJSONString(args[i]));
                            if (i != args.length - 1) {
                                if (!(args[i + 1].equals(0) || "".equals(args[i + 1]) || args[i + 1] == null)) {
                                    variables.append(",");
                                }
                            }
                        }
                    }
                }
            }
            variables.append("}");
        }
        return variables.toString();
    }

    /**
     * 将返回值转化为需要的格式
     * <exmaple>
     * {
     * userId
     * userName
     * phone
     * roleNames
     * avatar
     * organizationName
     * }
     * </exmaple>
     *
     * @param method
     * @return
     */
    public String generateReturnFeildString(Method method) {
        StringBuilder result = new StringBuilder();
        Class<?> returnType = method.getReturnType();
        if (List.class.isAssignableFrom(returnType)) {
            Class<?> clazz = null;
            Type genericReturnType = method.getGenericReturnType();
            ParameterizedType parameterizedType = (ParameterizedType) genericReturnType;
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (Type type : actualTypeArguments) {
                if (type instanceof Class) {
                    clazz = (Class<?>) type;
                }
            }
            result.append(generateSubReturnFeildString(clazz));
        } else if (!(String.class.isAssignableFrom(returnType) ||
                Integer.class.isAssignableFrom(returnType) ||
                Long.class.isAssignableFrom(returnType) ||
                Boolean.class.isAssignableFrom(returnType) ||
                BigDecimal.class.isAssignableFrom(returnType) ||
                Date.class.isAssignableFrom(returnType) ||
                returnType.isPrimitive())) {
            result.append("{");

            Field[] fields = returnType.getDeclaredFields();
            for (Field field : fields) {
                Class<?> clazz = field.getType();
                if (clazz.isPrimitive() ||
                        String.class.isAssignableFrom(clazz) ||
                        Integer.class.isAssignableFrom(clazz) ||
                        Long.class.isAssignableFrom(clazz) ||
                        Boolean.class.isAssignableFrom(clazz) ||
                        BigDecimal.class.isAssignableFrom(clazz) ||
                        Date.class.isAssignableFrom(clazz)||
                clazz.isEnum()) {
                    result.append(field.getName()).append("\\n");
                } else if (List.class.isAssignableFrom(clazz)) {
                    Class<?> parameterClazz = null;
                    ParameterizedType parameterizedType = (ParameterizedType) field.getGenericType();
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    for (Type type : actualTypeArguments) {
                        if (type instanceof Class) {
                            parameterClazz = (Class<?>) type;
                        }
                    }
                    result.append(field.getName()).append(generateSubReturnFeildString(parameterClazz));

                } else {
                    result.append(field.getName()).append(generateSubReturnFeildString(field.getType()));
                }
            }

            return result + "}";
        }

        return result.toString();

    }

    public String generateSubReturnFeildString(Class<?> subReturnType) {
        StringBuilder subResult = new StringBuilder();

        if (String.class.isAssignableFrom(subReturnType) ||
                Integer.class.isAssignableFrom(subReturnType) ||
                Long.class.isAssignableFrom(subReturnType) ||
                Boolean.class.isAssignableFrom(subReturnType) ||
                BigDecimal.class.isAssignableFrom(subReturnType) ||
                Date.class.isAssignableFrom(subReturnType) ||
                subReturnType.isPrimitive()) {
            subResult.append(subReturnType.getName());
        }else if(Float.class.isAssignableFrom(subReturnType)){
            subResult.append(subReturnType.getSimpleName());
        } else if (List.class.isAssignableFrom(subReturnType)) {
            Field[] declaredFields = subReturnType.getDeclaredFields();
            for (Field field : declaredFields) {
                Class<?> clazz = field.getType();
                if (clazz.isPrimitive() ||
                        String.class.isAssignableFrom(clazz) ||
                        Integer.class.isAssignableFrom(clazz) ||
                        Long.class.isAssignableFrom(clazz) ||
                        Boolean.class.isAssignableFrom(clazz) ||
                        BigDecimal.class.isAssignableFrom(clazz) ||
                        Date.class.isAssignableFrom(clazz)) {
                    subResult.append(field.getName()).append("\\n");
                } else if (List.class.isAssignableFrom(clazz)) {
                    Class<?> parameterClazz = null;
                    ParameterizedType parameterizedType = (ParameterizedType) field.getGenericType();
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    for (Type type : actualTypeArguments) {
                        if (type instanceof Class) {
                            parameterClazz = (Class<?>) type;
                        }
                    }
                    subResult.append(field.getName()).append(generateSubReturnFeildString(parameterClazz));
                } else {
                    subResult.append(generateSubReturnFeildString(field.getType()));
                }
            }
        } else {
//            subResult.append(subReturnType.getSimpleName());
            subResult.append("{");

            Field[] fields = subReturnType.getDeclaredFields();
            for (Field field : fields) {
                if (field.getType().isPrimitive() ||
                        String.class.isAssignableFrom(field.getType()) ||
                        Integer.class.isAssignableFrom(field.getType()) ||
                        Long.class.isAssignableFrom(field.getType()) ||
                        Float.class.isAssignableFrom(field.getType()) ||
                        Boolean.class.isAssignableFrom(field.getType()) ||
                        BigDecimal.class.isAssignableFrom(field.getType()) ||
                        Date.class.isAssignableFrom(field.getType())
                ) {
                    subResult.append(field.getName()).append("\\n");
                } else if (List.class.isAssignableFrom(field.getType())) {
                    Class<?> parameterClazz = null;
                    ParameterizedType parameterizedType = (ParameterizedType) field.getGenericType();
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    for (Type type : actualTypeArguments) {
                        if (type instanceof Class) {
                            parameterClazz = (Class<?>) type;
                        }
                        if (parameterClazz.isPrimitive() ||
                                String.class.isAssignableFrom(parameterClazz) ||
                                Integer.class.isAssignableFrom(parameterClazz) ||
                                Long.class.isAssignableFrom(parameterClazz) ||
                                Boolean.class.isAssignableFrom(parameterClazz) ||
                                BigDecimal.class.isAssignableFrom(parameterClazz) ||
                                Float.class.isAssignableFrom(parameterClazz) ||
                                Date.class.isAssignableFrom(parameterClazz)) {
                            subResult.append(field.getName()).append("\\n");
                        } else {
                            subResult.append(field.getName()).append(generateSubReturnFeildString(parameterClazz));
                        }
                    }
                } else if (field.getType().isInterface()) {
                    //todo 接口返回值为接口时，封装接口参数
                    throw new RuntimeException("暂不支持" + field.getType().getName() + "类型的接口返回值定义");
                } else if (field.getType().isEnum()) {
                    log.info(field.getType().getSimpleName());
                } else{
                    String name = field.getType().getSimpleName();
//                    subResult.append(Character.toLowerCase(name.charAt(0)) + name.substring(1));
                    subResult.append(field.getName());
                    subResult.append(generateSubReturnFeildString(field.getType()));
                }
            }
            subResult.append("}");
        }
        return subResult.toString();
    }


    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println(applicationContext.getBean("configuration"));
        System.out.println(applicationContext.getBean("configuration"));
        System.out.println(applicationContext.getBean("configuration"));
        System.out.println(applicationContext.getBean("configuration"));
    }
}
