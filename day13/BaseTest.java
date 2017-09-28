/*
 * 基本数据类型封装成对象
 * 主要用于和字符串之间的相互转化
 * */
class BaseTest
{
	//基本数据类型对象方法复习
	public static void method()
	{
		//字符串转换成基本数据类型
		//static byte parseByte(String s)
		//static short parseShort(String s)
		//static int parseInt(String s)
		//上述方法调用了parseInt(String s, int radix)radix = 10
		//static long parseLong(String s)
		//static float parseFloat(String s)
		//static double parseDouble(String s)
		//static boolean parseBoolean(String s)，其中s只能是ture或者false
		sop("3+4 = "+(Short.parseShort("3")+4));
		sop("300+400 = "+(Long.parseLong("300")+400));
		sop(Boolean.parseBoolean("true")?"I love ll.":"no");

		//字符串转成int类型，可以将字符串封装成Integer对象，然后通过intValue方法获取数值
		Integer i = new Integer("123");
		sop(i.intValue()+4);

		//获取各基本数据类型的最大值&最小值
		sop("byte的最大值："+Byte.MAX_VALUE+"，最小值为："+Byte.MIN_VALUE);
		sop("short的最大值："+Short.MAX_VALUE+"，最小值为："+Short.MIN_VALUE);
		sop("int的最大值："+Integer.MAX_VALUE+"，最小值为："+Integer.MIN_VALUE);
		
		//获取各基本数据类型用二进制表示所需的位数
		sop("byte的位数："+Byte.SIZE);
		sop("short的位数："+Short.SIZE);
		sop("int的位数："+Integer.SIZE);
		sop("float的位数："+Float.SIZE);
		sop("double的位数："+Double.SIZE);
		
		//将基本数据类型转成字符串
		//最简单的方式就是基本数据类型+""
		//正规的方法是
		//static String toString(int i/byte b/short s)
		//String toString()
		Integer i1 = new Integer("12");
		sop(i1.toString());
		sop(Integer.toString(23));

		//将十进制转换成其他进制
		//static String toBinaryString(int i)
		//static String toOctalString(int i)
		//static String toHexString(int i)
		sop("十进制数10转成二进制："+Integer.toBinaryString(10));
		sop("十进制数10转成八进制："+Integer.toOctalString(10));
		sop("十进制60转成十六进制："+Integer.toHexString(60));

		//将其他进制转换成十进制
		//static int parseInt(String s, int radix)
		//表示将radix进制数s转成十进制数
		sop("二进制1010转成十进制："+Integer.parseInt("1010", 2));
		sop("八进制56转成十进制："+Integer.parseInt("56", 8));
		sop("十六进制3c转成十进制："+Integer.parseInt("3c", 16));

		//Character类
		//转成大小写
		//static char toUpperCase(char ch)
		//static char toLowerCase(char ch)
		sop("a变成大写："+Character.toUpperCase('a'));
		sop("B变成小写："+Character.toLowerCase('B'));
		sop("a变成字符串："+Character.toString('a'));
		Character c = new Character('c');
		sop("c变成字符串："+c.toString());

		sop("----------------------");
		Integer x = new Integer("123");
		Integer y = new Integer(123);
		sop("x == y: "+(x==y));
		sop("x.equals(y):"+x.equals(y));

		//jdk1.5之后可以自动装箱
		//为了简化书写
		//a可直接进行计算
		Integer a = 4;//等价于new Integer(4);a可以是null，因为是对象，但是int类型的a不能是null
		//Integer类型的对象可以是数值，也可以是null，只有是数值的时候才能直接进行运算
		//因为运算的时候调用的是它的intValue()方法，null是没办法取到数值的
		sop(a);
		
		int nu = a + 5;//a进行了自动拆箱，然后变成了int类型和5相加，然后把结果赋给nu
		sop(nu);

		a = a + 5;//a自动拆箱，变成int类型，和5相加，再自动装箱，赋给a
		//上式中的a简化了书写，是a.intValue()
		sop(a);

		//新特性
		//m和n指向了同一个Integer对象
		//当数值在byte范围内，即-128-127
		//对于新特性来说，如果该数值已经存在，则不会再开辟新的空间
		//所以如果堆内存中已经有数值，那么不会再开辟新空间
		//如果是大于127，那就需要重新开辟新的空间
		sop(Byte.MIN_VALUE+"~"+Byte.MAX_VALUE);
		Integer m = 127;
		Integer n = 127;
		sop("m == n:"+(m == n));

		sop("4.compareTo(3):"+new Integer(4).compareTo(new Integer(3)));

		//由于大于127，所以会重新开辟空间，所以指向不同的内存区域，所以false
		Integer a1 = 199;
		Integer a2 = 199;
		sop(a1==a2);
		
		//in1指向new的3对象
		//in2指向new的3对象
		//所以in1和in2的内容不同
		Integer in1 = new Integer(3);
		Integer in2 = new Integer(3);
		sop(in1==in2);

	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		method();

	}
}
