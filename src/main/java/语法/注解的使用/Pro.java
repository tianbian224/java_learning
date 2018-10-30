package 语法.注解的使用;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

// 
@Lvc(name = "lihuanhuan", age = 25)
public class Pro
{

	public static void main(String[] args) throws Exception
	{
		aaa();
		doWhat();

	}

	// 使用打印注解信息
	public static void aaa()
	{
		if (Pro.class.isAnnotationPresent(Lvc.class))// 此时lvc是在内存中,所以会显示
		{
			Lvc lvc = Pro.class.getAnnotation(Lvc.class);
			System.out.println(lvc.name());
			System.out.println(lvc.age());
			System.out.println(lvc.getClass().getName());
		}
	}

	// 备注注解的方法和类具体做什么事
	public static void doWhat() throws Exception
	{
		System.out.println("===============");
		Method[] methods = Pro.class.getMethods();
		for (Method method : methods)
		{
			Annotation[] annotations = method.getAnnotations();// 获取每个方法的注解
			for (Annotation annotation : annotations)
			{
				Lvc lvc = (Lvc) annotation;// 有lvc这个注释
				if (lvc != null)
				{
					method.invoke(new Pro(), "参数");// 有lvc这个注释就执行这个方法，并且打印一句话
					System.out.println(method.getName() + "包含注释 @Lvc");
					lvc.time();

				}
			}
		}
	}

	@Lvc(name = "lihuanhaun", age = 19)
	public void testA(String s)
	{
		System.out.println("方法testA被执行了！" + s);
	}
}
