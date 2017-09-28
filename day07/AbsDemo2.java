/*
 * 员工：经理、普通员工
 * 都有姓名、工号、工资
 * 经理还有奖金
 * */
abstract class Employee
{
	//定义属性
	private String name;
	private String id;
	private double pay;

	//构造函数
	Employee(String name, String id, double pay)
	{
		this.name = name;
		this.id = id;
		this.pay = pay;
	}

	//设置并获取name
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	//设置并获取id
	public void setId(String id)
	{
		this.id = id;
	}
	public String getId()
	{
		return this.id;
	}

	public void setPay(double pay)
	{
		if(pay > 0)
			this.pay = pay;
	}
	public double getPay()
	{
		return this.pay;
	}

	//员工都有工作方法，但是每个员工方法不同，所以要抽象
	public abstract void work();
	
	public int hashCode()
	{
		return 100;
	}

}

class Manager extends Employee
{
	private int bonus;

	//构造函数
	Manager(String name, String id, double pay, int bonus)
	{
		super(name, id, pay);
		this.bonus = bonus;
	}

	//设置并获取bonus
	public void setBonus(int bonus)
	{
		this.bonus = bonus;
	}
	public int getBonus()
	{
		return this.bonus;
	}

	//讲父类的抽象函数覆盖
	public void work()
	{
		System.out.println("manager work");
	}
}

class Pro extends Employee
{
	//构造函数
	Pro(String name, String id, double pay)
	{
		super(name, id, pay);
	}

	//覆盖抽象方法
	public void work()
	{
		System.out.println("pro work");
	}
}

class AbsDemo2
{
	public static void main(String[] args)
	{
		Manager m = new Manager("zhoushuang", "007", 300000, 100000);
		Pro p = new Pro("lisi", "903", 100000);

		m.work();
		p.work();
	}
}
