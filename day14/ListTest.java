/*
 * List类的方法
 * */
import java.util.*;

class ListTest
{
	public static void method()
	{
		ArrayList al1 = new ArrayList();

		//添加
		al1.add("java01");
		al1.add("java02");
		al1.add("java03");
		al1.add("java04");

		sop("al1: "+al1);

		/*
		al1.add(3, "hello");
		sop("al1添加角标3元素为hello："+al1);
*/
		ArrayList al2 = new ArrayList();
		al2.add("java05");
		al2.add("java06");

		sop(al1.removeAll(al2));

		sop(al1+"---"+al2);

		sop(al1.remove(1));
		sop(al1);
		sop(al1.remove("java01"));

		sop(al1);
		sop(al1.set(1, "jjjj"));
		sop(al1);

		sop(al1.get(0));

		sop(al1.size());

		//获取
		for(Iterator it = al1.iterator(); it.hasNext();)
			sop(it.next());

		//获取
		for(int i = 0; i < al1.size(); i++)
			sop(al1.get(i));

		al2.addAll(al1);

		sop("al2 = "+al2);

		sop(al2.subList(2, 4));

		Object[] s = al1.toArray();
		for(int i = 0; i < s.length; i++)
			sop("---"+s[i]);

		al1.add("java01");
		al1.add("java02");

		sop("al1 = "+al1);
		sop("index = "+al1.indexOf("java01"));

		List sub = al1.subList(1, 3);

		sop("sub = "+sub);

		ArrayList a1 = new ArrayList();
		ArrayList a2 = new ArrayList();

		a1.add("hh");
		a2.add("hh");
		sop(a1+"---"+a2);
		sop(a1.retainAll(a2));

	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		method();
	}
}
