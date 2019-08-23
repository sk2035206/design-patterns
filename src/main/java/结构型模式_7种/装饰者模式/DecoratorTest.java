package 结构型模式_7种.装饰者模式;

/**
 * 装饰者模式测试类
 * @author sk
 */
public class DecoratorTest {
  public static void main(String[] args) {
    // 实例化被装饰者
    Human person = new Person();
    // 进行装饰初始化
    Decorator decorator = new DecoratorThree(new DecoratorTwo(new DecoratorOne(person)));
    // 开始装饰
    decorator.wearClothes();
    decorator.walkToWhere();
  }
}
