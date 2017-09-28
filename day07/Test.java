/*复习继承*/
class Person
{
	//构造代码块，用于对所有的对象初始化，每个对象创建时都要执行一遍
	{
		System.out.println("cry...............");
	}

	private String name;
	private int age;

	//构造函数，用于对特定对象进行初始化
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	//对外暴露修改私有属性的方法
	public void setName(String name)
	{
		this.name = name;
	}

	//对外暴露获取私有属性的方法
	public String getName()
	{
		return this.name;
	}

	//对外暴露修改私有属性的方法
	public void setAge(int age)
	{
		if(age >= 0 && age <+ 130)
			this.age = age;
	}
	//对外暴露获取私有属性的方法
	public int getAge()
	{
		return this.age;
	}

	//人类的睡觉功能
	public void sleep()
	{
		System.out.println("sleep...zzzzz");
	}	

	public static void cry()
	{
		System.out.println("person cry");
	}
}

class Student extends Person
{
	private String id;

	Student(String name, int age, String id)
	{
		super(name, age);
		this.id = id;
	}

	public String getId()
	{
		return this.id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public void sleep()
	{
		super.sleep();
		System.out.println("Student needs 8 hours to sleep every night.");
	}

	public static void cry()
	{
		System.out.println("Student can't cry.");
	}
}


class Test
{
	public static void main(String[] args)
	{
		Person p = new Person("zhangsan", 10);
		Student s = new Student("hahah", 21, "2016WW");
		Person ps = new Student("lisi", 12, "2016E");

		System.out.println("Person:");
		p.sleep();
		p.cry();

		System.out.println("Student:");
		s.sleep();
		s.cry();

		System.out.println("DuoTai:");
		ps.sleep();
		ps.cry();
	}
}
