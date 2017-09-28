/*
 * 现在将班级存放的元素改变成学生对象
 * */
import java.util.*;

class Student implements Comparable<Student>
{
	private String name;
	private int age;

	Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}

	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}

	public int hashCode()
	{
		return this.name.hashCode() + this.age*2;
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof Student))
			return false;

		Student s = (Student)obj;

		return this.name.equals(s.name) && this.age == s.age;
	}

	public int compareTo(Student s)
	{
		int num = this.name.compareTo(s.name);

		if(num == 0)
			return new Integer(this.age).compareTo(new Integer(s.age));

		return num;
	}

	public String toString()
	{
		return this.name+"----"+this.age;
	}
}
class SchoolDemo1
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		//创建学校
		TreeMap<String, List<Student>> tm = new TreeMap<String, List<Student>>();

		//创建班级
		List<Student> tm1 = new ArrayList<Student>();
		List<Student> tm2 = new ArrayList<Student>();

		//学校添加班级
		tm.put("yure", tm1);
		tm.put("jiuye", tm2);

		//班级添加学生
		tm1.add(new Student("zhangsan", 20));
		tm1.add(new Student("zhangsan43", 34));
		tm2.add(new Student("zhangsan42", 12));
		tm2.add(new Student("zhangsan23", 20));
		tm2.add(new Student("zhangsan03", 44));

		//输出学生信息
		for(Iterator<String> it = tm.keySet().iterator(); it.hasNext();)
		{
			String name = it.next();
			List<Student> al = tm.get(name);

		//	sop(al);

			/*
			for(Iterator<Student> it1 = al.iterator(); it1.hasNext();)
			{
				Student s = it1.next();
				sop(s);
			}
			*/

			sop(name);
			prin(al);
		}

	}
	public static void prin(List<Student> al)
	{
		for(Iterator<Student> it = al.iterator(); it.hasNext();)
		{
			Student s = it.next();
			sop(s);
		}
	}
}
