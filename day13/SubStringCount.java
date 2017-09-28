/*
 * 获取一个字符串在另一个字符串中出现的次数
 * */
class SubStringCount
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	//获取一个字符串在另一个字符串中出现的次数
	public static int getSubCount(String str, String key)
	{
		//个数计数器
		int count = 0;

		//记录字符串出现位置的变量
		int index;

		//记录查找偏移位
		int offset = 0;

		while((index = str.indexOf(key, offset)) != -1)
		{
			sop(index);
			count++;

			offset = index + key.length();
		}

		return count;
	}

	public static void main(String[] args)
	{
		String str = "kkabckkabckk";
		String key = "kk";

		sop("str = "+str);
		sop("key = "+key);
		sop("str中包括key个数为："+getSubCount(str, key));
	}
}
