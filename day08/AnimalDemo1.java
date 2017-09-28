/*
 * 多态的使用
 * */
abstract class Animal
{
	abstract void eat();
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
		System.out.println("吃白菜");
	}

	public void gongDi()
	{
		System.out.println("拱地");
	}
}

class AnimalDemo1
{
	public static void main(String[] args)
	{
		Animal c = new Cat();
		Animal d = new Dog();
		Animal p = new Pig();

		function(c);
		function(d);
		function(p);

		/*
		((Cat)c).catchMouse();
		Dog d1 = (Dog)d;
		d1.kanJia();
		((Pig)p).gongDi();
		*/
	}

	public static void function(Animal a)
	{
		a.eat();

		//判断某一类型引用指向的对象到底是哪一个子类
		//instanceof
		//表示是谁的实例
		if(a instanceof Cat)
			((Cat)a).catchMouse();
		else if(a instanceof Dog)
			((Dog)a).kanJia();
		else if(a instanceof Pig)
			((Pig)a).gongDi();
	}
}
