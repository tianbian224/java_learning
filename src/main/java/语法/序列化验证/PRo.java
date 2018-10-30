package 语法.序列化验证;

import java.io.*;

public class PRo
{

    public static void main(String[] args) throws Exception
    {
//        StoreObject();
        StoreSubObject();
        // LoadObject();

    }

    /*
     * @author LvCang 对象当持久化，就是根据一个类产生了一个对象，，然后将这个对象存储到硬盘当
     * 中去之后再将这个对象读取出来，调用这个对象中的方法。
     * 对象的持久化原理：编译的时候，类中的成员都有一个数字标签，根据这些标签产生一个UID，然后将这个UID写入到对象
     * 中去，在读取这个对象的啥时候根据这个UID是否相同来判断这个类是否属于这个类。
     * 另外，被序列化的对象必须实现一个接口Serilizable。这个接口是一个标记接口，需要被
     * 实现的对象必须实现这个接口才能被序列化，尽管这个接口什么方法都没有。 如果自己指定
     * 这个UID，那么就算类发生了改变，编译器还是认为这个对象属于这个类。可序列化类可以通 过声明名为 "serialVersionUID"
     * 的字段（该字段必须是静态 (static)、最终 (final) 的 long 型字段）显式声明其自己的 serialVersionUID：
     *
     * @throws Exception
     */
    public static void StoreObject() throws Exception
    {
        UsedToSerialize usedToSerialize = new UsedToSerialize("吕仓", 23);
        usedToSerialize.dep = "自动化系";
        System.out.println(usedToSerialize.dep);
        FileOutputStream out = new FileOutputStream("Object.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
        objectOutputStream.writeObject(usedToSerialize);
        objectOutputStream.close();
        out.close();
        System.out.println("序列化完毕！");
        Object onew = new Object();

    }

    public static void LoadObject() throws IOException, Exception
    {
        FileInputStream fileInputStream = new FileInputStream("Object.obj");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        UsedToSerialize uu = (UsedToSerialize) objectInputStream.readObject();
        fileInputStream.close();
        objectInputStream.close();
        System.out.println(uu);
        uu.setName("吕昌");
        System.out.println(uu);
    }


    // 子类没有实现serialize也可以被序列化，因为父类实现了serizile接口
    public static void StoreSubObject() throws Exception
    {
        SubSerilize sub = new SubSerilize("吕仓", 23);
        SubSerilize.dep = "自动化系";
        sub.data="vdfvdvdv";
        System.out.println(sub.dep);
        FileOutputStream out = new FileOutputStream("subObject.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
        objectOutputStream.writeObject(sub);
        objectOutputStream.close();
        out.close();
        System.out.println("序列化完毕！");

    }

}
