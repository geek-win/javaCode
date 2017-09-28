/*
 * 一个学校有两个班级
 * 每个班级有若干学生
 * 学校可以用看成是一个大的map集合
 * 每个班级是一个键
 * 每个键对应一个班级
 * 班级是一个map集合
 * */
import java.util.*;

class SchoolDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		//创建班级
		HashMap<String, String> hm1 = new HashMap<String, String>();
		HashMap<String, String> hm2 = new HashMap<String, String>();

		//创建学校
		HashMap<String, HashMap<String, String>> hm = new HashMap<String, HashMap<String,String>>();

		//将学校添加班级
		hm.put("yure", hm1);
		hm.put("jiuye", hm2);

		//班级添加学生
		hm1.put("01", "zhangsan01");
		hm1.put("02", "zhangsan02");
		hm1.put("03", "zhangsan03");
		hm1.put("04", "zhangsan04");
		hm2.put("01", "zhangsan01");
		hm2.put("02", "zhangsan02");
		hm2.put("03", "zhangsan03");
		hm2.put("04", "zhangsan04");

		//输出所有学生的信息
		for(Iterator<String> it = hm.keySet().iterator(); it.hasNext();)
		{
			String className = it.next();
			HashMap<String, String> room = hm.get(className);

			/*
			sop(className);
			for(Iterator<String> it1 = room.keySet().iterator(); it1.hasNext();)
			{
				String no = it1.next();
				String name = room.get(no);

				sop(no+"==="+name);
			}
			*/

			sop(className);
			getInfoStu(room);
		}
	}

	public static void getInfoStu(HashMap<String, String> hm)
	{
		for(Iterator<String> it = hm.keySet().iterator(); it.hasNext();)
		{
			String key = it.next();
			String value = hm.get(key);

			sop("---"+key+"----"+value);
		}
	}
}
