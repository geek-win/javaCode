import java.io.*;

class D
{
	public static void main(String[] args)throws IOException
	{
		BufferedInputStream bufis = new BufferedInputStream(new FileInputStream("FileDemo.java"));
		BufferedOutputStream bufos = new BufferedOutputStream(new FileOutputStream("f.java"));

		/*
		int ch = 0;
		while((ch = bufis.read()) != -1)
		{
			bufos.write(ch);
		}
		*/

		byte[] buf = new byte[1024];
		int len = 0;
		while((len = bufis.read(buf)) != -1)
		{
			bufos.write(buf, 0, len);
		}

		bufis.close();
		bufos.close();
	}
}
