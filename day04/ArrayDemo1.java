/*
 * 获取数组元素，创建子函数，要遍历，即需要使用循环
 * */
class ArrayDemo1
{
	public static void main(String[] args)
	{
		int[] arr = new int[]{2, 3, 5, 6};

		/*
		//arr.length表示数组的长度，下标比长度少1
		//输出元素
		for(int x = 0; x < arr.length; x++)
			System.out.println("arr["+x+"] = "+arr[x]);

		//求数组和
		int sum = 0;//数组和的原始值
		for(int x = 0; x < arr.length; x++)
			sum += arr[x];

		System.out.println("arr[]数组的和为："+sum);
		*/

		printArray(arr);
		System.out.println("数组和 = "+getSum(arr));

		//打印数组arr的地址
		System.out.println(arr);
	}

	//定义功能，打印数组元素，元素间用逗号隔开
	public static void printArray(int[] arr)
	{
		/*
		for(int i = 0; i < arr.length - 1; i++)
			System.out.print("arr["+i+"] = "+arr[i]+", ");

		System.out.print("arr["+(arr.length - 1)+"] = "+arr[arr.length - 1]);
		*/

		System.out.print("[");
		for(int i = 0; i < arr.length; i++)
		{
			if(i != arr.length - 1)
				System.out.print("arr["+i+"] = "+arr[i]+", ");
			else
				System.out.print("arr["+i+"] = "+arr[i]+"]");
		}
		System.out.println();
	}

	//定义功能，计算数组中所有数的和
	public static int getSum(int[] arr)
	{
		int sum = 0;

		for(int i = 0; i < arr.length; i++)
			sum += arr[i];

		return sum;
	}
}
