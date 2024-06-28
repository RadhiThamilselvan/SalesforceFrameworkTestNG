package com.automation.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.base.Base_Salesforce;

public class Contact extends Base_Salesforce {
	
	public void CreateNewContact()
	{
		login_Salesforce();
		tabBar("Contacts");
		WebElement new1=driver.findElement(By.xpath("//input[@title='New']"));
		clickElement(new1,"New");
		
		WebElement lastName=driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
	    enterText(lastName,"thamilselvan","lastname");
	   WebElement accountName=driver.findElement(By.xpath("//input[@id='con4']"));
	    enterText(accountName,"radhi","account name");
	    WebElement save=driver.findElement(By.xpath("//*[@id=\"topButtonRow\"]/input[1]"));
		clickElement(save,"Save");
	}
	
public void Contact_NewView() throws InterruptedException
{
	login_Salesforce();
	tabBar("Contacts");
    WebElement create_View=driver.findElement(By.xpath("//a[normalize-space()='Create New View']"));
    clickElement(create_View,"Create View");
    WebElement view_name=driver.findElement(By.xpath("//input[@id='fname']"));
    enterText(view_name,"abcd", "view name");
    WebElement unique_view=driver.findElement(By.xpath("//input[@id='devname']"));
    unique_view.click();
    Thread.sleep(3000);
    System.out.print(unique_view.getAttribute("value"));
}

	public void recentlyCreated()
	{
		login_Salesforce();
		tabBar("Contacts");
		contactsDropdown("Recently Created");
		
	}
	
public void contacts_View() throws InterruptedException
{
	login_Salesforce();
	tabBar("Contacts");
	Thread.sleep(2000);
	contactsViewDropdown("My Contacts");
	
}
	public void contactNames_View() throws InterruptedException
	{
		login_Salesforce();
		tabBar("Contacts");
		Thread.sleep(2000);
		contactName("thamilselvan");
		
	}
	
public void contact_Errormsg() throws InterruptedException
{
	login_Salesforce();
	tabBar("Contacts");
	WebElement createNew=driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
    clickElement(createNew,"Create New View");
    WebElement unique=driver.findElement(By.xpath("//input[@id='devname']"));
    enterText(unique,"EFGH","unique Name");
    WebElement save=driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]"));
    clickElement(save,"Save");
    
    
}
@Test
	public void check_Cancel() throws InterruptedException
	{
		login_Salesforce();
		tabBar("Contacts");
		WebElement createNew=driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
	    clickElement(createNew,"Create New View");
	  
	    WebElement name=driver.findElement(By.xpath("//input[@id='fname']"));
	    enterText(name,"ABCD","Name");
	    WebElement unique=driver.findElement(By.xpath("//input[@id='devname']"));
	    enterText(unique,"EFGH","unique Name");
	    WebElement cancel=driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[2]"));
	    clickElement(cancel,"Cancel");
	    
	    
	}
@Test
public void check_SaveandNew() throws InterruptedException
{
	login_Salesforce();
	tabBar("Contacts");
	WebElement new1=driver.findElement(By.xpath("//input[@title='New']"));
	clickElement(new1,"New");
	
	WebElement lastName=driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
    enterText(lastName,"Indian","lastname");
   WebElement accountName=driver.findElement(By.xpath("//input[@id='con4']"));
    enterText(accountName,"Global Media","account name");
    WebElement save_New=driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@title='Save & New']"));
	clickElement(save_New,"Save & New");
    
    
}
}
