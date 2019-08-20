package 创建型模式_5种.工厂方法模式;

/**
 * 消费者
 * @author sk
 */
public class Customer {

  public static void main(String[] args) {

    // 简单工厂模式 生产指定类型的汽车 1为奔驰2为宝马
    Car benz = CarFactory.createCar(1);
    Car bmw = CarFactory.createCar(2);

    /*
    工厂方法模式的优点在于不需要改动原始代码，只需要添加新代码就可以是实现新增车型
    缺点就是当产品种类非常多时，会出现大量的与之对应的工厂对象
     */

    // 工厂方法模式
    FactoryCarBenz benzs = new FactoryCarBenz();
    Benz benz1 = benzs.createCar();
    FactoryCarBmw bmws = new FactoryCarBmw();
    Bmw bmw1 = bmws.createCar();
  }
}
