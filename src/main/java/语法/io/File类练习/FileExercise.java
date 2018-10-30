package 语法.io.File类练习;

import java.io.File;
import java.io.IOException;

public class FileExercise
{

	public static void main(String[] args) throws IOException
	{
		//Exercise1();
		//Exercise2();
		//Exercise3();
		//Exercise4(new File("E:\\"));//列出所有文件
		Exercise5(new File("e:\\"));//列全部java文件
	}
	/*
	 * File类的创建与构造函数
	 * 建立文件、文件夹、多层文件夹
	 * */
	public static void Exercise1() throws IOException
	{
		//构造函数1：直接把文件的全路径写进去
		File ff1=new File("E:\\JavaHomeWork\\JavaExerciseAndReview\\FileClassExercise\\构造函数是路径和文件一起.txt");
		File ff2=new File("E:\\JavaHomeWork\\JavaExerciseAndReview\\FileClassExercise","构造函数是路径和文件分开.txt");
		File ff3=new File(new File("E:\\JavaHomeWork\\JavaExerciseAndReview\\FileClassExercise"),"构造函数是File和文件分开.txt");
		File ff4=new File("E:\\JavaHomeWork\\JavaExerciseAndReview\\FileClassExercise\\被建立的一层文件夹");//默认是建立文件，mkDir才是建立文件夹
		File ff5=new File("E:\\JavaHomeWork\\JavaExerciseAndReview\\FileClassExercise\\被建立的多层文件夹\\二级文件夹\\三级文件夹");//只能建立一层文件夹，mkDirs才是建立多层文件夹
		System.out.println("文件路径的分隔符:"+File.separator);//输出文件路径的分隔符
		System.out.println("下面开始创建文件和文件夹===========1");
		ff1.createNewFile();
		ff2.createNewFile();
		ff3.createNewFile();
		ff4.mkdir();//建立一层文件夹
		ff5.mkdirs();//建立多层文件夹
	}
	
	/*
	 * File对象的基本的方法
	 * 判断、删除
	 * */
	public static void Exercise2() throws IOException
	{
		File ff1=new File("E:\\JavaHomeWork\\JavaExerciseAndReview\\FileClassExercise","不可执行文件.txt");
		File ff2=new File("E:\\JavaHomeWork\\JavaExerciseAndReview\\FileClassExercise","可执行文件.java");
		//ff1.createNewFile();
		//ff1.mkdirs();
		ff2.createNewFile();
		System.out.println("下面开始只用判断相关的方法==========2");
		System.out.println("ff1(答案为否)是否可以执行："+ff1.canExecute());//没有创建，不可执行。存在且可以执行时是true
		System.out.println("ff2(答案为是)是否可以执行："+ff2.canExecute());
		
		System.out.println("判断是否可读写=");
		System.out.println(ff2.canRead());//判断是否可读
		System.out.println(ff2.canWrite());//判断是否可写
		
		System.out.println("判断是否存在==");
		System.out.println(ff2.exists());//判断是否存在
		System.out.println(ff1.exists());
		
		System.out.println("判断file还是directory==");
		System.out.println(ff1.isDirectory());
		System.out.println(ff2.isFile());
		
		System.out.println("判断是否隐藏===");
		System.out.println(ff2.isHidden());
		
		System.out.println("判断是否位绝对路径====");
		System.out.println(ff2.isAbsolute());
		
		System.out.println("删除");
		System.out.println(ff2.delete());
		
		System.out.println("程序退出时就删除");
		ff2.deleteOnExit();//return void
	}
	
	/*
	 * File对象的基本的方法
	 * 获取信息
	 * */
	public static void Exercise3() throws IOException
	{
		File ff1=new File("E:\\代码库\\JavaWorkSpace\\JavaExerciseAndReview"
				+ "\\FileClassExercise","获取信息.txt");
		File ff2=new File("E:\\代码库\\JavaWorkSpace\\JavaExerciseAndReview"
				+ "\\FileClassExercise获取信息文件夹");
		ff1.createNewFile();
		ff2.mkdirs();
		System.out.println(ff2.getPath());//显示相对路径，如果封装的就是绝对的，那就没什么卵用
		System.out.println(ff1.getAbsolutePath());//显示绝对路径
		System.out.println(ff1.getParent());//返回绝对路径下的文件父目录
		System.out.println(ff1.lastModified());//上次修改时间
	}
	
	/*
	 * 写一个程序，要求流出某一个目录下的全部问价和文件夹
	 * */
	public static void Exercise4(File ff) throws IOException
	{
		//ff.createNewFile();
		File[] ffFiles=ff.listFiles();//注意偶可能是空文件夹，
									//那么ffFilees就是null,无法比较大小
		if(ffFiles!=null)
		{
			for(int i=0;i<ffFiles.length;i++)
			{
				if(ffFiles[i].isDirectory())
				{
					Exercise4(ffFiles[i]);
				}
				else
				{
					System.out.println(ffFiles[i]);
				}
			}
		}
	}
	
	/*
	 * 列出所有指定目录下的指定文件
	 * 
	 **/
	public static void Exercise5(File ff) throws IOException
	{
		//ff.createNewFile();
		File[] ffFiles=ff.listFiles();//注意偶可能是空文件夹，
									//那么ffFilees就是null,无法比较大小
		if(ffFiles!=null)
		{
			for(int i=0;i<ffFiles.length;i++)
			{
				if(ffFiles[i].isDirectory())
				{
					Exercise5(ffFiles[i]);
				}
				else
				{
					if(ffFiles[i].toString().endsWith("java"))
						System.out.println(ffFiles[i]);
				}
			}
		}
	}
}
