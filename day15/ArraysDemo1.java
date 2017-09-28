/*
 * Arrays工具类的方法
 * 1、数组转成集合
 * List<T> Arrays.asList(T[] a)
 * 2、二分查找
 * int binarySearch(T[] arr, T key)
 * int binarySearch(T[] arr, int fromIndex, int toIndex, T key)
 * 3、复制
 * T[] copyOfRange(T[] arr, int from, int to)
 * 复制数组arr的from到to-1的数值到新的数组
 * 4、判断是否相等
 * boolean equals(T[] a1, T[] a2)
 * 5、全部替换
 * void fill(T[] arr, T obj)
 * 用obj替换arr中的所有元素
 * 6、排序
 * sort(T[] arr)
 * 对数组进行排序
 * sort(T[] arr, int from, int to)
 * 从from到to-1排序数组arr
 * 7、数组转成字符串
 * String toString(T[] arr)
 * 将数组arr转成字符串
 * Arrays.toString(int[]/short[]/char[]/double[]/float[])
 * */
import java.util.*;

class ArraysDemo1
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		int[] num = {
			1, 4, 2, 1, 0, 23
		};
		int[] num1 = {
			3, 42, 4, 23, 4
		};

		String[] sarr = {
			"adsg", "fd", "adgcds", "terv"
		};

		List<String> list = new ArrayList<String>();

		list.add("agfe");
		list.add("csdr");
		list.add("erver");
		list.add("vr");

		sop("list = "+list);

		//集合转成数组
		String[] s = list.toArray(new String[list.size()]);
		sop("s = "+Arrays.toString(s));

		//数组转成集合
		List<int[]> list1 = Arrays.asList(num);
		sop(list1);
		List<String> list2 = Arrays.asList(sarr);
		sop(list2);

		//判断两个数组是否相同
		sop("判断两个数组是否相同："+Arrays.equals(num, num1));

		//复制数组的指定范围
		int[] num2 = Arrays.copyOfRange(num, 2, 5);
		sop("num是："+Arrays.toString(num));
		sop("复制num的2-4之后的数组："+Arrays.toString(num2));

		//排序
		Arrays.sort(num, 2, 5);
		sop("2-4排序的num数组："+Arrays.toString(num));
		Arrays.sort(num);
		sop("排序之后的num："+Arrays.toString(num));

		//全部替换
		Arrays.fill(num, 0);
		sop("用0替换num数组中的全部元素："+Arrays.toString(num));
		Arrays.fill(num, 2, 5, 9);
		sop("2-4替换成9："+Arrays.toString(num));

		//高级for循环
		//格式：
		//for(数据类型 变量: 被遍历的集合(Collection)或者是数组)
		for(String s1: list)
		{
			s1 = "kkk";
			sop(s1);
		}

		sop(list);

		for(int i: num)
		{
			sop(i);
		}

	}
}
