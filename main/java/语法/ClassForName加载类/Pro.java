package 语法.ClassForName加载类;

// 2018年3月27日10:23:14  复习
// 说明：使用配置文件确定得到哪一个类。

/**
 * 配置文件写好使用哪一个类
 * Class.forName(lei).newInstance();根据名字加载这个类，并进行实例化
 * 实例化之后调用这个对象的方法
 */
public class Pro
{

    public static void main(String[] args)
    {
        ChaZuo chaZuo = GetClass.getDianqi();

        chaZuo.TongDian();

    }

}
