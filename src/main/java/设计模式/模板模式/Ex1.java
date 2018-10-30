package 设计模式.模板模式;//  Lvcang created at  2017-11-14 10:26

public class Ex1 extends AbstractClass
{
    @Override protected void twoStep()
    {
        System.out.println("Ex1执行第二步");
    }

    @Override protected void fourStep()
    {
        System.out.println("Ex1执行第四步");
    }
}
