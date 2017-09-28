/*
 * 演示文件列表
 * */
import java.io.*;

class FileDemo2
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		/*
		File[] files = File.listRoots();

		for(File f : files)
		{
			sop(f);
		}

		File d = new File("/home/zhshuang");
		for(String s: d.list())
			sop(s);
		*/
		//File[] listRoots()
		//列出可用的文件系统根
		File[] files = File.listRoots();
		for(File f : files)
			sop(f.length()+"--"+f);

		//String[] list()
		//列出此抽象路径名表示的目录中的目录和文件
		String[] s = new File("/home/zhshuang").list();
		for(String name : s)
			sop(name);

		sop("------------------------");
		for(File f : new File("/home/zhshuang").listFiles())
			sop(f);


		sop("---------------------");
		for(File f : File.listRoots())
		{
			for(String f1 : f.list())
				sop(f1);
		}

	}
}
