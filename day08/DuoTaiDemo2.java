/*
 * 多态中
 * 1、对于非静态成员函数，编译看左边，运行看右边
 * 2、对于静态成员函数和成员变量，编译看左边，运行看左边
 * */
class Fu
{
	//成员变量
	int num = 8;

	static int a = 10;

	//非静态成员方法
	void m1()
	{
		System.out.println("Fu m_1");
	}
	void m2()
	{
		System.out.println("Fu m_2");
	}

	//静态成员方法
	static void m3()
	{
		System.out.println("Fu m_3");
	}
}

class Zi extends Fu
{
	int num = 5;
	static int a = 9;

	void m1()
	{
		System.out.println("Zi m_1");
	}

	void m2()
	{
		System.out.println("Zi m_2");
	}

	static void m3()
	{
		System.out.println("Zi m_3");
	}

	void m4()
	{
		System.out.println("Zi m_4");
	}
}

class DuoTaiDemo2
{
	static
	{
		System.out.println("DuoTaiDemo2");
	}

	public static void main(String[] args)
	{
		for(int i = 0; i < args.length; i++)
			System.out.println(args[i]);

		Fu f = new Zi();
		f.m1();
		f.m2();
		f.m3();
		System.out.println(f.num);
		System.out.println(f.a);
		System.out.println("Zi m_1/nZi m_2/r/nFu m_3/n8/n10");

		Zi z = new Zi();
		z.m1();
		z.m2();
		z.m3();
		z.m4();
		System.out.println(z.num);
		System.out.println(z.a);
		System.out.println("Zi m_1/nZi m_2/nZi m_3/nZi m4/n5/n9");
	}
}
