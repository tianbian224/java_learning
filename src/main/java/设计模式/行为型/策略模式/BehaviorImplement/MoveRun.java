package 设计模式.行为型.策略模式.BehaviorImplement;//  Lvcang created at  2017-11-09 15:53

import 设计模式.行为型.策略模式.BehaviorInterface.Move;

// 移动的第一种实现
public class MoveRun implements Move
{
    @Override public void move()
    {
        System.out.println("算法是：奔跑");
    }
}
