package 行为型模式_11种.观察者模式;

/**
 * 观察者模式测试类
 * @author sk
 *
 * 抽象观察者角色：为所有具体的观察者定义一个接口，在得到主题的通知时更新自己。
 * 抽象被观察者角色：把所有对观察者对象的引用保存在一个集合中，每个被观察者角色都可以有任意数量的观察者。
 *                  被观察者提供一个接口，可以增加和删除观察者角色。一般用一个抽象类和接口来实现。
 * 具体观察者角色：该角色实现抽象观察者角色所要求的更新接口，以便使本身的状态与主题的状态相协调。通常用一个子类实现。
 *                如果需要，具体观察者角色可以保存一个指向具体主题角色的引用。
 * 具体被观察者角色：在被观察者内部状态改变时，给所有登记过的观察者发出通知。具体被观察者角色通常用一个子类实现。
 * 我推你拉
 * 例子中没有关于数据和状态的变化通知，只是简单通知到各个观察者，告诉他们被观察者有行动。
 * 观察者模式在关于目标角色、观察者角色通信的具体实现中，有两个版本。
 * 一种情况便是目标角色在发生变化后，仅仅告诉观察者角色“我变化了”，观察者角色如果想要知道具体的变化细节，则就要自己从目标角色的接口中得到。
 * 这种模式被很形象的称为：拉模式——就是说变化的信息是观察者角色主动从目标角色中“拉”出来的。
 * 还有一种方法，那就是我目标角色“服务一条龙”，通知你发生变化的同时，通过一个参数将变化的细节传递到观察者角色中去。
 * 此模式被称为：“推模式”——就是管你要不要，先给你。
 * 这两种模式的使用，取决于系统设计时的需要。如果目标角色比较复杂，并且观察者角色进行更新时必须得到一些具体变化的信息，则“推模式”比较合适。
 * 如果目标角色比较简单，则“拉模式”就很合适啦。
 */
public class WatcherTest {
  public static void main(String[] args) {
    // 实例化被观察者
    Transporter transporter = new Transporter();
    // 实例化观察者
    Police police = new Police();
    Security security = new Security();
    Thief thief = new Thief();
    // 将观察者添加进队列中
    transporter.addWatcher(police);
    transporter.addWatcher(security);
    transporter.addWatcher(thief);
    System.out.println(transporter);
    // 通知所有观察者
    transporter.notifyWatchers();
    System.out.println("-------情况有变,强盗撤退-------");
    transporter.removeWatcher(thief);
    System.out.println(transporter);
  }
}
