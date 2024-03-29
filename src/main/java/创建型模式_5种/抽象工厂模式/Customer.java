package 创建型模式_5种.抽象工厂模式;

/**
 *
 * 可能有人会说抽象工厂模式和工厂方法模式一样，顶多就是那边接口实现类写了一个方法，这边写了两个方法
 * 其实两者的最主要区别在于全局观不同，一个是生产那个车，一个是生产这个车需要装配什么东西，出发点不同，模式只是一个概念
 * 两者可以互相转换的，当工厂方法模式零件多的时候，就可以转变成抽象工厂模式
 * 工厂方法模式主要用于单个产品(例如车型)，抽象工厂模式主要用于产品线(例如各个指定车型需要什么配置)
 * @author sk
 */
public class Customer {
  public static void main(String[] args){
    //生产宝马320系列配件
    FactoryBmw320 factoryBmw320 = new FactoryBmw320();
    Engine engine = factoryBmw320.createEngine();
    engine.make();
    AirCondition airCondition = factoryBmw320.createAirCondition();
    airCondition.make();

    //生产宝马523系列配件
    FactoryBmw523 factoryBmw523 = new FactoryBmw523();
    Engine engine523 = factoryBmw523.createEngine();
    engine523.make();
    AirCondition airCondition523 = factoryBmw523.createAirCondition();
    airCondition523.make();
  }
}
