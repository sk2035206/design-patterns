package 创建型模式_5种.工厂方法模式;

/**
 * 简单工厂模式
 * @author sk
 */
public class CarFactory {

  /**
   * 根据类型获取汽车实例
   * @param type 选择的类型
   * @return 汽车实例
   */
  public static Car createCar(Integer type) {
    if (type == 1){
      return new Benz();
    }
    if (type == 2){
      return new Bmw();
    }
    return null;
  }
}
