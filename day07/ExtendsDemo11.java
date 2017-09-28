//练习继承
class Fu
{
	static
	{
		System.out.println("Fu静态代码块");
	}
	int num = 4;

	public void show()
	{
		System.out.println("Fu.show()");
	}

	public static void method()
	{
		System.out.println("Fu.method()");
	}
}

class Zi extends Fu
{
	static 
	{
		System.out.println("Zi静态代码块");
	}

	int num = 5;

	public void show()
	{
		System.out.println("Zi.show()");
	}

	public static void method()
	{
		System.out.println("Zi.method()");
	}
}

class ExtendsDemo11
{
	static
	{

		System.out.println("主---静态代码块");
	}

	public static void main(String[] args)
	{
		for(int i = 0; i < args.length; i++)
		{
			System.out.println("args["+i+"] = "+args[i]);
		}

		Zi z = new Zi();                       		
		System.out.println("z.num = "+z.num);  	
		z.show();
		z.method();

		Fu z1 = new Zi();
		System.out.println("z1.num = "+z1.num);
		z1.show();
		z1.method();
	}
}
