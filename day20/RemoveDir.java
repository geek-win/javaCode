/*
 * 删除目录中的全部内容
 * 使用递归
 * 遍历目录，如果是目录，递归删除，如果是文件直接删除
 * 使用delete方法判断是否误删
 * */
import java.io.*;

class RemoveDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void removeDir(File dir)
	{
		//遍历目录
		//如果是文件就直接删除
		//如果不是文件，就递归删除文件
		File[] files = dir.listFiles();
		for(File f : files)
		{
			if(f.isDirectory())
				removeDir(f);
			else
				sop(f+"---file---"+f.delete());
		}
		
		//将本目录中的文件全部删除之后要把文件夹删除
		dir.delete();
	}

	public static void main(String[] args)
	{
		removeDir(new File("/home/zhshuang/桌面/aaa"));
	}
}



