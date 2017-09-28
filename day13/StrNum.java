/*
 * 获取一个字符串在另一个字符串中出现的次数
 * */
class StrNum
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	//获取一个字符串在另一个字符串中出现的次数
	//求s2中包含s1的个数
	//可以使用获取字符串在字符串中位置的函数
	public static int getNum(String s1, String s2)
	{
		//定义变量记录一个字符串在另一个字符串中出现的次数
		int count = 0;

		//定义一个字符串在另一个字符串中出现的角标
		int offset = 0;
		//定义字符串出现角标的临时存储变量
		int ch;

		while((ch = s2.indexOf(s1, offset)) != -1)
		{
			//如果不等于-1，说明s2中包含s1，需要将count自加1
			count++;

			offset = ch+s1.length();
		}
		/*
		 * 较麻烦，因为内存中会出现很多字符串
		while((ch = s2.indexOf(s1)) != -1)
		{
			count++;

			s2 = s2.substring(ch+s1.length());
			sop("---"+s2);
		}
		*/
		
		return count;
	}

	public static void main(String[] args)
	{
		String s1 = "abc";
		String s2 = "yyabcyyabcyyabc----";

		sop("s1 = "+s1);
		sop("s2 = "+s2);
		sop("s2中包含s1的个数为："+getNum(s1, s2));
	}
}
