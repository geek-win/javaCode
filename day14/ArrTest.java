/*
 * 用ArrayList类的方法实现堆栈和队列数据结构
 * ArrayList类的方法没有LinkedList类方法那么直接
 * 但是经过处理应该可以使用
 * */
import java.util.*;

class Stack1
{
	//创建一个ArrayList
	//用来存储堆栈中的元素
	private ArrayList al;

	//构造函数
	//创建堆栈对象，即创建该存储数据结构的实体
	Stack1()
	{
		al = new ArrayList();
	}

	//添加元素
	public void myadd(Object obj)
	{
		al.add(obj);
	}

	//获取栈顶元素
	//由于是堆栈是先进后出
	//所以应该从最后获取元素并输出
	public Object mypeak()
	{
		return al.get(al.size()-1);
	}

	//删除栈顶元素
	public void dele()
	{
		al.remove(al.size()-1);
	}

	//判断堆栈是否为空
	public boolean isnull()
	{
		return al.isEmpty();
	}

	//对外提供访问al的方法
	public ArrayList getAl()
	{
		return al;
	}
}

class Queue1
{
	//创建ArrayList对象用来存储数据
	private ArrayList al;

	//构造函数
	//一创建队列对象，就创建该存储结构的实体
	Queue1()
	{
		al = new ArrayList();
	}

	//添加元素
	public void myadd(Object obj)
	{
		al.add(obj);
	}

	//删除队列头
	public void deleHead()
	{
		al.remove(0);
	}

	//删除队列尾
	public void deleTail()
	{
		al.remove(al.size()-1);
	}

	//获取队列头
	public Object myhead()
	{
		return al.get(0);
	}

	//获取队列尾
	public Object mytail()
	{
		return al.get(al.size()-1);
	}

	//判断是否为空
	public boolean isnull()
	{
		return al.isEmpty();
	}

	//对外提供访问al的方法
	public ArrayList getAl()
	{
		return al;
	}
}

class ArrTest
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		Stack1 s = new Stack1();

		//添加元素
		s.myadd("01");
		s.myadd("02");
		s.myadd("03");
		s.myadd("04");
		
		//获取栈顶元素
		sop(s.mypeak());

		//获取元素
		while(!s.isnull())
		{
			sop(s.mypeak());
			s.dele();
		}

		sop("-----------------------------------");

		Queue1 q = new Queue1();

		//添加元素
		q.myadd("haha01");
		q.myadd("haha02");
		q.myadd("haha03");
		q.myadd("haha04");
		q.myadd("haha05");
		
		//获取队列头
		sop("队列头："+q.myhead());

		//删除队列头
		q.deleHead();
		sop("删除队列头："+q.getAl());

		//删除队列尾
		q.deleTail();
		sop("删除队列尾："+q.getAl());

		//获取队列全部元素
		while(!q.isnull())
		{
			sop(q.myhead());
			q.deleHead();
		}
	}
}
