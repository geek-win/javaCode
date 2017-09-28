/*
 * 文件的切割和合并
 * 1、切割
 * 源：一个文件
 * 目的：多个文件
 * 创建缓冲区数组，循环读取被切割文件，存到缓冲区数组中，然后写到新的文件中
 * 2、合并
 * 源：多个文件
 * 目的：一个文件
 * 将多个文件流合并成以序列流，然后读取到输出流中。写到目标文件中
 * */
import java.io.*;
import java.util.*;

class SandM
{
	//切割文件
	//指定切割大小
	public static void splitFile(File f, int size)throws IOException
	{
		//创建字节输入流对象，与被切割文件相关联
		FileInputStream fis = new FileInputStream(f);

		//创建字节写入流，与目标文件相关联
		FileOutputStream fos = null;

		//创建缓冲区数组，用于存储分片数据
		byte[] buf = new byte[size];
		int len = 0;
		int count = 1;
		while((len = fis.read(buf)) != -1)
		{
			fos = new FileOutputStream("./part/"+(count++)+".part");
			fos.write(buf, 0, len);
			fos.close();
		}

		fis.close();
	}

	//合并文件
	public static void merge()throws IOException
	{
		//创建集合，存储字节输入流
		//和多个碎片文件相关联
		ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();

		for(int i = 1; i < 5; i++)
		{
			al.add(new FileInputStream("./part/"+i+".part"));
		}

		//获取迭代器
		final Iterator<FileInputStream> it = al.iterator();
		//获取Enumeration对象
		Enumeration<FileInputStream> en = new Enumeration<FileInputStream>(){
			public boolean hasMoreElements()
			{
				return it.hasNext();
			}
			public FileInputStream nextElement()
			{
				return it.next();
			}
		};

		//序列流
		SequenceInputStream sis = new SequenceInputStream(en);
		
		//字节输出流
		FileOutputStream fos = new FileOutputStream("part/merge.java");

		byte[] buf = new byte[1024];
		int len = 0;
		while((len = sis.read(buf)) != -1)
		{
			fos.write(buf, 0, len);
		}

		fos.close();
		sis.close();
	}

	public static void main(String[] args)throws IOException
	{
		//创建被分割的文件
		File src = new File("FileDemo.java");
		int size = 1024;

		splitFile(src, size);
		merge();

	}
}
