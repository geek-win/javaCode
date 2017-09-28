/*
 * Reader的读取方式
 * 将文件读取流对象相对应的文件内容存到字符数组中
 * */
import java.io.*;

class FileReaderDemo2
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)throws IOException
	{
		FileReader fr = new FileReader("haha.txt");

		int n = 0;
		char[] buf = new char[3];

		while((n = fr.read(buf)) != -1)
		{
			sop(new String(buf, 0, n));
		}
		fr.close();
	}

}
