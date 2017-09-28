/*
 * 输出目录下的所有文件
 * 使用层次输出
 * */
import java.io.*;

class CengCiDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static String getLevel(int level)
	{
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < level; i++)
			sb.append("  ");

		return sb.toString();
	}

	public static void showDir(File dir, int level)
	{
		sop(getLevel(level)+dir.getName());

		File[] files = dir.listFiles();
		for(File f : files)
		{
			if(f.isDirectory())
				showDir(f, level+1);
			else
				sop(getLevel(level+1)+f.getName());
		}
	}

	public static void main(String[] args)
	{
		showDir(new File("/home/zhshuang/桌面/aaa"), 0);
	}
}
