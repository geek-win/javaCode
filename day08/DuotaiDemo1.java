/*
 * 基础班的学生：
 *		学习、睡觉
 * 高级班的学生：
 *		学习、睡觉、做项目
 * 可以将这两类事物进行抽取
 * */
abstract class Student
{
	public abstract void study();
	public void sleep()
	{
		System.out.println("躺着睡");
	}
}

class BaseStudent extends Student
{
	public void study()
	{
		System.out.println("base study");
	}

	public void sleep()
	{
		System.out.println("趴着睡");
	}
}

class AdvStudent extends Student
{
	public void study()
	{
		System.out.println("adv study");
	}

	public void sing()
	{
		System.out.println("sing--------");
	}
}

//工具类
class DoStudent
{
	public static void doSome(Student stu)
	{
		stu.study();
		stu.sleep();
	}
}

class DuotaiDemo1
{
	public static void main(String[] args)
	{
		BaseStudent bs = new BaseStudent();
		bs.study();
		bs.sleep();
		AdvStudent as = new AdvStudent();
		as.study();
		as.sleep();

		doSome1(new BaseStudent());
		doSome1(new AdvStudent());

		DoStudent.doSome(new BaseStudent());
		DoStudent.doSome(new AdvStudent());

	}

	public static void doSome1(Student stu)
	{
		stu.study();
		stu.sleep();

		if(stu instanceof AdvStudent)
		{
			AdvStudent as = (AdvStudent)stu;
			as.sing();
		}
	}
}
