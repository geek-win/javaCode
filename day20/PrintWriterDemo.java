/*
 * 打印流：
 * 1、PrintStream
 * 1）构造函数
 *		PrintStream(File file)
 *		PrintStream(String pathname)
 *		PrintStream(OutputStream out)
 * 2、PrintWriter
 *		PrintWriter(File file)
 *		PrintWriter(String pathname)
 *		PrintWriter(OutputStream out)
 *		PrintWriter(Writer out
 *		PrintWriter(OutputStream out, boolean autoFlush)
 *		PrintWriter(Writer out, boolean autoFlush)
 *		后两方法可以进行自动刷新，在使用pw.println\format\printf方法的时候
 *		可以直接将数据写到目的文件中
 * */
import java.io.*;

class PrintWriterDemo
{
	public static void main(String[] args)throws IOException
	{
		//创建字符打印输出流
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("a.java")), true);
		
		BufferedReader bufr = new BufferedReader(new FileReader("FileDemo.java"));

		String line = null;

		while((line = bufr.readLine()) != null)
		{
			pw.println(line);
			
		}

	//	pw.close();
		bufr.close();
	}
}
