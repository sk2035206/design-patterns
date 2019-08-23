package 结构型模式_7种.装饰者模式;

/**
 * 第二种装饰者装饰者
 * @author sk
 */
public class DecoratorTwo extends Decorator {

  /**
   * 初始化被装饰着
   * @param human 被装饰着
   */
  public DecoratorTwo(Human human) {
    super(human);
  }

  public void goClothespress() {
    System.out.println("去衣柜找找看。。");
  }

  public void findPlaceOnMap() {
    System.out.println("在地图上找找。。");
  }

  @Override
  public void wearClothes() {
    // TODO Auto-generated method stub
    super.wearClothes();
    goClothespress();
  }

  @Override
  public void walkToWhere() {
    // TODO Auto-generated method stub
    super.walkToWhere();
    findPlaceOnMap();
  }
}
