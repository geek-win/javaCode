/*
 * 对String类常用方法的演示
 * */
class StringDemo1
{
	//获取
	//长度
	//指定位置字符
	//指定字符位置
	//指定字符串位置
	public static void method_get()
	{
		String s1 = "abcabcabc";

		sop("s1 = "+s1);
		sop("s1.length() = "+s1.length());
		sop("s1的角标为2位置的字符为："+s1.charAt(2));//角标不能越界否则报异常
		sop("字符a在s1中第一次出现的位置为："+s1.indexOf('a'));
		sop("字符a在s1中从角标2开始第一次出现的位置为："+s1.indexOf('a', 2));
		sop("字符串abc在s1中第一次出现的位置为："+s1.indexOf("abc"));
		sop("字符b最后一次出现的位置为："+s1.lastIndexOf('b'));
		sop("字符b从3位置开始反向索引第一次出现的位置为："+s1.lastIndexOf('b', 3));
		sop("字符串abc从角标3开始反向索引第一次出现的位置为："+s1.lastIndexOf("abc", 3));

		sop("c---0---3---0---7---1---3");
		sop("-----------------------------------------------");
	}

	//判断
	//1、字符串中是否包含某个字符串
	//2、字符串中是否为空
	//3、字符串是否以指定内容为开头
	//4、字符串是否以指定内容为结尾
	//5、判断两个字符串是否相同，不忽略大小写
	//6、判断两个字符串是否相同，忽略大小写
	public static void method_is()
	{
		String s = "helloDemo.java";
		String s1 = new String("helloDemo.cpp");

		sop("s = "+s);
		sop("s1 = "+s1);

		sop("s是否为空："+s.isEmpty());
		sop("s是否包含hello，不忽略大小写"+s.contains("hello"));
		sop("s是否以java开头"+s.startsWith("java"));
		sop("s是否以java结尾"+s.endsWith("java"));
		sop("s = s1?"+s.equals(s1));
		sop("s = HELLODEMO.JAVA"+s.equalsIgnoreCase("HELLODEMO.JAVA"));
		
		sop("------------------------------------------------");
	}
	
	//转换
	//1、字符数组 -> 字符串
	//	构造函数
	//		String(arr)
	//		String(arr, offset, count)
	//	静态函数
	//		static String copyValueOf(arr)
	//		static String copyValueOf(arr, offset, count)
	//		static String valueOf(arr)
	//		static String valueOf(arr, offset, count)
	// 2、字节数组 -> 字符串
	//	将1中的char变成byte即可
	// 3、字符串 -> 字符数组
	//	char[] toCharArray()
	// 4、字符串 -> 字节数组
	//	byte[] getBytes()
	// 5、基本数据类型 -> 字符串
	//	static String valueOf(int/double)
	//	3+"" <==> String.valueOf(3)
	public static void method_trans()
	{
		char[] ch = {
			'a', 'b', 'c', 'd', 'e', 'f'
		};

		//字符数组 -> 字符串
		String s1 = new String(ch);
		String s2 = String.copyValueOf(ch);
		String s3 = String.valueOf(ch, 2, 3);

		sop("s1 = abcdef, "+s1);
		sop("s2 = abcdef, "+s2);
		sop("s3 = cde, "+s3);

		//字符串 -> 字符数组
		char[] ch1 = s1.toCharArray();
		for(int i = 0; i < ch1.length; i++)
			sop("----"+ch1[i]);

		//基本数据类型 -> 字符串
		sop(String.valueOf(3)+3);
		sop("3+3 = "+(3+3));

		sop("-----------------------------------------");

	}

	//替换
	//replace
	public static void method_replace()
	{
		String s = "hello, java";

		String s1 = s.replace('a', 's');
		String s2 = s.replace("java", "world");

		sop("s = "+s);
		sop("s1 = "+s1);
		sop("s2 = "+s2);
		
		sop("-----------------------------------------");
	}


	//切割
	//	String[] split(regex)
	public static void method_split()
	{
		String s = "hahammhehmmheihei";

		//以mm进行切割
		String[] s1 = s.split("mm");

		for(int i = 0; i < s1.length; i++)
			sop("~~~"+s1[i]);

		sop("String数组的长度："+s1.length);
		sop("------------------------------------------");
	}

	//子串
	// String substring(int beginIndex)
	//		|--获取从beginIndex到结尾的子串
	// String substring(int beginIndex, int endIndex)
	//		|--获取beginIndex - (endIndex-1)的子串
	public static void method_sub()
	{
		String s = "abcdef";

		String s1 = s.substring(2);
		String s2 = s.substring(2, 4);

		sop("s = "+s);
		sop("s1 = cdef, "+s1);
		sop("s2 = cd, "+s2);
		sop("和s相同"+s.substring(0, s.length()));
	}

	//转换大小写
	//空格去除
	//比较
	public static void method()
	{
		String s1 = "  Hello   word  ";

		sop(s1.toUpperCase());
		sop(s1.toLowerCase());
		sop(s1.trim());

		String s2 = "abc";
		String s3 = "aaa";

		//等于返回0，大于返回整数，ASCII码相减，小于是负数，ASCII相减
		//其实就是ASCII码相减
		//s2 - s3
		//返回的是第一个不同的字符的ASCII码的差值,前面减去后面
		sop(s2.compareTo(s3));


	}

	public static void method1()
	{
		String s = "  hello, world   ";

		sop("***********************************");
		sop("s = "+s);
		sop("s.toUpperCase() = "+s.toUpperCase());
		sop("s.toLowerCase() = "+s.toLowerCase());
		sop("s.compareTo(hello, java)"+s.compareTo("hello, java"));
		sop(' '-'h');
		sop("去除空格："+s.trim());
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		//String类的获取方法
		sop("method_get");
		method_get();

		//String类的判断方法
		sop("method_is");
		method_is();

		//String类的转换方法
		sop("method_trans");
		method_trans();


		//String类的替换方法
		sop("method_replace");
		method_replace();

		//String类的切割方法
		sop("method_split");
		method_split();

		//String类的子串方法
		sop("method_sub");
		method_sub();

		method();

		method1();
	}

}
