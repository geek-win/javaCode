/*
 * Properties类方法演示
 * load
 * void load(InputStream inStream)
 *	从输入流中读取属性列表（键和元素对）
 * void load(Reader r)
 *  按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）
 * */
import java.io.*;
import java.util.*;

class LoadDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void loadDemo()throws IOException
	{
		//创建字符输入流
		//Reader r = new FileReader("prop.txt");

		FileInputStream fis = new FileInputStream("prop.txt");
		Properties pro = new Properties();

		pro.load(new FileReader("info1.txt"));
		pro.list(System.out);

		pro.setProperty("color", "红色");
		pro.list(System.out);

		//store方法
		FileOutputStream fos = new FileOutputStream("info.txt");
		FileWriter fw = new FileWriter("info1.txt");
		pro.store(fw, "jjjj");

		pro.store(fos, "haha");
	}
	public static void main(String[] args)throws IOException
	{
		loadDemo();
	}
}
