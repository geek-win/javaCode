/*
 * 操作容器中元素的方法有两种：迭代器方法、集合的方法
 * 二者操作的是容器中的元素，是相同的，所以不能同时使用两种方法对元素操作
 * 比如现在使用迭代器，就不能再用集合的方法进行删除、添加等
 * 可以看看迭代器自己的方法
 * void remove();//使用迭代器删除Collection中迭代器返回的最后一个元素
 *
 * */
import java.util.*;

class IteratorDemo
{
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();

		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");
		al.add("java05");

		sop("al = "+al);

		for(Iterator it = al.iterator(); it.hasNext();)
		{
			Object o = it.next();
			if(o.equals("java01"))
				it.remove();

//			sop(o);
		}
		sop(al);

		for(ListIterator li = al.listIterator(); li.hasNext();)
		{
			Object o = li.next();
			if(o.equals("java02"))
				li.set("hhh");
		}
		sop(al);

		ListIterator li = al.listIterator();
		while(li.hasNext())
			sop(li.next());

		sop("hasNext():"+li.hasNext());
		sop("hasPrevious():"+li.hasPrevious());

		while(li.hasPrevious())
			sop(li.previous());
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
