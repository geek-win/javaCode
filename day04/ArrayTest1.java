/*
 * 进制转换
 * */
class ArrayTest1
{
	public static void main(String[] args)
	{
		toBin(60, 2);
		toBin(60, 8);
		toBin(60, 16);

		//创建容器
		StringBuffer sb = new StringBuffer();
		int num = 5;
		int num1 = num;
		
		while(num != 0)
		{
			sb.append(num & 1);
			num = num >>> 1;
		}

		System.out.println(num1+"-->"+sb.reverse());

		int a = 60;
		int b = a;

		StringBuffer sb1 = new StringBuffer();

		while(a != 0)
		{
			int temp = a & 15;

			//如果temp>9，那么就需要使用字母来代替数值，要进行转换
			if(temp > 9)
				sb1.append((char)(temp - 10 + 'A'));
			else
				sb1.append(temp);

			a = a >>> 4;
		}

		System.out.println(b+"-->0x"+sb1.reverse());

	}

	//十进制->二/八/十六进制
	public static void toBin(int num, int x)
	{
		char[] arr = new char[32];
		char[] ch = {
			'0','1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'
		};
		int pos = arr.length;
		int num1 = num;

		if(x == 2)
		{

			while(num != 0)
			{
				arr[--pos] = ch[num & 1];
				num = num >>> 1;
			}
			System.out.print(num1+"-->");
		}
		else if(x == 8)
		{
			while(num != 0)
			{
				arr[--pos] = ch[num & 7];
				num = num >>> 3;
			}
			System.out.print(num1+"-->O");
		}
		else if(x == 16)
		{
			while(num != 0)
			{
				arr[--pos] = ch[num & 15];
				num = num >>> 4;
			}
			System.out.print(num1+"-->0x");
		}

		for(int i = pos; i < 32; i++)
			System.out.print(arr[i]);

		System.out.println();
	}
}
