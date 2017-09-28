/*
 * 旋转字符串
 * rotateString(char[] str, int offset)
 * 输入字符数组，根据偏移量，输出相应的结果
 * */
import java.util.*;

class XS
{
	public static void sop(Object obj)
	{
		System.out.print(obj);
	}

	public static void rotateString(char[] str, int offset)
	{
		//将字符数组转换成集合
		LinkedList<Character> link = new LinkedList<Character>();

		for(int i = 0; i < str.length; i++)
			link.addLast(str[i]);

		if(str.length > 0)
		{
			for(int i = 0; i < offset; i++)
				link.addFirst(link.removeLast());
			for(int i = 0; i < link.size(); i++)
				sop(link.get(i));
		}
	}

	public static void main(String[] args)
	{
		char[] str = {
		};
		rotateString(str, 3);
	}
}
