/*
 * 创建Set<File>集合
 * 看是如何进行排序的
 * */
import java.io.*;
import java.util.*;

class FileSet
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		TreeSet<File> ts = new TreeSet<File>(new Comp());

		sop(ts.add(new File("a.txt")));
		sop(ts.add(new File("d.txt")));
		sop(ts.add(new File("xg.txt")));
		sop(ts.add(new File("cds.txt")));
		sop(ts.add(new File("a.txt")));
		sop(ts.add(new File("aafsljglakjskl.txt")));
		sop(ts.add(new File("gagasdasfa.txt")));

		sop("ts = "+ts);
	}
}
class Comp implements Comparator<File>
{
	public int compare(File f1, File f2)
	{
		//以名字长度为首要比较条件
		//如果名字长度相同，就按照名字的字母顺序
		int num = new Integer(f1.getName().length()).compareTo(new Integer(f2.getName().length()));

		if(num == 0)
			return f1.getName().compareTo(f2.getName());
		
		return num;
	}
}
