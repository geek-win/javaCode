/*
 * 测试代码
 * */
class Demo
{
	class Inner{
	}

	public static void main(String[] args)
	{
//		new Inner();
//		错误，因为静态函数中不能引用非静态内部类

		new Demo().new Inner();
		//静态函数中不能直接创建非静态内部类对象
		//但是可以通过外部类来创建非静态内部类对象
	}
}
