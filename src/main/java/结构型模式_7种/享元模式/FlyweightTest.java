package 结构型模式_7种.享元模式;

/**
 * 享元模式测试类
 * @author sk
 *
 * Sring类型就是使用了享元模式。String对象是final类型，对象一旦创建就不可改变。
 * 在一个系统中如果有多个相同的对象，那么只共享一份就可以了，不必每个都去实例化一个对象。
 * 在JAVA中字符串常量都是存在常量池中的，JAVA会确保一个字符串常量在常量池中只有一个拷贝。String a="abc"，其中"abc"就是一个字符串常量。
 * 本例子中我们定义了3个对象，其中有2个是相同的，按照享元模式的定义“A”应该共享一个对象，因此在对象数中我们可以看到实际的对象只有2个。
 *
 */
public class FlyweightTest {

  /** 实例化模式工厂 */
  FlyweightFactory factory = new FlyweightFactory();

  /** 创建新实例 */
  Flyweight fly1 = factory.getFlyWeight(new Character('A'));
  Flyweight fly2 = factory.getFlyWeight(new Character('B'));
  Flyweight fly3 = factory.getFlyWeight(new Character('A'));

  /** 显示新实例 */
  public void showFlyweight(){
    fly1.operation("First Call");
    fly2.operation("Second Call");
    fly3.operation("Third Call");
    int objSize = factory.getFlyweightSize();
    System.out.println("objSize = " + objSize);
  }
  public static void main(String[] args){
    FlyweightTest flyweight = new FlyweightTest();
    flyweight.showFlyweight();
  }

}
