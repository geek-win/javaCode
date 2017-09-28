/*
 * 抽象类
 * 函数包括函数声明和函数主体两部分
 * 对于只有函数声明而没有函数主体的函数，是抽象的，表示知道其功能，但是具体实现不确定
 * 抽象方法只能定义在抽象类中
 * 抽象类不能直接new对象，只能由其子类将其所有的抽象方法覆盖之后才能创建对象
 * 抽象类的子类必须将其所有的抽象方法全部覆盖才能创建对象
 * 将多个子类的功能相同但主体不同的函数向上抽取为抽象函数，然后由子类进行覆盖
 * */
abstract class Student 
{
	private String name;
	private int age;

	Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}

	public void setAge(int age)
	{
		if(age > 0 && age < 130)
			this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}

	abstract void study();
}

class BaseStudent extends Student
{
	private double bonus;

	BaseStudent(String name, int age, double bonus)
	{
		super(name, age);
		this.bonus = bonus;
	}

	public void setBonus(double bonus)
	{
		this.bonus = bonus;
	}
	public double getBonus()
	{
		return this.bonus;
	}

	void study()
	{
		System.out.println("Base study");
	}

}

class AdvStudent extends Student
{
	AdvStudent(String name, int age)
	{
		super(name, age);
	}

	void study()
	{
		System.out.println("adv study");
	}
}

class AbsDemo1
{
	public static void main(String[] args)
	{
		new BaseStudent("zhangsan", 23, 299999).study();
		new AdvStudent("lisi", 24).study();
	}
}
