package 语法.io.FileOutputstream练习;

import java.io.*;
import java.util.Vector;

public class Pro
{

	public static void main(String[] args) throws Exception
	{
		CopyFile2();
		Exercise();
		//Exercise3();//���л�����д�뵽�ļ�����
		Exercise33();//��ȡ�ļ��еı����л����ļ����γɶ���
	}
	
	public static void CopyFile1() throws IOException
	{
		FileInputStream fi=new FileInputStream("aa.jpg");
		FileOutputStream fo=new FileOutputStream("aa_copy.jpg");
		int num=0;
		byte[] buffer=new byte[1024];
		while ((num=fi.read(buffer))!=-1)
		{
			fo.write(buffer,0,num);
		}
		fi.close();
		fo.close();
		System.out.println("�������");
	}
	
	public static void CopyFile2() throws IOException
	{
		BufferedInputStream bis=new BufferedInputStream(new FileInputStream("music.flac"));
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("music_copy.flac"));
		int num=0;
		byte[] buffer=new byte[1024];//��������Ҫ������FileInputStream�ĵط�
		while((num=bis.read(buffer))!=-1)
		{
			bos.write(buffer,0,num);
		}
		bis.close();
		bos.close();
		System.out.println("�������");
	}
	/**
	 ����������printStreamd���ŵ㣬�����ǿ��Դ�ӡ��������
	 * @throws Exception 
	 */
	public static void Exercise() throws Exception
	{
		FileOutputStream foFileOutputStream=new FileOutputStream("cc.txt");
		PrintStream printStream=new PrintStream("cc2.txt");
		foFileOutputStream.write("ֻ����byte".getBytes());
		printStream.print(new Double(3.6656));//���Դ�ӡ������������S
		foFileOutputStream.close();
		printStream.close();
	}
	/*
	 * �������sequenceInputStream��ʹ�÷���
	 * **/
	public static void Exercise2() throws IOException
	{
		Vector<InputStream> arrayList=new Vector<InputStream>();
		arrayList.add(new FileInputStream("aa.txt"));
		arrayList.add(new FileInputStream("ii.txt"));
		arrayList.add(new FileInputStream("oo.txt"));
		//SequenceInputStream sequenceInputStream=new SequenceInputStream(arrayList);
	}
	/*
	 * ����������������л�һ������*/
	public static void Exercise3() throws IOException
	{
		ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("obj.txt"));
		objectOutputStream.writeObject(new Person());
		objectOutputStream.flush();
		objectOutputStream.close();
		System.out.println("����д�����");
	}
	/*
	 * �����ȡ��������л��Ķ���
	 * */
	public static void Exercise33() throws Exception
	{
		ObjectInputStream objectInputStream=new ObjectInputStream(new FileInputStream("obj.txt"));
		Person person=(Person)objectInputStream.readObject();
		person.Run();
	}
}
