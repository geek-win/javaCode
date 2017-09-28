import java.util.*;
import java.text.*;

class DateDemo
{
	public static void main(String[] args)
	{
		//获取日期对象
		Date d = new Date();

		//自定义日期格式化模式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd--HH:mm:ss");

		//使用格式化模式格式化日期对象
		String time = sdf.format(d);

		System.out.println(time);

		//Calendar
		Calendar c = Calendar.getInstance();
		System.out.println(c);

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day1 = c.get(Calendar.DAY_OF_MONTH);
		int day2 = c.get(Calendar.DAY_OF_WEEK);

		System.out.println(year+"年"+(month+1)+"月"+day1+"日星期"+day2);

		//设置3.1号
		c.set(2019, 2, 1, 10, 34, 23);//设置成2019/3/1
		System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
		c.add(Calendar.DAY_OF_MONTH, -1);//日期向前推一天
		System.out.println("2019年2月多少天："+c.get(Calendar.DAY_OF_MONTH));
	}

}
