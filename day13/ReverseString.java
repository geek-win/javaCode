/*
 * 字符串反转功能实现
 * */
class ReverseString
{
	//实现输出功能的简化
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	//实现字符数组的整体反转
	public static void reverse(char[] arr)
	{
		int start=0, end = arr.length-1;

		while(start < end)
		{
			swap(arr, start, end);
			start++;
			end--;
		}
	}

	//实现字符数组的特定区间的字符反转
	public static void reverse(char[] arr, int x, int y)
	{
		int start = x, end = y;

		while(start < end)
		{
			swap(arr, start, end);
			start++;
			end--;
		}
	}
	
	//实现数组中两个元素的互换
	public static void swap(char[] arr, int x, int y)
	{
		char ch = arr[x];
		arr[x] = arr[y];
		arr[y] = ch;
	}

	//实现字符串的整体反转
	public static String reverseString(String s)
	{
		//现将字符串转为字符数组
		char[] ch = s.toCharArray();

		//将字符数组进行整体反转
		reverse(ch);

		//返回字符数组转成的字符串
		return new String(ch);
	}

	//实现字符串的特定区间的反转
	public static String reverseString(String s, int x, int y)
	{
		//将字符串转成字符数组
		char[] ch = s.toCharArray();

		//将字符串的特定区间进行反转
		reverse(ch, x, y);

		//返回字符数组转成的字符串
		return new String(ch);
	}

	public static void main(String[] args)
	{
		String s = "abcdef";

		sop("s = "+s);

		sop("("+reverseString(s)+")");
		sop("("+reverseString(s, 2,4)+")");
	}
}
