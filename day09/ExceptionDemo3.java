/*
 * 练习
 * */
//定义接口
//接口中方法为
//求面积
//由子类复写其方法
interface Shape
{
	void getArea();
}

//定义负数异常子类
class FuShuException extends RuntimeException
{
	FuShuException(String message)
	{
		super(message);
	}
}

class Rec implements Shape
{
	private int len, wid;

	Rec(int len, int wid)
	{
		if(len <= 0 || wid <= 0)
			throw new FuShuException("长或宽出现负值，非法！");

		this.len = len;
		this.wid = wid;
	}
	
	public void getArea()
	{
		System.out.println(this.len*this.wid);
	}
}

class Circle implements Shape
{
	private int r;
	public static final double PI = 3.14;

	Circle(int r)
	{
		if(r <= 0)
			throw new FuShuException("半径出现负值，非法！");

		this.r = r;
	}

	public void getArea()
	{
		System.out.println(this.r*this.r*PI);
	}
}

class ExceptionDemo3
{
	public static void main(String[] args)
	{
		Rec r = new Rec(3, 4);
		r.getArea();

		Circle c = new Circle(-3);
		c.getArea();
	}
}


