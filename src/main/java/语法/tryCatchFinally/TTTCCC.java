/**
 * 说明：
 * 1.try 和 finally 中都有return，那么finally中的return会把try中的return覆盖掉。所以阿里代码规约不让在finally中使用return
 *   参见test5
 * 2.try中return变量a,但是finally 中修改了a。try在return变量之前，会执行finally，最终返回结果是finally修改之前的值。
 *   这是因为try在return之前，会先将变量a缓存，然后执行finally。finally执行完毕，再把缓存的变量a返回。所以
 *      a)被修改的变量a是引用类型，finally修改产生作用。参见test
 *      b)被修改的变量a是值类型，finally修改不产生作用。参见test2
 *
 */
package 语法.tryCatchFinally;

import java.util.ArrayList;
import java.util.List;

public class TTTCCC
{
    public static void main(String[] args)
    {
        Object a = test5();
        System.out.println(a);
    }

    //都没有return
    public static int test()
    {
        int i = 1;
        try
        {
            i++;// i=2
            System.out.println("try block, i = " + i);  // output 2
        } catch (Exception e)
        {
            i++;
            System.out.println("catch block i = " + i);
        } finally
        {
            i = 10;
            System.out.println("finally block i = " + i);// output 10
        }
        return i;
    }

    /**
     * finally 修改的变量是值类型
     * @return
     */
    public static int test2()
    {
        int i = 1;
        try
        {
            i++;
            System.out.println("try block, i = " + i);// output 2
            return i;
        } catch (Exception e)
        {
            i++;
            System.out.println("catch block i = " + i);
            return i;
        } finally
        {
            i = 1000;
            System.out.println("finally block i = " + i);// output 10
        }
    }

    public static  List<Object> test3()
    {
        List<Object> list = new ArrayList<Object>();
        try
        {
            list.add("try");
            System.out.println("try block");
            return list;
        } catch (Exception e)
        {
            list.add("catch");
            System.out.println("catch block");
            return list;
        } finally
        {
            list.add("finally");
            System.out.println("finally block ");
        }
    }

    public static int test5()
    {
        int i = 1;
        try
        {
            i++;
            System.out.println("try block, i = " + i);
            return i;
        } catch (Exception e)
        {
            i++;
            System.out.println("catch block i = " + i);
            return i;
        } finally
        {
            i = 10;
            System.out.println("finally block i = " + i);
            return i;
        }
    }
}
