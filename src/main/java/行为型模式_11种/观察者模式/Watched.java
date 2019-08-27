package 行为型模式_11种.观察者模式;

/**
 * 被观察者类
 * @author sk
 */
public interface Watched {

  /**
   * 添加观察者
   * @param watcher 观察者实例
   */
  void addWatcher(Watcher watcher);

  /**
   * 移出观察者
   * @param watcher 观察者实例
   */
  void removeWatcher(Watcher watcher);

  /**
   * 通知观察者
   */
  void notifyWatchers();
}
