/*
 * 获取两个字符串中最大相同子串
 * */
class BigString
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	//获取两个字符串中的最大相同子串
	//思路：
	//将长度短的字符串s2拿到长的字符串中进行比较，使用contains函数进行
	//首先比较长度为短字符串的长度的字符串，1个
	//然后比较长的为s2-1的字符串，2个
	//长度为s2-2，3个
	//也就是说
	//字符串长度   个数
	//s2-0			1
	//s2-1			2
	//s2-2			3
	//...			...
	//s2-(s2-1)		s2
	//按照s2中子字符串由长到短的顺序进行逐个比较即可
	public static String getBigSub(String str1, String str2)
	{
		//定义空的字符串表示输入的字符串中较长和较短的字符串
		String max = "", min = "";

		//max是长度较长的字符串，min是长度较短的字符串
		max = (str1.length() > str2.length())?str1:str2;
		min = (max == str1)?str2:str1;

		String str;

		for(int x = 0; x < min.length(); x++)
		{
			for(int y = 0; y <= x; y++)
			{
				str = min.substring(y, y+min.length()-x);

				if(max.contains(str))
					return str;
			}
		}

		return null;
	}

	public static void main(String[] args)
	{
		String s1 = "cdssllosgree";
		String s2 = "galgajlkhelloslagjl";

		sop("s1 = "+s1);
		sop("s2 = "+s2);
		sop(getBigSub(s1, s2));
	}
	
}


