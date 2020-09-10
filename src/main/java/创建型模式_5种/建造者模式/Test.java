package 创建型模式_5种.建造者模式;

/**
 * 测试类
 * @author sk
 * 建造者模式主要用来将一个复杂对象的构建与它的表示分离，使得同样的构建过程可以创建不同的表示
 * 对于抽象工厂模式以及建造者模式的区别
 * 个人理解为前者为已经预先设计好的对象，只需根据需求获取(例如什么车用什么发动机用什么空调都是预先设置好的)
 * 后者为可以根据自己的需求进行建造自己想要的汽车（例如我想要宝马的发动机，奔驰的车架，米其林轮胎）
 * 建造者模式还可以根据需求进行构建顺序切换，而抽象工厂模式则比较麻烦
 */
public class Test{
  public static void main(String[] args) {
    // 实例化构建汽车对象
    CarDirector carDirector = new CarDirector();
    // 分别构建宝马和奔驰车
    Car bmw = carDirector.carDirector(new BmwBuilder());
    System.out.println(bmw);
    System.out.println("-----------------------------");
    Car benz = carDirector.carDirector(new BenzBuilder());
    System.out.println(benz);
    System.out.println("-----------------------------");
    Car div = carDirector.carDirector(new DivBuilder());
    System.out.println(div);
  }
}