/*
 * 文件读取的方式二
 * 可以使用int read(char[] cbuf)
 * 会将文件读取流对象相关联的文件中的字符存到cbuf中
 * 返回存入的字符数
 * */
import java.io.*;

class FileReaderDemo1
{
	public static void main(String[] args)throws IOException
	{
		FileReader fr = new FileReader("haha.txt");

		//这样不太好，因为数组长度太小
		//读一下打印一次比较麻烦
		//所以可以
		//char[] buf = new char[1024];
		char[] buf = new char[3];

		//将fr相关联的文件中的字符存入字符数组buf中
		//返回存入的字符个数
		/*
		int num = fr.read(buf);
		System.out.println("num = "+num+", "+new String(buf));
		int num1 = fr.read(buf);
		System.out.println("num1 = "+num1+", "+new String(buf));
		int num2 = fr.read(buf);
		System.out.println("num2 = "+num2+", "+new String(buf));
		int num3 = fr.read(buf);
		System.out.println("num3 = "+num3+", "+new String(buf));
		int num4 = fr.read(buf);
		System.out.println("num4 = "+num4+", "+new String(buf));
		*/

		//循环将fr相关联文件内容存到字符数组中
		int n = 0;
		//当fr.read(buf)!=-1
		//意思是说当fr相关联的文件中已经全部读取结束了
		while((n = fr.read(buf)) != -1)
		{
			//n代表读入buf的字符个数
			//读入多少字符
			//就打印多少字符
			System.out.println(new String(buf, 0, n));
		}
		fr.close();
	}
}
