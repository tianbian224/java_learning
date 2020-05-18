package 设计模式.行为型.策略模式.BehaviorImplement;//  Lvcang created at  2017-11-09 15:47

import 设计模式.行为型.策略模式.BehaviorInterface.Weapon;

public class WeaponGun implements Weapon
{

    @Override public void zhuangDan()
    {
        System.out.println("装子弹");
    }

    @Override public void fire()
    {
        System.out.println("算法是：开枪射子弹");
    }
}
