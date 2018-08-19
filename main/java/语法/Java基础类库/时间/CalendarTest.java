package 语法.Java基础类库.时间;//  Lvcang created at  2018-05-12 15:56,have fun~


import java.util.Calendar;
import java.util.GregorianCalendar;

// 学会使用日历
public class CalendarTest
{
    public static void main(String[] args)
    {
        GregorianCalendar c = new GregorianCalendar(); //创建公历时间
        System.out.println(c.getTime());

        GregorianCalendar c2=new GregorianCalendar(1989,9,25);// 从0开始数月份
        System.out.println(c2.getTime());

        GregorianCalendar c3=new GregorianCalendar(2018, Calendar.MAY,12);// 从0开始数月份
        System.out.println(c3.getTime());

        // 时分秒
        GregorianCalendar c4=new GregorianCalendar(1989,9,25,12,12,45);// 从0开始数月份
        System.out.println(c4.getTime());


        // 获取时间
        int yue= c3.get(Calendar.MONTH);
        int week=c3.get(Calendar.DAY_OF_WEEK);// 星期
        System.out.println(c3.getFirstDayOfWeek()+"  ===   "+Calendar.SUNDAY);// 星期日是第一天
        System.out.println(yue+"月，星期"+week);

        // 设置时间
        c4.set(Calendar.MONTH,1);
        System.out.println(c4.getTime());


    }
}
