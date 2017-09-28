import java.util.*;

class T
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();

		ts.add(new Stu("aghhas"));
		ts.add(new Stu("hfds"));

		sop("ts = "+ts);

	}
}

class Stu implements Comparable<Stu>
{
	private String name;

	Stu(String name)
	{
		this.name = name;
	}

	public int compareTo(Stu s)
	{
		return this.name.compareTo(s.name);
	}
}
