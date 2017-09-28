/*
 * Map集合的练习
 * 1、每个学生都有对应的归属地
 * 学生Student。地址String
 * 学生属性：姓名、年龄
 * 注意：姓名和年龄相同的视为一个学生
 * 保证学生的唯一性
 * */
import java.util.*;

//描述学生类
class Student implements Comparable<Student>
{
	private String name;
	private int age;
	
	Student(String name, int age)
	{
		//eclipse自动生成
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

	//为了保证元素可存到Set集合中
	//需要保证该元素具备可比较性或者hashCode、equals方法
	//向hashMap中存也要复写hashCode方法
	//也是要根据hash值进行判断然后存储
	//保证唯一性
	public int hashCode()
	{
//		System.out.println(this.name+",,,,hashCode");
		return name.hashCode()+age*34; 
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof Student))
			throw new ClassCastException("类型匹配异常");

		Student s = (Student)obj;

		System.out.println(this.name+".."+this.age+"..equals.."+s.name+".."+s.age);

		return this.name.equals(s.name) && this.age==s.age;
	}

	public String toString()
	{
		return this.name+"...."+this.age;
	}

	public int compareTo(Student s)
	{
//		System.out.println(this.name+".."+this.age+"..compareTo.."+s.name+".."+s.age);
		int num = new Integer(this.age).compareTo(new Integer(s.age));

		if(num == 0)
			return this.name.compareTo(s.name);

		return num;
	}
}

class MapTest
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		/*
		//创建HashMap集合
		HashMap<Student,String> hm = new HashMap<Student, String>();

		sop(hm.put(new Student("zhangsan1", 20), "北京"));
		hm.put(new Student("zhangsan2", 21), "天津");
		sop(hm.put(new Student("zhangsan1", 20), "安安"));
		hm.put(new Student("zhangsan4", 27), "南京");
		hm.put(new Student("zhangsan5", 23), "上海");

		sop("hm = "+hm);
		
		//获取全部元素
		//keySet
		Set<Student> keySet = hm.keySet();
		for(Iterator<Student> it = keySet.iterator(); it.hasNext();)
		{
			Student s = it.next();

			sop(s+"来自"+hm.get(s));
		}

		//获取全部元素
		//entrySet
		Set<Map.Entry<Student, String>> entrySet = hm.entrySet();
		for(Iterator<Map.Entry<Student, String>> it = entrySet.iterator(); it.hasNext();)
		{
			Map.Entry<Student,String> me = it.next();

			Student key = me.getKey();
			String value = me.getValue();

			sop(key+"岁"+"来自"+value);
		}
*/


		//HashMap集合
		//是按照键的hash值进行排序
		//对于hash值相同的键，会调用equals方法判断是否相同
		//如果相同就存储新的键
		//如果不相同就存储新的
		HashMap<Student, String> hm = new HashMap<Student, String>();

		sop(hm.put(new Student("zhangsan", 20), "beijing"));
		sop(hm.put(new Student("zhangsan01", 23), "nanjing"));
		sop(hm.put(new Student("zhangsan", 20), "tianjin"));
		sop(hm.put(new Student("zhangsan02", 22), "chengdu"));
		sop(hm.put(new Student("zhangsan03", 27), "shanghai"));
		sop(hm.put(new Student("zhangsan04", 25), "guanzhou"));

		//取出所有的键
		Set<Student> keySet = hm.keySet();
		for(Iterator<Student> it = keySet.iterator(); it.hasNext();)
		{
			Student s = it.next();

			sop(s+"----"+hm.get(s));
		}

		//取出所有的键值对
		Set<Map.Entry<Student, String>> entrySet = hm.entrySet();
		for(Iterator<Map.Entry<Student,String>> it = entrySet.iterator(); it.hasNext();)
		{
			Map.Entry<Student,String> me = it.next();
			Student s = me.getKey();
			String addr = me.getValue();

			sop(s+"----"+addr);
		}

		sop("-----------------------------------------------------");
		//创建TreeMap
		//根据键的比较方法或者比较器对键进行排序
		TreeMap<Student, String> tm = new TreeMap<Student, String>(new Co());

		//如果发现键相同
		//就用新的值代替旧的值
		//但是键不会改变
		sop(tm.put(new Student("lisi", 5), "nanjing"));
		sop(tm.put(new Student("lisi", 4), "biejing"));
		sop(tm.put(new Student("zhangsan", 4), "chengdu"));
		sop(tm.put(new Student("wangwu", 7), "tianjin"));
		sop(tm.put(new Student("lisi", 4), "ccc"));

		Set<Student> s1 = tm.keySet();
		for(Iterator<Student> it = s1.iterator(); it.hasNext();)
		{
			Student s = it.next();

			sop(s+"----"+tm.get(s));
		}

		Set<Map.Entry<Student,String>> s2 = tm.entrySet();
		for(Iterator<Map.Entry<Student,String>> it = s2.iterator(); it.hasNext();)
		{
			Map.Entry<Student,String> me =  it.next();

			Student s = me.getKey();
			String a = me.getValue();

			sop(s+"---"+a);
		}
	}
}

class Co implements Comparator<Student>
{
	public int compare(Student s1, Student s2)
	{
		//return s1.getName().compareTo(s2.getName());
		int num = s1.getName().compareTo(s2.getName());

		if(num == 0)
			return new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));

		return num;
	}
}
