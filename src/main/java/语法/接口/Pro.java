package 语法.接口;//  Lvcang created at  2018-02-02 10:14,have fun~

import 语法.接口.接口定义.IDefine;

/**
 * 语法点：
 * 1. 变量默认加上ublic static  final
 * 2. 接口中的方法有：普通方法、类方法、默认方法，都加上public
 * ○   普通方法：默认加上public abstract
 * ○   类方法，默认方法：必须有方法体
 */
public class Pro implements IDefine
{
    public static void main(String[] args)
    {
//        IDefine.fb();// 调用接口的静态方法
//        Pro ppp = new Pro();
//        ppp.fc();// 调用默认方法
//
//        ppp.fa();// 调用普通方法
//        System.out.println(IDefine.a);// 直接调用接口的常量

    }

    // 必须实现普通方法
     public void fa()
    {
        System.out.println("子类必须实现普通方法");
    }
}
