package 语法.基础语法;//  Lvcang created at  2018-01-31 14:40,have fun~

public  class BaseTest
{
    public static void main(String[] args)
    {
        final int c = Integer.parseInt("4545");

        // 数组d定义
        int[] aa = new int[5];
        int[] ab = new int[]{1, 2, 3, 4, 5};
        int[] ac = {1, 2, 3, 4, 5};

        // java 中，值传递（实际上是值复制到函数形参）
        Integer a=1;
        Boolean cc=false;
        AA aa1 = new AA();

        outTest(a,cc,aa1);
        System.out.println(a);
        System.out.println(cc);
        System.out.println(aa1);

        // 多个参数
        System.out.println(paramsTest(1,2,3,4));

        // 重载
        chongZai("a",12);
        boolean cccc=chongZai("a",1,2);// 非重载


    }

    // 值传递（就是复制实参）
    public static void outTest(Integer b,Boolean c,AA aa)
    {

        b=100;// 重新指向
        c=true;
        aa.age=77;// 修改原内容
    }


    // 多参数
    public static int paramsTest(int... nums)
    {
        int sum = 0;
        for(int c : nums)
        {
            sum += c;
        }
        return sum;
    }

    // 重载：个数、类型、顺序
    public  static int chongZai(int a,String b){return  10;}
    public  static int chongZai(int a,int b){return  10;}
    public  static int chongZai(String a,int b){return  10;}
    // 返回值不同，不是重载，但是不报错
    public static boolean chongZai(String a, int b,int c) {return  false;}

    /**
     * 复习switch  case 结构
     * @param a
     * @return
     */
    public static int switchCase(String a)
    {
        int res = 0;
//        switch (a)
//        {
//            case "a":
//                res = 1;
//                break;
//            case "b":
//                res = 2;
//                break;
//            default:
//                res = 10;
//        }
        return res;
    }
}
class  AA
{
    int age=99;
    String name="Tump";

    @Override public String toString()
    {
        return age+name;
    }
}
