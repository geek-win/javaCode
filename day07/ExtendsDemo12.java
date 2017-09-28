/*
 * 练习子类实例化过程
 * 创建子类对象的时候
 * 其构造函数的第一行是super()或者this
 * 如果不是super或者this，就默认添加一个super()
 * 如果有this了，就不会再添加
 * */
class Fu
{
	int num;

	static 
	{
		System.out.println("Fu静态代码块");
	}

	Fu()
	{
		num = 60;
		System.out.println("Fu run");
	}

	Fu(int x)
	{
		System.out.println("fu...."+x);
	}
}

class Zi extends Fu
{
	static
	{
		System.out.println("Zi静态代码块");
	}

	Zi()
	{
		System.out.println("Zi run");
	}

	Zi(int x)
	{
		super(x);
		System.out.println("zi...."+x);
	}
}

class ExtendsDemo12
{
	public static void main(String[] args)
	{
		Zi z = new Zi();
		Zi z1 = new Zi(5);
		System.out.println("z.num = "+z.num);
	}
}
