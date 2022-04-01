package fc.test.api.graphql.proxy;

import fc.test.api.graphql.annotation.ApiScan;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.annotation.AnnotationAttributes;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author SUIWEI WU
 * @date 2021/11/25 16:39
 */
public class AutoApiScanImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar, ResourceLoaderAware {
    private ResourceLoader resourceLoader;

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        //获取ApiScan注解属性信息
        AnnotationAttributes annotationAttributes = AnnotationAttributes.fromMap(importingClassMetadata.getAnnotationAttributes(ApiScan.class.getName()));
        //获取注解的属性值，拿到扫描路径
        String[] basePackages = annotationAttributes.getStringArray("basePackages");
        AutoApiScanClassPathBeanDefinitionScanner scanner = new AutoApiScanClassPathBeanDefinitionScanner(registry, false);
        scanner.doScan(basePackages);
        scanner.setResourceLoader(resourceLoader);
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }
}
