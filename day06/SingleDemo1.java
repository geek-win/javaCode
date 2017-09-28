/*  
 *  单例设计模式：
 *  懒汉式和饿汉式
 *  懒汉式：先不创建对象，当用的时候才创建，比较懒
 *  饿汉式：先创建对象
 *
 * 实际开发的时候还是用饿汉式的。
 * 懒汉式会出现问题，但如果加个synchronized同步就可以加锁，其他的进不来。
 * 但是效率低，所以还是使用饿汉式。
 * 
 * 所以还是使用饿汉式。
 * 单例设计模式：建议使用饿汉式
 * 但是面试的时候，会问懒汉式，该怎么解决多线程问题，就是加锁。
 * */
class Single
{
	private static Single s = null;
	private Single()
	{

	}

	public static Single getInstance()
	{
		//加锁
		if(s == null)
		{
			synchronized(Single.class)
			{
				if(s == null)
					s = new Single();
			}
		}
		return s;
	}

	private int num;
	public void setNum(int num)
	{
		this.num = num;
	}

	public int getNum()
	{
		return this.num;
	}
}

class SingleDemo1
{
	public static void main(String[] args)
	{
		Single s1 = Single.getInstance();
		Single s2 = Single.getInstance();

		s1.setNum(11);
		System.out.println(s2.getNum());
	}
}
