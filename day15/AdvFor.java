/*
 * 高级for循环
 * 格式：
 * for(数据类型 变量: 被遍历的Collection集合或者数组)
 * 必须要有泛型
 * 好处：简化书写，对于集合，一般使用迭代器，但是使用高级for循环以后就可以简化书写
 * 局限性：必须要有遍历的目标，也就是被遍历对象。并且不可以对集合中的元素进行增删改查的操作，只能访问，使用迭代器还可以remove，如果使用ListIterator还可以add、set等操作，所以高级for循环虽然简化了书写，但是还是有局限性。
 *
 * */
import java.util.*;
import static java.util.Arrays.*;

class AdvFor<T>
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		//ArrayList集合的高级for循环输出
		ArrayList<String> al = new ArrayList<String>();

		al.add("gaer");
		al.add("erv");
		al.add("csdasg");

		sop("al = "+al);

		//高级for循环
		for(String s: al)
		{
			sop(s);
		}

		//数组的高级for循环输出
		int[] num = {
			1, 4, 24, 2
		};
		sop("num = "+Arrays.toString(num));

		for(int s: num)
		{
			sop(s);
		}

		//HashMap集合的高级for循环输出
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		hm.put("sag", 13);
		hm.put("gf", 243);
		hm.put("ev", 24);
		hm.put("cdsa", 34);

		sop("hm = "+hm);
	
		//高级for循环输出
		for(String s: hm.keySet())
		{
			sop(s+"---"+hm.get(s));
		}
		//高级for循环输出
		for(Map.Entry<String, Integer> me: hm.entrySet())
		{
			sop(me.getKey()+"::"+me.getValue());
		}

		show("sac", "sdf", "cdsar");
	}

	public static <T> void show(T... arr)
	{
		sop(arr.length);
		for(T t: arr)
			sop(t);
	}
}
