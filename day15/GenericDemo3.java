/*
 * 自定义泛型类
 * 也就是<>中的类是自定义的
 * */
import java.util.*;

class Worker
{

}

class Student 
{

}

//泛型前的操作
//定义工具类
//要操作的对象不知道
//所以需要用Object
class Tool
{
	private Object obj;

	public void setObject(Object obj)
	{
		this.obj = obj;
	}

	public Object getObject()
	{
		return obj;
	}
}

//泛型类
//带泛型的类
//好处
//QQ可以是任意的
class Utils<QQ>
{
	private QQ q;
	public void setObject(QQ q)
	{
		this.q = q;
	}
	public QQ getObject()
	{
		return q;
	}
}

class GenericDemo3
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		Tool t = new Tool();
		//如果这个时候
		//setObject接收的是Student，那么下面的语句就会出问题，报异常
		//所以需要定义泛型
		t.setObject(new Worker());
		Worker w = (Worker)t.getObject();

		Utils<Worker> u = new Utils<Worker>();
		//u.setObject(new Worker());
		//Worker w1 = (Worker)u.getObject();
		u.setObject(new Worker());
		Worker w2 = u.getObject();

	}

}


/*
//工具类
class Tool
{
	private Worker w;
	public void setWorker(Worker w)
	{
		this.w = w;
	}

	public Worker getWorker()
	{
		return w;
	}
}
*/
