package 设计模式.适配器模式;//  Lvcang created at  2017-11-13 21:14


//  适配器模式

/**
 * 实现目标接口，持有被适配对象的引用
 */
public class EuropeToChinaAdaptor implements ChinaInterface
{
    private EuropeInferface e;// 持有被适配者的引用

    public EuropeToChinaAdaptor(EuropeInferface e)
    {
        this.e = e;
    }

    @Override public void gongzuo()
    {
        e.work();
        System.out.println("欧洲电源转化为中国电源：230--220");
    }
}
