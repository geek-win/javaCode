/*
 * 演示对已有文件的数据续写
 * */
import java.io.*;

class FileWriterDemo1
{
	public static void main(String[] args) throws IOException
	{
		//传递true参数，代表不覆盖已有文件，并在已有文件的末尾处进行数据续写
		FileWriter fw =  new FileWriter("haha.txt", true);

		fw.write("\nhello");

		char[] ch = {
			'a', 'b', 'c', 'd', 'e'
		};

		fw.write(ch);

		fw.write("\n");
		fw.write(ch, 2, 2);
		fw.write("\n");
		fw.write(23);

		String s = "hello";
		fw.write(s, 2,2);

		fw.close();
	}
}
