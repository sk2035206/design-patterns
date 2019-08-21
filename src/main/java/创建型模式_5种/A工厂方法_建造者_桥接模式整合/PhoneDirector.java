package 创建型模式_5种.A工厂方法_建造者_桥接模式整合;

/**
 *  手机建造类
 * @author sk
 */
public class PhoneDirector {

  /**
   * 建造手机
   * @param builder 建造模块图纸
   * @return 建造好的手机
   */
  public Phone construct(PhoneBuilder builder) {

    // 建造充电模块
    builder.buildCharger();
    // 建造解锁模块
    builder.buildLocker();
    // 返回建造号的手机对象
    return builder.getResult();
  }
}
