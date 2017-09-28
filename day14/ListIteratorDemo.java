/*
 * ListIterator接口
 * */
import java.util.*;

class ListIteratorDemo
{
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

		sop("al = "+al);

		/*
		al.remove("java01");
		sop("al.remove(java01): "+al);

		al.remove(2);
		sop("al.remove(2): "+al);
		*/

		al.add(2, "hhh");
		sop("al.add(2, hh): "+al);

		al.set(3, "kkk");
		sop("al.set(3, kkk): "+al);

		for(int i = 0; i < al.size(); i++)
			sop("al<"+i+"> = "+al.get(i));

		List al1 = al.subList(2, 5);
		sop("al1 = "+al1);

		sop(al1.contains("java04"));
		sop(al1.isEmpty());
		sop(al1.containsAll(al));
		/*
		sop(al1.removeAll(al));
		sop(al1);
		*/
		sop(al1.retainAll(al));
		sop(al1);

		//Iterator迭代器只有三个方法
		//hasNext()
		//next()
		//remove()
		sop("---------------------------------");
		Iterator it = al.iterator();
		while(it.hasNext())
		{
			Object o = it.next();

			if(o.equals("java01"))
				it.remove();
		}
		sop(al);

		ListIterator it1 = al.listIterator();
		while(it1.hasNext())
		{	
			Object o = it1.next();

			if(o.equals("java02"))
			{
				it1.set("qqq");
			}
		}
		sop(al);
		while(it1.hasPrevious())
		{
			Object o = it1.previous();

			if(o.equals("kkk"))
				it1.set("world");
		}
		sop(al);
		sop("al.indexOf(world): " + al.indexOf("world"));

		Integer i1 = 127;
		Integer i2= 127;
		sop(i1==i2);
	}
}
