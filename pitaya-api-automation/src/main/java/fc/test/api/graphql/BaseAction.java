package fc.test.api.graphql;

/**
 * @author SUIWEI WU
 * @date 2021/11/10 9:24
 */
public interface BaseAction {
    /**
     * 系统测试级别前置配置
     */
    void config();

    /**
     * 系统测试级别前置操作
     */
    void prepare();

    void clear();
}
