/*
 * 继承后
 * 类中成员的特点：
 * 类中成员包括：变量、函数、构造函数
 * 1、变量：如果子类中出现非私有的同名成员变量时，子类要访问父类中的同名变量，用super，如果要访问本类中的变量，用this
 * super的使用和this的使用几乎一致，this代表本类对象的引用，super代表父类对象的引用。
 * 2、函数：
 * 3、构造函数：
 * */
class Fu
{
	int num = 4;
	void show()
	{
		System.out.println(num);
	}

	void speak()
	{
		System.out.println("vb");
	}
}

class Zi extends Fu
{
	int num = 5;

/*	void show()
	{
		System.out.println(num);//理论上省略的是this
	}
	*/
	void speak()
	{
		System.out.println("java");
	}
}

class Demo
{
	public static void main(String[] args)
	{
		Zi zi = new Zi();//堆内存中有个new Zi()
		//有个Zi类的num，还有个Fu类的num

	//	System.out.println(zi.num+"...."+zi.num);
		zi.show();
		zi.speak();
	}
}
 
