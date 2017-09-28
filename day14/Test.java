/*
 * 对字符串、字符串缓冲区、基本数据类型、集合的复习
 * */
class Test
{
	//对字符串的复习
	public static void method_get()
	{
		String s1 = "dagabcdeabcf";
		String s2 = new String("aceertre");

		//获取长度
		sop("s1 = "+s1+"，长度为："+s1.length());

		//获取指定角标处的字符
		sop("s2角标2的字符："+s2.charAt(2));

		//获取指定字符或字符串出现的位置
		sop("s1中b第一次出现的位置："+s1.indexOf('b'));
		sop("s1中abc第一次出现的位置："+s1.indexOf("abc"));
		sop("s1中b最后一次出现的位置："+s1.lastIndexOf('b'));
		sop("s1中abc最后一次出现的位置："+s1.lastIndexOf("abc"));
		sop("从角标3开始，s1中a第一次出现的位置："+s1.indexOf('a', 3));
		sop("从角标5开始，反向索引s1中，abc第一次出现的位置："+s1.lastIndexOf("abc", 5));

		//获取子串
		sop("s2和s2相同的子串："+s2.substring(0, s2.length()));
		sop("s2的角标2--4的子串："+s2.substring(2, 5));
	}

	//判断
	public static void method_is()
	{
		String s1 = "hello, world";
		String s2 = "hello, java";

		sop("s1 = "+s1);
		sop("s2 = "+s2);

		//判断是否为空
		sop("s1是空的么："+s1.isEmpty());

		//判断字符串是否以特定内容开头或结尾
		sop("s1是否以hello开头："+s1.startsWith("hello"));
		sop("s2是否以world结尾："+s2.endsWith("world"));

		//判断是否包含字符串
		sop("s1是否包含haha: "+s1.contains("haha"));
		sop("s2是否包含java: "+s2.contains("java"));

		//判断两个字符串是否相同
		sop("s1 == s2: "+(s1 == s2));
		sop("s1 == hello, java: "+(s2 == "hello, java"));
		sop("s1.equals(s2): "+s1.equals(s2));
		sop("s1.equalsIgnoreCase(hello, WORLD): "+s1.equalsIgnoreCase("hello, WORLD"));
	}

	//字符串和数组之间的转换
	public static void method_trans()
	{
		String s1 = "abcde";

		sop("s1 = "+s1);

		//字符串转换成字符数组
		//char[] toCharArray()
		//字符串转成字节数组
		//byte[] getBytes()
		char[] ch = s1.toCharArray();
		printArr(ch);

		//字符数组转成字符串
		char[] ch1 = {
			'f','g','h','a','b','c'
		};
		sop("字符数组ch1为");
		printArr(ch1);
		sop("字符数组ch1转成字符串："+new String(ch1));
		sop("字符数组ch1的2-4转成字符串："+String.valueOf(ch1, 2, 3));
	}

	//替换
	public static void method_replace()
	{
		String s = "abcdefsagaa";
		sop("s = "+s);

		//替换字符
		//String replace(char oldchar, char newchar)
		sop("将s中的a替换成A："+s.replace('a', 'A'));
		
		//替换字符串
		//String replaceAll(String oldstr, String newstr)
		//String replace(CharSequence old, CharSequence new)
		sop("将s中的abc替换成ABC："+s.replace("abc", "ABC"));
		sop("将s中的abc替换成ABC："+s.replaceAll("abc", "ABC"));
	}

	//切割
	//String[] split(regex)
	public static void method_split()
	{
		String s = "abc, sga, agj, ag";
		sop("s = "+s);

		String[] s1 = s.split(",");
		for(int i = 0; i < s1.length; i++)
			sop(s1[i]);
	}

	//小方法
	//去除两端的空字符
	//	String trim()
	//全部变成大写字符
	//	String toUpperCase()
	//全部变成小写字符
	//	String toLowerCase()
	//比较两个字符串第一个不相同字符的ASCII码之差
	//	int compareTo()
	public static void method_mul()
	{
		String s = "  hello, java   ";
		sop("s = ("+s+")");

		//去除两端空字符
		sop("去除两端空字符："+s.trim());
		
		//转换成大小写
		sop("转成大写："+s.toUpperCase());
		sop("转成小写："+s.toLowerCase());

		//比较字符串第一个不相同字符的ASCII码之差
		sop("s.compareTo(hello, java): "+s.compareTo("hello, java"));
		sop("hello.compareTo(Hello): "+"hello".compareTo("HELLO"));
	}
	
