/*
 * 子父类中函数的特点--覆盖
 * */
class Tel
{
	void show()
	{
		System.out.println("number");
	}
}

class NewTel extends Tel
{
	void show()
	{
		super.show();
		System.out.println("name");
		System.out.println("pic");
	}
}

class ExtendsDemo1
{
	public static void main(String[] args)
	{
		NewTel nt = new NewTel();
		nt.show();

	}
}
