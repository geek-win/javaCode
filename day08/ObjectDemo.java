/*
 * Object：是所有对象的直接或者间接父类，上帝
 * 该类定义的功能是所有类都具备的功能
 * boolean equals(Object obj)
 * Object类中已经提供了对对象是否相同的比较方法
 * 如果自定义类中也有比较相同的功能，没必要重新定义，直接覆盖即可
 * 只要沿袭父类功能，建立自己特有的内容即可，这就是覆盖
 * */
class Demo
{
	private int num;

	Demo(int num)
	{
		this.num = num;
	}

	public boolean compare(Demo d)
	{
		return this.num == d.num;
	}
	
	//既然有比较的功能，就不用自己定义新的方法，可以覆盖
	public boolean equals(Object obj)
	{
		/*
		if(obj instanceof Demo)
		{
			Demo d = (Demo)obj;
			return this.num==d.num;
		}

		return false;
		*/

		if(!(obj instanceof Demo))
			return false;

		Demo d = (Demo)obj;
		return this.num == d.num;

	}
	//每个对象都有自己的字符串表示方法，通常都会将特有方式，比较有意义的方法覆盖
	//一般toString()和equals()和hashCode()都有可能会复写
	public String toString()
	{
		return "demo:"+num;
	}
	
	public int hashCdoe()
	{
		return 10000;
	}
}

class Person
{

}

class ObjectDemo
{
	public static void main(String[] args)
	{
		Demo d1 = new Demo(2);
		Demo d2 = new Demo(2);
		Demo d3 = d1;

		Person p = new Person();
		//System.out.println(d1.equals(d2));
		//System.out.println(d3.equals(d1));

		//System.out.println(d1.compare(d2));
		
		System.out.println(d1.equals(d2));

		System.out.println("p==d1"+d1.equals(p));
/*
		System.out.println("d1的hash值十六进制"+Integer.toHexString(d1.hashCode()));
		System.out.println("d1的class名称"+d1.getClass().getName());
		System.out.println("d1的toString值"+d1.toString());
*/

		System.out.println("d1的类名"+d1.getClass().getName());
		System.out.println("d1的hash值"+d1.hashCode());
		System.out.println("d1的hash值的十六进制"+Integer.toHexString(d1.hashCode()));
		System.out.println("原创toString()\n"+d1.getClass().getName()+"@"+Integer.toHexString(d1.hashCode()));
		System.out.println("toString()\n"+d1.toString());
		System.out.println("new Demo(10)\n"+(new Demo(10)).toString());
	}
}

