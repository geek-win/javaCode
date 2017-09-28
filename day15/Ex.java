/*
 * 复习异常
 * */
//负数异常
class A extends Exception
{
	//表示出现异常的负数值
	private int num;

	A(String msg, int num)
	{
		super(msg);
		this.num = num;
	}

	public String toString()
	{
		return this.getMessage()+"---"+this.num;
	}

	public int getNum()
	{
		return this.num;
	}
}

//除数是0
//0异常
class B extends Exception
{
	B(String msg)
	{
		super(msg);
	}

	public String toString()
	{
		return this.getMessage();
	}
}

//角标越界异常
class IndexEx extends RuntimeException
{
	private int index;

	IndexEx(String msg, int index)
	{
		super(msg);
		this.index = index;
	}

	public String toString()
	{
		return this.getMessage()+";;;"+this.index;
	}

	public int getIndex()
	{
		return this.index;
	}
}

class Fu
{
	public int div(int a, int b)throws A, B
	{
		//如果a是负数
		//抛出负数异常
		if(a < 0)
			throw new A("负数异常，值为：", a);
		if(a > 5)
			throw new IndexEx("角标越界", a);
		if(b == 0)
			throw new B("除数是0！！！");

		return a/b;
	}
	public void mul(int a, int b)
	{
		if(a > 8)
			throw new IndexEx("角标越界异常：", a);

		System.out.println("result = "+a*b);
	}
}

class C extends Exception
{
	C(String msg)
	{
		super(msg);
	}

}
//子继承父
//如果复写的函数中抛出了异常
//那么子类在复写的时候只能抛出父类中已经出现的异常或其子类
//也就是说子类不能抛出父类函数中没有出现的异常
//
class Zi extends Fu
{
	public int div(int a, int b)throws A// C
	{
		//如果a是负数
		//抛出负数异常
		if(a < 0)
			throw new A("负数异常，值为：", a);
		if(a > 5)
			throw new IndexEx("角标越界", a);
		/*
		if(a< b)
			throw new C("hh");
*/
		return a/b;
	}
}

class Ex
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		try
		{
			Fu f = new Fu();
			int n = f.div(4, 2);
			sop("n = "+n);
			//System.exit(0);
			//如果在finally之前执行了System.exit(0)
			//那么finally中的内容就不会再执行了
		}
		catch(A e)
		{
			sop(e.toString());
			sop("出现了负数异常啦～～～～");
			e.printStackTrace();
		}
		catch(B e)
		{
			sop(e.toString());
			sop("出现了零异常啦～～～～");
			e.printStackTrace();
		}
		catch(IndexEx e)
		{
			sop(e.toString());
			sop("出现了角标异常啦～～～～");
			e.printStackTrace();

		}
		finally
		{
			sop("I love ll.");
		}
	
		/*
		try{
			
		new Fu().mul(10, 4);
		}
		catch(IndexEx e)
		{
			sop(e.toString());
			sop("出现了角标异常啦～～～～");
			e.printStackTrace();

		}
		*/
		Fu zi = new Zi();
		zi.mul(6, 6);
	}
}
