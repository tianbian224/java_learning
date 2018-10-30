package 设计模式.适配器模式;//  Lvcang created at  2017-11-13 21:17

//测试使用适配器模式：  2018年3月27日22:10:33  复习
public class Pro
{
    public static void main(String[] args)
    {
        EuropeInferface europe = new EuropePower();// 欧洲电源

        EuropeToChinaAdaptor adaptor = new EuropeToChinaAdaptor(europe);

        adaptor.gongzuo();
    }

}
