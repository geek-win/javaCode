/*
 * 获取一段程序的运行时间
 * 使用java自带的一个方法currentTimeMills()即可获得本机当前时间
 * 只要获取程序执行开始和结束的时间即可
 * 如果确定的功能里包含了不确定的部分，就可以将不确定的部分抽取作为抽象的部分
 * 由子类进行覆盖，然后创建子类对象，运行确定方法即可
 * */
abstract class GetTime
{
	public final void getTime()
	{
		long start = System.currentTimeMillis();
		run();
		long end = System.currentTimeMillis();

		System.out.println("程序运行时间"+(end - start)+"毫秒");
	}

	abstract void run();
}

class SubGetTime extends GetTime
{
	public void run()
	{
		for(int i = 0; i < 1000; i++)
			System.out.println("I love ll.");
	}

}

class GetTimeTest
{
	public static void main(String[] args)
	{
		SubGetTime s = new SubGetTime();
		s.getTime();
	}
}
