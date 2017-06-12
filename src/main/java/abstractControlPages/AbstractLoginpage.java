package abstractControlPages;

import framework.AutomationAgent;
import framework.Control;

public abstract class AbstractLoginpage{
	protected Control usernameTextBox;
	protected Control passwordTextBox;
	protected Control loginButton;
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
		enterUsername(username);
		clickLoginButton();
	}
	
}
