/*
 * 进行switch语句的练习
 * */
class SwitchDemo
{
	public static void main(String[] args)
	{
		int a = 2;

		//由于a=2，没有匹配的case，所以退回到default执行，执行完之后继续向下执行，不再判断case，而是直接执行所有可以执行的全部语句，直到遇到break或者大括号，所以最后的输出为：default 1 3 
		switch(a)
		{
			default:
				System.out.println("default");
			case 1:
				System.out.println("a = 1");
			case 3:
				System.out.println("a = 3");
				break;
			case 4:
				System.out.println("a = 4");
			
		}
	}
}
