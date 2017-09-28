/*
 * 集合和数组之间的转换
 * 1、集合 -> 数组
 *	Collections接口的方法
 *	T[] arr = al.toArray(new T[al.size()]);
 *	注意，这个自定义长度的新的数组长度最好是集合的size
 *	因为如果定义的长度小于集合的size，就会重新创建一个新的长度为集合size的数组返回
 *	如果定义的数组长度大于集合的size，就会使用这个数组，但是多余的位置存储的是null
 *	所以我们最好直接定义成长度为集合size的数组
 *	好处？
 *	为了限定对元素的操作，不能进行增删长度等操作
 *	我们在不明确数据个数的时候可以使用容器，但是数据固定以后不能再对其进行操作
 *	这时候就需要转成数组，比较安全
 * 2、数组 -> 集合
 *	List<T> Arrays.asList(T[] obj)
 *	将T类型数组转成T类型List集合
 *	好处？
 *	可以使用集合的思想和方法来操作数据
 *	但是注意，不能使用集合的增加和删除
 *	如果数组中存放的是对象，那么就会直接转化成集合中元素。可以直接打印
 *	如果数组中存放的是基本数据类型，那么就会将数组作为元素存到集合中，不能直接打印
 *	需要加泛型  : 基本数据类型[]
 * */
import java.util.*;

class Tran
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		String[] arrs = {
			"aaa", "gsfg", "dg", "dgghd"
		};

		List<String> al = new ArrayList<String>();

		al.add("adgf");
		al.add("dsag");
		al.add("gasdf");

		//数组变成集合
		List<String> list = Arrays.asList(arrs);
		sop("集合："+list);

		//集合变成数组
		String[] s = al.toArray(new String[al.size()]);
		sop("数组："+Arrays.toString(s));
	}
}
