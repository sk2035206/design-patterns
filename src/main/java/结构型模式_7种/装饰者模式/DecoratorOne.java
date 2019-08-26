package 结构型模式_7种.装饰者模式;

/**
 * 第一种具体装饰者
 * @author sk
 */
public class DecoratorOne extends Decorator {

  /** 基态装饰者 */
  Humburger humburger;

  /**
   * 装饰者
   * @param humburger 被装饰者
   */
  public DecoratorOne(Humburger humburger) {
    this.humburger = humburger;
  }

  @Override
  public String getName() {
    return humburger.getName() + " 加生菜";
  }

  @Override
  public double getPrice() {
    return humburger.getPrice() + 1.0;
  }
}
