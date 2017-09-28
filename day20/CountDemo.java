/*
 * 创建配置文件，用于记录软件被使用的次数
 * 配置文件中是键值对信息，有计数变量，其值随着使用而增加
 * 键值对数据是map集合，数据以文件形式存储，使用io技术
 * 所以io+map就是Properties
 * */
import java.io.*;
import java.util.*;

class CountDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void runCount()throws IOException
	{
		Properties prop = new Properties();


		//操作文件之前先封装成对象
		File f = new File("count.ini");
		if(!f.exists())
			f.createNewFile();
		//文件读取流
		//扩展名就是集合名
		//配置文件Properties或者是XML
//		FileInputStream fis = new FileInputStream("count.properties");

		FileInputStream fis = new FileInputStream(f);
		//将fis中的信息读到prop集合中
		prop.load(fis);
		//获取次数
		String value = prop.getProperty("time");

		int count = 0;
		if(value != null)
		{
			count = Integer.parseInt(value);

			if(count >= 5)
			{
				sop("Please sign in");
				return;
			}
		}
		count++;

		prop.setProperty("time", count+"");
		FileOutputStream fos = new FileOutputStream(f);
		prop.store(fos, "hhhh");

		/*
		if(count == null)
		{
			prop.setProperty("time", "1");
			prop.store(new FileOutputStream(f), "");
		}
		else
		{
	
			//如果count存在，说明是有值
			int num = Integer.parseInt(count);
			if(num >= 5)
				sop("Please sign in");
			num++;
			prop.setProperty("time", num+"");
			prop.store(new FileOutputStream(f), "");
		}
		*/
	}

	public static void main(String[] args)throws IOException
	{
		runCount();
	}
}
