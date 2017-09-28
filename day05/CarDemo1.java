/*
 * 需求：汽车修配厂，对汽车进行改成3个轮胎
 * */
//创建汽车类
class Car
{
	//属性，变量
	int num = 4;//轮胎数 = 4
	String color = "red";//颜色 = red

	//行为，函数
	void run()
	{
		System.out.println(num+"----->"+color);
	}

	public static void main(String[] args)
	{
		new Car().run();

		Car c = new Car();
		c.num = 5;
		c.color = "blue";
		c.run();
	}
}
//在Car类中可以定义主函数，但是主函数中不可以直接写run();因为static
//函数不可以直接调用非static函数，但是可以调用new Car().run();也就是可以直接
//创建个对象，然后直接调用其run()函数

class CarDemo1
{
	public static void main(String[] args)
	{
		Car q = new Car();
		show(q);
	}

	//需求：汽车修配厂，对汽车进行改装，将来的车能够改成黑车，3个轮胎
	public static void show(Car c)//参数是Car类型的对象实体
	{
		c.num = 3;
		c.color = "black";
		c.run();
	}
}
