/*
 * TreeSet集合
 * TreeSet保证集合中元素唯一的原理是
 * 1、元素具备比较性，必须实现Comparable接口，复写int compareTo(Object obj)方法
 * 2、集合本身一初始化就有比较元素大小的功能，就是构造函数中传入一个比较器
 *		比较器就是实现Comparator接口的子类，并且必须复写boolean compare(Object o1, Object o2)
 *
 * */
import java.util.*;

class LuLu implements Comparable
{
	private String name;
	private int age;

	LuLu(String name, int age)
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

	//复写LuLu的输出方式
	public String toString()
	{
		return this.name+":::"+this.age;
	}

	//复写hashCode方法
	//如果该对象加入HashCode集合中
	//保证元素唯一的原理是
	//首先判断元素的hashCode是否相同
	//如果不同，那么就不是同一个元素
	//如果相同，就需要调用元素的equals方法
	//然后如果有相同的元素那么就有相同的
	//如果没有相同的，那就是唯一的
	public int hashCode()
	{
		System.out.println(this.name+".....hashCode.....");
		return this.age*2;
	}

	//复写equals方法
	//对于ArrayList和HashCode来说
	//保证元素唯一的原理是equals方法
	//对于ArrayList集合
	//al.contains(o)
	//调用的是o.equals(e)，e是al中的元素
	//对于HashCode集合
	//hs.contains(o)和hs.remove(e)很相似
	//首先调用o.hashCode()如果有相同的
	//就调用o.equals(e)，e是hs中和o的hash值相同的元素
	//hs.add(o)
	//首先调用o.hashCode()
	//如果没有相同的，那么就返回true，证明没有相同的元素
	//那么这时就会添加进hs
	//如果有相同的，会调用o.equals(e)，e是hs中和o的hash值相同的元素
	//如果有相同的那么就不添加，返回false，如果没有相同的那就返回true，添加
	public boolean equals(Object obj)
	{
		if(!(obj instanceof LuLu))
			return false;

		LuLu ll = (LuLu)obj;

		System.out.println(this.name+"...equals..."+ll.name+".."+ll.age);
		return this.name.equals(ll.name) && this.age == ll.age;
	}

	//复写Comparable接口的compareTo方法
	//自定义元素的比较方式
	public int compareTo(Object obj)
	{
		//如果不是同一类元素
		//就无法进行比较
		//抛出异常
		//由于是实现Comparable接口
		//而Comparable接口中该方法没有抛出异常
		//所以子类函数也不能抛出异常
		//只能在函数中抛出就可以
		//不需要在函数上声明
		if(!(obj instanceof LuLu))
			throw new RuntimeException("不是LuLu类");

		LuLu ll = (LuLu)obj;

		System.out.println(this.name+"..."+this.age+"...compareTo..."+ll.name+".."+ll.age);

		//按照两个元素的年龄进行排序
		//谁大谁在上
		if(this.age > ll.age)
			return 1;
		//如果年龄相同，比较名字
		//按照字母顺序
		if(this.age == ll.age)
			return this.name.compareTo(ll.name);

		return -1;
			
	}

}

//定义比较器
//实现Comparator接口
//复写其compare方法
class MyCompator implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		LuLu l1 = (LuLu)o1;
		LuLu l2 = (LuLu)o2;

		//按照姓名的字母顺序进行排序
		//如果姓名相同
		//就比较年龄
		int num = l1.getName().compareTo(l2.getName());

		System.out.println(l1.getName()+"..."+l1.getAge()+"&&"+l2.getName()+"..."+l2.getAge());
		if(num == 0)
			return l1.getAge()-l2.getAge();
	
		//return new Integer(l1.getAge()).compareTo(new Integer(l2.getAge()));

		return num;
	}
}


class TreeSetDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		//定义TreeSet集合
		TreeSet ts = new TreeSet(new MyCompator());

//		sop(ts.add("jajva"));
		sop(ts.add(new LuLu("zhangsan", 10)));
		sop(ts.add(new LuLu("lisi", 10)));
		sop(ts.add(new LuLu("zhangsan", 30)));
		sop(ts.add(new LuLu("wangwu", 34)));
		sop(ts.add(new LuLu("haha", 10)));
		sop(ts.add(new LuLu("lisi", 10)));
		
		//sop("没有比较器，元素具有比较性，按照年龄进行排序");
		sop("有比较器，元素同样具有比较性，按照姓名进行排序");

		sop("ts = "+ts);


		//定义HashCode集合
		HashSet hs = new HashSet();

		sop(hs.add(new LuLu("zhangsan", 10)));
		sop(hs.add(new LuLu("lisi", 10)));
		sop(hs.add(new LuLu("zhangsan", 30)));
		sop(hs.add(new LuLu("wangwu", 34)));
		sop(hs.add(new LuLu("haha", 10)));
		sop(hs.add(new LuLu("lisi", 10)));

		sop("hs = "+hs);
	}
}
