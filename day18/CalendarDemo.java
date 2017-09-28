/*
 * Calendar类
 * 也是单例设计模式
 * */
import java.util.*;
import static java.util.Calendar.*;

class CalendarDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		/*
		Calendar c = Calendar.getInstance();

		sop(c);
		//c就相当于Map集合
		//需要对YEAR进行标注
		sop(c.get(Calendar.YEAR)+"年"+c.get(Calendar.MONTH)+"月"+c.get(Calendar.DAY_OF_MONTH)+"日");
		//这样打印没问题就是有点麻烦
		//所以可以直接把Calendar进行静态导入
		//我们可以使用查表法
		sop(c.get(YEAR)+"年"+c.get(MONTH)+"月"+c.get(DAY_OF_MONTH)+"日");
*/
		//自定义月份字符串数组
		String[] mons = {
			"Jan", "Feb", "Mars", "April", 
			"May", "June", "July", "Aug", 
			"Sept", "Oct", "Nev", "Dec"
		};

		//自定义周数组
		String[] weeks = {
		"", "星期日", "星期一", "星期二", "星期三", "星期四",
			"星期五", "星期六"
		};

		/*
		int index_month = c.get(MONTH);
		int index_day = c.get(DAY_OF_WEEK);

		sop("月："+mons[index_month]);
		sop("日："+weeks[index_day]);
		*/
		Calendar c1 = Calendar.getInstance();
		sop(c1);

		//设置日期
		//2019.1.3
		//就是set(2019, 0, 3)
		c1.set(2019, 0, 3);
	
		//将年增加2年
		c1.add(Calendar.YEAR, -2);
		c1.add(Calendar.MONTH, -2);
		c1.add(Calendar.DAY_OF_MONTH, -4);


		
		int year = c1.get(YEAR);
		int month = c1.get(MONTH);
		int day = c1.get(DAY_OF_MONTH);
		int day1 = c1.get(DAY_OF_WEEK);

		sop(year+"年"+mons[month]+day+"日"+weeks[day1]);

	}
}
