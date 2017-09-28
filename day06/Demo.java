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
class ArrayToolDemo
{
	public static void main(String[] args)
	{
		int[] arr = {1, 5, 2, 3, 10};

		/*
		ArrayTool at = new ArrayTool();

		at.printArray(arr);
		at.printArray(at.bubbleSort(arr));
		*/
		ArrayTool.printArray(arr);
		System.out.println("max = "+ArrayTool.getMax(arr));
		System.out.println("min = "+ArrayTool.getMin(arr));

		ArrayTool.printArray(ArrayTool.selectSort(arr));
		ArrayTool.getIndex(arr, 4);

	}
}
