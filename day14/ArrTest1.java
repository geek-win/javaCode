/*
 * 将自定义对象作为元素存到ArrayList集合中，并去除重复元素
 * 比如：存人对象，同姓名、同年龄，视为同一个人，为重复元素
 * 思路：
 * 1、对Person类进行描述
 *	姓名、年龄
 * 2、定义容器，将人对象添加到集合中
 * 3、存储时判断是否有该元素
 * */
import java.util.*;

class Person
{
	private String name;
	private int age;

	Person(String name, int age)
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
	//按照自定义方式进行判断
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Person))
			return false;

		Person p = (Person)obj;

		System.out.println(this.name+"-----"+p.getName());
		return this.name.equals(p.getName()) && (this.age==p.getAge());
	}

	public String toString()
	{
		return this.getName()+"::"+this.getAge();
	}
}

class ArrTest1
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	//去除ArrayList中重复的自定义元素
	//如果对象的性别、年龄相同
	//认为是同一个人
	//直接去除
	public static ArrayList singleElement(ArrayList al)
	{
		//创建一个空的集合al1
		ArrayList al1 = new ArrayList();

		//遍历al中的元素
		//将al1中没有的元素添加到al1中
		for(Iterator it = al.iterator(); it.hasNext();)
		{
			Object o = it.next();

			/*
			if(!(o instanceof Person))
				break;

			//判断子类类型，然后向下转型
			Person p = (Person)o;
			*/

			//判断al1中是否有相同元素
			//根据姓名、年龄是否相同进行判断
			//contains方法应该是调用了equals方法
			//equals方法在底层被自动调用
			if(!al1.contains(o))
				al1.add(o);

		}

		return al1;
	}

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();

		//在容器中添加自定义对象人
		al.add(new Person("zhangsan", 10));
		al.add(new Person("lisi", 10));
		al.add(new Person("wangwu", 20));
		al.add(new Person("zhangsan", 10));

		//取元素
		Iterator it = al.iterator();

		/*
		while(it.hasNext())
		{
			Object o = it.next();

			if(!(o instanceof Person))
				break;

			Person p = (Person)o;

			sop(p.getName()+"----"+p.getAge());
		}
		*/

		//去除重复元素
		sop(singleElement(al));
		sop(al.remove(new Person("zhangsan", 10)));
		sop(al);

	}
}
