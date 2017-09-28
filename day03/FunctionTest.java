/*
 * 定义一个功能，根据长和宽，可以输出星号组成的矩形
 * */
class FunctionTest
{
	public static void main(String[] args)
	{
		int length = 5, width = 3;
		draw(3, 2);
		System.out.println("------------");
		draw(6, 5);
	}

	//打印矩形
	public static void draw(int length, int width)
	{
		for(int x = 0; x < width; x++)
		{
			for(int y =0; y < length; y++)
				System.out.print("*");

			System.out.println();
		}
	}
}
