/*
 * File类
 * IO流只能操作文件中的数据，但是如果想对文件或者文件夹进行操作，只能使用File类
 * 构造函数
 * File(String pathname)
 * File(String parent, String child)
 * File(File parent, String child)
 * 1、创建
 * boolean createNewFile();//创建成功就返回true，否则false
 * static File createTempFile(String prefix, String suffix)
 * static File createTempFile(String prefix, String suffix, File directory)
 * boolean mkdir()//创建此抽象路径指定的目录
 * boolean mkdirs()//创建此抽象路径指定的目录，包括所有必需但不存在的父目录
 * 2、删除
 * boolean delete()//删除成功返回true，否则false
 * void deleteOnExit()//当程序结束的时候将该文件删除
 * 3、判断
 * boolean canExecute()//是否可执行，如果可执行，可以使用Runtime的exec方法执行
 * boolean canRead()//是否可读
 * boolean canWrite()//是否可写
 * boolean equals(Object obj)//是否和obj相同
 * boolean exists()//是否存在，创建之前先判断
 * boolean isAbsolute()//是否是绝对路径,不管是否已经创建，只看路径名
 * boolean isDirectory()//是否是目录
 * boolean isFile()//是否是一个标准文件
 * boolean isHidden()//是否是隐藏文件
 * 4、获取
 * int compareTo(File f)//本文件和f相比，按照字母顺序比较两文件的抽象路径名
 * 如果想使用其他方式进行比较，可以自定义比较器
 *
 * */
import java.io.*;

class FileDemo1
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void consMethod()
	{
		//使用相对路径创建文件
		File f1 = new File("a.txt");
		//使用绝对路径创建文件
		File f2 = new File("/home/zhshuang/桌面/a/hh.txt");
		//使用相对路径以及File对象创建文件
		File d = new File("/home/zhshuang/桌面/b");
		File f3 = new File(d, "d.txt");
		
		File f4 = new File("/home/zhshuang/桌面/", "aaa.txt");

		sop("f1 = "+f1);
		sop("f2 = "+f2);
		sop("f3 = "+f3);
		sop("f4 = "+f4);
		sop("d = "+d);
	}

	public static void method1()throws IOException
	{
		File f1 = new File("a.txt");
		sop("f1 = "+f1);
		sop("f1.createNewFile(): "+f1.createNewFile());
		sop("f1.delete(): "+f1.delete());

		File d = new File("/home/zhshuang/桌面/abc");
		sop("d = "+d);
		sop("d.mkdir(): "+d.mkdir());

		File f2 = new File("b.txt");
//		f2.deleteOnExit();
		sop("f2 = "+f2);
		sop("f2.createNewFile(): "+f2.createNewFile());
	}

	public static void method2()throws IOException
	{
		File f = new File("FileDemo.java");
		sop("f = "+f);
		sop("f.canExecute(): "+f.canExecute());
		sop("f.exists(): "+f.exists());


		File f1 = new File("hh.txt");
		sop("f1 = "+f1+", f1.mkdir(): "+f1.mkdir());
		sop("f1.exists(): "+f1.exists());
		sop("f1.isFile(): "+f1.isFile());
		sop("f1.isAbsolute(): "+f1.isAbsolute());
		sop("f1.isDirectory(): "+f1.isDirectory());
		//java只能拿非隐藏的
		sop("f1.isHidden(): "+f1.isHidden());
		sop("f1.canRead(): "+f1.canRead());
		sop("f2.canWrite(): "+f1.canWrite());

		File d = new File("/home/zhshuang/文档/java/day20/aa/bb/cc/dd");
		sop("d = "+d);
		sop("d.mkdir(): "+d.mkdir());
		sop("d.mkdirs(): "+d.mkdirs());
		/*
		//可以通过先判断文件是否是可执行文件，如果是就可以使用Runtime的exec方法
		//执行该可执行文件
		File f1 = new File("a");
		if(f1.canExecute())
			Runtime.getRuntime().exec(f1.getAbsolutePath());
		*/
	}

	public static void method3()throws IOException
	{
		File f1 = new File("abc.txt");
		File f2 = new File("/home/zhshuang/文档/java/day20/aa/bb/cc");
		File d = new File("/home/zhshuang/文档/java/day20/kk/jj/");

		sop("f1 = "+f1);
		sop("f1.exists(): "+f1.exists());
		sop("f1.createNewFile(): "+f1.createNewFile());
		sop("f1.exists(): "+f1.exists());
		sop("f1.isFile(): "+f1.isFile());
		sop("f1.isDirectory(): "+f1.isDirectory());
		sop("f1.isAbsolute(): "+f1.isAbsolute());
		sop("f1.isHidden(): "+f1.isHidden());

		sop("----------------------");
		sop("f2 = "+f2);
		sop("f2.mkdirs(): "+f2.mkdirs());
		sop("f2.exists(): "+f2.exists());
		sop("f2.isAbsolute(): "+f2.isAbsolute());
		sop("f2.isFile(): "+f2.isFile());
		sop("f2.isDirectory(): "+f2.isDirectory());
		sop("f2.isHidden(): "+f2.isHidden());

		sop("----------------------");
		sop("d = "+d);
		sop("d.mkdirs(): "+d.mkdirs());
		sop("d.exists(): "+d.exists());
		sop("d.canExecute(): "+d.canExecute());
		sop("d.canRead(): "+d.canRead());
		sop("d.canWrite(): "+d.canWrite());
		sop("d.isFile(): "+d.isFile());
		sop("d.isDirectory(): "+d.isDirectory());
		sop("d.isAbsolute(): "+d.isAbsolute());
	}

	public static void run()throws IOException
	{
		//创建文件对象指向a
		//判断是否可执行
		//如果可执行就执行
		File f = new File("a");
		if(f.canExecute())
		{
			sop(f.getAbsolutePath()+"可执行");
			Runtime.getRuntime().exec(f.getAbsolutePath());
		}
	}

	public static void method4()
	{
		File f = new File("aa/bb/h.txt");
		sop("f = "+f);
		sop("f.getName(): "+f.getName());
		sop("f.getPath(): "+f.getPath());
		sop("f.getAbsolutePath(): "+f.getAbsolutePath());
		sop("f.getParent(): "+f.getParent());
	}

	public static void rename()//throws IOException
	{
		File f1 = new File("a.txt");
//		sop("f1.createNewFile()"+f1.createNewFile());
		
		File f2 = new File("tt.txt");
		sop("rename: "+f2.renameTo(f1));

		sop("length: "+new File("FileDemo1.java").length());
	}

	public static void main(String[] args)throws IOException
	{
		//consMethod();

//		method1();
//		method2();
//		method3();

//		run();
//		method4();
		rename();
	}
}
