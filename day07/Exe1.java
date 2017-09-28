/*
 * 需求
 * 定义员工：姓名、工号、工资
 * 普通员工：同上，工作
 * 经理：姓名、工号、工资、奖金、领导方法
 * */
//由于父类中含有抽象方法，所以该类是抽象的
abstract class YuanGong
{
	//定义私有变量
	//姓名、工号、工资
	private String name;
	private String id;
	private double pay;

	//构造函数
	YuanGong(String name, String id, double pay)
	{
		this.name = name;
		this.id = id;

		if(pay < 0)
			System.out.println("Please input pay with value >0");
		else
			this.pay = pay;
	}

	//每个私有变量都有两个函数，一个是设置值，一个是获取值
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

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
		if(pay < 0)
			System.out.println("Please input pay with value >0");
		else
			this.pay = pay;
	}
	public double getPay()
	{
		return this.pay;
	}

	//工作的方法
	//由于不同员工的工作方法不同，所以就是抽象的
	abstract public void work();

	public void eat()
	{
		System.out.println("rice");
	}

	public void show()
	{
		System.out.println(this.name+"::"+this.id+"::"+this.pay);
	}
}

class Pu extends YuanGong
{
	Pu(String name, String id, double pay)
	{
		super(name, id, pay);
	}

	//继承关系中，子类无法直接使用父类的私有变量
	//尽管子类也有私有变量，但是不能直接使用，而是使用父类提供的访问函数
	public void work()
	{
		System.out.println("普通员工工作");
	}

	public void eat()
	{
		super.eat();
		System.out.println("普通员工餐");
	}
}

class Jing extends YuanGong
{
	private double bonus;

	Jing(String name, String id, double pay, double bonus)
	{
		super(name, id, pay);
	
		if(bonus < 0)
			System.out.println("Please input bonus with value >0");
		else
			this.bonus = bonus;
	}

	public void setBonus(double bonus)
	{
		if(bonus < 0)
			System.out.println("Please input bonus with value >0");
		else
			this.bonus = bonus;
	}

	public void work()
	{
		System.out.println("经理工作");
	}

	public void eat()
	{
		super.eat();
		System.out.println("经理餐");
	}	

	public void show()
	{
		super.show();
		System.out.println(this.bonus);
	}
}

class Exe1
{
	public static void main(String[] args)
	{
		Pu pu = new Pu("zhangsan", "jishu01", 1000);
		Jing j = new Jing("zs", "jingli01", 15000, 10000);

		pu.show();
		j.show();

		pu.eat();
		pu.work();

		j.eat();
		j.work();

		pu.setName("heheh");
		j.setBonus(80000);

		pu.show();
		j.show();
	}
}