	//字符串缓冲区练习
	//字符串缓冲区的添加元素、删除元素、获取元素、设置元素、判断
	public static void strBuffer()
	{
		StringBuffer sb1 = new StringBuffer("abc");
		sop("sb1 = "+sb1);

		//添加元素
		sb1.append("haha");
		sop("添加元素haha："+sb1);

		//插入元素
		sb1.insert(3, "LLO");
		sop("角标3插入元素LLO后，sb1 = "+sb1);

		//删除元素
		//StringBuffer delete(start, end)
		//StringBuffer deleteCharAt(index)
		/*
		sb1.delete(0, sb1.length());
		sop("sb1删除所有元素："+sb1);
		*/
		sb1.deleteCharAt(3);
		sop("sb1删除角标3："+sb1);

		//获取
		//char charAt(index)
		//int indexOf(str)
		//int indexOf(str, fromIndex)
		//int lastIndexOf(str)
		//int lastIndexOf(str, fromIndex)
		//String substring()
		sop("获取角标3的元素："+sb1.charAt(3));
		sop("获取sb1中abc第一次出现的位置："+sb1.indexOf("abc", 8));

		//子串
		sop("sb1子串3-5："+sb1.substring(3, 6));

		char[] ch = new char[8];
		sb1.getChars(3, 6, ch, 4);
		sop("sb1.getChars(3, 6, ch, 4)");
		printArr(ch);

		//替换
		//StringBuffer replace(start, end, str)
		sb1.replace(2, 5, "KKKKKKK");
		sop("替换后："+sb1);

		//反转
		//StringBuffer reverse()
		sb1.reverse();
		sop("反转后："+sb1);

		//设置
		sb1.setCharAt(4, 'Z');
		sop("设置角标4为Z："+sb1);

		sop(sb1.toString());
	}

	//基本数据类型的练习
	//基本数据类型转成字符串
	//	1、基本数据类型值+""
	//	2、基本数据类型变量.toString()
	//		String toString()
	//	3、基本数据类型.toString(基本数据类型数值)
	//		static String toString(基本数据类型变量)
	//	4、static String valueOf(int/double)
	//字符串转成基本数据类型
	//	1、static byte parseByte(String s)
	//	2、static short parseShort(String s)
	//	3、static int parseInt(String s)
	//	4、double double parseDouble(String s)
	//	5、float float parseFloat(String s)
	//基本数据类型所占的二进制位数
	//	int SIZE
	//基本数据类型的最大值和最小值
	//	static int/short/byte/double/float MAX_VALUE
	//	static int/short/byte/double/float MIN_VALUE
	//十进制转其他进制
	//	static String toBinaryString(int i)
	//	static String toOctalString(int i)
	//	static String toHexString(int i)
	//其他进制转十进制
	//	static int parseInt(String s, int radix)
	//	将radix进制数s转成十进制
	//	所以parseInt(String s)
	//	默认使用的是radix=10
	//	调用的是parseInt(String s, 10)
	//创建基本数据类型
	//	Integer i = 4;//简化书写
	//	i.intValue();//求Integer对象的数值
	//Character类
	//	static char toUpperCase(char ch)
	//	static char toLowerCase(char ch)
	//新特性
	//	Integer m = 127;
	//	Integer n = 127;
	//	sop(m==n);//true
	//	m=128;n=128;
	//	sop(m==n);//false
	//	在byte范围内是开辟新的空间，否则要重新开辟新的空间
	//比较方法
	//	int compareTo()
	//	a.compareTo(b);//a-b
	public static void base()
	{
		Integer a = 127;
		Integer b = 127;

		sop("a==b"+(a==b));

		Integer a1 = 128;
		Integer b1 = 128;

		sop("a1==b1"+(a1==b1));

		//基本数据类型转成字符串
		Integer i = new Integer("123");
		sop("i+4 = "+(i+123));
		sop(123+"ag");
		sop("a.toString():"+a.toString());
		sop("Integer.toString(1345):"+Integer.toString(1345));

		//字符串转成基本数据类型
		int int1 = Integer.parseInt("123");
		sop("in1 = "+int1);
		boolean bo1 = Boolean.parseBoolean("true");
		if(bo1)
			sop("bo1是true");

		//十进制转二进制、八进制、十六进制
		sop("10的二进制："+Integer.toBinaryString(10));
		sop("10的八进制："+Integer.toOctalString(10));
		sop("60的十六进制："+Integer.toHexString(60));

		//其他进制转十进制
		sop("二进制100101转十进制："+Integer.parseInt("100101", 2));
		sop("八进制37转十进制："+Integer.parseInt("37", 8));
		sop("十六进制3c转十进制："+Integer.parseInt("3c", 16));

		//Character类方法
		sop("c大写: "+Character.toUpperCase('c'));
		sop("a小写: "+Character.toLowerCase('a'));
		sop(Character.toString('c'));
		Character c = 'c';
		sop(c.toString());

		//equals
		Integer i1 = 124;
		Integer i2 = 124;
		sop("i1.equals(i2):"+i1.equals(i2));
	}

	//输出字符数组
	public static void printArr(char[] obj)
	{
		for(int i = 0; i < obj.length; i++)
			sop("["+i+"] = "+obj[i]);
	}

	//输出的简化书写
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		sop("字符串的方法练习×××××××××××××××××");
		method_get();
		sop("------------------------------");
		method_is();
		sop("------------------------------");
		method_trans();
		sop("------------------------------");
		method_replace();
		sop("------------------------------");
		method_mul();
		sop("------------------------------");
		method_split();
		sop("字符串缓冲区的方法练习××××××××××××××××");
		strBuffer();
		sop("基本数据类型练习********************");
		base();
	}
}
