/*
 * Object类
 * 相关内容的演示练习
 * */
class A
{

}

class B
{
	int num;

	B(int num)
	{
		this.num = num;
	}

	public int hashCode()
	{
		return this.num * 3;
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof B))
			return false;

		B b = (B)obj;
		
		return this.num == b.num;
	}

	public String toString()
	{
		return this.num+"----";
	}
}

class C
{

}

class O1
{
	public static void main(String[] args)
	{
		A a = new A();
		System.out.println(a);
		System.out.println(a.getClass().getName()+"@"+Integer.toHexString(a.hashCode()));
	
		B b1 = new B(3);
		if(b1.equals(new B(3)))
			System.out.println("相等");
		else
			System.out.println("不相等");

		System.out.println("a.toString = "+a.toString());
		System.out.println("b1.toString = "+b1.toString());
		System.out.println("b1.hashCode = "+b1.hashCode());

		System.out.println("------------------------------------");

		C c1 = new C();
		C c2 = new C();
		C c3 = c1;

		System.out.println("c1 == c2: "+c1.equals(c2));
		System.out.println("c1 == c3: "+c1.equals(c3));
	}
}
