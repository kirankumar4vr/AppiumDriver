package framework;

import org.openqa.selenium.By;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Control {
	
public String controlName;
public String controlText;
public ControlType controlType;
public MobileBy mobileBy;
public MobileElement mobileElement;
public MobileByType mobileByType;
public String controlIdentifier;
public AutomationAgent agent;

public Control(AutomationAgent agent, String controlName, String controlText, ControlType controlType, MobileByType mobileByType, String controlIdentifier){
	this.agent = agent;
	this.controlName = controlName;
	this.controlText = controlText;
	this.controlType = controlType;
	this.mobileByType =mobileByType;
	this.controlIdentifier = controlIdentifier;
	switch (mobileByType){
	case AccessibilityId :
		mobileBy = (MobileBy) MobileBy.AccessibilityId(controlIdentifier);
		break;
	case Name :
		mobileBy = (MobileBy) MobileBy.name(controlIdentifier);
		break;
	case ClassName :
		mobileBy = (MobileBy) MobileBy.className(controlIdentifier);
		break;
	case Xpath :
		mobileBy = (MobileBy) MobileBy.xpath(controlIdentifier);
		break;
	case LinkText :
		mobileBy = (MobileBy) MobileBy.linkText(controlIdentifier);
		break;
	case Id :
		mobileBy = (MobileBy) MobileBy.id(controlIdentifier);
		break;
	}
}
public MobileElement getMobileElement(){
	if(this.mobileElement==null){
		mobileElement = (MobileElement) this.agent.getMobileElement(this);
	}
	return mobileElement;
}

}
