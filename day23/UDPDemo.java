import java.net.*;

/*
 * 需求：
 * 通过UDP协议传输方式，将一段文字数据发送出去。
 * 1、建立udpsocket服务，也就是发送端点，邮局
 * 2、提供数据并将数据封装到数据报包中
 * 3、通过socket服务的发送功能，将数据报包发送出去
 * 4、关闭资源
 * 都有可能出现异常，所以在调用者上需要声明异常
 * */
class UdpSend
{
	public static void main(String[] args)throws Exception
	{
		//1、创建udpsocket服务，通过DatagramSocket对象
		DatagramSocket ds = new DatagramSocket();

		//2、确定数据，并封装成数据报包
		//DatagramPacket(byte[] buf, int length, InetAddress address, int port)
		//address和port都是目的IP地址和目的端口
		//先写数据
		byte[] buf = "upd come".getBytes();
		DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.1.1"), 10000);

		//3、通过socket服务将封装好的数据报包发送出去
		//通过send方法
		ds.send(dp);

		//4、关闭资源
		ds.close();


	}
}
