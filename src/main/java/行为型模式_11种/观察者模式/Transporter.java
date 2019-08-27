package 行为型模式_11种.观察者模式;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的被观察者
 * @author sk
 */
public class Transporter implements Watched{

  /** 观察者队列 */
  private List<Watcher> list = new ArrayList<>();

  @Override
  public void addWatcher(Watcher watcher) {
    list.add(watcher);
  }

  @Override
  public void removeWatcher(Watcher watcher) {
    list.remove(watcher);
    System.out.println("移除:" + watcher);
  }

  @Override
  public void notifyWatchers() {
    for (Watcher watcher : list) {
      watcher.notice();
    }
  }

  @Override
  public String toString() {
    StringBuffer sb = new StringBuffer("当前观察者:");
    for (Watcher watcher : list) {
      sb.append(watcher);
    }
    return sb.toString();
  }
}
