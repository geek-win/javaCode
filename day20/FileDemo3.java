/*
 * String[] list()//列出此抽象路径名表示的目录下的文件和文件夹
 * String[] list(FilenameFilter filter)//根据过滤器过滤文件并返回字符串数组
 * File[] listFiles()//列出此抽象路径名表示的目录下的文件和文件夹并封装成File对象
 * File[] listFiles(FileFilter filter)//根据过滤器列出此目录下满足条件的File对象
 * File[] listFiles(FilenameFilter filter)//根据过滤器列出此目录下满足条件的File对象
 * static File[] listRoots()//列出可用的文件系统根
 * */
import java.io.*;

class FileDemo3
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		//创建目录对象
		File dir = new File("/home/zhshuang/文档/java/day");

		//列出目录下的所有文件和文件夹，返回字符串
		String[] str1 = dir.list();
		for(String name: str1)
			sop(name);

		sop("-------------------------------------------------");
		
		//列出目录下的文件和文件夹，并封装成File对象
		File[] file1 = dir.listFiles();
		for(File f : file1)
			sop(f.getPath()+"::"+f.getName());

		//列出目录下的文件和文件夹，根据过滤器，返回字符串
		sop("-----------------------------------------------------");
		String[] str2 = dir.list(new FilenameFilter()
				{
					//将所有的class文件过滤
					public boolean accept(File dir, String name)
					{
						return name.endsWith(".java");
					}
				});
		for(String s : str2)
		{
			sop(s);
		}

		//列出目录下的文件和文件夹，使用过滤器，封装成File对象
		sop("----------------------------------------------------");
		File[] file2 = dir.listFiles(new FilenameFilter()
				{
					//将所有的java文件过滤
					public boolean accept(File dir1, String name)
					{
						return name.endsWith(".class");
					}
				});
		for(File f : file2)
			sop(f.getParent()+"::"+f.getName());

		sop("----------------------------------");
		File[] file3 = File.listRoots();
		for(File f: file3)
		{
			for(File f1 : f.listFiles())
			{
				sop(f1.getParent()+"--"+f1.getName());
			}
		}
	}
}
