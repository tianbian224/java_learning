package 设计模式.策略模式;//  Lvcang created at  2017-11-09 16:06

import 设计模式.策略模式.BehaviorInterface.Weapon;
import 设计模式.策略模式.BehaviorImplement.MoveSwim;
import 设计模式.策略模式.BehaviorImplement.WeaponKnife;

public class RoleKiller extends Role
{
    // 不同的角色分配不同的行为
    public RoleKiller(Weapon w)
    {
        this.wuqi=new WeaponKnife();
        this.yidong=new MoveSwim();
    }
}
