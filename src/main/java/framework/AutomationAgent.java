package framework;

import org.openqa.selenium.remote.DesiredCapabilities;
import com.gargoylesoftware.htmlunit.javascript.host.URL;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.windows.WindowsDriver;

public class AutomationAgent {
	private AppiumDriver driver;
	private DesiredCapabilities capabilities;
	
	public AutomationAgent(String OS){
		if(OS=="Windows"){
			capabilities = new DesiredCapabilities();
			driver = new WindowsDriver(capabilities);
		}
		else if (OS=="iOS"){
			
		}
	}
	public void click(Control control){
		//Clicked on control
	}
	
	public void sendText(Control control, String text){
		//Text sent
	}
}
