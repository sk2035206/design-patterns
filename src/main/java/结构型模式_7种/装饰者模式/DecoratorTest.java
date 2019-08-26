package 结构型模式_7种.装饰者模式;

/**
 * 装饰者模式测试类
 * @author sk
 *
 * 对扩展开放、对修改关闭。
 * 这句话体现在我如果想扩展被装饰者类的行为，无须修改装饰者抽象类，只需继承装饰者抽象类，
 * 实现额外的一些装饰或者叫行为即可对被装饰者进行包装。
 * 所以：扩展体现在继承、修改体现在子类中，而不是具体的抽象类，这充分体现了依赖倒置原则。
 *
 * 文章中汉堡加材料的例子，如果使用继承的话，加生菜需要增加一个类，加辣条需要增加一个类，
 * 生菜辣条都加也需要增加一个类，如果有n种配料，需要增加2的n次方减一个类。
 * 使用装饰者模式，只需要每个配料增加一个类，指向装饰者的顺序改变即可
 */
public class DecoratorTest {
  public static void main(String[] args) {
    // 多实例进行输出预览
    Humburger humburger = new ChickenBurger();
    System.out.println(humburger.getName()+"  价钱："+humburger.getPrice());
    // 一种装饰
    DecoratorOne one = new DecoratorOne(humburger);
    System.out.println(one.getName()+"  价钱："+one.getPrice());
    // 二种装饰
    DecoratorTwo two = new DecoratorTwo(new DecoratorOne(humburger));
    System.out.println(two.getName()+"  价钱："+two.getPrice());
    // 三种装饰
    DecoratorThree three = new DecoratorThree(new DecoratorTwo(new DecoratorOne(humburger)));
    System.out.println(three.getName()+"  价钱："+three.getPrice());
    // 切换顺序的装饰
    DecoratorThree bigThree = new DecoratorThree(new DecoratorOne(new DecoratorTwo(humburger)));
    System.out.println(bigThree.getName()+"  价钱："+bigThree.getPrice());
  }
}
