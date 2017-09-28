/*
 * 递归遍历目录中的文件
 * 如果目录中还有目录，那就继续遍历其中的文件
 * */
import java.io.*;

class FileDemo6
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	//列出传入的目录中的所有文件和目录中的文件
	public static void showDir(File dir, int level)
	{
		sop(getLevel(level)+dir.getName());
		//返回此抽象路径名表示的目录中所有的文件和目录
		//封装成File对象返回
		File[] file = dir.listFiles();

		//遍历该File数组，如果是文件就打印，如果不是文件是目录就递归遍历
		for(File f : file)
		{
			if(f.isDirectory())
				showDir(f, level+1);
			else
				sop(getLevel(level)+f);
		}
	}

	//根据目录层级显示目录
	public static String getLevel(int level)
	{
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < level; i++)
			sb.append("  ");

		return sb.toString();
	}

	public static void main(String[] args)throws IOException
	{
		/*
		File dir = new File("/home/zhshuang/桌面/aaa/bbb/ccc/ddd");
		dir.mkdirs();

		File f1 = new File("/home/zhshuang/桌面/aaa/a1.txt");
		File f2 = new File("/home/zhshuang/桌面/aaa/a2.txt");
		File f3 = new File("/home/zhshuang/桌面/aaa/bbb/b.txt");
		File f4 = new File("/home/zhshuang/桌面/aaa/bbb/ccc/c.txt");
		File f5 = new File("/home/zhshuang/桌面/aaa/bbb/ccc/ddd/d1.txt");
		File f6 = new File("/home/zhshuang/桌面/aaa/bbb/ccc/ddd/d2.txt");
		
		f1.createNewFile();
		f2.createNewFile();
		f3.createNewFile();
		f4.createNewFile();
		f5.createNewFile();
		f6.createNewFile();
*/
		showDir(new File("/home/zhshuang/桌面/aaa"), 0);
	}
}
