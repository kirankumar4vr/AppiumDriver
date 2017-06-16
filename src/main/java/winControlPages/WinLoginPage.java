package winControlPages;

import abstractControlPages.AbstractLoginpage;
import framework.AutomationAgent;
import framework.Control;
import framework.ControlType;
import framework.MobileByType;

public class WinLoginPage  extends AbstractLoginpage {
	public WinLoginPage(AutomationAgent agent){
		this.agent =agent;
		this.loginButton = new Control("Login Button", "Login", ControlType.Button, MobileByType.AccessibilityId, "Login_btn_login");
		this.usernameTextBox = new Control("Username TextBox","username",ControlType.Textbox, MobileByType.AccessibilityId,"Login_txt_userName");
		this.passwordTextBox = new Control("Password", "password", ControlType.Textbox, MobileByType.AccessibilityId, "Login_txt_password");	
	}
	public void ClickDownloadWinInitialLaunch(){
		//Clicks on Download Button
	}
	@Override
	public void abstrMethod(String mystr) {
		// TODO Auto-generated method stub		
	}
}
