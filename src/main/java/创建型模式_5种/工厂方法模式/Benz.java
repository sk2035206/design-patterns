package 创建型模式_5种.工厂方法模式;

/**
 * 奔驰汽车
 * @author sk
 */
public class Benz extends Car{

  @Override
  public void make() {
    System.out.println("制造-->奔驰");
  }
}
