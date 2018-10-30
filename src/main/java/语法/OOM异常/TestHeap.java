package 语法.OOM异常;

import java.util.ArrayList;

// 测试堆内存溢出，也就是创建大量的对象
// -Xms10m -Xmx10m -XX:+HeapDumpOnOutOfMemoryError
public class TestHeap
{
	public static void main(String[] d)
	{
		ArrayList<Object> list = new ArrayList<Object>();
		int i = 0;
		while (i < 5000000)
		{
			list.add(new Object());
			i++;
		}
		System.out.println("完成");
	}
}

/** 异常信息 */
/*
 * java.lang.OutOfMemoryError: Java heap space Dumping heap to
 * java_pid14060.hprof ... Heap dump file created [13120561 bytes in 0.040 secs]
 * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space at
 * java.util.Arrays.copyOf(Arrays.java:3210) at
 * java.util.Arrays.copyOf(Arrays.java:3181) at
 * java.util.ArrayList.grow(ArrayList.java:261) at
 * java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:235) at
 * java.util.ArrayList.ensureCapacityInternal(ArrayList.java:227) at
 * java.util.ArrayList.add(ArrayList.java:458) at
 * OOM异常.TestHeap.main(TestHeap.java:15)
 */
