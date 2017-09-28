/*
 * Properties
 * PrintStream
 * PrintWriter
 * 分割
 * 合并
 * */
import java.io.*;
import java.util.*;

class Exe
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	//Properties练习
	public static void pro()throws IOException
	{
		File f = new File("prop.ini");

		if(!f.exists())
			f.createNewFile();

		FileInputStream fis = new FileInputStream(f);

		Properties prop = new Properties();
		//从配置文件加载键值对
		prop.load(fis);

		int count = 0;
		String value = prop.getProperty("time");
		if(value != null)
		{
			count = Integer.parseInt(value);
			if(count >= 5)
			{
				sop("以达到免费使用上限");
				return ;
			}
		}
		count++;

		prop.setProperty("time", count+"");

		FileOutputStream fos = new FileOutputStream(f);

		prop.store(fos, "");
	}

	//PrintWriter、PrintStream
	public static void prin()throws IOException
	{
		//输出流
		PrintStream ps = new PrintStream(System.out);
		PrintWriter pw1 = new PrintWriter(new FileWriter("a.txt"), true);

		//输入流
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		BufferedInputStream bufis = new BufferedInputStream(System.in);

		
		String line = null;
		while((line = bufr.readLine()) != null)
		{
			if("over".equals(line))
				break;

			pw1.println(line);
		}
	
		/*
		byte[] buf = new byte[1024];
		int len = 0;
		while((len = bufis.read(buf)) != -1)
		{
			ps.write(buf, 0, len);
		}
		*/
		ps.close();
		pw1.close();
		bufr.close();
		bufis.close();
	}

	//分割文件
	public static void splitFile(File f, int size)throws IOException
	{
		//创建字节输入流，读取被分割文件
		FileInputStream fis = new FileInputStream(f);
		//根据size确定分割大小
		byte[] buf = new byte[size];

		//创建字节输出流
		FileOutputStream fos = null;

		int len = 0;
		int count = 1;
		while((len = fis.read(buf)) != -1)
		{
			fos = new FileOutputStream((count++)+".part");
			fos.write(buf, 0, len)	;
			fos.close();
		}

		fis.close();
	}

	//合并文件
	public static void merge()throws IOException
	{
		ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
		for(int i = 1; i < 5; i++)
		{
			al.add(new FileInputStream(i+".part"));
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

		//创建序列流
		//字节输入流
		//源
		SequenceInputStream sis = new SequenceInputStream(en);

		//字节输出流
		//目的
		FileOutputStream fos = new FileOutputStream("m.java");
		
		byte[] buf = new byte[1024];
		int len = 0;
		while((len = sis.read(buf)) != -1)
		{
			fos.write(buf, 0, len);
		}

		sis.close();
		fos.close();
	}

	//合并文件

	public static void main(String[] args)throws IOException
	{
		//pro();
		//prin();
		File f = new File("FileDemo.java");
		int size = 1024;
		splitFile(f, size);
		merge();
	}
}
