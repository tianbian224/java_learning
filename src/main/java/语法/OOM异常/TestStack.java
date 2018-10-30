package 语法.OOM异常;

// 测试方法区OOM错误1：栈帧过大
public class TestStack
{
	public long num = 1l;

	// 无限递归，造成占空间不足
	public void diguiForver()
	{
		num++;
		diguiForver();
	}

	// 测试
	public static void main(String[] ds)
	{
		TestStack area = new TestStack();
		area.diguiForver();
	}
}
// 异常信息
/*
 * Exception in thread "main" java.lang.StackOverflowError at
 * OOM异常.TestFunctionArea.diguiForver(TestFunctionArea.java:12) at
 * OOM异常.TestFunctionArea.diguiForver(TestFunctionArea.java:12) at
 * OOM异常.TestFunctionArea.diguiForver(TestFunctionArea.java:12) at
 * OOM异常.TestFunctionArea.diguiForver(TestFunctionArea.java:12) ………………………………
 * ……………………………… ………………………………
 */