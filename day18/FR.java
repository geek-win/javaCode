import java.io.*;

class FR
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)throws IOException
	{
		FileReader fr = new FileReader("FileReaderDemo.java");

		/*
		int n1 = 0;
		while((n1 = fr.read()) != -1)
			sop((char)n1);
		*/

		int num = 0;
		char[] buf = new char[1024];

		while((num = fr.read(buf)) != -1)
			sop(new String(buf, 0, num));

/*
		//因为放到这里的时候fr关联的文件已经全部被读取完
		//所以这时就不会在输出了
		int n = 0;
		while((n = fr.read()) != -1)
			sop((char)n);
*/
		fr.close();
	}
}
