/*
 * 补全代码
 * */
class Circle 
{
	private static double pi = 3.14;
	private double radius;
	public Circle(double r)
	{
		radius = r;
	}
	public static double compare(Circle[] cir)
	{
		//程序代码
		//求数组中的最大值
		int max = 0;//设最大值是角标为0的对象对应的半径值

		for(int i = 0; i < cir.length; i++)
		{
			if(cir[i].radius > cir[max].radius)
				max = i;
		}

		return cir[max].radius;
	}
}

class TC
{
	public static void main(String[] args)
	{
		Circle cir[] = new Circle[3];//创建一个Circle类类型的数据
		cir[0] = new Circle(1.0);
		cir[1] = new Circle(2.0);
		cir[2] = new Circle(3.0);
		System.out.println("最大半径值为："+Circle.compare(cir));
	}
}
