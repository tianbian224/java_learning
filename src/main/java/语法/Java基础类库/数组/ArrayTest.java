package 语法.Java基础类库.数组;//  Lvcang created at  2018-05-12 13:50,have fun~

import java.util.Arrays;

public class ArrayTest
{
    public static void main(String[] args)
    {

        tri();
    }

    // 一维数组
    public static void one()
    {
        int[] a = new int[10];
        Arrays.fill(a, 100); // 填充
        System.out.println(Arrays.toString(a));// 显示数组

        int[] c = Arrays.copyOf(a, a.length);// 复制数组
        System.out.println(Arrays.toString(c));

        System.out.println(Arrays.equals(a, c));
    }


    // 二维数组
    public static void two()
    {
        int[][] c = new int[3][4];
        // 打印数组
        System.out.println(Arrays.deepToString(c));
    }


    // 不规则数组
    public static void tri()
    {
        int[][] c = new int[3][];
        for (int i = 0; i < c.length; i++)
        {
            c[i]=new int[i+1];
        }
        // 打印数组
        System.out.println(Arrays.deepToString(c));
    }



}
