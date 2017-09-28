/*
 * 可以给循环结构加上标号
 * */
class OtherDemo
{
	public static void main(String[] args)
	{
w:for(int x = 0; x < 3; x++)
  {
q: for(int y = 0; y < 4; y++)
   {
	   if(y == 2)
		   break w;

	   System.out.println("haha");
   }
  }
	}
}
