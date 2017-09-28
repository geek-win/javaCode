/*
 * 序列流
 * SequenceInputStream(InputStream s1, InputStream s2)
 * SequenceInputStream(Enumeration<? extends InputStream> e)
 * */
import java.io.*;
import java.util.*;

class SequenceDemo
{
	public static void main(String[] args)throws IOException
	{
		//创建分隔文件
		BufferedWriter bufw = new BufferedWriter(new FileWriter("f.txt"));
		bufw.write("-----------------------------------");
		bufw.newLine();
		bufw.flush();

		//将多个源文件合并到一个流中
		Vector<InputStream> v = new Vector<InputStream>();

		v.add(new FileInputStream("1.txt"));
		v.add(new FileInputStream("f.txt"));
		v.add(new FileInputStream("2.txt"));
		v.add(new FileInputStream("f.txt"));
		v.add(new FileInputStream("3.txt"));

		//将枚举对象传入序列流构造函数
		//字节输入流，就是源
		SequenceInputStream sis = new SequenceInputStream(v.elements());

		//将字节输入流转成字符读取流
		//创建字符写入流
		BufferedWriter bufw1 = new BufferedWriter(new FileWriter("6.txt"));
		BufferedReader bufr = new BufferedReader(new InputStreamReader(sis));

		String line = null;
		while((line = bufr.readLine()) != null)
		{
			bufw1.write(line);
			bufw1.newLine();
			bufw1.flush();
		}

		/*
		//创建目的。字节读取流
		FileOutputStream fos = new FileOutputStream("5.txt");

		//创建数组
		byte[] buf = new byte[1024];
		int len = 0;
		while((len = sis.read(buf)) != -1)
		{
			fos.write(buf, 0, len);
		}
		*/
		/*
		int ch = 0;
		while((ch = sis.read()) != -1)
		{
			fos.write(ch);
		}
		*/

		bufw.close();
		bufw1.close();
		sis.close();
		//fos.close();

	}
}

