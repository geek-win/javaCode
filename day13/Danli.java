//饿汉设计模式
class Single
{
	private Single()
	{

	}

	private static Single s = new Single();

	public static Single getInstance()
	{
		return s;
	}
}

//懒汉设计模式
class Single
{
	private Single()
	{

	}

	private static Single s = null;

	public static Single getInstance()
	{
		if(s == null)
		{
			s.synchoronized()
			{
				if(s == null)
					s = new Single();
			}
		}

		return s;
	}
}
