/*
 * 强化练习List类的方法
 * */
import java.util.*;

class CoDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		ArrayList al1 = new ArrayList();

		//添加
		al.add("java01");
		al.add("java02");
		al.add("java03");
		al.add("java04");

		al1.add("c01");
		al1.add("c02");
		al1.add("java02");
		al1.add("java03");

		sop("al = "+al);
		sop("al1 = "+al1);

		/*
		//在特定位置添加
		al.add(2, "zhosuhaung");
		sop("al添加元素后："+al);
		al.addAll(al1);

		
		sop("al添加al1的元素："+al);
*/
		/*
		//交集和删除交集
		al.removeAll(al1);
		sop("al减去和al的交集"+al);

		al.retainAll(al1);
		sop("al和al1的交集为："+al);
*/
		//删除
//		al.clear();
//		sop(al);
//		sop(al.remove("java01"));
//		sop("al删除java01"+al);
		sop("al要删除角标2的元素为："+al.remove(2));
		sop("al删除角标2："+al);
		sop("al是否包含java04："+al.contains("java04"));
		sop("al是否包含al1中所有元素："+al.containsAll(al1));
		sop("al是否是空的："+al.isEmpty());

		sop("al的角标2的元素："+al.get(2));

		//获取元素
		//第一种，使用迭代器
		//第二种，使用get方法
		/*
		 * 什么是迭代器？
		 * 迭代器是一个接口，是集合类对外暴露的规则，集合类通过迭代器可以获取元素
		 * 所以迭代器是集合获取元素的方式
		 * 不同容器底层数据结构不同，其对数据的存取方式也不同
		 * 将存取方式封装为内部类，定义在集合类中，也就是迭代器
		 * 方便对集合中的数据进行操作
		 * 并对其共性方法，判断和获取进行向上抽取为Iterator接口
		 * 每个内部类实现该接口，并对接口中的抽象方法进行覆盖
		 * 集合类对外提供了iterator方法，用以获取迭代器，进而获取数据并操作
		 * 类似于抓娃娃机
		 * 玻璃容器是容器，其中的娃娃是存储的对象
		 * 娃娃的排列方式各不相同，就是容器底层的数据结构
		 * 夹子在容器内部，就是迭代器，用于获取娃娃
		 * 娃娃机对外提供了操作杆，用以控制夹子
		 * 相当于iterator方法，可以获取迭代器
		 * 进而获取元素进行操作
		 *
		 * */
		for(Iterator it = al.iterator(); it.hasNext();)
			sop(it.next());

		for(int i = 0; i < al.size(); i++)
			sop("al<"+i+"> = "+al.get(i));

		//设置
		al.set(2, "hahah");
		sop("al的角标2设置为hahah："+al);

		sop(al.subList(0,2));
	}
}
/*
 * 添加
 * add(Object obj)
 * add(int index, element)
 * addAll(Collection c)
 * 删除
 * clear()
 * remove(element)//返回true或者false
 * remove(index)//返回index处的元素
 * removeAll(Collection c)//如果有交集就是true，否则就是false
 * contains(element)
 * containsAll(Collection c)
 * equals()
 * get(index)//返回index处的元素
 * set(int index. element)//设置index处的元素，并且返回当前index的值
 * indexOf(Object o)
 * iterator
 * retainAll(Collection c)//true
 * List subList(from, to)//返回包含头不包含尾的集合
 * size()//返回集合的大小就是元素个数
 * listIterator//迭代器
 * */
