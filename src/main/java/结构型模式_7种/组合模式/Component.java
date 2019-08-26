package 结构型模式_7种.组合模式;

/**
 * 共有接口抽象类
 * @author sk
 */
public abstract class Component {

  /** 类别名称 */
  public String name;

  /**
   * 添加类别
   * @param c 类别信息
   */
  public abstract void add(Component c);

  /**
   * 删除类别
   * @param c 类别信息
   */
  public abstract void remove(Component c);

  /**
   * 遍历所有类别
   */
  public abstract void eachChild();
}
