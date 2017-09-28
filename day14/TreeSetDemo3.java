/*
 * TreeSet复习
 * TreeSet底层数据结构是二叉树，根节点为第一个添加的元素
 * 根节点左边是比其小的元素
 * 根节点右边是比其大的元素
 * 每个节点的左边是比其小的元素
 * 每个节点的右边是比其大的元素
 * */
import java.util.*;

class TreeSetDemo3
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		//创建TreeSet集合
		TreeSet ts = new TreeSet();

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

class S implements Comparable
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

	//复写实现的Comparable接口的compareTo方法
	//因为如果该对象要存放到TreeSet集合中
	//存放到TreeSet集合中的对象要具备可比性
	//也就是要实现Comparable接口
	//然后复写其compareTo方法
	public int compareTo(Object obj)
	{
		//自定义比较方法
		//如果直接返回正整数
		//那么就直接存到右支上
		//输出的时候按照存储顺序进行输出
		//如果直接返回负整数
		//那么就直接存到左支上
		//输出顺序是倒序输出
		//如果直接返回0
		//那就说明所有的元素都相同
		//那么只能存储第一个元素
		if(!(obj instanceof S))
			throw new RuntimeException("比较对象不是S类型");

		S s = (S)obj;

		System.out.println(this.name+".."+this.age+"...compareTo..."+s.name+".."+s.age);

		if(this.age > s.age)
			return 1;
		if(this.age == s.age)
			return this.name.compareTo(s.name);

		return -1;
	}

	//复写toString方法
	public String toString()
	{
		return this.name+":::"+this.age;
	}
	
}
