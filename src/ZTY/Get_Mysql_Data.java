package ZTY;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author: 张涛一
 * @E-mail: 2547260515@qq.com
 * @version 创建时间：2018年12月17日 下午5:26:42 类说明
 */
public class Get_Mysql_Data {

	public void get_Mysql_Data() throws ClassNotFoundException, SQLException {

		// TODO Auto-generated method stub
		// 加载数据库驱动 com.mysql.jdbc.Driver
		String driver = "com.mysql.cj.jdbc.Driver";

		// 获取mysql连接地址
		// 注意 url数据库zty 后面，要添加 ?&useSSL=false&serverTimezone=UTC 信息，否则会报错。
		String url = "jdbc:mysql://localhost:3306/zty?&useSSL=false&serverTimezone=UTC";

		// 数据名称
		String user = "root";
		// 数据库密码
		String password = "zty1212";

		// 注册加载驱动程序

		Class.forName(driver);

		// 获取一个数据的连接
		Connection conn = DriverManager.getConnection(url, user, password);

		if (!conn.isClosed())
			System.out.println("数据库连接成功！");

		// 创建statement类对象，用来执行SQL语句！
		Statement Statement = conn.createStatement();

		// 要执行的SQL语句
		String sql = "select * from student";

		// ResultSet类，用来存放获取的结果集！
		ResultSet rs = Statement.executeQuery(sql);

		System.out.println("-------------------------------");
		System.out.println("执行结果如下所示:");
		System.out.println("-------------------------------");

		String sid;
		String sname;
		int sage;
		String sex;
		String sclass;

		while (rs.next()) {
			// 获取‘学号’这列数据
			sid = rs.getString("id");
			// System.out.println(getType(sid));

			// 获取‘姓名’这列数据
			sname = rs.getString("sname");
		 //   System.out.println(getType(sname));
		
			// 获取‘年龄’这列数据
			sage = rs.getInt("age");

			// 获取‘性别’这列数据
			sex = rs.getString("sex");

			// 获取‘班级’这列数据
			sclass = rs.getString("class");

			// 输出结果
			System.out.println(sid + "\t" + sname + "\t" + sage + "\t" + sex + "\t" + sclass);
		}
		rs.close();
		conn.close();

		System.out.println("-------------------------------");

		System.out.println("数据库数据获取成功！");

	}
	
	
	
	// 获取变量类型方法
		public static String getType(Object o) {
			return o.getClass().toString(); // 使用int类型的getClass()方法
		}

}
