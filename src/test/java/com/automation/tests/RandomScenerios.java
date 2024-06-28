package com.automation.tests;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.base.Base_Salesforce;

public class RandomScenerios extends Base_Salesforce{
	
	@Test
	public void checkFirstandLastName()
	{
		login_Salesforce();
		tabBar("Home");
		WebElement Profname=driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a"));
	    clickElement(Profname,"Profile Name");
	}
	@Test
	public void editedLastName()
	{
		login_Salesforce();
		tabBar("Home");
		WebElement Profname=driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[1]/h1/a"));
	    clickElement(Profname,"Profile Name");
	  
	    WebElement editProf=driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']"));
	    clickElement(editProf,"Edit Prof");
	    switch_Frames();
	    WebElement about=driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a"));
	    clickElement(about,"About");
	  
	    WebElement lastName=driver.findElement(By.xpath("//*[@id=\"lastName\"]"));
	    enterText(lastName,"abcd","lastname");
	  
	    WebElement saveAll=driver.findElement(By.xpath("//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]"));
	    clickElement(saveAll,"Save and All");
	    
	    
	}
	@Test
	public void verifyTabCustamization()
	{
		 login_Salesforce();
		 WebElement AllTabs=driver.findElement(By.xpath("//img[@title='All Tabs']"));
		 clickElement(AllTabs,"AllTabs");
		 WebElement custMyTabs=driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[1]/table/tbody/tr/td[2]/input"));
		 clickElement(custMyTabs,"Customize on Tabs");
		 selectedTabs("Chatter");
		
		 WebElement remove=driver.findElement(By.xpath("//img[@title='Remove']"));
		 clickElement(remove,"Remove");
		
		 WebElement save=driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
		 clickElement(save,"Save");
		 userNameClick();
		 userNameDropdown("Logout");
		 login_Salesforce();
	}
	@Test
	public void blockingEvent()
	{
		login_Salesforce();
		tabBar("Home");
		WebElement dateTime=driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[2]/a"));
		clickElement(dateTime,"Date and Time");
		timeSelect("8:00 PM");
		WebElement subjectCombo=driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a/img"));
		clickElement(subjectCombo,"Subject and Combo");
		String parent=driver.getWindowHandle();

	    Set<String>s=driver.getWindowHandles();

	    // Now iterate using Iterator
	    Iterator<String> I1= s.iterator();

	    while(I1.hasNext())
	    {

	    String child_window=I1.next();


	    if(!parent.equals(child_window))
	    {
	    driver.switchTo().window(child_window);
	    System.out.println(driver.switchTo().window(child_window).getTitle());
	    comboBox("Other");
	    
	    }
		
	}
	    driver.switchTo().window(parent);
	   
	    WebElement endTime=driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
		clickElement(endTime,"End Time");
		eventEndTime("9:00 PM");
		
		 WebElement save=driver.findElement(By.xpath("//td[@id='topButtonRow']//input[@title='Save']"));
	     clickElement(save,"Save");
			
	    }
	@Test
	public void weeklyReccurance()
	{
		login_Salesforce();
		tabBar("Home");
		WebElement dateTime=driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[2]/a"));
		clickElement(dateTime,"Date and Time");
		timeSelect("7:00 PM");
		WebElement subjectCombo=driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/a/img"));
		clickElement(subjectCombo,"Subject and Combo");
		String parent=driver.getWindowHandle();

	    Set<String>s=driver.getWindowHandles();

	    // Now iterate using Iterator
	    Iterator<String> I1= s.iterator();

	    while(I1.hasNext())
	    {

	    String child_window=I1.next();


	    if(!parent.equals(child_window))
	    {
	    driver.switchTo().window(child_window);
	    System.out.println(driver.switchTo().window(child_window).getTitle());
	    comboBox("Other");
	    
	    }
		
	}
	    driver.switchTo().window(parent);
	   
	    WebElement endTime=driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
		clickElement(endTime,"End Time");
		eventEndTime("7:00 PM");
		
		WebElement createRecurrance=driver.findElement(By.xpath("//input[@id='IsRecurrence']"));
		clickElement(createRecurrance,"Create Recurrance check box");
		
		WebElement weekly=driver.findElement(By.xpath("//input[@id='rectypeftw']"));
		clickElement(weekly,"Weekly");
		
		WebElement endDate=driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']"));
		clickElement(endDate,"end Date");
		WebElement nextMonth=driver.findElement(By.xpath("//img[@title='Next Month']"));
		clickElement(nextMonth,"nextMonth");
		EndDate("10");
		WebElement save=driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
	    clickElement(save,"Save");

		
}
}
