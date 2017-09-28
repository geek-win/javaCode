/*
 * 练习内部类的几个修饰符
 * */
class Outer1
{
	private int x = 3;

	//非静态内部类
	//其中不能有非静态成员
	//内部类可以直接访问外部类的成员，包括私有
	//外部类在访问内部类的时候需要创建其对象
	class Inner1
	{
		private int x = 4;

		/*
		//非静态内部类中不能有静态成员方法
		static void show1()
		{

		}
		*/

		void show2()
		{
			int x = 5;

			System.out.println("Inner1 show2()");
			System.out.println("Outer.this.x-----"+Outer1.this.x);
			System.out.println("this.x-----"+this.x);
			System.out.println("x-----"+x);

			System.out.println("Inner1中访问Inner3中的静态方法show5()");
			Inner3.show5();
		}

		
	}

	//私有内部类
	//不能在其他外部类中创建对象
	//但是可以在当前外部类中创建对象
	private class Inner2
	{
		void show3()
		{
			System.out.println("Inner2 show3()");
		}
	}

	//静态内部类
	//不能访问非静态变量
	//其中可以有静态方法
	//也可以有非静态方法
	//对于静态方法，可以直接用类名调用
	//Outer.Inner.function();
	//对于非静态方法，需要创建内部类对象然后调用
	//new Outer.Inner().function();
	static class Inner3
	{
		void show4()
		{
			System.out.println("Inner3 show4()");
		}

		static void show5()
		{
			System.out.println("Inner3 show5()");
		}
	}

	//静态成员方法
	public static void function()
	{
		//只能访问静态内部类
		//new Inner1().show2();
		//new Inner2().show3();
		new Inner3().show4();
		Inner3.show5();
	}
}

class InnerDemo2
{
	public static void main(String[] args)
	{
		Outer1 out = new Outer1();

		System.out.println("Outer function()");
		out.function();
		System.out.println("--------------------------------");
		Outer1.function();
		System.out.println("----------------------------------");

		Outer1.Inner1 in1 = new Outer1().new Inner1();
		in1.show2();

		//其他外部类不能创建私有内部类的对象
//		Outer.Inner2 in2 = new Outer().new Inner2();
//		in2.show3();

		Outer1.Inner3 in3 = new Outer1.Inner3();
		in3.show4();
		Outer1.Inner3.show5();
	}
}
