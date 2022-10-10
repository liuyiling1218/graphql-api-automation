
package fc.test.api.graphql.generator;

import graphql.language.*;
import graphql.schema.idl.SchemaParser;
import graphql.schema.idl.TypeDefinitionRegistry;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author SUIWEI WU
 * @date 2021/10/26 15:03
 */
@Slf4j
public class GraphqlGenerator {

    /**
     *
     */
    public static void generator(String schemaPath, String destinationPath, String basePackageName, String clientName) throws IOException {
        SchemaParser schemaParser = new SchemaParser();
        Map<String, List<File>> map = new HashMap<>();
        traverseDirectory(schemaPath, map);

        //封装import
        StringBuilder importEntitiesStringBuilder = new StringBuilder();
        for (String dicPath : map.keySet()) {
            String subDicPath = dicPath.replace(schemaPath, "");
            String subPackage = subDicPath.replace("\\", ".");
            if (subPackage.contains("interface")) {
                subPackage = subPackage.replace("interface", "interfaces");
            }
            if (List.of(".base.time", ".base").contains(subPackage)) {
                continue;
            }
            importEntitiesStringBuilder.append("import " + basePackageName + ".entities" + subPackage + ".*" + ";\n");
        }


        for (Map.Entry<String, List<File>> entry : map.entrySet()) {
            String dicPath = entry.getKey();
            String subDicPath = dicPath.replace(schemaPath, "");
            if (subDicPath.contains("interface")) {
                subDicPath = subDicPath.replace("interface", "interfaces");
            }
            String subPackage = subDicPath.replace("\\", ".");
            List<File> files = entry.getValue();
            for (File file : files) {
                StringBuilder apiStringBuilder = new StringBuilder();
                TypeDefinitionRegistry definitionRegistry = schemaParser.parse(file);
                //生成entity
                Map<String, TypeDefinition> types = definitionRegistry.types();
                for (Map.Entry<String, TypeDefinition> type : types.entrySet()) {
                    StringBuilder entityStringBuilder = new StringBuilder();
                    String entityName = type.getKey();
                    if (entityName.contains(".type")) {
                        entityName = entityName.replace(".type", "");
                    }
                    TypeDefinition typeDefinition = type.getValue();
                    //封裝comment
                    StringBuilder commentStringBuilder = new StringBuilder();
                    List<Comment> comments = typeDefinition.getComments();
                    for (Comment comment : comments) {
                        String content = comment.getContent();
                        if (content.contains("/**") || content.contains("*/")) {
                            content = content.replace("/**", "");
                            content = content.replace("*/", "");
                        }
                        commentStringBuilder.append(content);
                    }

                    //封装field
                    entityStringBuilder.append("package " + basePackageName + ".entities" + subPackage + ";\n");
                    entityStringBuilder.append("import lombok.Data;\n");
                    entityStringBuilder.append("import lombok.Builder;\n");
                    entityStringBuilder.append("import lombok.AllArgsConstructor;\n");
                    entityStringBuilder.append("import lombok.NoArgsConstructor;\n");
                    entityStringBuilder.append("import java.util.List;\n");
                    entityStringBuilder.append("import java.math.BigDecimal;\n");
                    entityStringBuilder.append("import fc.test.api.graphql.annotation.Needed;\n");
                    entityStringBuilder.append("import fc.test.api.graphql.annotation.ID;\n");
                    entityStringBuilder.append("import fc.test.api.graphql.annotation.NotEmpty;\n");
                    entityStringBuilder.append(importEntitiesStringBuilder);
                    entityStringBuilder.append("/**\n");
                    entityStringBuilder.append(" * " + commentStringBuilder + "\n");
                    entityStringBuilder.append(" */\n");

                    if (typeDefinition instanceof EnumTypeDefinition) {
                        entityStringBuilder.append("public enum " + entityName + "{\n");
                    } else {
                        entityStringBuilder.append("@Data\n");
                        entityStringBuilder.append("@Builder\n");
                        if (checkFields(typeDefinition)) {
                        entityStringBuilder.append("@AllArgsConstructor\n");
                        entityStringBuilder.append("@NoArgsConstructor\n");
                        }
                        entityStringBuilder.append("public class " + entityName + "{\n");
                    }
                    generateFields(typeDefinition, entityStringBuilder);
                    entityStringBuilder.append("}");

                    //写入文件
                    writeFile(destinationPath + "\\entities" + subDicPath + "\\", entityName, entityStringBuilder.toString());
                }


                //生成api
                Map<String, List<ObjectTypeExtensionDefinition>> objectTypeExtensions = definitionRegistry.objectTypeExtensions();
                for (Map.Entry<String, List<ObjectTypeExtensionDefinition>> objectTypeExtension : objectTypeExtensions.entrySet()) {
                    String apiType = objectTypeExtension.getKey();
                    List<ObjectTypeExtensionDefinition> value = objectTypeExtension.getValue();

                    for (ObjectTypeExtensionDefinition objectTypeExtensionDefinition : value) {
                        List<FieldDefinition> fieldDefinitions = objectTypeExtensionDefinition.getFieldDefinitions();
                        for (FieldDefinition fieldDefinition : fieldDefinitions) {
                            String apiName = fieldDefinition.getName();
                            List<Comment> apiComments = fieldDefinition.getComments();
                            StringBuilder commentStringBuilder = new StringBuilder();
                            for (Comment comment : apiComments) {
                                String content = comment.getContent();
                                if (content.contains("/**") || content.contains("*/")) {
                                    content = content.replace("/**", "");
                                    content = content.replace("*/", "");
                                }
                                commentStringBuilder.append(content);
                            }
                            //出参
                            StringBuilder outPutStringBuilder = new StringBuilder();
                            Type type = fieldDefinition.getType();
                            generateParam(type, outPutStringBuilder, false);


                            //入参
                            StringBuilder inputString = new StringBuilder("(");

                            List<InputValueDefinition> inputValueDefinitions = fieldDefinition.getInputValueDefinitions();
                            if (inputValueDefinitions != null && inputValueDefinitions.size() != 0) {
                                for (int i = 0; i < inputValueDefinitions.size(); i++) {
                                    InputValueDefinition inputValueDefinition = inputValueDefinitions.get(i);
                                    String paramName = inputValueDefinition.getName();
                                    Type paramType = inputValueDefinition.getType();
                                    generateParam(paramType, inputString, true);
                                    inputString.append(" " + paramName);
                                    if (i != inputValueDefinitions.size() - 1) {
                                        inputString.append(",");
                                    }
                                }
                            }
                            inputString.append(")");

                            String graphqlAnnotation = null;
                            if ("Query".equals(apiType)) {
                                graphqlAnnotation = "    @GraphqlQuery(\"" + commentStringBuilder + "\")\n";
                            } else if ("Mutation".equals(apiType)) {
                                graphqlAnnotation = "    @GraphqlMutation(\"" + commentStringBuilder + "\")\n";
                            }
                            apiStringBuilder.append(graphqlAnnotation);
                            apiStringBuilder.append("    " + outPutStringBuilder);
                            apiStringBuilder.append(" ");
                            apiStringBuilder.append(apiName);
                            apiStringBuilder.append(inputString);
                            apiStringBuilder.append(";\n");
                        }
                    }
                }
                String packageName = basePackageName + "." + file.getName().substring(0, file.getName().lastIndexOf("."));

                //接口API文件名优化，首字母大写，并去除”-“
                String className = "";
                String[] ss = file.getName().substring(0, file.getName().lastIndexOf(".")).split("-");
                for (String s : ss) {
                    className = className + s.substring(0, 1).toUpperCase() + s.substring(1);
                }
                if (className.contains(".api")) {
                    className = className.replace(".api", "");
                } else if (className.contains(".type")) {
                    className = className.replace(".type", "");
                }
                if (className.contains(".")) {
                    String[] cs = className.split("\\.");
                    String cn = "";
                    for (String c : cs) {
                        c = c.substring(0, 1).toUpperCase() + c.substring(1);
                        cn = cn + c;
                    }
                    className = cn;
                }
                className = className + "Api";

                StringBuilder apiFileStringBuilder = new StringBuilder();
                apiFileStringBuilder.append("package " + basePackageName + ".apis" + subPackage + ";\n");
                apiFileStringBuilder.append("import fc.test.api.graphql.annotation.GraphqlGroup;\n");
                apiFileStringBuilder.append("import fc.test.api.graphql.annotation.GraphqlMutation;\n");
                apiFileStringBuilder.append("import fc.test.api.graphql.annotation.GraphqlQuery;\n");
                apiFileStringBuilder.append("import fc.test.api.graphql.annotation.Needed;\n");
                apiFileStringBuilder.append("import fc.test.api.graphql.entity.GraphqlConifg;\n");
                apiFileStringBuilder.append("import fc.test.api.graphql.annotation.ID;\n");
                apiFileStringBuilder.append("import fc.test.api.graphql.annotation.NotEmpty;\n");
                apiFileStringBuilder.append("import java.util.List;\n");
                apiFileStringBuilder.append("import java.math.BigDecimal;\n");
                apiFileStringBuilder.append(importEntitiesStringBuilder);
                apiFileStringBuilder.append("/**\n");
                apiFileStringBuilder.append(" * Generated From Graphql Schema\n");
                apiFileStringBuilder.append(" */\n");
                apiFileStringBuilder.append("@GraphqlGroup(client = " + clientName + ")\n");
                apiFileStringBuilder.append("public interface " + className + " {\n");
                apiFileStringBuilder.append(apiStringBuilder);
                apiFileStringBuilder.append("}");
                writeFile(destinationPath + "\\apis\\" + subDicPath + "\\", className, apiFileStringBuilder.toString());
            }
        }
    }

