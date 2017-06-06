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
	  loginPage.Login("temsec12grd06", "psocsq3");
  }

  @BeforeTest
  public void beforeTest() {
	  agent = new AutomationAgent(OS);
	  if(OS=="windows"){
		  loginPage = new WinLoginPage(agent);
	  }
	  else if(OS=="iOS"){
		  loginPage = new IOSLoginPage(agent);
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
