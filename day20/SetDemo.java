/*
 * File类的设置功能
 * */
import java.io.*;

class SetDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		File f = new File("b.txt");

		//设置f关联文件为可执行文件
		//改变的是所有者执行权限
		//public boolean setExecutable(boolean executable, boolean ownerOnly)
		//executable为true表示设置成可执行
		//ownerOnly为true表示执行权限只适用于所有者的执行权限
		//如果为false，表示适用于所有用户
//		sop("b.txt变成可执行文件："+f.setExecutable(false));
		sop("b.txt是否可执行："+f.canExecute());
		sop("b.txt的所有者变成可执行："+f.setExecutable(true));
		sop("b.txt是否可执行："+f.canExecute());

		sop("b.txt写权限："+f.setWritable(true));

		sop("b.txt取消读权限："+f.setReadable(true, false));
	}
}