    private static void writeFile(String destinationPath, String filename, String content) throws IOException {
        //写入文件
        File dir = new File(destinationPath);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        String filePath = destinationPath + filename + ".java";
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        bufferedWriter.write(content);
        bufferedWriter.close();
    }

    private static boolean checkFields(TypeDefinition typeDefinition) {
        if (typeDefinition.getChildren().isEmpty()) {
            return false;
        }
        if(typeDefinition.getName().contains("ConfigValuePayload")||
                typeDefinition.getName().contains("Base")||
                typeDefinition.getName().contains("Node")||
                typeDefinition.getName().contains("Interface")||
                typeDefinition.getName().contains("PageList")){
              return false;
        }


        return true;
    }

    private static void generateFields(TypeDefinition typeDefinition, StringBuilder entityStringBuilder) {
        String definitionName = typeDefinition.getName();
        if (typeDefinition instanceof ObjectTypeDefinition || typeDefinition instanceof InputObjectTypeDefinition) {
            List<Node> children = typeDefinition.getChildren();
            for (Node node : children) {
                //comments
                StringBuilder fieldCommentStringBuilder = new StringBuilder();
                List<Comment> comments = node.getComments();
                for (Comment comment : comments) {
                    String content = comment.getContent();
                    if (content.contains("/**") || content.contains("*/")) {
                        content = content.replace("/**", "");
                        content = content.replace("*/", "");
                    }
                    fieldCommentStringBuilder.append(content.trim());
                }
                entityStringBuilder.append("    /**\n");
                entityStringBuilder.append("     * " + fieldCommentStringBuilder + "\n");
                entityStringBuilder.append("     */\n");

                if (node instanceof FieldDefinition) {
                    FieldDefinition fieldDefinition = (FieldDefinition) node;
                    Type type = fieldDefinition.getType();
                    generateFieldString(type, entityStringBuilder);
                    if (List.of("return").contains(fieldDefinition.getName())) {
                        entityStringBuilder.append(" _" + fieldDefinition.getName() + ";\n");
                    } else {
                        entityStringBuilder.append(" " + fieldDefinition.getName() + ";\n");
                    }
                } else if (node instanceof InputValueDefinition) {
                    InputValueDefinition inputValueDefinition = (InputValueDefinition) node;
                    Type type = inputValueDefinition.getType();
                    generateFieldString(type, entityStringBuilder);
                    entityStringBuilder.append(" " + inputValueDefinition.getName() + ";\n");
                } else if (node instanceof TypeName) {
                    TypeName typeName = (TypeName) node;
                    String name = typeName.getName();
                    if ("Int".equals(name)) {
                        entityStringBuilder.append("Integer");
                    } else if ("ID".equals(name)) {
                        entityStringBuilder.append("String");
                    } else {
                        entityStringBuilder.append(name);
                    }
                    entityStringBuilder.append(" " + typeName.getName() + ";\n");

                } else {
                    log.error("不支持的graphql.language.Node类型:\n" + node);
                }

            }

        } else if (typeDefinition instanceof UnionTypeDefinition) {
            log.error("暂不支持的Node类型" + typeDefinition);
        } else if (typeDefinition instanceof EnumTypeDefinition) {
            EnumTypeDefinition enumTypeDefinition = (EnumTypeDefinition) typeDefinition;
            List<EnumValueDefinition> enumValueDefinitions = enumTypeDefinition.getEnumValueDefinitions();
            for (int i = 0; i < enumValueDefinitions.size(); i++) {
                if (i != enumValueDefinitions.size() - 1) {
                    entityStringBuilder.append(enumValueDefinitions.get(i).getName());
                    entityStringBuilder.append(",");
                }else{
                    entityStringBuilder.append(enumValueDefinitions.get(i).getName());
                }
            }
        } else {
            log.error("不支持的graphql.language.Node类型\n" + typeDefinition);
        }
    }

