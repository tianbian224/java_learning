package 设计模式.命令模式;//  Lvcang created at  2017-11-14 9:13


// 万能遥控器：调用者
public class RemoteControler
{
    // 调用者持有多个命令对象
    private ICommand[] commands;


    public RemoteControler()
    {
        this.commands = new ICommand[4];// 有四个按钮
    }

    // 给某个按钮设置命令
    public void setCommand(int index, ICommand command)
    {
        this.commands[index] = command;
    }

    // 调用者执行 命令:按钮按下
    public void buttonDown(int index)
    {
        this.commands[index].execute();
    }


}
