/**  
*    �ļ���:  IStudentDao.java
*    �ļ�����:  
*  @author zhanggtaoyi 
*  @date 2019��3��18��  
*/
package zty.dao;

import java.util.ArrayList;

import zty.entity.Student;

/**
 * ������:
 * 
 * @author ����һ ,2547260515@qq.com
 * @since 2019��3��18�� ����10:52:17
 */
public interface IStudentDao {


	public ArrayList<Student> queryAllStudent();
	
	public boolean existJudgeStudent(Student student);
	
	public void addStudent(Student student);

	public void deleteStudent(Student student);
	
	public void updateStudent(Student student);

}
