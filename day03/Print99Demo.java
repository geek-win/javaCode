/*
 * 打印乘法表，使得调用灵活且容易
 * 定义加法函数的重载形式
 * */
class Print99Demo
{
	public static void main(String[] args)
	{
		//44乘法表
		print99(4);
		printLine();
		//99乘法表
		print99(9);

		//加法函数
		System.out.println("2 + 4 = "+add(2,4));
		System.out.println("3 + 4 + 5 = "+add(3, 4, 5));
	}

	//定义函数，输出分割线
	public static void printLine()
	{
		System.out.println("-------------------------------");
	}

	//定义乘法表
	public static void print99(int num)
	{
		for(int x = 1; x <= num; x++)
		{
			for(int y = 1; y <= x; y++)
				System.out.print(y+"*"+x+" = "+x*y+"  ");

			System.out.println();
		}
	}

	//99乘法表
	public static void print99()
	{
		print99(9);
	}

	//普通二值加法
	public static int add(int x, int y)
	{
		return x + y;
	}

	//三值加法
	public static int add(int x, int y, int z)
	{
		return add(x, y) + z;
	}
}
