/*
 * 复习今天学习的类
 * Runtime   java.lang
 * Date      java.util
 * SimpleDateFormat java.text
 * System    java.lang
 * */
import java.util.*;
import java.text.*;

class Demo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		/*
		//Runtime
		Runtime r = Runtime.getRuntime();
		Process p = r.exec("path");//开始一个进程
		p.destroy();//杀死进程
		*/


		//System
		//系统属性
		Properties prop = System.getProperties();//没有定义泛型，其中都是String类
		for(Object key: prop.keySet())
		{
			sop(key+"---"+prop.get(key));
		}
		sop("----------------------------------------------------");
		for(Map.Entry<Object, Object> me : prop.entrySet())
		{
			sop(me.getKey()+"--------"+me.getValue());
		}
		sop("-----------------------------------------------------");
		for(String key : prop.stringPropertyNames())
		{
			sop(key+"::::"+prop.get(key));
		}

		//自定义属性
		System.setProperty("hhhhhhhhhh", "gggggggggggggggg");
		sop(System.getProperty("hhhhhhhhhh"));
		sop(System.getProperty("kkk"));

		//Date
		Date d = new Date();//创建日期
		//自定义格式化模式
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd----hh:mm:ss");
		//对日期进行格式化
		String time = sdf.format(d);
		sop("time = "+time);
	}
}
