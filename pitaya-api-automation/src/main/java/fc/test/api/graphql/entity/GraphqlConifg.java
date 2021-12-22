package fc.test.api.graphql.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author SUIWEI WU
 * @date 2021/11/10 10:52
 */
@Data
@Component("graphqlConfig")
@ConfigurationProperties(prefix = "graphql.config")
public class GraphqlConifg {

    private static String server;

    public static String getServer() {
        return server;
    }

    @Value("${server:https://pitaya-test.hjgpscm.com/graphql}")
    public void setServer(String server) {
        GraphqlConifg.server = server;
    }
}
