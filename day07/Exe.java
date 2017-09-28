/*
 * 假如我们在开发一个系统时需要对员工进行建模，员工包含3个属性：
 * 姓名、工号、工资
 * 经理也是员工，除了含有员工的属性外，另外还有奖金属性
 * 请使用继承的思想设计出员工类和经理类，要求类中提供必要的方法进行属性访问
 * 
 * 员工类：
 * name id pay
 *
 * 经理类：
 * name id pay bonus
 * */
//员工类
abstract class Employee
{
	private String name;
	private String id;//工号其实应该是字符串类的
	private double pay; 

	//构造函数初始化对象
	Employee(String name, String id, double pay)
	{
		this.name = name;
		this.id = id;
		this.pay = pay;
	}

	//设置姓名
	public void setName(String name)
	{
		this.name = name;
	}
	//获取姓名
	public String getName()
	{
		return this.name;
	}
	//设置工号
	public void setId(String id)
	{
		this.id = id;
	}
	//获取工号
	public String getId()
	{
		return this.id;
	}
	//设置工资
	public void setPay(double pay)
	{
		this.pay = pay;
	}
	//获取工资
	public double getPay()
	{
		return this.pay;
	}
	
	//工作，是抽象的
	public abstract void work();

	//输出基本信息
	public abstract void show();

	//吃饭
	public void eat()
	{
		System.out.println("eat rice");
	}
}

//经理类
class Manager extends Employee
{
	private double bonus;

	Manager(String name, String id, double pay, double bonus)
	{
		super(name, id, pay);
		this.bonus = bonus;
	}

	//设置奖金
	public void setBonus(double bonus)
	{
		this.bonus = bonus;
	}
	//获取奖金
	public double getBonus()
	{
		return this.bonus;
	}

	public void work()
	{
		System.out.println("manager work");
	}

	public void show()
	{
		System.out.println(this.getName()+"--"+this.getId()+"\tpay:"+this.getPay()+"\tbonus"+this.bonus);
	}

	public void eat()
	{
		System.out.println("manager: ");
		super.eat();
	}
}

//普通员工
class Pro extends Employee
{
	Pro(String name, String id, double pay)
	{
		super(name, id, pay);
	}

	public void work()
	{
		System.out.println("pro work");
	}

	public void show()
	{
		System.out.println(this.getName()+".."+this.getId()+"\tpay:"+this.getPay());
	}

	public void eat()
	{
		System.out.println("pro:");
		super.eat();
	}
}

class Exe
{
	public static void main(String[] args)
	{
		Manager zs = new Manager("zhoushuang", "2016", 300000, 10000);
		Pro pro1 = new Pro("lisi", "2033", 20000);

		pro1.show();
		zs.show();

		pro1.setName("haha");
		pro1.show();
		System.out.println(pro1.getName()+"::"+pro1.getId()+"::"+pro1.getPay());

		zs.eat();
		pro1.eat();
	}
}

