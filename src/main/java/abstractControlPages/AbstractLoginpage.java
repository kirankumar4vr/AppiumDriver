package abstractControlPages;

import framework.AutomationAgent;
import framework.Control;
import framework.ControlType;

public abstract class AbstractLoginpage{
	protected Control usernameTextBox = new Control("Username TextBox", "username", ControlType.Textbox);
	protected Control passwordTextBox = new Control("Password TextBox", "password", ControlType.Textbox);
	protected Control loginButton= new Control("Login Button", "Login", ControlType.Button);;
	protected AutomationAgent agent;
	
	public abstract void abstrMethod(String mystr);
	
	public void enterUsername(String username){
		agent.sendText(usernameTextBox, username);
	}
	public void enterPassword(String password){
		agent.sendText(passwordTextBox, password);
	}
	public void clickLoginButton(){
		agent.click(loginButton);
	}
	
	public void Login(String username, String password){
		enterUsername(username);
		enterPassword(password);
		clickLoginButton();
	}
	
}
