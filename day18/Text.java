/*
 * 练习复制文件功能
 * */
import java.io.*;

class Text
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		//创建文件写入流，目的文件
		FileWriter fw1 = null;
		FileWriter fw2 = null;

		//创建文件读取流，源文件
		FileReader fr = null;

		//定义fw和fr关联文件
		//并读取fr关联文件的字符内容
		//存入fw关联的文件中
		try
		{
			fw1 = new FileWriter("/home/zhshuang/D.java");
			fw2 = new FileWriter("/home/zhshuang/E.java");
			fr = new FileReader("/home/zhshuang/A.java");

			//逐个字符读取存入目的文件
			int num = 0;
			while((num = fr.read()) != -1)
				fw1.write(num);
			/*
			//因为上述语句已经将fr关联文件读取完了
			//所以下述语句不会将源文件内容存入目的文件
			//按照字符串读取存入目的文件
			int len = 0;
			char[] buf = new char[1024];

			while((len = fr.read(buf)) != -1)
				fw2.write(buf, 0, len);
				*/
		}
		catch(IOException e)
		{
			throw new RuntimeException("存取异常");
		}
		finally
		{
			try
			{
				if(fr != null)
					fr.close();
			}
			catch(IOException e)
			{
				throw new RuntimeException("关闭资源异常");
			}
			finally
			{
				try
				{
					if(fw1 != null)
						fw1.close();
				}
				catch(IOException e)
				{
					throw new RuntimeException("关闭资源异常");
				}
				finally
				{
					try
					{
						if(fw2 != null)
							fw2.close();
					}
					catch(IOException e)
					{
						throw new RuntimeException("关闭资源异常");
					}
				}
			}
		}
	}
}
