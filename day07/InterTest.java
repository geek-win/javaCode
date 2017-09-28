/*
 * 接口
 * 1、常量：public static final
 * 2、方法：public abstract
 * */
//定义一个简单的接口
/*
interface Inter
{
	public static final int NUM = 9;
	public abstract void show();
}
*/

interface InterA
{
	public abstract void method();
}

interface B
{
	void B();
}
interface C extends InterA,B
{
	void C();
}
class Test implements C
{
	public void show()
	{

	}
	public void method()
	{

	}
	public void B()
	{

	}
	public void C()
	{

	}

}

class InterTest
{
	public static void main(String[] args)
	{
		
		Test t = new Test();
		/*
		System.out.println(t.NUM);
		System.out.println(Inter.NUM);//Inter虽然是接口，但是一javac
		//也会出现Inter.class，类一加载进内存就存在NUM，所以可以这样用
		System.out.println(Test.NUM);
		//由于Test实现了Inter接口，所以有常量NUM，所以可以这样用
		*/
	}
}
