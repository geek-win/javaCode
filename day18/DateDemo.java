/*
 * Date类
 * 很多过时的方法
 * 在java.util.*包中
 * */
import java.util.*;
import static java.lang.System.*;
import java.text.*;

class DateDemo
{
	public static void main(String[] args)
	{
		//创建日期
		Date d = new Date();

		System.out.println(d);
		out.println(d.toString());

		//创建格式化模式
		//SimpleDateFormat是java.text包中的
		//文本包
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd  hh:mm:ss");
		//用格式化模式去格式化日期
		String time = sdf.format(d);

		out.println(time);
	}
}

