package 创建型模式_5种.建造者模式;

/**
 *  奔驰车建造类
 * @author sk
 */
public class DivBuilder implements CarBuilder {

  Car car;

  public DivBuilder() {
    car = new Car();
  }

  @Override
  public void buildFrame() {
    car.setFrame("奔驰车架");
    System.out.println("建造车架中");
  }

  @Override
  public void buildTyre() {
    car.setTyre("米其林轮胎");
    System.out.println("建造轮胎中");
  }

  @Override
  public void buildEngine() {
    car.setEngine("宝马发动机");
    System.out.println("建造发动机中");
  }

  @Override
  public Car buildCar() {
    return car;
  }
}