package 语法.接口.接口定义;//  Lvcang created at  2018-02-02 10:16,have fun~
//2018年3月27日09:28:33  复习

/**
 * 语法点：
 * 1. 变量默认加上ublic static  final
 * 2. 接口中的方法有：普通方法、类方法、默认方法，都加上public
 * ○   普通方法：默认加上public abstract
 * ○   类方法，默认方法：必须有方法体
 */

public interface IDefine
{

    int a = 100;// 默认加上public static  final。接口中的变量都是常量

    /*

    static void fb()  // 默认加上public
    {
        System.out.println("类方法要有方法体");
    }

    void fa();//  默认加上public abstract，没有实现

    default void fc()
    {
        System.out.println("默认方法要有方法体");
    }

    */
}
