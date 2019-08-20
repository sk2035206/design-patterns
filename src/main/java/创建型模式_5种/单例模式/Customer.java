package 创建型模式_5种.单例模式;

/**
 * 消费者
 * @author sk
 */
public class Customer {

  public static void main(String[] args) {
    // 懒汉式单例 （通过下面例子证明其为单例，并未创建新对象）
    Singleton1_1 singleton1 = Singleton1_1.getInstance();
    singleton1.setName("小可爱");
    singleton1.printInfo();
    Singleton1_1 singleton1_1 = Singleton1_1.getInstance();
    singleton1_1.setName("小仙女");
    singleton1_1.printInfo();
    if(singleton1 == singleton1_1){
      System.out.println("创建的是同一个实例");
    }else{
      System.out.println("创建的不是同一个实例");
    }

    // 懒汉静态内部类式单例
    Singleton1_2 singleton1_2 = Singleton1_2.getInstance();
    // 饿汉式单例
    Singleton2 singleton2 = Singleton2.getInstance();
    // 登记式单例(可以忽略)
    Singleton3 singleton3 = Singleton3.getInstance();
  }
}
