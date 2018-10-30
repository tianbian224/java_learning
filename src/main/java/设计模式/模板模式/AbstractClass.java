package 设计模式.模板模式;//  Lvcang created at  2017-11-14 10:20

public abstract class AbstractClass
{
    // 使用final，这个子类只能覆盖个性化步骤，不能覆盖全部
    public final void work()
    {
        oneStep();
        twoStep();
        threeStep();
        fourStep();
        fiveStep();
    }

    private void oneStep()
    {
        System.out.println("执行第一步");
    }

    // 第二部有所差异
    protected abstract void twoStep();

    private void threeStep()
    {
        System.out.println("执行第三步");
    }

    //第四部有所差异
    protected abstract void fourStep();

    private void fiveStep()
    {
        System.out.println("执行第五步");
    }
}
