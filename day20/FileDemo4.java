import java.io.*;

class FileDemo4
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		File dir = new File("/home/zhshuang/文档/java/day");

		/*
		//1
		for(String s : dir.list())
			sop(s);
		*/

		/*
		//2
		for(File f : dir.listFiles())
			sop(f.getParent()+":::"+f.getName());
		*/

		//3
		String[] s = dir.list(new FilenameFilter()
				{
					public boolean accept(File dir, String name)
					{
						return name.endsWith(".java");
					}
				});
		for(String s1 : s)
			sop(s1);

		sop("-----------------------------------------------------");

		//4
		File[] file1 = dir.listFiles(new FilenameFilter()
				{
					public boolean accept(File dir, String name)
					{
						return name.endsWith(".class");
					}
				});

		for(File f1 : file1)
			sop(f1.getParent()+":::"+f1.getName());

		sop("-----------------------------------------------------");
		File[] file2 = File.listRoots();
		for(File f : file2)
		{
			for(File f3 : f.listFiles())
				sop(f3.getParent()+"--"+f3.getName());
		}
	}
}
