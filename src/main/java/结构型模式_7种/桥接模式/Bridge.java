package 结构型模式_7种.桥接模式;

/**
 * 桥接抽象类
 * @author sk
 */
public abstract class Bridge {

  private Driver driver;

  /** 连接数据库 */
  public void connect(){
    driver.connect();
  }

  /** 设置数据库类型 */
  public void setDriver(Driver driverTemp){
    this.driver = driverTemp;
  }

  /** 获取当前数据库内容 */
  public Driver getDriver(){
    return this.driver;
  }
}
