/*
 * 补全代码
 * */
interface Inter
{
	void show(int a, int b);
	void func();
}

class Demo
{
	public static void main(String[] args)
	{
		//补全代码：调用两个函数，要求用匿名内部类
		Inter i = new Inter()
		{
			public void show(int a, int b)
			{

			}
			public void func()
			{

			}
		};
		i.show(2, 3);
		i.func();


	}

}
