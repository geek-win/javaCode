/*
 * 测试String如果是new对象，是否相同
 * */
class StringDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		String s1 = "haha";
		String s2 = "haha";

		sop("s1 == s2: "+(s1 == s2));
		sop("s1.equals(s2): "+s1.equals(s2));

		String s3 = new String("haha");
		String s4 = new String("haha");

		sop("s3 == s4: "+(s3 == s4));
		sop("s3.equals(s4): "+s3.equals(s4));
	}


}
