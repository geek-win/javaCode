/*
 * 模拟计算机主板运行
 * 使用接口的降低耦合性、扩展性、提供了规则
 * */
//定义接口
//任何一个接口都有开启和关闭两个功能
interface PCI
{
	public abstract void open();
	public abstract void close();
}

class MainBoard
{
	public void run()
	{
		System.out.println("mainboard run");
	}

	public void usePCI(PCI p)
	{
		if(p != null)
		{
			p.open();
			p.close();
		}
		else
			System.out.println("Please insert correct card.");
	}
}

class NetCard implements PCI
{
	public void open()
	{
		System.out.println("netcard open");
	}

	public void close()
	{
		System.out.println("netcard close");
	}
}

class VoiceCard implements PCI
{
	public void open()
	{
		System.out.println("voicecard open");
	}

	public void close()
	{
		System.out.println("voicecard close");
	}
}

class Computer
{
	public static void main(String[] args)
	{
		MainBoard mb = new MainBoard();
		mb.run();
		mb.usePCI(null);
		mb.usePCI(new NetCard());
		mb.usePCI(new VoiceCard());
	}
}
