/*
 * StringBuffer
 * 
 * */
class StringBufferDemo
{
	public static void method_add()
	{
		StringBuffer sb = new StringBuffer("abcdef");

		sop("--------------------");
		sop("sb = "+sb);
		sop("增加："+sb.append("1111"));
	}

	public static void method_del()
	{
		StringBuffer sb = new StringBuffer("abcde");

		sop("--------------------");
		sop("sb = "+sb);

		sop("删除："+sb.delete(1, 3));
	}

	public static void method_insert()
	{
		StringBuffer sb = new StringBuffer("abcdef");

		sop("--------------------");
		sop("sb = "+sb);
		sop("插入："+sb.insert(3, "111"));

		char[] ch = "HELLO".toCharArray();
		sop("插入数组："+sb.insert(3, ch, 3, 2));
	}
	
	public static void method_update()
	{
		StringBuffer sb = new StringBuffer("abcdef");

		sb.replace(1, 4, "java");

		sop(sb);

		sb.setCharAt(2, 'G');
		sop(sb);
	}

	public static void main(String[] args)
	{
		method_add();
		method_del();
		method_insert();
		sop("----------------------");
		method_update();
		/*
		StringBuffer sb = new StringBuffer();
		
		//sb1就是向sb容器中添加了字符串，返回的还是之前的容器
		//所以sb和sb1是一个容器
		StringBuffer sb1 = sb.append(34);


		sop(sb==sb1);
		sop("sb = "+sb.toString());
		sop("sb1 = "+sb1.toString());

		char[] arr = "abcefgh".toCharArray();
		sb.insert(1, arr, 3, 2);
		sop(sb);
		StringBuffer s = new StringBuffer("HELLO");
		sop("s = "+s);
		sop(s.reverse());
		*/

		/*
		StringBuffer sb = new StringBuffer("abcdef");
		char[] ch = new char[4];
		sb.getChars(1, 4, ch, 1);
		sop(new String(ch));
		*/

		//使用getChars
		//void getChars(int srcBegin, int srcEnd, char[] chs, int dstBegin)
		StringBuffer sb = new StringBuffer("abcdef");
		char[] ch = new char[6];

		sb.getChars(1, 3, ch, 3);

		for(int i = 0; i < ch.length; i++)
			sop("ch["+i+"] = "+ch[i]);

		sop("------------------------------------");
		sop(new StringBuffer("hello").replace(1, 3, "LLLL"));
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
