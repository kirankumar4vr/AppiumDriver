package iOSControlPages;

import abstractControlPages.AbstractLoginpage;
import framework.AutomationAgent;
import framework.Control;
import framework.ControlType;
import framework.MobileByType;

public class IOSLoginPage extends AbstractLoginpage {
public IOSLoginPage(AutomationAgent agent){
	this.agent =agent;
	this.loginButton.setMobileByAndLocator(MobileByType.Xpath, "//*[@name='LoginScreen.LoginButton']");
	this.usernameTextBox.setMobileByAndLocator(MobileByType.Xpath,"//*[@name='LoginScreen.UserNameTextField']");
	this.passwordTextBox.setMobileByAndLocator(MobileByType.Xpath, "//*[@name='LoginScreen.PasswordTextField']");		
}
@Override
public void abstrMethod(String mystr){
	
}
}
