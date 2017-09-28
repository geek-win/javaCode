/*
 * 将集合变成数组
 * 使用Collection接口中的toArray方法
 * */
import java.util.*;

class CollectionToArray
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		//创建集合
		ArrayList<String> al = new ArrayList<String>();

		al.add("abc1");
		al.add("abc2");
		al.add("abc3");

		String[] arr = al.toArray(new String[5]);

		sop(Arrays.toString(arr));
	}
}
