package 设计模式.行为型.策略模式;//  Lvcang created at  2017-11-09 16:07

import 设计模式.行为型.策略模式.BehaviorImplement.WeaponGun;

// 测试：策略模式
public class Pro
{
    public static void main(String[] args)
    {



        Role role = new RoleKiller(new WeaponGun());//
        role.fight();

        role.setWuqi(new WeaponGun());
        role.fight();


    }
}
