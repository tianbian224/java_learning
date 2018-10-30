package 语法.Java基础类库;
// 2018年3月27日09:50:14  复习

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomDemo
{

    public static void main(String[] args)
    {
        // random线程安全，使用了大量的CAS，性能慢
        Random random = new Random(123456);// 种子一样，那么产生 随机数就一样
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(100));// 指定范围的随机数[0,bound)

        Random r3 = new Random(123456);
        System.out.println(r3.nextInt());


        // ThreadLocalRandom性能很快
        ThreadLocalRandom r2 = ThreadLocalRandom.current();
        System.out.println(r2.nextInt());
    }

}
