/*
 * 一个学校两个班
 * 每个班有很多学生
 * 所以整个学校可以看成是一个大的map集合
 * 每个班的名称就是键
 * 其对应的值就是每个班的学生映射关系，也是个map集合
 * */
import java.util.*;

class Test
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{

		//每个班的值都是一个map集合
		//现在创建
		TreeMap<String, String> tm1 = new TreeMap<String, String>();
		TreeMap<String, String> tm2 = new TreeMap<String, String>();

		//创建学校的大的map集合
		TreeMap<String, TreeMap<String, String>> tm = new TreeMap<String,TreeMap<String, String>>();
		
		//将班级添加到学校map中
		tm.put("yure", tm1);
		tm.put("jiuye", tm2);

		//添加学生信息到班级中
		tm1.put("01", "zhangsan");
		tm1.put("02", "lisi");
		tm1.put("03", "wangwu");

		tm2.put("04", "sszhangsan");
		tm2.put("05", "sslisi");
		tm2.put("06", "sswangwu");


		Set<String> keySet = tm.keySet();
		for(Iterator<String> it = keySet.iterator(); it.hasNext();)
		{
			String key = it.next();
			TreeMap<String, String> temp = tm.get(key);
			sop(key+"~~~~");
			for(Iterator<String> it1 = temp.keySet().iterator(); it1.hasNext();)
			{
				String name = it1.next();
				sop(name+"---"+temp.get(name));

			}
		}

		for(Iterator<String> it = tm.keySet().iterator(); it.hasNext();)
		{
			String key = it.next();
			getStuInfo(tm.get(key));
		}
		
		getStuInfo(tm1);
		getStuInfo(tm2);
	}

	//获取所有学生的信息
	public static void getStuInfo(TreeMap<String, String> roomMap)
	{
		for(Iterator<String> it = roomMap.keySet().iterator(); it.hasNext();)
		{
			String key = it.next();

			sop(key+"---"+roomMap.get(key));
		}
	}
}
