/*
 * 创建人类
 * */
class Person
{
	/*用于修饰类中的成员，成员变量成员函数
	私有，只在本类中有效。只能在Person类中访问，其他的都不行
	所以，要想让外界使用，必须提供一个访问方式,将age私有化之后
	类以外建立了对象也不能直接访问，所以需要提供一个外界访问age的方法
	getAge()函数即可
	*/
	//类中有很多属性，私有之后都对应两个函数，一个是设置，一个是获取
	private int age;
	private String name;

	//一般来说，成员变量都是私有的，只需要提供给外界设置获取的方式即可
	//一个成员变量一般对应两个成员函数
	//一个是设置set，一个是获取get
	//其实提供这些函数之后还是可以赋给非法值
	//之所以对外提供访问方式，就是因为可以在访问方式中加入逻辑判断等语句
	//对访问的数据进行操作，提高代码的健壮性
	//而这些逻辑判断语句是不可以出现在类的定义中的
	//设置成员变量age
	public void setAge(int age)
	{
		if(age >= 0 && age <= 130)
			this.age = age;
		else
			System.out.println("Please input leagle age.");

	}
	//获取成员变量age
	public int getAge()
	{
		return this.age;
	}
	
	//设置成员变量name
	public void setName(String name)
	{
		this.name = name;
	}
	//获取成员变量name
	public String getName()
	{
		return name;
	}

	void speak()
	{
		System.out.println("name : "+this.name+", age : "+this.age);
	}
}

class PersonDemo
{
	public static void main(String[] args)
	{
		Person p = new Person();

		p.setAge(2);//age被直接访问比较危险，因为有可能给其非法值
		p.setName("张三");
		p.speak();//()不要忘记
	}
}
