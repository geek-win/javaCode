/*
 * Runtime类
 * 是java.lang.*中的类
 * 表示运行时，每个java应用程序都有一个Runtime类实例，使应用程序能够与其运行环境相连接。可以通过getRuntime方法获取该类对象，应用程序不能创建自己的Runtime类实例
 * 所以该类没有构造函数
 * 并且方法应该都是static的，但是其方法有非静态的
 * 所以肯定提供了一个方法
 * 返回Runtime类实例
 * 并且该方法是静态的、公有的
 * 该方法是getRuntime()
 * 单例模式
 * 由这个特点可以看出该类使用了单例设计模式完成
 * 保证了对象的唯一性
 * */
class RuntimeDemo
{
	public static void main(String[] args)throws Exception
	{
		Runtime r = Runtime.getRuntime();

		//exec方法中是命令的路径
		//如果没有对应的路径或者可执行命令
		//会抛出异常
		//windows下
		//目录中一定要写两个反斜线
		//因为一个表示转义字符，会把后面的内容都转义了
		//所以要加两个转义字符
		//并且默认先在当前目录找
		//如果有就执行
		//如果没有就区Path路径下执行
		Process p = r.exec("\\bin\\ls");
		Thread.sleep(4000);
		p.destroy();

		
	}
}
