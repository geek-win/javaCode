/*
 * 自定义泛型类
 * 当我们定义的类中要操作的引用数据类型（对象、数组）不确定的时候
 * 需要定义泛型
 * 早期没有泛型的时候使用的是Object
 * 泛型出来之后使用泛型
 * */
import java.util.*;

class A
{

}

class B
{

}

//定义泛型类
//不知道其操作的对象是哪一类
//所以使用T代替要操作的对象类型
class C<T>
{
	private T t;

	public void setO(T t)
	{
		this.t = t;
	}
	public T getO()
	{
		return t;
	}
	 
}

class GenericDemo4
{
	public static void sop(Object obj)
	{
		
	}

	public static void main(String[] args)
	{
		C<String> c =  new C<String>();

		c.setO("hahah");
		sop("--------"+c.getO());
		sop("hahahh");

		C<A> c1 = new C<A>();
		c1.setO(new A());
		A a = c1.getO();
	}
}
