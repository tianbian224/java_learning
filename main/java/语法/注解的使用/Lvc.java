package 语法.注解的使用;


//自己定义注解 
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.TYPE }) // 注解使用在方法和类上
public @interface Lvc
{
	// 成员变量使用 无参的函数
	String name() default "lvcang";

	int age() default 27;

	long time() default 1000;
}
