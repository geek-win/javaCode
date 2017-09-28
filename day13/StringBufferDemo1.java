/*
 * 对StringBuffer的复习
 * */
class StringBufferDemo1
{
	//获取
	//1、获取长度
	//2、获取特定位置的字符
	//3、获取特定字符或者字符串的位置
	//4、从特定位置开始，获取特定字符或者字符串的位置
	public static void method_get()
	{
		StringBuffer sb = new StringBuffer("hello, world");
		sop("sb = "+sb);

		//获取长度
		sop("sb的长度为："+sb.length());

		//获取特定位置的字符
		sop("sb的角标4的字符为："+sb.charAt(4));

		//获取特定字符的位置
	//	sop("sb中字符o第一次出现的位置为："+sb.indexOf('o'));
	}

	//添加、删除、插入
	public static void method()
	{
		StringBuffer sb = new StringBuffer();

		//添加
		sb.append("abc").append("def");
		sop("sb = "+sb);

		//删除
		sb.delete(2, 4);
		sop("sb = "+sb);

		//特定位置删除
		sop(sb.deleteCharAt(3));

		//对容器的处理，返回的是容器
		StringBuffer sb1 = sb.append("hello,world");
		sop(sb1+"---"+sb);
		sop(sb1.delete(0, 4));
		sop(sb);

		//在指定位置插入
		sop("在角标3的位置插入HELLO");
		sop(sb.insert(3, "HELLO"));

		//获取子串
		sop("sb的2到4的子串："+sb.substring(2, 5));
		
		//修改
		sop("修改，将角标2到4替换成WORLD");
		sop(sb.replace(2, 5, "WORLD"));
	}

	//简化输出函数
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		method_get();
		method();
	}
}
