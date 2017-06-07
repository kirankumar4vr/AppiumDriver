package framework;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.windows.WindowsDriver;

public class AutomationAgent {
	private AppiumDriver<MobileElement> driver;
	private DesiredCapabilities capabilities;
	
	public AutomationAgent(String OS) throws MalformedURLException{
		if(OS=="Windows"){
			capabilities = new DesiredCapabilities();
			capabilities.setCapability("app", "Pearson.PSC_tk9qhwb5jzw48!App");
			capabilities.setCapability("platformName", "Windows");
			capabilities.setCapability("platformVersion", "10");
			driver = new WindowsDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub/"), capabilities);
		}
		else if (OS=="iOS"){
			
		}
	}
	public void click(Control control){
		control.getMobileElement(this.driver).click();
	}
	
	public void sendText(Control control, String text){
		control.getMobileElement(this.driver).sendKeys(text);
	}
}
