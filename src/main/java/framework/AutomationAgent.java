package framework;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.experitest.appium.SeeTestCapabilityType;
import com.experitest.appium.SeeTestIOSDriver;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

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
		}else if (OS=="iOS"){
			capabilities = new DesiredCapabilities();
			capabilities.setCapability("app", "/Users/admin/app/2.1.4.53-Developer-PoC-Parametrized.ipa");
			capabilities.setCapability("platformName", "iOS");
			capabilities.setCapability("platformVersion", "9.2.1");
			capabilities.setCapability("deviceName", "iPad");
			capabilities.setCapability("udid", "c07e63d2e71c653fdda10dfea9aec3998b6c7f40");			
			driver = new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4445/wd/hub"), capabilities);		
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}else if(OS=="ST"){			
			capabilities = new DesiredCapabilities();
			capabilities.setCapability(SeeTestCapabilityType.REPORT_DIRECTORY, "reports");
			capabilities.setCapability(SeeTestCapabilityType.REPORT_FORMAT, "xml");
			capabilities.setCapability(SeeTestCapabilityType.TEST_NAME, "psoclogin");
			capabilities.setCapability(MobileCapabilityType.UDID, "61c0ed73ed971fb67c1d904e64c54e38096dee0d");
			//capabilities.setCapability(MobileCapabilityType.APP, "C:\\Users\\Pearson\\AppData\\Roaming\\appiumstudio\\original-apks\\2.1.4.57-Developer-PoC-Parametrized.ipa");
			capabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.pearson.commoncore.develop");
			capabilities.setCapability(SeeTestCapabilityType.INSTRUMENT_APP, true);
	        driver = new SeeTestIOSDriver<>(new URL("http://localhost:8889"), capabilities);
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
