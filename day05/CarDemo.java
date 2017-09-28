/*
 * 创建Car类
 * */
//创建类就是对同一类事物共同特征的描述
//包括两部分：属性（变量）、行为（函数功能）
//万物皆对象，对象可以抽象出类，提取该类的属性行为即可
class Car
{
	//属性
	String color = "red";
	int num = 4;

	//行为
	void run()
	{
		System.out.println(color+"----"+num);
	}

	public static void main(String[] args)
	{
		//run();不符合语法
		//可以在本类中创建本类对象
		//static函数只能调用static函数
		Car car = new Car();
		System.out.println(car.num+"---->"+car.color);
	}
	
}

class CarDemo
{
	public static void main(String[] args)
	{
		Car c = new Car();
		Car c1 = c;

		c.color = "blue";
		c.num = 5;
		c.run();

		c1.num = 16;
		c1.color = "yellow";
		c1.run();
	}
}
