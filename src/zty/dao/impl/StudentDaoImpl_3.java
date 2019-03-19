/**  
*    文件名:  StudentDaoImpl_3.java
*    文件描述:  
*  @author zhanggtaoyi 
*  @date 2019年3月18日  
*/
package zty.dao.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import zty.dao.IStudentDao;
import zty.entity.Student;
import zty.util.JdbcUtilc3p0;

/**
 * 类描述:
 * 
 * @author 张涛一 ,2547260515@qq.com
 * @since 2019年3月18日 下午4:42:41
 */
public class StudentDaoImpl_3 implements IStudentDao {

	// 数据库链接 conn
	Connection conn;

	@Override
	public ArrayList<Student> queryAllStudent() {
		// TODO Auto-generated method stub
		/*
		 * // 使用工具类 JdbcUtilc3p0.java ，获取数据库链接 conn
		 * 
		 * conn = JdbcUtilc3p0.getConnection();
		 * 
		 * // 准备要执行的SQL语句 String sql = "select * from student";
		 * 
		 * // 创建 DBUtil 组建的核心类对象 QueryRunner queryRunner
		 * 
		 * QueryRunner queryRunner = new QueryRunner();
		 * 
		 * ArrayList<Student> arrayList = null;
		 * 
		 * // queryRunner 的 query 方法默认返回的是 list 集合，这里我们要做一个向下的强制转型，转为 ArrayList<Student>
		 * 
		 * try { arrayList = (ArrayList<Student>) queryRunner.query(conn, sql, new
		 * BeanListHandler<Student>(Student.class)); } catch (SQLException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 * 
		 * // c3p0 连接池的链接 connn 最好还是要手动关闭一下 try { conn.close(); } catch (SQLException e)
		 * { // TODO Auto-generated catch block e.printStackTrace(); }
		 * 
		 * return arrayList;
		 */

		String sql = "select * from student";

		Object object1 = new BeanListHandler<Student>(Student.class);

		List<Object> list = JdbcUtilc3p0.queryDatabase(sql, object1);

		Object ob = (Object) list;
		List<Student> students = (List<Student>) ob;

		System.out.println("查询全部数据成功！");

		return (ArrayList<Student>) students;
	}

	@Override
	public boolean existJudgeStudent(Student student) {
		// TODO Auto-generated method stub

		/*
		 * conn = JdbcUtilc3p0.getConnection();
		 * 
		 * String sql = "select * from student where SID= ?";
		 * 
		 * QueryRunner queryRunner = new QueryRunner();
		 * 
		 * List<Student> list = null; try { list = queryRunner.query(conn, sql, new
		 * BeanListHandler<Student>(Student.class), student.getSID()); } catch
		 * (SQLException e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 * 
		 * try { conn.close(); } catch (SQLException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */

		String sql = "select * from student where SID= ?";

		Object object1 = new BeanListHandler<Student>(Student.class);

		List<Object> list = JdbcUtilc3p0.queryDatabase(sql, object1, student.getSID());

		System.out.println("查询数据成功！");

		if (list.size() > 0) {

			for (Object obj : list) {
				System.out.println(obj);
			}
			return true;
		}

		return false;
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub

		/*
		 * conn = JdbcUtilc3p0.getConnection();
		 * 
		 * String sql =
		 * "insert into student (SID, Sname,Sage,Sex,Sclass) values(?,?,?,?,?) ";
		 * 
		 * QueryRunner queryRunner = new QueryRunner();
		 * 
		 * try { queryRunner.update(conn, sql, student.getSID(), student.getSname(),
		 * student.getSage(), student.getSex(), student.getSclass()); } catch
		 * (SQLException e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 * 
		 * try { conn.close(); } catch (SQLException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */

		String sql = "insert into student (SID, Sname,Sage,Sex,Sclass) values(?,?,?,?,?) ";
		JdbcUtilc3p0.updateDatabase(sql, student.getSID(), student.getSname(), student.getSage(), student.getSex(),
				student.getSclass());
		System.out.println("插入成功！");
	}

	@Override
	public void deleteStudent(Student student) {
		// TODO Auto-generated method stub

		/*
		 * conn = JdbcUtilc3p0.getConnection(); String sql =
		 * "delete from student where SID=? ";
		 * 
		 * QueryRunner queryRunner = new QueryRunner();
		 * 
		 * try { queryRunner.update(conn, sql, student.getSID()); } catch (SQLException
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 * 
		 * try { conn.close(); } catch (SQLException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */

		String sql = "delete from student where SID=? ";

		JdbcUtilc3p0.updateDatabase(sql, student.getSID());

		System.out.println("删除成功！");
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub

		/*
		 * conn = JdbcUtilc3p0.getConnection();
		 * 
		 * String sql = "update student set Sname=?,Sage=?,Sex=?,Sclass=? where SID=? ";
		 * 
		 * QueryRunner queryRunner = new QueryRunner();
		 * 
		 * try { queryRunner.update(conn, sql, student.getSname(), student.getSage(),
		 * student.getSex(), student.getSclass(), student.getSID()); } catch
		 * (SQLException e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 * 
		 * try { conn.close(); } catch (SQLException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */

		String sql = "update student set Sname=?,Sage=?,Sex=?,Sclass=? where SID=? ";

		JdbcUtilc3p0.updateDatabase(sql, student.getSname(), student.getSage(), student.getSex(), student.getSclass(),
				student.getSID());

		System.out.println("更新成功！");

	}

}
