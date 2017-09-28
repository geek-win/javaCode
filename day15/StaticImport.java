/*
 * 静态导入
 * 静态工具类中都是静态函数
 * 每次调用需要写类名
 * 我们可以直接进行导入
 * * 导入的是某个类中所有的静态成员
 * 没有写static，导入的是类
 * 写了static，导入的是类的静态方法
 * import static java.util.Arrays.*;
 * import static java.lang.System.*;//导入了System类中的所有的静态成员
 * */
import java.util.*;
import static java.util.Arrays.*;
import static java.lang.System.*;
//import static java.util.Collections.*;

class StaticImport 
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("ecrve");
		al.add("ecer");
		al.add("casd");

		//排序
		Collections.sort(al);
		out.println(al);
		out.println(Collections.max(al));

		int[] num = {
			3, 1, 34, 23, 12
		};
		sort(num);
		out.println(Arrays.toString(num));
	}

}
