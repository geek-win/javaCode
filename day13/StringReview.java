/*
 * 对String类的方法进行复习
 * */
class StringReview
{
	//获取方法
	public static void method_get()
	{
		String s = "helloabcdeabcfabc";

		//获取长度
		sop("s = "+s+", 长度为"+s.length());

		//获取位置为2的字符
		sop("s的角标为2的字符为："+s.charAt(2));

		//正向索引，查找特定字符第一次出现的位置
		sop("c在s中第一次出现的位置："+s.indexOf('c'));

		//正向索引，查找特定字符串第一次出现的位置
		sop("abc在s中第一次出现的位置："+s.indexOf("abc"));

		//正向索引，从指定位置开始所以指定字符串第一次出现的位置
		sop("从角标3开始，abc在s中第一次出现的位置为："+s.indexOf("abc", 3));

		//反向索引
		sop("反向索引，abc在s中第一次出现的位置："+s.lastIndexOf("abc"));

	}

	//判断
	public static void method_is()
	{
		String s = "hello, world!";

		//判断字符串是否是空的
		sop("s = "+s+", 是否是空的："+s.isEmpty());

		//判断字符串是否包含特定字符串
		sop("s是否包含java字段："+s.contains("java"));

		//判断字符串是否以指定内容开头
		sop("s是否以hello开头："+s.startsWith("hello"));

		//判断字符串是否以指定内容结尾
		sop("s是否以world!结尾："+s.endsWith("world!"));

		//判断字符串是否包含某个字符串
		sop("使用indexOf实现是否包含某个特定字符串i：");
		sop(s.indexOf("hello")==-1?false:true);

		//判断字符串和另一个字符串是否相同，不忽略大小写
		sop("s是否等于helloworld："+s.equals("helloworld"));

		//判断字符串是否相同，忽略大小写
		sop("忽略大小写，hello和HELLO是否相同："+"hello".equalsIgnoreCase("HELLO"));
	}

	//转换
	public static void method_trans()
	{
		String s = "abcdef";
		char[] ch = {
			'h', 'e', 'l','l','o'
		};

		//将字符串转换成字符数组
		char[] arr = s.toCharArray();
		sop("s = "+s);
		printArr(arr);

		//将字符数组转换成字符串
		//构造函数
		//new String(arr)
		//new String(arr, int offset, int count)
		//静态函数
		//static String copyValueOf(arr)
		//static String copyValueOf(arr, int offset, int count)
		//static String valueOf(arr)
		//static String valueOf(arr, int offset, int count)
		sop("ch[] = hello转换成字符串："+new String(ch));
		sop("ch[] = hello中的角标2，长度2转成字符串："+s.copyValueOf(ch, 2, 2));
		sop(String.valueOf(3).getClass().getName());
		sop(3+4);
		sop("3"+4);

		//将字节数组转换成字符串和字符数组转成字符串方式相同
		//两种方式：构造函数、静态函数
		//将字符串转成字节数组
		//byte[] getBytes()
		//将基本数据类型转成字符串
		//static String valueOf(int/double)
	}

	//替换
	public static void method_replace()
	{
		String s = new String("hello, world!");

		sop("s = "+s);
		//替换字符
		sop("将s中的字符e变成E："+s.replace('e', 'E'));

		//替换字符串
		sop("将s中的字符串world替换成java："+s.replace("world", "java"));
	}
	
	//切割
	public static void method_split()
	{
		String s = "he, hello, hava, hh";

		sop("s = "+s);

		//切割
		String[] arr = s.split(",");

		for(int i = 0; i < arr.length; i++)
			sop(arr[i]);

	}

	//子串
	public static void method_sub()
	{
		String s = "hello, world";

		//返回子串
		//String substring(int beginIndex)
		//	|--从beginIndex开始的子串
		//String substring(int beginIndex. int endIndex)
		//	|--从beginIndex开始到endIndex-1的子串
		sop("s = "+s);
		sop("s从角标1到3的子串："+s.substring(1, 4));
		sop("s从角标1开始的子串："+s.substring(1));
		sop("s从角标0开始的子串："+s.substring(0));
		sop("s从角标0到s.length-1的子串："+s.substring(0, s.length()));
	}

	//转换大小写
	//去除两端的空格
	public static void method()
	{
		String s = "   heLLo world   ";

		sop("s = "+s);

		//转成小写
		sop("s转成小写："+s.toLowerCase());

		//转成大写
		sop("s转成大写："+s.toUpperCase());

		//去除两端的空格
		sop("去除两端空格："+s.trim());

		//比较
		sop("hello".compareTo("hello"));
	}
	
	//输出字符数组中的元素
	public static void printArr(char[] arr)
	{
		for(int i = 0; i < arr.length; i++)
			sop("arr["+i+"]="+arr[i]);
	}
	
	//输出的简化形式
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	//输出分割线
	public static void sp()
	{
		sop("----------------");
	}

	public static void main(String[] args)
	{
		method_get();
		sp();
		method_is();
		sp();
		method_trans();
		sp();
		method_replace();
		sp();
		method_split();
		sp();
		method_sub();
		sp();
		method();
	}
}
