package 行为型模式_11种.命令模式;

/**
 * 遥控器
 *
 * @author mkk
 * @since 2020/9/10
 */
public class Control {

    /** 命令组合 */
    private Command onCommand, offCommand, changeChannel;

    /** 构造函数 */
    public Control(Command on, Command off, Command channel) {
        onCommand = on;
        offCommand = off;
        changeChannel = channel;
    }

    /** 开机 */
    public void turnOn() {
        onCommand.execute();
    }

    /** 关机 */
    public void turnOff() {
        offCommand.execute();
    }

    /** 换台 */
    public void changeChannel() {
        changeChannel.execute();
    }

}
