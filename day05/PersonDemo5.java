/*
 * 进行this等关键词的练习
 * */
class Person
{
	//定义私有变量
	private int age;
	private String name;

	//提供访问方法
	public void setAge(int age)
	{
		if(age >= 0 && age <= 130)
			this.age = age;
		else
			System.out.println("请输入正确年龄");
	}
	public int getAge()
	{
		return this.age;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	//构造代码块
	//所有的对象，在创建的时候都要先执行代码块
	{
		System.out.println("cry........");
	}

	//构造函数
	Person()
	{

	}
	Person(String name)
	{
		this.name = name;
	}
	Person(String name, int age)
	{
		this(name);
		this.age = age;

		System.out.println(this.name+"----------"+this.age);
	}

	//比较年龄
	public void compare(Person p)
	{
		if(this.age != p.age)
			System.out.println(this.name+"年龄和"+p.name+"不同");
		else
			System.out.println(this.name+"和"+p.name+"年龄为"+this.age);
	}

	//学习功能
	public void study()
	{
		System.out.println(this.name+" can study.");
	}
}

class PersonDemo5
{
	public static void main(String[] args)
	{
		Person p1 = new Person("zhangsan", 14);
		Person p2 = new Person("lisi", 18);

		p1.compare(new Person("wangwu", 14));
	}
}
