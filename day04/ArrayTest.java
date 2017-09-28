/*
 * 给定一个数组：5 1 6 4 2 8 9
 * 比较大小，求其最大值&最小值
 * */
class ArrayTest
{
	public static void main(String[] args)
	{
		int[] arr = {5, 1, 6, 4, 2, 8, 9};

		boolean[] b = new boolean[3];
		System.out.println(b[2]);

		//输出数组的所有元素
		printArray(arr);

		//输出数组中的最大值
		System.out.println("数组最大值为："+getMax(arr));

		//输出数组中的最小值
		System.out.println("数组最小值为："+getMin(arr));

		double[] d = {1.2, 3.4, 2.2, 4.5, -1.2};
		//输出数组所有元素
		printArray(d);
		//输出数组最大元素
		System.out.println("数组最大值为："+getMax(d));
		//输出数组最小元素
		System.out.println("数组最小值为："+getMin(d));
	}

	//输出数组的所有元素
	public static void printArray(int[] arr)
	{
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

	//输出double类型数组的元素
	public static void printArray(double[] arr)
	{
		System.out.print("[");

		for(int i = 0; i < arr.length; i++)
		{
			if(i != arr.length - 1)
				System.out.print("["+i+"] ="+arr[i]+", ");
			else
				System.out.print("["+i+"] = "+arr[i]+"]");
		}

		System.out.println();
	}

	//求数组的最大值
	public static int getMax(int[] arr)
	{
		int max = arr[0]; 

		for(int i = 1; i < arr.length; i++)
			max = (arr[i] > max)? arr[i]: max;

		return max;
	}

	//求数组的最小值
	public static int getMin(int[] arr)
	{
		int min = arr[0];

		for(int i = 1; i < arr.length; i++)
			min = (arr[i] < min)? arr[i]: min;

		return min;
	}

	//获取double类型数组的最大值
	public static double getMax(double[] arr)
	{
		double max = arr[0];

		for(int i = 1; i < arr.length; i++)
			max = (arr[i] > max)? arr[i]: max;

		return max;
	}

	//获取double类型数组的最小值
	public static double getMin(double[] arr)
	{
		double min = arr[0];

		for(int i = 1; i < arr.length; i++)
			min = (arr[i] < min)? arr[i]: min;

		return min;
	}
}
