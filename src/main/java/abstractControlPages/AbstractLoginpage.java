package abstractControlPages;

import framework.AutomationAgent;
import framework.Control;

public abstract class AbstractLoginpage{
	protected Control usernameTextBox;
	protected Control passwordTextBox;
	protected Control loginButton;
	protected AutomationAgent agent;
	
	public void enterUsername(String username){
		agent.sendText(usernameTextBox, "Username");
	}
	public void enterPassword(String password){
		agent.sendText(usernameTextBox, "Username");
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
