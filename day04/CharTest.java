/*
 * 对char数组的默认值进行输出
 * */
class CharTest
{
	public static void main(String[] args)
	{
		char[] ch = new char[3];

		for(int i = 0; i < ch.length; i++)
			System.out.print(ch[i]+"*");

		System.out.println();
	}
}
