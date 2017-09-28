/*
 * 泛型演示
 * */
import java.util.*;

class GenericDemo2
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		TreeSet<String> ts = new TreeSet<String>(new My());

		ts.add("gfjlkaksgld");
		ts.add("asdgg");
		ts.add("sdgdg");
		ts.add("esgfs");

		for(Iterator<String> it = ts.iterator(); it.hasNext();)
		{
			String s = it.next();
			sop(s+"----"+s.length());
		}
	}
}

class My implements Comparator<String>
{
	public int compare(String o1, String o2)
	{
		int num = new Integer(o1.length()).compareTo(new Integer(o2.length()));

		if(num == 0)
			return o1.compareTo(o2);

		return num;
	}
}
