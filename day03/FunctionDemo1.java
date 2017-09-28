/*
 * 需求：定义一个功能，完成加法
 * 分析：
 * 1、函数返回值是两个数的和，其返回类型是int
 * 2、需要两个形式参数，作为加数，参数列表，就是括号中的东西，参数类型和个数
 * */
class FunctionDemo1
{
	public static void main(String[] args)
	{
		int x = 3, y = 5;
		
		if(compare(x, y))
			System.out.println("x = y");
		else
			System.out.println("x != y");

		System.out.println(x+"与"+y+"中较大值为"+getMax(x, y));
	}

	//比较两数是否相等
	//返回值类型：true、false
	//参数类型int，2个
	public static boolean compare(int a, int b)
	{
		/*
		if(a == b)
			return true;
		else
			return false;
		*/
//		return (a == b)? true: false;

		return a == b;

	}

	//定义功能，获取较大
	//返回值类型int
	//参数类型int，2个
	public static int getMax(int a, int b)
	{
		return (a > b)? a: b;
	}
}

