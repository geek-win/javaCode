/*
 * 将字符串中的各个单词反转
 * 这个编程题是将字符串中的各个单词原地反转
 * */
import java.util.*;

class WordReverse
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	//将传入的字符串中的单词进行反转返回
	public static String reverseWord(String s)
	{
		//创建StringBuilder缓冲区用于存储字符串
		StringBuilder sb = new StringBuilder();

		//遍历字符串
		//如果是空格就直接添加到缓冲区中
		//如果不是空格，创建临时缓冲区
		//继续向后遍历，将当前单词存储到临时缓冲区中
		//注意判断是否角标越界
		//将存储好单词的缓冲区反转
		//存储到大的缓冲区中
		//将缓冲区转成字符串返回
		for(int i = 0; i < s.length();)
		{
			char ch = s.charAt(i);

			if(ch == ' ')
			{
				sb.append(' ');
				i++;
			}
			else
			{
				StringBuilder tempsb = new StringBuilder();
				tempsb.append(ch);

				char temp;
				while(i < s.length()-1 && (temp = s.charAt(++i)) != ' ')
					tempsb.append(temp);

				//跳出while循环有两种可能
				//1、i已经是最后一个角标了，那么这个时候可以直接返回sb
				//2、下一个是空格，这个时候需要继续循环
				//所以需要判断一下
				sb.append(tempsb.reverse());
				//如果i是最后一个了，那就直接返回即可
				if(i == s.length()-1)
					return sb.toString();
			}
		}

		return sb.toString();
	}

	public static void main(String[] args)
	{
		String s = "  abc abc abc   abc  asd  sd";
		sop("s.length = "+s.length());
		sop("s = ("+s+")");
		sop("处理后：s = ("+reverseWord(s)+")");

		String s1 = " I  am a    Student. ";
		sop("s1 = ("+s1+")");
		sop("翻转后：("+wordReverse(s1)+")");
	}

	//如果将输入的字符串中的各个单词反向输出
	//并且每个单词之间有一个空格
	//请实现这个功能
	//思路
	//创建ArrayList集合，用于存储字符串中的单词
	//遍历字符串
	//如果是空格就略过，如果不是空格就创建临时缓冲区，用于存储各个单词
	//当该添加的字符是最后一个字符或者下一个字符是空格
	//那么该临时缓冲区就是一个单词
	//存储进list集合即可
	//如果是因为已经到了最后一个字符
	//就遍历list集合
	//按照需求创建缓冲区，将单词倒序插入，包括空格，然后返回字符串
	//否则继续下次循环
	//最后如果是因为空格才跳出的
	//那就重复上述返回字符串的代码
	//创建缓冲区存放需要的字符串格式
	public static String wordReverse(String s)
	{
		//创建字符串集合
		//之前都是使用ArrayList
		//这次想尝试使用LinkedList
		//因为在存储的时候可以addFirst
		//方便最后倒序输出
		LinkedList<String> list = new LinkedList<String>();

		//遍历字符串
		//判断是否是空格
		for(int i = 0; i < s.length(); )
		{
			char ch = s.charAt(i);

			//如果是空格
			//那么就略过，继续向下判断各个字符
			if(ch == ' ')
				i++;
			else
			{
				//如果不是空格就创建一个新的临时缓冲区
				StringBuilder tempsb = new StringBuilder();
				tempsb.append(ch);

				char temp;
				while(i < s.length() - 1 && (temp = s.charAt(++i)) != ' ')
					tempsb.append(temp);

				//跳出while循环表示这个单词已经全部存储进缓冲区了
				list.addFirst(tempsb.toString());

				//如果已经是字符串的最后
				//那么就直接返回要求的字符串即可
				if(i == s.length() - 1)
				{
					StringBuilder sb = new StringBuilder();

					for(int x = 0; x < list.size()-1; x++)
						sb.append(list.get(x)+" ");

					sb.append(list.get(list.size()-1));

					return sb.toString();
				}

			}
		}

		StringBuilder sb1 = new StringBuilder();

		for(int x = 0; x < list.size()-1; x++)
			sb1.append(list.get(x)+" ");

		sb1.append(list.get(list.size()-1));

		return sb1.toString();
		
	}
}
