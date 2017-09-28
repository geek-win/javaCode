/*
 * SequenceInputStream
 * SequenceInputStream(Enumeration<? extends InputStream> en)
 * 首先要创建一个Vector集合，里面是InputStream对象，然后使用elements方法返回枚举
 * SequenceInputStream(InputStream in1, InputStream in2)
 * */
import java.io.*;
import java.util.*;

class SeDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)throws IOException
	{
		//创建Vecto集合
		//源文件是三个，将其合并为一个
		//使用序列流
		Vector<FileInputStream> v = new Vector<FileInputStream>();

		v.add(new FileInputStream("1.txt"));
		v.add(new FileInputStream("2.txt"));
		v.add(new FileInputStream("3.txt"));

		//获取枚举对象
		Enumeration<FileInputStream> en = v.elements();

		SequenceInputStream sis = new SequenceInputStream(en);

		/*
		//创建目的
		BufferedWriter bufw = new BufferedWriter(new FileWriter("total.txt"));

		//将字节输入流转成字符流
		BufferedReader bufr = new BufferedReader(new InputStreamReader(sis));

		String line = null;
		while((line = bufr.readLine()) != null)
		{
			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}

		bufw.close();
		bufr.close();
		*/
		//直接使用字节流也可以，因为不涉及编码问题
		FileOutputStream fos = new FileOutputStream("4.txt");

		byte[] buf = new byte[1024];
		int len = 0;
		while((len = sis.read(buf)) != -1)
		{
			fos.write(buf, 0, len);
		}

		sis.close();
		fos.close();


	}
}
