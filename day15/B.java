/*
 * Collections类中的sort方法
 * */
import java.util.*;

class B
{
	public static void main(String[] args)
	{
		sortDemo();

	}

	public static void sortDemo()
	{
		List<String> list = new ArrayList<String>();

		list.add("agf");
		list.add("gafgaf");
		list.add("agfsfdg");
		list.add("sder");
		list.add("ader");
		list.add("bder");

		sop("list = "+list);

		//按照list集合中元素自身的比较特性进行排序
//		Collections.sort(list);

		//如果想对字符串的长度进行排序
		//因为如果直接排序是按照字符串的默认排序方式即字母顺序进行排序
		//如果想按照长度进行排序
		//就需要比较器
		Collections.sort(list, new Com());

		sop("list = "+list);
		
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}

class Com implements Comparator<String>
{
	public int compare(String s1, String s2)
	{
		int num = s1.length() - s2.length();
		if(num == 0)
			return s1.compareTo(s2);

		return num;
	}
}
