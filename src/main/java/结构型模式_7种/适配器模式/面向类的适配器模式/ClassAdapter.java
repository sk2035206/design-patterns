package 结构型模式_7种.适配器模式.面向类的适配器模式;

import 结构型模式_7种.适配器模式.Adaptee;
import 结构型模式_7种.适配器模式.Target;

/**
 * 类适配器
 * 用于单一源的适配
 * 将一个类的接口转换成客户希望的另外一个接口。
 * 适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以在一起工作(例如现实中的电源转换器)
 * @author sk
 */
public class ClassAdapter extends Adaptee implements Target {

  /**
   * 通过构造函数传入具体需要适配的被适配类对象
   */
  public ClassAdapter() {
    System.out.println("圆头两项插孔 <---类适配器---> 扁平两项插孔");
  }

  @Override
  public void request() {
    super.specificRequest();
  }
}
