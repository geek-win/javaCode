/*
 * 单例设计模式
 * 为了保证对象的唯一性
 * 1、其他程序无法创建对象，需要私有化该类的构造函数
 * 2、在类中创建对象，私有化，静态
 * 3、对外提供函数，提供对外访问方式
 * */
class Single
{
	private int num;
	public void setNum(int num)
	{
		this.num = num;
	}

	public int getNum()
	{
		return this.num;
	}
	//保证外界无法创建该类对象
	private Single()
	{

	}

	//创建内存中唯一的对象，私有，并且静态
	private static Single s = new Single();

	//对外提供访问对象的函数
	public static Single getInstance()
	{
		return s;
	}
	//方法区中有Single类的对象s，还有getInstance()函数和Single()函数
	//new Single()在堆内存中
}

class SingleDemo
{
	public static void main(String[] args)
	{
		Single ss = Single.getInstance();
		Single s1 = Single.getInstance();

		ss.setNum(10);
		System.out.println("num = "+ss.getNum());
		System.out.println("num = "+s1.getNum());


	}
}
