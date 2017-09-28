/*
 * String是一个特殊的对象
 * */
class StringDemo
{
	//String类方法演示
	//获取方法的演示
	/*
	 * 1.1 获取字符串长度
	 *		int length()
	 *		注意和数组长度的区别，数组长度是个属性，所以直接array.length即可,不加括号
	 *		字符串的长度是个方法，所以要加括号
	 * 1.2 获取指定位置上的字符
	 *		char charAt(int index)
	 * 1.3 获取字符在字符串中的位置
	 *		int indexOf(int ch): 需要输入待索引字符的ASCII码
	 *		int indexOf(int ch, int fromIndex)：从指定位置开始索引待索引字符所在位置
	 *		int indexOf(String str)：获取str第一次出现在字符串中的位置
	 *		int indexOf(String str, int fromIndex)：从指定位置开始，索引str第一次出现在字符串中的位置
	 *		
	*/
	public static void method_get()
	{
		String str = "abcabcabc";
		sop("str = "+str);

		//长度
		sop(str.length());

		//获取指定位置上的字符
		sop("角标2上的字符为");
		sop(str.charAt(2));
		//sop(str.charAt(40));当访问到字符串中不存在的角标时会报错
		//StringIndexOutOfBoundsException异常

		//获取指定字符所在位置
		sop("a 所在位置为");
		sop(str.indexOf('a'));
		sop("m 所在位置为");
		sop(str.indexOf('m'));//当访问到不存在的字符时，返回-1
		sop("a 从角标3开始第一次出现的位置为");
		sop(str.indexOf('a', 3));
		sop("abc 所在位置为");
		sop(str.indexOf("abc"));
		sop("as 从角标11开始，第一次出现的位置为");
		sop(str.indexOf("as", 11));

		sop("a 最后一次出现的位置");
		sop(str.lastIndexOf('a'));
		sop(str.lastIndexOf('b', 3));
		sop(str.lastIndexOf('c', 4));
		sop(str.lastIndexOf("abc", 5));

	}

	/*
	 * 字符串中的判断方法
	 * 2.1 判断字符串是否包含某个子串
	 *		boolean contains(CharSequence c)
	 *		其中String、StringBuffer类都是该CharSequence接口的子类
	 * 2.2 判断字符串是否是空的
	 *		boolean isEmpty()
	 * 2.3 判断字符串是否以指定内容开头
	 *		boolean startsWith(String str)
	 * 2.4 判断字符串是否以指定内容结尾
	 *		boolean endsWith(String str)
	 *
	 * */
	public static void method_is()
	{
		String str = "ArrayDemo.java";

		sop("str是否包括Demo："+str.contains("Demo"));
		sop("str是否以Array开头："+str.startsWith("Array"));
		sop("str是否.java结尾："+str.endsWith(".java"));
		sop("aaa 是否和 bbb 相同："+"aaa".equals("bbb"));
		sop("判断aaa和AAA是否相同，忽略大小写："+"aaa".equalsIgnoreCase("AAA"));

	}

	/*
	 * 转换
	 * 3.1 将字符数组转成字符串
	 *		构造函数：
	 *		String(char[] value)将value数组全部转成字符串
	 *		String(char[] value, int offset, int count)将value字符数组从offset的count个字符转成字符串
	 *		静态函数：
	 *		static String copyValueOf(char[] arr);将arr全部转成字符串
	 *		static String copyValueOf(char[] arr, int offset, int count);将arr的一部分转成字符串
	 *		static String valueOf(char[] arr);将arr全部转成字符串
	 *		static String valueOf(char[] arr, int index, int count);将arr的一部分转成字符串
	 *
	 * 3.2 将字符串转成字符数组
	 *		char[] toCharArray();
	 * 3.3 将字节数组转成字符串
	 *		String(byte[])
	 *		String(byte[], int offset, int count);
	 *		static String copyValueOf(byte[]);
	 *		static String copyValueOf(byte[], int offset, int count);
	 *		static String valueOf(byte[]);
	 *		static String valueOf(byte[], int offset, int count);
	 *	3.4 将字符串转成字节数组
	 *		byte[] getBytes();
	 *	3.5 将基本数据类型转成字符串
	 *		static String valueOf(int/double);
	 *		
	 *
	 * */
	public static void method_trans()
	{
		char[] arr = {
			'a', 'b', 'c', 'd', 'e', 'f'
		};

		String s = new String(arr);
		sop(s);
		String s1 = new String(arr, 2, 2);
		sop(s1);

		String s2 = String.valueOf(arr);
		String s3 = String.valueOf(arr, 2, 2);
		sop("s2 = "+s2);
		sop("s3 = "+s3);

		//将字符串转化成字符数组
		//toCharArray()
		char[] chs = s.toCharArray();
		for(int i = 0; i < chs.length; i++)
			sop("---"+chs[i]);

		//将基本数据类型转成字符串
		String s4 = String.valueOf(3);
		sop(s4+3);
		sop(3+4);

	}

	/*
	 * 替换
	 *		4.1 替换字符
	 *			String replace(char oldchar, char newchar);
	 *		4.2 替换字符串
	 *			String replace(CharSequence target, CharSequence replacement);
	 *
	 *
	 * */
	public static void method_replace()
	{
		String s = "hello, java";
		String s1 = s.replace('a', 's');

		sop("s = "+s);
		sop("s1 = "+s1);
	}

	/*
	 * 切割
	 *		String[] split(regex);
	 *		根据regex对字符串进行切割
	 *
	 * */
	public static void method_split()
	{
		String s = "zhang, zhou, bai, li, liu";

		String[] s1 = s.split(",");

		for(int i = 0; i < s1.length; i++)
			sop("~~~~~"+s1[i]);
	}

	/*
	 * 子串
	 *		获取从beginIndex角标开始到结尾的子字符串
	 *			String substring(int beginIndex);
	 *		获取角标从beginIndex到endIndex - 1的子字符串
	 *		包含头，不包含尾，即beginIndex~endIndex - 1
	 *			String substring(int beginIndex, int endIndex);
	 *	
	 * */
	public static void method_sub()
	{
		String s = "abcdef";

		sop("abcdef = "+s.substring(0));
		sop("cdef = "+s.substring(2));
		sop("cd = "+s.substring(2, 4));
		sop("abcdef = "+s.substring(0, s.length()));
	}

	public static void main(String[] args)
	{
		
		//实现字符串的获取方法
		method_get();

		//实现字符串的判断方法
	    method_is();

		//实现字符串的转换方法
		method_trans();
		
		//实现字符串的替换方法
		method_replace();

		//实现字符串的切割方法
		method_split();

		//实现字符串的获取子串的方法
		method_sub();

		sop("----------------------------");
		String s = "";
		sop(s.length());
		sop((3+"").length());
		/*
		//s snew是一样的
		String s = new String();
		String snew = "";

		//s1和s2有什么区别？
		//s1在内存中有一个对象
		//s2在内存中有两个对象
		String s1 = "abc";//"abc"这个字符串被创建，无法改变
		String s2 = new String("abc");
	

		System.out.println(s1.equals(s2));
		*/
	}

	//将输出语句封装成一个函数
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
