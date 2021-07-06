package 创建型模式_5种.工厂方法模式;

/**
 * 宝马汽车
 * @author sk
 */
public class Bmw extends Car {

  @Override
  public void make() {
    System.out.println("制造-->宝马");
  }
}
