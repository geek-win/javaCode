/*
 * Arrays工具类的方法
 * */
import java.util.*;

class ArraysDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		int[] arr = {
			1, 4, 5, 2, 0, 10
		};

		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr, 2, 4);
		sop(Arrays.toString(arr));

		//将数组转成list集合
		String[] s = {
			"aaa", "gasg", "gfa"
		};

		List<String> list = Arrays.asList(s);
		sop(list);
		sop("判断字符串是否包含aaann："+list.contains("aaann"));

		//如果是整型数组
		//那么转成集合后
		//泛型需要加上数组
		List<int[]> l = Arrays.asList(arr);
		sop(l);

		Integer[] ii = {
			1, 3, 4
		};

		List<Integer> l1 = Arrays.asList(ii);
		sop("ii = "+ii);
	}
}
