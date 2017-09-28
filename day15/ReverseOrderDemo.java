/*
 * 逆向输出
 * */
import java.util.*;

class ReverseOrderDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		//reverseOrder是返回比较器
		//强行逆转实现了Comparable接口的对象Collection的自然排序
		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder(new LenComparator()));

		ts.add("fgasd");
		ts.add("sasdd");
		ts.add("aaa");
		ts.add("sgsddc");

		sop("ts = "+ts);
		for(Iterator<String> it = ts.iterator();it.hasNext();)
		{
			sop(it.next());

		}

	}
}
//比较器
//对字符串按照长度进行排序
class LenComparator implements Comparator<String>
{
	public int compare(String s1, String s2)
	{
		int num = s1.length()-s2.length();
		if(num == 0)
			return s1.compareTo(s2);

		return num;
	}
}
