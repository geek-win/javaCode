/*
 * 求长方形、圆形的面积
 * 长方形有长、宽属性
 * 圆形有半径属性
 * 二者都有求面积的方法
 * 函数声明相同，但是函数体，即具体实现不同
 * 将求面积方法向上抽取成抽象的方法，封装到接口中
 * 由子类进行复写
 * */
//圆形和长方形都有求面积方法
//函数声明相同
//函数体不同
//将函数定义成抽象函数
//封装到接口中
//由子类实现即可
interface Shape
{
	void getArea();
}

//定义异常类
class MinusException extends RuntimeException
{
	MinusException(String message)
	{
		super(message);
	}
}

//定义长方形
//属性：长、宽
//方法：复写接口的求面积抽象方法
class Rec implements Shape
{
	private int len, wid;

	//构造函数有可能抛出异常
	//该异常是运行时异常，函数上不需要声明
	Rec(int len, int wid)
	{
		if(len <= 0 || wid <= 0)
			throw new MinusException("长或宽值为负数，非法！");

		this.len = len;
		this.wid = wid;
	}

	//复写
	public void getArea()
	{
		System.out.println(this.len*this.wid);
	}
}

//定义圆形
//属性：半径
//方法：复写接口的求面积方法
class Circle implements Shape
{
	private int r;
	public static final double PI = 3.14;

	//构造函数有可能抛出异常
	//该异常是运行时异常，函数上不需要声明
	Circle(int r)
	{
		if(r <= 0)
			throw new MinusException("半径值为负数，非法！");

		this.r = r;
	}

	//复写
	//由于接口中的函数默认权限是
	//public abstract
	//所以复写时，权限必须是public
	public void getArea()
	{
		System.out.println(PI*r*r);
	}
}

class ExceptionTest2
{
	public static void main(String[] args)
	{
		Rec r = new Rec(2, 3);
		r.getArea();

		Circle c = new Circle(-3);
		c.getArea();
	}
}
