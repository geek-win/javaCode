/*
 * 数组练习
 * */
class ArrayDemo
{
	public static void main(String[] args)
	{
		//new会产生容器实体，new是产生对象
		//需求：定义一个长度3的整数数组
		int[] x = new int[3];
		for(int i = 0; i < 3; i++)
			System.out.println("x["+i+"] = "+x[i]);

		for(int i = 0; i < 3; i++)
			x[i] = i;

		for(int i = 0; i < 3; i++)
			System.out.println("x["+i+"] = "+x[i]);
	}
}
