package 语法.Java基础类库;

public class RuntimeDemo
{

	public static void main(String[] args) throws Exception
	{
		// 访问运行Windows程序
		Runtime runtime = Runtime.getRuntime();
		int a = runtime.availableProcessors();// 处理器数量
		long b = runtime.freeMemory();// 空闲内存
		long c = runtime.totalMemory();// 总内存
		long d = runtime.maxMemory();
		System.out.println(a);
		System.out.println(b / 1024 / 1024);
		System.out.println(d / 1024 / 1024);
		// runtime.exec("mspaint");
	}

}
