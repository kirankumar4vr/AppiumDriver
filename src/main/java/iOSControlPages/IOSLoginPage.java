package iOSControlPages;

import abstractControlPages.AbstractLoginpage;
import framework.AutomationAgent;
import framework.Control;
import framework.ControlType;
import framework.MobileByType;

public class IOSLoginPage extends AbstractLoginpage {
public IOSLoginPage(AutomationAgent agent){
	this.agent =agent;
	this.loginButton = new Control("Login Button", "Login", ControlType.Button, MobileByType.AccessibilityId, "LoginButtonId");
	this.usernameTextBox = new Control("Username TextBox","username",ControlType.Textbox, MobileByType.AccessibilityId,"usernameId");
	this.passwordTextBox = new Control("Password", "password", ControlType.Textbox, MobileByType.AccessibilityId, "passwordId");	
}
}
