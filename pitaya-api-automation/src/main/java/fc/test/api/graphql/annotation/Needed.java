package fc.test.api.graphql.annotation;

import java.lang.annotation.*;

/**
 * @author SUIWEI WU
 * @date 2021/11/18 18:19
 */
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Needed {
}
