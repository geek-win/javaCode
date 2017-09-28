/*
 * 复习对目录的操作
 * 1、递归遍历目录中所有文件和目录
 * 需要一层一层遍历递归
 * 2、删除某个指定目录中所有的文件
 * 遍历到文件夹需要递归删除，遍历到文件直接删除
 * 3、将指定目录中的所有的java文件的绝对路径存到指定文本文件中
 * */
import java.io.*;
import java.util.*;

class FileDemo7
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	//递归遍历目录中所有的文件
	public static void showDir(File dir, int level)
	{
		//将dir以及缩进格式输出
		sop(getLevel(level)+dir.getAbsolutePath());

		File[] files = dir.listFiles();
		for(File f : files)
		{
			if(f.isDirectory())
				showDir(f, level+1);
			else
				sop(getLevel(level+1)+f.getName());
		}
	}

	//根据传入的level
	//确定缩进格式
	public static String getLevel(int level)
	{
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < level; i++)
			sb.append("  ");

		return sb.toString();
	}

	//将指定目录删除
	//删除需要从最里往外删除
	//也需要递归
	public static void removeDir(File dir)
	{
		File[] files = dir.listFiles();

		for(File f : files)
		{
			if(f.isDirectory())
				removeDir(f);
			else
				sop("delete file: "+f.getName()+"--"+f.delete());
		}

		//将遍历的目录删除
		sop("delete dir: "+dir.getName()+"--"+dir.delete());
	}

	/*
	//将指定目录中的java文件绝对路径存到文本文件中
	public static void pathToFile(File dir, File dest)
	{
		//递归遍历该目录
		File[] files = dir.listFiles();
		//创建目标文本文件对应的字符写入缓冲区
		BufferedWriter bufw = null;

		try
		{
			bufw = new BufferedWriter(new FileWriter(dest, true));

			for(File f : files)
			{
				if(f.isDirectory())
					pathToFile(f, dest);
				else
				{
					bufw.write(f.getAbsolutePath());
					bufw.newLine();
					bufw.flush();
				}
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
					throw new RuntimeException("关闭资源异常");
				}
			}
		}
	}
*/
	//将指定路径中的java文件绝对路径存到集合中
	public static void fileToList(File dir, List<File> list)
	{
		File[] files = dir.listFiles();

		for(File f : files)
		{
			if(f.isDirectory())
				fileToList(f, list);
			else
				list.add(f);
		}
	}

	//将集合中的元素存到文件中
	//目的：输出流，OutputStream或Writer。文本文件Writer/FileWriter/BufferedWriter
	public static void listToFile(List<File> list, File dest)
	{
		BufferedWriter bufw = null;

		try
		{
			bufw = new BufferedWriter(new FileWriter(dest));

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
			throw new RuntimeException("创建异常");
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

	//创建目录文件
	public static void create()throws IOException
	{
		File dir = new File("/home/zhshuang/桌面/aaa/");
		File f1 = new File(dir, "a.txt");
		File f2 = new File(dir, "b.txt");
		File dir1 = new File(dir, "bbb");
		File f3 = new File(dir, "bbb/c.txt");

		sop("dir = "+dir);
		sop("dir.mkdir: "+dir.mkdir());
		sop("dir1 = "+dir1);
		sop("dir1.mkdir: "+dir1.mkdir());
		sop("f1 = "+f1);
		sop("f1.create : "+f1.createNewFile());
		sop("f2 = "+f2);
		sop("f2.create : "+f2.createNewFile());
		sop("f3 = "+f3);
		sop("f3.create : "+f3.createNewFile());
	}
	//主函数
	public static void main(String[] args)throws IOException
	{
		/*
		//创建文件目录
		create();

		File dir = new File("/home/zhshuang/桌面/aaa");
		//遍历aaa目录中的所有文件
		showDir(dir, 0);

		//将指定目录中文件删除
		removeDir(dir);
		*/

		//创建目录对象
		File dir = new File("../day18");
		//遍历dir目录中的文件和目录
		File dest = new File("../day18/java.list");

		//将dir中的所有文件存到指定文本文件中
		List<File> list = new ArrayList<File>();
		fileToList(dir, list);
		listToFile(list, dest);
	}
}
