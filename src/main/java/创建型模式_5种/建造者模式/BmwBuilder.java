package 创建型模式_5种.建造者模式;

/**
 *  宝马车建造类
 * @author sk
 */
public class BmwBuilder implements CarBuilder {

  Car car;

  public BmwBuilder() {
    car = new Bmw();
  }

  @Override
  public void buildFrame() {
    car.setFrame("建造宝马车架");
    System.out.println("建造宝马车架");
  }

  @Override
  public void buildTyre() {
    car.setTyre("建造宝马车轮胎");
    System.out.println("建造宝马车轮胎");
  }

  @Override
  public void buildEngine() {
    car.setEngine("建造宝马车发动机");
    System.out.println("建造宝马车发动机");
  }

  @Override
  public Car buildCar() {
    return car;
  }
}
