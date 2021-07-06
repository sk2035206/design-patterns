package 创建型模式_5种.工厂方法模式;

/**
 * 简单工厂模式
 * @author sk
 */
public class CarFactory {

  /**
   * 根据类型获取汽车实例
   * @param classType 选择的类型
   * @return 汽车实例
   */
  public static Car createCar(Class<?> classType) {
    if (classType.getName().equals(Benz.class.getName())) {
      return new Benz();
    } else if (classType.getName().equals(Bmw.class.getName())) {
      return new Bmw();
    }
    return null;
  }
}
