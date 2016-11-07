package first;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Listen implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		//myeclipse中看不到效果
		System.out.println("监听器关闭");
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		System.out.println("监听器被启动");
	}

}
