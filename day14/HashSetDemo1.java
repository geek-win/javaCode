/*
 * 自定义对象
 * 存储进hashSet集合中
 * 对其进行获取以及去除重复对象
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

	//复写equals方法
	//自定义Student对象比较方法
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Student))
			return false;

		Student s = (Student)obj;

		System.out.println("调用了equals方法："+this.name+".equals("+s.name+")");
		return this.name.equals(s.name) && this.age == s.age;
	}

	//复写hashCode方法
	//自定义其hash值
	public int hashCode()
	{
		System.out.println(this.name+"调用hash算法");
		return this.age * 3;
	}

	//复写toString方法
	//自定义输出格式
	public String toString()
	{
		return this.name+"---"+this.age;
	}
}

class HashSetDemo1
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		//创建hashSet集合
		HashSet hs = new HashSet();

		//添加对象
		sop(hs.add("java01"));
		sop(hs.add("java01"));
		sop(hs.add("java02"));
		sop(hs.add(new Student("zhangsan", 20)));
		sop(hs.add(new Student("lisi", 20)));
		sop(hs.add(new Student("zhangsan", 20)));
		sop(hs.add(new Student("wangwu", 24)));

		//contains方法
		//先调用hashCode方法
		//如果有就调用equals方法
		sop("contains方法：");
		sop(hs.contains(new Student("z", 20)));
		sop(hs.contains(new Student("zhangsan", 20)));
		sop("------------------------------------------");

		//remove方法首先调用hashCode方法
		//如果有相同的就调用equals方法
		sop(hs.remove(new Student("zhangsan", 20)));

		//迭代器取元素
		for(Iterator it = hs.iterator(); it.hasNext();)
		{
			sop(it.next());
		}

	}

}
