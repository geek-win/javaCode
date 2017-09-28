/*
 * 多态练习
 * */
abstract class Animal
{
	abstract void eat();
}

class Cat extends Animal
{
	public void eat()
	{
		System.out.println("cat eat");
	}

	public void catchMouse()
	{
		System.out.println("cat catch mouse");
	}
}

class Dog extends Animal
{
	public void eat()
	{
		System.out.println("dog eat");
	}

	public void kanJia()
	{
		System.out.println("dog kanjia");
	}
}

class Pig extends Animal
{
	public void eat()
	{
		System.out.println("pig eat");
	}

	public void gongDi()
	{
		System.out.println("pig gongdi");
	}
}

class D1
{
	public static void main(String[] args)
	{
		function(new Cat());
		function(new Dog());
		function(new Pig());
	}

	public static void function(Animal a)
	{
		a.eat();

		if(a instanceof Cat)
		{
			Cat c1 = (Cat)a;
			c1.catchMouse();
		}
		else if(a instanceof Dog)
		{
			Dog d1 = (Dog)a;
			d1.kanJia();
		}
		else if(a instanceof Pig)
		{
			Pig p1 = (Pig)a;
			p1.gongDi();
		}
	}

}
