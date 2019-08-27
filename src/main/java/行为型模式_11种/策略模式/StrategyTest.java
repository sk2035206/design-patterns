package 行为型模式_11种.策略模式;

/**
 * 策略模式测试类
 * @author sk
 *
 * 环境类(Context):用一个ConcreteStrategy对象来配置。维护一个对Strategy对象的引用。可定义一个接口来让Strategy访问它的数据。
 * 抽象策略类(Strategy):定义所有支持的算法的公共接口。 Context使用这个接口来调用某ConcreteStrategy定义的算法。
 * 具体策略类(ConcreteStrategy):以Strategy接口实现某具体算法。
 */
public class StrategyTest {
  public static void main(String[] args) {
    /** 实例化环境类 */
    Context context;
    System.out.println("------------出发去旅游------------");
    context = new Context(new Car());
    context.waysOfTravel();
    System.out.println("坐车太累，换种方式吧！");
    context.setStrategy(new Train());
    context.waysOfTravel();
    System.out.println("火车太耗时，再换种方式吧！");
    context.setStrategy(new Plane());
    context.waysOfTravel();
  }
}
