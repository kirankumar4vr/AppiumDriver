package framework;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
//import io.appium.java_client.windows.WindowsDriver;
//import io.appium.java_client.windows.WindowsElement;

public class AutomationAgent {
	//private WindowsDriver<WindowsElement> driver;
	private AppiumDriver<MobileElement> driver;
	private DesiredCapabilities capabilities;
	
	public AutomationAgent(String OS) throws MalformedURLException{
		if(OS=="Windows"){
			capabilities = new DesiredCapabilities();
			capabilities.setCapability("app", "Pearson.PSC_tk9qhwb5jzw48!App");
			capabilities.setCapability("platformName", "Windows");
			capabilities.setCapability("deviceName", "MyDevice");
			driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723"), capabilities);		
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		else if (OS=="iOS"){
			
		}
	}
	public void click(Control control){
		//this.driver.findElement(control.mobileBy).click();
		control.getMobileElement().click();
	}
	
	public void sendText(Control control, String text){
		//this.driver.findElement(control.mobileBy).clear();
//		this.driver.findElement(control.mobileBy).sendKeys(text);
		control.getMobileElement().clear();
		control.getMobileElement().sendKeys(text);
	}
	
	public MobileElement getMobileElement(Control control){
		return this.driver.findElementByAccessibilityId(control.controlIdentifier);	
	}
}
