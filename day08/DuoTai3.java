/*
 * 需求：
 * 电脑运行实例
 * 电脑运行基于主板
 * */
class MainBoard
{
	public void run()
	{
		System.out.println("mainboard run");
	}

	/*
	public void useNetCard(NetCard c)
	{
		c.open();
		c.close();
	}
	*/

	public void useCard(PCI p)
	{
		if(p != null)
		{
			p.open();
			p.close();
		}
	}
}

interface PCI
{
	public abstract void open();
	public abstract void close();
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
		System.out.println("声卡开启");
	}

	public void close()
	{
		System.out.println("声卡关闭");
	}
}

class DuoTai3
{
	public static void main(String[] args)
	{
		MainBoard mb = new MainBoard();
		mb.useCard(new NetCard());
		mb.useCard(new VoiceCard());
		mb.useCard(null);
	}
}
