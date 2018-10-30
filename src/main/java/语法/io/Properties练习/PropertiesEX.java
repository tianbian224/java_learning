package 语法.io.Properties练习;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEX
{

	public static void main(String[] args) throws IOException
	{
		// Exercise1();//����ʹ�÷���
		// Exercise2();//���������ļ�
		// Exercise3();//�޸������ļ�
		Exercise4();// ���ʹ�ô�������
		// Exercise5();//��ȡϵͳ��Ϣ
	}

	/*
	 * �򵥵��趨�Ͷ�ȡproperties
	 */
	public static void Exercise1()
	{
		Properties pp = new Properties();
		pp.setProperty("color", "red");
		pp.setProperty("height", "12");
		String value = pp.getProperty("color");
		System.out.println(pp);
		System.out.println(value);
	}

	/*
	 * ���ļ���������properties load()����
	 */
	public static void Exercise2() throws IOException
	{
		FileInputStream fi = new FileInputStream("properties.ini");
		Properties pp = new Properties();
		pp.load(fi);
		fi.close();
		System.out.println(pp);
	}

	/*
	 * ���ڴ��е�propertiesд�뵽�ļ���
	 */
	public static void Exercise3() throws IOException
	{
		Properties pp = new Properties();
		FileOutputStream fo = new FileOutputStream("properties.ini");
		pp.setProperty("color", "Yellow");
		pp.store(fo, "ע��");
		Exercise2();// ���ļ���������û�гɹ�
		fo.close();
	}

	/*
	 * дһ��С����Ҫ�����ֻ������3�μ����£�
	 * ��������ʱ��������ʾ�û����ô����ѵ�������������
	 */
	public static void Exercise4() throws IOException
	{
		FileInputStream fi = new FileInputStream("cishu.ini");
		Properties pp = new Properties();
		pp.load(fi);
		System.out.println(pp);
		int cishu = Integer.parseInt(pp.getProperty("num"));
		if (cishu <= 3)
		{
			FileOutputStream fo = new FileOutputStream("cishu.ini");
			pp.setProperty("num", ++cishu + "");
			pp.store(fo, cishu + "times");
			System.out.println("���������ȷ����,�Ѿ�ʹ����" + cishu + "��");
			fo.close();
		} else
		{
			System.out.println("���ʹ�ô����ѵ����븶�Ѻ�ʹ��");
		}
		fi.close();
	}

	/*
	 * ��ϰʹ��system.getPropeties(),���ϵͳ��Ϣ
	 */
	public static void Exercise5() throws IOException
	{
		Properties pp = System.getProperties();
		FileOutputStream fOutputStream = new FileOutputStream("ϵͳ��Ϣ.txt");
		pp.store(fOutputStream, "");
		System.out.println("ϵͳ��Ϣ��ӡ���");
	}

}
