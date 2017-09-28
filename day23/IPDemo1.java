/*
 * 获取IP地址对象的几种方式
 * */
import java.net.*;

class IPDemo1
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)throws Exception
	{
		//获取本地主机的IP地址和主机名
		InetAddress i1 = InetAddress.getLocalHost();
		String name1 = i1.getHostName();
		String addr1 = i1.getHostAddress();
		sop("本地主机名 = "+name1+", 本地主机IP地址 = "+addr1);

		//获取百度主机的IP地址和主机名
		InetAddress i2 = InetAddress.getByName("www.baidu.com");
		String name2 = i2.getHostName();
		String addr2 = i2.getHostAddress();
		sop("百度主机名 = "+name2+", 百度主机IP地址 = "+addr2);

		//获取百度主机的IP地址对象组成的数组
		InetAddress[] i3 = InetAddress.getAllByName("www.baidu.com");
		sop("数组元素个数："+i3.length);
		for(InetAddress i : i3)
		{
			String name3 = i.getHostName();
			String addr3 = i.getHostAddress();

			sop("数组中主机名 = "+name3+", IP地址 = "+addr3);
		}

		//获取指定IP地址的主机的IP地址和主机名
		//创建IPv4地址组成的byte数组
		byte[] b = {
			127,0,1,1
		};
		InetAddress i4 = InetAddress.getByAddress(b);
		String name4 = i4.getHostName();
		String addr4 = i4.getHostAddress();
		sop("127.0.1.1的主机名 = "+name4+", IP地址 = "+addr4);

	}
}
