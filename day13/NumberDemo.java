/*
 * 对NUmber类的子类进行学习
 * byte Byte
 * short Short
 * int Integer
 * long Long
 * float Float
 * double Double
 * char Character
 * */
class NumberDemo
{

	public String toString()
	{
		return "hahah";
	}

	public static void main(String[] args)
	{
		Integer i = new Integer(5);

		sop(i.getClass().getName());
		sop("max = "+Integer.MAX_VALUE);
		sop("min = "+Integer.MIN_VALUE);
		sop("byte位数："+Byte.SIZE);
		sop("shor位数："+Short.SIZE);
		sop("int位数："+Integer.SIZE);

		//现将字符串或者整数封装成对象，然后使用非静态方法intValue()获取其数值
		Integer i1 = new Integer("123");
		int num1 = i1.intValue();
		sop("num1 = "+num1);

		//将字符串转成int类型
		//static int parseInt(String s)
		//将s转换成int类型
		//同样的，其他基本数据类型转换也是这样
		//static long parseLong(String s)
		//基本数据类型包装类.parse基本数据类型(String s)
		//xxx a = Xxx.parseXxx(String)
		//int a = Integer.parseInt("123");
		//double d = Double.parseDouble("343.44");
		//boolean b = Boolean.parseBoolean("false");
		//Boolean b = Boolean.parseBoolean("true");
		//Character没有字符串转成该类型的方法，本身就是字符
		//有个静态方法
		//将字符进行大小写转换
		//static char toLowerCase(char ch)
		//static char toUpperCase(char ch)
		//将字符串转化为基本数据类型，总结如下：
		//Integer.parseInt("123");
		//Short.parseShort("23");
		//Long.parseLong("13");
		//Byte.parseByte("33");
		//Boolean.parseBoolean("false");
		//Boolean.parseBoolean("true");
		int num = Integer.parseInt("23");
		sop(num+4);
		sop(Character.toUpperCase('a'));
		sop(Character.toLowerCase('B'));
		sop(Character.toString('a').getClass().getName());
		sop(Boolean.parseBoolean("true"));
		sop(Boolean.parseBoolean("false"));
		sop(Float.parseFloat("4.55"));
		sop(Double.parseDouble("4.55"));

		/*
		if(Boolean.parseBoolean("false"))
			sop("I love LL.");
			*/
		sop("abc"+4);

		//进制转换
		//十进制转成其他进制
		//static String toBinaryString(int i)
		//static String toOctalString(int i)
		//static String toHexString(int i)
		sop("10的二进制形式为："+Integer.toBinaryString(10));
		sop("10的八进制形式为："+Integer.toOctalString(10));
		sop("25的十六进制形式为："+Integer.toHexString(25));
		sop("10的二进制反转形式为："+Integer.reverse(10));
		sop("-6的二进制表示形式为："+Integer.toBinaryString(-6));
		sop("60的十六进制："+Integer.toHexString(60));
		
		//其他进制转成十进制
		//static int parseInt(String s, int radix)
		//将s转成十进制，radix是s的进制数
		//Integer.parseInt("1010", 2);
		sop("1010转成十进制为："+Integer.parseInt("1010", 2));
		sop("0x56转成十进制为："+Integer.parseInt("56", 16));
		sop("o56转成十进制为："+Integer.parseInt("56", 8));

		/*
		NumberDemo n = new NumberDemo();
		sop(n.toString());
		sop(n.getClass().getName()+"@"+Integer.toHexString(n.hashCode()));
		*/
		
		sop(new NumberDemo().toString());

	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
