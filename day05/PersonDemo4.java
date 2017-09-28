/*
 * 构造代码块
 * */
class Person
{
	private int age;
	private String name;

	//私有变量都有两个函数
	//set和get函数
	//所以只要定义了私有变量
	//就要定义两个对应的访问函数
	public void setAge(int age)
	{
		if(age > 0 && age <= 130)
			this.age = age;
		else
			System.out.println("请输入正确的年龄");
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
	//作用：给对象进行初始化
	//对象一建立就运行，而且优先于构造函数运行
	//和构造函数的区别
	//构造代码块是给所有对象进行统一初始化
	//而构造函数是给对应的对象初始化
	//eg每个孩子都有年龄，不一定有名字
	//相当于，每个对象都执行构造代码块
	//但是每个对象对应的构造函数不一定一样
	//代码块的作用：可以把所有对象都具备的变量或其他放到代码块中
	{
		System.out.println("cry......");
	}

	//构造函数没有形式参数
	Person()
	{
		System.out.println("person()");
	}

	//构造函数。只有name传入
	Person(String name)
	{
		this.name = name;
	}

	//构造函数，name、age作为参数传入
	Person(String name, int age)
	{
		this(name);//必须放在构造函数中的第一个位置
		this.age = age;

		System.out.println(this.name+"-----"+this.age);
	}

	//学习的行为
	public void study()
	{
		System.out.println(this.name+" can study.");
	}

	//需求：给人定义一个用于比较年龄是否相同的功能，也就是是否是同龄人
	public boolean compare(Person p)
	{
		return this.age == p.age;

	}

}

class PersonDemo4
{
	public static void main(String[] args)
	{
		Person p1 = new Person();
		Person p2 = new Person("zhangsan");
		Person p3 = new Person("lisi", 15);
		Person p4 = new Person("wangwu", 15);

		if(p3.compare(p4))
			System.out.println(p3.getName()+"年龄和"+p4.getName()+"相同, "+p3.getAge());
		else
			System.out.println(p3.getName()+"和"+p4.getName()+"年龄不同");
	}
}
