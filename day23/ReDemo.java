/*
 * UDP协议传输
 * 发送端
 * 1、创建udpsocket服务，作为发送端
 * 2、确定要发送的数据，并封装成数据报包
 * 3、通过socket服务将数据报包发送到指定IP和端口的目的主机
 * 4、关闭资源
 * 接收端
 * 1、创建udpsocket服务，作为接收端
 * 2、创建缓冲区，并封装成数据报包，用来接收收到的数据包
 * 3、通过socket服务接收数据存到2中的数据报包中
 * 4、通过数据报包的方法获取不同的信息
 * 5、关闭资源
 * */
import java.net.*;

//发送端
//独立的应用程序，需要有main函数
class US
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)throws Exception
	{
		//创建udpsocket服务，作为发送端
		DatagramSocket ds = new DatagramSocket(6666);

		//确定要发送的数据并封装成数据报包
		byte[] buf = "hello, world".getBytes();
		DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(), 20000);

		//通过socket的send方法将数据报包发送到目的主机
		ds.send(dp);

		//关闭资源
		ds.close();
	}
}

//接收端
//独立的应用程序，需要有main函数
class UR
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)throws Exception
	{
		//创建udpsocket服务，作为接收端
		DatagramSocket ds = new DatagramSocket(20000);

		//while循环可以一直创建缓冲区和数据报包
		//用来一直接收对方发来的数据
		while(true)
		{

			//创建缓冲区并封装成数据报包
			//用来存储接收的数据包
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);//用来接收buf.length长度的数据包

			//通过socket服务的receive方法将接收的数据存到dp中
			ds.receive(dp);

			//通过数据报包的方法获取各信息
			String ip = dp.getAddress().getHostAddress();
			int port = dp.getPort();
			String data = new String(dp.getData(), 0, dp.getLength());

			sop("ip = "+ip);
			sop("port = "+port);
			sop("data = "+data);
		}
		//关闭资源
		//ds.close();
	}
}
