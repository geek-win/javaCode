/*
 * 给定一个数组和一个int类型的sum值
 * 查看数组中是否有和为sum的元素
 * 如果有就返回两个元素的角标
 * 如果没有就不返回
 * */
import java.util.*;

class SumDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static int[] twoSum(int[] nums, int sum)
	{
		//创建HashMap集合
		//存储nums数组中的元素和角标
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for(int i = 0; i < nums.length; i++)
			hm.put(nums[i], i);

		for(int i = 0; i <nums.length; i++)
		{
			int cha = sum - nums[i];

			if(hm.containsKey(cha) && hm.get(cha) != i)
			{
				return new int[]{i+1, hm.get(cha)+1};
			}
		}
		throw new RuntimeException("no such sum");
			
	}

	public static void main(String[] args)
	{
		int[] nums = {
			1,5, 2, 1, 4, 2
		};

		sop(Arrays.toString(twoSum(nums, 4)));
	}
}
