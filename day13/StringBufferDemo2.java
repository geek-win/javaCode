/*
 * StringBuffer的复习
 * */
class StringBufferDemo2
{
	//存储
	public static void method_cunchu()
	{
		StringBuffer sb = new StringBuffer();

		sop("sb = "+sb);

		sb.append("abc").append("def");
		sop("append: sb = "+sb);

		sop("delete: sb = "+sb.delete(2, 5));
	
		sop("delete 角标3:"+sb.append("abc").deleteCharAt(3));

		StringBuffer sb1 = new StringBuffer("hello, world");
		sop("sb1 = "+sb1);
		sop("替换角标2到4："+sb1.replace(2, 5, "HELLO"));

		//将特定位置的字符替换
		sb1.setCharAt(2, 'Z');
		sop(sb1);
		sop(sb1.reverse());

		char[] ch = new char[6];
		sb1.getChars(2, 5, ch, 2);
		for(int i = 0; i < ch.length; i++)
			sop("ch["+i+"] = "+ch[i]);
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		method_cunchu();
	}

}
