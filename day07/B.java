/*
 * 抽象类的复习
 * */
abstract class Animal
{
	//吃
	abstract void eat();

	//睡
	abstract void speak();
}

class Dog extends Animal
{
	void eat()
	{
		System.out.println("eat bone");
	}

	void speak()
	{
		System.out.println("bow-wow");
	}
}

class Cat extends Animal
{
	void eat()
	{
		System.out.println("eat fish");
	}

	void speak()
	{
		System.out.println("meow~~");
	}
}

class B
{
	public static void main(String[] args)
	{
		Dog d = new Dog();
		Cat c = new Cat();

		d.eat();
		d.speak();
		c.eat();
		c.speak();
	}
}
