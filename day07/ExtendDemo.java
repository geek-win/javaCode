/*
 * 继承
 * 学生和工人都有name和age
 * 将二者的共性提取出来单独描述，可以作为人类
 * 这时候就需要进行继承了
 * */
class Person
{
	private String name;
	private int age;

	void study()
	{
		System.out.println("haha");
	}
}

class Student extends Person
{
	/*
	private String name;
	private int age;
	*/

	void study()
	{
		System.out.println("good study");
	}
}

class Worker extends Person
{
	/*
	private String name;
	private int age;
	*/

	void work()
	{
		System.out.println("good work");
	}
}

class ExtendDemo
{
	public static void main(String[] args)
	{
		/*
		Student stu = (Student)(new Person());//子类引用父类对象
		stu.work();//报错。stu是子类引用父类对象，父类没有work()函数会报错
		如果子类父类都有这个函数，那么执行子类的函数，相当于覆盖。
		*/
	}
}
