package com.automation.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.base.Base_Salesforce;

public class CreateOpty extends Base_Salesforce{
@Test
public void Opportunities()
{
	   login_Salesforce();
	   userNameClick();
	   tabBar("Opportunities");
	   WebElement select=driver.findElement(By.xpath("//select[@id='fcf']"));
	   clickElement(select,"Select");
	   opportunities_dropdown();
	    
}
@Test
public void createNewOpp()
{
	login_Salesforce();
	tabBar("Opportunities");
	WebElement new_Opp=driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
    clickElement(new_Opp,"New Opp");
    WebElement opp_name=driver.findElement(By.xpath("//*[@id=\"opp3\"]"));
    clickElement(opp_name,"Opp name");
    opp_name.sendKeys("radhi");
    //WebElement acc_name=driver.findElement(By.xpath("//*[@id=\"opp9\"]"));
    //acc_name.click();
    //acc_name.sendKeys("radhi");
    WebElement date=driver.findElement(By.xpath("//a[normalize-space()='6/23/2024']"));
    clickElement(date,"date");
    WebElement lead=driver.findElement(By.xpath("//*[@id=\"opp6\"]"));
    selectByText(lead,"Web","Web");
    WebElement prob=driver.findElement(By.xpath("//input[@id='opp12']"));
    clickElement(prob,"probability");
    prob.sendKeys("70");
    WebElement stage=driver.findElement(By.xpath("//*[@id=\"opp11\"]"));
    selectByText(stage,"Qualification","Stage");
    WebElement save=driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[@title='Save']"));
    clickElement(save,"Save");
	
}
@Test
public void Opp_Pipeline()
{
	login_Salesforce();
	tabBar("Opportunities");
   
    opportunities_Reports("Opportunity Pipeline");
}
public void testStuck_Opp()
{
	login_Salesforce();
	tabBar("Opportunities");
   
    opportunities_Reports("Stuck Opportunities");
}
public void Summary_Report()
{
	login_Salesforce();
	tabBar("Opportunities");
    WebElement select=driver.findElement(By.xpath("//select[@id='quarter_q']"));
    select.click();
    select(select, 1,"current Iq"); 
    WebElement select1=driver.findElement(By.xpath("//select[@id='open']"));
    select1.click();
    select(select1, 1,"Open");
    WebElement run=driver.findElement(By.xpath(" //*[@id=\"lead_summary\"]/table/tbody/tr[3]/td/input"));
    clickElement(run,"Run");
 
}
}
