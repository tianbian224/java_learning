package 语法.基础语法.数组;//  Lvcang created at  2018-02-02 20:06,have fun~


import sun.text.resources.cldr.rm.FormatData_rm;

/**
 * 创建数组
 */
public class TestArray
{
    public static void main(String[] args)
    {

    }

    // 创建一维数组
    public static void yiwei()
    {
        int[] yiwei2 = new int[10];
        int[] yiwei3 = {1, 2, 3, 4};
        int[] yiwei = new int[]{1, 2, 3};
    }

    // 创建多维数组
    public static void erwei()
    {
        int[][] erwei = new int[2][4];
        int[][] erwei2 = new int[2][];
        int[][] erwei3 = {{}, {}, {}};
        int[][] erwei4=new int[][]{{},{},{}};


    }
}
