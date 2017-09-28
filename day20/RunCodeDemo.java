import java.io.*;
import java.util.*;

class RunCodeDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void run()throws IOException
	{
		//设置限定值
		int num = 5;

		//创建Properties集合
		Properties prop = new Properties();

		//判断配置文件是否存在
		File f = new File("count.properties");
		if(!f.exists())
			f.createNewFile();

		//创建字符读取流对象
		FileReader fr = new FileReader(f);

		//将配置文件信息加载到Properties集合中
		prop.load(fr);

		//获取计数次数
		int count = 0;
		String value = prop.getProperty("time");
		
		//判断是否是null
		if(value != null)
		{
			count = Integer.parseInt(value);

			//判断是否大于限定次数
			if(count >= num)
			{
				System.out.println("已经达到使用次数上限");
				return;
			}
		}
		count++;

		//修改prop集合中time对应的值
		prop.setProperty("time", count+"");
		//创建字符写入流对象
		FileWriter fw = new FileWriter(f);

		//将prop集合中键值对存到配置文件中
		prop.store(fw, "");

		//关闭资源
		fr.close();
		fw.close();
	}

	public static void main(String[] args)throws IOException
	{
		run();
	}
}
