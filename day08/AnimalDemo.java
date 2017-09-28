/*
 * 多态
 * 一个对象具备多种类型，比如猫既是猫类，又是动物类
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
		System.out.println("吃骨头");
	}

	public void kanJia()
	{
		System.out.println("看家");
	}
}

class AnimalDemo
{
	public static void main(String[] args)
	{
		/*
		Cat c = new Cat();
		c.eat();
		c.catchMouse();
		function(c);
		Animal d = new Dog();
		d.eat();
		d.kanJia();
		*/
		function(new Cat());
		function(new Dog());

		//父类引用指向子类对象
		//Cat是Animal类中的
		//也就是多态
		Animal c = new Cat();
		c.eat();
		Animal d = new Dog();
		d.eat();
//		d.kanJia();报错，因为父类中没这个方法
	}

	//来个小猫就创建对象然后调用eat()方法，代码重复率太高
	//为了提高代码复用性，可以将方法封装
	//向里传入类
	//public static void function(Cat c)
	//但是如果是狗的话，要传入狗类
	//为了进一步提高代码复用性
	//可以向里传入Animal类，这样的话，既可以传入Animal类
	//也可以传入Cat和Dog类
	/*
	public static void function(Cat c)
	{
		c.eat();
	}
	//重载了
	public static void function(Dog d)
	{
		d.eat();
	}
	*/
	//向其中传入Animal类和Animal类的子类对象皆可
	public static void function(Animal a)
	{
		a.eat();
	}
}
