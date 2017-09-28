/*
 * 将自定义对象存入ArrayList集合中
 * 对集合进行读取
 * 对集合进行重复元素删除
 * */
import java.util.*;

class Student
{
	private String name;
	private int age;

	Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	//获取和设置属性值
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

	//比较方法
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Student))
			return false;//理论上应该抛异常

		Student s = (Student)obj;

		return this.getName().equals(s.getName()) && this.getAge() == s.getAge();
	}

	//输出方法
	public String toString()
	{
		return this.getName()+"::"+this.getAge();
	}
}

class ArrTest2
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	//删除集合中重复的元素
	public static ArrayList singleElement(ArrayList al)
	{
		//创建空集合，用来存储al中所有不同的元素
		ArrayList newal = new ArrayList();

		//遍历集合al中元素
		//并判断newal中是否包含该元素
		//如果包含就不添加
		//如果不包含就添加
		for(Iterator it = al.iterator(); it.hasNext();)
		{
			Object o = it.next();

			if(!newal.contains(o))
				newal.add(o);
		}

		return newal;
	}

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();

		al.add("java01");
		al.add("java02");
		al.add(new Student("zhangsan", 10));
		al.add(new Student("lisi", 23));
		al.add(new Student("wangwu", 26));
		al.add(new Student("lisi", 23));
		al.add(new Student("wangwu", 26));

		sop("al = "+al);
		
		al = singleElement(al);
		sop("al = "+al);

		for(Iterator it = al.iterator(); it.hasNext();)
			sop(it.next());


	}
}

