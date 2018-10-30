package 语法.ClassForName加载类;

import java.io.FileReader;
import java.util.Properties;

public class GetClass
{
	private static Properties properties;

	public static ChaZuo getDianqi()
	{
		properties = new Properties();
		try
		{
			FileReader e = new FileReader("E:\\CodeLib\\JavaWorkSpace\\JavaBeging\\src\\语法\\ClassForName加载类\\shuxin.txt");
			properties.load(e);
			String lei = properties.getProperty("lei");
			e.close();
			ChaZuo chaZuo = (ChaZuo) Class.forName(lei).newInstance();
			return chaZuo;
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
