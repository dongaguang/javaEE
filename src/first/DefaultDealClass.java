package first;

import com.opensymphony.xwork2.ActionSupport;

/**
 * action的默认处理类
 * @author Administrator
 *
 */
public class DefaultDealClass extends ActionSupport {
	private static final long serialVersionUID = 1L;
	
	public String execute() throws Exception{
		System.out.println("默认的处理方法");
		return SUCCESS;
	}

}
