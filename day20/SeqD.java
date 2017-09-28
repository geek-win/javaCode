/*
 * 将文件分割成指定大小
 * 将多个碎片文件合成一个文件
 * */
import java.io.*;
import java.util.*;

class SeqD
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	//分割文件
	//源；一个文件，使用字节输入流读取，因为是按照字节读取
	//目的：多个文件。使用字节输出流
	public static void splitFile(File f, int size)throws IOException
	{
		//创建字节读取流对象
		FileInputStream fis = new FileInputStream(f);

		//创建字节输出流
		FileOutputStream fos = null;

		byte[] buf = new byte[size];
		int len = 0;
		int count = 1;

		while((len = fis.read(buf)) != -1)
		{
			fos = new FileOutputStream((count++)+".suipian");
			fos.write(buf, 0, len);
			fos.close();
		}

		fis.close();
	}

	//合并文件
	//源：多个文件，使用序列流
	//需要将多个文件存到集合中
	//目的：一个文件，创建字节输出流
	public static void merge()throws IOException
	{
		//将多个文件存到集合中
		ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();

		for(int i = 1; i < 5; i++)
		{
			al.add(new FileInputStream(i+".suipian"));
		}

		Iterator<FileInputStream> it = al.iterator();
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

		SequenceInputStream sis = new SequenceInputStream(en);
		FileOutputStream fos = new FileOutputStream("mer.java");

		byte[] buf = new byte[1024];
		int len = 0;

		while((len = sis.read(buf)) != -1)
		{
			fos.write(buf, 0, len);
		}

		sis.close();
		fos.close();
	}

	public static void main(String[] args)throws IOException
	{
		File f = new File("FileDemo.java");
		int size = 1024;
		splitFile(f, size);

		merge();
	}
}
