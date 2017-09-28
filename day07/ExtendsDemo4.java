/*
 * 子父类中的构造函数
 * */
class Fu
{
	Fu()
	{
		System.out.println("fu run");
	}
}

class Zi extends Fu
{
	Zi(int a)
	{
		//super();
		//子类的构造函数默认第一行有一条隐式语句super();
		//会访问父类中空参数的构造函数，而且子类中所有的构造函数默认第一行
		//都是super();
		System.out.println(a);
	}
}

class ExtendsDemo4
{
	public static void main(String[] args)
	{
		Zi z = new Zi(4);
		Zi z1 = new Zi(5);
	}
}
