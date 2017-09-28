/*
 * 需求：数据库的操作
 * 1、连接数据库  JDBC   Hibernate(框架)
 * 2、操作数据库
 *	c creat r read u update d delete
 * 3、关闭数据库连接
 * 有很多连接方式，但是它们内部代码都一样，所以可以向上抽取为接口
 * 数据是用户信息
 * */
//访问数据库的规则
//data access object
interface UserInfoDao
{
	public abstract void add(User user);
	public abstract void delete(User user);
}

class UserInfoByJDBC implements UserInfoDao
{
	public void add(User user)
	{
		1、连接数据库；
		2、使用sql添加语句添加数据；
	    3、关闭连接；
	}
	public void delete(User user)
	{
		1、连接数据库；
		2、使用sql添加语句删除数据；
		3、关闭连接；
	}
}

class UserInfoHibernate implements UserInfoDao
{
	public void add(){

	}

	public void delete(){

	}
}

class DataBase
{
	public static void main(String[] args)
	{
		UserInfoDao ui = new UserInfoJDBC();
		ui.add();
		ui.delete();
	}
}



