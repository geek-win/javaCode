/*
 * Object类中很多默认方法都无意义
 * 所以可以根据需求进行复写
 * 比如toString()、hashCode()、equals()
 * */
class A
{
	private int num;
	A(int num)
	{
		this.num = num;
	}

	//复写toString()
	public String toString()
	{
		return "A:"+this.num;
	}

	//复写hashCode()
	public int hashCode1()
	{
		System.out.println("hashCode()");

		return this.num+100;
	}

	//复写equals()
	public boolean equals(Object obj)
	{
		if(!(obj instanceof A))
			return false;

		A a = (A)obj;
		return this.num == a.num;
	}
}

class B
{

}

class FuGai
{
	public static void main(String[] args)
	{
		A a = new A(10);
		B b = new B();
		A a1 = new A(10);

		Class c = a.getClass();

		System.out.println("a.toString()\n"+a.toString());
		System.out.println("original toString()\n"+c.getName()+"@"+Integer.toHexString(a.hashCode()));
		System.out.println("a.hahsCode1()"+a.hashCode1());
		System.out.println("a==b:"+a.equals(b));
		System.out.println("a==a1:"+a.equals(a1));
	}
}



