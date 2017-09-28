/*
 * TreeSet
 * 可以对set集合中元素进行排序，按照字母顺序
 *
*/
import java.util.*;

class TreeSetDemo
{
	public static void sop(Object o)
	{
		System.out.println(o);
	}

	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();

		ts.add("aga");
		ts.add("gfhs");
		ts.add("adg");
		ts.add("cbad");

		sop("ts = "+ts);

		for(Iterator it = ts.iterator(); it.hasNext();)
			sop(it.next());
	}
}
