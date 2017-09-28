/*
 * 练习多态的特性
 * */
class Fu
{
	int num = 5;

	void method1()
	{
		System.out.println("fu method_1");
	}

	static void method2()
	{
		System.out.println("fu static method_2");
	}

	void method3()
	{
		System.out.println("fu method_3");
	}
}

class Zi extends Fu
{
	int num = 6;

	void method1()
	{
		System.out.println("zi method_1");
	}

	static void method2()
	{
		System.out.println("zi static method_2");
	}

	void method4()
	{
		System.out.println("zi method_4");
	}
}

class D4
{
	public static void main(String[] args)
	{
		Fu f = new Fu();
		System.out.println("f --- num = "+f.num);
		f.method1();
		f.method2();
		f.method3();

		Zi z = new Zi();
		System.out.println("z --- num = "+z.num);
		z.method1();
		z.method2();
		z.method3();
		z.method4();

		Fu fz = new Zi();
		System.out.println("fz --- num = "+fz.num);
		fz.method1();
		fz.method2();
		fz.method3();


		System.out.println("5,f.1,f.2,f.3,6,z.1,z.2,f.3,z.4,5,z.1,f.2,f.3");
	}
}
