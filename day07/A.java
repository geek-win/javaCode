/*
 * 复习覆盖
 * */
class Tel
{
	void show()
	{
		System.out.println("tel1----1G");
	}
}

class NewTel extends Tel
{
	void show()
	{
		super.show();
		System.out.println("tel2----2G");
	}
}

class A
{
	public static void main(String[] args)
	{
		NewTel nt = new NewTel();
		nt.show();
	}
}
