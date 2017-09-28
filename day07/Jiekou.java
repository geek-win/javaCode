/*
 * 对于体系中的非共性内容，向上抽取变成接口
 * 对于体系中的共性内容，向上抽取变成父类
 * 继承是is a
 * 接口是扩展功能like a
 * 类中的都是基本方法
 * 接口中的都是特有方法
 * */
abstract class Student
{
	public abstract void study();

	void sleep()
	{
		System.out.println("sleep");
	}
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
	public void study()
	{
		System.out.println("zhangsan study");
	}

	public void smoke()
	{
		System.out.println("zhangsan smoke");
	}
}

class LiSi extends Student implements Drink
{
	public void study()
	{
		System.out.println("lisi study");
	}

	public void drink()
	{
		System.out.println("lisi drink");
	}
}

abstract class Sporter
{
	public abstract void play();
}

interface Specific
{
	public abstract void special();
}

class Yaoming extends Sporter implements Specific
{
	public void play()
	{
		System.out.println("Yaoming plays basketball");
	}

	public void special()
	{
		System.out.println("Yaoming study java");
	}
}

class Jiekou
{
	public static void main(String[] args)
	{
		ZhangSan zs = new ZhangSan();
		LiSi ls = new LiSi();
		Yaoming ym = new Yaoming();

		zs.study();
		zs.smoke();

		ls.study();
		ls.drink();

		ym.play();
		ym.special();
	}
}
