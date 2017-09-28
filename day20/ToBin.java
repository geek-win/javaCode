/*
 * 二进制转换
 * */
import java.io.*;
class ToBin
{
	public static void main(String[] args)throws IOException
	{
		sop("toBin1");
		toBin1(6);
		sop("toBin2");
		toBin2(6);
		sop("toBin3");
		toBin3(6);
		sop("toBin4");
		toBin4(6);
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void toBin1(int num)
	{
		if(num > 0)
		{
			toBin1(num/2);
			sop(num%2);
		}
	}

	public static void toBin2(int num)
	{
		while(num > 0)
		{
			sop(num % 2);
			num = num/2;
		}
	}

	public static void toBin3(int num)
	{
		StringBuilder sb = new StringBuilder();
		while(num > 0)
		{
			sb.append(num%2);
			num = num/2;
		}
		sop(sb.reverse());
	}

	public static void toBin4(int num)throws IOException
	{
		int[] arr = new int[32];
		int pos = arr.length;

		while(num > 0)
		{
			arr[--pos] = num % 2;
			num = num/2;
		}

		System.setOut(new PrintStream("a.txt"));
		for(int i = pos; i < arr.length; i++)
		{
			System.out.print(arr[i]);
		}
	}
}
