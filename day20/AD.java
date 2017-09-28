import java.util.*;

class S extends Person
{

}
class Person
{

}
class AD
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void show(ArrayList<? extends Person> al)
	{
		sop(al);
	}

	public static void main(String[] args)
	{
		ArrayList<Person> al = new ArrayList<Person>();

		al.add(new S());
		al.add(new S());
		al.add(new S());
		al.add(new S());

		show(al);

	}
}
