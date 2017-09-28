/*
 * 进行位运算*/
class WeiOperate
{
	public static void main(String[] args)
	{
		/*
		int i = 2;
		//输出i×8，相当于左移3位
		System.out.println(i << 3);
		//定义a，b，并交换二者的值,方法1，使用第三方变量
		int a = 2, b = 5;
		System.out.println("a = "+a+", b = "+b);
		int c = a;
		a = b;
		b = c;
		
		System.out.println("a = "+a+", b = "+b);
		*/

		//不用第三方变量
		/*
		 * 11 = 3 + 8;
		 * 3 = 11 - 8;
		 * 8 = 11 - 3;
		 *A1 
		 * n = n + m;
		 * m = n - m;
		 * n = n - m;
		 * 但是有问题，容易损失精度，万一n和m的值比较大
		 * 可能相加之后会超出int范围
		 * A2
		 * n = n ^ m;
		 * m = n ^ m;
		 * n = n ^ m;
		 * 这种方法不会出现精度损失的情况
		 * 实际开发中还是要用第三方变量来进行交换
		*/
		/*使用减法进行值的交换
		int m = 3, n = 4;
		System.out.println("m = "+m+", n ="+n);

		n = n + m;
		m = n - m;
		n = n - m;
		
		System.out.println("m = "+m+", n ="+n);
		*/

		int m = 3, n = 4;
		System.out.println("m = "+m+", n ="+n);

		n = n ^ m;
		m = n ^ m;
		n = n ^ m;
		
		System.out.println("m = "+m+", n ="+n);
	}
}
