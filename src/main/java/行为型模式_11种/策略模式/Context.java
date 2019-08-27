package 行为型模式_11种.策略模式;

/**
 * 环境类
 * 用于访问指定策略
 * @author sk
 *
 */
public class Context {

  /** 策略实例*/
  private Strategy strategy;

  /**
   * 指定策略
   * @param strategy 策略
   */
  public Context(Strategy strategy){
    this.strategy = strategy;
  }

  /**
   * 设置或更换策略实例
   * @param strategy
   */
  public void setStrategy(Strategy strategy){
    this.strategy = strategy;
  }

  /** 出行方式*/
  public void waysOfTravel(){
    this.strategy.waysOfTravel();
  }
}
