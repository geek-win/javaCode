/*
 * 多异常处理
 * 对于某个方法，如果可能有多个异常，需要都抛出来
 * 对于调用该方法的方法，应该继续抛出所有的异常，或者try catch，catch应该捕获多个异常
 *
 * 现在进行演示，除零异常&角标越界异常
 * */
class Demo
{
	int div(int a,int b)throws ArithmeticException, ArrayIndexOutOfBoundsException
	{
		int[] array =  new int[4];
		if(a >= 4)
			throw new ArrayIndexOutOfBoundsException("角标越界----");

		System.out.println(array[a]);

		if(b == 0)
			throw new ArithmeticException("除零了");

		return a/b;
	}
}

class ExceptionDemo1
{
	public static void main(String[] args)
	{
		Demo d = new Demo();
	
		try
		{
			int x = d.div(5, 0);
			System.out.println("x="+x);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.toString());
			e.printStackTrace();
			System.out.println("除零异常----------------");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.toString());
			e.printStackTrace();
			System.out.println("角标越界异常----------------");
		}
		catch(Exception e)
		{
			System.out.println("hahha"+e.toString());
		}
		
		System.out.println("----------over--------");
	}
}
