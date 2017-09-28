/*
 * 复习InetAddress的方法
 * InetAddress是IP地址对象
 * 其中可以获取本地主机的IP地址和主机名
 * 获取任意主机的IP地址和主机名
 * */
import java.net.*;

class InetAddressDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)throws Exception
	{
		//获取本地主机IP地址和名称
		InetAddress i1 = InetAddress.getLocalHost();
		String name1 = i1.getHostName();
		String ip1 = i1.getHostAddress();
		sop("本地IP地址："+ip1+", 主机名："+name1);

		//获取任意主机IP地址和名称
		InetAddress i2 = InetAddress.getByName("sep.ucas.ac.cn");
		String name2 = i2.getHostName();
		String ip2 = i2.getHostAddress();
		sop("国科大IP地址："+ip2+", 主机名："+name2);

		//获取国科大所有的主机的IP地址和主机名
		InetAddress[] i3 = InetAddress.getAllByName("sep.ucas.ac.cn");
		for(InetAddress ele : i3)
			sop(ele.getHostName()+"-----"+ele.getHostAddress());

		//通过IP地址获取主机的IP地址对象
		//进而获取该主机的IP地址和名称
		//创建IP地址的byte数组
		byte[] addr = {
			127, 0, 1, 1
		};
		InetAddress i4 = InetAddress.getByAddress(addr);
		String name4 = i4.getHostName();
		String ip4 = i4.getHostAddress();
		sop("127.0.1.1主机名："+name4+", IP地址："+ip4);


	}

}
