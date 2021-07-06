package 创建型模式_5种.工厂方法模式;

/**
 * 工厂模式测试类
 *
 * 工厂方法模式的优点在于不需要改动原始代码，只需要添加新代码就可以是实现新增车型
 * 缺点就是当产品种类非常多时，会出现大量的与之对应的工厂对象
 *
 * @author sk
 */
public class Customer {

  public static void main(String[] args) {
    // 简单工厂模式 生产指定类型的汽车
    Car benz = CarFactory.createCar(Benz.class);
    assert benz != null;
    benz.make();
    Car bmw = CarFactory.createCar(Bmw.class);
    assert bmw != null;
    bmw.make();

    // 工厂方法模式
    FactoryCarBenz benzFactory = new FactoryCarBenz();
    Car benz1 = benzFactory.createCar();
    assert benz1 != null;
    benz1.make();
    FactoryCarBmw bmwFactory = new FactoryCarBmw();
    Car bmw1 = bmwFactory.createCar();
    assert bmw1 != null;
    bmw1.make();
  }
}
