package com.automation.tests;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.automation.base.Base_Salesforce;

public class UsermenuDropdown extends Base_Salesforce {
	
	
	public void userName()
	{
		login_Salesforce();
		
		userNameClick();
		
	}
	
   public void myProfile() throws InterruptedException
   {
		
		login_Salesforce();
	    WebElement user=driver.findElement(By.id("userNavLabel"));
	    userNameClick();
	    userNameDropdown("My Profile");
	    
	  //li[@class="publisherFeedItemTypeChoice"]/a/span
	  Thread.sleep(5000);
	  WebElement edit=driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']"));
	  String objectName2="editPencil";
	  actionsMoveTo(edit,objectName2);
	  Thread.sleep(5000);
	  switch_Frames();
	  WebElement about=driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a"));
	  clickElement(about,"About");
	  WebElement lastname=driver.findElement(By.xpath("//input[@id=\"lastName\"]"));
	  clear1(lastname);
	  String lastName="Thamilselvan";
	  enterText(lastname,lastName,"Lastname");
	
	  WebElement saveAll=driver.findElement(By.xpath("//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]"));
	  clickElement(saveAll,"SaveAll");
	  default1_Frame();
	 
	  my_Profile("Post");
	  Thread.sleep(5000);
	  switch_FrameByIndex(0);
	 
	  Thread.sleep(2000);
	  WebElement textArea=driver.findElement(By.xpath("//html[@dir=\"ltr\"]/body"));
	  actionsMoveTo(textArea,"Textarea");
	  String Text="Hi Hello";
	  Thread.sleep(2000);
	  enter_TextArea(textArea,Text,"Text");
	  default1_Frame();
	 
	  my_Profile("File");
	  
	  WebElement open_File=driver.findElement(By.xpath("//a[@id=\"chatterUploadFileAction\"] "));
	  actionsMoveTo(open_File,"File");
	  WebElement choose_File=driver.findElement(By.xpath("//*[@id=\"chatterFile\"] "));
	   
	  choose_File.sendKeys("C:\\Radhi\\Testing\\Exceptions.txt");
	  WebElement add_photo=driver.findElement(By.xpath("//a[@id='uploadLink']"));
	  actionsMoveTo(add_photo,"AddPhoto");
	  String ID="uploadPhotoContentId";
	  switch_FrameByID(ID);
	
	  WebElement choose_FilePhoto=driver.findElement(By.xpath("//*[@id=\"j_id0:uploadFileForm:uploadInputFile\"] "));
	  choose_FilePhoto.sendKeys("C:\\Users\\mani8\\OneDrive\\Desktop\\new.jpg");
	
	  WebElement ele = driver.findElement(By.xpath("/html/body/span/form/div[3]/input[2]"));

	  explicit_Waits(ele);
	  ele.click();
	  Thread.sleep(5000);
	  WebElement save = driver.findElement(By.xpath("/html/body/span/form/div[2]/input[1]"));
	  explicit_Waits(save);
	  save.click();
   }
 
 
	public void my_Settings() throws InterruptedException
	{
		login_Salesforce();
		
		WebElement user=driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
	    userNameClick();
	    userNameDropdown("My Settings");
	   
	    my_Settings("Personal");
	    WebElement login_History=driver.findElement(By.xpath("//span[@id=\"LoginHistory_font\"]"));
	    clickElement(login_History,"Login History");
	    WebElement dlink=driver.findElement(By.xpath("//*[@id=\"RelatedUserLoginHistoryList_body\"]/div/a"));
	    clickElement(dlink,"Download link");
	    
	    my_Settings("Display & Layout");
	    WebElement customize_Tab=driver.findElement(By.xpath("//span[@id='CustomizeTabs_font']"));
	    clickElement(customize_Tab,"Customize Tab");
	    WebElement select1=driver.findElement(By.xpath("//*[@id='p4']"));
		actionsMoveTo(select1,"Select");
	    
	    WebElement selectElement = driver.findElement(By.xpath("//select[@id='p4']"));
	    
	    selectByVisibleText(selectElement,"Salesforce Chatter");
	    WebElement select_drop=driver.findElement(By.xpath(" //*[@id=\"duel_select_0\"]"));
	    selectByVisibleText(select_drop,"Reports");
       
		 WebElement add_Button=driver.findElement(By.xpath("//*[@id=\"duel_select_0_right\"]/img"));
		  actionsMoveTo(add_Button,"ADD");
		  WebElement save_Button=driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
		  actionsMoveTo(save_Button,"Save");
		  WebElement email_Button=driver.findElement(By.xpath("//*[@id=\"EmailSetup_font\"]"));
		  actionsMoveTo(email_Button,"Email");
		  WebElement email_Set=driver.findElement(By.xpath("//*[@id=\"EmailSettings_font\"]"));
		  actionsMoveTo(email_Set,"Email Settings");
		  WebElement email_Name=driver.findElement(By.xpath("//*[@id=\"sender_name\"]"));
		  clear1(email_Name);
		  String emailName="Radhi Thamil";
		  String objectName2="Email name";
		  enterText(email_Name,emailName,objectName2);  
		  WebElement email_add=driver.findElement(By.xpath("//*[@id=\"sender_email\"]"));
		  clear1(email_add);
	      String email="rathi1810@gmail.com";
		  String objectName3="EmailAddress";
		  enterText(email_add,email,objectName3); 
		  WebElement yes_Button=driver.findElement(By.xpath("//*[@id=\"auto_bcc1\"]"));
		  actionsMoveTo(yes_Button,"YES");
		  WebElement save_Button1=driver.findElement(By.xpath("//*[@id=\"bottomButtonRow\"]/input[1]"));
		  actionsMoveTo(save_Button1,"Save");
		  WebElement cal_Button=driver.findElement(By.xpath("//*[@id=\"CalendarAndReminders_font\"]"));
		  actionsMoveTo(cal_Button,"Calendar and remainder");
		  WebElement act_Reamainder=driver.findElement(By.xpath("//*[@id=\"Reminders_font\"]"));
		  actionsMoveTo(act_Reamainder,"Activity Remainder");
		  WebElement open_win=driver.findElement(By.xpath("//*[@id=\"testbtn\"]"));
		  actionsMoveTo(open_win,"Open test");
	}
 
 public void userDropdown() throws InterruptedException
 {
	    login_Salesforce();
	    WebElement user=driver.findElement(By.id("userNavLabel"));
	    userNameClick();
	    userNameDropdown("Developer Console");
	   
	    
	  
	    
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
        Thread.sleep(2000);
	    driver.close();
	    Thread.sleep(2000);
 }

}
 }
 @Test
 public void logout()
 {
	 login_Salesforce();
	    WebElement user=driver.findElement(By.id("userNavLabel"));
	    userNameClick();
	    userNameDropdown("Logout");
	    
 }
	    }
