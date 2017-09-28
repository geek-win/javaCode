import java.util.*;

class C
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		TreeSet<String> ts = new TreeSet<String>(new Comp());

		ts.add("agfa");
		ts.add("fews");
		ts.add("gfdhdsfs");
		ts.add("hfxdffdg");
		ts.add("v");
		ts.add("c");

		sop("ts = "+ts);
	}
}

class Comp implements Comparator<String>
{
	public int compare(String s1, String s2)
	{
		int num = s1.length() - s2.length();

		if(num == 0)
			return s1.compareTo(s2);

		return num;
	}
}
