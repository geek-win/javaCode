import java.util.*;

class SumDemo1
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static int[] twoSum(int[] numbers, int target)
	{
		int[] no = new int[2];

		/*
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>(new Comparator<String>(){
			public int compare(String s1, String s2)
			{
				return 1;
			}
		});
		*/
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();

		for(int i = 0; i < numbers.length; i++)
		{
			tm.put(""+numbers[i], i+1);
		}

		sop(tm);
		for(Iterator<String> it = tm.keySet().iterator(); it.hasNext();)
		{
			String s = it.next();
			Integer v = tm.get(s);
			sop(s+"---"+v);
		}
		return null;
	}
	public static void main(String[] args)
	{
		int[] numbers = {
			2, 7, 11, 15
		};

		sop(twoSum(numbers, 9));
	}
}
