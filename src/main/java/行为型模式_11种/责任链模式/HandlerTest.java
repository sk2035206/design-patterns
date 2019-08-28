package 行为型模式_11种.责任链模式;

/**
 * 责任链模式测试类
 * @author sk
 *
 * 责任链模式优点：
 * 1. 改变内部的传递规则
 * 在内部，项目经理完全可以跳过人事部到那一关直接找到总经理。每个人都可以去动态地指定他的继任者。
 * 2. 可以从职责链任何一关开始
 * 如果项目经理不在，可以直接去找部门经理，责任链还会继续，没有影响。
 * 3.用与不用的区别
 * 不用职责链的结构，我们需要和公司中的每一个层级都发生耦合关系。
 * 如果反映在代码上即使我们需要在一个类中去写上很多丑陋的if….else语句。
 * 如果用了职责链，相当于我们面对的是一个黑箱，我们只需要认识其中的一个部门，然后让黑箱内部去负责传递就好了
 *
 * 纯的与不纯的责任链模式
 * 一个纯的责任链模式要求一个具体的处理者对象只能在两个行为中选择一个：一是承担责任，而是把责任推给下家。
 * 不允许出现某一个具体处理者对象在承担了一部分责任后又把责任向下传的情况。
 * 在一个纯的责任链模式里面，一个请求必须被某一个处理者对象所接收；在一个不纯的责任链模式里面，一个请求可以最终不被任何接收端对象所接收。
 * 纯的责任链模式的实际例子很难找到，一般看到的例子均是不纯的责任链模式的实现。、
 */
public class HandlerTest {
  public static void main(String[] args) {
    //先要组装责任链
    Handler h1 = new GeneralManager();
    Handler h2 = new DeptManager();
    Handler h3 = new ProjectManager();
    h3.setSuccessor(h2);
    h2.setSuccessor(h1);
    System.out.println("-----------------------项目经理----------------------------");
    String test1 = h3.handleMoneyRequest("张三", 300);
    System.out.println("test1 = " + test1);
    String test2 = h3.handleMoneyRequest("李四", 300);
    System.out.println("test2 = " + test2);
    System.out.println("-----------------------部门经理----------------------------");
    String test3 = h3.handleMoneyRequest("张三", 700);
    System.out.println("test3 = " + test3);
    String test4 = h3.handleMoneyRequest("李四", 700);
    System.out.println("test4 = " + test4);
    System.out.println("------------------------总经理-----------------------------");
    String test5 = h3.handleMoneyRequest("张三", 1500);
    System.out.println("test5 = " + test5);
    String test6 = h3.handleMoneyRequest("李四", 1500);
    System.out.println("test6 = " + test6);
  }
}
