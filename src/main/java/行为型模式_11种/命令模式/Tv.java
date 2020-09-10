package 行为型模式_11种.命令模式;

/**
 * 电视类（命令接收者）
 *
 * @author mkk
 * @since 2020/9/10
 */
public class Tv {

    /**
     * 当前频道
     */
    public int currentChannel = 0;

    /**
     * 开机
     */
    public void turnOn() {
       System.out.println("The television is on.");
    }

    /**
     * 关机
     */
    public void turnOff() {
       System.out.println("The television is off.");
    }

    /**
     * 换台
     * @param channel 频道
     */
    public void changeChannel(int channel) {
       this.currentChannel = channel;
       System.out.println("Now TV channel is " + channel);
    }

}
