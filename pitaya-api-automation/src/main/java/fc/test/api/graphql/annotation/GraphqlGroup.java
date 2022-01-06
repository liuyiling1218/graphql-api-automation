package fc.test.api.graphql.annotation;

import fc.test.api.graphql.entity.GraphqlConifg;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * graphql 接口分组
 *
 * @author SUIWEI WU
 * @date 2021/10/9 11:45
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GraphqlGroup {
    /**
     * api group description
     */
    @AliasFor("description")
    String value() default "";

    /**
     * api group description
     */
    @AliasFor("value")
    String description() default "";

    /**
     * 终端名称
     *
     * @return
     */
    GraphqlConifg.GraphqlClientType client() default GraphqlConifg.GraphqlClientType.DEAUTL;
}
