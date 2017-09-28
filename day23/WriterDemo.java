/*
 * 写入流
 * 对文件进行写操作
 * 需要创建文件写入流，并且和被写入文件建立关联关系
 * */
import java.io.*;

class WriterDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)throws Exception
	{
		//创建文件写入流
		//用来给文件写入数据
		FileWriter fw = new FileWriter("haha.txt", true);

		/*
		//写入数据
		char[] buf = {
			'a', 'c', 'e', 'c', 't'
		};
		String str = "\nhello, world";

		//fw.write()其实就是将数据写到流中
		fw.write(str);
		fw.write(buf, 0 , 3);
		fw.write("hhhhh");
*/

		//创建缓冲区
		//用来提高数据写入流的效率
		//构造函数中传入需要提高效率的写入流
		BufferedWriter bufw = new BufferedWriter(fw);

		//先将缓冲区中存入数据
		//将数据写到缓冲区中
		bufw.write("abcde");
	
		//缓冲区将数据刷到文件中
		bufw.flush();
		bufw.close();

		//关闭资源
		fw.close();

	}
}
