import java.util.*;

class D
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();

		list.add("aa");
		list.add("b");
		list.add("gfds");
		list.add("gfdser");
		list.add("z");
		list.add("z");
		list.add("sgdfsb");
		list.add("gfdser");

	//	sop("list = "+list);

		Collections.sort(list, new Co());
		sop("list = "+list);

	/*	
		//Collections的sort方法排序之后
		//不会删除集合中的元素
		//即使使用比较器，发现两个元素相同
		//也不会删除
		//只是排序
		Collections.sort(list, new Co());
		sop("list = "+list);

		//按照list集合中元素本身的比较方法进行排序
		//返回最大值
		sop("max = "+Collections.max(list));
		//按照比较器的比较方法
		//对list集合进行排序
		//返回最大值
		sop("max = "+Collections.max(list, new Co()));
*/
	
		//int index1 = h(list, "aaa");
		//sop("使用h方法aaa在："+index1);
		int index2 = h2(list, "aaa", new Co());
		sop("使用h2方法aaa在："+index2);
		//int index3 = Collections.binarySearch(list, "aaa");
		//sop("使用工具类方法aaa在："+index3);
		int index4 = h2(list, "aaa", new Co());
		sop("使用工具类方法aaa在：有比较器"+index4);
	}
	public static void binarySearchDemo()
	{

		List<String> list = new ArrayList<String>();

		list.add("b");
		list.add("gfds");
		list.add("gfdser");
		list.add("z");
		list.add("z");
		list.add("sgdfsb");
		list.add("gfdser");

		sop("list = "+list);

		//首先进行排序
		Collections.sort(list);
		sop("list排序后："+list);
		int index = Collections.binarySearch(list, "qqq");
		sop("index = "+index);
		sop("index = "+h(list, "qqq"));
		
	}

	public static int h(List<String> list, String key)
	{
		int min = 0, max = list.size()-1, mid;

		while(min <= max)
		{
			mid = (max+min)/2;

			String str = list.get(mid);

			if(str.compareTo(key) == 0)
				return mid;
			else if(str.compareTo(key) > 0)
				max = mid-1;
			else
				min = mid+1;			
		}

		return -min-1;
	}

	public static int h2(List<String> list, String key, Comparator<String> cmp)
	{
		int min = 0, max = list.size()-1, mid;

		while(min <= max)
		{
			mid = (min+max)>>1;

			String str = list.get(mid);

			int num = cmp.compare(str, key);
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

//按照字符串长度进行排序
//如果长度相同
//就按照字母顺序排序
class Co implements Comparator<String>
{
	public int compare(String s1, String s2)
	{
		int num = s1.length() - s2.length();

		if(num == 0)
			return s1.compareTo(s2);

		return num;
	}
}
