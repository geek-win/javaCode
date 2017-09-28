/*
 * 练习Properties和IO技术的结合
 * */
import java.io.*;
import java.util.*;

class PrD
{
	public static void runcode()throws IOException
	{
		//创建Properties集合，用于操作文件中的键值对
		Properties prop = new Properties();
		File f = new File("prope.ini");

		if(!f.exists())
			f.createNewFile();

		FileInputStream fis = new FileInputStream(f);
		prop.load(fis);//将fis对应的配置文件信息读取到集合中

		//获取次数
		int count = 0;
		String value = prop.getProperty("time");
		if(value != null)
		{
			count = Integer.parseInt(value);
			if(count>=5)
			{
				System.out.println("已到达使用次数上限");
				return;
			}
		}
		count++;

		prop.setProperty("time", count+"");

		FileOutputStream fos = new FileOutputStream(f);
		prop.store(fos, "");

		fis.close();
		fos.close();
	}

	public static void main(String[] args)throws IOException
	{
		/*
		//读取键盘录入
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufw = new BufferedWriter(new FileWriter("prope.ini"));

		String line = null;
		while((line = bufr.readLine()) != null)
		{
			if("over".equals(line))
				break;

			bufw.write(line);
			bufw.newLine();
			bufw.flush();
		}

		bufr.close();
		bufw.close();
*/
		runcode();
	}
}
