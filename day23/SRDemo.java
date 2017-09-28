/*
 * udp传输协议下的数据报包的发送与接收
 * 发送端和接收端都是独立的应用程序，所以二者应该有自己的main函数
 * 发送端和接收端可以定义在一个java文件中，也可以分到不同的java文件中
 * 运行时，必须要先开启接收端，因为如果先开发送端的话，接收端没有开启，数据包就被丢弃，接收端无法收到
 * 端口也需要进行定义，因为发送端发送数据包时需要定义port端口，接收端的port和数据包的port匹配时，才能接收到
 * port是在socket的创建时定义的，或者由系统随机分配。
 * 发送端
 * 1、创建udpsocket服务，作为发送端，可以自定义端口号
 * 2、确定要发送的数据内容，并封装成数据报包
 * byte[] buf = "string".getBytes();
 * DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress address, int port)
 * 3、通过socket服务的send方法，将数据包发送到目的主机的目的端口
 * ds.send(dp);
 * 4、关闭资源
 * 接收端
 * 1、创建udpsocket服务，作为接收端，自定义端口号
 * 2、创建缓冲区，并封装成数据报包，作为存储接收数据的数据报包
 * byte[] buf = new byte[1024];
 * DatagramPacket dp = new DatagramPacket(buf, buf.length);//可以接收长度为buf.length的数据包
 * 3、通过socket服务的receive方法接收数据包并存到指定数据报包中
 * ds.receive(dp);//将ds接收到的数据存到dp中
 * 4、通过数据报包的特定方法获取接收数据包中的有用信息，比如源IP地址、源端口、实体数据等
 * 5、关闭资源
 * */
import java.net.*;

//发送端
//定义端口号是8888
class UdpS
{
	public static void main(String[] args)throws Exception
	{
		//创建udpsocket服务，自定义端口号8888
		DatagramSocket ds = new DatagramSocket(8888);

		//确定要发送的数据并封装成数据报包
		byte[] buf = "Where are you?".getBytes();
		DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(), 10000);

		//通过socket服务的send方法发送数据包
		ds.send(dp);

		//关闭资源
		ds.close();
	}
}

//接收端
//定义接收端的端口号是10000
class UdpR
{
	public static void main(String[] args)throws Exception
	{
		//创建udpsocket服务，作为接收端
		DatagramSocket ds = new DatagramSocket(10000);

		//创建缓冲区，并封装成数据报包，用于接收收到的数据包
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);

		//通过socket服务的receive方法将接收到的数据包存到dp中
		ds.receive(dp);

		//通过数据报包的方法获取信息
		String ip = dp.getAddress().getHostAddress();
		int port = dp.getPort();
		String data = new String(dp.getData(), 0, dp.getLength());

		System.out.println("接收到的信息为:");
		System.out.println("ip = "+ip+"  port = "+port+"  message = "+data);
	}
}
