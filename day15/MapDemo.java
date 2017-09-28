/*
 * Map集合和Collection集合都是集合框架的顶层接口。
 * Map
 *	|--HashTable
 *		底层是哈希表数据结构，不可以存入null键和null值
 *		jdk1.0版本出现，线程同步，效率低
 *		用作键的值必须实现hashCode和equals方法
 *	|--HashMap
 *		底层是哈希表数据结构，可以存入null键和null值
 *		jdk1.2版本出现，线程不同步，效率高
 *	|--TreeMap
 *		底层是二叉树数据结构
 *		线程不同步
 *		可以用于给Map集合的键进行排序
 * 1、增
 *		put(K key, V value)
 * 2、删
 *		clear()从此映射中移除所有的映射关系
 *		V remove(Object key)，如果存在一个键的映射关系，就从此映射中移除
 * 3、判断
 *		boolean isEmpty()是否是空的
 *		boolean containsKey(Object key)是否包含键
 *		boolean containsValue(Object value)是否包含值
 * 4、获取
 *		V get(Object key)返回key对应的值，如果没有key，那么就返回null
 *		int size()返回此映射中的键-值对个数
 *		Collection<V> values()返回此映射中包含的值的Collection视图
 * */
import java.util.*;

class MapDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<String, String>();

		//添加元素
		map.put("01", "zhangsan1");
		map.put("02", "zhangsan2");
		map.put("03", "zhangsan3");
		map.put("04", "zhangsan4");
		map.put("05", "zhangsan5");
		map.put(null, "hahh");
		//如果同一个键
		//保留后面新的值
		//旧的值会被替换
		//并且put会返回该键对应的上次的值
		//如果之前没有就返回null
		sop("put: "+map.put("10", "LLLLLLL"));
		sop("put: "+map.put("10", "kkkkkk"));

		//输出map集合
		//格式为:{key1=value1, key2=value2, key3=value3, ..,..}
		sop(map);
		
		//判断是否包含某个键
		sop("containsKey(04): "+map.containsKey("04"));
		sop("containsKey(07): "+map.containsKey("07"));

		//判断是否包含某个值
		sop("containsValue(zhangsan): "+map.containsValue("zhangsan"));
		sop("containsValue(zhangsan4): "+map.containsValue("zhangsan4"));

		/*
		//删除
		sop("remove(java): "+map.remove("java"));
		sop("remove(04): "+map.remove("04"));
		sop("map = "+map);
		*/

		//获取
		//可以通过get的返回值来判断一个键是否存在
		sop("get(02): "+map.get("02"));
		sop("get(09): "+map.get("09"));
		sop("get(null): "+map.get(null));
		sop("get(10): "+map.get("10"));

		//获取map中所有的值
		Collection<String> al = map.values();
		sop("al = "+al);

		/*
		//获取map集合中所有的元素
		//1、Set<K> keySet()
		//		取出map集合中所有的键
		Set<String> keySet = map.keySet();
		//使用迭代器
		for(Iterator<String> it = keySet.iterator(); it.hasNext();)
		{
			String key = it.next();
			sop(key+"---"+map.get(key));
		}
		*/

		Set<String> keySet = map.keySet();
		for(Iterator<String> it = keySet.iterator(); it.hasNext();)
		{
			String key = it.next();
			sop(key+"----"+map.get(key));
		}
	}
}

