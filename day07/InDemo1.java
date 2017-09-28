/*
 * 接口练习
 * 编译之后，接口也是.class文件
 * */
interface Inter
{
	//接口中的函数前默认的修饰为public abstract
	//接口中的变量默认的修饰为public static final
	public abstract void show();
	public static final int NUM = 10;
}

interface InterA
{
	public abstract void method();
}

class A
{

}
//类与接口直接是实现，可以多实现
//接口之间是继承，可以是多继承
//类之间是继承
class Test extends A implements Inter, InterA
{
	public void show()
	{
		System.out.println("Test show()");
	}
	public void method(){

	}
}

class InDemo1
{
	public static void main(String[] args)
	{
		Test t = new Test();

		System.out.println(t.NUM);
		System.out.println(Test.NUM);
		System.out.println(Inter.NUM);
	}
}

