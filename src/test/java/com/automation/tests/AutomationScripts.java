package com.automation.tests;

import java.io.File;
import java.io.IOException;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.automation.base.Base_Salesforce;

public class AutomationScripts extends Base_Salesforce
{
	
	Logger mylog = LogManager.getLogger(AutomationScripts.class);
	public void forgot_Password() throws InterruptedException
	{
		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/ ");
		WebElement fpwd = driver.findElement(By.xpath("//a[@id=\"forgot_password_link\"]"));
		clickElement(fpwd,"loginButton");
		WebElement e=driver.findElement(By.xpath("//input[@id=\"username\"]"));
	    String userName="radhi@company.sandbox";
	    String objectName="username";
		enterText(e, userName,objectName);
		WebElement contButton=driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		clickElement(contButton,"Continue");
		
	}
	public void login_Attempt() throws InterruptedException
	{
		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/ ");
		WebElement e=driver.findElement(By.xpath("//input[@id=\"username\"]"));
	    String userName="123";
	    String objectName="username";
		enterText(e, userName,objectName);
		WebElement pw=driver.findElement(By.id("password"));
		String pwd="22131";
		String objectName1="password";
		
			enterText(pw,pwd,objectName1);
			WebElement e2=driver.findElement(By.id("Login"));
			clickElement(e2,"loginButton");
		WebElement er=driver.findElement(By.xpath("//div[@id=\"error\"]"));
		errorMessage(er);
	}
	public void username_Drop() throws InterruptedException
	{
		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/ ");
		WebElement e=driver.findElement(By.xpath("//input[@id=\"username\"]"));
	    String userName="radhi@company.sandbox";
	    String objectName="username";
		enterText(e, userName,objectName);
		WebElement pw=driver.findElement(By.id("password"));
		String pwd="Saikrisha@123";
		String objectName1="password";
		enterText(pw,pwd,objectName1);
	    WebElement e2=driver.findElement(By.id("Login"));
	    clickElement(e2,"loginButton");
	    WebElement e3=driver.findElement(By.id("userNavLabel"));
	    clickElement(e3,"usernamedropdown");
	    List<WebElement> elements=driver.findElements(By.xpath("//*[@id=\'userNav-menuItems\']/a"));
	    for(WebElement ele:elements) {
	    	System.out.println(ele.getText());
	    }
	  
	    WebElement e4=driver.findElement(By.xpath("//div[@class='mbrMenuItems']/a[3]"));
	    clickElement(e4,"DeveloperConsole");
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

	    driver.close();
	}}}
	public void my_Profile() throws InterruptedException
	{
		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/ ");
		WebElement e=driver.findElement(By.xpath("//input[@id=\"username\"]"));
	    String userName="radhi@company.sandbox";
	    String objectName="username";
		enterText(e, userName,objectName);
		WebElement pw=driver.findElement(By.id("password"));
		String pwd="Saikrisha@123";
		String objectName1="password";
		enterText(pw,pwd,objectName1);
	    WebElement e2=driver.findElement(By.id("Login"));
	    clickElement(e2,"loginButton");
	    WebElement e3=driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
	    clickElement(e3,"usernamedropdown");
	    WebElement e4=driver.findElement(By.xpath("//div[@class='mbrMenuItems']/a[1]"));
	    clickElement(e4,"MyProfile");
	    //String window=getCurrentWindow();
	    Thread.sleep(5000);
	    WebElement e5=driver.findElement(By.xpath("//a[@class='contactInfoLaunch editLink']//img[@title='Edit Profile']"));
	    String objectName2="editPencil";
	    actionsMoveTo(e5,objectName2);
	  Thread.sleep(5000);
	  switch_Frames();
	  WebElement e6=driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a"));
	  clickElement(e6,"About");
	  WebElement e7=driver.findElement(By.xpath("//input[@id=\"lastName\"]"));
	 clear1(e7);
	  String lastName="Thamilselvan";
	  enterText(e7,lastName,"Lastname");
	
	  WebElement e8=driver.findElement(By.xpath("//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]"));
	  clickElement(e8,"SaveAll");
	  default1_Frame();
	  WebElement e9=driver.findElement(By.xpath("//*[@id=\"publisherAttachTextPost\"]/span[1]"));
	  clickElement(e9,"Post");
	  Thread.sleep(5000);
	  switch_FrameByIndex(0);
	 
	 Thread.sleep(2000);
	  WebElement e11=driver.findElement(By.xpath("//html[@dir=\"ltr\"]/body"));
	  actionsMoveTo(e11,"Textarea");
	  String Text="Hi Hello";
	  Thread.sleep(2000);
	  enter_TextArea(e11,Text,"Text");
	  default1_Frame();
	  WebElement file=driver.findElement(By.xpath("//a[@title=\"File\"]"));
	  clickElement(file,"File");
	  //Thread.sleep(5000);
	  WebElement open_File=driver.findElement(By.xpath("//a[@id=\"chatterUploadFileAction\"] "));
	  actionsMoveTo(open_File,"File");
	  WebElement choose_File=driver.findElement(By.xpath("//*[@id=\"chatterFile\"] "));
	  //actionsMoveTo(choose_File,"File"); 
	  choose_File.sendKeys("C:\\Radhi\\Testing\\Exceptions.txt");
	  WebElement add_photo=driver.findElement(By.xpath("//a[@id='uploadLink']"));
	  actionsMoveTo(add_photo,"AddPhoto");
	  String ID="uploadPhotoContentId";
	  switch_FrameByID(ID);
	
	  WebElement choose_FilePhoto=driver.findElement(By.xpath("//*[@id=\"j_id0:uploadFileForm:uploadInputFile\"] "));
	  choose_FilePhoto.sendKeys("C:\\Users\\mani8\\OneDrive\\Desktop\\new.jpg");
	
	WebElement ele = driver.findElement(By.xpath("/html/body/span/form/div[3]/input[2]"));
	mylog.info(ele.isEnabled());
	explicit_Waits(ele);
	ele.click();
	Thread.sleep(5000);
	WebElement save = driver.findElement(By.xpath("/html/body/span/form/div[2]/input[1]"));
	explicit_Waits(save);
	save.click();
	
	}
	public void my_Settings() throws InterruptedException
	{
		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/ ");
		WebElement e=driver.findElement(By.xpath("//input[@id=\"username\"]"));
	    String userName="radhi@company.sandbox";
	    String objectName="username";
		enterText(e, userName,objectName);
		WebElement pw=driver.findElement(By.id("password"));
		String pwd="Saikrisha@123";
		String objectName1="password";
		enterText(pw,pwd,objectName1);
	    WebElement e2=driver.findElement(By.id("Login"));
	    clickElement(e2,"loginButton");
	    WebElement e3=driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
	    clickElement(e3,"usernamedropdown");
	    WebElement my_Settings=driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[2]"));
	    clickElement(my_Settings,"My Settings");
	    WebElement personal=driver.findElement(By.xpath("//span[@id='PersonalInfo_font']"));
	    clickElement(personal,"Personal");
	    WebElement login_History=driver.findElement(By.xpath("//span[@id=\"LoginHistory_font\"]"));
	    clickElement(login_History,"Login History");
	    WebElement dlink=driver.findElement(By.xpath("//*[@id=\"RelatedUserLoginHistoryList_body\"]/div/a"));
	    clickElement(dlink,"Download link");
	    WebElement display_layout=driver.findElement(By.xpath("//span[@id='DisplayAndLayout_font']"));
	    clickElement(display_layout,"Display and Layout");
	    WebElement customize_Tab=driver.findElement(By.xpath("//span[@id='CustomizeTabs_font']"));
	    clickElement(customize_Tab,"Customize Tab");
	    WebElement select1=driver.findElement(By.xpath("//*[@id='p4']"));
		  actionsMoveTo(select1,"Select");
	    
	    WebElement selectElement = driver.findElement(By.xpath("//select[@id='p4']"));
	    Select select = new Select(selectElement);
	    select.selectByVisibleText("Salesforce Chatter");
	     WebElement select_drop=driver.findElement(By.xpath(" //*[@id=\"duel_select_0\"]/option[101]"));
	     select_drop.click();
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
	public void log_Out() throws InterruptedException
	{
		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/ ");
		WebElement e=driver.findElement(By.xpath("//input[@id=\"username\"]"));
	    String userName="radhi@company.sandbox";
	    String objectName="username";
		enterText(e, userName,objectName);
		WebElement pw=driver.findElement(By.id("password"));
		String pwd="Saikrisha@123";
		String objectName1="password";
		enterText(pw,pwd,objectName1);
	    WebElement e2=driver.findElement(By.id("Login"));
	    clickElement(e2,"loginButton");
	    WebElement userName1=driver.findElement(By.id("userNavLabel"));
	  userNameClick();
	    //WebElement log_out=driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]"));
	    List<WebElement> elements=driver.findElements(By.xpath("//*[@id=\'userNav-menuItems\']/a"));
	  // userNameDropdown("Logout",elements);
	}
	
	public void amazon()
	{
		launchBrowser("chrome");
		goToUrl("https://www.amazon.com/ ");
		WebElement all=driver.findElement(By.xpath("//*[@id=\"nav-main\"]/div[1]/a"));	
		clickElement(all,"All");
	}
	public void frames()
	{
		launchBrowser("chrome");
		goToUrl("https://the-internet.herokuapp.com/frames ");
		WebElement nested_frame=driver.findElement(By.xpath("//*[@id=\"content\"]/div/ul/li[1]/a"));	
		clickElement(nested_frame,"Nested frame");
		WebElement top=driver.findElement(By.xpath("//frame[@src=\"/frame_top\"]"));
		switch_Frames1(top,"top");
		WebElement left=driver.findElement(By.xpath("//frame[@src=\"/frame_left\"]"));
		switch_Frames1(left,"left");
		WebElement left_Text=driver.findElement(By.xpath("/html/body"));
		System.out.println(left_Text.getText());
		driver.switchTo().parentFrame();
		WebElement middle=driver.findElement(By.xpath("//frame[@src=\"/frame_middle\"]"));
		switch_Frames1(middle,"middle");
		WebElement middle_Text=driver.findElement(By.xpath("/html/body"));
		System.out.println(middle_Text.getText());
		driver.switchTo().parentFrame();
		WebElement right=driver.findElement(By.xpath("//frame[@src=\"/frame_right\"]"));
		switch_Frames1(right,"right");
		WebElement right_Text=driver.findElement(By.xpath("/html/body"));
		System.out.println(right_Text.getText());
		default1_Frame();
		WebElement bottom=driver.findElement(By.xpath("//frame[@src=\"/frame_bottom\"]"));
		switch_Frames1(bottom,"bottom");
		WebElement bottom_Text=driver.findElement(By.xpath("/html/body"));
		System.out.println(bottom_Text.getText());
		
	}
	public void tables() throws InterruptedException
	{
		launchBrowser("chrome");
		driver.get("https://qa-tekarch.firebaseapp.com/");
		Thread.sleep(5000);		
		WebElement username= driver.findElement(By.id("email_field"));
		username.sendKeys("admin123@gmail.com");

		
		WebElement password=driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");


		WebElement loginButton=driver.findElement(By.tagName("button"));
		loginButton.click();
		WebElement widget=driver.findElement(By.xpath("//button[contains(text(),'Widget')]"));	
		Thread.sleep(5000);
		actionsMoveTo(widget,"Widget");
		WebElement table=driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[1]/div[3]/div/a[1]"));	
		clickElement(table,"Table");
		WebElement allTable=driver.findElement(By.xpath("//table/tbody"));
		List<WebElement> rows=allTable.findElements(By.xpath("//tr"));
		//System.out.print(rows.size());
		List<WebElement> theads=driver.findElements(By.xpath("//th"));
		for(WebElement head:theads)
		{
			System.out.print(head.getText());
		}
		//System.out.println();
		for(WebElement row:rows)
		{
			List<WebElement> cells=row.findElements(By.tagName("td"));
			for(WebElement cell:cells)
			{
				System.out.print(cell.getText()+" ");
				
			}
			System.out.println();
		}
		
		
	}
	public void screenShot() throws InterruptedException, IOException
	{
		launchBrowser("chrome");
		driver.get("https://qa-tekarch.firebaseapp.com/");
		Thread.sleep(5000);		
		WebElement username= driver.findElement(By.id("email_field"));
		username.sendKeys("admin123@gmail.com");

		
		WebElement password=driver.findElement(By.id("password_field"));
		password.sendKeys("admin123");

        String dt=currentDateTime();
       
        StringBuffer sb = new StringBuffer("screenShot ");
        StringBuffer s1=sb.append(dt);
        System.out.print(s1);
     
		WebElement loginButton=driver.findElement(By.tagName("button"));
		loginButton.click();
		WebElement widget=driver.findElement(By.xpath("//button[contains(text(),'Widget')]"));	
		Thread.sleep(5000);
		//actionsMoveTo(widget,"Widget");
		File sourceFile=widget.getScreenshotAs(OutputType.FILE);
		String curDir=System.getProperty("user.dir");
		File destFile=new File(curDir+"/results/screenshot/+sb.append(dt)"+".png");
		FileUtils.copyFile(sourceFile, destFile);
		
	}
	public void createAnAccount() throws InterruptedException
	{
		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/ ");
		WebElement e=driver.findElement(By.xpath("//input[@id=\"username\"]"));
	    String userName="radhi@company.sandbox";
	    String objectName="username";
		enterText(e, userName,objectName);
		WebElement pw=driver.findElement(By.id("password"));
		String pwd="Saikrisha@123";
		String objectName1="password";
		enterText(pw,pwd,objectName1);
	    WebElement e2=driver.findElement(By.id("Login"));
	    clickElement(e2,"loginButton");
	    WebElement account=driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a"));
	    clickElement(account,"Account");
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
	public void createNewView() throws InterruptedException
	{
		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/ ");
		WebElement e=driver.findElement(By.xpath("//input[@id=\"username\"]"));
	    String userName="radhi@company.sandbox";
	    String objectName="username";
		enterText(e, userName,objectName);
		WebElement pw=driver.findElement(By.id("password"));
		String pwd="Saikrisha@123";
		String objectName1="password";
		enterText(pw,pwd,objectName1);
	    WebElement e2=driver.findElement(By.id("Login"));
	    clickElement(e2,"loginButton");
	    WebElement account=driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a"));
	    clickElement(account,"Account");
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
	public void editView()
	{
		
		launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/ ");
		WebElement e=driver.findElement(By.xpath("//input[@id=\"username\"]"));
	    String userName="radhi@company.sandbox";
	    String objectName="username";
		enterText(e, userName,objectName);
		WebElement pw=driver.findElement(By.id("password"));
		String pwd="Saikrisha@123";
		String objectName1="password";
		enterText(pw,pwd,objectName1);
	    WebElement e2=driver.findElement(By.id("Login"));
	    clickElement(e2,"loginButton");
	    WebElement account=driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a"));
	    clickElement(account,"Account");
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
	  public void mergeAccount()
	  {
			launchBrowser("chrome");
			goToUrl("https://login.salesforce.com/ ");
			WebElement e=driver.findElement(By.xpath("//input[@id=\"username\"]"));
		    String userName="radhi@company.sandbox";
		    String objectName="username";
			enterText(e, userName,objectName);
			WebElement pw=driver.findElement(By.id("password"));
			String pwd="Saikrisha@123";
			String objectName1="password";
			enterText(pw,pwd,objectName1);
		    WebElement e2=driver.findElement(By.id("Login"));
		    clickElement(e2,"loginButton");
		    WebElement account=driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a"));
		    clickElement(account,"Account");
	  
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
	        alert_Accept();
	      
	      
	        
	    
	}
	  public void create_AccountReport() throws InterruptedException
	  {
	  launchBrowser("chrome");
		goToUrl("https://login.salesforce.com/ ");
		WebElement e=driver.findElement(By.xpath("//input[@id=\"username\"]"));
	    String userName="radhi@company.sandbox";
	    String objectName="username";
		enterText(e, userName,objectName);
		WebElement pw=driver.findElement(By.id("password"));
		String pwd="Saikrisha@123";
		String objectName1="password";
		enterText(pw,pwd,objectName1);
	    WebElement e2=driver.findElement(By.id("Login"));
	    clickElement(e2,"loginButton");
	    WebElement account=driver.findElement(By.xpath("//*[@id=\"Account_Tab\"]/a"));
	    clickElement(account,"Account");
	    WebElement account_lastActivity=driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[1]/div/div/div[1]/ul/li[2]/a"));
	    clickElement(account_lastActivity,"Account with last activity");
	    WebElement date_Field=driver.findElement(By.xpath("//*[@id=\"ext-gen148\"]"));
	    clickElement(date_Field,"Create Date Field");
	 
	    WebElement create_Field=driver.findElement(By.xpath(" //div[text()=\"Created Date\"]"));
	    create_Field.click();
	    WebElement from_Date=driver.findElement(By.xpath("//*[@id=\"ext-gen152\"]"));
	    clickElement(from_Date,"From Date Field");
	    List<WebElement> allDate=driver.findElements(By.xpath("//td[@class=\"x-date-active\"]//a"));
	    for(WebElement ele:allDate)
	    {
	    	String dt=ele.getText();
	    	if(dt.equals("13"))
	    	{
	    		ele.click();
	    		break;
	    	}
	    }
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

public void opportunities_Dropdown()
{
	    login_Salesforce();
	    WebElement user_Drop=driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
	    clickElement(user_Drop,"usernamedropdown");
	    WebElement my_Prof=driver.findElement(By.xpath("//div[@class='mbrMenuItems']/a[1]"));
	    clickElement(my_Prof,"MyProfile");
	    List<WebElement> tab_Bar=driver.findElements(By.xpath("/html/body/div[1]/div[1]/div/div/nav/ul//li//a"));
	    for(WebElement ele:tab_Bar)
	    {
	    	String st=ele.getText();
	    	//System.out.println(ele.getText());
	    	if(st.equals("Opportunities"))
	    	{
	    		ele.click();
	    		break;
	    	}
	    }
	    WebElement select=driver.findElement(By.xpath("//select[@id='fcf']"));
	    clickElement(select,"Select");
	    List<WebElement> opp_Drop=driver.findElements(By.xpath("//select[@id=\'fcf\']//option"));
	    for(WebElement ele:opp_Drop)
	    {
	    	//String st=ele.getText();
	    	System.out.println(ele.getText());
	    	
	    }
	    
}
public void createNew_Opty()
{
	login_Salesforce();
    WebElement user_Drop=driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
    clickElement(user_Drop,"usernamedropdown");
    WebElement my_Prof=driver.findElement(By.xpath("//div[@class='mbrMenuItems']/a[1]"));
    clickElement(my_Prof,"MyProfile");
    List<WebElement> tab_Bar=driver.findElements(By.xpath("/html/body/div[1]/div[1]/div/div/nav/ul//li//a"));
    for(WebElement ele:tab_Bar)
    {
    	String st=ele.getText();
    	//System.out.println(ele.getText());
    	if(st.equals("Opportunities"))
    	{
    		ele.click();
    		break;
    	}
    }
    WebElement new_Opp=driver.findElement(By.xpath("//*[@id=\"hotlist\"]/table/tbody/tr/td[2]/input"));
    clickElement(new_Opp,"New Opp");
    WebElement opp_name=driver.findElement(By.xpath("//*[@id=\"opp3\"]"));
    clickElement(opp_name,"Opp name");
    opp_name.sendKeys("radhi");
    WebElement acc_name=driver.findElement(By.xpath("//*[@id=\"opp4\"]"));
    acc_name.click();
    acc_name.sendKeys("radhi_bhel");
    WebElement date=driver.findElement(By.xpath("//a[normalize-space()='6/16/2024']"));
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
	  
public void Opp_Pipeline()
{
	login_Salesforce();
    WebElement user_Drop=driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
    clickElement(user_Drop,"usernamedropdown");
    WebElement my_Prof=driver.findElement(By.xpath("//div[@class='mbrMenuItems']/a[1]"));
    clickElement(my_Prof,"MyProfile");
    List<WebElement> tab_Bar=driver.findElements(By.xpath("/html/body/div[1]/div[1]/div/div/nav/ul//li//a"));
    for(WebElement ele:tab_Bar)
    {
    	String st=ele.getText();
    	//System.out.println(ele.getText());
    	if(st.equals("Opportunities"))
    	{
    		ele.click();
    		break;
    	}
    }
    WebElement opp_Pipe=driver.findElement(By.xpath("//a[normalize-space()='Opportunity Pipeline']"));
    clickElement(opp_Pipe,"Opp Pipeline"); 
}
public void testStuck_Opp()
{
	login_Salesforce();
    WebElement user_Drop=driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
    clickElement(user_Drop,"usernamedropdown");
    WebElement my_Prof=driver.findElement(By.xpath("//div[@class='mbrMenuItems']/a[1]"));
    clickElement(my_Prof,"MyProfile");
    List<WebElement> tab_Bar=driver.findElements(By.xpath("/html/body/div[1]/div[1]/div/div/nav/ul//li//a"));
    for(WebElement ele:tab_Bar)
    {
    	String st=ele.getText();
    	//System.out.println(ele.getText());
    	if(st.equals("Opportunities"))
    	{
    		ele.click();
    		break;
    	}
    	 WebElement test_Stuck=driver.findElement(By.xpath("//a[normalize-space()='Stuck Opportunities']"));
    	 clickElement(test_Stuck,"Test Stuck");
}}
public void Summary_Report()
{
	login_Salesforce();
    WebElement user_Drop=driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
    clickElement(user_Drop,"usernamedropdown");
    WebElement my_Prof=driver.findElement(By.xpath("//div[@class='mbrMenuItems']/a[1]"));
    clickElement(my_Prof,"MyProfile");
    List<WebElement> tab_Bar=driver.findElements(By.xpath("/html/body/div[1]/div[1]/div/div/nav/ul//li//a"));
    for(WebElement ele:tab_Bar)
    {
    	String st=ele.getText();
    	//System.out.println(ele.getText());
    	if(st.equals("Opportunities"))
    	{
    		ele.click();
    		break;
    	}
    }
    WebElement select=driver.findElement(By.xpath("//select[@id='quarter_q']"));
    select.click();
    select(select, 1,"current Iq"); 
    WebElement select1=driver.findElement(By.xpath("//select[@id='open']"));
    select1.click();
    select(select1, 1,"Open");
    WebElement run=driver.findElement(By.xpath(" //*[@id=\"lead_summary\"]/table/tbody/tr[3]/td/input"));
    clickElement(run,"Run");
 
}
public void lead()
{
	login_Salesforce();
    WebElement user_Drop=driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
    clickElement(user_Drop,"usernamedropdown");
    WebElement my_Prof=driver.findElement(By.xpath("//div[@class='mbrMenuItems']/a[1]"));
    clickElement(my_Prof,"MyProfile");
    List<WebElement> tab_Bar=driver.findElements(By.xpath("/html/body/div[1]/div[1]/div/div/nav/ul//li//a"));
    for(WebElement ele:tab_Bar)
    {
    	String st=ele.getText();
    	//System.out.println(ele.getText());
    	if(st.equals("Leads"))
    	{
    		ele.click();
    		break;
    	}
    }}
public void leadSelectView()
{
	login_Salesforce();
	WebElement user_Drop=driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
    clickElement(user_Drop,"usernamedropdown");
	WebElement my_Prof=driver.findElement(By.xpath("//div[@class='mbrMenuItems']/a[1]"));
    clickElement(my_Prof,"MyProfile");
    List<WebElement> tab_Bar=driver.findElements(By.xpath("/html/body/div[1]/div[1]/div/div/nav/ul//li//a"));
    for(WebElement ele:tab_Bar)
    {
    	String st=ele.getText();
    	//System.out.println(ele.getText());
    	if(st.equals("Leads"))
    	{
    		ele.click();
    		break;
    	}
    }
    WebElement lead_View=driver.findElement(By.xpath("//*[@id=\"fcf\"]"));
    clickElement(lead_View,"Lead");
    List<WebElement> lead_Views=driver.findElements(By.xpath("//*[@id=\"fcf\"]//option"));
    for(WebElement ele:lead_Views)
    {
    	//String st=ele.getText();
    	System.out.println(ele.getText());
    	
    }

}
public void func_Go()
{
	login_Salesforce();
	WebElement user_Drop=driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
    clickElement(user_Drop,"usernamedropdown");
	WebElement my_Prof=driver.findElement(By.xpath("//div[@class='mbrMenuItems']/a[1]"));
    clickElement(my_Prof,"MyProfile");
    List<WebElement> tab_Bar=driver.findElements(By.xpath("/html/body/div[1]/div[1]/div/div/nav/ul//li//a"));
    for(WebElement ele:tab_Bar)
    {
    	String st=ele.getText();
    	//System.out.println(ele.getText());
    	if(st.equals("Leads"))
    	{
    		ele.click();
    		break;
    	}
    }
    WebElement lead_View=driver.findElement(By.xpath("//*[@id=\"fcf\"]"));
    clickElement(lead_View,"Lead");
    List<WebElement> lead_Views=driver.findElements(By.xpath("//*[@id=\"fcf\"]//option"));
    for(WebElement ele:lead_Views)
    {
    	String st=ele.getText();
    	//System.out.println(ele.getText());
    	if(st.equals("Today's Leads"))
    	{
    		ele.click();
    		break;
    	}
    	
    }
    WebElement Go=driver.findElement(By.xpath("//input[@title='Go!']"));
    clickElement(Go,"Go");
    WebElement user_Drop1=driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
    clickElement(user_Drop1,"usernamedropdown");
	WebElement logout=driver.findElement(By.xpath("//div[@class='mbrMenuItems']/a[5]"));
    clickElement(logout,"LogOut");
    login_Salesforce();
    WebElement user_Drop2=driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
    clickElement(user_Drop2,"usernamedropdown");
	WebElement my_Prof2=driver.findElement(By.xpath("//div[@class='mbrMenuItems']/a[1]"));
    clickElement(my_Prof2,"MyProfile");
    List<WebElement> tab_Bar1=driver.findElements(By.xpath("/html/body/div[1]/div[1]/div/div/nav/ul//li//a"));
    for(WebElement ele:tab_Bar1)
    {
    	String st=ele.getText();
    	//System.out.println(ele.getText());
    	if(st.equals("Leads"))
    	{
    		ele.click();
    		break;
    	}
    }
    WebElement lead_View1=driver.findElement(By.xpath("//*[@id=\"fcf\"]"));
    String s=lead_View1.getAttribute("value");
    
    System.out.print(s);
   

}
	public void Contact_NewView() throws InterruptedException
	{
		login_Salesforce();
		WebElement user_Drop=driver.findElement(By.xpath("//*[@id=\"userNavLabel\"]"));
	    clickElement(user_Drop,"usernamedropdown");
		WebElement my_Prof=driver.findElement(By.xpath("//div[@class='mbrMenuItems']/a[1]"));
	    clickElement(my_Prof,"MyProfile");
	    List<WebElement> tab_Bar=driver.findElements(By.xpath("/html/body/div[1]/div[1]/div/div/nav/ul//li//a"));
	    for(WebElement ele:tab_Bar)
	    {
	    	String st=ele.getText();
	    	//System.out.println(ele.getText());
	    	if(st.equals("Contacts"))
	    	{
	    		ele.click();
	    		break;
	    	}
	    }
	    WebElement create_View=driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[2]"));
	    clickElement(create_View,"Create View");
	    WebElement view_name=driver.findElement(By.xpath("//input[@id='fname']"));
	    enter_TextArea(view_name,"abcd", "view name");
	    WebElement unique_view=driver.findElement(By.xpath("//input[@id='devname']"));
	    unique_view.click();
	    Thread.sleep(3000);
	    System.out.print(unique_view.getAttribute("value"));
	}

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		AutomationScripts ob=new AutomationScripts();
	//	ob.forgot_Password();
//ob.login_Attempt();

//ob.my_Profile();
//ob.my_Settings();
//ob.username_Drop();
//ob.log_Out();
		//ob.amazon();
		
//ob.frames();
//ob.tables();
		//ob.screenShot();
		//ob.createAnAccount();
		//ob.createNewView();
		//ob.editView();
		//ob.mergeAccount();
		//ob.create_AccountReport();
		//ob.opportunities_Dropdown();
		ob.createNew_Opty();
		//ob.Opp_Pipeline();
		//ob.testStuck_Opp();
		//ob.Summary_Report();
		//ob.lead();
		//ob.leadSelectView();
		//ob.func_Go();
		//ob.Contact_NewView();
		
		
	}
	
}
