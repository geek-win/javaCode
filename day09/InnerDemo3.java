/*
 * 内部类定义在局部位置
 * */
class Outer
{
	int x = 3;

	void method(final int a)
	{
//		new Inner().function();
//		不合适，因为jvm先从上往下看，所以找不到Inner类

//		a++;//由于a是final的，所以不能进行二次赋值，所以此处会报错，不能对最终变量进行赋值
		final int y = 4;
		class Inner
		{
			void function()
			{
				System.out.println("Outer.this.x: "+Outer.this.x);
				System.out.println("访问局部变量："+y);
				System.out.println("访问成员方法中的形式参数："+a);
			}
		}

		new Inner().function();
	}
}

class InnerDemo3
{
	public static void main(String[] args)
	{
		Outer out = new Outer();
		out.method(7);
		out.method(9);//每次执行method(final int a)会进栈，但是执行完就会释放，所以可以执行多次，但是如果method()中有a的运算比如a++就会报错

		new Outer().method(5);
	}
}
