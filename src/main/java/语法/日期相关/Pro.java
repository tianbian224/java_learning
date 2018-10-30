package 语法.日期相关;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Pro
{

	public static void main(String[] args) throws Exception
	{
		DateFunction(new Date());
		System.out.println("====================");
		Calanderfuncation();
		System.out.println("====================");
		DateformatFunction();
	}

	// Date的相关方法，基本上已经都过时
	public static void DateFunction(Date date)
	{
		System.out.println("年" + (date.getYear() + 1900));// 年
		System.out.println("月" + (date.getMonth() + 1));// 月
		System.out.println("日" + date.getDate());// 日
		System.out.println("星期" + date.getDay());// 星期几
		System.out.println("时" + date.getHours());
		System.out.println("分" + date.getMinutes());
		System.out.println("秒" + date.getSeconds());
		System.out.println("long类型毫秒" + date.getTime());
		System.out.println(System.currentTimeMillis());
	}

	// Calenger类的使用
	public static void Calanderfuncation()
	{
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(calendar.YEAR));// 获取年
		System.out.println(calendar.get(calendar.MONTH) + 1);// 月
		System.out.println(calendar.get(calendar.DAY_OF_MONTH));// 日
		System.out.println(calendar.get(calendar.HOUR_OF_DAY));// 时
		System.out.println(calendar.get(calendar.MINUTE));// 分
		System.out.println(calendar.get(calendar.SECOND));// 秒
	}

	// Dateformat类的使用
	public static void DateformatFunction() throws ParseException
	{
		DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH-mm-ss");
		System.out.println(dateFormat.format(new Date()));// 将日期格式化为固定形式
		DateFormat dateFormat2 = new SimpleDateFormat("yy年MM月dd日");
		Date date = dateFormat2.parse("2016年12月12日");
		DateFunction(date);
	}

}
