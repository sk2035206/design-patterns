package 结构型模式_7种.装饰者模式;

/**
 * 第一种装饰者装饰者
 * @author sk
 */
public class DecoratorOne extends Decorator {

  /**
   * 初始化被装饰着
   * @param human 被装饰着
   */
  public DecoratorOne(Human human) {
    super(human);
  }

  public void goHome() {
    System.out.println("进房子。。");
  }

  public void findMap() {
    System.out.println("书房找找地图。。");
  }

  @Override
  public void wearClothes() {
    // TODO Auto-generated method stub
    super.wearClothes();
    goHome();
  }

  @Override
  public void walkToWhere() {
    // TODO Auto-generated method stub
    super.walkToWhere();
    findMap();
  }
}
