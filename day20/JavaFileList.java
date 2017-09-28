/*
 * 将java文件清单列表存到文本文件中
 * 1、对指定目录进行递归
 * 2、获取递归过程所有的java文件的路径
 * 3、将这些路径存到集合中，可以进行一系列操作
 * 4、将集合中的内容存到指定文件中
 * */
import java.io.*;
import java.util.*;

class JavaFileList
{
	public static void fileTo(File dir, List<File> al)
	{
		File[] files = dir.listFiles();
		for(File f : files)
		{
			if(f.isDirectory())
				fileTo(f, al);
			else
			{
				if(f.getName().endsWith(".java"))
					al.add(f);
			}
//				al.add(f);
		}
	}


	public static void main(String[] args)throws IOException
	{
		List<File> al = new ArrayList<File>();
		fileTo(new File("/home/zhshuang/文档/java/"), al);

		System.out.println(al.size());

		System.setOut(new PrintStream("path.txt"));
		for(File f : al)
			System.out.println(f);

		BufferedWriter bufw = new BufferedWriter(new FileWriter("path1.txt"));
		for(File f: al)
		{
			bufw.write(f.getPath());
			bufw.newLine();
			bufw.flush();
		}

		bufw.close();
	}
}

