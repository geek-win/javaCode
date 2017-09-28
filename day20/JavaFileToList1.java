/*
 * 将指定路径中的java文件的绝对路径存到文本文件中
 * 1、递归遍历指定路径中的文件，并判断是否是java
 * 2、创建集合，将java文件路径存到集合中
 * 3、遍历集合，存到指定的文本文件中
 * */
import java.io.*;
import java.util.*;

class JavaFileToList1
{
	//将指定目录中的java文件存到list集合中
	public static void fileToList(File dir, List<File> list)
	{
		//递归遍历目录，把文件绝对路径存到list集合中
		File[] files = dir.listFiles();
		for(File f : files)
		{
			if(f.isDirectory())
				fileToList(f, list);
			else
			{
				if(f.getPath().endsWith(".java"))
					list.add(f);
			}
		}
	}

	//将list集合中的内容存到文本文件中
	public static void writeToFile(List<File> list, File filename)
	{
		//文本文件是目的
		//Writer。FileWriter。BufferedWriter
		BufferedWriter bufw = null;

		try
		{
			bufw = new BufferedWriter(new FileWriter(filename));

			for(File f : list)
			{
				String name = f.getAbsolutePath();
				bufw.write(name);
				bufw.newLine();
				bufw.flush();
			}
		}
		catch(IOException e)
		{
			throw new RuntimeException("写入文件异常");
		}
		finally
		{
			if(bufw != null)
			{
				try
				{
					bufw.close();
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
		//创建被遍历的目录
		File dir = new File("/home/zhshuang/文档/java");

		//创建接收文件绝对路径的集合
		List<File> list = new ArrayList<File>();

		//将文件绝对路径写到集合中
		fileToList(dir, list);

		//将集合中内容存到文本文件中
		File f = new File(dir, "javalist.txt");
		writeToFile(list, f);
	}

}
