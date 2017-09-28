/*
 * Collections工具类的静态方法
 * 1、排序
 * Collections.sort(List<T> list)//按照list集合中元素自身具有的比较方式进行排序
 * Collections.sort(List<T> list, Comparator<? super T> cmp)
 *	按照cmp的比较方式对list集合进行排序
 * 2、最大值max
 * Collections.max(Collection<? extends T> coll)
 * 按照coll集合中元素自身的比较方法进行排序，返回最大值
 * Collections.max(Collection<? extends T> coll, Comparator<? super T> cmp)
 * 按照cmp比较器的比较方式对coll集合排序，返回最大值
 * 3、二分查找
 * 需要角标
 * 所以只能是List集合、并且元素应该具备可比性
 * Collections.binarySearch(List<? extends Comparable<? super T>> list, T key)
 * 首先应该按照自然顺序对list集合进行排序
 * 然后使用二分查找找到key所在的位置
 * 如果list集合中没有key，就返回其应该添加的位置的负值-1
 * Collections.binarySearch(List<? extends Comparable<? super T>> list, T key. Comparator<? super T> cmp)
 * 首先应该按照cmp比较器的比较方法对list集合进行排序
 * 然后使用cmp比较器的比较方法对list进行key值的二分查找
 * 如果有就返回其角标
 * 如果没有就返回其应该添加的位置的负值-1
 * 4、替换反转
 * Collections.fill(List<T> list, T obj)
 * 使用指定元素obj替换list集合中的所有元素
 * Collections.reverse(List<?> list)
 * 将list集合中的元素进行反转，其实就是两头元素交换顺序
 * Collections.replaceAll(List<T> list, T oldVal, T newVal)
 * 将list集合中的oldVal替换成newVal
  * */
import java.util.*;

class CollectionsDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();

		list.add("sdc");
		list.add("acs");
		list.add("c");
		list.add("kkkkk");
		list.add("aacs");

		sop("原始的list为："+list);

		//1、排序
		Collections.sort(list);
		sop("按照自然顺序对list进行排序："+list);
		Collections.sort(list, new Compa());
		sop("使用比较器对list进行排序："+list);

		//2、二分查找
		Collections.sort(list);
		int index1 = Collections.binarySearch(list, "aa");
		sop("没有比较器二分查找aa在："+index1);

		Collections.sort(list, new Compa());
		int index2 = Collections.binarySearch(list, "aa", new Compa());
		sop("按照长度进行二分查找aa在："+index2);

		//3、最大值
		String max1 = Collections.max(list);
		String max2 = Collections.max(list, new Compa());
		sop("没有比较器的最大值："+max1);
		sop("有比较器的最大值："+max2);

		//4、替换反转
		//反转
		Collections.reverse(list);
		sop("反转后："+list);

		//替换
		Collections.replaceAll(list, "acs", "llllllll");
		sop("replace替换后："+list);

		//替换
		Collections.fill(list, "ppp");
		sop("替换后："+list);


	}
}
class Compa implements Comparator<String>
{
	public int compare(String s1, String s2)
	{
		int num = s1.length()-s2.length();

		if(num == 0)
			return s1.compareTo(s2);

		return num;
	}
}
