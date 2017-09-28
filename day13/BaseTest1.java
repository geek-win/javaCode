/*
 * 对基本数据类型新特性的复习
 * */
class BaseTest1
{
	public static void main(String[] args)
	{
		Integer x = 4;
		x = x + 5;
		sop("x = "+x);

		Integer m = 1270;
		Integer n = 1270;
		sop(m == n);

		Integer a = new Integer(3);
		Integer b = new Integer(3);
		sop(a==b);
		sop(a.equals(b));
		sop(a.compareTo(b));
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
