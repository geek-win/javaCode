/*
 * 递归求和
 * */
class GetSum
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		sop(getSum(3));
	}

	//获取1到n的和
	public static int getSum(int n)
	{
		if(n == 1)
			return 1;

		return n+getSum(n-1);

	}
}

