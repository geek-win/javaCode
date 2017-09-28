/*
 * 将c盘文本文件复制到d盘
 * 原理：
 * 在d盘创建文件，把c盘内容存储到d盘文件中
 * 1、在d盘创建一个文件，用于存储c盘文件的数据。定义文件写入流，用于写入d盘中创建的文件
 * 2、定义一个文件读取流，和c盘文件相关联。
 * 3、不断读取c盘文件中的数据，写入d盘文件
 * 4、关闭资源
 * */
import java.io.*;

class CopyDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}


	//定义文件复制方法
	//使用逐个读取源文件字符的方式进行读取并存储
	public static void copy_1()throws IOException
	{
		//创建目的文件
		//目的文件是写入的对象，所以需要创建文件写入流
		FileWriter fw = new FileWriter("/home/zhshuang/A.java");

		//定义文件读取流，用于读取源文件
		FileReader fr = new FileReader("FileWriterDemo.java");

		//通过读取流的读取方式读取文件
		//逐个读取源文件中的字符
		//然后逐个写入目的文件
		int ch = 0;
		while((ch = fr.read()) != -1)
		{
			//每次写入都是写到流中
			//并没有写到fw相关联的目的文件中
			//需要flush()或者close()方法将流中缓冲区中的内容写到目的文件中
			fw.write(ch);
		}

		fw.close();
		fr.close();
	}

	//定义文本文件复制的方法
	//使用读取到数组的读取方式进行复制
	public static void copy_2()throws IOException
	{
		//创建文件写入流，作为目的文件
		FileWriter fw = new FileWriter("/home/zhshuang/B.java");

		//创建文件读取流，用于读取源文件
		FileReader fr = new FileReader("FileWriterDemo.java");

		//通过读取流到数组中进行读取
		//然后将数组添加到目的文件中
		int num = 0;
		char[] ch = new char[1024];

		while((num = fr.read(ch)) != -1)
			fw.write(ch, 0, num);

		fw.close();
		fr.close();
	}

	public static void main(String[] agrs)throws IOException
	{
		copy_1();
		copy_2();
	}
}
