package test;
import com.opensymphony.xwork2.*;
public class LoginAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private String uname,password;
	
	public String getUname() {
		return uname;
	}
	
	public void setUname(String uname) {
		this.uname= uname;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password= password;
	}
	
	public String execute() {
		if(uname.equals("pk") && password.equals("pass123")) {
			return "success";
		} else {
			return "error";
		}
	}
}
