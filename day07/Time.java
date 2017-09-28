/*
 * 求时间
 * */
//类
//描述为：能够提供方法获取时间
//System类有个静态方法currentTimeMillis()
/*
 * 什么是模块方法设计模式呢？
 * 在定义功能时，功能的一部分是确定的，但是有一部分是不确定的，而确定的部分
 * 在使用不确定的部分，那么这时就将不确定的部分暴露出去，由该类的子类去完成
 *
 * 提高了扩展性和复用性
 * 不确定的部分不一定是抽象的，也有可能是必须有的部分，但是子类如果想改也可以覆盖
 * 确定的部分也不一定是final的。有的方法也可以被修改。
 * 具体情况具体分析
 */
abstract class GetTime
{
	//因为getTime()函数并不想被子类复用
	//所以将其设置成final即可
	public final void getTime()
	{
		//程序开始时间
		long start = System.currentTimeMillis();

		//程序
		//如果每次都在这个地方都加上代码，就很麻烦
		//所以可以复写一下
		/*
		for(int i = 0; i < 1000; i++)
		{
			System.out.println("I love lulu.");
		}
		*/

		program();

		//程序结束时间
		long end = System.currentTimeMillis();

		System.out.println("毫秒："+(end - start));
	}

	public abstract void program();
}

class SubGetTime extends GetTime
{
	public void program()
	{
		for(int i = 0; i < 10000; i++)
			System.out.println("I love ll.");
	}
}
class Time
{
	public static void main(String[] args)
	{
		SubGetTime gt = new SubGetTime();

		gt.getTime();
	}
}
