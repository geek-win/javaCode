/*
 * 使用LinkedList实现队列和堆栈
 * 队列是先进先出的数据结构
 * 所以可以利用LinkedList的获取头部和尾部的方法来实现先进先出
 * 创建队列类和堆栈类
 * 其中有添加、获取、删除方法
 * 并且保证，获取的方法和添加的方法顺序要符合其数据结构
 * 比如对于队列来说，我先添加的，就先获取到
 * 而对于堆栈来说，我先添加的，就后获取到
 * */
import java.util.*;


class DuiLie
{
	//创建一个LinkedList对象
	//作为队列的存储数据结构
	private LinkedList link;

	//构造函数
	//当外界一创建该对象，就会获得一个存储结构
	DuiLie()
	{
		link = new LinkedList();
	}

	//向队列中添加元素
	public void myAdd(Object obj)
	{
		link.addLast(obj);
	}

	//从队列中获取元素
	public Object myGet()
	{
		return link.removeFirst();
	}

	//判断队列是否为空
	public boolean isNull()
	{
		return link.isEmpty();
	}
}

class DuiLieDemo

{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		DuiLie dl = new DuiLie();

		dl.myAdd("java01");
		dl.myAdd("java02");
		dl.myAdd("java03");
		dl.myAdd("java04");

		while(!dl.isNull())
			sop(dl.myGet());
	}
}
