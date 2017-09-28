/*
 * 练习补全代码
 * 但这个补全不是匿名类
 * */
interface Inter
{
	public abstract void method();
}

class Test
{
	//补全代码
	/*
	 * 分析，因为是Test.function().method()
	 * 可以看出，function应该是Test类中的静态函数，并且参数为空
	 * 后面调用了method()
	 * 而调用metho方法的应该是Inter的子类对象
	 * 所以function方法应该返回Inter的子类对象
	 * */
	static class Inner implements Inter
	{
		public void method()
		{
			System.out.println("method run");
		}
	}

	static Inter function()
	{
		return new Inner();

	}
}

class InnerClassTest
{
	public static void main(String[] args)
	{
		Test.function().method();
	}
}
