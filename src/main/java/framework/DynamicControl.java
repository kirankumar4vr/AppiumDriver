package framework;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class DynamicControl extends Control{
	public String[] dynamicVariables;
	public String controlIdentifierUpdated;
	
	public DynamicControl(String controlName, String controlText, ControlType controlType, MobileByType mobileByType, String controlIdentifier){
		super(controlName, controlText,controlType,mobileByType,controlIdentifier);		
	}
	
	public DynamicControl(String controlName, String controlText, ControlType controlType){
		super(controlName, controlText,controlType);		
	}
	
	public void setMobileByAndLocator(MobileByType mobileByType, String controlIdentifier){
		this.mobileByType =mobileByType;
		this.controlIdentifier = controlIdentifier;
		switch (mobileByType){
		case AccessibilityId :
			mobileBy = MobileBy.AccessibilityId(controlIdentifier);
			break;
		case Name :
			mobileBy = MobileBy.name(controlIdentifier);
			break;
		case ClassName :
			mobileBy = MobileBy.className(controlIdentifier);
			break;
		case Xpath :
			mobileBy = MobileBy.xpath(controlIdentifier);
			break;
		case LinkText :
			mobileBy = MobileBy.linkText(controlIdentifier);
			break;
		case Id :
			mobileBy = MobileBy.id(controlIdentifier);
			break;
		}
	}
	
	public void setDynamicVariables(String[] dynamicVariables){
		this.dynamicVariables = dynamicVariables;
		for(int i=0; i<dynamicVariables.length; i++){
			controlName = controlName.replace("{"+i+"}", dynamicVariables[i]);
			controlText = controlText.replace("{"+i+"}", dynamicVariables[i]);
			controlIdentifierUpdated = controlIdentifier.replace("{"+i+"}", dynamicVariables[i]);
		}
		switch (mobileByType){
		case AccessibilityId :
			mobileBy = (MobileBy) MobileBy.AccessibilityId(controlIdentifierUpdated);
			break;
		case Name :
			mobileBy = (MobileBy) MobileBy.name(controlIdentifierUpdated);
			break;
		case ClassName :
			mobileBy = (MobileBy) MobileBy.className(controlIdentifierUpdated);
			break;
		case Xpath :
			mobileBy = (MobileBy) MobileBy.xpath(controlIdentifierUpdated);
			break;
		case LinkText :
			mobileBy = (MobileBy) MobileBy.linkText(controlIdentifierUpdated);
			break;
		case Id :
			mobileBy = (MobileBy) MobileBy.id(controlIdentifierUpdated);
			break;
		}
	}
	@Override
	public MobileElement getMobileElement(AutomationAgent agent) throws Exception{
		if(this.dynamicVariables==null){
			throw new Exception("Dynamic Variables not set for Dynamic Control");
		}
		mobileElement = (MobileElement) agent.getMobileElement(this);
		return mobileElement;
	}
}
