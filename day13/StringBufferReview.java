/*
 * StringBuffer复习
 * */
class StringBufferReview
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		method_add();
		method_delete();
		method_get();
		method_getChars();
	}

	//添加
	//append
	//返回的是同一个容器
	public static void method_add()
	{
		StringBuffer sb = new StringBuffer("abc");

		sop("sb = "+sb);
		sop("append: "+sb.append("HELLO"));

	}

	//删除
	//删除包括头不包括尾
	//删除指定位置的字符
	public static void method_delete()
	{
		StringBuffer sb = new StringBuffer("abcdefgaagaga");

		sop("sb = "+sb);
		
		sop("delete:2, 5: "+sb.delete(2, 6));
		sop("delete: 2: "+sb.deleteCharAt(2));
		sop("delete all: "+sb.delete(0, sb.length()));
	}

	//获取
	public static void method_get()
	{
		StringBuffer sb = new StringBuffer("hhabcdefabcgaga");

		sop("sb = "+sb);
		sop("sb.length = "+sb.length());
		sop("sb.charAt(2) = "+sb.charAt(2));
		sop("sb中abc的位置："+sb.indexOf("abc"));
		sop("sb中abc反向索引第一次出现的位置："+sb.lastIndexOf("abc"));
		sop("sb从角标3开始索引第一次出现abc的位置："+sb.indexOf("abc", 3));
		sop("sb中字符c第一次出现的位置："+sb.indexOf("c"));

		String s = "hhabcdhh";
		sop(s.indexOf('a'));
		sop("反向输出sb："+sb.reverse());
	}

	//将缓冲区中的指定内容存入字符串的指定位置
	public static void method_getChars()
	{
		StringBuffer sb = new StringBuffer("abcdef");
		char[] ch = new char[10];

		sb.getChars(2, 5, ch, 4);

		for(int i = 0; i < ch.length; i++)
			sop("ch["+i+"] = "+ch[i]);
	}


}
