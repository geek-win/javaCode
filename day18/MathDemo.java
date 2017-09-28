/*
 * Math类
 * java.lang
 * 1、约数
 * static double ceil(double a)//返回大于a的最小整数
 * static double floor(double a)//返回小于a的最大整数
 * sataic long round(double a)//double变量转成long，四舍五入
 * static int round(float a)//float变量转成int，四舍五入
 * 2、数学函数
 * 1）三角函数
 * static double sin(double a)//sin(a)
 * static double cos(double a)//cos(a)
 * static double tan(double a)//tan(a)
 * 2）对数
 * static double log(double a)//ln(a)
 * static double log10(double a)//log10(a)
 * 3）幂次方
 * static double exp(double a)//e的a次幂
 * static double pow(double a, double b)//a的b次幂
 * 3、随机值
 * static double random()//返回0.0-1.0之间的随机值
 * 4、求最值
 * 1）最小值
 * static double/float/int/long min(double/float/int/long a, double/float/int/long b)//返回a和b的最小值
 * 2）最大值
 * static double/float/int/long max(double/float/int/long a, double/float/int/long b)//返回a和b的最大值
 *
 * */
import java.util.*;

class MathDemo
{
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}

	public static void main(String[] args)
	{
		//1、约数
		sop("2.34ceil:"+Math.ceil(2.34));
		sop("-2.34ceil:"+Math.ceil(-2.34));
		sop("2.34floor:"+Math.floor(2.34));
		sop("-2.34floor:"+Math.floor(-2.34));
		sop("2.34round:"+Math.round(2.34));
		sop("-2.34round:"+Math.round(-2.34));
		sop("2.54round:"+Math.round(2.54));
		sop("-2.54round:"+Math.round(-2.54));

		//数学方法
		//三角函数
		sop("sin(0) = "+Math.sin(0));
		sop("cos(pi) = "+Math.cos(Math.PI));
		sop("tan(1/4pi)) = "+Math.tan(1/4*Math.PI));

		//指数对数次幂
		sop("exp(0) = "+Math.exp(0));
		sop("ln(e) = "+Math.log(Math.E));
		sop("log10(10) = "+Math.log10(10));
		sop("pow(2, 4) = "+Math.pow(2, 4));

		//求最值
		sop("max(3.5, 3) = "+Math.max(3.5, 3));
		sop("min(3.2, 0) = "+Math.min(3.2, 0));

		//求随机值
		for(int i = 0; i < 10; i++)
			sop("第"+(i+1)+"个随机值："+(int)(Math.random()*6+1));

		//求随机值
		Random r = new Random();
		for(int x = 0; x < 10; x++)
		{
			int d = r.nextInt(10)+1;//返回0-10的整数
			sop(d);
		}
		
		sop(1+3);

		sop("----------------[1-9]-----------------------");
		for(int i = 0; i < 10; i++)
		{
			sop((int)(Math.random()*9+1));
		}
		sop("----------------[1-9]-----------------------");
		for(int i = 0; i < 10; i++)
		{
			sop(r.nextInt(9)+1);
		}

	}
}
