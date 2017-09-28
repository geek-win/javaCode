/*
 * 泛型方法
 * */
import java.util.*;

class Demo<T>
{
	public void show(T t)
	{
		System.out.println("show: "+t);
	}

	public void print(T t)
	{
		System.out.println("print: "+t);
	}
}

class GenericDemo5
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		Demo<String> d = new Demo<String>();

		d.show("ghalgaf");
		d.print("gafa");
		//因为已经规定了d的泛型类是String
		//所以其show和print方法的形式参数都应该是String类型
		//所以int和Integer类型的都不行
//		d.show(4);
//		d.show(new Integer(4));

		Demo<Integer> d1 = new Demo<Integer>();
		d1.show(4);
		d1.print(new Integer(5));
	}

}
