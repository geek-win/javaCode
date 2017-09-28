import java.util.*;

class MathDemo
{
	public static void main(String[] args)
	{
		//使用Math的方法产生随机数
		//1-10
		for(int i = 0; i < 10; i++)
		{
			int x = (int)(Math.random()*10+1);
			System.out.println(x);
		}

		System.out.println("---------------------");

		Random r = new Random();
		for(int i = 0; i < 10; i++)
		{
			int x = r.nextInt(10)+1;
			System.out.println(x);
		}
	}
}
