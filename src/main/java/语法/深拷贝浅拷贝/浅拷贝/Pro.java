package 语法.深拷贝浅拷贝.浅拷贝;//  Lvcang created at  2018-03-28 15:43,have fun~

// 浅拷贝
public class Pro
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Qian qian = new Qian();
        Qian qian1 = qian.clone();
        qian1.name="lvcvcvv";
        System.out.println(qian1.name);
    }
}
