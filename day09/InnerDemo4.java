/*
 * 匿名内部类
 * */
abstract class A
{
	abstract void show();
}

class B
{
	int x = 3;

	public void function()
	{
		int y = 9;
		new A()
		{
			void show()
			{
				System.out.println("hahhaah-------"+y);
			}
		}.show();

		class C
		{
			void c()
			{
				System.out.println("C:------"+y);
			}
		}

		new C().c();
	}


} 
class InnerDemo4
{
	public static void main(String[] args)
	{
		new B().function();
	}
}
