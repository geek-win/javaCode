/*
 * 数组
 * */
class ArrayDemo
{
	public static void main(String[] args)
	{
		//int[] arr = new int[5];
		//int arr[] = new int[5];
		//int[] arr = new int[]{2,4,6};
		//int[] arr = {2, 4, 5};数组值明确时采用这种定义方式
		int[] arr = new int[]{3, 4, 5};
		System.out.println("arr[0] = "+arr[0]);//获取角标0的元素
		System.out.println("arr[1] = "+arr[1]);
		System.out.println("arr[2] = "+arr[2]);
//		System.out.println(arr[4]);//ArrayIndexOutOfBoundsException,角标越界
		
		/*
		arr = null;
		System.out.println(arr[1]);//NullPointerException，空引用异常
		//编译时不会报错，因为还没产生数组，当没有指向数组实体，就不能有其元素值
		*/

	}
}
