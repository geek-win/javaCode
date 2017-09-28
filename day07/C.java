/*
 * 获取程序运行时间
 * */
abstract class GetTime1
{
	public void getTime()
	{
		long start = System.currentTimeMillis();

		runcode();

		long end = System.currentTimeMillis();

		System.out.println("毫秒："+(end - start));
	}

	public abstract void runcode();
}

class Su extends GetTime1
{
	public void runcode()
	{

		for(int i = 0; i < 10000; i++)
			System.out.println("I love ll.");
	}
}

class C
{
	public static void main(String[] args)
	{
		Su s = new Su();

		s.getTime();
	}
}


