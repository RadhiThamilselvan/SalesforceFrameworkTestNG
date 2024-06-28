package com.automation.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.base.Base_Salesforce;

public class Lead extends Base_Salesforce{
	
	public void Leads()
	{
		login_Salesforce();
		tabBar("Leads");

}
	
	public void LeadsSelectView()
	{
		login_Salesforce();
		tabBar("Leads");
		Leads_SelectDrop();
}
	
	public void default_View()
	{
		login_Salesforce();
		tabBar("Leads");
		Leads_SelectDropdown("Today's Leads");
		   WebElement Go=driver.findElement(By.xpath("//input[@title='Go!']"));
		    clickElement(Go,"Go");
		    userNameDropdown("Logout");
		    login_Salesforce();
		    tabBar("Leads");
		    WebElement lead_View1=driver.findElement(By.xpath("//*[@id=\"fcf\"]"));
		    String s=lead_View1.getAttribute("value");
		    
		    System.out.print(s);
	}
	public void todays_Leads()
	{
		login_Salesforce();
		tabBar("Leads");
		Leads_SelectDropdown("Today's Leads");
	}
	@Test
	public void leads_New()
	{
		login_Salesforce();
		tabBar("Leads");
		WebElement new1=driver.findElement(By.xpath("//input[@title='New']"));
		clickElement(new1,"New");
		
		WebElement lastName=driver.findElement(By.xpath("//input[@id='name_lastlea2']"));
	    enterText(lastName,"ABCD","lastname");
	   WebElement companyName=driver.findElement(By.xpath("//*[@id=\"lea3\"]"));
	    enterText(companyName,"ABCD","company name");
	    WebElement save=driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[1]"));
		clickElement(save,"Save");
	  
	  
	}
}