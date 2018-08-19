package 设计模式.模板模式;//  Lvcang created at  2017-11-14 10:27

public class Ex2 extends AbstractClass
{
    @Override protected void twoStep()
    {
        System.out.println("Ex2执行第二步");
    }

    @Override protected void fourStep()
    {
        System.out.println("Ex2执行第四步");
    }
}
