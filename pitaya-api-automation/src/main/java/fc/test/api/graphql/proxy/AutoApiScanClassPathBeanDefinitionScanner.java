package fc.test.api.graphql.proxy;

import fc.test.api.graphql.annotation.GraphqlGroup;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanDefinitionHolder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanNameGenerator;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.filter.AnnotationTypeFilter;

import java.util.Set;

/**
 * @author SUIWEI WU
 * @date 2021/11/25 16:43
 */
public class AutoApiScanClassPathBeanDefinitionScanner extends ClassPathBeanDefinitionScanner {

    public AutoApiScanClassPathBeanDefinitionScanner(BeanDefinitionRegistry registry, boolean useDefaultFilters) {
        super(registry, useDefaultFilters);
    }

    @Override
    public Set<BeanDefinitionHolder> doScan(String... basePackages) {
        //添加过滤器，只扫描添加了 GraphqlGroup 注解的类
        addIncludeFilter(new AnnotationTypeFilter(GraphqlGroup.class));

        //重写 BeanNameGenerator,解决不同包同名不能注入spring容器问题
        setBeanNameGenerator(new BeanNameGenerator() {
            @Override
            public String generateBeanName(BeanDefinition beanDefinition, BeanDefinitionRegistry beanDefinitionRegistry) {
                return beanDefinition.getBeanClassName();
            }
        });

        Set<BeanDefinitionHolder> beanDefinitionHolders = super.doScan(basePackages);
        //对扫描到的数据进行代理处理
        postProcessBeanDefinition(beanDefinitionHolders);
        return beanDefinitionHolders;
    }

    private void postProcessBeanDefinition(Set<BeanDefinitionHolder> beanDefinitionHolderSet) {
        beanDefinitionHolderSet.forEach(
                e -> {
                    //设置工厂等操作需要基于GenericBeanDefinition，BeanDefinitionHolder是其子类
                    GenericBeanDefinition definition = (GenericBeanDefinition) e.getBeanDefinition();
                    //获取接口全路径名
                    String beanClassName = definition.getBeanClassName();
                    //设置构造函数参数
                    definition.getConstructorArgumentValues().addGenericArgumentValue(beanClassName);
                    //设置工厂
                    definition.setBeanClass(ApiProxyFactoryBean.class);
                    definition.setAutowireMode(GenericBeanDefinition.AUTOWIRE_BY_TYPE);
                }
        );
    }

    /**
     * 重写 判断是否为候选组件
     *
     * @param beanDefinition
     * @return
     */
    @Override
    protected boolean isCandidateComponent(AnnotatedBeanDefinition beanDefinition) {
        AnnotationMetadata metadata = beanDefinition.getMetadata();
        return metadata.isInterface() && metadata.isIndependent();
    }
}
