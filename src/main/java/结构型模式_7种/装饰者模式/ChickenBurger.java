package 结构型模式_7种.装饰者模式;

/**
 * 定义被装饰者，被装饰者初始状态有些自己的装饰
 * @author sk
 */
public class ChickenBurger extends Humburger {

  /** 设置初始化装饰者属性*/
  public ChickenBurger() {
    name = "鸡腿堡";
  }

  @Override
  public double getPrice() {
    return 10;
  }
}