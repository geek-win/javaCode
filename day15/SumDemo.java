/*
 * 有整数数组
 * 求和为固定值的两个元素的角标
 * */
import java.util.*;

class SumDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static int[] twoSum(int[] numbers, int target)
	{
		int[] no = new int[2];

		//将整型数组存到TreeMap集合中
		//key是数组中的各个值
		//value是值对应的角标
		//但是要保证每个值都能存进去
		//因为TreeMap会对键进行排序
		//相同的键会被替换
		//所以我们需要传入比较器
		//使得按照我们添加的顺序进行存储
		//所以比较器中的compare方法返回1即可
		TreeMap<Integer, Integer> tm = new TreeMap<Integer, Integer>();

		for(int i = 0; i < numbers.length; i++)
		{
			//存储的时候角标+1
			tm.put(numbers[i], i+1);
		}

		//遍历TreeMap集合的键
		//对每个键进行判断
		//看是否有和为目标值的值
		for(Iterator<Integer> it = tm.keySet().iterator(); it.hasNext();)
		{
			//键
			Integer key = it.next();

			if(tm.containsKey(target - key))
			{
				//说明有满足的值
				no[0] = tm.get(key);
				no[1] = tm.get(target - key);
		
				return no;
			}
		}

		return null;
	}

	public static void main(String[] args)
	{
		int[] numbers = {
			2, 7, 11, 15
		};

		int[] num = twoSum(numbers, 9);
		for(int i = 0; i < num.length; i++)
			sop(num[i]);
	}
}
