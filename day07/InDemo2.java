/*
 * 接口练习
 * 接口是like a，是扩展功能
 * 继承是is a，是共有功能
 * */
abstract class Student
{
	public abstract void sleep();
}

interface Smoke
{
	public abstract void smoke();
}

interface Drink
{
	public abstract void drink();
}

class ZhangSan extends Student implements Smoke
{
	public void sleep()
	{
		System.out.println("zhangsan sleep");
	}

	public void smoke()
	{
		System.out.println("zhangsan smoke");
	}
}

class LiSi extends Student implements Drink
{
	public void sleep()
	{
		System.out.println("lisi sleep");
	}

	public void drink()
	{
		System.out.println("lisi drink");
	}
}

class InDemo2
{
	public static void main(String[] args)
	{
		ZhangSan zs = new ZhangSan();
		LiSi ls = new LiSi();

		zs.sleep();
		zs.smoke();
		ls.sleep();
		ls.drink();
	}
}
