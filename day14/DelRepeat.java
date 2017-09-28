/*
 * ArrayList练习
 * 去除ArrayList集合中的元素
 * 思路
 * 创建一个新的ArrayList集合，遍历原始集合中的元素，如果新集合中没有该元素
 * 就添加到心集合中，如果有，就不添加
 * */
import java.util.*;

class DelRepeat
{
	//去除ArrayList集合中重复的元素
	public static ArrayList singleElement(ArrayList al)
	{
		//创建一个空的ArrayList集合
		ArrayList al1 = new ArrayList();

		//遍历集合al中的元素
		//如果al1中有，就不添加
		//如果al1中没有，就添加
		for(ListIterator it = al.listIterator(); it.hasNext(); )
		{
			Object o = it.next();

			//判断空集合al1中是否含有al中元素
			if(!al1.contains(o))
				al1.add(o);
		}

		return al1;
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();

		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");
		al.add("java04");
		al.add("java04");
		al.add("java05");
		al.add("java05");
		al.add("java05");
		
		sop("al = "+al);
		sop("去除al集合中重复的元素："+singleElement(al));

		/*
		 * 在迭代时，循环中next()调用一次就要hasNext()判断一次
		for(Iterator it = al.iterator(); it.hasNext();)
			sop(it.next()+"----"+it.next());
		*/
	}
}
