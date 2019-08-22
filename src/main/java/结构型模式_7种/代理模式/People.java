package 结构型模式_7种.代理模式;

/**
 * 代理对象
 * @author sk
 */
public class People implements BuyCar {

  /** 余额 */
  private Double money;
  /** 是否为VIP */
  private Boolean vip;
  /** 余额 */
  private String username;

  @Override
  public void buyMyCar() {
    System.out.println(username + "是vip 客户，可以直接购买新车！");
  }

  public Double getMoney() {
    return money;
  }

  public void setMoney(Double money) {
    this.money = money;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public Boolean getVip() {
    return vip;
  }

  public void setVip(Boolean vip) {
    this.vip = vip;
  }
}
