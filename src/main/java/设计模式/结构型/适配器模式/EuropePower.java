package 设计模式.结构型.适配器模式;//  Lvcang created at  2017-11-13 21:10

public class EuropePower implements EuropeInferface
{


    @Override public void work()
    {
        System.out.println("欧洲电源插座  供电230V");
    }
}
