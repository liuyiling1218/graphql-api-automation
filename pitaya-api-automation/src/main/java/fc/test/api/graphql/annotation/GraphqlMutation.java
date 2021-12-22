package fc.test.api.graphql.annotation;

import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * @author SUIWEI WU
 * @date 2021/10/9 17:10
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface GraphqlMutation {
    /**
     * api description
     */
    @AliasFor("description")
    String value() default "";

    /**
     * api description
     */
    @AliasFor("value")
    String description() default "";
}
