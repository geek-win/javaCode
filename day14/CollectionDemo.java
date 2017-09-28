/*
 * 集合框架的学习
 * Collection接口
 *		|--List接口
 *			|--ArrayList
 *			|--LinkedList
 *			|--Vector
 *		|--Set接口
 *			|--HashSet
 *			|--TreeSet
 * 添加：add(Object o)//多态
 *       addAll(Collection c)
 * 获取：int size()
 * 删除：boolean clear()
 *       boolean remove(Object o)删除指定元素，如果存在的话
 *       boolean removeAll(Collection c)删除指定collection中的全部元素
 * 查找：boolean contains(Object o)
 *		 boolean containsAll(Collection c)
 * 取交集：boolean retainAll(Collection c)
 *		   al1.retailAll(al2);//al1就是al1和al2的交集
 * */
import java.util.*;

class CollectionDemo
{
	public static void main(String[] args)
	{
		//创建一个集合容器，使用Collection接口的子类，ArrayList
		ArrayList al = new ArrayList();

		//1、添加元素
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");

		//2、获取元素个数
		sop("size = "+al.size());

		//3、打印集合
		sop("打印原始集合："+al);

		/*
		//4、删除元素
		al.remove("java02");
		sop("打印删除之后的集合："+al);

		//全部删除
		al.clear();
		sop(al);

		al.add("java03");
		//5、判断元素
		sop("al知否包含java03："+al.contains("java03"));
		sop("集合是否为空："+al.isEmpty());
*/
		//两个集合的交集
		//只保留此集合中的也在另一个集合中的元素
		ArrayList al2 = new ArrayList();

		al2.add("java01");
		al2.add("java02");
		al2.add("java05");
		al2.add("java06");

		boolean b = al.removeAll(al2);//如果有就是true否则就是false
		sop("al中删除al2中有的："+al);
		sop("b = "+b);
		/*
		al.retainAll(al2);//保留al中也在al2中的元素

		ArrayList al3 = new ArrayList();
		al.retainAll(al3);
		sop("al 和 al3交集："+al);
		sop("al = "+al);
		sop("al2 = "+al2);
		sop("al和al2的交集:"+al);
		*/
		ArrayList a1 = new ArrayList();
		ArrayList a2 = new ArrayList();
		a1.add("1");
		a1.add("2");

		a2.add("1");
		a2.add("4");

		sop("a1.retainAll(a2): "+a1.retainAll(a2));//a1是a1和a2的交集,一直是true好像
		sop("a1.removeAll(a2): "+a1.removeAll(a2));//a1是a1减去a1和a2的交集
		//对于removeAll方法，如果两个集合有交集，那么就是true，否则为false
		
		//获取迭代器，用于取出集合中的元素
		//什么是迭代器？
		//其实就是集合的取出元素的方式
		//就是一个类，定义在集合中的类
		//集合中存放的元素，想要操作元素，需要在集合内部操作最方便，所以需要定义内部类
		//所以有取出元素的定义
		//相当于每个容器中有个迭代器。可判断和取元素
		//hasNext()和next()
		/*
		Iterator it = al.iterator();//it中存放的是al中的元素
		while(it.hasNext())
		{
			Object o = it.next();
			if(o != "java03")
				sop(o);
		}
		*/

		for(Iterator it1 = a2.iterator(); it1.hasNext();)
			sop(it1.next());

	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