    private static void generateFieldString(Type type, StringBuilder stringBuilder) {
        if (type instanceof NonNullType) {
            NonNullType nonNullType = (NonNullType) type;
            Type subType = nonNullType.getType();
            stringBuilder.append("    @Needed \n");
            generateFieldString(subType, stringBuilder);
        } else if (type instanceof ListType) {
            ListType listType = (ListType) type;
            Type subType = listType.getType();

            if (subType instanceof NonNullType) {
                Type type1 = ((NonNullType) subType).getType();
                stringBuilder.append("    @NotEmpty \n");
                stringBuilder.append("    private ");
                stringBuilder.append("List<");
                basicTypeGenerateString((TypeName) type1, stringBuilder);
            } else {
                stringBuilder.append("    private ");
                stringBuilder.append("List<");
                basicTypeGenerateString((TypeName) subType, stringBuilder);
            }
            stringBuilder.append(">");
        } else {
            TypeName typeName = (TypeName) type;
            if ("ID".equals(typeName)) {
                stringBuilder.append("    @ID ");
            }
            stringBuilder.append("    private ");
            basicTypeGenerateString((TypeName) type, stringBuilder);
        }
    }

    private static void basicTypeGenerateString(TypeName type, StringBuilder stringBuilder) {
        TypeName typeName = type;
        String name = typeName.getName();
        if ("Int".equals(name)) {
            stringBuilder.append("Integer");
        } else if ("ID".equals(name)) {
            stringBuilder.append("String");
        } else {
            stringBuilder.append(name);
        }
    }

