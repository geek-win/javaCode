/*
 * 构建一个TreeMap集合
 * TreeMap<Student, String>
 * 使得按照学生的年龄进行排序
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
	public int compareTo(Student s)
	{
		int num = new Integer(this.age).compareTo(new Integer(s.age));
		
		if(num == 0)
			return this.name.compareTo(s.name);

		return num;
	}
	public String toString()
	{
		return this.name+"---"+this.age;
	}
}
class Demo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		TreeMap<Student, String> tm = new TreeMap<Student, String>();

		tm.put(new Student("zhangsan", 20), "01");
		tm.put(new Student("zhangsan", 20), "021");
		tm.put(new Student("lisi", 45), "03");
		tm.put(new Student("wagsan03", 22), "04");
		tm.put(new Student("zhangsan45", 34), "02");
		tm.put(new Student("hisi", 45), "03");

		sop(tm);
		sop("--------------");
		for(Iterator<Student> it = tm.keySet().iterator(); it.hasNext();)
		{
			Student s = it.next();
			String v = tm.get(s);

			sop(s+"---"+v);
		}
	}

}
