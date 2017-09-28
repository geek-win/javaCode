/*
 * 统计字符串中各个字符的个数
 * 并以特定格式输出
 * */
import java.util.*;

class StrNum1
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static String strn(String s)
	{
		char[] ch = s.toCharArray();
	
		TreeMap<Character, Integer> tm = new TreeMap<Character, Integer>();

		int count = 0;
		for(int i = 0; i < ch.length; i++)
		{
			//如果字符串中有非字母
			//那么需要判断其ASCII码值
			//来减少比较次数
			/*
			if(!tm.containsKey(ch[i]))
				tm.put(ch[i], 1);
			else
				tm.put(ch[i], tm.get(ch[i])+1);
				*/
			/*
			Integer value = tm.get(ch[i]);
			if(value!=null)
			{
				tm.put(ch[i], value+1);
			}
			else
				tm.put(ch[i], 1);
				*/

			if(!(ch[i] >= 'a' && ch[i] <= 'z'|| ch[i]>='A'&& ch[i]<='Z'))
				continue;

			Integer value = tm.get(ch[i]);
			if(value != null)
				count = value;

			count++;
			tm.put(ch[i], count);

			count = 0;


		}

		StringBuilder sb = new StringBuilder();

		Set<Map.Entry<Character, Integer>> entrySet = tm.entrySet();
		for(Iterator<Map.Entry<Character, Integer>> it = entrySet.iterator(); it.hasNext();)
		{
			Map.Entry<Character, Integer> me = it.next();

			Character c = me.getKey();
			Integer i = me.getValue();

			sb.append(c+"("+i+")");
		}

		return sb.toString();
	}

	public static void main(String[] args)
	{
		String s = "a,.gas...gads..gfhadf";
		sop(strn(s));

	}
}
