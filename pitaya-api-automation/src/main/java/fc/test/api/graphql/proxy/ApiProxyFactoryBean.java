package fc.test.api.graphql.proxy;

import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.Proxy;

/**
 * 接口实例工厂 ，提供接口的实例对象
 *
 * @Author 吴随伟
 * @date 2021/10/11
 */
public class ApiProxyFactoryBean<T> implements FactoryBean<T> {
    private final Class<T> api;

    public ApiProxyFactoryBean(Class<T> api) {
        this.api = api;
    }

    @Override
    public T getObject() throws Exception {
        ApiProxy<T> apiProxy = new ApiProxy<>(api);
        return (T) Proxy.newProxyInstance(api.getClassLoader(), new Class[]{api}, apiProxy);
    }

    @Override
    public Class<?> getObjectType() {
        return api;
    }
}
