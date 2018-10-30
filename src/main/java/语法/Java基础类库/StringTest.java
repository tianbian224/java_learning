package 语法.Java基础类库;//  Lvcang created at  2018-02-01 9:05,have fun~

/**
 * string 相关的用法
 */
public class StringTest
{
    public static void main(String[] args)
    {

    }

    //多使用stringBuilder（不安全）
    public static void stringBuiler()
    {
        StringBuilder s = new StringBuilder();
        s.append("a");
    }


    // string基本函数
    public static void testString()
    {
        String s = "abcdefg";
        int lenght = s.length();// 长度
        String upper = s.toUpperCase();// 大写
        String lower = s.toLowerCase();// 小写
        char[] chars = s.toCharArray();// 字符数组
        char c = s.charAt(0);// 获取字符
        int a = s.compareTo("cdb");// 比较
        int index = s.indexOf("d");// 找索引
        String[] sp = s.split("_");// 切割

    }
}
