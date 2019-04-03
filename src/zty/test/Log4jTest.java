/**  
*    �ļ���:  Log4jTest.java
*    �ļ�����:  
*  @author zhanggtaoyi 
*  @date 2019��4��3��  
*/  
package zty.test;
import org.apache.log4j.Logger;

/**
*    ������: 
*  @author ����һ ,2547260515@qq.com
*  @since 2019��4��3�� ����10:49:05
*/
public class Log4jTest {
	
	// ���� Logger ���� log ���������־
	
	Logger log = Logger.getLogger(Log4jTest.class);
	
	/**
	*    ��������: 
	*  @since 2019��4��3�� 
	*/
	public static void main(String[] args) {
		 
	 //  ע�⣺ log4j.properties �ļ���Ҫ�ŵ� src Ŀ¼�£�������Զ���ȡ���������ٶ�ȡ��		
	 //   PropertyConfigurator.configure("/log4j.properties"); 	
		
		for (int a = 0; a < 100; a++) {
			new Log4jTest().logTest();
		}
	   
	}

	   public  void logTest() {
		   
		log.info("����logTest ������");
		
		int a = 0;
		int s = 4;
		try {
			int b = s / a;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.info("�����쳣��");
			log.error(e);
		}

	   }
	
}
