/*
 * 多态练习
 * */
abstract class Animal
{
	public abstract void eat();
}

class Cat extends Animal
{
	public void eat()
	{
		System.out.println("吃鱼");
	}

	public void catchMouse()
	{
		System.out.println("抓老鼠");
	}
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("啃骨头");
	}

	public void kanJia()
	{
		System.out.println("看家");
	}
}

class Pig extends Animal
{
	public void eat()
	{
		System.out.println("吃饲料");
	}

	public void gongDi()
	{
		System.out.println("拱地");
	}
}

class DuoTai1
{
	public static void main(String[] args)
	{
		for(int i = 0; i < args.length; i++)
		{
			System.out.println("--"+args[i]);
		}

		Cat c = new Cat();
		c.eat();
		c.catchMouse();

		Animal c1 = new Cat();
		Animal d = new Dog();
		Animal p = new Pig();

		function(c1);
		function(d);
		function(p);
	}

	public static void function(Animal a)
	{
		a.eat();

		if(a instanceof Cat)
		{
			System.out.println("多态，向下类型至猫");

			((Cat)a).catchMouse();
		}
		else if(a instanceof Dog)
		{
			System.out.println("多态，向下类型至狗");

			((Dog)a).kanJia();
		}
		else if(a instanceof Pig)
		{
			System.out.println("多态，向下类型至猪");

			((Pig)a).gongDi();
		}
	}
}
