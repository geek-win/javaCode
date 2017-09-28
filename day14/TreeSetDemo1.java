/*
 * TreeSet中的元素必须具备比较性
 * 也就是说
 * 存入TreeSet集合中的元素必须实现Comparable接口，实现compareTo方法
 * 自定义比较方法
 * 如果相同就返回0，代表相同，不添加
 * 其余的按照大小顺序进行排序
 * */
import java.util.*;

class TreeSetDemo1
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		TreeSet ts = new TreeSet();

		sop(ts.add(new Student("zhangsan", 20)));
		sop(ts.add(new Student("lisi", 20)));
		sop(ts.add(new Student("zhangsan", 29)));
		sop(ts.add(new Student("wangwu", 23)));
		sop(ts.add(new Student("zhangsan", 20)));

		for(Iterator it = ts.iterator(); it.hasNext();)
			sop(it.next());
	}
}

class Student implements Comparable
{
	private String name;
	private int age;

	Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	public void setAge(int age)
	{
		this.age = age;
	}

	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}

	/*
	//复写比较方法
	public int compareTo(Object obj)//不可以声明抛异常，因为复写的原始函数没有异常
	{
		if(!(obj instanceof Student))
			throw new RuntimeException("不是学生类");

		Student s = (Student)obj;

		System.out.println(this.name+"...compareTo..."+s.name+".."+s.age);

		if(this.age > s.age)
			return 1;
		if(this.age == s.age)
			return this.name.compareTo(s.name);

		return -1;
	}
	*/

	//如果想怎么存的怎么取如何实现？
	//compareTo方法全部返回正整数即可
	public int compareTo(Object obj)
	{
		return -1;
	}

	//复写toString方法
	//即输出方式
	public String toString()
	{
		return this.getName()+"------"+this.getAge();
	}

}
