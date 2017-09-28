/*
 * System
 * out：标准输出，默认是控制台，屏幕
 * in：标准输入，默认是键盘
 * */
import java.util.*;

class SystemDemo2
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		Properties prop = System.getProperties();

		//因为Properties是HashTable的子类，也就是Map集合的一个子类对象
		//那么可以通过Map集合的方法取出该集合中的元素
		//此时可以输出系统的详细信息
		//不同的操作系统或者机器
		//运行此代码
		//其结果是不相同的
		//系统没有关闭的情况下存在的信息
		for(Object key: prop.keySet())
		{
			String value = (String)prop.get(key);

			sop(key+"----"+value);
		}

		sop("-----------------------------------------------");

		//使用Map集合的entrySet方法获取元素
		for(Map.Entry<Object, Object> me: prop.entrySet())
		{
			sop(me.getKey()+":::"+me.getValue());
		}

		sop("-----------------------------------------------");

		//使用Properties类的方法
		//Set<String> stringPropertyNames
		for(String s: prop.stringPropertyNames())
		{
			sop(s+"~~~~~~~"+prop.get(s));
		}

		sop("os.name::::"+prop.getProperty("os.name"));
		sop("hhhh:"+prop.getProperty("hhhh"));
	}
}
