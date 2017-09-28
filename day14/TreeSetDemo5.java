/*
 * 对比较器以及元素的比较方法进行练习
 * 元素A对象自身按照年龄排序
 * 比较器按照姓名进行排序
 * */
import java.util.*;

class A implements Comparable
{
	private String name;
	private int age;

	A(String name, int age)
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

	//复写toString方法
	public String toString()
	{
		return this.name+"::"+this.age;
	}
	//复写compareTo方法
	public int compareTo(Object obj)
	{
		if(!(obj instanceof A))
			throw new RuntimeException("不是A类");

		A a = (A)obj;

		//先按照年龄来排序
		//如果年龄相同就按照姓名来排序
		if(this.age == a.age)
			return this.name.compareTo(a.name);
		if(this.age > a.age)
			return 1;
		return -1;
	}
}

//定义比较器
class MyC implements Comparator
{
	//复写compare方法
	public int compare(Object o1, Object o2)
	{
		A a1 = (A)o1;
		A a2 = (A)o2;

		//先按照姓名排序
		//如果姓名相同，就按照年龄排序
		int num = a1.getName().compareTo(a2.getName());

		if(num == 0)
			return a1.getAge() - a2.getAge();

		return num;
	}
}

class TreeSetDemo5
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet(new MyC());

		ts.add(new A("zhangsan", 20));
		ts.add(new A("lisi", 23));
		ts.add(new A("zhangsan", 24));
		ts.add(new A("wangwu", 25));
		ts.add(new A("haha", 30));
		ts.add(new A("haha", 20));

		sop("ts = "+ts);
	}
}
