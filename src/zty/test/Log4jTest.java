/**  
*    文件名:  Log4jTest.java
*    文件描述:  
*  @author zhanggtaoyi 
*  @date 2019年4月3日  
*/  
package zty.test;
import org.apache.log4j.Logger;

/**
*    类描述: 
*  @author 张涛一 ,2547260515@qq.com
*  @since 2019年4月3日 上午10:49:05
*/
public class Log4jTest {
	
	// 创建 Logger 对象 log ，来输出日志
	
	Logger log = Logger.getLogger(Log4jTest.class);
	
	/**
	*    方法描述: 
	*  @since 2019年4月3日 
	*/
	public static void main(String[] args) {
		 
	 //  注意： log4j.properties 文件需要放到 src 目录下，程序会自动读取到，无需再读取；		
	 //   PropertyConfigurator.configure("/log4j.properties"); 	
		
		for (int a = 0; a < 100; a++) {
			new Log4jTest().logTest();
		}
	   
	}

	   public  void logTest() {
		   
		log.info("进入logTest 方法：");
		
		int a = 0;
		int s = 4;
		try {
			int b = s / a;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			log.info("程序异常：");
			log.error(e);
		}

	   }
	
}
