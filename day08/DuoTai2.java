/*
 * 基础班学生：
 *	学习，睡觉
 * 高级班学生：
 *	学习，睡觉
 * 可将这两类事物进行抽取
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
		System.out.println("BaseStudent study");
	}

	public void sleep()
	{
		System.out.println("坐着睡");
	}
}

class AdvStudent extends Student
{
	public void study()
	{
		System.out.println("AdvStudent study");
	}
}

//操作学生的类
class DoStudent
{
	public static void doStudent(Student s)
	{
		s.study();
		s.sleep();
	}

}

class DuoTai2
{
	public static void main(String[] args)
	{
		System.out.println("1");
		doSome(new BaseStudent());
		doSome(new AdvStudent());

		System.out.println("2");
		DoStudent ds = new DoStudent();
		ds.doStudent(new BaseStudent());
		ds.doStudent(new AdvStudent());

		//由于DoStudent类中的函数是静态的，可以直接被类名调用
		System.out.println("3");
		DoStudent.doStudent(new BaseStudent());
		DoStudent.doStudent(new AdvStudent());
	}

	//做一个方法，使得所有的学生进行学习和睡觉
	public static void doSome(Student s)
	{
		s.study();
		s.sleep();
	}
}
