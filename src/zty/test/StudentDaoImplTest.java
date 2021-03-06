/**  
*    猟周兆:  StudentDaoImplTest.java
*    猟周宙峰:  
*  @author zhanggtaoyi 
*  @date 2019定3埖18晩  
*/
package zty.test;

import java.util.ArrayList;

import org.junit.Test;

import zty.dao.impl.StudentDaoImpl_1;
import zty.dao.impl.StudentDaoImpl_2;
import zty.dao.impl.StudentDaoImpl_3;
import zty.entity.Student;

/**
 * 窃宙峰:
 * 
 * @author 嫖摸匯 ,2547260515@qq.com
 * @since 2019定3埖18晩 和怜2:39:08
 */
public class StudentDaoImplTest {

	@Test
	public void queryAllStudentTest1() {

		ArrayList<Student> arrayList = new StudentDaoImpl_1().queryAllStudent();

		for (Student student : arrayList) {
			System.out.println(student);

		}

		System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！ ��1��");

	}

	@Test
	public void queryAllStudentTest2() {

		ArrayList<Student> arrayList = new StudentDaoImpl_2().queryAllStudent();

		for (Student student : arrayList) {
			System.out.println(student);

		}

		System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！ ��2��");

	}

	@Test
	public void queryAllStudentTest3() {

		ArrayList<Student> arrayList = new StudentDaoImpl_3().queryAllStudent();

		for (Student student : arrayList) {
			System.out.println(student);

		}
		System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！ ��3��");
	}

	@Test
	public void existJudgeStudentTest3() {

		Student student = new Student();
		student.setSID("s0012");
		student.setSname("藍嘱");
		boolean b = new StudentDaoImpl_3().existJudgeStudent(student);

		if (b) {
			System.out.println(student.getSID() + " 麼囚厮贋壓��辛厚仟佚連!");

		} else {
			System.out.println(student.getSID() + " 麼囚音贋壓��辛峨秘佚連");
		}

		System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！��登僅繁埀頁倦贋壓��");

	}

	@Test
	public void addStudentTest3() {

		Student student = new Student();
		student.setSID("s0012");
		student.setSname("嫖摸");
		student.setSage(22);
		student.setSex("1");
		student.setSclass("c102");

		new StudentDaoImpl_3().addStudent(student);

		System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！�┣緘誄�伏佚連��");

	}

	@Test
	public void updateStudentTest3() {

		Student student = new Student();
		student.setSID("s0012");
		student.setSname("嫖匯");
		student.setSage(24);
		student.setSex("0");
		student.setSclass("c102");

		new StudentDaoImpl_3().updateStudent(student);

		System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！�┯�仟僥伏佚連��");

	}
	
	@Test
	public void deleteStudentTest3() {

		Student student = new Student();
		student.setSID("s0012");
		new StudentDaoImpl_3().deleteStudent(student);

		System.out.println("！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！！��評茅僥伏佚連��");

	}

}
