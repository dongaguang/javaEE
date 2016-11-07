package struts;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String userName;
	private String passWord;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	
	public String execute() throws Exception{
		if(getUserName().equals("haha") && getPassWord().equals("nihao")){
			ActionContext.getContext().getSession().put("user", getUserName());
			return SUCCESS;
		}
		return ERROR;
	}
}
