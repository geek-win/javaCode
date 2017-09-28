/*
 * 数组的练习
 * */
class ArrayDemo
{
	//求数组中最大值
	public static int max(int[] arr)
	{
		int max = 0;

		for(int i = 0; i < arr.length; i++)
		{
			if(arr[max] < arr[i])
				max = i;
		}

		return arr[max];
	}

	//求数组中最小值
	public static int min(int[] arr)
	{
		int min = 0;

		for(int i = 0; i < arr.length; i++)
		{
			if(arr[min] > arr[i])
				min = i;
		}
		
		return arr[min];
	}

	//交换数组中两个元素位置
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	//冒泡法
	public static void bubbleSort(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++)
			for(int j = 0; j < arr.length - 1; j++)
				if(arr[j] > arr[j+1])
					swap(arr, j, j+1);
	}

	//选择排序法
	public static void selectSort(int[] arr)
	{
		//循环arr.length-1
		for(int i = 0; i < arr.length-1; i++)
			for(int j = i+1; j < arr.length; j++)
				if(arr[i] > arr[j])
					swap(arr, i, j);
	}

	//查找某个元素角标
	public static int search(int[] arr, int key)
	{
		for(int i = 0; i < arr.length; i++)
			if(arr[i] == key) 
				return i;

		return -1;
	}

	/*
	//二分查找
	public static void halfSearch(int[] arr, int key)
	{
		int min = 0, max = arr.length-1;
		int mid = 0;

		while(min <= max)
		{
			mid = (min+max)/2;

			if(arr[mid] == key)
			{
				sop(key+"角标为："+mid);
				break;
			}
			else if(arr[mid] > key)
				max = mid - 1;
			else if(arr[mid] < key)
				min = mid + 1;
		}

		sop(key+"不在");
	}
	*/
	
	//二分查找
	public static int halfSearch(int[] arr, int key)
	{
		int min = 0, max = arr.length - 1;

		while(min <= max)
		{
			int mid = (min+max)/2;

			if(arr[mid] == key) 
				return mid;
			else if(arr[mid] < key)
				min = mid+1;
			else
				max = mid-1;
		}

		return -1;
	}
	

	//输出数组元素
	public static void printArr(int[] arr)
	{
		for(int i = 0; i < arr.length; i++)
			sop("arr["+i+"] = "+arr[i]);
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		int[] arr = {
			2, 31, 32, 0, -10, 23, 20
		};

		sop("数组arr元素为：");
		printArr(arr);

		if(search(arr, -10) == -1)
			sop("-10不在");
		else
			sop("-10在："+search(arr, -10));
		
		sop("数组arr最大值为"+max(arr)+"，最小值为"+min(arr));
		/*
		bubbleSort(arr);
		sop("数组冒泡排序，从小到大");
		*/
		selectSort(arr);
		sop("数组比较排序法");
		printArr(arr);

		if(halfSearch(arr, 3) == -1)
			sop("3不在");
		else
			sop("3在角标: "+halfSearch(arr, 3));

	}
}
