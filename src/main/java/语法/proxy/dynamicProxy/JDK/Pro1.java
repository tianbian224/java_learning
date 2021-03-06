package 语法.proxy.dynamicProxy.JDK;


import org.junit.Test;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 测试代理效果
//  单独写如何代理

/**
 * // 动态代理和静态代理区别：
 * // 静态代理需要：
 * // 1. 对于开启事务、记录日志类需求，需要为每个方法写重复代码，很繁琐，动态代理只需要写一次。
 * // 2. 对于个性化的方法，动态代理和静态代理一样，还是要针对性的写个性化代码
 * // 3. 动态代理中需要判断方法名称。
 */
public class Pro1 {
    @Test
    public void main() {

        // 1.被代理对象
        IActor actor = new Actor();
        // 2.代理人
        IActor actorProxy = (IActor) Proxy.newProxyInstance(actor.getClass().getClassLoader(),
                actor.getClass().getInterfaces(), new MyInvocationHandler(actor));// 可以匿名内部类直接写
        // 3. 代理人去干活
        actorProxy.play("fanbingbing");
        actorProxy.show("zhanglanan", "sing");


        // 显示代理类的属性
        System.out.println("   --------------------------显示代理类的实现接口-------------------------- ");
        Class<?>[] interfaces = actorProxy.getClass().getInterfaces();
        for (Class inf : interfaces) {
            System.out.println(inf.getName());
        }
        System.out.println("   --------------------------显示代理类及其父类-------------------------- ");
        Class<?> superclass = actorProxy.getClass();
        System.out.println(superclass.getName());
        System.out.println(superclass.getSuperclass().getName());
        System.out.println("   --------------------------显示代理类中的方法-------------------------- ");
        Method[] methods = actorProxy.getClass().getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

    }

}