package 行为型模式_11种.责任链模式;

/**
 * 具体处理者角色（总经理）
 * @author sk
 */
public class GeneralManager extends Handler {

  @Override
  public String handleMoneyRequest(String user, double money) {
    String str = null;
    // 总经理的权限很大，只要请求到了这里，他都可以处理
    if(money > 1000) {
      // 为了测试，简单点，只同意李四的请求
      if("李四".equals(user)) {
        str = "成功：总经理同意【" + user + "】的聚餐费用，金额为" + money + "元";
      }else {
        //其他人一律不同意
        str = "失败：总经理不同意【" + user + "】的聚餐费用，金额为" + money + "元";
      }
    }else {
      //如果还有后继的处理对象，继续传递
      if(getSuccessor() != null) {
        return getSuccessor().handleMoneyRequest(user, money);
      }
    }
    return str;
  }

}
