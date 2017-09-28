/*
 * PrintWriter
 * */
import java.io.*;

class PD
{
	public static void main(String[] args)throws IOException
	{
		//字节打印流
		PrintStream ps = new PrintStream(new FileOutputStream("lal.txt"));

		//字符打印流
		PrintWriter pw = new PrintWriter(new FileWriter("qqq.txt"), true);

		/*
		BufferedInputStream bufis = new BufferedInputStream(new FileInputStream("6.txt"));
		BufferedReader bufr = new BufferedReader(new FileReader("FileDemo.java"));

		String line = null;
		while((line = bufr.readLine()) != null)
		{
			pw.println(line);
		}

		int ch = 0;
		while((ch = bufis.read()) != -1)
		{
			ps.print((char)ch);
			
		}
		*/
		
		BufferedReader bufr = new BufferedReader(new FileReader("FileDemo.java"));

		String line = null;
		while((line = bufr.readLine()) != null)
		{
			pw.println(line);
		}

		bufr.close();
		pw.close();
		ps.close();
	}
}
