/*
 * 对数组按照大小关系进行排序
 * */
class ArraySort
{
	public static void main(String[] args)
	{
		int[] a1 = {10, 3, 44, 2, 20, -10, -23};
		int[] a2 = {2, 30, 3, 45, 33, 4};

		//对a1数组进行处理
		System.out.print("a1:");
		printArray(a1);
		System.out.println("冒泡法排序：");
		printArray(bubbleSort(a1));

		//对a2数组进行处理
		System.out.print("a2:");
		printArray(a2);
		System.out.println("选择排序：");
		printArray(selectSort(a2));
		
	}

	//输出数组元素
	public static void printArray(int[] arr)
	{
		System.out.print("[");

		for(int i = 0; i < arr.length; i++)
		{
			if(i != arr.length - 1)
				System.out.print("["+i+"] = "+arr[i]+", ");
			else
				System.out.print("["+i+"] = "+arr[i]+"]");
		}

		System.out.println();
	}

	//冒泡法排序
	public static int[] bubbleSort(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++)
			for(int j = 0; j < arr.length - 1 - i; j++)
				if(arr[j] > arr[j + 1])
					swap(arr, j, j+1);

		return arr;
	}

	//选择排序法
	public static int[] selectSort(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++)
			for(int j = i + 1; j < arr.length; j++)
				if(arr[j] < arr[i])
					swap(arr, i, j);

		return arr;
	}

	//交换数组元素
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
