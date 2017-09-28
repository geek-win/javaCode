/*
 * 用匿名内部类补全代码
 * */
interface Inter
{
	public abstract void method();
}

class Test
{
	static Inter function()
	{
		return new Inter()
		{
			public void method()
			{
				System.out.println("method run.hahaha");
			}

		};
			
	}

}

class InnerTest
{
	public static void main(String[] args)
	{
		Test.function().method();
		//Inter in = Test.function();
		//in.method();
	}
}
