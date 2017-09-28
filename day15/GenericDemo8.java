/*
 * 对ArrayList进行处理
 * */
import java.util.*;

class Person
{
	private String name;
	Person(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
}
class Student extends Person implements Comparable<Student>
{
	Student(String name)
	{
		super(name);
	}

	public int compareTo(Student s)
	{
		return this.getName().compareTo(s.getName());
	}

	public String toString()
	{
		return this.getName();
	}
}

class GenericDemo8
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();

		al.add("asf");
		al.add("gfe");
		al.add("Gere");
		al.add("gee");

		ArrayList<Integer> al1 = new ArrayList<Integer>();

		al1.add(5);
		al1.add(3);
		al1.add(6);
		al1.add(2);
		
		/*
		sop("al = ");
		printColl(al);
		sop("al1 = ");
		printColl(al1);
		*/

		ArrayList<Person> al2 = new ArrayList<Person>();
		al2.add(new Person("zhangsan"));
		al2.add(new Person("lisi"));
		al2.add(new Person("wangwu"));
		sop("Perosn----------------");
		prinPerson(al2);

		ArrayList<Student> al3 = new ArrayList<Student>();
		al3.add(new Student("zhangsan"));
		al3.add(new Student("lisi"));
		al3.add(new Student("wangwu"));
//		printColl1(al3);
//		报错
		//相当于
		//ArrayList<Person> al = new ArrayList<Student>();
		//而包含子类对象的集合不能转化成包含父类对象的集合
		//al中能存放Person，可以存Student也可以存Worker，但是右边的意思是只能存Student。所以不行
		//意思是左右两边要一致
		//但是我现在还想打印Student
		//这就是泛型限定
		//ArrayList<? extends Person> al
		//意思是只能传入Person或者其子类
		sop("Student:---------------");
		prinPerson(al3);

		sop("-------------------------------");
		TreeSet<Student> ts = new TreeSet<Student>(new Com());

		ts.add(new Student("abc01"));
		ts.add(new Student("abc02"));
		ts.add(new Student("abc03"));

		sop("ts = "+ts);

	}
	/*
	public static void printColl1(ArrayList<Person> al)
	{
		for(Iterator<Person> it = al.iterator(); it.hasNext();)
			sop(it.next().getName());
	}
*/
	//泛型限定
	//规定泛型类型是某一类或子类
	//这时候需要用到泛型限定
	//这是向上限定
	//? extends E：可以接收E类型或其子类
	public static void prinPerson(ArrayList<? extends Person> al)
	{
		for(Iterator<? extends Person> it = al.iterator(); it.hasNext();)
			sop(it.next().getName());
	}
/*
	//泛型限定
	//向下限定
	//? super E：可以接收E类型或其父类
	public static void prinStudent(ArrayList<? super Student> al)
	{
		for(Iterator<? super Student> it = al.iterator(); it.hasNext();)
			sop(it.next().getName());
	}
*/
	/*
	public static <T> void printColl(ArrayList<T> al)
	{
		for(Iterator<T> it =  al.iterator(); it.hasNext();)
		{
			T t = it.next();

			sop(t);
		}
	}

	public static void printColl(ArrayList<?> al)
	{
		for(Iterator<?> it = al.iterator(); it.hasNext();)
			sop(it.next());
	}
	*/
}
//定义比较器
class Com implements Comparator<Person>
{
	public int compare(Person o1, Person o2)
	{
		return o1.getName().compareTo(o2.getName());
	}
}
/*
public void prin(ArrayList<? extends E> al)
{
	//可以接收Ｅ或者Ｅ的子类的集合
}
*/
