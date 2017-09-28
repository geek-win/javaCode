/*
 * 多态中，编译看左边，运行，若是非静态函数，则看右边，因为非静态函数依赖于对象
 * 若是静态函数或者变量，则运行左边类的
 * */
class A
{
	int num = 5;

	void m1()
	{
		System.out.println("A --- m1");
	}

	static void m2()
	{
		System.out.println("A static --- m2");
	}
}

class B extends A
{
	int num = 6;

	void m1()
	{
		System.out.println("B --- m1");
	}

	static void m2()
	{
		System.out.println("B static --- m2");
	}
}

class D3
{
	public static void main(String[] args)
	{	
		A a1 = new A();
		System.out.println("a1 num = "+a1.num);
		a1.m1();
		a1.m2();

		B b1 = new B();
		System.out.println("b1 num = "+b1.num);
		b1.m1();
		b1.m2();

		A a2 = new B();
		System.out.println("a2 num = "+a2.num);
		a2.m1();
		a2.m2();
	}
}
