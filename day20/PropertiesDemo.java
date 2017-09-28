/*
 * Properties类的方法
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

	public int hashCode()
	{
		System.out.println(this.name+"---"+this.age+"..hashcode");
		return this.name.hashCode()+this.age*2;
	}

	public String toString()
	{
		return this.name+"---"+this.age;
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof Student))
			return false;


		Student s = (Student)obj;
		System.out.println(this.name+"--"+this.age+"..equals.."+s.name+"--"+s.age);
		return this.name.equals(s.name) && this.age == s.age;
	}

	public int compareTo(Student s)
	{
		System.out.println(this.name+"--"+this.age+"...comparTo..."+s.name+"--"+s.age);
		//以年龄为主比较
		int num = new Integer(this.age).compareTo(new Integer(s.age));

		if(num == 0)
			return this.name.compareTo(s.name);

		return num;
	}
}
class PropertiesDemo
{
	public static void main(String[] args)
	{
		/*
		Properties prop = new Properties();

		//设置元素
		sop(prop.setProperty("zhangsan", "29"));
		sop(prop.setProperty("lisi", "30"));
		sop(prop.setProperty("lisi", "29"));

		sop(prop);

		String value = prop.getProperty("lisi");
		sop(value);

		for(Object obj : prop.keySet())
			sop(obj+"---"+prop.get(obj));

		sop("------------------------------------------------");

		for(Map.Entry<Object, Object> me : prop.entrySet())
			sop(me.getKey()+"---"+me.getValue());

		sop("------------------------------------------------");

		prop.setProperty("lisi", "40");
		for(String key : prop.stringPropertyNames())
			sop(key+"---"+prop.get(key));
*/
/*	
		HashMap<Student, String> hm = new HashMap<Student, String>();

		sop(hm.put(new Student("zhangsan", 10), "100"));
		sop(hm.put(new Student("zhangsan", 10), "290"));
		sop(hm.put(new Student("zhangsan3", 10), "34"));
		sop(hm.put(new Student("zhangsan1", 15), "43"));
		sop(hm.put(new Student("zhangsan2", 20), "89"));

		sop("hm = "+hm);
		sop("------------------------------");
		sop(hm.containsKey(new Student("zhangsan", 10)));
*/		
		
/*		
		TreeSet<Student> ts = new TreeSet<Student>(new Comparator<Student>(){
			public int compare(Student o1, Student o2)
			{
				sop(o1.getName()+"-"+o1.getAge()+"..compare,,"+o2.getName()+"-"+o2.getAge());
				int num = o1.getName().compareTo(o2.getName());

				if(num == 0)
					return new Integer(o1.getAge()).compareTo(new Integer(o2.getAge()));

				return num;
			}
		});

		sop(ts.add(new Student("zs01", 10)));
		sop(ts.add(new Student("zs02", 9)));
		sop(ts.add(new Student("zs01", 5)));
		sop(ts.add(new Student("zs04", 10)));
		sop(ts.add(new Student("zs03", 18)));

		sop("ts = "+ts);

		sop(ts.contains(new Student("zs0d", 10)));
		*/

/*		TreeMap<Student,String> tm = new TreeMap<Student, String>(new Comparator<Student>()
				{
					public int compare(Student s1, Student s2)
					{
						sop(s1.getName()+"-"+s1.getAge()+"..compare.."+s2.getName()+"-"+s2.getAge());
						int num = s1.getName().compareTo(s2.getName());

						if(num == 0)
							return new Integer(s1.getAge()).compareTo(s2.getAge());

						return num;
					}
				});

		sop(tm.put(new Student("zs01", 10), "100"));
		sop(tm.put(new Student("zs02", 10), "40"));
		sop(tm.put(new Student("zs03", 10), "10"));
		sop(tm.put(new Student("zs01", 16), "20"));
		sop(tm.put(new Student("zs04", 15), "100"));
	
		sop("tm = "+tm);
		sop("----------------------------------------");

		sop(tm.remove(new Student("zs09", 10)));
		*/

		HashSet<Student> hs = new HashSet<Student>();
		sop(hs.add(new Student("zs01", 10)));
		sop(hs.add(new Student("zs02", 20)));
		sop(hs.add(new Student("zs01", 20)));
		sop(hs.add(new Student("zs02", 30)));

		sop("contains:"+hs.contains(new Student("zs01", 10)));
		sop("remove:"+hs.remove(new Student("zs01", 10)));
	}
	
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
