/*
 * 如果for循环中的for的判断条件不能判断，就无法编译通过
 * for中的第一个分号之前的是个表达式，不一定是个int x = 0类型的表达式，只要是表达式即可
 * */
class ForTest
{
	public static void main(String[] args)
	{
		/*
		int x = 1;
		for(System.out.println("a"); x < 3; System.out.println("c"))
		{
			System.out.println("d");
			x++;
		}
		*/
		//获取1-10的和并打印
		/*使用for
		int sum = 0;
		
		for(int i = 1; i < 11; i++)
			sum += i;

		System.out.println("1-10的和 = "+sum);
		*/

		int sum = 0;
		int n = 1;

		while(n <= 10)
			sum += n++;

		System.out.println("1-10的和 = "+sum);

		//获取1-100之间7的倍数的个数，并依次打印
		int count = 0;//初始化7的倍数的数的个数为0

		for(int i = 1; i <= 100; i++)
		{
			if(i % 7 == 0)
			{
				count++;
				System.out.println(i);
			}
		}
		System.out.println("1-100中7的倍数有"+count+"个");
	}
}
