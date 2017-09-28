/*
 * 补全代码
 * */
interface A
{
	void show();
}
interface B
{
	void add(int a, int b);
}

class C implements A, B
{
	//补全程序代码
	
	/*
	 * 
	private int a, b;

	public void add(int a, int b)
	{
		this.a = a;
		this.b = b;
	}

	public void show()
	{
		System.out.println(this.a+this.b);

	}
	*/

	private int sum;

	public void add(int a, int b)
	{
		sum = a+b;
	}

	public void show()
	{
		System.out.println(sum);
	}
}

class D
{
	public static void main(String[] args)
	{
		C c = new C();
		c.add(4, 2);
		c.show();//通过该函数打印以上两个数的和
	}
}
