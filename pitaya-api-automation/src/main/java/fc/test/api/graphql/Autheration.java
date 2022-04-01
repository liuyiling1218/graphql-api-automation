package fc.test.api.graphql;

import lombok.Data;

/**
 * @author SUIWEI WU
 * @date 2021/11/9 15:33
 */
@Data
public class Autheration {
    public static Boolean required = true;
    public static String currentUser = "";
    public static String token = "";

}
