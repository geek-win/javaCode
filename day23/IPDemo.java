/*
 * InetAddress
 * */
import java.net.*;

class IPDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)throws Exception
	{
		//i就是本地主机名和IP地址
		InetAddress i = InetAddress.getLocalHost();
		sop("i = "+i.toString());
		sop(i);//和i.toString()输出结果相同

		String hostName = i.getHostName();//获取主机名
		String hostAddress = i.getHostAddress();//获取IP地址

		sop("主机名："+hostName);
		sop("IP地址："+hostAddress);
		
		//想获取任意一台主机的主机名和IP地址
		//需要调用static InetAddress getByName(String host)
		//获取指定主机的IP地址对象
		InetAddress i1 = InetAddress.getByName("192.168.254.130");
		sop("name = "+i1.getHostName());
		sop("address = "+i1.getHostAddress());

		//获取百度服务器的IP地址和名称
		//百度的主机不是一个，所以有很多主机
		//并且一个地址可以对应多个服务器
		//所以返回的IP地址对象不唯一
		//所以每次运行都不一样
		InetAddress baidui = InetAddress.getByName("baidu.com");
		sop("IP地址："+baidui.getHostAddress());
		sop("主机名："+baidui.getHostName());

		//因为百度有很多主机
		//所以通过getByName("www.baidu.com")返回的IP地址对象不唯一
		//可以使用getAllByName(String host)
		//返回InetAddress类型数组
		//就可以获取到该主机名称对应的所有的IP地址对象
		InetAddress[] arri = InetAddress.getAllByName("www.baidu.com");
		sop("len = "+arri.length);
		for(InetAddress ele: arri)
			sop(ele.getHostName()+"---"+ele.getHostAddress());

		sop("------------------------------------------------------");
		byte[] ad = {
			10,10,10,10
		};
		InetAddress i2 = InetAddress.getByAddress(ad);
		sop("byte: name = "+i2.getHostName());
		sop("byte: address = "+i2.getHostAddress());
	}
}
