/*
 * 圆形和方形
 * 都可以获取面积，对于面积如果出现非法的数值，即负数或者0，就视为获取面积出现问题
 * 问题用异常来表示
 * 现对这个程序进行基本设计
 * 方形和圆形有属性，求面积方法可以抽取出来，抽出作为一个扩展功能，接口
 * */
interface Shape
{
	void getArea();
}

class NoValueException extends RuntimeException
{
	NoValueException(String msg)
	{
		super(msg);
	}
}
//定义方形
//属性有长、宽
class Rec implements Shape
{
	private int len, wid;

	Rec(int len, int wid)//throws NoValueException
	{
		if(len<=0 || wid<=0)
			throw new NoValueException("长或宽值为负值，错误！");
			
		this.len = len;
		this.wid = wid;
	}

	public void getArea()
	{
		System.out.println(this.len*this.wid);
	}
}

//定义圆形
//属性有半径
class Circle implements Shape
{
	private int r;
	public static final double PI = 3.14;

	Circle(int r)// throws NoValueException
	{
		if(r <= 0)
			throw new NoValueException("半径值为负值，错误！");
		this.r = r;
	}

	public void getArea()
	{
		System.out.println(PI*r*r);
	}
}

class ExceptionTest1
{
	public static void main(String[] args)
	{
			Rec r = new Rec(3, 4);
			r.getArea();

			Circle c = new Circle(-3);
			c.getArea();
	}
}

