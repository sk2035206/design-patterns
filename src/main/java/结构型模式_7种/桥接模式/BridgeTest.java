package 结构型模式_7种.桥接模式;

/**
 * 桥接模式测试类
 * @author sk
 *
 * 桥接模式:将抽象部分与它的实现部分分离，使它们都可以独立地变化
 * 桥接模式用关联关系来降低类与类之间的耦合
 */
public class BridgeTest {
  public static void main(String[] args) {
    // 实例化桥接对象
    Bridge mysqlBridge = new MyBridge();
    // 连接Mysql数据库
    Driver mysqlDriver = new MysqlDriver();
    mysqlBridge.setDriver(mysqlDriver);
    mysqlBridge.connect();
    System.out.println(mysqlBridge.getDriver());
    // 连接Oracle数据库
    Driver oracleDriver = new OracleDriver();
    mysqlBridge.setDriver(oracleDriver);
    mysqlBridge.connect();
    System.out.println(mysqlBridge.getDriver());
  }
}
