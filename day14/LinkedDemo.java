/*
 * LinkedList
 * */
import java.util.*;

class LinkedDemo
{
	public static void main(String[] args)
	{
		//特有的方法
		//面试题
		//addFirst();
		//addLast();
		//jdk1.6版本后出现了替代方法
		//offerFirst()
		//offerLast()
		//getFirst();
		//getLast();
		//如果集合是空，则会抛出异常NoSuchElementException
		//jdk1.6版本后出现了替代方法
		//peekFirst()
		//peekLast()
		//removeFirst();
		//removeLast();
		//如果集合是空，则会抛出异常NoSuchElementException
		//jdk1.6版本后出现了替代方法
		//pollFirst()
		//pollLast()
		LinkedList link = new LinkedList();

		//相当于每次都添加到头部
		//这种数据结构是栈
		//先进后出
		link.addFirst("java01");
		link.addFirst("java02");
		link.addFirst("java03");
		link.addFirst("java04");
		
		sop("link = "+link);
		sop("link.getFirst(): "+link.getFirst());
		sop("link.getLast(): "+link.getLast());

		LinkedList link1 = new LinkedList();

		//相当于每次都添加到尾部
		//这种数据结构是队列
		//先进先出
		link1.addLast("haha01");
		link1.addLast("haha02");
		link1.addLast("haha03");
		link1.addLast("haha04");
		link1.addLast("haha05");

		sop("link1 = "+link1);
		sop("link1.getFirst(): "+link1.getFirst());
		sop("link1.getLast(): "+link1.getLast());

		/*
		sop("size = "+link1.size());
		link1.removeFirst();
		sop("size = "+link1.size());
		sop("link1 = "+link1);
		*/
		sop(link1.getFirst());
		sop(link1.getFirst());

		sop(link1.removeFirst());
		sop(link1.removeFirst());

		/*
		while(!(link1.isEmpty()))
		{
			sop(link1.removeFirst());
		}
		sop(link1);
		*/

		while(!link.isEmpty())
		{
			sop("----"+link.removeLast());
		}
		LinkedList l = new LinkedList();
		sop(l.pollFirst());

		LinkedList l1 = new LinkedList();
		l1.addFirst("java01");
		l1.addFirst("java02");
		l1.addFirst("java03");
		l1.addFirst("java04");
		sop("l1 = "+l1);
		sop("l1.getFirst(): "+l1.getFirst());
		sop("l1.getLast(): "+l1.getLast());

		LinkedList l2 = new LinkedList();
		l2.addLast("hh01");
		l2.addLast("hh02");
		l2.addLast("hh03");
		l2.addLast("hh04");
		sop("l2 = "+l2);
		sop("l2.getFirst(): "+l2.getFirst());
		sop("l2.getLast(): "+l2.getLast());

		/*
		while(!l2.isEmpty())
			sop(l2.removeFirst());
		sop(l2.peekLast());
		*/

		for(ListIterator it = l2.listIterator(); it.hasNext();)
		{
			Object o = it.next();
			if(o.equals("hh02"))
				it.set("kkkkkk");
		}
		sop(l2);
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
