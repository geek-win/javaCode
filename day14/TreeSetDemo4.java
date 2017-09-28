/*
 * TreeSet集合中规定
 * 元素必须能够相互进行比较
 * 万一元素真的没有比较性呢？
 * 或者本身有比较性，比如学生是按年龄比较
 * 但是现在需求变了，想按照其他方式进行比较
 * 现在怎么办？
 * 这就是第二种排序方式
 * 让集合具备比较性，能够自动对元素进行比较
 * 在集合初始化时，就有了比较方式
 * 也就是说构造函数
 * TreeSet(Comparator<? super E> comparator)
 * 构造函数需要
 * */

import java.util.*;

class TreeSetDemo4
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		//创建TreeSet集合
		TreeSet ts = new TreeSet(new MyCompare());

		//添加元素
		//sop(ts.add("java01"));
		//如果先添加了字符串，那么就无法添加S对象
		//因为字符串和S对象之间无法进行比较
		sop(ts.add(new S("zhangsan", 10)));
		sop(ts.add(new S("zhangsan", 20)));
		sop(ts.add(new S("lisi", 9)));
		sop(ts.add(new S("wangwu", 28)));
		sop(ts.add(new S("wangwu", 28)));

		sop("ts = "+ts);

	}
}

//TreeSet集合第二种排序方式
//集合自身具备比较性
//集合一初始化就具备比较性
//使用的是TreeSet的构造函数
//TreeSet(Comparator<? super E> comparator)
//new TreeSet(比较器对象)
//比较器就是实现了Comparator接口的类的对象
//现在定义比较器
class MyCompare implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		S s1 = (S)o1;
		S s2 = (S)o2;

		/*
		//按照年龄进行排序
		return s1.getName().compareTo(s2.getName());
		*/
		/*
		//首先按照姓名排序，然后按照年龄排序
		if(s1.getName().equals(s2.getName()))
			return s1.getAge() - s2.getAge();

		return s1.getName().compareTo(s2.getName());
		*/
		//定义num为s1和s2年龄的比较结果
		int num = s1.getName().compareTo(s2.getName());
		//使用Integer对象对年龄进行封装
		if(num == 0)
		{
			//说明两个姓名相同
			//现在需要比较二者的年龄
			/*
			Integer i1 = s1.getAge();
			Integer i2 = s2.getAge();

			return i1.compareTo(i2);
			*/

			return new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));
		}

		return num;
	}
}

//TreeSet集合第一种排序方式：自然排序
//让元素自身具备比较性
//元素需要实现Comparable接口
//然后复写compareTo方法
class S
{
	private String name;
	private int age;

	S(String name, int age)
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

	//复写hashCode方法
	//如果S对象要存入HashSet中
	//那么hs.add(o)，hs.contains(o)，hs.remove(o)
	//会先调用hasCode方法
	//如果没有相同的那么就直接返回true或者false
	//如果有相同的
	//那么就需要调用o.equals(e)
	//e是hash相同的那些元素
	//直到有个equals方法返回true，证明有相同的
	//然后对于add返回false
	//对于contains以及remove
	//返回true
	//remove会将该元素直接删除
	public int hashCode()
	{
		return this.age * 2;
	}

	//复写equals方法
	//因为如果要添加到ArrayList中
	//al.contains(o)调用的是底层的o.equals(e)，e是al中的元素
	public boolean equals(Object obj)
	{
		if(!(obj instanceof S))
			return false;

		S s = (S)obj;

		return this.name.equals(s.name) && this.age == s.age;
	}


	//复写toString方法
	public String toString()
	{
		return this.name+":::"+this.age;
	}
	
}
