/*
 * for，for循环
 * *
 */
class ForForDemo
{
	public static void main(String[] args)
	{
		/*
		for(int x = 0; x < 3; x++)
		{
			for(int y = 1; y < 4 - x; y++)
				System.out.print("*");
			System.out.println();
		}
		
		for(int x = 0; x < 3; x++)
		{
			for(int y = 0; y <= x; y++)
				System.out.print("*");
			System.out.println();
		}
		*/

		//按照54321个“*”的形式输出5行
		for(int x = 5; x > 0; x--)
		{
			for(int y = 0; y < x; y++)
				System.out.print("*");
			System.out.println();
		}
		//按照12345个“*”的形式输出5行
		for(int x = 0; x < 5; x++)
		{
			for(int y = 0; y < x + 1; y++)
				System.out.print("*");
			System.out.println();
		}

		//输出1 12 123 1234 12345
		for(int x = 1; x <= 5; x++)
		{
			for(int y = 1; y <= x; y++)
				System.out.print(y);

			System.out.println();
		}
	}
}
