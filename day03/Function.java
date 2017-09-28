/*
 * 函数的简单应用
 * */
class Function
{
	public static void main(String[] args)
	{
		int x = 2, y =4;
		System.out.println(getResult(x, y));
		printNum(66);
	}

	//修饰符 返回值类型 函数名(参数类型 形式参数1，参数类型 形式参数2，...)
	public static int getResult(int a, int b)
	{
		return a*b;
	}

	//打印
	public static void printNum(int num)
	{
		System.out.println(num);
		//return;可以省略
	}
}
