package fc.test.api.graphql.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author SUIWEI WU
 * @date 2021/11/10 10:52
 */
@Component
public class GraphqlConifg {

    public static List<GrpahqlClient> clients = new ArrayList<>();

    static {

        GrpahqlClient pitayaApp = new GrpahqlClient();
        pitayaApp.setClientType(GraphqlClientType.PITAYA_APP);
//        pitayaApp.setClientUrl("https://pitaya-test.hjgpscm.com/graphql");
//        pitayaApp.setClientUrl("http://192.168.10.233:9406/graphql");
        pitayaApp.setClientUrl("https://pitaya-demo.hjgpscm.com/graphql");
        GrpahqlClient pitayaWeb = new GrpahqlClient();
        pitayaWeb.setClientType(GraphqlClientType.PITAYA_WEB);
        pitayaWeb.setClientUrl("https://pitaya-test.hjgpscm.com/graphql-web");
        GrpahqlClient operationWeb = new GrpahqlClient();
        operationWeb.setClientType(GraphqlClientType.OPERATION_WEB);
        operationWeb.setClientUrl("https://operation-test.hjgpscm.com/graphql");

        clients.add(pitayaApp);
        clients.add(pitayaWeb);
        clients.add(operationWeb);
    }

    @Getter
    @AllArgsConstructor
    public enum GraphqlClientType {
        DEAUTL("默认终端"),
        PITAYA_WEB("生产项目WEB"),
        PITAYA_APP("生产项目APP"),
        OPERATION_WEB("运营平台WEB");
        private String description;
    }
}
