/*
 * 构造函数
 * 1、函数名和类名一样
 * 2、没有返回值，和void不一样，形式为：类名(){}
 * 3、没有return语句
 * */
class Person
{
	private int age;
	private String name;

	//构造函数1
	Person(int age, String name)
	{
		this.age = age;
		this.name = name;

		System.out.println("name = "+this.name+",,age = "+this.age);
		cry();
		study();
	}

	//构造函数
	//一创建对象就会执行对应的构造函数，以便对对象进行初始化
	//如果类中没有定义构造函数，系统会默认给该类加一个空参数的构造函数
	//Person(){}
	//当在类中自定义了构造函数，默认的构造函数就没有了。
	//也就是一定会有构造函数，
	//不定义的话，系统会给加上空参数的构造函数
	//定义的话，以自己定义的为准
	//不同的对象有不同的初始化方法
	//构造函数是用于给对象进行初始化的
	//如果没有空参数的构造函数，在new对象的时候用new Person()就会报错
	//因为此时已经有构造函数，系统就不会创建默认的构造函数，自然也就找不到
	//Person()这个构造函数，所以报错
	
	//构造函数2
	Person()
	{
		System.out.println("person run");
		cry();
		study();
	}

	//设置年龄
	public void setAge(int age)
	{
		if(age >= 0 && age <= 130)
			this.age = age;
		else
			System.out.println("Please input correct age.");
	}
	//获取年龄
	public int getAge()
	{
		return this.age;
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

	//哭的行为功能函数
	public void cry()
	{
		System.out.println("cry....");
	}

	//学习功能
	public void study()
	{
		System.out.println(this.name+" can study when he is "+this.age+"years old.");
	}
}

class PersonDemo2
{
	public static void main(String[] args)
	{
		Person p = new Person();
		Person p1 = new Person(20, "zhangsan");
		p1.cry();
		p1.setName("haha");
		System.out.println("name---------"+p1.getName());
	}
}
