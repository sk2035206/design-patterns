package 创建型模式_5种.建造者模式;

/**
 *  奔驰车建造类
 * @author sk
 */
public class BenzBuilder implements CarBuilder {

  Car car;

  public BenzBuilder() {
    car = new Benz();
  }

  @Override
  public void buildFrame() {
    car.setFrame("建造奔驰车架");
    System.out.println("建造奔驰车架");
  }

  @Override
  public void buildTyre() {
    car.setTyre("建造奔驰车轮胎");
    System.out.println("建造奔驰车轮胎");
  }

  @Override
  public void buildEngine() {
    car.setEngine("建造奔驰车发动机");
    System.out.println("建造奔驰车发动机");
  }

  @Override
  public Car buildCar() {
    return car;
  }
}