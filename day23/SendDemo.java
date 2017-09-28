/*
 * 使用UDP传输协议发送数据报包
 * 步骤：
 * 1、创建udpsocket服务，也就是创建DatagramSocket对象，相当于港口
 * 2、确定要发送的数据，并且封装成数据报包
 * 3、通过udpsocket服务的send方法将数据报包发送出去
 * 4、关闭资源
 * */
import java.net.*;

class SendDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void getIp()throws Exception
	{
		//获取IP地址对象
		//1、获取本机IP地址对象
		InetAddress i1 = InetAddress.getLocalHost();
		String name1 = i1.getHostName();
		String addr1 = i1.getHostAddress();
		sop("本地主机名称："+name1+", 本地主机IP地址："+addr1);

		//2、获取任意主机的IP地址和主机名
		InetAddress i2 = InetAddress.getByName("www.baidu.com");
		String name2 = i2.getHostName();
		String addr2 = i2.getHostAddress();
		sop("百度的主机名："+name2+", 百度的IP地址："+addr2);

		//3、获取百度主机的所有IP地址和主机名
		InetAddress[] i3 = InetAddress.getAllByName("www.baidu.com");
		for(InetAddress ele : i3)
			sop(ele.getHostName()+"---"+ele.getHostAddress());

		//4、根据指定的IP地址获取其对应的主机的IP地址和主机名
		byte[] addr3 = {
			10,10,19,19
		};
		InetAddress i4 = InetAddress.getByAddress(addr3);
		String name4 = i4.getHostName();
		String addr4 = i4.getHostAddress();
		sop("通过IP地址找到10.10.19.19对应的主机名："+name4+", 主机IP地址："+addr4);
	}

	//UDP传输数据报包
	public static void udpSend()throws Exception
	{
		//1、创建udpsocket服务对象，作为发送和接收数据报包的端点
		DatagramSocket ds = new DatagramSocket();

		//2、确定要发送的数据，并封装成数据报包
		//发送的是byte[]
		//数据报包是DatagramPacket对象
		//创建数据报包的方式是其构造函数
		//既能封装数据报包，又能作为发送的内容
		//DatagramPacket(byte[] buf, int length, InetAddress address, int port)
		//将byte数组buf中的length长度的内容发送到IP地址为address，端口为port的目的主机上
		byte[] buf = "hello, world".getBytes();

		DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.1.1"), 10000);

		//3、通过udpsocket服务的send方法将数据报包发送出去
		ds.send(dp);

		//4、关闭资源
		ds.close();

	}

	public static void main(String[] args)throws Exception
	{
		getIp();
		udpSend();

	}
}
