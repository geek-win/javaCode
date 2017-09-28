import java.io.*;

class A
{
	public static void main(String[] args)
	{
		File f1 = new File("a.txt");
		File f2 = new File("c.txt");

		System.out.println(f2.renameTo(f1));
	}
}
