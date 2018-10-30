package 语法.java数据结构;

import java.util.*;

public class IteratorDemo
{

    public static void main(String[] args)
    {
        ///iteratorTest();
        baseFunction();

    }

    // 练习使用迭代器
    private static void iteratorTest()
    {
        ArrayList arrayList = new ArrayList();
        arrayList.add(4);
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(5);
        Iterator<Integer> iterator = arrayList.iterator();
        while (iterator.hasNext())
        {
            int a = (int) iterator.next();// 传递的是值，不是引用
            // a = 12;// 又指向了新的 值，集合中的没变
            // iterator.remove();// 迭代块内可以使用这个方法删除，不使用这个 方法改变元素引起异常
            arrayList.remove(a);
        }
        System.out.println(arrayList);
    }

    // ArrayList基本方法的使用
    public static void baseFunction()
    {
        ArrayList arrayList = new ArrayList();
        arrayList.add(12); // 添加元素
        arrayList.addAll(Arrays.asList(1, 2, 3, 4));// 将集合元素逐个 添加到list
        for (int i = 0; i < arrayList.size(); i++)
        {
            System.out.println(arrayList.get(i));
        }
    }


    // 复习使用hashmap遍历
    public static void testHashmap()
    {
        //1. entry
        HashMap<String, String> hashMap = new HashMap();
        hashMap.put("a","A");
        for (Map.Entry i : hashMap.entrySet())
            System.out.println(i.getKey() + "" + i.getValue());

        //2. iterator
        Map map = new HashMap();
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext())
        {
            String object = (String) iterator.next();
        }

        //3. foreach
        for (String s : hashMap.keySet())
            System.out.println(s);


    }
}
