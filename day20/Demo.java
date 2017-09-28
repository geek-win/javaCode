/*
 * PrintStream
 * PrintWriter
 * */
import java.io.*;

class Demo
{
	public static void main(String[] args)throws IOException
	{
		/*
		//创建字节打印流
		//是输出流
		PrintStream ps = new PrintStream(new FileOutputStream("A.txt"));
		//创建写入流
		BufferedInputStream bufis = new BufferedInputStream(System.in);

		int ch = 0;
		while((ch = bufis.read()) != -1)
		{
			ps.print((char)ch);
		}

		ps.close();
		bufis.close();
	*/
		//创建字符打印流
		PrintWriter pw = new PrintWriter(System.out, true);
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));

		String line = null;
		while((line = bufr.readLine()) != null)
		{
			if("over".equals(line))
				break;

			pw.println(line);
		}

	}
}
