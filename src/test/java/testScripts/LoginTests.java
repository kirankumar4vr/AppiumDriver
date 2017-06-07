package testScripts;

import org.testng.annotations.Test;

import abstractControlPages.AbstractLoginpage;
import framework.AutomationAgent;
import iOSControlPages.IOSLoginPage;
import winControlPages.WinLoginPage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class LoginTests {
	public AutomationAgent agent;
	public String OS = "Windows";
	public AbstractLoginpage loginPage;
			
  @Test
  public void login() {
	  try{
		  loginPage.Login("temsec12grd06", "psocsq3");
	  }catch(Exception ex){
		  
	  }
  }

  @BeforeTest
  public void beforeTest() {
	  try{
		  agent = new AutomationAgent(OS);
		  if(OS=="windows"){
			  loginPage = new WinLoginPage(agent);
		  }
		  else if(OS=="iOS"){
			  loginPage = new IOSLoginPage(agent);
		  }
	  }catch(Exception ex){
		  
	  }
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
