/*
 * 获取字符串中各个字母的个数
 * 注意，有映射关系时，可以选择map集合，因为map集合中，存放的就是映射关系
 * 当数据之间存在映射关系时，就要想到map集合
 * 因为打印的时候字母有顺序，所以存到TreeMap集合中
 * */
import java.util.*;

class StrNum
{
	//简化输出函数
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	//统计字符串中各个字符出现的个数
	public static String strNum(String s)
	{
		//将字符串转换成字符数组
		char[] ch = s.toCharArray();

		//创建map集合
		//用来存储字符和个数的映射关系
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

		//遍历字符数组
		for(int i = 0; i < ch.length; i++)
		{
			//如果tm不包含字符ch[i]
			//那么就添加ch[i]和1
			if(!tm.containsKey(ch[i]))
				tm.put(ch[i], 1);
			else
			{
				tm.put(ch[i], tm.get(ch[i])+1);
			}
		}

		StringBuilder sb = new StringBuilder();
		//按照特定格式输出字符和对应个数之间的关系
		Set<Map.Entry<Character, Integer>> entrySet = tm.entrySet();
		for(Iterator<Map.Entry<Character, Integer>> it = entrySet.iterator(); it.hasNext();)
		{
			Map.Entry<Character, Integer> me = it.next();

			Character c = me.getKey();
			Integer n = me.getValue();

			sb.append(c+"("+n+")");
		}
		return sb.toString();
	}

	public static void main(String[] args)
	{
		String s = "aaavvbbbbdddd";

		sop(strNum(s));
	}
}

