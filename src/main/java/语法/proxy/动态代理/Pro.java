package 语法.proxy.动态代理;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.lang.reflect.Proxy;
import java.util.Collection;

// ����ͨ��������ȡһ�����ڲ��ĸ��ַ���
public class Pro
{

	public static void main(String[] args)
	{
		getMethodInfo();
	}

	public static void getConstructorInfo()
	{
		Class clazz = Proxy.getProxyClass(Collection.class.getClassLoader(), Collection.class);
		Constructor[] constructors = clazz.getConstructors();
		System.out.println("��ӡ���캯��=============");
		for (Constructor c : constructors)
		{
			System.out.println(c.getName() + "������Ϣ�������£�");
			Class[] paramters = c.getParameterTypes();
			if (paramters.length == 0 && paramters == null)
			{
				System.err.println("û�в���");
			} else
			{
				for (Class pa : paramters)
				{
					System.out.println(pa.getName());
				}
			}
		} // end constructor
	}

	public static void getMethodInfo()
	{
		Class clazz = Proxy.getProxyClass(Collection.class.getClassLoader(), Collection.class);
		Method[] methods = clazz.getMethods();
		System.out.println("�������£�===========================");
		for (Method mm : methods)
		{
			StringBuilder ss = new StringBuilder();// b
			ss.append(mm.getName() + "(");
			Parameter[] parameters = mm.getParameters();
			for (Parameter r : parameters)
			{
				ss.append(r.getType() + "  " + r.getName());
			}
			ss.append(")");
			System.out.println(ss.toString());
		}

	}

}
