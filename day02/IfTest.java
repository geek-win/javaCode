/*
 *需求：根据用户定义的数值不同，打印相应的星期英文
 * */
class IfTest
{
	public static void main(String[] args)
	{
		int n = 6;

		switch(n)
		{
			case 1:
				System.out.println(n+": Monday");
				break;
			case 2:
				System.out.println(n+": Tuesday");
				break;
			case 3:
				System.out.println(n+": Wednesday");
				break;
			case 4:
				System.out.println(n+": Thursday");
				break;
			case 5:
				System.out.println(n+": Friday");
				break;
			case 6:
				System.out.println(n+": Staurday");
				break;
			case 7:
				System.out.println(n+": Sunday");
				break;
			default:
				System.out.println("Please in put correct number.");
				break;
		}

		//需求：根据月份输出对应的季节
		//345春季，678夏季，91011秋季，1212冬季
		int mon = 6;

		switch(mon)
		{
			case 3:
			case 4:
			case 5:
				   System.out.println(mon+"月是春季");
				   break;
			case 6:
			case 7:
			case 8:
				   System.out.println(mon+"月是夏季");
				   break;
			case 9:
			case 10:
			case 11:
				   System.out.println(mon+"月是秋季");
				   break;
			case 12:
			case 1:
			case 2:
					System.out.println(mon+"月是冬季");
					break;
			default:
					System.out.println("Please input correct month.");
					break;
		}

	}
}
