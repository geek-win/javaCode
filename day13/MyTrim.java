/*
 *
 * 实现字符串类的trim方法
 * */
class MyTrim
{
	public static String my_trim(String s)
	{
		int start = 0, end = s.length()-1;

		while(start <= end && s.charAt(start) == ' ')
			start++;

		while(start <= end && s.charAt(end) == ' ')
			end--;

		return s.substring(start, end+1);
	}

	public static void main(String[] args)
	{
		String s = "   hello, world!  ";

		sop("s = "+s);
		sop("("+s.trim()+")");
		sop("("+my_trim(s)+")");
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
