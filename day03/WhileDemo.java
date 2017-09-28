/*
 * while(表达式)
 * {
 *		循环体;
 * }
 * */
class WhileDemo
{
	public static void main(String[] args)
	{
		int x = 5;

		while(x != 0)
		{
			System.out.println("x = "+x);
			x--;
		}

		do
		{
			System.out.println("x = "+x);
			x++;
		}while(x>5);
	}
}
