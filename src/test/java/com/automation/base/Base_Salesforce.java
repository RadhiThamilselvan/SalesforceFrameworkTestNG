package com.automation.base;

import java.util.List;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.automation.utility.Log4jUtility;
import com.automation.utility.PropertiesUtility;
import com.automation.utility.constants;

public class Base_Salesforce extends BaseTest{
	Logger mylog=Log4jUtility.getLogger(Base_Salesforce.class);
	@BeforeMethod
	@Parameters("browserName")
public void setUpBeforeMethod(@Optional("chrome") String BrowserName1)
{
	mylog.info("*******setUpbeforeMethod********");
	launchBrowser(BrowserName1);
	String url=PropertiesUtility.readDataFromPropertyFile(constants.APPLICATION_PROPERTIES,"url");
	goToUrl(url);
				
}
//@AfterMethod
public void tearDownAfterTestmethod()
{
	closeBrowser();
	mylog.info("*******tearDownAfterTestMethod*********");
}
	
public void login_Salesforce()
{
	
	String url=PropertiesUtility.readDataFromPropertyFile(constants.APPLICATION_PROPERTIES,"url");
	goToUrl(url);
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
public void userNameClick()
{
	 WebElement user_Drop=driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
	 clickElement(user_Drop,"usernamedropdown");
}
public void userNameDropdown(String data) 
{
	 
	  
	
	 List<WebElement> elements=driver.findElements(By.xpath("//*[@id=\'userNav-menuItems\']/a"));
	    for(WebElement ele:elements) {
	    	
	    	String st=ele.getText();
	    	
	    	if(st.equals(data))
	    	{
	    		ele.click();
	    		extentReport.logTestInfo(data+ "is clicked");
	    		break;
	    	}
	    }
}
public void my_Profile(String data)
{
	List<WebElement> elements=driver.findElements(By.xpath("//li[@class=\"publisherFeedItemTypeChoice\"]/a/span"));
    for(WebElement ele:elements) {
    	
    	String st=ele.getText();
    	
    	if(st.equals(data))
    	{
    		ele.click();
    		extentReport.logTestInfo(data+ "is clicked");
    		break;
    	}	
}	
}
public void my_Settings(String data)
{
	List<WebElement> elements=driver.findElements(By.xpath("//*[@id=\"AutoNumber5\"]/div[@class=\"parent\"]/a/span[2]"));
    for(WebElement ele:elements) {
    	
    	String st=ele.getText();
    	
    	if(st.equals(data))
    	{
    		ele.click();
    		extentReport.logTestInfo(data+ "is clicked");
    		break;
    	}	
}
}
public void tabBar(String data)
{
	List<WebElement> elements=driver.findElements(By.xpath("/html/body/div[1]/div[1]/div/div/nav/ul//li//a"));
    for(WebElement ele:elements) {
    	
    	String st=ele.getText();
    	
    	if(st.equals(data))
    	{
    		ele.click();
    		mylog.info(data+ "is clicked");
    		//extentReport.logTestInfo(data+ "clicked");
    		break;
    	}	
}}

public void Reports(String data)
{
	List<WebElement> elements=driver.findElements(By.xpath("//*[@id='toolsContent']/tbody/tr/td[1]/div/div/div[1]//li"));

    for(WebElement ele:elements) {
    	
    	String st=ele.getText();
    	
    	if(st.equals(data))
    	{
    		ele.click();
    		extentReport.logTestInfo(data+ "clicked");
    		mylog.info(data+ "is clicked");
    		break;
    	}	
}}
public void createActivityDate(String data)
{
	 List<WebElement> allDate=driver.findElements(By.xpath("//td[@class=\"x-date-active\"]//a"));
	    for(WebElement ele:allDate)
	    {
	    	String dt=ele.getText();
	    	if(dt.equals(data))
	    	{
	    		ele.click();
	    		extentReport.logTestInfo(data+ "clicked");
	    		break;
	    	}
	    }
}
public void opportunities_dropdown()
{
	 List<WebElement> opp_Drop=driver.findElements(By.xpath("//select[@id=\'fcf\']//option"));
	    for(WebElement ele:opp_Drop)
	    {
	    	
	    	System.out.println(ele.getText());
	    	
	    }
}

public void opportunities_Reports(String data)
{
	 List<WebElement> reports=driver.findElements(By.xpath("//div[@class=\"lbBody\"]//a"));
	    for(WebElement ele:reports)
	    {
	    	
	    	String dt=ele.getText();
	    	if(dt.equals(data))
	    	{
	    		ele.click();
	    		extentReport.logTestInfo(data+ "clicked");
	    		break;
	    	}
	    	
	    }
}

public void Leads_SelectDrop()
{
	 List<WebElement> reports=driver.findElements(By.xpath("//select[@id=\"fcf\"]//option"));
	    for(WebElement ele:reports)
	    {
	    	
	    	System.out.println(ele.getText());
	    	
	    }
}
public void Leads_SelectDropdown(String data)
{
List<WebElement> lead_Views=driver.findElements(By.xpath("//*[@id=\"fcf\"]//option"));
for(WebElement ele:lead_Views)
{
	String st=ele.getText();
	//System.out.println(ele.getText());
	if(st.equals(data))
	{
		ele.click();
		extentReport.logTestInfo(data+ "clicked");
		break;
	}
	
}}

public void contactsDropdown(String data)
{
List<WebElement> contacts=driver.findElements(By.xpath("//*[@id='hotlist_mode']//option"));
for(WebElement ele:contacts)
{
	String st=ele.getText();
	//System.out.println(ele.getText());
	if(st.equals(data))
	{
		ele.click();
		extentReport.logTestInfo(data+ "clicked");
		break;
	}
	
}
}
public void contactsViewDropdown(String data)
{
List<WebElement> contactsView=driver.findElements(By.xpath("//*[@id=\"fcf\"]/option"));
for(WebElement ele:contactsView)
{
	String st=ele.getText();
	//System.out.println(ele.getText());
	if(st.equals(data))
	{
		ele.click();
		extentReport.logTestInfo(data+ "clicked");
		break;
	}
	
}}
public void contactName(String data)
{
	
	List<WebElement> contactsNames=driver.findElements(By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[1]/div/div[2]/table//tr//th//a"));
	for(WebElement ele:contactsNames)
	{
		String st=ele.getText();
		//System.out.println(ele.getText());
		if(st.equals(data))
		{
			ele.click();
			extentReport.logTestInfo(data+ "clicked");
			break;
		}
		
	}
}

public void selectedTabs(String data)
{
	
	List<WebElement> selectedTabs=driver.findElements(By.xpath("//*[@id=\"duel_select_1\"]//option"));
	for(WebElement ele:selectedTabs)
	{
		String st=ele.getText();
		//System.out.println(ele.getText());
		if(st.equals(data))
		{
			ele.click();
			mylog.info(data+ "clicked");
			break;
		}
		
	}
}
public void timeSelect(String data)
{
	List<WebElement> timeElements=driver.findElements(By.xpath("//*[@id=\"calTableBody\"]/tr[2]//div"));
	for(WebElement ele:timeElements)
	{
		String st=ele.getText();
		//System.out.println(ele.getText());
		if(st.equals(data))
		{
			ele.click();
			mylog.info(data+ "clicked");
			break;
		}
		
	}	
}

public void comboBox(String data)
{
	List<WebElement> elements=driver.findElements(By.xpath("//html/body/div[2]//ul//li//a"));
	for(WebElement ele:elements)
	{
		String st=ele.getText();
		//System.out.println(ele.getText());
		if(st.equals(data))
		{
			ele.click();
			mylog.info(data+ "clicked");
			break;
		}
		
	}	
}

public void eventEndTime(String data)
{
	List<WebElement> elements=driver.findElements(By.xpath("//*[@id=\"simpleTimePicker\"]//div"));
	for(WebElement ele:elements)
	{
		String st=ele.getText();
		//System.out.println(ele.getText());
		if(st.equals(data))
		{
			ele.click();
			mylog.info(data+ "clicked");
			break;
		}
		
	}	
}

public void EndDate(String data)
{
	 List<WebElement> allDate=driver.findElements(By.xpath("//*[@id=\"datePickerCalendar\"]//td"));
	    for(WebElement ele:allDate)
	    {
	    	String dt=ele.getText();
	    	if(dt.equals(data))
	    	{
	    		ele.click();
	    		mylog.info(data+ "clicked");
	    		break;
	    	}
	    }
}
}
