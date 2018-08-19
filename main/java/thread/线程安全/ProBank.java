package thread.线程安全;

public class ProBank
{

	public static void main(String[] args)
	{
		Person p1=new Person();
		new Thread(p1).start();;
		new Thread(p1).start();;
		new Thread(p1).start();;
		
		

	}
	
	
}
