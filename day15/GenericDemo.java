/*
 * 集合框架泛型
 * jdk1.5版本之后出现了泛型
 * 新特性，用于解决安全问题，是一个安全机制
 * 好处：
 * 1、将运行时期出现的问题ClassCastException，转移到了编译时期
 * 方便程序员解决问题，让运行时期问题减少安全。
 * 2、避免了类型强转的麻烦
 * */
import java.util.*;

class GenericDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();

		//al中只能存放String类型
		//因为泛型规定了al集合中存放元素的类型
		//所以存储的时候必须按照规定类型存储
		al.add("hahhah");
		al.add("ghallkg");

		for(Iterator<String> it = al.iterator(); it.hasNext();)
		{
			String s = it.next();

			sop(s+"..."+s.length());
		}
	}
}
