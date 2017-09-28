/*
 * 进制转换
 * */
class ConSys
{
	public static void main(String[] args)
	{
		toBin(10);
		toOct(23);
		toHex(60);

		conSys(10, 2);
		conSys(23, 8);
		conSys(60, 16);

		System.out.println("10-->"+Integer.toBinaryString(10));
	}

	/*
	 * 查表法进制转换
	 * 定义0-F长度16的char类型数组，每次从其中选值
	 * */
	public static void toBin(int num)
	{
		int[] arr = new int[32];//定义长度32的整型数组，存放十进制数的二进制形式
		int pos = arr.length;
		int num1 = num;

		while(num != 0)
		{
			arr[--pos] = num & 1;
			num = num >>> 1;
		}

		//输出二进制形式
		System.out.print(num1+"--->");
		for(int i = pos; i < arr.length; i++)
			System.out.print(arr[i]);

		System.out.println();
	}

	//十进制转八进制
	public static void toOct(int num)
	{
		int[] arr = new int[32];
		int pos = arr.length;
		int num1 = num;

		while(num != 0)
		{
			arr[--pos] = num & 7;
			num = num >>> 3;
		}

		System.out.print(num1+"--->O");
		for(int i = pos; i < arr.length; i++)
			System.out.print(arr[i]);

		System.out.println();
	}

	//十进制转十六进制
	public static void toHex(int num)
	{
		//由于16进制涉及到了字母，因此选用查表法求十六进制
		char[] arr = new char[32];//存放十六进制形式
		char[] ch = {
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
		};
		int num1 = num;
		int pos = arr.length;

		while(num != 0)
		{
			arr[--pos] = ch[num & 15];
			num = num >>> 4;
		}

		System.out.print(num1+"--->0x");
		for(int i = pos; i < arr.length; i++)
			System.out.print(arr[i]);

		System.out.println();
	}

	//查表法自主选择进行进制转换
	public static void conSys(int num, int x)
	{
		//存放转换后的值
		char[] arr = new char[32];
		char[] ch ={
			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
		};//标准数组

		int pos = arr.length;

		switch(x)
		{
			case 2:
				System.out.print(num+"--->");
				while(num != 0)
				{
					arr[--pos] = ch[num & 1];
					num = num >>> 1;
				}
				break;
			case 8:
				System.out.print(num+"--->O");
				while(num != 0)
				{
					arr[--pos] = ch[num & 7];
					num = num >>> 3;
				}
				break;
			case 16:
				System.out.print(num+"--->0x");
				while(num != 0)
				{
					arr[--pos] = ch[num & 15];
					num = num >>> 4;
				}
				break;
			default:
				System.out.println("Please input correct num(2/8/16).");
				break;
		}

		for(int i = pos; i < arr.length; i++)
			System.out.print(arr[i]);

		System.out.println();
	}
}
