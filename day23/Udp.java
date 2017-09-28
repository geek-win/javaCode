import java.net.*;

//发送端
class UdpSend
{
	public static void main(String[] args)throws Exception
	{
		//创建socket服务,作为发送端点
		DatagramSocket ds = new DatagramSocket(8888);

		//确定要发送的数据并封装成数据报包
		byte[] buf = "hello, java && hello, world!".getBytes();
		DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getLocalHost(), 10000);

		//通过socket服务发送数据报包
		ds.send(dp);

		//关闭资源
		ds.close();
	}
}

//接收端
/*
 * 需求：
 * 定义一个应用程序，用于接收udp协议传输的数据并处理
 * 思路：
 * 1、定义udpsocket服务，作为接收端点
 * 2、创建数据包缓冲区，将接收到的信息存储到数据包中
 * 3、通过服务的receive功能接收数据并存储到数据包中
 * 4、通过数据报包的各种功能获取接收信息中的具体信息
 * 5、关闭资源
 * */
class UdpRece
{
	public static void main(String[] args)throws Exception
	{
		//1、创建udpsocket服务，作为接收端
		//定义了这个socket服务
		//并且端口号是10000
		//如果有人发送数据到本地的10000端口
		//那么就可以收到
		DatagramSocket ds = new DatagramSocket(10000);

		//2、创建数据报包，用于存储接收到的数据
		//创建数据报包，用来接收长度为，buf.length的数据包
		//然后利用数据报包中的特有功能将各个信息打印出来
		byte[] buf = new byte[1024];
		DatagramPacket dp = new DatagramPacket(buf, buf.length);

		//3、通过服务的receive方法接收数据并存到dp中
		//有一个阻塞式方法
		//如果没数据，就等wait
		//当发过来数据的时候会继续notity
		ds.receive(dp);

		//4、获取各个数据
		String addr = dp.getAddress().getHostAddress();
		int port = dp.getPort();
		String data = new String(dp.getData(), 0, dp.getLength());

		System.out.println("ip: "+addr+", port: "+port+"data: "+data);

		//5、关闭资源
		ds.close();

	}
}
