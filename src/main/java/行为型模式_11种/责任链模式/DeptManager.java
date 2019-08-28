package 行为型模式_11种.责任链模式;

/**
 * 具体处理者角色（部门经理）
 * @author sk
 */
public class DeptManager extends Handler {

  @Override
  public String handleMoneyRequest(String user, double money) {
    String str = null;
    // 部门经理的权限只能在1000以内
    if(money < 1000) {
      // 为了测试，简单点，只同意张三的请求
      if("张三".equals(user)) {
        str = "成功：部门经理同意【" + user + "】的聚餐费用，金额为" + money + "元";
      }else {
        //其他人一律不同意
        str = "失败：部门经理不同意【" + user + "】的聚餐费用，金额为" + money + "元";
      }
    }else {
      //超过1000，继续传递给级别更高的人处理
      if(getSuccessor() != null) {
        return getSuccessor().handleMoneyRequest(user, money);
      }
    }
    return str;
  }

}
