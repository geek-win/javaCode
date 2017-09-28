/*
 * 折半查找
 * 可以根据折半查找来找到插入元素的位置
 * */
import java.util.*;
class HalfSearch
{
	public static void main(String[] args)
	{
		int[] arr = {-1, 13, 23, 2, 34, -22, 10, 7};
		int[] a1 = {
			2, 2, 3, 4, 10, -20, 2
		};
		Arrays.sort(a1);
		System.out.print("a1: ");
		printArray(a1);

		System.out.print("arr: ");
		printArray(arr);
		System.out.print("排序之后：");
		printArray(bubbleSort(arr));

		/*
		if(halfSearch(arr, 100) != -1)
			System.out.println("数组中含有100");
		else
			System.out.println("数组中没有元素100");
		*/
		//System.out.println("100应该位于"+halfSearch(arr, 100)+"处");
		halfSearch(arr, 10);

		System.out.println("2应该位于数组中位置的角标为"+getIndex(arr, 2));

	}

	//折半查找
	public static void halfSearch(int[] arr, int key)
	{
		int min = 0, max = arr.length - 1, mid = (min + max) / 2;
		
		while(min <= max)
		{
			mid = (min + max) / 2;

			if(arr[mid] == key)
				break;
			else if(arr[mid] > key)
				max = mid - 1;
			else
				min = mid + 1;
		}

		if(min > max)
			System.out.println(key+"应该在角标为"+min+"的位置上");
		else
			System.out.println(key+"在数组中，角标为"+mid);
	}

	//选择排序
	public static int[] selectSort(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++)
			for(int j = i + 1; j < arr.length; j++)
				if(arr[i] > arr[j])
					swap(arr, i, j);

		return arr;
	}
	
	//冒泡排序
	public static int[] bubbleSort(int[] arr)
	{
		for(int i = 0; i < arr.length - 1; i++)
			for(int j = 0; j < arr.length - 1 -i; j++)
				if(arr[j] > arr[j+1])
					swap(arr, j, j+1);

		return arr;
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

	//交换两元素
	public static void swap(int[] arr, int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	//获取某个元素在数组中的角标或者应该插入那个角标处
	public static int getIndex(int[] arr, int key)
	{
		int min = 0, max = arr.length - 1, mid;

		while(min <= max)
		{
			mid = (min + max) / 2;
			if(arr[mid] == key)
				return mid;
			else if(arr[mid] > key)
				max = mid - 1;
			else
				min = mid + 1;
		}

		return min;
	}
}
