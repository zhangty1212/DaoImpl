package zty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
* @author: 张涛一  
* @E-mail: 2547260515@qq.com
* @version 创建时间：2018年12月17日 下午12:10:47
* 类说明
*/

public class Sql_Main {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		new Get_Mysql_Data().get_Mysql_Data();
	 
	}

	
}
