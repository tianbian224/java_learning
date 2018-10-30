package 语法.深拷贝浅拷贝.浅拷贝;//  Lvcang created at  2018-03-28 15:36,have fun~


// 浅拷贝就是使用clone方法
public class Qian implements Cloneable
{
    public Integer age = 10;

    public String name="lvcang";


    // 没有方法，但是写了这个方法才能拷被
    public Qian clone() throws CloneNotSupportedException
    {
        return (Qian) super.clone();
    }
}
