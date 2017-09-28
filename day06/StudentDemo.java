/*
 * 保证学生对象的唯一性
 * */
class Student
{
	private int age;
	private String name;

	public void setAge(int age)
	{
		if(age > 0 && age <= 130)
			this.age = age;
		else
			System.out.println("Please input correct age.");
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

	public void show()
	{
		System.out.println(this.name+" can study, "+this.age+"years old.");
	}


	//保证学生的私有化
	//私有化构造函数
	private Student()
	{

	}

	//创建学生对象
	private static Student stu = new Student();

	//对外提供访问对象的函数
	public static Student getStudent()
	{
		return stu;
	}
}

class StudentDemo
{
	public static void main(String[] args)
	{
		Student s1 = Student.getStudent();
		Student s2 = Student.getStudent();

		s1.setAge(20);
		s2.setName("zhangsan");
		
		s1.show();
		s2.show();
	}
}
