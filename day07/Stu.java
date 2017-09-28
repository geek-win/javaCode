/*
 * 接口和类的配合使用
 * */
abstract class Stdudent
{
	abstract void study();
	
	void sleep()
	{
		System.out.println("sleep");
	}
}

interface Smoking
{
	void smoke();
}
interface Drink
{
	void drink();
}

class Zhangsan extends Student implements Smoking
{
	private String name;
	private int age;

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
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}

	Zhangsan(String name, int age)
	{
		this.name = name;
		this.age = age;

		System.out.println(this.name+"::"+this.age);
	}

	public void study()
	{
		System.out.println("zhangsan study");
	}

	public void smoke()
	{
		System.out.println("zhangsan smoke");
	}
}

class Lisi extends Student implements Drink
{
	public void study()
	{
		System.out.println("Lisi study");
	}

	public void drink()
	{
		System.out.println("Lisi drink");
	}
}

class Stu
{
	public static void main(String[] args)
	{
		Zhangsan zs = new Zhangsan("haha", 20);
		zs.smoke();
		zs.study();

		Lisi ls = new Lisi();
		ls.drink();
		ls.study();
	}
}

