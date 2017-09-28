/*
 * 自定义负数异常
 */
class FuShuException extends RuntimeException
{
	private int num;
	
	FuShuException(String message, int num)
	{
		super(message);

		this.num = num;
	}

	public int getNum()
	{
		return this.num;
	}

	public String toString()
	{
		return this.getMessage()+"---"+this.getNum();
	}
}

class Test
{
	int div(int a, int b)
	{
		if(a > 3)
			throw new ArrayIndexOutOfBoundsException("角标越界");
		if(b < 0)
			throw new FuShuException("负数异常", b);
		if(b == 0)
			throw new RuntimeException("除零");

		return a/b;
	}
}

class Exception
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		/*
		sop(new Test().div(3, 1));
		sop(new Test().div(3, -1));
*/
		try
		{
			sop(new Test().div(3, 0));
		}
		catch(FuShuException e)
		{
			sop(e.toString());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			sop(e.toString());
		}
		catch(RuntimeException e)
		{
			sop(e.toString());
		}
	}
}
