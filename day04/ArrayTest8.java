/*
 * 二维数组
 * */
class ArrayTest8
{
	public static void main(String[] args)
	{
		//定义二维数组
		int[][] arr = new int[3][];
		
		//输出默认值
		System.out.println("arr[3][]的地址"+arr);
		System.out.println("arr[0]的地址"+arr[0]);
		
		//arr数组的每个元素都是一个一维数组
		arr[0] = new int[]{1, 2, 3};
		arr[1] = new int[]{-2, 0, 20};
		arr[2] = new int[]{3, 2, -9};

		int[][] a = {{3, 2, 1}, {2, 2, 10, 7}, {5, 4}};
		int sum = 0;

		for(int i = 0; i < a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
				sum += a[i][j];
			}

			System.out.println();
		}

		System.out.println("和 = "+sum);
	}

	
}
