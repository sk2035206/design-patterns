package 行为型模式_11种.责任链模式;

/**
 * 责任链模式
 * 抽象处理者角色类
 * @author sk
 * 使多个对象都有机会处理请求，从而避免请求的发送者和接受者之间的耦合关系，
 * 将这个对象连成一条链，并沿着这条链传递该请求，直到有一个对象处理他为止。
 */
public abstract class Handler {

  /** 持有下一个处理请求的对象 */
  protected Handler successor = null;

  /**
   * 取值方法
   * @return 请求对象
   */
  public Handler getSuccessor() {
    return successor;
  }

  /**
   * 设置下一个处理请求的对象
   * @param successor 处理请求的对象
   */
  public void setSuccessor(Handler successor) {
    this.successor = successor;
  }

  /**
   * 处理聚餐费用的申请
   * @param user    申请人
   * @param money    申请的钱数
   * @return        成功或失败的具体通知
   */
  public abstract String handleMoneyRequest(String user , double money);
}
