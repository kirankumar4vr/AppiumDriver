package iOSSTControlPages;

import abstractControlPages.AbstractLoginpage;
import framework.AutomationAgent;
import framework.Control;
import framework.ControlType;
import framework.MobileByType;

public class STLoginPage extends AbstractLoginpage {
	public STLoginPage(AutomationAgent agent){
		this.agent =agent;
		this.loginButton.setMobileByAndLocator(MobileByType.Xpath, "//*[@accessibilityIdentifier='LoginScreen.LoginButton']");
		this.usernameTextBox.setMobileByAndLocator(MobileByType.Xpath,"//*[@accessibilityIdentifier='LoginScreen.UserNameTextField']");
		this.passwordTextBox.setMobileByAndLocator(MobileByType.Xpath, "//*[@accessibilityIdentifier='LoginScreen.PasswordTextField']");		
	}
	@Override
	public void abstrMethod(String mystr){
		
	}
}
