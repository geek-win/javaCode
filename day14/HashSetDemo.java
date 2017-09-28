/*
 * Set集合
 * 和Collection方法一致
 * add(E e)
 * addAll(Collection c)
 * clear()
 * contains(E e)
 * containsAll(Collection c)
 * isEmpty()
 * remove(E e)
 * removeAll(Collection c)
 * retainAll(Collection c)
 * size()
 * toArray()
 * iterator()
 * set集合只有一种取出方式使用迭代器
 * Set接口下有两个常用的set表
 *	|--HashSet
 *		底层数据结构是hash表
 *		其中的存储是按照存储对象的hash值来确定的
 *		元素的取出也是按照hash值的顺序来确定，所以并不一定是存储顺序
 *		Set集合中的元素不能重复，也就是说hash值相同的对象要进行判断
 *		如果hash值相同的对象相同那么就只能存一个
 *		hash值相同就是说位置一样，这个时候需要判断对象是否相同
 *		如果不相同，就在相同的位置下顺延一个位置，用来存放另一个对象
 *		判断对象是否相同，还是使用的equals方法
 *		先看hash值是否相同，如果不同就直接存，如果相同就判断对象是否相同
 *		使用的是对象的equals方法
 *	|--TreeSet
 * */
import java.util.*;

class Demo
{
	public int hashCode()
	{
		return 199;
	}
	public String toString()
	{
		return "hahhah";
	}

	public boolean equals(Object obj)
	{
		return true;
	}

}

//自定义
class A
{
	String name;
	int age;

	A(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public int hashCode()
	{
		return this.age+10;
	}

	public boolean equals(Object obj)
	{
		return true;
	}
}

class HashSetDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		HashSet hs = new HashSet();

		//hashset添加元素时，先计算其hash值
		//如果hash值相同
		//再使用equals方法
		hs.add("java01");
		hs.add("java02");
		hs.add("java03");
		hs.add("java01");
		hs.add("java01");

		sop(hs.add(new Demo()));
		sop(hs.add(new Demo()));

		/*
		for(Iterator it = hs.iterator(); it.hasNext();)
			sop(it.next());
		*/
		sop(hs.add(new A("hh", 20)));
		sop(hs.add(new A("jj", 10)));

		sop(hs);
	}
}
