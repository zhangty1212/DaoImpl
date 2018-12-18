package ZTY;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author: ����һ
 * @E-mail: 2547260515@qq.com
 * @version ����ʱ�䣺2018��12��17�� ����5:26:42 ��˵��
 */
public class Get_Mysql_Data {

	public void get_Mysql_Data() throws ClassNotFoundException, SQLException {

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
		Statement Statement = conn.createStatement();

		// Ҫִ�е�SQL���
		String sql = "select * from student";

		// ResultSet�࣬������Ż�ȡ�Ľ������
		ResultSet rs = Statement.executeQuery(sql);

		System.out.println("-------------------------------");
		System.out.println("ִ�н��������ʾ:");
		System.out.println("-------------------------------");

		String sid;
		String sname;
		int sage;
		String sex;
		String sclass;

		while (rs.next()) {
			// ��ȡ��ѧ�š���������
			sid = rs.getString("id");
			// System.out.println(getType(sid));

			// ��ȡ����������������
			sname = rs.getString("sname");
		 //   System.out.println(getType(sname));
		
			// ��ȡ�����䡯��������
			sage = rs.getInt("age");

			// ��ȡ���Ա���������
			sex = rs.getString("sex");

			// ��ȡ���༶����������
			sclass = rs.getString("class");

			// ������
			System.out.println(sid + "\t" + sname + "\t" + sage + "\t" + sex + "\t" + sclass);
		}
		rs.close();
		conn.close();

		System.out.println("-------------------------------");

		System.out.println("���ݿ����ݻ�ȡ�ɹ���");

	}
	
	
	
	// ��ȡ�������ͷ���
		public static String getType(Object o) {
			return o.getClass().toString(); // ʹ��int���͵�getClass()����
		}

}
