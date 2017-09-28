/*
 * 对ArrayList和LinkedList复习
 * 并且复习HashSet的保证元素唯一性
 * */
import java.util.*;

class Worker
{
	private String name;
	private int age;

	Worker(String name, int age)
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

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	//对其hashCode进行复写，以便自定义hash值的计算方法
	public int hashCode()
	{
		sop(this.name+"调用hashCode方法");
		return this.age*2;
	}
	
	//对其equals方法进行复写，以便自定义Worker对象的比较方法
	public boolean equals(Object obj)
	{
		sop(this.name+"调用了equals方法"+obj.toString());
		if(!(obj instanceof Worker))
			return false;

		Worker w = (Worker)obj;

		return this.getName().equals(w.getName()) && this.getAge() == w.getAge();
	}

	//对其toString方法进行复写，自定义Worker对象的输出格式
	public String toString()
	{
		return this.name+":::"+this.age;
	}
}

//定义队列类
//先进先出
class MyQueue
{
	//定义LinkedList集合作为队列的存储结构
	private LinkedList link;

	MyQueue()
	{
		link = new LinkedList();
	}

	//添加方法
	public void myadd(Object obj)
	{
		link.addLast(obj);
	}

	//删除队列头
	public void delHead()
	{
		link.removeFirst();
	}

	//删除队列尾
	public void delTail()
	{
		link.removeLast();
	}

	//判断是否为空
	public boolean isnull()
	{
		return link.isEmpty();
	}

}

//定义堆栈类
//先进后出
class Stack2
{
	//定义LinkedList集合作为堆栈的存储结构
	private LinkedList link;

	//构造函数
	//一初始化就创建LinkedList集合实体
	Stack2()
	{
		link = new LinkedList();
	}

	//添加元素
	public void myadd(Object obj)
	{
		link.addFirst(obj);
	}

	//删除堆栈顶
	public void delPeak()
	{
		link.removeFirst();
	}

	//判断是否为空
	public boolean isnull()
	{
		return link.isEmpty();
	}
}

class Re
{
	//简化输出函数
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	//定义ArrayList去除重复元素的函数
	public static ArrayList singleElement(ArrayList al)
	{
		//创建一个空的ArrayList集合
		ArrayList al1 = new ArrayList();

		//遍历al元素，看al1中是否包含该元素
		//如果包含就不添加
		//如果不包含就添加
		for(Iterator it = al.iterator(); it.hasNext();)
		{
			Object o = it.next();

			//al.contains(o)
			//如果al是null，那么直接返回false
			//如果al不是null
			//那么调用o.equals(e)，e是al中的元素
			//只要有一个true就返回true，代表有相同元素，不添加
			//如果都是false就放false，代表都没有相同元素，添加
			//所以归根结底调用的是equals方法
			if(!al1.contains(o))
				al1.add(o);
		}

		return al1;
	}

	public static void main(String[] args)
	{
		//创建ArrayList集合
		ArrayList al = new ArrayList();

		//添加元素
		al.add("java01");
		al.add("java02");
		al.add("java01");
		al.add("java02");
		al.add(new Worker("zhangsan", 20));
		al.add(new Worker("lisi", 23));
		al.add(new Worker("zhangsan", 20));
		al.add(new Worker("wangwu", 20));

		sop("al = "+al);

		al = singleElement(al);
		sop("自定义删除重复元素："+al);


		//创建LinkedList集合
		//进行添加，观察如何实现LinkedList集合中元素的唯一性
		HashSet hs = new HashSet();

		//添加元素
		//添加元素时hs.add(o)
		//首先调用o.hashCode()
		//如果没有相同的hash值，就添加，返回true
		//如果有相同的hash值，就调用o.equals(e)，e是hs中同hash值元素
		//如果有equals方法返回true的说明有相同元素，就不添加，返回false
		//如果所有的equals方法都返回false，说明没相同的，就添加，返回true
		sop(hs.add("java01"));
		sop(hs.add("java02"));
		sop(hs.add("java01"));
		sop(hs.add("java02"));
		sop(hs.add(new Worker("zhangsan", 20)));
		sop(hs.add(new Worker("lisi", 23)));
		sop(hs.add(new Worker("zhangsan", 20)));
		sop(hs.add(new Worker("wangwu", 20)));

		sop("hs = "+hs);

		//HashSet集合的判断是否包含方法
		sop("hs.contains(java01)"+hs.contains("java01"));
		sop("hs.contains(zhangsan, 20)"+hs.contains(new Worker("zhangsan", 20)));
		sop("hs.contains(zs, 20)"+hs.contains(new Worker("zs", 20)));
	
		//HashSet集合的删除方法
		sop("hs.remove(java01)"+hs.remove("java01"));
		sop("hs.remove(zhangsan,20)"+hs.remove(new Worker("zhangsan", 20)));
		sop("hs = "+hs);
		sop("hs.remove(zs, 20)"+hs.remove(new Worker("zs", 20)));

		sop("经过处理后的hs："+hs);
	}
}


