package 语法.对象初始化顺序;


public class BBB
{
//	提示：
    // 注意：BBB类内部有：static成员、static{}、普通成员、{}、构造函数
    // 执行顺序如下：
//	先执行static变量和静态代码块
    // 1.先找到有哪些static成员，
    // 2.按顺序初始化，包括直接初始化和static{}代码块初始化，二者是同一个序列
//			再执行实例变量和初始化块
    // 3.找到所有普通成员
    // 4.按顺序初始化，普通成员直接赋值和{}初始化在一个序列
//	构造函数
    // 5.构造函数

    static AAA aaa1 = new AAA("1");
    static AAA aaa2 = new AAA("2");
    static AAA aaa3;
    static AAA aaa9 = new AAA("jiji");
    static int i1 = 10;
    static int i2;

    static
    {
        aaa9 = new AAA("9");
    }

    static
    {

        aaa3 = new AAA("3");
    }

    public AAA aaa4 = new AAA("4");
    public AAA aaa5 = new AAA("5");
    public AAA aaa8;
    public AAA aaa7;
    public AAA aaa6 = new AAA("kkkkkk");
    int cc = 2;

    {
        aaa7 = new AAA("7");
        cc = 21;
    }

    {
        aaa6 = new AAA("6");
    }

    public BBB()
    {
        aaa8 = new AAA("8");
    }

}
