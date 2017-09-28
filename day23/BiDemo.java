/*
 * 自己实现集合的二分查找方法
 * Collections.binarySearch(List<T> list, T key)
 * Collections.binarySearch(List<T> list, T key, Comparator<T> comp)
 * */
import java.util.*;

class Stu implements Comparable<Stu>
{
	private String name;
	private int age;

	Stu(String name, int age)
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

	//复写hashCode方法
	public int hashCode()
	{
//		System.out.println(this.name+"..."+this.age+"调用了hashCode");

		return this.name.hashCode()+this.age*2;
	}

	//复写equals
	public boolean equals(Object obj)
	{
		if(!(obj instanceof Stu))
			return false;

		Stu s = (Stu)obj;
		
//		System.out.println(this.name+"..."+this.age+"...equals..."+s.name+"..."+s.age);
		return this.name.equals(s.name) && this.age == s.age;
	}

	//复写compareTo方法
	public int compareTo(Stu s)
	{
//		System.out.println(this.name+"..."+this.age+"..compareTo.."+s.name+"..."+s.age);
		//以年龄比较为主
		int num = new Integer(this.age).compareTo(new Integer(s.age));

		//如果年龄相同
		//按照姓名排序
		if(num == 0)
			return this.name.compareTo(s.name);

		return num;
	}

	//复写toString方法
	public String toString()
	{
		return this.name+"----"+this.age;
	}
}

//创建比较器
//按照Stu姓名排序
class StuComp implements Comparator<Stu>
{
	public int compare(Stu s1, Stu s2)
	{
//		System.out.println(s1.getName()+".."+s1.getAge()+"--VS--"+s2.getName()+".."+s2.getAge());
		//以姓名比较为主
		int num = s1.getName().compareTo(s2.getName());

		//如果姓名相同
		//按照年龄排序
		if(num == 0)
			return new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));

		return num;
	}
}

class BiDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		//创建List集合
		List<Stu> list = new ArrayList<Stu>();

		sop(list.add(new Stu("zhangsan01", 20)));
		sop(list.add(new Stu("zhangsan01", 23)));
		sop(list.add(new Stu("zhangsan01", 20)));
		sop(list.add(new Stu("zhangsan05", 19)));
		sop(list.add(new Stu("zhangsan00", 25)));

		sop("list = "+list);

		//创建HashSet集合
		HashSet<Stu> hs = new HashSet<Stu>();

		sop(hs.add(new Stu("zhangsan01", 20)));
		sop(hs.add(new Stu("zhangsan01", 23)));
		sop(hs.add(new Stu("zhangsan01", 20)));
		sop(hs.add(new Stu("zhangsan05", 19)));
		sop(hs.add(new Stu("zhangsan00", 25)));

		sop("hs = "+hs);

		//创建TreeSet集合
		TreeSet<Stu> ts = new TreeSet<Stu>(Collections.reverseOrder(new StuComp()));

		sop(ts.add(new Stu("zhangsan01", 20)));
		sop(ts.add(new Stu("zhangsan01", 23)));
		sop(ts.add(new Stu("zhangsan01", 20)));
		sop(ts.add(new Stu("zhangsan05", 19)));
		sop(ts.add(new Stu("zhangsan04", 19)));
		sop(ts.add(new Stu("zhangsan00", 25)));

		sop("ts = "+ts);

		//对List集合进行排序
		Collections.sort(list);
		sop("list按年龄排序后："+list);
		sop("max = "+Collections.max(list));
		int index1 = Collections.binarySearch(list, new Stu("zhangsan03", 21));
		sop("zhangsan03--21在："+index1);
		sop("自己的方法返回的值："+halfSearch(list, new Stu("zhangsan03", 21)));

		Collections.sort(list, new StuComp());
		sop("list按姓名排序后："+list);
		sop("max = "+Collections.max(list, new StuComp()));
		int index2 = Collections.binarySearch(list, new Stu("zhangsan03", 21), new StuComp());
		sop("zhangsan03--21在："+index2);
		sop("自己的方法返回的值："+halfSearch(list, new Stu("zhangsan03", 21), new StuComp()));

		//随机排序
		Collections.shuffle(list);
		sop("随机排序后的list："+list);
		Collections.reverse(list);
		sop("反向输出："+list);

		//填充替换
		Collections.replaceAll(list, new Stu("zhangsan01", 20), new Stu("LLL", 100));
		sop("list替换后："+list);
		Collections.fill(list, new Stu("oooo", 23));
		sop("全部替换后list："+list);
	}

	//自己实现集合的二分查找
	//自然排序查找
	public static int halfSearch(List<Stu> list, Stu key)
	{
		int min = 0, max = list.size()-1, mid;

		while(min <= max)
		{
			mid = (min+max) / 2;

			Stu s = list.get(mid);
			int result = s.compareTo(key);

			if(result == 0)
				return mid;
			else if(result > 0)
				max = mid - 1;
			else
				min = mid + 1;
		}

		return -min-1;
	}

	//实现二分查找
	//使用比较器的比较方式进行查找
	public static int halfSearch(List<Stu> list, Stu key, Comparator<Stu> cmp)
	{
		int min = 0, max = list.size()-1, mid;

		while(min <= max)
		{
			mid = (min + max) / 2;

			Stu s = list.get(mid);
			int result = cmp.compare(s, key);

			if(result == 0)
				return mid;
			else if(result > 0)
				max = mid - 1;
			else
				min = mid + 1;
		}

		return -min-1;
	}
}
