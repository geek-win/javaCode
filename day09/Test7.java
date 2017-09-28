/*
 * 补全代码
 * */
interface Test
{
	void func();
}

class Demo
{
	public static void main(String[] args)
	{
		//补全代码：匿名内部类
		//需要调用show()方法
		new Demo().show(new Test()
				{
					public void func()
					{

					}
				});

	}

	void show(Test t)
	{
		t.func();
	}
}
