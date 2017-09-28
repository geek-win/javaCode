/*
 * 复制
 * 将源文本文件复制到新的文本文件
 * 使用read(char[] ch)进行长字符串读取
 * */
import java.io.*;

class CopyDemo1
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void copyTxt()
	{
		//创建文件写入流，作为目的文件
		FileWriter fw = null;

		//创建文件写入流
		FileReader fr = null;

		try
		{
			fw = new FileWriter("/home/zhshuang/C.java");
			fr = new FileReader("CopyDemo.java");

			int len = 0;
			char[] buf = new char[1024];

			while((len = fr.read(buf)) != -1)
				fw.write(buf, 0, len);
		}
		catch(IOException e)
		{
			throw new RuntimeException("读写异常");
		}
		finally
		{
			/*
			//先判断是否是空然后关闭流
				try
				{
					if(fw != null)
						fw.close();
				}
				catch(IOException e)
				{
					throw new RuntimeException("关闭资源异常");
				}
				finally
				{
					if(fr != null)
					{
						try
						{
							fr.close();
						}
						catch(IOException e)
						{
							throw new RuntimeException("关闭资源异常");
					
						}

					}
				}
			
			}
			*/
			//两个流必须都关闭
			//所以必须单独判断处理
			//不可以将两个close方法放到一个try中
			if(fw != null)
			{
				try
				{
					fw.close();
				}
				catch(IOException e)
				{
					throw new RuntimeException("关闭资源异常");
				}
			}
			if(fr != null)
			{
				try
				{
					fr.close();
				}
				catch(IOException e)
				{
					throw new RuntimeException("关闭资源异常");
				}
			}
		}
	}

	public static void main(String[] args)
	{
		copyTxt();

	}
}
