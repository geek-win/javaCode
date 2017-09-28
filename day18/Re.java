/*
 * 复习数组和集合之间的转换关系
 * */
import java.util.*;
import java.text.*;

class Re
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		/*
		int[] num = {
			10, 34, 2, 4, 3, 1, 11
		};

		//转换成字符串输出
		sop("num = "+Arrays.toString(num));

		//排序
		Arrays.sort(num);
		sop("排好序的num："+Arrays.toString(num));
		
		//二分查找
		int index = Arrays.binarySearch(num, 4);
		sop("4在："+index);
		int index1 = Arrays.binarySearch(num, 2, 6, 3);
		sop("在角标2-5之间进行二分查找,3在："+index1);

		//转换成集合
		List<int[]> list = Arrays.asList(num);
		sop("list = "+list);

		//复制
		int[] num1 = Arrays.copyOfRange(num, 2, 6);
		sop("将num的2-5复制到新的数组num1 = "+Arrays.toString(num1));

		//比较数组是否相同
		sop("num和num1是否相同："+Arrays.equals(num, num1));

		//填充
		Arrays.fill(num, 2, 5, 0);
		sop("num的2-4全部变成0："+Arrays.toString(num));
		Arrays.fill(num, 100);
		sop("num的元素全部变成100："+Arrays.toString(num));

		//创建List集合
		List<Integer> l = new ArrayList<Integer>();
		l.add(2);
		l.add(23);
		l.add(7);
		l.add(4);

		//输出集合
		sop("l = "+l);

		//排序
		Collections.sort(l);
		sop("排好序的l："+l);

		//求最大值	
		sop("max = "+Collections.max(l));

		//二分查找
		sop("4在："+Collections.binarySearch(l, 4));
		sop("0在："+Collections.binarySearch(l, 0));

		//替换反转
		Collections.replaceAll(l, 4, 10);
		sop("替换后："+l);
		Collections.fill(l, 100);
		sop("全部替换后："+l);
		Collections.reverse(l);
		sop("反转后："+l);

		//集合转数组
		Integer[] i = l.toArray(new Integer[l.size()]);
		sop("集合l变成数组："+Arrays.toString(i));

		List<S> list = new ArrayList<S>();

		list.add(new S("zhangsan01", 20));
		list.add(new S("zhangsan01", 20));
		list.add(new S("zhangsan02", 23));
		list.add(new S("zhangsan01", 24));
		list.add(new S("zhangsan03", 23));

		sop("list = "+list);
		//随机排序
		Collections.shuffle(list);
		sop("随机排序："+list);

		//排序、最大值、二分查找
		Collections.sort(list);
		sop("按照S的比较方式进行排序："+list);
		sop("最大值："+Collections.max(list));
		sop("zhangsan02,20应放的位置："+Collections.binarySearch(list, new S("zhangsan02", 20)));
		sop("zhangsan01, 24应放的位置："+Collections.binarySearch(list, new S("zhangsan01", 24)));

		Collections.sort(list, new SC());
		sop("按照比较器的比较方式进行排序："+list);
		sop("最大值："+Collections.max(list, new SC()));
		sop("zhangsan02,20应放的位置："+Collections.binarySearch(list, new S("zhangsan02", 20), new SC()));
		sop("zhangsan01, 24应放的位置："+Collections.binarySearch(list, new S("zhangsan01", 24), new SC()));

		//填充
		Collections.reverse(list);
		sop("反转："+list);
		sop(Collections.replaceAll(list, new S("zhangsan01", 20), new S("kkkk", 20)));
		sop("替换后："+list);
		Collections.fill(list, new S("llllllllllllllllll", 3));
		sop("全部替换后："+list);
		

		TreeSet<S> ts = new TreeSet<S>(Collections.reverseOrder());

		ts.add(new S("zhangsan01", 20));
		ts.add(new S("zhangsan01", 20));
		ts.add(new S("zhangsan02", 23));
		ts.add(new S("zhangsan01", 24));
		ts.add(new S("zhangsan03", 23));

		sop("ts = "+ts);
		sop("ts的max = "+Collections.max(ts));


		//System
		Properties prop = System.getProperties();

		for(Object obj: prop.keySet())
		{
			String value = (String)prop.get(obj);
			sop(obj+"---"+value);
		}

		sop("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~```");
		
		for(Map.Entry<Object, Object> me : prop.entrySet())
		{
			sop(me.getKey()+"---"+me.getValue());
		}

		sop("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~```");

		for(String key : prop.stringPropertyNames())
		{
			sop(key+"---"+prop.get(key));
		}

		sop("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~```");

		sop(prop.getProperty("hhhhhh"));
		prop.setProperty("LLLLLL", "BBBBBBB");
		sop(prop.getProperty("LLLLLL"));

		sop("当前时间："+System.currentTimeMillis());

		//Runtime类
		Runtime r = Runtime.getRuntime();
		Process p = r.exec("command");
		Thread.sleep(4000);
		p.distroy();
		*/

		//Date
		//日期类
		//主要是格式化日期的书写
		Date d = new Date();//获取日期对象
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd   hh:mm:ss");//自定义输出格式模式
		String time = sdf.format(d);//对日期进行格式化
		sop("time = "+time);

		//Calendar类
		Calendar c = Calendar.getInstance();
		sop("c = "+c);

		sop("2018年的二月天数为："+getDay(2018));
		sop("2014年的二月天数为："+getDay(2014));

		printC(c);
		System.gc();
	}

	//输出Calendar对象
	public static void printC(Calendar c)
	{
		String[] mons = {
			"一月", "二月", "三月", "四月",
			"五月", "六月", "七月", "八月",
			"九月", "十月", "十一月", "十二月"
		};
		String[] weeks = {
			"", "星期日", "星期一", "星期二", 
			"星期三", "星期四", "星期五", "星期六", 
		};

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH);
		int day1 = c.get(Calendar.DAY_OF_MONTH);
		int day2 = c.get(Calendar.DAY_OF_WEEK);
		int hour = c.get(Calendar.HOUR);
		int min = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);

		sop(year+"年"+mons[month]+day1+"日"+weeks[day2]+"   "+hour+":"+min+":"+second);
	}

	//获取某一年的二月多少天
	public static int getDay(int year)
	{
		//获取Calendar对象
		//设置为3月1号
		//然后日期向前一天
		//获取日期就是二月的多少天
		Calendar c = Calendar.getInstance();

		c.set(year, 2, 1);//设置为3.1号
		c.add(Calendar.DAY_OF_MONTH, -1);//日期向前退一天
		
		return c.get(Calendar.DAY_OF_MONTH);

	}
}

class S implements Comparable<S>
{
	private String name;
	private int age;

	S(String name, int age)
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

	public String toString()
	{
		return this.name+"----"+this.age;
	}

	public int hashCode()
	{
		return this.name.hashCode()+this.age*2;
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof S))
			return false;

		S s = (S)obj;

		return this.name.equals(s.name) && this.age == s.age;
	}

	public int compareTo(S s)
	{
		//以年龄为主
		int num = new Integer(this.age).compareTo(new Integer(s.age));

		if(num == 0)
			return this.name.compareTo(s.name);

		return num;
	}
}

class SC implements Comparator<S>
{
	//以姓名为主
	public int compare(S s1, S s2)
	{
		int num = s1.getName().compareTo(s2.getName());

		if(num == 0)
			return new Integer(s1.getAge()).compareTo(new Integer(s2.getAge()));

		return num;

	}
}
