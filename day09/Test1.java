/*
 * 测试代码
 * */
class Super
{
	int i = 0;
	public Super(String a)
	{
		System.out.println("A");
		i = 1;
	}

	public Super()
	{
		System.out.println("B");
		this.i+=2;//其实就是this的i
	}
}

class Demo extends Super
{

	int i = 10;
	public Demo(String a)
	{
		//super();
		System.out.println("C");
		this.i = 5;//其实就是this的i
	}
	public static void main(String[] args)
	{
		int i = 4;
		//解释一下现象
		//这里定义的i是在栈内存中，而对象的i变量是存在堆内存中
		//所以这里的i不会影响对象的i值

		//d位于栈内存
		//new Demo("A")位于堆内存
		//其中有两个i
		//Super.i = 0, Demo.i = 10;
		//new对象的时候，会先执行父类的构造函数Super()
		//输出B，然后Super.i+2=2
		//输出C
		//然后Demo.i = 5
		//这时d是多态出现的，所以，对于变量而言，编译看左边，父类，没问题
		//运行看左边，也是父类，所以输出是父类的i，也就是2
		Super d = new Demo("A");
		System.out.println(d.i);

		//这里的d1不是多态，是本类引用指向本类对象
		//new Demo("D")位于堆内存，d1位于栈内存
		//这个对象中有两个i
		//Super.i = 0, Demo.i = 10
		//子类构造函数会先调用父类构造函数
		//输出B，父类的i加2，也就是Super.i = 2
		//输出C
		//子类的i为5，也就是Demo.i = 5
		//这时，输出d1.i就是子类的i，也就是5
		Demo d1 = new Demo("D");
		System.out.println(d1.i);
	}

}
