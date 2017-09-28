/*
 * 读取文件并复制
 * */
import java.io.*;

class IODemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		FileReader fr = null;
		FileWriter fw = null;

		try
		{
		//创建文件读取流
		fr = new FileReader("InetAddressDemo.java");

		//创建文件写入流
		fw = new FileWriter("/home/zhshuang/F.java");

		char[] buf = new char[1024];
		int len = 0;
		while((len = fr.read(buf)) != -1)
			fw.write(buf, 0, len);
		}
		catch(Exception e)
		{
			sop(e.toString());
		}
		finally
		{
			if(fr != null)
			{
				try
				{
					fr.close();
				}
				catch(Exception e)
				{
					sop(e.toString());
				}
			}
			if(fw != null)
			{
				try
				{
					fw.close();
				}
				catch(Exception e)
				{
					sop(e.toString());
				}
			}
			
		}
		
	}
}
