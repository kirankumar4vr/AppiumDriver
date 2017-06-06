package winControlPages;

import abstractControlPages.AbstractLoginpage;
import framework.AutomationAgent;
import framework.Control;
import framework.ControlType;
import framework.MobileByType;

public class WinLoginPage  extends AbstractLoginpage {
	public WinLoginPage(AutomationAgent agent){
		this.agent =agent;
		this.loginButton = new Control("Login Button", "Login", ControlType.Button, MobileByType.AccessibilityId, "LoginButtonId");
		this.usernameTextBox = new Control("Username TextBox","username",ControlType.Textbox, MobileByType.AccessibilityId,"usernameId");
		this.passwordTextBox = new Control("Password", "password", ControlType.Textbox, MobileByType.AccessibilityId, "passwordId");	
	}
}
