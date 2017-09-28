/*
 * IO中有字节流和字符流
 * 字节流的两个基类：InputStream、OutputStream
 * 字符流的两个基类：Reader、Writer
 * 这些都是抽象的类，要使用必须创建其子类的对象
 * 其子类名称都是上述基类作为后缀，前缀是对应的功能
 * 比如Reader的子类FileReader
 * Writer的子类FileWriter
 * InputSteam的子类FileInputStream
 * 按处理对象分为字节流和字符流
 * 按流向分为输入流和输出流
 * 如果想对文件进行处理，需要创建FileWriter对象
 * */
import java.io.*;

class FileWriterDemo
{
	public static void main(String[] args)//throws IOException
	{
		/*
		//创建FileWriter对象
		//创建过程需要传入文件的绝对路径或者相对路径和名称
		//无论相对应的路径下有没有此文件，都会重新创建这个文件
		//如果原来有，那么就会被新的空文件覆盖
		//如果没有，就会直接创建新的
		//有可能会出现异常
		//所以需要声明异常
		FileWriter fw = new FileWriter("haha.txt");

		//如果只是write方法写入内容
		//是将内容写到流中
		//也就是缓冲区中
		//不是直接写到fw指向的文件中
		fw.write("I love java");
		//要想将流中缓冲区存的内容写到文件中
		//需要使用flush方法
		//fw.flush();

		//使用完流资源之后一定要关闭
		//关闭之前会先刷
		fw.close();
		*/

		//创建FileWriter对象
		//首先会根据构造函数中的文件路径和名称进行创建
		//然后创建FileWriter对象
		//调用write、flush、close等方法
		//这些方法都有异常
		//在外面创建对象，在try中处理
		//因此需要进行处理，不要抛出，需要trycatch
		//并且在close之前需要判断是否是空的
		//如果是空的就不需要close
		//如果不是空的才需要close
		FileWriter fw = null;

		try
		{
			fw = new FileWriter("/kk/haha.txt");
			fw.write("abcdefghijklmnopqrstuvwxyz");
			fw.write("\nI love LL~~~");
		}
		catch(IOException e)
		{
			System.out.println("CATCH:---"+e.toString());
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(fw != null)
					fw.close();
			}
			catch(IOException e)
			{
				System.out.println("--------------------------");
				System.out.println("22222---"+e.toString());
				e.printStackTrace();
				System.out.println("--------------------------");
		}

				
		}
	}
}
