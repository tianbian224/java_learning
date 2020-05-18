package 设计模式.行为型.策略模式.BehaviorImplement;//  Lvcang created at  2017-11-09 15:54

import 设计模式.行为型.策略模式.BehaviorInterface.Move;

// 移动的第二种实现
public class MoveSwim implements Move
{

    @Override public void move()
    {
        System.out.println("算法是：游泳");
    }
}
