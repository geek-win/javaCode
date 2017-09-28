/*
 * 复习File类方法
 * */
import java.io.*;

class FileDemo5
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)throws IOException
	{
		//创建文件对象
		File f1 = new File("abc.txt");
		File f2 = new File("/home/zhshuang/桌面/hh.txt");
		File f3 = new File("../day18", "c.txt");
		File d = new File("/home/zhshuang/桌面/aaaa");
		File f4 = new File(d, "d.txt");

		//创建文件
		sop("f1 = "+f1+"  createNewFile: "+f1.createNewFile());
		sop("f2 = "+f2+"  createNewFile: "+f2.createNewFile());
		sop("f3 = "+f3+"  createNewFile: "+f3.createNewFile());
		sop("d = "+d+"    createNewFile: "+d.mkdir());
		sop("f4 = "+f4+"  createNewFile: "+f4.createNewFile());

		//判断
		sop("f1.canExecute():"+f1.canExecute());
		sop("a.canExecute():"+new File("a").canExecute());
		sop("f1.canRead():"+f1.canRead());
		sop("f1.canWrite():"+f1.canWrite());
		sop("f1.exists: "+f1.exists());
		sop("f1.isFile():"+f1.isFile());
		sop("d.isDirectory():"+d.isDirectory());
		sop("f3.isAbsolute():"+f3.isAbsolute());
		sop("f3.isHidden():"+f3.isHidden());

		/*
		//获取
		File f = new File(".");
	
		String[] str1 = f.list();
		for(String s : str1)
			sop(s);

		sop("-----------------------------");
		File[] file1 = f.listFiles();
		for(File name : file1)
			sop(name);

		sop("-----------------------------");
		String[] str2 = f.list(new FilenameFilter()
				{
					public boolean accept(File dir, String name)
					{
						//将所有的java文件输出
						return name.endsWith(".java");
					}
				});
		for(String s: str2)
			sop(s);

		sop("------------------------------");
		File[] file2 = f.listFiles(new FilenameFilter()
				{
					public boolean accept(File dir, String name)
					{
						return name.endsWith(".class");
					}
				});
		for(File name:file2)
			sop(name);

		File[] file3 = File.listRoots();
		for(File name: file3)
		{
			for(File name1 : name.listFiles())
				sop(name1);
		}
		*/

		/*
		//设置
		sop("b.txt设置成所有用户不可读："+new File("b.txt").setReadable(false, false));
		sop("a设置成所有用户不可执行："+new File("a").setExecutable(false, false));
		sop("a设置成只有所有者不可执行："+new File("a").setExecutable(true, false));
		sop("a设置成所有用户可写："+new File("a").setWritable(true, false));
*/
		/*
		//获取文件名等信息
		sop("f3.getParent() = "+f3.getParent());
		sop("f3.getName() = "+f3.getName());
		sop("f3.getPath() = "+f3.getPath());
		sop("f3.getAbsolutePath() = "+f3.getAbsolutePath());
		sop("f4.getAbsoluteFile().getPath() = "+f3.getAbsoluteFile().getPath());
		sop("f3.getParentFile().getName() = "+f3.getParentFile().getName());
*/
		//获取长度和时间
		sop("length()"+new File("FileDemo5.java").length());
		sop("lastModified()"+new File("FileDemo5.java").lastModified());

		sop("compareTo:"+new File("a.txt").compareTo(new File("b.txt")));
		
		f1.deleteOnExit();
		d.deleteOnExit();
		f4.deleteOnExit();
		sop("f2.delete()"+f2.delete());
		
	}
}
