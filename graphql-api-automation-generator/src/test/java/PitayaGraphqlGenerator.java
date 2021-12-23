import fc.test.api.graphql.generator.GraphqlGenerator;

import java.io.IOException;

/**
 * @description pitaya项目graphql生成器
 * @Author 吴随伟
 * @date 2021/12/22
 */
public class PitayaGraphqlGenerator {
    public static void main(String[] args) throws IOException {
        //pitaya
        String schemaPath = "D:\\gitee\\graphql-api-automation\\pitaya-api-automation\\src\\main\\resources\\schema";
        String destinationPath = "D:\\gitee\\graphql-api-automation\\pitaya-api-automation\\src\\main\\java\\com\\hjfruit\\test\\pitaya";
        String basePackageName = "com.hjfruit.test.pitaya";
//
//        //operation
//        String schemaPath = "D:\\gitee\\operation-gateway\\operation-gql-server\\src\\main\\resources\\schema";
//        String destinationPath = "D:\\gitee\\hjfruits-test\\api-automation\\operation-api-automation\\src\\main\\java\\com\\hjfruits\\operation\\generated";
//        String basePackageName = "com.hjfruits.operation";

        GraphqlGenerator.generator(schemaPath, destinationPath, basePackageName);
    }
}
