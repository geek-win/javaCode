import java.util.*;

class Demo
{

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();

		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");

		ArrayList al1 = new ArrayList();
		al1.add("haha01");;
		al1.add("haha02");
		al1.add("java03");
		al1.add("java04");

		sop("al = "+al);
		sop("al1 = "+al1);

		ArrayList al2 = new ArrayList();
		al2.addAll(al1);
		sop("al2 = "+al2);

		al2.add(2, "hhh");
		sop(al2);

		al2.clear();
		sop(al2);

		/*
		sop(al1.remove("haha02"));
		sop(al1);
		sop(al1.remove(2));
		sop(al1);
*/
		ArrayList al3 = new ArrayList();
		sop(al3.size());
		al3.add("java01");
		al3.add("java02");
		al3.add("java03");
		al3.add("java04");

		sop(al.equals(al3));

		sop(al+"---"+al3);

		sop("al.containsAll(al3): "+al.containsAll(al3));

		/*
		sop(al.removeAll(new ArrayList()));
		sop(al);

		*/
		sop("al = "+al);
		al.addAll(1, al1);
		sop("al = "+al);

		sop(al.contains("java09"));
		sop(al.set(2, "LL"));
		sop(al);

		sop("al.indexOf(java03):"+al.indexOf("java03"));
		sop("al.sublist(2, 5): "+al.subList(2, 5));
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

}
