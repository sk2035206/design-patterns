package 结构型模式_7种.装饰者模式;

/**
 * 定义被装饰者 (此模式中为超类)
 * @author sk
 */
public abstract class Humburger {

  /** 汉堡名称 */
  protected  String name ;

  /**
   * 获取汉堡名称
   * @return 汉堡名称
   */
  public String getName(){
    return name;
  }

  /**
   * 获取当前汉堡价格
   * @return 当前价格
   */
  public abstract double getPrice();

}
