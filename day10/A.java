package packa;
import packb.*;

class A
{
	public void showA()
	{

		System.out.println("showA");
	}

	public static void main(String[] args)
	{
		B b = new packb.B();
		b.showB();

		C c = new C();
		c.showC();
	}
}
