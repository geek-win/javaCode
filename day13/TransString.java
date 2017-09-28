/*
* 实现字符串反转
* 思路：
* 将字符串转化成字符数组，然后倒序转成字符数组
* 然后将字符数组转成字符串
 * */
class TransString
{
	//将字符数组反转封装为函数
	private static void revArray(char[] ch)
	{
		for(int start=0, end=ch.length-1; start < end; start++, end--)
		{
			swap(ch, start, end);
			/*
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			*/
		}
	}

	//交换数组中的两个元素
	private static void swap(char[] ch, int i, int j)
	{
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}

	//将字符串特定长度进行反转
	private static void revArray(char[] ch, int s, int e)
	{
		for(int start = s, end = e; start < end; start++, end--)
			swap(ch, start, end);
	}

	//将字符串特定内容进行反转
	public static String reverseString(String s, int start, int end)
	{
		char[] ch = s.toCharArray();

		revArray(ch, start, end);

		return new String(ch);

	}

	//将字符串整个反转
	public static String reverseString(String s)
	{
		//将字符串转化成字符数组
		char[] ch = s.toCharArray();

		//创建一个和ch等长的字符数组
		//其内容是ch的反向输出
		//char[] ch1 = revArray(ch);
		revArray(ch);

		/*
		//将ch反向，将数值存储在ch1中
		for(int i = 0; i < ch.length; i++)
			ch1[ch.length-1-i] = ch[i];
		*/

		return new String(ch);
	}

	//输出函数的简化书写
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		String s = "abcdef";

		sop("s = "+s);
		sop(reverseString(s));
		sop("--------------------");
		sop(reverseString(s, 2, 4));
		sop(s);
	}
}
