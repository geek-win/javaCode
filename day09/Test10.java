/*
 * 在字符串中查找某个字符，并返回其第一次出现的位置
 * */
public int getIndex(char[] chr, char key)
{
	if(chr == null)
		throw new IlleagleArgumentException("字符串为空");//任何异常都有信息描述，在构造函数的传入参数中

	for(int i = 0; i < chr.length; i++)
	{
		if(chr[i] == key)
			return i;
	}

	return -1;
		
}
