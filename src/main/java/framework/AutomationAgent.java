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
			capabilities = new DesiredCapabilities();
			capabilities.setCapability("app", "/Users/admin/app/2.1.4.53-Developer-PoC-Parametrized.ipa");
			capabilities.setCapability("platformName", "iOS");
			capabilities.setCapability("platformVersion", "9.2.1");
			capabilities.setCapability("deviceName", "iPad");
			capabilities.setCapability("udid", "c07e63d2e71c653fdda10dfea9aec3998b6c7f40");			
			driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4445/wd/hub"), capabilities);		
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
	}
	public void click(Control control){
		//this.driver.findElement(control.mobileBy).click();
		try {
			control.getMobileElement(this).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sendText(Control control, String text){
		//this.driver.findElement(control.mobileBy).clear();
//		this.driver.findElement(control.mobileBy).sendKeys(text);
		try {
			control.getMobileElement(this).clear();
			control.getMobileElement(this).sendKeys(text);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public MobileElement getMobileElement(Control control){
		return this.driver.findElement(control.mobileBy);	
	}
}
