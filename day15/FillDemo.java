/*
 * 替换反转
 * fill(List<T> list, T obj)
 * 使用obj替换list中的所有元素
 * 
 * 练习
 * fill方法可以将list集合中所有元素替换成指定元素
 * 将list集合中部分元素替换成指定元素
 * fillDemo(List<T> list, int start, int end)
 * */
import java.util.*;

class FillDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		List<String> list = new ArrayList<String>();

		list.add("gjsdkjh");
		list.add("Gfd");
		list.add("adf");
		list.add("erc");

		sop("list = "+list);

		Collections.sort(list);
		sop("排序后："+list);

		/*
		//将List集合中的所有元素替换成指定内容
		Collections.fill(list, "ppp");
		sop("替换后list = "+list);
*/

		//替换
		Collections.replaceAll(list, "adf", "kkkkkkkkkkkkk");
		sop("替换后："+list);

		//反转
		Collections.reverse(list);
		sop("反转："+list);
	}
}
