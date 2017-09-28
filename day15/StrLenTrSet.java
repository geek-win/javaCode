/*
 * TreeSet练习
 * 将字符串按照长度进行存储
 * 思路
 * 1、TreeSet有两种比较方式，第一种是元素具备比较性
 * 此时的字符串确实具备比较性，但是比较是按照字母顺序排序，不是按照长度，所以不行
 * 2、第二种方式是集合具备自定义的比较方式，需要定义比较器
 * 所以该练习选择第二种方式
 * */
import java.util.*;

//定义比较器
//按照元素的长度进行比较
class MyC implements Comparator
{
	//复写compare方法
	public int compare(Object o1, Object o2)
	{
		String s1 = (String)o1;
		String s2 = (String)o2;

		int num = new Integer(s1.length()).compareTo(new Integer(s2.length()));

		//如果两个字符串长度相同
		//就按照原始的排列顺序
		//即字母顺序进行排序
		if(num == 0)
			return s1.compareTo(s2);

		return num;
	}
}

class StrLenTrSet
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		//创建TreeSet集合，构造函数传入比较器，用于自定义进行比较排序
		//称为整体排序
		TreeSet ts = new TreeSet(new MyC());

		ts.add("hahhga");
		ts.add("fadlgjalkjg");
		ts.add("adgds");
		ts.add("adgds");
		ts.add("jglkjkjkjkjkjk");

		sop("ts = "+ts);

	}
}
