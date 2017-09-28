/*
 * 内部类
 * */
class Outer
{
	private int x = 3;
	static int y = 8;

	void method()
	{
		System.out.println("Outer method:");

		Inner in = new Inner();
		in.function();
	}

	//内部类
	class Inner
	{
		int x = 4;

		void function()
		{
			int x = 5;
			System.out.println("Outer.x:"+Outer.this.x);
			System.out.println("Inner.x:"+this.x);
			System.out.println("function.x:"+x);
		}

		/*
		//编译失败，因为非静态内部类中不能定义静态成员
		static int y = 2;
		static void staticA()
		{
			System.out.println("非静态内部类中的静态成员方法");
		}
		*/
	}

	//静态内部类
	//静态内部类可以直接被外部类名调用，其对象创建也直接用外部类名即可
	static class A
	{
		void show()
		{
	//		System.out.println("内部类A:"+x);//编译失败，因为x是外部类的非静态变量
			System.out.println("内部类A："+y);
	
		}

		static void staticB()
		{
			System.out.println("静态内部类的静态方法直接用外部类名.内部类名即可");
		}
	}

	//定义一个静态方法
	public static void method1()
	{
		new A().show();
		A.staticB();
		//该方法是静态的，只能访问静态的方法，所以不能有对象存在
		//所以不能直接调用非静态内部类的方法
		/*
		 * new Inner().function();是错的
		 * 那该怎么办呢？
		 * 只能把非静态内部类改成静态的
		 * */

	}
}

class InnerClassDemo
{
	public static void main(String[] args)
	{
		//如果内部类Inner被封装，即其前面加上了private修饰符
		//就不能这么创建其对象了
		Outer.Inner in = new Outer().new Inner();
		in.function();
		
		Outer out = new Outer();
		out.method();

		System.out.println("-----------------------------------");

		//创建静态内部类的对象
		Outer.A a = new Outer.A();
		a.show();
		
		new Outer.A().show();
		Outer.A.staticB();
		System.out.println("-----------------------------------");

		out.method1();

	}
}
