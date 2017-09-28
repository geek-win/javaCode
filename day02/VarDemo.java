/*
 * 定义变量进行练习
 * */
class VarDemo
{
	public static void main(String[] args)
	{
		//byte占用1个字节，short占用2个字节，int占用4个字节,long占用8个字节
		byte b = 4;
		short s = 4;
		int i = 4;
		long l = 4;

		//b = 128;//由于b是byte，范围是-128-127，所以赋值为128有问题，会报错

		//float占用4个字节，double占用8个字节，小数默认为double类型，所以如果定义单精度，就需要在小数后面加上f，否则会报错：缺失精度
		float f = 2.3f;

		//char类型，单引号
		char ch1 = '1';
		char ch2 = '2';
		char ch3 = '+';
		char ch4 = ' ';

		System.out.println("ch1 = " + ch1);
		System.out.println("ch2 = " + ch2);
		System.out.println("ch3 = " + ch3);
		System.out.println("ch4 = " + ch4);

		System.out.println("b = " + b);
		System.out.println("s = " + s);
		System.out.println("i = " + i);
		System.out.println("l = " + l);
		System.out.println("f = " + f);

		//打印字符型和int型相加
		System.out.println('A' + 0);//本身也是A对应的ASCII码
		//将int型转换成char
		System.out.println((char)('A' + 2));
		//字符1对应的整数值为多少
		System.out.println('1' + 0);
		System.out.println((char)65);
		System.out.println('A');
		//将字符型转换成int
		System.out.println((int)('A'));
		//输出字符串
		System.out.println("haha" + "jaja");
		//字符串数据和任何数据使用+都是相连接，字符串连接
		System.out.println("5+5 = "+5+5);
		int a = 3, b1 =4;
		System.out.println("a = "+a+", b1 = "+b1);

		//转义字符
		//\t:table
		System.out.println("hello\tworld!");
		//\b:退格,相当于backspace，删除,不常用
		System.out.println("hello\bjava");
		//linux中\n表示换行，Windows中，回车符是由\r\n表示,dos中直接识别\n
		//\“
		System.out.println("\"hello world\"");
		//char类型是2字节，汉字也是2个字节，所以可以给char类型赋值为汉字
		char c1 = '子';
		System.out.println(c1);

		//输出反斜线、单引号、双引号
		System.out.println("\\\tand\t\'\tand\t\"");

//		int n1 = n2 = n3 =10;编译失败，初始化变量的时候不可以用变量给变量进行初始化
	}

}
