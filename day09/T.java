/*
 * 测试内部类访问的变量
 * */
class Touter
{
	int x = 3;
	
	class Tinner1
	{
		int x = 4;

		void method()
		{
			int x = 5;

			System.out.println("Outer.this.x---"+Touter.this.x);
			System.out.println("this.x---"+this.x);
			System.out.println("x---"+x);
		}
	}

	void function()
	{
		int y = 6;

		class Tinner2
		{
			void show()
			{
				System.out.println("Outer.this.x---"+Touter.this.x);
				System.out.println("y---"+y);
			}
		}

		new Tinner2().show();
	}
}

class T
{
	public static void main(String[] args)
	{
		new Touter().function();
		new Touter().new Tinner1().method();
	}
}
