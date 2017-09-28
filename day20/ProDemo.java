/*
 * Properties类的方法
 * 1、将属性列表输出到指定输出流
 * void list(PrintStream out)
 * void list(PrintWriter out)
 * 2、从指定输入流加载属性到集合中
 * void load(InputStream inStream)
 * void load(Reader r)
 * 3、将属性列表存到指定的输出流
 * void store(OutputStream out, String comments)
 * void store(Writer writer, String comments)
 * 4、设置属性
 * Object setProperty(String key, String value)
 * 底层调用的是HashTable的put方法，如果之前没有该key，就返回null，如果有，就返回之前的旧值
 * 5、获取属性
 * String getProperty(String key)
 * Set<String> stringPropertyNames()
 * */
import java.io.*;
import java.util.*;

class ProDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)throws IOException
	{
		//将属性列表输出到指定输出流
		Properties prop = new Properties();

		//从键盘录入属性存到指定文件中
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

		File dest = new File("prop.txt");
		BufferedWriter bufw = new BufferedWriter(new FileWriter(dest));
		
		String line = null;
		while((line = bufr.readLine()) != null)
		{
			if("over".equals(line))
				break;

			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}

		//从属性文件中加载属性信息
		prop.load(new FileInputStream(dest));
		prop.list(System.out);

		prop.store(new FileWriter("out.txt"), "hhhhhh");

		sop("set:"+prop.setProperty("color", "jjjjj"));
		sop("value = "+prop.getProperty("color"));
		
		bufr.close();
		bufw.close();
	}
}
