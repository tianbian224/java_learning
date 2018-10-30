package 语法.equals_hash_相关;

/**
 * 2018年3月27日10:29:50 复习
 * hashcode：默认是返回对象的内存地址，来唯一标记一个对象。可以改写。但是System.identityHashCode(obj)始终返回实际内存地址
 * <p>
 * toString():默认返回的是类全名@内存地址。实现机制是调用了本类的hashcode。所以通过改写hashcode，也能改变toString的输出结果。
 * <p>
 * equals()：默认实现是比较内存地址。但是没有调用hashcode方法。默认使用的==来比较。==是地址比较运算符，当然也就没有调用hashcode方法。
 * 通过改写equals方法，实现比较两个对象，而不是使用==比较地址。
 */
public class Pro
{

    public strictfp static void main(String[] args)
    {

        Plant plant = new Plant();
        System.out.println(plant);// 类名@地址
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        System.out.println("a1:" + a1);
        System.out.println("a2:" + a2);
        System.out.println(a1.equals(a2));
        System.out.println(a1 == a2);

    }

}

class Animal
{
    // hashcode 返回的是16进制的地址
    @Override
    public int hashCode()
    {
        return 0x1515155;// object 返回的是16进制的地址,这里重写了
    }

    // toString 默认返回： 类全名@地址
    @Override
    public String toString()
    {
        // 验证返回的是是地址
        return "toString调用hashcode：" + super.toString() + " 实际地址：  "
                + Integer.toHexString(System.identityHashCode(this));
    }

    // 默认使用==进行比较，只是后来被覆盖了
    @Override
    public boolean equals(Object obj)
    {
        // equals 默认使用 的是hashcode比较
        // return super.equals(obj);// 默认
        return true;
    }
}

class Plant
{
    // hashcode 返回的是16进制的地址
    @Override
    public int hashCode()
    {
        return super.hashCode();// 返回的是16进制的地址
    }

    // toString 默认返回： 类全名@地址
    @Override
    public String toString()
    {
        // 验证返回的是是地址
        return super.toString() + "   " + Integer.toHexString(System.identityHashCode(this));
    }

    @Override
    public boolean equals(Object obj)
    {
        // equals 默认使用 的是hashcode比较
        return super.equals(obj);
    }

}
