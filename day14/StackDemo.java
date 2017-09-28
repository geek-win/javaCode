/*
 * 利用LinkedList对象的方法实现堆栈
 * 先进后出
 * 其实队列和堆栈的关键点在于添加和获取的顺序问题
 * 对于队列来说，添加和获取的顺序是相同的，所以一个是last一个是first
 * 对于堆栈来说，添加和获取的顺序是不同的，所以一个是fist一个是first
 * */
import java.util.*;

class DuiZhan
{
	//创建LinkedList对象
	private LinkedList link;

	//构造函数
	//当创建该对象时，就会创建该存储结构的实体
	DuiZhan()
	{
		link = new LinkedList();
	}

	//添加方法
	public void myAdd(Object obj)
	{
		link.addFirst(obj);
	}

	//获取元素
	public Object myGet()
	{
		return link.removeFirst();
	}

	//判断堆栈是否是空栈
	public boolean isNull()
	{
		return link.isEmpty();
	}
}

class StackDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		DuiZhan dz = new DuiZhan();

		dz.myAdd("java01");
		dz.myAdd("java02");
		dz.myAdd("java03");
		dz.myAdd("java04");

		while(!dz.isNull())
			sop(dz.myGet());
	}
}
