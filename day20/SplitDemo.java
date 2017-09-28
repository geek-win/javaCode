/*
 * 以1M大小分割文件
 * 将一个文件分成多个文件
 * 需要创建字节读取流，然后关联被分割的文件
 * 创建字节数组，作为分割的标准
 * 使用read(buf)，将被分割文件写到数组中
 * 然后分别创建新的字节输出流，将数组数据写到输出流中
 * */
import java.io.*;
import java.util.*;

class SplitDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	//切割文件
	public static void splitFile()throws IOException
	{
		//创建字节流输入流对象，关联被分割的文件
		FileInputStream fis = new FileInputStream("/home/zhshuang/桌面/p1.png");

		//创建分隔大小，用数组表示
		byte[] buf = new byte[1024*4];

		//创建文件计数变量
		int count = 1;
		FileOutputStream fos = null;

		int len = 0;
		while((len = fis.read(buf)) != -1)
		{
			fos = new FileOutputStream((count++)+".part");
			fos.write(buf, 0, len);
			fos.close();
		}

		fis.close();
	}

	//合并文件
	public static void merge()throws IOException
	{
		//创建集合，存储多个碎片文件
		Vector<InputStream> v = new Vector<InputStream>();

		for(int x = 1; x < 3; x++)
		{
			v.add(new FileInputStream(x+".part"));
		}

		SequenceInputStream sis = new SequenceInputStream(v.elements());

		FileOutputStream fos = new FileOutputStream("T.txt");

		byte[] buf = new byte[1024];
		int len = 0;
		while((len = sis.read(buf)) != -1)
		{
			fos.write(buf, 0, len);
		}

		sis.close();
		fos.close();

	}

	//合并文件2
	public static void merge1()throws IOException
	{
		//多个源文件，存到集合中
		ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();

		for(int i = 0; i < 2; i++)
			al.add(new FileInputStream((i+1)+".part"));

		//字节输出流
		//作为目的文件
		FileOutputStream fos = new FileOutputStream("/home/zhshuang/桌面/hh.png");

		//创建迭代器，然后获取Enumeration对象
		final Iterator<FileInputStream> it = al.iterator();

		//匿名内部类
		//所以要将it设置为final
		Enumeration<FileInputStream> en = new Enumeration<FileInputStream>()
		{
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
//		splitFile();

//		merge();

		merge1();
	}
}
