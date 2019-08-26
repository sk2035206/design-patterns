package 结构型模式_7种.外观模式_门面模式;

/**
 * 门面类
 * @author sk
 *
 * 类似与现在的包工头，可以完成你所需要的各种任务，不需要你挨个找人完成，子系统为每个工人
 * 该模式中客户端不需要亲自调用每个需要的子系统，也不需要知道子系统内部的实现细节，
 * 客户端只需要跟Facade类交互就好了，从而更好地实现了客户端和子系统中A、B、C模块的解耦，让客户端更容易地使用系统。
 *
 * 优点：门面模式松散了客户端与子系统的耦合关系，让子系统内部的模块能更容易扩展和维护。
 *      门面模式让子系统更加易用，客户端不再需要了解子系统内部的实现，也不需要跟众多子系统内部的模块进行交互，只需要跟门面类交互就可以了。
 *      可以选择性地暴露方法，一个模块中定义的方法可以分成两部分，一部分是给子系统外部使用的，一部分是子系统内部模块之间相互调用时使用的。
 *      有了Facade类，那么用于子系统内部模块之间相互调用的方法就不用暴露给子系统外部了。
 *
 */
public class Facade {
  /** 工人一 */
  private WorkerOne workerOne = new WorkerOne();
  /** 工人二 */
  private WorkerTwo workerTwo = new WorkerTwo();
  /** 工人三 */
  private WorkerThree workerThree = new WorkerThree();

  public Facade() {
    System.out.println("\n我是包工头，我雇佣了以上这些人!");
  }

  /** 开始装修房子 */
  public void stare() {
    workerOne.stare();
    workerTwo.stare();
    workerThree.stare();
  }
}
