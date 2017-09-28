/*
 * 电脑运行实例
 * */
class MainBoard
{
	public void run()
	{
		System.out.println("mainboard run");
	}

	public void userCard(PCI p)
	{
		if(!(p == null))
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
		System.out.println("netacard close");
	}
}

class SoundCard implements PCI
{
	public void open()
	{
		System.out.println("soundcard open");
	}
	public void close()
	{
		System.out.println("soundcard close");
	}
}

class D5
{
	public static void main(String[] args)
	{
		MainBoard mb = new MainBoard();
		mb.run();
		mb.userCard(new NetCard());
		mb.userCard(new SoundCard());
	}

}
