package 设计模式.行为型.策略模式;//  Lvcang created at  2017-11-09 15:43

import 设计模式.行为型.策略模式.BehaviorInterface.Move;
import 设计模式.行为型.策略模式.BehaviorInterface.Weapon;

public abstract class Role
{
    // 使用组合，不使用继承：面向接口编程
    protected Move yidong;
    protected Weapon wuqi;

    // 角色具有的功能
    public void fight()
    {
        wuqi.fire();
    }

    // 改变行为
    public void setYidong(Move yidong)
    {
        this.yidong = yidong;
    }

    public void setWuqi(Weapon wuqi)
    {
        this.wuqi = wuqi;
    }
}
