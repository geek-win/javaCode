//饿汉设计模式
class Single
{
	//构造函数是私有的，外界无法创建对象
	private Single()
	{

	}

	//创建唯一的对象，私有的
	//先创建对象
    private static Single s = new Single();

	//对外提供访问该Single对象的方法
	public static Single getInstance()
	{
		return s;
	}
}

//懒汉设计模式
class Single
{
	//构造函数是私有的，外界无法创建对象
	private Single()
	{

	}

	//创建唯一的对象，私有
	//等使用的时候再创建
	//懒汉
	private static Single s = null;

	//对外提供访问该对象的方法
	public static Single getInstance()
	{
		if(s == null)
		{
			//上锁
			s.synchoronized()
			{
				if(s == null)
					s = new Single();
			}
		}

		return s;
	}
}
