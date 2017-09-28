/*
 * 静态的应用-工具类
 * 如果多个类中都定义某个函数
 * 就可以把这些函数定义到类中，也就是定义到对象中
 * 因为这些类的对象都具备这些函数功能
 * 可以定义一个工具类
 * 其中含有很多函数功能
 * 直接调用类的函数功能即可
 * 每个应用程序都有共性的功能，可以将这些功能进行抽取，独立封装，以便复用
 * */
/**
 此类是数组的功能函数，包括输出函数、排序、查找等功能
 @author ZhouShuang
 @version V1.1
 */
//public才可以写
public class ArrayTool
{
	/**
	 * 空参数构造函数
	 */
	private ArrayTool(){

	}
	//求数组的最大值
	/**
	 获取数组最大值
	 @param arr 接受一个int类型的数组
	 @return 会返回一个该数组的最大值
	 */
	public static int getMax(int[] arr)
	{
		int max = 0;
		for(int x = 1; x < arr.length; x++)
			if(arr[x] > arr[max])
				max = x;

		return arr[max];
	}

	//求数组的最小值
	/**
	 * 获取数组最小值
	 * @param arr 接收一个int类型的数组
	 * @return 会返回一个该数组的最小值
	 */
	public static int getMin(int[] arr)
	{
		int min = 0;

		for(int x = 1; x < arr.length; x++)
			if(arr[x] < arr[min])
				min = x;

		return arr[min];
	}

	//冒泡排序
	/**
	 * 冒泡排序法，进行从小到大排序
	 * @param arr 接收一个int类型数组
	 * @return 返回一个排好序的int类型数组
	 */
	public static int[] bubbleSort(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++)
			for(int j = 0; j < arr.length - 1 - i; j++)
				if(arr[j] > arr[j+1])
					swap(arr, j ,j+1);

		return arr;
	}

	//选择排序
	/**
	 * 选择排序法，对数组进行从小到大排序
	 * @param arr 接收一个int类型数组
	 * @return 返回一个排好序的int类型数组
	 */
	public static int[] selectSort(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++)
			for(int j = i+1; j < arr.length; j++)
				if(arr[i] > arr[j])
					swap(arr, i, j);

		return arr;
	}

	//求给定数值在数组中的角标或者应该放置的角标
	/**
	 * 在数组中查找给定数组，如果有就输出角标，没有就输出其应放置的位置角标
	 * @param arr 接受一个int类型数组
	 * @param key 接收待查找的值
	 */
	public static void getIndex(int[] arr, int key)
	{
		int min = 0, max = arr.length - 1, mid = (min + max ) / 2;

		while(min <= max)
		{
			mid = (max + min) / 2;

			if(key == arr[mid])
				break;
			else if(key < arr[mid])
				max = mid - 1;
			else
				min = mid + 1;
		}

		if(min > max)
			System.out.println("数组中没有"+key+"，应放置在角标"+min+"处");
		else
			System.out.println("数组中有"+key+"，角标为"+mid);
	}

	//交换数组中的元素
	/**
	 * 交换数组中的元素值
	 * @param arr 接收一个int类型数组
	 * @param i 接收待交换的数组角标
	 * @param j 接收待交换的数组角标
	 */
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	//输出数组中的元素
	/**
	 * 输出数组中的元素值，打印形式是:{[0] = element1, [1] = element2... }
	 * @param arr 接收一个int类型数组
	 */
	public static void printArray(int[] arr)
	{
		System.out.print("{");

		for(int i = 0; i < arr.length; i++)
			if(i != arr.length - 1)
				System.out.print("["+i+"] = "+arr[i]+", ");
			else 
				System.out.println("["+i+"] = "+arr[i]+"}");

		System.out.println();
	}
}


