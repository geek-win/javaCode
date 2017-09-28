/*
 * List类的方法
 * */
import java.util.*;

class ListDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();

		//添加元素
		al.add("java01");
		al.add("java02");
		al.add("java03");

		sop("原始集合是："+al);

		//在指定位置添加元素
		al.add(1, "java09");

		sop("添加新元素后的集合："+al);

		//在指定位置删除元素
		sop(al.remove(2));//remove(int index)是返回index的值
		sop("删除元素后的集合；"+al);

		//修改元素
		al.set(2, "java007");
		sop("把角标2修改："+al);

		//查元素
		//通过角标获取元素
		sop(al.get(1));

		//获取所有元素
		for(int i = 0; i < al.size(); i++)
			sop(al.get(i));

		for(Iterator it = al.listIterator(); it.hasNext();)
			sop(it.next());
	}
}
