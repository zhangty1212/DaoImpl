/**  
*    文件名:  IStudentDao.java
*    文件描述:  
*  @author zhanggtaoyi 
*  @date 2019年3月18日  
*/
package zty.dao;

import java.util.ArrayList;

import zty.entity.Student;

/**
 * 类描述:
 * 
 * @author 张涛一 ,2547260515@qq.com
 * @since 2019年3月18日 上午10:52:17
 */
public interface IStudentDao {


	public ArrayList<Student> queryAllStudent();
	
	public boolean existJudgeStudent(Student student);
	
	public void addStudent(Student student);

	public void deleteStudent(Student student);
	
	public void updateStudent(Student student);

}
