package 创建型模式_5种.A工厂方法_建造者_桥接模式整合;

/**
 * 普通充电模块
 * @author sk
 */
public class QuickCharger implements Charger {

  @Override
  public void charge() {
    System.out.println("普通充电");
  }

  @Override
  public String toString() {
    return "普通充电";
  }
}
