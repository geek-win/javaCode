/*
 * 将指定路径下的所有的java文件的绝对路径存到文本文件中
 * 并且输出java文件个数
 * 1、递归遍历指定目录
 * 2、递归过程中将所有的java文件存到集合中
 * 3、将集合中的路径遍历输出到指定文本文件
 * */
import java.io.*;
import java.util.*;

class JavaFileToList
{
	public static void fileToList(File dir, List<File> list)
	{
		//递归遍历dir目录
		//将其中的文件进行判断，是否是java文件
		//对其中的目录进行递归
		File[] files = dir.listFiles();
		for(File f : files)
		{
			if(f.isDirectory())
				fileToList(f, list);
			else
			{
				if(f.getName().endsWith(".java"))
					list.add(f);
			}
		}
	}

	//把集合中的数据存到文件中
	public static void writeToFile(List<File> list, String javaListFile)
	{
		BufferedWriter bufw = null;
		try
		{
			bufw = new BufferedWriter(new FileWriter(javaListFile));

			for(File f : list)
			{
				bufw.write(f.getAbsolutePath());
				bufw.newLine();
				bufw.flush();
			}
		}
		catch(IOException e)
		{
			e.printStackTrace();
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
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args)//throws IOException
	{
		//创建存储java文件路径的集合
		List<File> list = new ArrayList<File>();

		//创建路径
		File dir = new File("/home/zhshuang/文档/java");
		fileToList(dir, list);
		System.out.println("java文件个数："+list.size());

		writeToFile(list, "hhhhh.txt");
		/*
		//遍历集合将java文件目录存到指定文本文件中
		for(File f : list)
			System.out.println(f);

		System.setOut(new PrintStream("result.txt"));
		for(File f : list)
			System.out.println(f);

		BufferedWriter bufw = new BufferedWriter(new FileWriter("result1.txt"));
		for(File f : list)
		{
			bufw.write(f.getAbsolutePath());
			bufw.newLine();
			bufw.flush();
		}

		bufw.close();
		*/
	}
}
