/*
 * 抽象类
 * 当多个类中出现了相同功能，但是功能主体不同
 * 这时也可以进行向上抽取，这时，只抽取功能定义，而不抽取功能主体
抽象方法必须定义在抽象类中
不用创建抽象类对象，调用也没用
抽象就是看不懂
 * 抽象类的特点
 * 1、抽象方法一定定义在抽象类中
 * 2、抽象方法和抽象类都必须被abstract关键字修饰
 * 3、抽象类不可以用new创建对象，因为调用抽象方法没意义
 * 4、抽象类中的方法要被使用，必须由子类复写其所有的抽象方法后，建立子类对象调用。如果子类只覆盖了部分抽象方法，那么该子类还是一个抽象类
 * */
abstract class Student
{
	/*
	void study()
	{
		System.out.println("study");
	}
	*/
	//将子类中功能一样但是内容不一样的函数的声明抽取
	//空内容，抽象的方法，看不懂的方法
    abstract void study();
	void sleep()
	{
		System.out.println("lie");
	}
}

class BaseStudent extends Student
{
	void study()
	{
		System.out.println("base study");
	}
}

class AdvStudent extends Student
{
	void study()
	{
		System.out.println("adv study");
	}
}

class AbstractDemo
{
	public static void main(String[] args)
	{
		new AdvStudent().study();
		new BaseStudent().study();

		new AdvStudent().sleep();

	}
}
