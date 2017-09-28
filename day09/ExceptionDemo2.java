/*
 * 自定义异常类
 * 根据问题本身进行描述和封装为异常类
 * 注意要继承已有的类
 * */
//创建负数异常子类
class FuShuException extends RuntimeException
{
	//定义私有变量num，表示产生异常的负数值
	private int num;

	FuShuException(String msg, int num)
	{
		super(msg);
		this.num = num;
	}

	//对私有变量num的设置以及获取
	public void setNum(int num)
	{
		this.num = num;
	}
	public int getNum()
	{
		return this.num;
	}

	//复写函数
	//使得该类对象的toString()可以进行自定义输出
	public String toString()
	{
		return this.getMessage()+":::"+this.getNum();
	}

}

class Demo
{
	int show(int a, int b)
	{
		if(a < 0)
			throw new FuShuException("负数异常，值为：", a);

		return a+b;
	}
}

class ExceptionDemo2
{
	public static void main(String[] args)
	{
		Demo d = new Demo();

		try
		{
			int x = d.show(-1, 2);

			System.out.println("a+b="+x);
		}
		catch(FuShuException e)
		{
			System.out.println(e.toString());
			System.out.println("负数值："+e.getNum());
			System.out.println("～～～～～～～～～`负数异常～～～～～～～～～");
		}
		System.out.println("over");
	}
}
