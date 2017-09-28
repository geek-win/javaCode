/*
 * 补全compare函数内的代码，不能添加其他函数
 * */
class Circle
{
	private double radius;
	public Circle(double r)
	{
		radius = r;
	}

	public Circle compare(Circle cir)
	{
		//程序代码
		//根据分析，可知
		//compare函数返回的应该是比较结果中较大的半径对应的圆的对象
		return (this.radius > cir.radius)? this:cir;

	}
}

class TC
{
	public static void main(String[] args)
	{
		Circle cir1 = new Circle(1.0);
		Circle cir2 = new Circle(2.0);

		Circle cir;
		cir = cir1.compare(cir2);

		if(cir1 == cir)
			System.out.println("cir1的半径比较大");
		else
			System.out.println("cir2的半径比较大");
	}
}
