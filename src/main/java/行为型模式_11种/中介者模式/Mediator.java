package 行为型模式_11种.中介者模式;

/**
 * 抽象中介者
 *
 * @author mkk
 * @since 2020/9/10
 */
public interface Mediator {

    /**
     * 记录所有同事类
     *
     * @param name  部门名称
     * @param d     当前部门
     */
    void register(String name,Department d);

    /**
     * 发出命令
     *
     * @param name 命令
     */
    void command(String name);
}
