import java.io.*;

class RW
{
	public static void main(String[] args)throws IOException
	{
		InputStream in = System.in;

		PrintStream out = System.out;

		/*
		int ch = 0;
		while((ch = in.read()) != -1)
		{
			out.write(ch);
		}
		*/
		byte[] buf = new byte[1024];
		int pos = 0;
		int ch = 0;
		while((ch = in.read()) != -1)
		{
			if(ch == '\n')
			{
				out.write(buf, 0, pos);
				out.println();
			}
			else
				buf[pos++] = (byte)ch;
		}
		if(pos > 0)
			out.write(buf, 0, pos);

		in.close();
		out.close();
	}
}
