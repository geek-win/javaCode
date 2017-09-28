/*
 * 测试代码
 *
 */
class Fu
{
	int num = 4;
}

class Zi extends Fu
{
	int num = 5;

	public static void main(String[] args)
	{
		Fu f = new Zi();
		System.out.println(f.num);
	}
}


