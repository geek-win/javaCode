/*
 * 泛型限定
 * １、向上限定
 * ? extends E：表示可以接收Ｅ类型或者其子类
 * ２、向下限定
 * ? super E：表示可以接收Ｅ类型或者其父类
 * 但是感觉这个方法经常出问题
 * 因为如果要使用子类方法时，父类不一定有这个方法
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

	public String toString()
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
}

//定义比较器
class C implements Comparator<Person>
{
	public int compare(Person p1, Person p2)
	{
		return p1.getName().compareTo(p2.getName());
	}

}

class GenericDemo9
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		TreeSet<Student> ts = new TreeSet<Student>(new C());

		ts.add(new Student("zhanshan"));
		ts.add(new Student("zhanshan03"));
		ts.add(new Student("zhanshan90"));
		ts.add(new Student("zhanshan04"));

		sop("ts = "+ts);

		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("zhanshan"));
		al.add(new Student("zhanshan03"));
		al.add(new Student("zhanshan90"));
		al.add(new Student("zhanshan04"));
	
		sop("al = ");
		print(al);

		ArrayList<Person> al1 = new ArrayList<Person>();
		al1.add(new Person("zhanshan"));
		al1.add(new Person("zhanshan03"));
		al1.add(new Person("zhanshan90"));
		al1.add(new Person("zhanshan04"));
	
		sop("al1 = ");
		print(al1);

		sop("使用只接收Person元素的集合输出：");
		printB(al1);
		sop("使用只接收Student元素的集合输出：");
		printC(al);
	}

	public static void print(ArrayList<? extends Person> al)
	{
		for(Iterator<? extends Person> it = al.iterator(); it.hasNext();)
			sop("---"+it.next().getName());
	}
	//只能接收元素是Person类型的集合
	//如果要接收其子类
	//那么需要用占位符?
	public static void printB(ArrayList<Person> al)
	{
		for(Iterator<Person> it = al.iterator(); it.hasNext();)
			sop(it.next().getName());
	}

	public static void printC(ArrayList<Student> al)
	{
		for(Iterator<Student> it = al.iterator(); it.hasNext();)
			sop(it.next().getName());
	}
/*
 * 有问题
 * 因为这个形式参数中的集合
 * 集合中元素类类型是Student或者其父类
 * 但是其父类不一定有getName方法
 * 所以会编译失败
	public static void printA(ArrayList<? super Student> al)
	{
		for(Iterator<? super Student> it = al.iterator(); it.hasNext();)
			sop("...."+it.next().getName());
	}
	*/
}
