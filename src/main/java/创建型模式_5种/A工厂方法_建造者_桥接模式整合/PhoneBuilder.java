package 创建型模式_5种.A工厂方法_建造者_桥接模式整合;

/**
 *  手机图纸
 * @author sk
 */
public interface PhoneBuilder {

  /** 构建充电模块 */
  void buildCharger();
  /** 构建解锁模块 */
  void buildLocker();
  /** 返回构建的手机 */
  Phone getResult();

}

