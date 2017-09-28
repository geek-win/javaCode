/*
 * 练习
 * 1、获取任意年的二月多少天
 * 根据指定年设置时间
 * c.set(year, 2, 1)//设置某年的3.1日
 * c.add(Calendar.DAY_OF_MONTH, -1);
 * c.get(Calendar.DAY_OF_MONTH);
 * 2、获取昨天的现在这个时刻
 * c.add(Calendar.DAY_OF_MONTH, -1);
 * 就是昨天的这个时刻
 * 3、获取有效上课时间
 * 是周末时天数就不自增。就是判断DAY_OF_WEEK.是周末就不累计天数否就累计天数
 * */
import java.util.*;
import static java.util.Calendar.*;

class CalTest
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		//获取当前日期
		Calendar c = Calendar.getInstance();

		sop("当前时间是：");
		printCal(c);

		sop("2019的2月有："+dayOfFeb(2019)+"天");

		c.add(DAY_OF_MONTH, -1);
		sop("昨天的这个时刻为：");
		printCal(c)	;
	}

	public static int dayOfFeb(int year)
	{

		//获取任意年的二月份的天数
		//思路
		//可以将日期设置为3月1号
		//然后日期-1就是二月的最后一天
		//然后获取这个日期值
		//就是这一年的二月的天数
		Calendar c = Calendar.getInstance();

		c.set(year, 2, 1);
		c.add(DAY_OF_MONTH, -1);

		return c.get(DAY_OF_MONTH);
		
	}

	public static void printCal(Calendar c)
	{
		//定义月
		String[] mons = {
			"一月", "二月", "三月", "四月",
			"五月", "六月", "七月", "八月",
			"九月", "十月", "十一月", "十二月"
		};
		//定义星期
		String[] weeks = {
			"", "星期日", "星期一", "星期二", "星期三", "星期四",
			"星期五", "星期六"
		};

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int day1 = c.get(Calendar.DAY_OF_WEEK);

		sop(year+"年"+mons[month]+day+"号"+weeks[day1]+"--"+c.get(HOUR)+":"+c.get(MINUTE)+":"+c.get(SECOND));
	}
}

