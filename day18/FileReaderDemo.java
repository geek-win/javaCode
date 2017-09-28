/*
 * FileReader
 * 是Reader的子类
 * 方法有close关闭、read读取等方法
 *
 * */
import java.io.*;

class FileReaderDemo
{
	public static void main(String[] args)throws IOException
	{
		//创建文件读取流对象，并且和指定名称的文件相关联
		//关闭、读取等方法都是和该文件相关联的
		FileReader fr = new FileReader("haha.txt");
/*
		int ch1 = fr.read();
		System.out.println("char = "+(char)ch1);
		System.out.println("char = "+(char)fr.read());
*/

		/*
		 * 对于read()方法
		 * 如果对应的文件中没有可读字符
		 * 就返回-1
		 * 如果有可读字符
		 * 就返回对应的字符
		 * */
		int ch;
		while((ch = fr.read()) != -1)
			System.out.println((char)ch);

		fr.close();
		
		
	}
		
}
