/*
 * 泛型接口
 * 比如Comparable<T>和Comparator<T>
 * 当子类实现这些接口时，会定义T的类型
 * 这样接口中的函数的参数类型就可以确定了
 * */
import java.util.*;

//泛型接口
interface Inter<T>
{
	public abstract void show(T t);
}

class A implements Inter<String>
{
	public void show(String s)
	{
		System.out.println("s = "+s);
	}
}

//泛型类
//并且该子类中要操作的对象类型也不确定
//所以该子类也要使用泛型
class B<N> implements Inter<N>
{
	public void show(N t)
	{
		System.out.println("B show: "+t);
	}
}

class GenericDemo7
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		A a = new A();
		a.show("hgalfhga");

		B<Integer> b = new B<Integer>();
		b.show(5);
		//b.show("gffd");
	}
}
