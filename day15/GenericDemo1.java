/*
 * 泛型演示
 * */
import java.util.*;

class GenericDemo1
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		//创建TreeSet集合
		TreeSet<String> ts = new TreeSet<String>(new LenComparator());

		ts.add("gaag");
		ts.add("gafhdshf");
		ts.add("gfaljek");
		ts.add("gaag");
		ts.add("gaag");
		ts.add("adf");
		ts.add("gaag");


		for(Iterator<String> it = ts.iterator(); it.hasNext();)
		{
			String s = it.next();

			sop(s+"----"+s.length());
		}
	}
}

//定义比较器
//加上泛型之后
//就可以确定比较的元素类型
class LenComparator implements Comparator<String>
{
	//因为Comparator接口后面的泛型为String
	//所以compare方法中的类型也要变成String
	public int compare(String o1, String o2)
	{
		int num = new Integer(o2.length()).compareTo(new Integer(o1.length()));

		if(num == 0)
			return o2.compareTo(o1);

		return num;
		
	}
}
