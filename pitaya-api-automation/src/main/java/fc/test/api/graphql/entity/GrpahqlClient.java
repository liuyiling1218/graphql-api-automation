package fc.test.api.graphql.entity;

import lombok.Data;

@Data
public class GrpahqlClient {
    private GraphqlConifg.GraphqlClientType clientType;
    private String clientUrl;
}
