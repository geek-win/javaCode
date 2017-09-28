/*
 * 需求：获取一段程序的运行时间
 * 原理：获取程序开始和结束的时间并相减
 * 使用Java自身提供的方法
 * System类有个静态方法currentTimeMillis()
 * 返回当前时间，毫秒
 * */
abstract class GetTime
{
	//为了防止该核心函数被覆盖，需要设置其为final
	//即不可被覆盖
	public final void getTime()
	{
		
		long start = System.currentTimeMillis();

		run();

		long end = System.currentTimeMillis();

		System.out.println("该程序运行时间为："+(end - start)+"毫秒");
	}

	public abstract void run();
}

class SubGetTime extends GetTime
{
	public void run()
	{
		for(int i = 0; i < 100; i++)
			System.out.println("I love U!");
	}
}

class AbsDemo3
{
	public static void main(String[] args)
	{
		SubGetTime sg = new SubGetTime();
		sg.getTime();
	}
}
