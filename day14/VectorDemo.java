/*
 * Vector是List的子类
 * jdk1.2版本之前都是Vector
 * 后来被ArrayList替代
 * 其添加、删除、获取等方法和ArrayList基本一致
 * 有个特殊方法，类似于迭代器
 * Enumeration是个接口，类似于迭代器，通过Vector对象的elements()方法获取
 * Enumeration接口有两个方法
 * boolean hasMoreElements()
 * E nextElement()
 * */
import java.util.*;

class VectorDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		Vector v = new Vector();

		v.add("java01");
		v.add("java02");
		v.add("java03");
		v.add("java04");

		sop("v = "+v);

		//获取Vector容器中的元素
		Enumeration e = v.elements();
		while(e.hasMoreElements())
		{
			sop(e.nextElement());
		}

		//使用for循环获取容器元素
		//使用get(index)方法获取元素
		for(int i = 0; i < v.size(); i++)
			sop("---"+v.get(i));

		v.set(2, "jjjjj");
		sop("v = "+v);
		
		Iterator i = v.iterator();
		while(i.hasNext())
		{
			Object o = i.next();

			if(o.equals("java01"))
				i.remove();
		}
		sop("v = "+v);


	}
}
