package 设计模式.行为型.策略模式.BehaviorImplement;//  Lvcang created at  2017-11-09 15:50

import 设计模式.行为型.策略模式.BehaviorInterface.Weapon;

public class WeaponKnife implements Weapon
{
    @Override public void zhuangDan()
    {
        System.out.println("不需要子弹");
    }

    @Override public void fire()
    {
        System.out.println("算法是：用刀砍");
    }
}
