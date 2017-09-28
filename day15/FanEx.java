/*
 * 泛型限定练习
 * */
import java.util.*;

class Pe
{
	private String name;
	private int age;

	Pe(String name, int age)
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

	public String toString()
	{
		return this.name+"...."+this.age;
	}
}

class Stu extends Pe implements Comparable<Stu>
{
	Stu(String name, int age)
	{
		super(name, age);
	}

	//复写compareTo方法
	public int compareTo(Stu s)
	{
		int num = new Integer(this.getAge()).compareTo(new Integer(s.getAge()));

		if(num == 0)
			return this.getName().compareTo(s.getName());

		return num;
	}
}

class Wo extends Pe
{
	Wo(String name, int age)
	{
		super(name, age);
	}
}

//比较器
//使用泛型
//比较Stu类型
class Com implements Comparator<Stu>
{
	public int compare(Stu o1, Stu o2)
	{
		int num = new Integer(o1.getAge()).compareTo(new Integer(o2.getAge()));

		if(num == 0)
			return o1.getName().compareTo(o2.getName());

		return num;
	}
}

//比较器
//用来比较Wo类
class Com1 implements Comparator<Wo>
{
	public int compare(Wo o1, Wo o2)
	{
		int num = new Integer(o1.getAge()).compareTo(new Integer(o2.getAge()));

		if(num == 0)
			return o1.getName().compareTo(o2.getName());

		return num;
		
	}
}

//比较器
//用来比较Pe及其子类
class Comp implements Comparator<Pe>
{
	public int compare(Pe p1, Pe p2)
	{
		int num = p1.getName().compareTo(p2.getName());

		if(num == 0)
			return new Integer(p1.getAge()).compareTo(new Integer(p2.getAge()));

		return num;
	}
}

class FanEx
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		/*
		ArrayList<Pe> al = new ArrayList<Pe>();

		al.add(new Pe("zhangsan", 10));
		al.add(new Pe("lisi", 20));
		al.add(new Pe("wangwu", 30));

		ArrayList<Stu> al1 = new ArrayList<Stu>();

		al1.add(new Stu("zhangsan", 10));
		al1.add(new Stu("lisi", 20));
		al1.add(new Stu("wangwu", 30));

		sop("al = "+al);
		sop("al1 = "+al1);
		sop("-------------------------------------------------");
		sop("al ");
		print(al);
		sop("al1 ");
		print(al1);
		
		sop("-----------------------------");
		printB(al);
		printB(al1);
		*/
		TreeSet<Stu> ts = new TreeSet<Stu>(new Comp());

		ts.add(new Stu("zhangsan", 10));
		ts.add(new Stu("hahah", 20));
		ts.add(new Stu("wamgwi", 23));
		ts.add(new Stu("adsjga", 20));

		sop("ts = "+ts);

		//如果存Wo类型元素
		//还需要再传一个新的比较器
		//所以我们需要简化一下
		TreeSet<Wo> ts1 = new TreeSet<Wo>(new Comp());

		ts1.add(new Wo("zhangsan", 10));
		ts1.add(new Wo("hahah", 20));
		ts1.add(new Wo("wamgwi", 23));
		ts1.add(new Wo("adsjga", 20));

		sop("ts1 = "+ts1);
	}

	//使用泛型限定
	//输出Pe和Stu类型元素的集合
	public static <T> void print(ArrayList<T> al)
	{
		for(Iterator<T> it = al.iterator(); it.hasNext(); )
			sop(it.next());
	}

	//使用向上限定
	//使得Pe及其子类对象的集合可以正常输出
	public static void printA(Collection<? extends Pe> al)
	{
		for(Iterator<? extends Pe> it = al.iterator(); it.hasNext();)
			sop(it.next().getName());
	}

	//使用泛型通配符?
	public static void printB(Collection<?> al)
	{
		for(Iterator<?> it = al.iterator(); it.hasNext();)
			sop(it.next());
	}
}

