/*
 * 泛型方法
 * 如果定义泛型类，那么类上定义的泛型的有效范围是整个类
 * 所以所有的函数如果有使用泛型类型的话，就必须保持一致
 * 如果想更灵活，比如函数1和函数2操作不同的类型
 * 就可以定义泛型方法
 * 比如
 * public <T> void set(T t)
 * public <Q> void get(Q q)
 * 当然如果泛型类中的所有函数操作的类型都一致，并且可变，那么我们可以使用泛型类
 * 如果函数之间操作的元素类型不同
 * 那么我们可以使用泛型函数
 * */
import java.util.*;

//泛型类
class Demo<A>
{
	//泛型方法
	public <T> void show(T t)
	{
		System.out.println("show:"+t);
	}

	public <Q> void print(Q q)
	{
		System.out.println("print:"+q);
	}

	public void show1(A a)
	{
		System.out.println("show1: "+a);
	}

	public static <E> void method(E e)
	{
		System.out.println("method: "+e);
	}
}

class GenericDemo6
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
	public static void main(String[] args)
	{
		Demo<String> d = new Demo<String>();

		d.show("haglhljaf");
		d.show(new Integer(5));
		d.print("gafg");
		d.print(4);
		d.method("hhahahha");
		d.method(56);

	}
}
