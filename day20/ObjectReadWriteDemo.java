/*
 * ObjectInputStream(InputStream in)
 * 能读取文件中对象的字节流对象
 * ObjectOutputStream(OutputStream out)
 * 能将对象写入文件中的字节流对象
 * */
import java.io.*;

class A implements Serializable
{
	public static final long serialVersionUID = 42L;

	String name;
	transient int age;

	static String country = "cn";

	A(String name, int age, String country)
	{
		this.name = name;
		this.age = age;
		this.country = country;
	}

	public String toString()
	{
		return this.name+";;;"+this.age+":::"+this.country;
	}
}

class ObjectReadWriteDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void writeObj()throws IOException
	{
		//创建对象写入流对象
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("write.txt"));

		oos.writeObject(new A("sgag", 10, "jjjjj"));

		oos.close();
	}

	public static void readObj()throws Exception
	{
		//创建对象读取流对象
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("write.txt"));

		//从文件中读取对象并输出
		A a = (A)ois.readObject();

		sop(a.toString());

		ois.close();
	}

	public static void main(String[] args)throws Exception
	{
		//写入操作
//		writeObj();
	
		readObj();
	}
}
