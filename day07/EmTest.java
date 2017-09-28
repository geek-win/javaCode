/*
 * 员工三个属性：姓名、工号、工资
 * 经理除了以上三个属性，还有奖金
 * 设计出员工类和经理类
 * */
abstract class Employee
{
	private String name;
	private String id;
	private double pay;

	Employee(String name, String id, double pay)
	{
		this.name = name;
		this.id = id;
		this.pay = pay;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public void setId(String id)
	{
		this.id = id;
	}
	public void setPay(double pay)
	{
		this.pay = pay;
	}

	abstract void work();
}

class Manager extends Employee
{
	private double bonus;

	Manager(String name, String id, double pay, double bonus)
	{
		super(name, id, pay);

		this.bonus = bonus;
	}

	public void work()
	{
		System.out.println("I am a manager.");
	}
}

class Pro extends Employee
{
	Pro(String name, String id, double pay)
	{
		super(name, id, pay);
	}

	public void work()
	{
		System.out.println("I am a professional employee");
	}
}


class EmTest
{
	static
	{
		System.out.println("静态代码块执行");
	}

	public static void main(String[] args)
	{
		for(int i = 0; i < args.length; i++)
			System.out.println(args[i]);

		Manager m = new Manager("zhoushuang", "200", 3000000, 1000000);
		Pro p = new Pro("lisi", "900", 300000);

		m.work();
		p.work();
	}
}
