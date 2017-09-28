/*
 *使用switch语句进行季节的选择 
 *只要有一个匹配的case或者default，之后如果没有退出switch，那就继续向下执行
 *并且不需要判断case，直到break或者大括号
 * */
class SeasonDemo
{
	public static void main(String[] args)
	{
		int x = 4;

		switch(x)
		{
			case 3:
			case 4:
			case 5:
				System.out.println(x+"是春季");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(x+"是夏季");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(x+"是秋季");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println(x+"是冬季");
				break;
			default:
				System.out.println("Please input correct month");
		}
	}
}
