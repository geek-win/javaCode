/*
 * 静态代码块
 * 特点：随着类的加载而加载，只执行一次。是对类进行初始化，用的比较少，并优先于主函数执行
 * */
class StaticCode
{
	static
	{
		System.out.println("b");
	}

	public static void show()
	{
		System.out.println("show run");
	}
}

class StaticCodeDemo
{
	static
	{
		System.out.println("a");
	}
	
	public static void main(String[] args)
	{
		//new StaticCode();
		//new StaticCode();

//		StaticCode s = null;//这句话执行完没有执行StaticCode中的静态代码块
//		因为没有具体指向，没有用到的话就不需要加载类，也就不会执行静态代码块
		StaticCode.show();
	}

	static
	{
		System.out.println("c");
	}
}
/*
 * javac xxx.java
 * 是编译此java文件，会产生该java文件中所包含的所有类
 * 然后，java 类的时候，会加载该类，执行该类中的静态代码块
 * 然后再执行main函数
 * 如果main函数中又加载了其他类
 * 那么会执行其他类的静态代码块
 * 所以这个执行StaticCodeDemo之后的运行结果为：
 * a
 * c
 * b 
 * show run
 * */
