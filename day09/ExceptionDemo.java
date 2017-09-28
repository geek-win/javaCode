/*
 * 异常类的演示
 * */
//创建一个负数异常，出现负数时抛出异常
class MinusException extends RuntimeException
{
	private int value;

	MinusException(String msg)
	{
		super(msg);
	}

	MinusException(String msg, int value)
	{
		super(msg);
		this.value = value;
	}

	public void setValue(int value)
	{
		this.value = value;
	}

	public int getValue()
	{
		return this.value;
	}

	public String toString()
	{
		return this.getMessage()+"::"+this.value;
	}
}

class Demo
{
	int div(int a, int b) throws Exception
	{
		if(b == 0)
			throw new Exception("除零");

		return a/b;
	}

	int mul(int a, int b)throws MinusException
	{
		if(a < 0)
			throw new MinusException("乘数a是负数，值为", a);

		return a*b;
	}
}

class ExceptionDemo
{
	public static void main(String[] args)
	{
		Demo d = new Demo();

		try{
			int x = d.div(4, 0);
			System.out.println("x---"+x);
		}
		catch(Exception e){

			System.out.println(e.toString());
			System.out.println("-----------");

			e.printStackTrace();
		}

		try
		{
			int y = d.mul(-1, 2);
			System.out.println("y = "+y);
		}
		catch(Exception e)
		{
			System.out.println(e.toString());

			System.out.println("----------");

			e.printStackTrace();
		}

		System.out.println("over");
	}
}
