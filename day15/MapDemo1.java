/*
 * Map集合的练习
 * */
import java.util.*;

class MapDemo1
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		Map<String, String> m = new HashMap<String,String>();

		//添加元素
		sop(m.put("01", "zhangsan01"));
		sop(m.put("01", "zhangsan001"));
		sop(m.put("02", "zhangsan02"));
		sop(m.put("03", "zhangsan03"));
		sop(m.put("04", "zhangsan04"));

		sop("m = "+m);

		/*
		//删除
		sop(m.remove("01"));
		sop(m.remove("09"));
		m.clear();
		sop("clear: "+m);
		*/

		//判断
		sop("是否是空的："+m.isEmpty());
		sop("是否包含01键："+m.containsKey("01"));
		sop("是否包含zhangsan值："+m.containsValue("zhangsan"));

		//获取
		sop("获取键01的值："+m.get("01"));
		sop("获取09的值："+m.get("09"));

		//获取map集合所有的值
		//使用keySet()方法获取所有的键
		//然后使用Collection集合的迭代器获取所有的值
		Set<String> keySet = m.keySet();
		for(Iterator<String> it = keySet.iterator(); it.hasNext();)
		{
			String key = it.next();
			sop(key+"----"+m.get(key));
		}

		//使用entrySet方法取出所有的map集合元素
		//Set<Map.Entry<K,V>> entrySet()
		//将map集合中的映射关系存入到了set集合
		//而这个关系的数据类型就是Map.Entry
		//Entry是Map接口中的静态接口
		//其中有很多方法
		Set<Map.Entry<String,String>> entrySet = m.entrySet();
		for(Iterator<Map.Entry<String,String>> it = entrySet.iterator(); it.hasNext();)
		{
			Map.Entry<String,String> me = it.next();

			String key = me.getKey();
			String value = me.getValue();

			sop(key+"----------"+value);
		}

	}
}
