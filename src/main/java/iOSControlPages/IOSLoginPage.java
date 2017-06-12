package iOSControlPages;

import abstractControlPages.AbstractLoginpage;
import framework.AutomationAgent;
import framework.Control;
import framework.ControlType;
import framework.MobileByType;

public class IOSLoginPage extends AbstractLoginpage {
public IOSLoginPage(AutomationAgent agent){
	this.agent =agent;
	this.loginButton = new Control(agent, "Login Button", "Login", ControlType.Button, MobileByType.AccessibilityId, "LoginButtonId");
	this.usernameTextBox = new Control(agent, "Username TextBox","username",ControlType.Textbox, MobileByType.AccessibilityId,"usernameId");
	this.passwordTextBox = new Control(agent, "Password", "password", ControlType.Textbox, MobileByType.AccessibilityId, "passwordId");	
}
@Override
public void abstrMethod(String mystr){
	
}
}
