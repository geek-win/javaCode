/*
 * 练习
 * 1、去除字符串两端的空格
 * 2、求字符串中包含指定字符串的个数
 * 3、求两个字符串中最大的相同部分
 * 4、将字符串反转
 * 5、将字符串中的特定内容进行反转
 * */
class Test
{
	//1、去除字符串两端的空格
	public static String myTrim(String s)
	{
		//定义开头和结尾变量
		//用来表示空格的角标
		int start = 0, end = s.length()-1;

		while(start < end && s.charAt(start) == ' ')
			start++;

		while(start < end && s.charAt(end) == ' ')
			end--;

		return s.substring(start, end+1);
	}

	//2、求字符串中包含指定字符串的个数
	public static int getNum(String str, String key)
	{
		//定义计数变量count，用来对个数进行计数
		int count = 0;

		//定义检索到的key所在的角标位置
		int temp;

		//定义检索偏移量
		int offset = 0;

		while((temp = str.indexOf(key, offset)) != -1)
		{
			count++;
			offset = temp + key.length();
		}

		return count;
	}

	//3、求两个字符中最大的字符串部分
	public static String getMaxSub(String s1, String s2)
	{
		//定义较长字符串和较短字符串变量，用来指示传入的两个字符串
		String max = "", min = "";

		//根据传入的字符串长度，来确定max和min
		max = (s1.length() > s2.length())? s1: s2;
		min = (max == s1)? s2: s1;

		//思路
		//用较小串的子串去大串中进行匹配
		//子串按照从长到短的顺序进行匹配
		//如果匹配成功，就输出该子串
		//否则就没有最大的子串
		for(int x = 0; x < min.length(); x++)
		{
			for(int y = 0; y <= x; y++)
			{
				String str = min.substring(y, y+min.length()-x);

				if(max.contains(str))
					return str;
			}
		}

		return null;
	}

	//4、将字符串完全反转
	public static String strReverse(String s)
	{
		//将字符串转成字符数组
		char[] ch = s.toCharArray();

		//将字符数组进行反转
		reverse(ch);

		//将翻转后的字符数组转成字符串
		return new String(ch);
	}

	//将字符数组进行反转
	public static void reverse(char[] ch)
	{
		//定义开头结尾变量，交换位置
		int start = 0, end = ch.length-1;

		while(start < end)
		{
			swap(ch, start, end);
			start++;
			end--;
		}
	}


	//将字符串中特定位置的元素交换位置
	public static void swap(char[] arr, int i, int j)
	{
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	//5、将指定位置的子串进行反转
	//由于和问题4功能相同，只是具体实现不同，所以采取重载
	public static String strReverse(String s, int beginIndex, int endIndex)
	{
		//将字符串转成字符数组
		char[] ch = s.toCharArray();

		//将字符数组的特定位置进行反转
		reverse(ch, beginIndex, endIndex);

		//将字符数组转成字符串
		return new String(ch);
	}

	//将字符数组进行特定位置的反转
	public static void reverse(char[] arr, int beginIndex, int endIndex)
	{
		//定义进行反转的起始和结束为止
		int start = beginIndex, end = endIndex - 1;

		while(start < end)
		{
			swap(arr, start, end);
			start++;
			end--;
		}

	}
	
	//简化输出的书写
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		String s = "  hello, world  ";

		sop("s = "+s);
		sop(myTrim(s));
		sop(getNum("kkabckkabskkab", "an"));

		String s1 = "abcdef", s2 = "helloabcdsge";
		sop("s1 = "+s1+", s2 = "+s2);
		sop(getMaxSub(s1, "kk"));

		sop("abcdef反转后为："+strReverse("abcdef"));

		sop("abCDEfgh的2到5反转后为："+strReverse("abCDEfgh", 2, 6));
	}
}
