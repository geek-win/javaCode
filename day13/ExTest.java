/*
 * 异常的复习
 * */
class A extends Exception
{

}
//定义负数异常类
class FuShuException extends RuntimeException
{
	private int num;

	//构造函数
	FuShuException(String message, int num)
	{
		super(message);
		this.num = num;
	}

	public void setNum(int num)
	{
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

//定义零异常
class ZeroException extends Exception
{
	private int num;

	ZeroException(String message, int num)
	{
		super(message);
		this.num = num;
	}

	public String toString()
	{
		return this.getMessage()+"----"+this.num;
	}
}


class Fu
{
	//由于负数异常和零异常都属于编译时异常
	//函数中抛出了该类异常
	//函数上应该声明该异常
	//并且调用者应该对其进行处理
	//要么进行trycatch处理
	//要么直接抛出
	int div(int a, int b)throws FuShuException, ZeroException
	{
		if(a < 0)
			throw new FuShuException("出现负数", a);
		if(b == 0)
			throw new ZeroException("出现0", b);
	}

	int mul(int a, int b)
	{
		int[] arr = new int[4];

		if(a > 3)
			throw new ArrayIndexOutOfBounds("角标越界啦～～");
	}
}

class Zi extends Fu
{
	int div(int a, int b)throws A
	{

	}
	int mul(int a, int b)
	{

	}
}

class Test
{
	public void show(Fu f)
	{
		try
		{
			f.div(3, 4);
		}
		catch(FuShuException e)
		{

		}
		catch(ZeroException e)
		{

		}
	}
}

class ExTest
{
	public static void main(String[] args)
	{
		Test t = new Test();
		t.show(new Fu());
		t.show(new Zi());

	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
