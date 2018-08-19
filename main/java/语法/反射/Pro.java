package 语法.反射;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;
public class Pro
{
	public static void main(String[] args) throws Exception
	{

		System.out.println("=============================================Constructor??????");
		Constructor constructor = String.class.getConstructor(byte[].class);
		String boolStrinf = (String) constructor.newInstance("???".getBytes());

		Constructor constructor2 = String.class.getConstructor(StringBuffer.class);
		String intString = (String) constructor2.newInstance(new StringBuffer("???"));

		System.out.println("=============================================Field??????");
		Person p1 = new Person(27, 'm');
		p1.setMarried(false);
		Field f1 = p1.getClass().getField("age");// ???????��?
		Field f2 = p1.getClass().getDeclaredField("married");// ?��???��???????
		System.out.println(f1.get(p1));

		f2.setAccessible(true);// ????????????????married????��???????????????
		System.out.println(f2.get(p1));

		System.out.println("==============================================Method??????");
		Method eat = Person.class.getMethod("Eat", String.class);// ???????????????
		eat.invoke(p1, "???");
		Method eat2 = Person.class.getMethod("Eat", String.class, int.class);
		eat2.invoke(p1, "??", 2);
		Method eat3 = Person.class.getMethod("Say", String.class);
		eat3.invoke(null, "????");// ??????????

		System.out.println("=============================================??????????Person???String?????????��?A");
		Exercise();

		System.out.println("=========================================?????????main????");
		Exercise1();
		Exercise3();
		Exercise4();
	}

	public static void Exercise() throws Exception
	{

		Person ppPerson = new Person("lvc", "football", "Matrix");// ???????????????
		System.out.println(ppPerson);
		// Field nameField=Person.class.getDeclaredField("name");
		// Field habbitField=Person.class.getDeclaredField("habbit");
		Field[] fields = Person.class.getDeclaredFields();
		for (Field ff : fields)
		{
			if (ff.getType() == String.class)
			{
				ff.setAccessible(true);
				ff.set(ppPerson, "A");
			}
		}
		System.out.println(ppPerson);
	}

	public static void Exercise1() throws Exception
	{

		Method method = Person.class.getMethod("main", String[].class);
		String[] sss = new String[] { "lvc", "huanhuan", "lvli" };
		method.invoke(null, (Object) sss);
	}

	public static void Exercise3()
	{
		// ????????????��??
		Properties properties = new Properties();
		try
		{
			// InputStream inputStream = new
			// FileInputStream("bin/????/pp.ini");//?????
			InputStream inputStream = new FileInputStream("bin/????/pp.ini");// ??????????????????????��??pp.ini?????eclipse????????????????bin????
			properties.load(inputStream);
			System.out.println(properties);

		} catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void Exercise4()
	{
		// InputStream inputStream =
		// Pro.class.getClassLoader().getResourceAsStream("????/pp.ini");//????????????????????classpath��???????????????class??????????????��????��??????????????????????
//		InputStream inputStream = proxy.staticProxy_zhuangshi.Pro.class.getResourceAsStream("pp.ini");// ???????????????????class???
//		Properties properties = new Properties();
//		try
//		{
//			properties.load(inputStream);
//			System.out.println(properties);
//		} catch (IOException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

	}
}
