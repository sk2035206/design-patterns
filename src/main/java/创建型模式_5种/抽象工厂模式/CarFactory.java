package 创建型模式_5种.抽象工厂模式;

/**
 * 汽车配置接口
 * @author sk
 */
public interface CarFactory {

  //制造发动机
  Engine createEngine();
  //制造空调
  Aircondition createAircondition();
}

