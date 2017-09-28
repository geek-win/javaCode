/*
 * 能操作对象的流
 * */
import java.io.*;

class ObD
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void writeObj()throws IOException
	{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.txt"));

		oos.writeObject(new P("zhs", 10, "hhhhh"));

		oos.close();
	}

	public static void readObj()throws Exception
	{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.txt"));

		P p = (P)ois.readObject();

		sop(p.toString());

		ois.close();
	}

	public static void main(String[] args)throws Exception
	{
		writeObj();
		readObj();
	}
}

class P implements Serializable
{
	static final long serialVersionUID = 42L;

	String name;
	transient int age;
	public static String country = "cn";

	P(String name, int age, String country)
	{
		this.name = name;
		this.age = age;
		this.country = country;
	}

	public String toString()
	{
		return name+"::"+age+country;
	}
}
