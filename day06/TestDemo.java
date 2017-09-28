/*
 * 构造函数、构造代码块、静态代码块综合应用
 * */
class Test
{
	int num = 9;
	//构造函数
	Test()
	{
		System.out.println("b");
	}

	//静态代码块
	static
	{
		System.out.println("a");
	}

	//构造代码块
	{
		System.out.println("c"+this.num);
	}

	Test(int x)
	{
		System.out.println("d");
	}

	public static void show()
	{
		System.out.println("show run");
	}
}

class TestDemo
{
	static 
	{
		System.out.println("haha");
	}

	public static void main(String[] args)
	{
		new Test();//输出：haha a c9 b
		new Test(4);//输出：haha a c9 d
		//上述代码输出为：haha a c9 b c9 d
	}

}
