// 没完成，不明确
package 语法.tryCatchFinally;

import java.util.ArrayList;
import java.util.List;

public class TTTCCC
{
    public static void main(String[] args)
    {
        //int a = test2();
        System.out.println(testBasic());
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
            i = 10;
            System.out.println("finally block i = " + i);
        }
    }

    public static List<Object> testWrap()
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

    public static int testBasic()
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
