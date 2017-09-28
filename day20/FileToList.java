/*
 * 需求：现有保存了配置信息，即键值对的文本文件，想将其内容存到集合中
 * 思路：
 * 1）创建字符读取流缓冲区对象，和配置信息文件关联
 * 2）读取文本行，用“=”作为分隔符。取出键、值，存到集合中
 * */
import java.io.*;
import java.util.*;

class FileToList
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void fileToList(File f, Properties prop)
	{
		//源：BufferedReader
		BufferedReader bufr = null;
		try
		{
			bufr = new BufferedReader(new FileReader(f));

			//遍历文件内容
			String line = null;
			while((line = bufr.readLine()) != null)
			{
				//将=分割字符串line
				String[] str = line.split("=");
				//取出key和value
				String key = str[0];
				String value = str[1];
				prop.put(key, value);
			}
		}
		catch(IOException e)
		{
			throw new RuntimeException("读取异常");
		}
		finally
		{
			if(bufr != null)
			{
				try
				{
					bufr.close();
				}
				catch(IOException e)
				{
					throw new RuntimeException("关闭资源异常");
				}
			}
		}
	}

	public static void main(String[] args)throws IOException
	{
		//读取键盘录入，存到指定文件中
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		//创建字符写入流缓冲区，将键盘内容存到指定文件中
		File dest = new File("prop.txt");
		BufferedWriter bufw = new BufferedWriter(new FileWriter(dest));

		String line = null;
		while((line = bufr.readLine()) != null)
		{
			if("over".equals(line))
				break;

			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}

		//创建集合，存储配置信息
		Properties prop = new Properties();
		fileToList(dest, prop);
	
		//使用Properties的list方法，将prop集合中的键值对信息列出来
		prop.list(System.out);

		//关闭资源
		bufr.close();
		bufw.close();
	}
}
