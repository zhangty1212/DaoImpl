package zty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
* @author: ����һ  
* @E-mail: 2547260515@qq.com
* @version ����ʱ�䣺2018��12��17�� ����12:10:47
* ��˵��
*/

public class Sql_Main {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		new Get_Mysql_Data().get_Mysql_Data();
	 
	}

	
}
