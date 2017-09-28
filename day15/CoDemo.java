/*
 * 工具类Collections的方法
 * 1、排序sort
 * public static <T extends Compable<? super T>> void sort(List<T> list)
 * Collections.sort(list)
 * 按照list集合中的元素自身的比较方式进行排序
 * public static <T extends Compable<? super T>> void sort(List<T> list, Comparator<? super T>)
 * 按照比较器的比较方式对list集合中的元素进行排序
 * 2、max
 * T Collections.max(list)
 * 按照list集合中元素自身的比较方式进行排序，返回最大值
 * T Collections.max(list, Comparator<? super T> comp)
 * 按照比较器的比较方式进行排序，返回最大值
 * 3、二分查找
 * 在进行二分查找之前需要先对list集合进行排序
 * 并且排序方式和二分查找所用的比较方式相同，要么用比较器，要么不用比较器
 * 1）Collections.sort(list)
 *	  Collections.binarySearch(list, T key)
 *	  对list集合按照自然顺序进行排序，然后二分查找key值
 *	  如果有就返回key的位置，如果没，就返回key应插入的位置的负值-1
 * 2）Collections.sort(list, Comparator<? super T> comp)
 * 比较器的泛型是能够比较的类的父类，这样的话，既可以比较所规定的类，同时还可以比较所规定类的子类
 *    Collections.binarySearch(list, T key, Comparator<? super T> comp)
 *    对list集合按照比较器的比较方式进行排序，然后二分查找key值
 *    如果有key值就返回其所在的位置，如果没有，就返回key经过插入的位置的负值-1
 * 4、替换反转
 * Collections.fill(List<T> list, T obj)
 * 用obj替换list集合中的所有元素
 * Collections.reverse(list)
 * 将list集合中的元素进行反转
 * Collections.replaceAll(List<T> list, T oldValue, T newValue)
 * 将list集合中的oldValue替换成newValue
 * 5、将集合反向输出
 * 需要传入
 * 在创建TreeSet的时候，构造函数中添加Collections.reverseOrder()
 * 如果有比较器，就需要传入Collections.reverseOrder(Comparator<? super T> comp)
 *
 *
 * */
import java.util.*;

class CoDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();

		list.add("gfdf");
		list.add("csdf");
		list.add("a");
		list.add("brbgfafhddd");
		list.add("wrgsafgfg");

		sop("原始的list集合是："+list);

		//排序
		Collections.sort(list);
		sop("自然排序之后list集合是："+list);

		Collections.sort(list, new SCom());
		sop("比较器排序之后的list集合是："+list);

		//最大值
		String max1 = Collections.max(list);
		sop("按照自然排序，最大值："+max1);
		String max2 = Collections.max(list, new SCom());
		sop("按照比较器，最大值："+max2);

		//二分查找
		Collections.sort(list);
		int index1 = Collections.binarySearch(list, "kkk");
		sop("按照自然顺序，二分查找kkk："+index1);

		Collections.sort(list, new SCom());
		int index2 = Collections.binarySearch(list, "kkk", new SCom());
		sop("按照比较器，二分查找kkk："+index2);

		//反转
		Collections.reverse(list);
		sop("反转后："+list);

		//替换
		sop("替换kk后: "+Collections.replaceAll(list, "kk", "LLLLL"));
		sop(list);

		/*
		//全部替换
		Collections.fill(list, "pppp");
		sop("全部替换为pppp："+list);
*/
		//创建TreeSet集合
		TreeSet<String> ts = new TreeSet<String>(Collections.reverseOrder(new SCom()));

//		TreeSet<String> ts = new TreeSet<String>(new SCom());
		ts.add("gfd");
		ts.add("gfdre");
		ts.add("tf");
		ts.add("aad");
		ts.add("c");

		sop("ts = "+ts);

		Collections.swap(list, 3, 4);
		sop("list = "+list);

		//随机置换
		sop("list = "+list);
		Collections.shuffle(list);
		sop("随机置换后："+list);
	}
}

//比较器
class SCom implements Comparator<String>
{
	public int compare(String s1, String s2)
	{
		int num = s1.length() - s2.length();

		if(num == 0)
			return s1.compareTo(s2);

		return num;
	}
}
