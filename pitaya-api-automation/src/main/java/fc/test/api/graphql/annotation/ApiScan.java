package fc.test.api.graphql.annotation;

import fc.test.api.graphql.proxy.AutoApiScanImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.Import;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 扫描API对象
 *
 * @author SUIWEI WU
 * @date 2021/11/25 16:31
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(AutoApiScanImportBeanDefinitionRegistrar.class)
public @interface ApiScan {
    @AliasFor("value")
    String[] basePackages() default {};

    @AliasFor("basePackages")
    String[] value() default {};
}
