package iOSControlPages;

import abstractControlPages.AbstractLoginpage;
import framework.AutomationAgent;
import framework.Control;
import framework.ControlType;
import framework.MobileByType;

public class IOSLoginPage extends AbstractLoginpage {
public IOSLoginPage(AutomationAgent agent){
	this.agent =agent;
	this.loginButton = new Control("Login Button", "Login", ControlType.Button, MobileByType.Xpath, "//*[@name='LoginScreen.LoginButton']");
	this.usernameTextBox = new Control("Username TextBox","username",ControlType.Textbox, MobileByType.Xpath,"//*[@name='LoginScreen.UserNameTextField']");
	this.passwordTextBox = new Control("Password", "password", ControlType.Textbox, MobileByType.Xpath, "//*[@name='LoginScreen.PasswordTextField']");		
}
@Override
public void abstrMethod(String mystr){
	
}
}
