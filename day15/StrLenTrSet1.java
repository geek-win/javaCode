/*
 * 使用匿名内部类进行字符串长度比较
 * 存入TreeSet集合中
 * */
import java.util.*;

class StrLenTrSet1
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		//使用匿名内部类
		//构造函数中传入的比较器用匿名内部类实现
		TreeSet ts = new TreeSet(new Comparator()
				{
					public int compare(Object o1, Object o2)
					{
						String s1 = (String)o1;
						String s2 = (String)o2;

						int num = new Integer(s1.length()).compareTo(new Integer(s2.length()));

						if(num == 0)
							return s1.compareTo(s2);

						return num;
				
					}

				});

		ts.add("gaagafh");
		ts.add("gadljla");
		ts.add("gaghajgagadsljhg");
		ts.add("ljglj");
		ts.add("a");

		sop("匿名内部类实现按照字符串长度进行排序：");
		sop("ts = "+ts);

	}
}
