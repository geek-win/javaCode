/*
 * 配置信息存到配置文件中
 * 每次执行程序的时候，配置信息中的time值+1.当>=5的时候就退出，提醒用户不能再使用
 * 配置信息是键值对，Map集合
 * 配置信息存在配置文件中，读取的时候要使用IO流，IO技术
 * 所以Map集合和IO技术结合就是Properties
 * */
import java.io.*;
import java.util.*;

class RunCount
{
	//假设某应用程序
	public static void runCode()throws IOException
	{
		//创建File对象，和配置文件相关联
		File f = new File("prop.ini");
		//判断是否存在，如果不存在需要创建
		if(!f.exists())
			f.createNewFile();

		//创建配置文件读取流对象
		FileReader fr = new FileReader(f);

		Properties prop = new Properties();
		//将配置文件信息读到prop集合中
		prop.load(fr);

		//取出time键对应的值
		int count = 0;
		String value = prop.getProperty("time");
		if(value != null)
		{
			count = Integer.parseInt(value);
			if(count >= 5)
			{
				System.out.println("免费试用结束");
				return;
			}
		}
		count++;

		//将次数写到prop集合
		prop.setProperty("time", count+"");
		//将prop集合写到配置文件中
		FileWriter fw = new FileWriter(f);
		prop.store(fw, "");

		fr.close();
		fw.close();
	}

	public static void main(String[] args)throws IOException
	{
		runCode();
	}
}
