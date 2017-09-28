/*
 * final关键字可以修饰
 * 类：不能被继承，防止其函数被覆盖
 * 变量：都是常量，且只能赋值一次，成员变量和局部变量。
 *		应用于某些固定常量，比如pai，其值固定为3.1415926，不能被修改
 *		为了简化书写，可以用final修饰。因为如果用普通的变量进行表示
 *		其值有可能会被修改，可能会出问题，所以用final，类似于C中的宏
 *		固定常量表示方法：大写字母，单词间用下划线连接
 *		如果是被共享的，再加个static,如果权限够大，加个public
 * 函数：不能被覆盖
 * */
class Demo
{
	final int x = 3;
	final double MY_PI = 3.14;

	final void show1()
	{

	}

	void show2()
	{
		//错误，因为不能对final修饰的变量二次赋值
		//this.MY_PI = 4.55;
	}
}

class SubDemo extends Demo
{
	void show2()
	{

		//错误，被final修饰的变量为常量，只能被赋值一次
		//MY_PI = 3.44;

	}

}

class ExtendsDemo13
{
	public static void main(String[] args)
	{
		System.out.println("hello word!");
	}
}

