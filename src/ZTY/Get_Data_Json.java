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
 * @author: ����һ
 * @E-mail: 2547260515@qq.com
 * @version ����ʱ�䣺2018��12��20�� ����5:12:32 ��˵��
 */
public class Get_Data_Json {

	@Test
	public void get_Data_Json() throws ClassNotFoundException, SQLException {

		// TODO Auto-generated method stub
		// �������ݿ����� com.mysql.jdbc.Driver
		String driver = "com.mysql.cj.jdbc.Driver";

		// ��ȡmysql���ӵ�ַ
		// ע�� url���ݿ�zty ���棬Ҫ��� ?&useSSL=false&serverTimezone=UTC ��Ϣ������ᱨ��
		String url = "jdbc:mysql://localhost:3306/zty?&useSSL=false&serverTimezone=UTC";

		// ��������
		String user = "root";
		// ���ݿ�����
		String password = "zty1212";

		// ע�������������

		Class.forName(driver);

		// ��ȡһ�����ݵ�����
		Connection conn = DriverManager.getConnection(url, user, password);

		if (!conn.isClosed())
			System.out.println("���ݿ����ӳɹ���");

		// ����statement���������ִ��SQL��䣡
		Statement statement = conn.createStatement();

		// Ҫִ�е�SQL���
		String sql = "select * from student";

		// ResultSet�࣬������Ż�ȡ�Ľ������
		ResultSet rs = statement.executeQuery(sql);

		// System.out.println(rs);

		System.out.println("-------------------------------");
		System.out.println("ִ�н��������ʾ:");
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

		System.out.println("ת��JSON���ݣ�");
		System.out.println(array.toString());
		rs.close();
		statement.close();
		conn.close();

		System.out.println("-------------------------------");

		System.out.println("���ݿ����ݻ�ȡ�ɹ���");

		long a =2147483647;

	}

}
