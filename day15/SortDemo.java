/*
 * 将学生对象存储到List集合中
 * 然后使用Collections.sort(list)进行排序
 * */
import java.util.*;

class Student implements Comparable<Student>
{
	private String name;
	private int age;

	Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public int compareTo(Student s)
	{
		//按照姓名排序
		//如果姓名相同
		//就按照年龄排序
		int num = this.name.compareTo(s.name);

		if(num == 0)
			return new Integer(this.age).compareTo(new Integer(s.age));

		return num;
	}

	public String toString()
	{
		return this.name+"---"+this.age;
	}	

	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Student))
			return false;

		Student s = (Student)obj;
		return this.name.equals(s.name) && this.age == s.age;
	}
}

class SortDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		List<Student> list = new ArrayList<Student>();

		list.add(new Student("zhangsan", 20));
		list.add(new Student("lsii", 34));
		list.add(new Student("wagwu", 34));
		list.add(new Student("zhangsan", 23));
		list.add(new Student("zhangsan", 20));

		sop("list = "+list);

		//排序
		Collections.sort(list);
		sop("按照姓名排序："+list);
		sop("按照姓名排序，最大值："+Collections.max(list));
		Collections.sort(list, new StuCo());
		sop("按照年龄排序："+list);
		sop("按照年龄排序，最大值："+Collections.max(list, new StuCo()));

		//二分查找
		Collections.sort(list);
		int index1 = Collections.binarySearch(list, new Student("ngsan", 20));
		sop("按照姓名排序ngsan 20在："+index1);
		Collections.sort(list, new StuCo());
		int index2 = Collections.binarySearch(list, new Student("zhangsan", 30), new StuCo());
		sop("按照年龄排序，zhangsan 30在："+index2);

		//反转
		Collections.reverse(list);
		sop("反转后："+list);

		//replaceAll替换
		Collections.replaceAll(list, new Student("zhangsan", 20), new Student("LLL", 27));
		sop("替换后："+list);

		/*
		//fill替换
		Collections.fill(list, new Student("wwww", 20));
		sop("全部替换后："+list);
*/
	//	TreeSet<Student> ts = new TreeSet<Student>(Collections.reverseOrder());
	
		TreeSet<Student> ts = new TreeSet<Student>(Collections.reverseOrder(new StuCo()));
		ts.add(new Student("zhangsan", 20));
		ts.add(new Student("lisi", 24));
		ts.add(new Student("zhangsan", 20));
		ts.add(new Student("wangwu", 23));
		ts.add(new Student("jj", 35));

		sop("ts = "+ts);

		//交换顺序
		sop("list = "+list);
		Collections.swap(list, 2, 4);
		sop("交换2， 4："+list);

		//随机排序
		Collections.shuffle(list);
		sop("随机排序："+list);
	}
}

class StuCo implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		int num = new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));

		if(num == 0)
			return s1.getName().compareTo(s2.getName());

		return num;
	}
}
