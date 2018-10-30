package 语法.java数据结构.Map体系;//  Lvcang created at  2018-03-27 14:02,have fun~

import java.util.*;

/**
 * java 中的数据结构分为Collection和Map.
 */
public class TestMap
{
    public static void main(String[] args)
    {
        //==================================测试有序性==========================
        testTreeMap("aaa,ccc,bbb,fff,eee".split(","));
        testHashMap("aaa,ccc,bbb,fff,eee".split(","));
        testLinkedHashMap("aaa,ccc,bbb,fff,eee".split(","));

        //==================================测试使用treemap=====================
        useTreemap(new int[]{5, 3, 2, 4, 1});
    }

    /**
     * 测试使用treeMap
     * 底层是红黑树，可以对键值的键进行排序
     * @param keys
     */
    public static void testTreeMap(String... keys)
    {
        TreeMap<String, Integer> treeMap = new TreeMap();
        for (String key : keys)
            treeMap.put(key, key.length()); // 存入数据
        // 读取数据
        for (String key : treeMap.keySet())
            System.out.println(key + "-----treemap---->" + treeMap.get(key));// 有序输出
    }

    public static void testHashMap(String[] keys)
    {
        HashMap<String, Integer> hashMap = new HashMap();
        for (String key : keys)
            hashMap.put(key, key.length()); // 存入数据
        // 读取数据
        for (String key : hashMap.keySet())
            System.out.println(key + "------hashmap----->" + hashMap.get(key));// 乱序输出
    }

    public static void testLinkedHashMap(String[] keys)
    {
        LinkedHashMap<String, Integer> hashMap = new LinkedHashMap();
        for (String key : keys)
            hashMap.put(key, key.length()); // 存入数据
        // 读取数据
        for (String key : hashMap.keySet())
            System.out.println(key + "------linkedhashmap----->" + hashMap.get(key));// 插入顺序输出

    }

    // 使用treemap
    public static void useTreemap(int[] keys)
    {
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>  (new Comparator<Integer>()
        {
             public int compare(Integer o1, Integer o2)
            {
                return o2 - o1;
            }
        });// 倒序排列
        //TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer> ();// 顺序排列
        for (Integer key : keys)
            treeMap.put(key, key + 100); // 存入数据
        for (Integer key : treeMap.keySet())
            System.out.println(key + "-----treemap---->" + treeMap.get(key));// 有序输出

        for (Map.Entry<Integer,Integer> entry:treeMap.entrySet())
            System.out.println(entry.getKey() + "-----treemap---->" + entry.getValue());// 有序输出

    }
}
