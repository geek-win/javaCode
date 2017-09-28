/*
 * System类的用法
 * getProperties
 * out
 * in
 * */
import java.util.*;

class SystemDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		//getProperties方法
		//返回Properties类对象
		//该类对象是Map集合下的
		//是HashTable的子类
		//该集合中存储的都是字符串，没有泛型定义
		System.setProperty("mykey", "myvalue");
		Properties prop = System.getProperties();

		for(Object obj: prop.keySet())
		{
			String value = (String)prop.get(obj);

			sop(obj+"---"+value);
		}

		sop(System.getProperty("os.name"));
		sop(System.getProperty("mykey"));

	}
}
