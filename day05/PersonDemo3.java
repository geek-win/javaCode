/*
 * 构造函数练习
 * */
class Person
{
	//age
	private int age;
	//name
	private String name;
	//function
	public void setAge(int age)
	{
		if(age > 0 && age <= 130)
			this.age = age;
		else
			System.out.println("请输入正确的年龄。");
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

	//行为，对外公用
	public void study()
	{
		System.out.println(this.name+" can study.");
	}

	//构造函数
	Person(String name, int age)
	{
		this.name = name;
		this.age = age;

		System.out.println("name: "+this.name+"--age: "+this.age);
	}
}

class PersonDemo3
{
	public static void main(String[] args)
	{
		Person p1 = new Person("Zhangsan", 10);

		//p1的重新设置是依靠一般方法而不是构造函数
		p1.setAge(30);
		p1.setName("Lisi");
		System.out.println(p1.getName()+"----"+p1.getAge());
		p1.study();
	}
}
