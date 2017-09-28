/*
 * 需求：
 * 学生，分两种，睡觉相同，工作不同
 * 使用多态
 * */
abstract class Student
{
	public abstract void study();
	public void sleep()
	{
		System.out.println("sleep");
	}
}

class BaseStudent extends Student
{
	public void study()
	{
		System.out.println("base student");
	}

	public void sleep()
	{
		System.out.println("base sleep");
	}
}

class AdvStudent extends Student
{
	public void study()
	{
		System.out.println("adv study");
	}
}

class Do
{
	public void doSome(Student stu)
	{
		stu.study();
		stu.sleep();
	}
}

class D2
{
	public static void main(String[] args)
	{
		Do d = new Do();
		d.doSome(new BaseStudent());
		d.doSome(new AdvStudent());
	}
}
