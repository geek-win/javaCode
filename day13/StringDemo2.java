/*
 * 练习1
 * 手动实现trim，即删除字符串两端空格的方法
 * 原理：
 *	正向和反向遍历字符串，用两个变量分别记录字符串头和尾部第一个不为空格的角标
 *	使用字符串的取特定长度的子字符串方法进行获取
 * */
class StringDemo2
{

	//手动实现trim方法
	public static String myTrim(String s)
	{
		//定义变量，用来标识字符串开头结尾第一个不为空格的角标
		int start = 0, end = s.length()-1;

		//从头正向遍历，找到第一个不为空格的位置
		while(start <= end && s.charAt(start) == ' ')
			start++;
		//从结尾反向遍历，找到第一个不为空格的位置
		while(start <= end && s.charAt(end) == ' ')
			end--;


		return s.substring(start, end+1);
	}

	//输出函数sop
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		String s = "  hello, world!   ";
		sop("s = "+s);
		sop("s.trim = "+s.trim()+"---");
		sop("myTrim = "+myTrim(s)+"---");
	}
}

