/*
 * 二分法查找list集合元素
 * */
import java.util.*;

class E
{
	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();

		list.add("aa");
		list.add("srer");
		list.add("x");
		list.add("b");
		list.add("agfer");
		list.add("kkkkkkk");

		sop("list集合原始为："+list);

		Collections.sort(list);
		sop("按照字符串自然顺序排序："+list);

		//int index1 = Collections.binarySearch(list, "aaa");
		int index1 = ha1(list, "ss");
		sop("按照自然顺序排序：ss应该放在："+index1);

		Collections.sort(list, new StrCom());
		sop("使用自定义比较器比较长度进行排序："+list);
		
//		int index2 = Collections.binarySearch(list, "aaa", new StrCom());
		int index2 = ha2(list, "sr", new StrCom());
		sop("使用自定义比较器比较长度进行排序：sr在"+index2);

		sop("max = "+Collections.max(list));
		sop("max = "+Collections.max(list, new Com()));


	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	//自定义二分查找
	//注意传入的List集合一定要是排好序的
	public static int ha1(List<String> list, String key)
	{
		int min = 0, max = list.size()-1, mid;

		while(min <= max)
		{
			mid = (min+max)>>1;

			String str = list.get(mid);

			int num = str.compareTo(key);

			if(num == 0)
				return mid;
			else if(num > 0)
				max = mid-1;
			else
				min = mid+1;
		}

		return -min-1;
	}

	//自定义二分查找，有比较器，按照比较器的比较方式进行元素查找
	//传入的List集合一定是排好序的
	public static int ha2(List<String> list, String key, Comparator<String> c)
	{
		int min = 0, max = list.size()-1, mid;

		while(min <= max)
		{
			mid = (min+max)>>1;

			String str = list.get(mid);

			int num = c.compare(str, key);
			if(num == 0)
				return mid;
			else if(num > 0)
				max = mid-1;
			else
				min = mid+1;
		}

		return -min-1;
	}

}

class StrCom implements Comparator<String>
{
	public int compare(String s1, String s2)
	{
		int num = s1.length() - s2.length();

		if(num == 0)
			return s1.compareTo(s2);

		return num;
	}
}
