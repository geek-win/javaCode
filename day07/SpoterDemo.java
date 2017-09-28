/*
 * 定义类：运动员
 * 运动员都有姓名、年龄、擅长项目（不同）
 * 有的运动员有学习功能，但是也不一样
 * */
abstract class Sporter
{
	private String name;
	private int age;

	Sporter(String name, int age)
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
		this.age = age;
	}
	public int getAge()
	{
		return this.age;
	}

	//项目，但具体是什么不确定，所以是抽象的
	abstract void play();
}

//运动员特有的功能，学习
interface Study
{
	void study();
}

//篮球运动员
class Basketball extends Sporter implements Study
{
	Basketball(String name, int age)
	{
		super(name, age);
		System.out.println(name+"::"+age+"---basketball");
	}

	public void play()
	{
		System.out.println("项目：篮球");
	}

	public void study()
	{
		System.out.println("学习篮球技术");
	}
}

class SporterDemo
{
	public static void main(String[] args)
	{
		Basketball b = new Basketball("zhangsan", 20);

		System.out.println(b.getName()+"-----"+b.getAge());
		b.play();
		b.study();
	}
}
