package com.automation.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.base.Base_Salesforce;
import com.automation.utility.PropertiesUtility;
import com.automation.utility.constants;

public class LoginModule extends Base_Salesforce {
@Test
	public  void invalidLogin()
	{
		WebElement user=driver.findElement(By.xpath("//input[@id=\"username\"]"));
	    String userName="user@gmail.com";
	    String objectName="username";
		enterText(user, userName,objectName);
		WebElement pw=driver.findElement(By.id("password"));
		String pwd="12345";
		String objectName1="password";
		enterText(pw,pwd,objectName1);
	    WebElement login=driver.findElement(By.id("Login"));
	    clickElement(login,"loginButton");
	}
@Test
public void loginToSFDC()
{
	
	WebElement user=driver.findElement(By.xpath("//input[@id=\"username\"]"));
    String userName=PropertiesUtility.readDataFromPropertyFile(constants.APPLICATION_PROPERTIES,"username");
    String objectName="username";
	enterText(user, userName,objectName);
	WebElement pw=driver.findElement(By.id("password"));
	String pwd=PropertiesUtility.readDataFromPropertyFile(constants.APPLICATION_PROPERTIES,"password");
	String objectName1="password";
	enterText(pw,pwd,objectName1);
    WebElement login=driver.findElement(By.id("Login"));
    clickElement(login,"loginButton");
}
@Test
public void checkRememberMe() throws InterruptedException
{
	
	WebElement user=driver.findElement(By.xpath("//input[@id=\"username\"]"));
    String userName=PropertiesUtility.readDataFromPropertyFile(constants.APPLICATION_PROPERTIES,"username");
    String objectName="username";
	enterText(user, userName,objectName);
	WebElement pw=driver.findElement(By.id("password"));
	String pwd=PropertiesUtility.readDataFromPropertyFile(constants.APPLICATION_PROPERTIES,"password");
	String objectName1="password";
	enterText(pw,pwd,objectName1);
	WebElement check=driver.findElement(By.xpath("//input[@id=\"rememberUn\"]"));
	clickElement(check,"Remember Me");
	WebElement login=driver.findElement(By.id("Login"));
    clickElement(login,"loginButton");
    WebElement userName1=driver.findElement(By.id("userNavLabel"));
	userNameClick();
	userNameDropdown("Logout");
  
  
  
}
@Test
public void forgot_Password() throws InterruptedException
{
	
	WebElement fpwd = driver.findElement(By.xpath("//a[@id=\"forgot_password_link\"]"));
	clickElement(fpwd,"Forgot Password");
	WebElement e=driver.findElement(By.xpath("//*[@id='un']"));
    String userName=PropertiesUtility.readDataFromPropertyFile(constants.APPLICATION_PROPERTIES,"username");
    String objectName="username";
	enterText(e, userName,objectName);
	WebElement contButton=driver.findElement(By.xpath("//input[@id=\"continue\"]"));
	clickElement(contButton,"Continue");
	
}
@Test
public void login_Attempt() throws InterruptedException
{
	
	WebElement user=driver.findElement(By.xpath("//input[@id=\"username\"]"));
    String userName="123";
    String objectName="username";
	enterText(user, userName,objectName);
	WebElement pw=driver.findElement(By.id("password"));
	String pwd="22131";
	String objectName1="password";
	
	enterText(pw,pwd,objectName1);
	WebElement login=driver.findElement(By.id("Login"));
	clickElement(login,"loginButton");
	WebElement er=driver.findElement(By.xpath("//div[@id=\"error\"]"));
	errorMessage(er);
}
	
}
