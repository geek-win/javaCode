/*
 * LinkedList的练习
 * 鉴于LinkedList的特有功能
 * 能够从头部或者尾部添加元素
 * 能够从头部或者尾部获取元素
 * 能够从头部或者尾部删除元素
 * 使用LinkedList模拟一个堆栈或者队列
 * 堆栈stack：先进后出	如同一个杯子，先进的后出来
 * 队列queue：先进先出	fifo如同一个水管
 * 现在想创建一个新的类，叫做堆栈、队列
 * 那么这个时候需要创建一个类，其中有变量和方法
 * 一初始化其中就有个LinkedList
 * 然后对其进行操作就相当于堆栈、队列
 * */
import java.util.*;

class LinkedListTest
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		DuiLie dl = new DuiLie();

		dl.myAdd("javaj01");
		dl.myAdd("javaj02");
		dl.myAdd("javaj03");
		dl.myAdd("javaj04");
		
		while(!dl.isNull())
			sop(dl.myGet());
	}
}
class DuiLie
{
	private LinkedList link;

	DuiLie()
	{
		link = new LinkedList();
	}

	public void myAdd(Object obj)
	{
		link.addFirst(obj);
	}

	public Object myGet()
	{
		return link.removeFirst();
	}
	public boolean isNull()
	{
		return link.isEmpty();
	}
}
