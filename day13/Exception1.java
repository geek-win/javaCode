/*
 * 自定义异常
 * */
class FuException extends RuntimeException
{
	private int num;

	FuException(String msg, int num)
	{
		super(msg);
		this.num = num;
	}

	public int getNum()
	{
		return this.num;
	}

	public String toString()
	{
		return this.getMessage()+"----"+this.getNum();
	}
	
}

class Exception1
{
	public static void div(int a, int b)
	{
		if(a < 0)
			throw new FuException("负数异常", a);

		System.out.println(a+b);
	}
	public static void main(String[] args)
	{
/*
		try
		{
			div(-3, 4);
		}
		catch(RuntimeException e)
		{
			System.out.println(e.toString());
		}
*/
		div(-3, 4);
	}
}
