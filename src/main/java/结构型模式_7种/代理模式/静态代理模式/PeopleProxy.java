package 结构型模式_7种.代理模式.静态代理模式;

import 结构型模式_7种.代理模式.BuyCar;
import 结构型模式_7种.代理模式.People;

/**
 * 代理类
 * @author sk
 */
public class PeopleProxy implements BuyCar {

  /** 被代理对象 */
  private People people;

  public PeopleProxy(People people) {
    this.people = people;
  }

  @Override
  public void buyMyCar() {
    // 判断是否为vip，是则可以直接买车
    if (people.getVip() != null && people.getVip() == true) {
      people.buyMyCar();
      return;
    }
    // 判断余额是否足够买车
    if (people.getMoney() >= 50000) {
      System.out.println(people.getUsername() + "买了新车，交易结束！");
      return;
    }
    System.out.println(people.getUsername() + "钱不够，不能买车，继续比赛！");
  }

}
