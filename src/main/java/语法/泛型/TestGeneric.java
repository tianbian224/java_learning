package 语法.泛型;

import java.io.Serializable;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

public class TestGeneric
{
    ArrayList[] cascsc = new ArrayList[10];
    String[] strings = new String[23];

    public static void main(String[] dsa) throws Exception
    {
        try
        {
            Method method = TestGeneric.class.getMethod("AA", ArrayList.class);
            Type tt = method.getGenericParameterTypes()[0];
            System.out.println(tt);
            ParameterizedType pattt = (ParameterizedType) tt;// ǿת����������
            System.out.println("getRawType()====ԭʼ����" + pattt.getRawType());
            System.out.println("getActualTypeArguments====ʵ������" + pattt.getActualTypeArguments()[0]);
            System.out.println("getOwnerType====����" + pattt.getOwnerType());
        } catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void test1(ArrayList<?> aaa)
    {
        aaa = new ArrayList<Date>();
    }

    public static <T, S extends T> void copy(List<T> dts, List<S> src)
    {

    }

    public static <U> void copy2(Collection<U> dsd, Collection<? extends U> ds)
    {

    }

    public static <K> void copy3(Collection<? super K> ds, Collection<K> csc)
    {

    }

    public void AA(ArrayList<Integer> csc)
    {

    }

    public <U extends RuntimeException & Serializable> U add(ArrayList<String> x, U y)
    {
        return y;

    }

    public <B extends RuntimeException> void sub() throws B
    {
        Exception exception = new Exception("");
        throw (B) exception;
    }
    //Person[] persons = new Person[45];

}

class Doctor<U>
{
    private U name;

    public U getName()
    {
        return name;
    }
}

class CDCD<T> extends Doctor<T>
{

}
