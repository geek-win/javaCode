/*
 * final关键字
 * 修饰符
 * 1、可以修饰类、变量、函数
 * 2、被final修饰的类不可以被继承，为了避免被继承，被子类复写功能，比如类中有一些涉及到底层的方法等不想被改变，那就可以用final修饰
 * 3、被final修饰的方法不可以被复写
 * 4、被final修饰的变量是一个常量，只能赋值一次，既可以修饰成员变量，又可以修饰局部变量。
 * 比如final int x = 3;那么x终身为3，不可以再给x赋值。
 * 比如pai，就是3.14。就可以final double PI = 3.14;
 * 如果多个字母，那么就使用下划线_连接
 * 即使变量只用一次，建议起个名字，final其实就是加个锁，定义一个变量，加上final之后，这个变量就被锁了
 * 如果是个不变的成员变量，就加个static，static final int i = 3;
 * 如果再加个public，权限最大，类名调用，值不变。
 * 5、内部类定义在类中的局部位置上时，只能访问该局部被final修饰的局部变量，
 * 常见的是public static final
 * 类的修饰符：public、final
 * 修饰成员的修饰符：public、final、private
 * */
//final修饰的类不可以被继承
final class Demo
{
	void show()
	{

	}
}

class FinalDemo
{
	public static void main(String[] args)
	{

	}
}