    private static void generateParam(Type type, StringBuilder stringBuilder, Boolean isInput) {
        if (type instanceof NonNullType) {
            NonNullType nonNullType = (NonNullType) type;
            Type subType = nonNullType.getType();
            if (isInput) {
                stringBuilder.append("@Needed ");
            }
            generateParam(subType, stringBuilder, isInput);
        } else if (type instanceof ListType) {
            ListType listType = (ListType) type;
            Type subType = listType.getType();
            stringBuilder.append("List<");
            generateParam(subType, stringBuilder, isInput);
            stringBuilder.append(">");
        } else {
            TypeName typeName = (TypeName) type;
            String name = typeName.getName();
            if ("Int".equals(name)) {
                stringBuilder.append("Integer");
            } else if ("ID".equals(name)) {
                if (isInput) {
                    stringBuilder.append("@ID ");
                }
                stringBuilder.append("String");
            } else {
                stringBuilder.append(name);
            }
        }
    }


    /**
     * 遍历获取文件夹的文件
     *
     * @param dicPath
     * @return
     */
    public static void traverseDirectory(String dicPath, Map<String, List<File>> map) {
        ArrayList<File> fileList = new ArrayList<>();

        File file = new File(dicPath);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (null != files) {
                for (File f : files) {
                    if (f.isDirectory()) {
                        traverseDirectory(f.getPath(), map);
                    } else {
                        fileList.add(f);
                        map.put(file.getPath(), fileList);
                    }
                }
            }

        }
    }
}
