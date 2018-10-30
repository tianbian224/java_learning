package 设计模式.命令模式;//  Lvcang created at  2017-11-14 9:17

//执行者：灯
public class Light
{

    public void turnOnLight()
    {
        System.out.println("客厅灯 打开");
    }

    public void turnOffLight()
    {
        System.out.println("客厅灯 关闭");
    }
}
