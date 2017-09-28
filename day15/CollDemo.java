/*
 * Collections工具类的方法演示
 * 1、排序
 * 2、求最大值
 * 3、二分查找
 * 4、替换反转
 * 5、反向输出
 * 6、交换两元素
 * 7、随机变换
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

	public String getName()
	{
		return this.name;
	}

	public int getAge()
	{
		return this.age;
	}

	public int compareTo(Student s)
	{
		//以比较年龄为主
		int num = new Integer(this.age).compareTo(new Integer(s.age));

		if(num == 0)
		{
			return this.name.compareTo(s.name);
		}

		return num;
	}

	public int hashCode()
	{
		return this.name.hashCode()+this.age*2;
	}
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Student))
		{
			return false;
		}

		Student s = (Student)obj;

		return this.name.equals(s.name) && this.age == s.age;
	}

	public String toString()
	{
		return this.name+"---"+this.age;
	}
}

class CollDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		List<Student> list = new ArrayList<Student>();

		list.add(new Student("zhangsan", 20));
		list.add(new Student("lisi", 23));
		list.add(new Student("wangwu", 20));
		list.add(new Student("sagfa", 19));
		list.add(new Student("edcsd", 25));
		list.add(new Student("zhangsan", 16));

		sop("list原始为："+list);

		//排序、最大值、二分查找
		Collections.sort(list);
		sop("按照年龄排序。按照元素自身比较方式进行排序："+list);
		sop("最大值: "+Collections.max(list));
		sop("查找zhangsan，16："+Collections.binarySearch(list, new Student("zhangsan", 16)));
		sop("使用自定义halfSearch: "+halfSearch1(list, new Student("zhangsan", 16)));

		Collections.sort(list, new StudentComparator());
		sop("按照姓名排序。按照比较器进行排序："+list);
		sop("最大值："+Collections.max(list, new StudentComparator()));
		sop("查找zhangsan，16："+Collections.binarySearch(list, new Student("zhangsan", 16), new StudentComparator()));
		sop("使用自定义函数halfSearch："+halfSearch1(list, new Student("zhangsan", 16), new StudentComparator()));

		//替换
		Collections.replaceAll(list, new Student("zhangsan", 16), new Student("LLLL", 25));
		sop("替换后："+list);

		//反转
		Collections.reverse(list);
		sop("反转后："+list);

		//全部替换
		Collections.fill(list, new Student("zs", 23));
		sop("全部替换后："+list);

		//创建TreeSet集合
		//传入reverseOrder
		//该函数返回的是一个比较器
		//所以只能出现在TreeSet和TreeMap集合中
		TreeSet<Student> ts = new TreeSet<Student>(Collections.reverseOrder(new StudentComparator()));

		ts.add(new Student("zhangsan", 13));
		ts.add(new Student("lisi", 23));
		ts.add(new Student("hh", 23));
		ts.add(new Student("hh", 10));

		sop("ts = "+ts);


	}

	//自己实现二分查找
	//形式参数中的list集合必须的排好序的
	//根据元素自身的比较方式进行比较大小
	public static int halfSearch1(List<Student> list, Student key)
	{
		//定义list集合的开头和结尾
		int min = 0, max = list.size()-1, mid;

		while(min <= max)
		{
			mid = (min+max)/2;

			Student s = list.get(mid);

			int num = s.compareTo(key);
			if(num == 0)
				return mid;
			else if(num > 0)
				max = mid - 1;
			else
				min = mid + 1;
		}

		return min;
	}

	//自己实现二分查找
	//形式参数中传入的list集合必须是排好序的
	//并且使用所传入的比较器的比较方式对元素大小进行比较
	//由于和上述函数只是形式参数不同
	//功能相同
	//所以使用相同的函数名
	//这就是重载
	public static int halfSearch1(List<Student> list, Student key, Comparator<Student> cmp)
	{
		int min = 0, max = list.size() - 1, mid;
		
		while(min <= max)
		{
			mid = (min+max)/2;

			Student s = list.get(mid);
			int num = cmp.compare(s, key);

			if(num == 0)
				return mid;
			else if(num > 0)
				max = mid - 1;
			else
				min = mid + 1;
		}

		return min;
	}
}

//比较器
//实现Comparator接口
class StudentComparator implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		//以比较姓名为主
		int num = s1.getName().compareTo(s2.getName());

		if(num == 0)
			return new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));

		return num;
	}
}
