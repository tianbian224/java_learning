package 设计模式.结构型.适配器模式;//  Lvcang created at  2017-11-13 21:17

//测试使用适配器模式：  2018年3月27日22:10:33  复习

/**
 * 适配器模式和装饰器模式非常类似，都叫包装模式，注意以下区别：
 * 1. 装饰器模式注重功能增强，适配器强调不同对象的转换。所以在代码层面来说，
 * 装饰器要持有源对象，实现的目标对象的接口，进而源到目标的转换。而装饰器持有源对象，实现的也是源对象的接口，进而实现对源的增强
 * Eouroe --> adaptor --> China
 */
public class Pro {
    public static void main(String[] args) {
        EuropeInferface europe = new EuropePower();

        EuropeToChinaAdaptor adaptor = new EuropeToChinaAdaptor(europe);

        adaptor.gongzuo();
    }

}
