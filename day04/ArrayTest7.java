/*
 * 集成多种形式进制转换
 * 因为他们的形式都差不多，所以抽取相同部分构建函数，提高代码复用性
 * */
class ArrayTest7
{
	public static void main(String[] args)
	{
		toBin(10);
		toOct(60);
		toHex(60);

	}

	//十进制转二进制
	public static void toBin(int num)
	{
		trans(num, 1, 1);
	}

	//十进制转八进制
	public static void toOct(int num)
	{
		trans(num, 7, 3);
	}

	//十进制转十六进制
	public static void toHex(int num)
	{
		trans(num, 15, 4);
	}

	//定义函数，完成进制转换基本操作
	public static void trans(int num, int base, int offset)
	{
		char[] arr = new char[32];//存放转换后的形式
		char[] ch = {
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
		};

		int pos = arr.length;

		switch(base)
		{
			case 1:
				System.out.print(num+"---->");
				break;
			case 7:
				System.out.print(num+"---->O");
				break;
			case 15:
				System.out.print(num+"---->0x");
		}

		while(num != 0)
		{
			arr[--pos] = ch[num & base];
			num = num >>> offset;
		}

		for(int i = pos; i < arr.length; i++)
			System.out.print(arr[i]);

		System.out.println();
	}
	
}
