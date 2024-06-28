package com.automation.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.automation.base.Base_Salesforce;

public class Account extends Base_Salesforce {

@Test
public void create_Account()
{
	login_Salesforce();
    
    tabBar("Accounts");
    WebElement new_button=driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
    clickElement(new_button,"New");
    WebElement acc_Name=driver.findElement(By.id("acc2"));
    acc_Name.click();
    acc_Name.sendKeys("radhi");
    
    WebElement acc_Type=driver.findElement(By.xpath("//*[@id=\"acc6\"]"));
    acc_Type.click();
    selectByVisibleText(acc_Type,"Technology Partner");
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,350)", "");
  
    WebElement priority=driver.findElement(By.xpath("//*[@id=\"00Naj000002kXsg\"]"));
    priority.click();
    selectByVisibleText(priority,"High");
    WebElement save=driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
    clickElement(save,"Save");
  
}
@Test
public void createNewView() throws InterruptedException
{
	login_Salesforce();
	tabBar("Accounts");
    
    WebElement create_new=driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
    clickElement(create_new,"CreateNew");
    Thread.sleep(5000);
    WebElement new_Name=driver.findElement(By.xpath("//input[@id=\"fname\"]"));
    clickElement(new_Name,"New Name");
    new_Name.sendKeys("ramya");
    WebElement unique_Name=driver.findElement(By.xpath("//input[@id=\"devname\"]"));
    clickElement(unique_Name,"unique Name");
    new_Name.sendKeys("kitty");
 
    WebElement save=driver.findElement(By.xpath(" //*[@id=\"editPage\"]/div[1]/table/tbody/tr/td[2]/input[1]"));
    clickElement(save,"Save");
    
}
@Test
public void editView()
{
	
	login_Salesforce();
	tabBar("Accounts");
    WebElement view=driver.findElement(By.xpath("//*[@id=\"fcf\"]"));
    view.click();
    selectByVisibleText(view,"ramyakitty");
    WebElement edit=driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[1]"));
    clickElement(edit,"Edit");
    WebElement new_Name=driver.findElement(By.xpath("//input[@id=\"fname\"]"));
    clickElement(new_Name,"New Name");
    new_Name.clear();
    new_Name.sendKeys("John");
    WebElement select_acc=driver.findElement(By.id("fcol1"));
    clickElement(select_acc,"Select account");
    selectByVisibleText(select_acc,"Account Name");
    
    WebElement select_operator=driver.findElement(By.id("fop1"));
    clickElement(select_operator,"Select operator");
    selectByVisibleText(select_operator,"contains");
    WebElement select_val=driver.findElement(By.id("fval1"));
    enterText(select_val,"a","select val");
    WebElement save=driver.findElement(By.xpath("//*[@id=\"editPage\"]/div[3]/table/tbody/tr/td[2]/input[1]"));
    clickElement(save,"Save");
}
@Test
public void mergeAccount()
{
	login_Salesforce();
	 tabBar("Accounts");
      WebElement merge_Acc=driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a "));
      clickElement(merge_Acc,"Merge Account");
      WebElement merge_Text=driver.findElement(By.xpath("//*[@id=\"srch\"]"));
	    enterText(merge_Text,"radhi","merge Textbox");	    
	  
	    WebElement find_Button=driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[4]/input[2] "));
      clickElement(find_Button,"Find Button");
    
      WebElement check_Box1=driver.findElement(By.xpath(" //*[@id=\"cid2\"]"));
      clickElement(check_Box1,"Check Box1");
     
    
      WebElement next=driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[1]"));
      clickElement(next,"Next");
      WebElement merge=driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[1]/div/input[2]"));
      clickElement(merge,"Merge");
   //  alert_Accept();
    
    
      
  
}
@Test
public void createAccountReport() throws InterruptedException
{
	login_Salesforce();
	 tabBar("Accounts");
     Reports("Accounts with last activity > 30 days");
    WebElement account_lastActivity=driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div/div[1]/ul/li[2]/a"));
    clickElement(account_lastActivity,"Account with last activity");
    WebElement date_Field=driver.findElement(By.xpath("//*[@id=\"ext-gen148\"]"));
    clickElement(date_Field,"Create Date Field");
 
    WebElement create_Field=driver.findElement(By.xpath(" //div[text()=\"Created Date\"]"));
    create_Field.click();
    WebElement from_Date=driver.findElement(By.xpath("//*[@id=\"ext-gen152\"]"));
    clickElement(from_Date,"From Date Field");
   createActivityDate("13");
    WebElement to_Date=driver.findElement(By.xpath("//*[@id=\"ext-gen154\"]"));
    clickElement(to_Date,"To Date Field");
   Thread.sleep(3000);
    WebElement to_month=driver.findElement(By.xpath("/html[1]/body[1]/div[17]/ul[1]/li[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]"));
    System.out.print(to_month.getText());	   
    to_month.click();
    List<WebElement> to_Dates=driver.findElements(By.xpath("//div[@class=\"x-date-mp\"]//td"));
    for(WebElement ele:to_Dates)
    {
    	String dt=ele.getText();
    	if(dt.equals("Jun"))
    	{
    		ele.click();
    		System.out.print("ele clicked");
    		break;
    	}
    }
    WebElement ok_button=driver.findElement(By.xpath("//button[@class=\"x-date-mp-ok\"]"));
    clickElement(ok_button,"ok Button");
    
    WebElement today_Button=driver.findElement(By.xpath("/html[1]/body[1]/div[17]/ul[1]/li[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/table[1]/tbody[1]/tr[2]/td[2]/em[1]/button[1]"));
    clickElement(today_Button,"today Button");
    WebElement save_Button=driver.findElement(By.xpath("//*[@id=\"ext-gen49\"]"));
    clickElement(save_Button,"Save Button");
    WebElement name=driver.findElement(By.xpath("//*[@id=\"saveReportDlg_reportNameField\"]"));
    name.sendKeys("Report radhi");
  Thread.sleep(1000);
    WebElement report_unique=driver.findElement(By.xpath("//input[@id='saveReportDlg_DeveloperName']"));
    report_unique.sendKeys("_1");
  
    WebElement save_runbutton=driver.findElement(By.xpath("//button[text()='Save and Run Report']"));
    save_runbutton.click();
    }

}

