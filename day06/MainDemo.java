/*
 * 主函数
 * public static void main(String[] args)
 * 主函数是一个特殊的函数，作为程序的入口，可以被jvm调用
 *
 * 主函数的定义：
 * public：代表着主函数的权限是最大的，直接被jvm调用
 * static：代表着主函数随着类的加载而加载，java的时候，jvm就直接类.main()执行,java后面的类存在就找main，没有main就报错
 * void：主函数没有具体的返回值
 * main：不是关键字，但是是一个特殊的单词，可以被jvm识别
 * 函数的参数：(String[] args)
 * 该数组中的元素是字符串 
 * 当然可以有两个main函数，但是呢
 * 只能调用那个参数是String[] args的main函数
 * 主函数是固定格式的，jvm识别，只有变量名args可以变化，早期版本是arguments
 * jvm调用main函数时传入的是new String[0]
 * */
class MainDemo
{
	public static void main(String[] args)
	{
		for(int i = 0; i < args.length; i++)
			System.out.println(args[i]+"----------"+args.length);
		//[Ljava.lang.String;@6bc7c054----------0]
		//说明jvm调用main函数传入的是一个长度为0的字符串数组
		//javac是启动编译器，java是启动jvm，要执行哪个类
		//就是把哪个类传给了jvm，然后jvm调用类中的main函数
		//直接java 类。只是传入了长度0的数组
		//但是java 类 string1 string2 ..，就相当于传入了字符串数组
		//也可以输出相应的值

		String[] arr = {
			"haha", "hh", "heihei", "hiahai"
		};
		MainTest.main(arr);
	}
}

class MainTest
{
	public static void main(String[] args)
	{
		for(int i = 0; i < args.length; i++)
			System.out.println(args[i]+",,");
	}
}
