package 语法.proxy.dynamicProxy.Cglib;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
import 语法.proxy.dynamicProxy.JDK.Actor;

import java.lang.reflect.Method;

// 使用cglib实现动态代理
public class Pro
{
    public static void main(String[] params)
    {
        // 1. 被代理人
        final Actor actor = new Actor();
        // 2. 代理人

        Actor actorProxy = (Actor) Enhancer.create(actor.getClass(), new MethodInterceptor()
        {

            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable
            {
                if (method.getName().equals("play"))
                {
                    System.out.println("开启事务");
                    method.invoke(actor, objects[0]);
                    System.out.println("关闭事务");
                }
                // 别的if条件判断其他方法需要被如何代理
                if (method.getName().equals("show"))
                {
                    System.out.println("show 方法前准备工作,没有和远平王结婚");
                    method.invoke(actor, objects[0], objects[1]);
                    System.out.println("show 方法后，和远平王结婚");
                }
                return null;// 是否返回没什么区别
            }

        });
        // 3. 代理人干活
        actorProxy.show("zhanglanlan", "tuoyiwu");
    }

}
