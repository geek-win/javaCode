/*
 * 实现BufferedReader和BufferedInputStream类的功能
 * */
import java.io.*;

//用来给字符读取流提高读取效率的
class MBR extends Reader
{
	//需要被提高读取效率的字符读取流
	private Reader r;

	MBR(Reader r)
	{
		this.r = r;
	}

	public void close()throws IOException
	{
		if(r != null)
			r.close();
	}
	public int read(char[] cbuf, int off, int length)throws IOException
	{
		return r.read(cbuf, off, length);
	}

	//读取文本行
	public String myReadLine()throws IOException
	{
		char[] buf = new char[1024];
		int pos = 0;
		int ch = 0;

		while((ch = r.read()) != -1)
		{
			if(ch == '\n')
			{
				return new String(buf, 0, pos);
			}
			else
				buf[pos++] = (char)ch;
		}
		if(pos > 0)
			return new String(buf, 0, pos);

		return null;
	}
}

class MLN extends MBR
{
	//需要被提高读取效率的字符读取流对象父类中有这里不写了
	//行号
	private int lineNumber;

	MLN(Reader r)
	{
		super(r);	
	}

	//设置或者行号
	public void setLineNumber(int lineNumber)
	{
		this.lineNumber = lineNumber;
	}
	public int getLineNumber()
	{
		return this.lineNumber;
	}

	//读取文本行
	public String myReadLine()throws IOException
	{
		//每次读一行，就会增加1行
		//也是通过提高读取效率的字符读取流对象的read方法读到缓冲区
		lineNumber++;

		/*
		StringBuilder sb = new StringBuilder();
		int ch = 0;
	
		while((ch = r.read()) != -1)
		{
			if(ch == '\n')
			{
				return sb.toString();
			}
			else
				sb.append((char)ch);
		}

		if(sb.length() > 0)
			return sb.toString();

		return null;
*/
		return super.myReadLine();
	}
}

class MBI
{
	//字节输入流对象
	private InputStream in;

	//缓冲区字节数组
	private byte[] buf = new byte[1024];
	//指针和计数器
	private int pos = 0, count = 0;

	MBI(InputStream in)
	{
		this.in = in;
	}
	//关闭资源
	public void myClose()throws IOException
	{
		if(in != null)
			in.close();
	}

	//读取
	//调用in的read方法读到缓冲区，然后调用read方法从缓冲区中读取数据
	public int myRead()throws IOException
	{
		if(count == 0)
		{
			count = in.read(buf);
			if(count < 0)
				return -1;

			pos = 0;
			byte b = buf[pos];
			pos++;
			count--;

			return b&255;
		}
		else if(count > 0)
		{
			byte b = buf[pos];
			pos++;
			count--;

			return b&255;
		}

		return -1;
	}
}

class FileDemo
{
	public static void main(String[] args)throws IOException
	{
		//创建读取流
		MBR mbr = new MBR(new InputStreamReader(System.in));
		MLN mln = new MLN(new InputStreamReader(System.in));
		MBI mbi = new MBI(new FileInputStream("/home/zhshuang/桌面/p1.png"));

		//创建写入流
		BufferedWriter bufw = new BufferedWriter(new FileWriter("out.txt"));
		BufferedOutputStream bufout = new BufferedOutputStream(new FileOutputStream("/home/zhshuang/桌面/11.png"));

	
		String line = null;
		mln.setLineNumber(10);
		while((line = mln.myReadLine()) != null)
		{
			if("over".equals(line))
				break;

			bufw.write(mln.getLineNumber()+"---"+line);
			bufw.newLine();
			bufw.flush();
		}
		
/*
		int ch = 0;
		while((ch = mbi.myRead()) != -1)
		{
			bufout.write(ch);
		}
*/


		bufw.close();
		mbr.close();
		mln.close();
		mbi.myClose();
		bufout.close();
		
	}
}
