package 行为型模式_11种.迭代子模式;

/**
 * 抽象聚集角色类
 * @author sk
 */
public abstract class AbstractAggregate {

  /**
   * 工厂方法，创建相应迭代子对象的接口
   * @return 迭代子对象
   */
  public abstract Iterator createIterator();

  /**
   * 添加对象到容器
   * @param obj 添加对象
   */
  public abstract void add(Object obj);

  /**
   * 从容器中删除对象
   * @param obj 删除对象
   */
  public abstract void remove(Object obj);
}
