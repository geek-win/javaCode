/*
 * 什么时候使用静态？
 * 静态变量
 * 对象共有的数据，注意不是共有属性，因为不同对象的属性值不一样
 * 静态方法
 * 函数内部不含有对象特有属性，无需调用对象的属性或者特有方法
 *
 * */
class Person
{
	private String name;
	private int age;

	{
		cry();
	}

	Person(String name)
	{
		this.name = name;
	}

	Person(String name, int age)
	{
		this(name);
		this.age = age;
	}

	public void setAge(int age)
	{
		if(age > 0 && age <= 130)
			this.age = age;
		else
			System.out.println("请输入合法的年龄");
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

	//输出此人的姓名年龄
	public void show()
	{
		System.out.println(this.name+"----"+this.age);
	}

	//判断年龄
	public boolean compareAge(Person p)
	{
		return this.age == p.age;
	}

	public static void cry()
	{
		System.out.println("cry.............");
	}
}

class StaticDemo1
{
	public static void main(String[] args)
	{
		//java StaticDemo1 hehe haha hihi hiahia
		for(int i = 0; i < args.length; i++)
			System.out.println(args[i]+"-------"+args.length);

		Person p1 = new Person("张三", 15);
		Person p2 = new Person("李四", 15);

		p1.show();
		p2.show();

		if(p1.compareAge(p2))
			System.out.println(p1.getName()+"和"+p2.getName()+"都是"+p1.getAge());
		else
			System.out.println(p1.getName()+"和"+p2.getName()+"年龄不同");
	}
}
