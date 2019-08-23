package 结构型模式_7种.适配器模式;

import 结构型模式_7种.适配器模式.面向对象的适配器模式.Adapter;
import 结构型模式_7种.适配器模式.面向类的适配器模式.ClassAdapter;

/**
 * 适配器模式测试类
 * @author sk
 * 主要作用是在新接口和老接口之间进行适配
 * 优点：复用了现存的类，解决了现存类和复用环境要求不一致的问题。
 *       将目标类和适配者类解耦，通过引入一个适配器类重用现有的适配者类，而无需修改原有代码。
 *       通过适配器，客户端可以调用同一接口，因而对客户端来说是透明的。这样做更简单、更直接、更紧凑。
 *       一个对象适配器可以把多个不同的适配者类适配到同一个目标，也就是说，同一个适配器可以把适配者类和它的子类都适配到目标接口。
 * 缺点：对于对象适配器来说，更换适配器的实现过程比较复杂。
 *
 * Target（目标抽象类）  Adapter（适配器类）  Adaptee（适配者类）
 */
public class AdapterTest {
  public static void main(String[] args) {
    // 实例化当前插头实例（圆头两项插头）
    Target concreteTarget = new ConcreteTarget();
    concreteTarget.request();
    System.out.println("BIG-----------------类适配器-------------------BIG");
    // 使用适配器（适配对象为扁平两项插孔）
    Target classAdapter = new ClassAdapter();
    classAdapter.request();
    System.out.println("END-----------------类适配器-------------------END");
    System.out.println();
    System.out.println("BIG-----------------对象适配器-----------------BIG");
    // 使用适配器（适配对象为扁平两项插孔）
    Target adapter = new Adapter(new Adaptee());
    adapter.request();
    System.out.println("END-----------------对象适配器-----------------END");
  }
}
