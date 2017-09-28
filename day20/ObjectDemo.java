/*
 * ObjectOutputStream
 * ObjectInputStream
 * 将对象写到文件中
 * 源：
 * 目的：不是纯文本，是对象，不是一个字符一个字符读取的。所以是字节流，FileOutputStream
 * 和FileOutptuStream相同，写入的对象不同，对应的类也不同，FileOutputStream是操作文件的，如果是对象，那么需要ObjectOutputStream
 * */
import java.io.*;

class ObjectDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void writeObj()throws IOException
	{
		/*
		//创建对象输出流对象
		//构造函数中需要传入字节输出流
		//因为目的是文件，不是纯文本，所以使用字节输出流
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));

		//这样就把对象写到了oos关联的输出文件中
		oos.writeObject(new Person("zhansan", 10));
		oos.writeObject(new Person("lisi", 20));

		oos.close();
		*/

		//将对象存到文件中
		//目的：字节流。OutputStream，同时要操作对象所以使用ObjectOutputStream，并且目的是文件，FileOutputStream
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));
		oos.writeObject(new Person("haha", 10));
		oos.writeObject(new Person("lisi", 20));
		oos.writeObject(new Person("zhangsan", 20));
		oos.writeObject(new Student("zhangsan", 20));
		oos.writeObject(new Student("zhangsan", 20));

		oos.close();
	}

	//读取文件中的对象
	public static void readObj()throws Exception
	{
		/*
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));

		Person p = (Person)ois.readObject();
		sop(p.toString());

		ois.close();
		*/
		//创建能够读取对象的字节流输入流对象
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));

		Object o = null;
		while((o = ois.readObject()) != null)
		{
			sop(o.toString());
		}

		ois.close();
	}
	
	public static void main(String[] args)throws Exception
	{
//		writeObj();
		readObj();
	}
}

//要想序列化，必须实现Serializable接口
//该接口中没有抽象接口
//没有方法的接口称为标记接口，其实就是给类盖个戳
//只要实现了该接口，就说这个类对象是可以序列化
//原理就是说，给类加载了一个id号
class Person implements Serializable
{
	public static final long serialVersionUID = 42L;
	private String name;
	int age;
	static String country = "cn";

	Person(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String toString()
	{
		return "person:"+name+"--"+age+"::"+country;
	}
}

class Student implements Serializable
{
	String name;
	int age;
	Student(String name, int age)
	{
		this.name = name;
		this.age = age;
	}

	public String toString()
	{
		return "student:"+this.name+"--"+this.age;
	}
}
