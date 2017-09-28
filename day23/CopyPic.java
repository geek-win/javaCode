/*
 * 复制图片
 * 使用字节流对象
 * */
import java.io.*;

class CopyPic
{
	public static void main(String[] args)
	{
		copyPic();
	}

	public static void copyPic()//throws IOException
	{
		//创建字节流读取对象和原始图片相关联
		FileInputStream fis = null;
		//用字节写入流对象创建图片文件，用来存储图片数据，作为目标文件
		FileOutputStream fos = null;

		try
		{
			fis = new FileInputStream("/home/zhshuang/桌面/p1.png");
			fos = new FileOutputStream("/home/zhshuang/桌面/2.png");

			//创建缓冲区数组，用来存储图片数据
			byte[] buf = new byte[fis.available()];
			//将fis关联的图片文件写到缓冲区中
			fis.read(buf);
			//将buf的内容写到fos关联的目标图片文件中
			fos.write(buf);
		}
		catch(IOException e)
		{
			System.out.println("读写异常");
			System.out.println(e.toString());
		}
		finally
		{
			if(fis != null)
			{
				try
				{
					fis.close();
				}
				catch(IOException e)
				{
					System.out.println("fis关闭异常");
					System.out.println(e.toString());
				}
			}

			if(fos != null)
			{
				try
				{
					fos.close();
				}
				catch(IOException e)
				{
					System.out.println("fos关闭异常");
					System.out.println(e.toString());
				}
			}
		}
	}

}
