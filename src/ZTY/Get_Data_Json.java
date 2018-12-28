package ZTY;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import org.junit.Test;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

/**
 * @author: 张涛一
 * @E-mail: 2547260515@qq.com
 * @version 创建时间：2018年12月20日 下午5:12:32 类说明
 */
public class Get_Data_Json {

	@Test
	public void get_Data_Json() throws ClassNotFoundException, SQLException {

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
		Statement statement = conn.createStatement();

		// 要执行的SQL语句
		String sql = "select * from student";

		// ResultSet类，用来存放获取的结果集！
		ResultSet rs = statement.executeQuery(sql);

		// System.out.println(rs);

		System.out.println("-------------------------------");
		System.out.println("执行结果如下所示:");
		System.out.println("-------------------------------");

		ResultSetMetaData metaData = rs.getMetaData();

		// System.out.println(metaData);

		int columnCount = metaData.getColumnCount();

		// System.out.println(columnCount);

		JsonArray array = new JsonArray();

		while (rs.next()) {

			JsonObject jsonObj = new JsonObject();

			for (int i = 1; i <= columnCount; i++) {

				String columnName = metaData.getColumnLabel(i);
				String value = rs.getString(columnName);
				// jsonObj.put(columnName, value);
				jsonObj.addProperty(columnName, value);
			}

			// array.put(jsonObj);
			array.add(jsonObj);

		}

		System.out.println("转换JSON数据：");
		System.out.println(array.toString());
		rs.close();
		statement.close();
		conn.close();

		System.out.println("-------------------------------");

		System.out.println("数据库数据获取成功！");

		long a =2147483647;

	}

}
