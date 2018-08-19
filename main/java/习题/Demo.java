package 习题;

//import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class Demo extends Super
{
	public int j;
	public  Demo(String a)
	{
		System.out.println("C");
		i=5;
		j=5;
	}
	public static  void main(String[] aStrings)
	{
		int i=4;
		int j=4;
		Super dSuper=new Demo("");
		System.out.println(dSuper.i);//因为没有被子类覆盖，所以是正常的多态，调用子类的i
		System.out.println(dSuper.j);//因为被子类覆盖，执行父类的j.这种情况很少出现，
									 //子类很少再次覆盖父类的成员变量
	}
}
