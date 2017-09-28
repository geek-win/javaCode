import java.io.*;

class PrintStreamDemo
{
	public static void main(String[] args)throws IOException
	{
		//读取键盘录入
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		
		//接收字节输出流
		//创建字符打印流
		//可以通过println
		//printf
		//format
		//来自动刷新
		//只是针对流的刷新，如果不是字节流，那就不能加true
		PrintWriter pw = new PrintWriter(System.out, true);
		PrintWriter pw1 = new PrintWriter(new FileWriter("a.txt"), true);
		BufferedWriter bufw = new BufferedWriter(pw);

		String line = null;
		while((line = bufr.readLine()) != null)
		{
			if("over".equals(line))
				break;

			/*
			bufw.write(line.toUpperCase());
			bufw.newLine();
			bufw.flush();
			*/
			pw1.println(line);
//			pw1.flush();
		}

		bufr.close();
		bufw.close();
		pw.close();
	}
}
