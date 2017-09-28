/*
 * 测试多异常
 * */
class B extends Exception
{
	B(String name)
	{
		super(name);
	}

}
class C extends Exception
{
	C(String name)
	{
		super(name);
	}
}
class A
{
	int div(int a)throws B,C
	{
		if(a == 0)
			throw new B("0异常");

		if(a < 10)
			throw new C("角标越界异常");

		return a;
	}
}

class ExDemo
{
	public static void main(String[] args)
	{
		A a = new A();

		try
		{
			a.div(1000);
		}
		catch(Exception e)
		{

		}
		finally
		{
			System.out.println("hahha");
		}

	}
}


B extends A
C extends Exception

class Fu
{
	void show()throws A
	{

	}
}

class Zi extends Fu
{
	void show()throws B
	{

	}
}

class Test
{
	public void function(Fu f)
	{
		try
		{
			f.show();
		}
		catch(A e)
		{

		}
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Test t = new Test();
		t.function(new Zi());//多态
		//如果Zi中的show方法抛出C异常
		//那就编译失败
		t.function(new Fu());
		
	}
}



