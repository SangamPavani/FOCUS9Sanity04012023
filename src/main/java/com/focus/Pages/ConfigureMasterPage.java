package com.focus.Pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;

public class ConfigureMasterPage extends BaseEngine
{

	@FindBy(xpath="//*[@id='btn_common_header']/div/div[2]")
	private static List<WebElement> configMastersRibbonControl;
	
	@FindBy(xpath="//*[@id='MasterTabs']/ul/li/a/span")
	private static List<WebElement> configMastersHeaderList;
	
	@FindBy(xpath="//span[@class='font-5 padding-left10'][contains(text(),'Definition')]")
	private static WebElement definitionTab;
	
	@FindBy(xpath="//div[@id='MasterTabs']//li[2]//a[1]")
	private static WebElement customizationTab;
	
	@FindBy(xpath="//span[contains(text(),'Views')]")
	private static WebElement viewsTab;
	
	@FindBy(xpath="//span[contains(text(),'Tree Customization')]")
	private static WebElement treeCustomizationTab;
	
	
	
	@FindBy(xpath="//select[@id='ddlModule']")
	private static WebElement moduleDropdown;
	
	@FindBy(xpath="//input[@id='txtMasterName']")
	private static WebElement nameComboBox;
	
	@FindBy(xpath="//tbody[@id='txtMasterName_table_body']/tr/td[2]")
	private static List<WebElement> nameComboBoxList;
	
	@FindBy(xpath="//input[@id='txtMasterCaption']")
	private static WebElement captionTxt;
	
	@FindBy(xpath="//input[@id='rdoSearchByName_master']")
	private static WebElement searchByNameRadioBtn;
	
	@FindBy(xpath="//input[@id='rdoSearchByCode_master']")
	private static WebElement searchByCodeRadioBtn;
	
	@FindBy(xpath="//input[@id='chkAllowRivisions']")
	private static WebElement allowReservationChkBox;
	
	@FindBy(xpath="//*[@id='chkIsDefault']")
	private static WebElement defaultChkBox;
	
	@FindBy(xpath="//input[@id='chkGroupMandatory']")
	private static WebElement groupMandatoryChkBox;
	
	@FindBy(xpath="//input[@id='chkPickCode']")
	private static WebElement pickCodeChkBox;
	
	
	@FindBy(xpath="//*[@id='divDependency_Master']/table/thead/tr/td")
	private static List<WebElement> showDependencyHeader;
	
	@FindBy(xpath="//a[contains(text(),'Dependent')]")
	private static WebElement dependentTab;
	
	@FindBy(xpath="//a[contains(text(),'Used')]")
	private static WebElement usedTab;
	
	@FindBy(xpath="//div[@class='msTreeMenuContainer']//div//span[@class='icon-left-and-right-panel-icon icon-font3 clsMenus pull-right']")
	private static WebElement menuMinimizeBtn;
	
	@FindBy(xpath="//span[@id='altMenu_Icon']")
	private static WebElement menuExpansionBtn;
	
	@FindBy(xpath="//div[@id='masterTreeMenu']//ul//li//a//span")
	private static List<WebElement> menuList;
	
	@FindBy(xpath="//div[@id='masterTreeMenu']/ul//li/a/i")
	private static List<WebElement> menuPlus;
	
	@FindBy(xpath="//*[@id='16']/div/span")
	private static WebElement settingsmenuBtn;
	
	@FindBy(xpath="//*[@id='19']/span[text() = 'Configure Masters']")
	private static WebElement settingsConfigureMasters;
	
	@FindBy(xpath="//div[@class='theme_color font-6']")
	public static WebElement errorMessage;

	@FindBy(xpath="//span[@class='icon-reject2 theme_color']")
	public static WebElement errorMessageCloseBtn;
	
	public static String checkValidationMessageString(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
        try
        {
                getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(errorMessage));
                String actErrorMessage=errorMessage.getText();
                String expErrorMessage=ExpMessage;

                try
                {
                
	                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessageCloseBtn));
	                errorMessageCloseBtn.click();

	                System.out.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);
	                
	                return actErrorMessage;
                }
                catch(Exception ee)
                {
                	
                	System.out.println("ValidationMessage  :  "+actErrorMessage +" Value Expected : "+expErrorMessage);
                	
                	return actErrorMessage;
                }
        }
        catch(Exception e)
        {
                System.err.println("Error Message NOT Found or NOT Clickable");
                System.err.println(e.getMessage());
                
                String Exception=e.getMessage();
            
                return Exception;
        }
}
	

	@FindBy(xpath="//*[@id='txtUsername']")
	private static WebElement username;

	@FindBy(id="txtPassword")
	private static WebElement password;

	@FindBy(id="btnSignin")
	private static WebElement signIn;

    @FindBy(id="ddlCompany")
    private static WebElement companyDropDownList;

	/*@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/header[1]/nav[1]/div[1]/ul[1]/li[5]/a[1]/span[1]")
	private static WebElement userNameDisplay;*/

	@FindBy(xpath="//span[@class='hidden-xs']")
	private static WebElement userNameDisplay;
	
	
	@FindBy(xpath="//*[@id='companyLogo']")
	private static WebElement companyLogo;

	@FindBy(xpath="//*[@id='ulCompanyDetails_HomePage']/li[1]")
	private static WebElement companyName;

    @FindBy(xpath="//*[@id='userprofile']/li/span[2]")
    private static WebElement logoutOption;
	
    
    @FindBy(xpath="//input[@id='donotshow']")
	private static WebElement doNotShowCheckbox;
    
    @FindBy(xpath="//span[@class='pull-right']")
	private static WebElement closeBtnInDemoPopupScreen;
    
    @FindBy(xpath="//*[@id='dashName']")
	private static WebElement dashboard;
    
    private static int cSize;
    
	 public static boolean checkLoginCompanyWithValidCredentials() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
  	 {
  		
		LoginPage lp=new LoginPage(getDriver()); 
		
        String unamelt="su";
      
        String pawslt="su";
      
        lp.enterUserName(unamelt);

        lp.enterPassword(pawslt);
        
        String compname="Automation Company";
	 	
		 Select oSelect = new Select(companyDropDownList);
		 
		 List <WebElement> elementCount = oSelect.getOptions();
		
		 int cqSize = elementCount.size();
		 
		 int zqSize=cSize+1;
		 
		 System.out.println("CompanyDropdownList Count :"+cqSize);
		 
		 System.out.println("Company dropdown is :"+ zqSize);
		 int i;
	  
	  
		for(i=0; i<elementCount.size(); i++) 
		{
		
		  elementCount.get(i).getText();
		  String optionName = elementCount.get(i).getText();
		  if(optionName.toUpperCase().startsWith(compname.toUpperCase()))
		  {
			  System.out.println("q"+elementCount.get(i).getText());
			  elementCount.get(i).click();
   		  
		  }
     
		  
		}
  
        lp.clickOnSignInBtn();
               
        Thread.sleep(5000);
           	
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
    	String actUserInfo = userNameDisplay.getText();
    	String expUserInfo = "SU";
    	
    	System.out.println("Login To Company User Name Display Value Actual    : " + actUserInfo	 + " Value Expected : " + expUserInfo);
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
    	companyLogo.click();
    	
    	String getCompanyTxt=companyName.getText();
    	String actGetLoginCompanyName =getCompanyTxt.substring(0, 19);
    	String expGetLoginCompanyName ="Automation Company ";
    	
    	System.out.println("Login To Company CompanyTxt Name Display Value Actual    : " + actGetLoginCompanyName	 + " Value Expected : " + expGetLoginCompanyName);
    	   	
    	companyLogo.click();
    	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboard));
    	
    	String actGetDashboard = dashboard.getText();
    	String expGetDashboard = "Dashboard";
    	
    	System.out.println("Login To Company Dashboard Name Display Value Actual    : " + actGetDashboard	 + " Value Expected : " + expGetDashboard);
   
		  if(actUserInfo.equalsIgnoreCase(expUserInfo) && actGetLoginCompanyName.equalsIgnoreCase(expGetLoginCompanyName) &&
				  actGetDashboard.equalsIgnoreCase(expGetDashboard))
		  {
				
				return true;
		  }
		  else
		  {
				
				return true;
		  }
     }
  	 

	 

	
	public boolean checkconfigureMasters() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
			settingsmenuBtn.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsConfigureMasters));
			settingsConfigureMasters.click();
			
			
			int configMastersRibbonControlCount = configMastersRibbonControl.size();
			
			ArrayList<String> configMastersRibbonControlArray = new ArrayList<String>();
			
			for(int i=0;i<configMastersRibbonControlCount;i++)
			{
				String data = configMastersRibbonControl.get(i).getText();
				configMastersRibbonControlArray.add(data);
			}
		    		
			String actconfigMastersRibbonControl = configMastersRibbonControlArray.toString();
			
			String expconfigMastersRibbonControl = "[Save, Delete, Export, Import, Close]";
			
			System.out.println("configMastersRibbonControl Actual   : " + actconfigMastersRibbonControl);
			System.out.println("configMastersRibbonControl Expected : " + expconfigMastersRibbonControl);
			
			int configMastersHeaderListCount = configMastersHeaderList.size();
			
			ArrayList<String> configMastersHeaderListArray = new ArrayList<String>();
			
			for(int i=0;i<configMastersHeaderListCount;i++)
			{
				String data = configMastersHeaderList.get(i).getText();
				configMastersHeaderListArray.add(data);
			}
		    		
			String actconfigMastersHeaderList = configMastersHeaderListArray.toString();
			
			String expconfigMastersHeaderList	 = "[Definition, Customization, Views, Tree Customization]";
			
			System.out.println("configMastersHeaderList Actual   : " + actconfigMastersHeaderList);
			System.out.println("configMastersHeaderList Expected : " + expconfigMastersHeaderList);
			
			
			boolean actmoduleDropdown       	= moduleDropdown.isDisplayed();
			boolean actnameComboBox         	= nameComboBox.isDisplayed();
			boolean actcaptionTxt 				= captionTxt.isDisplayed();
			boolean actsearchByNameRadioBtn 	= searchByNameRadioBtn.isDisplayed();
			boolean actsearchByCodeRadioBtn 	= searchByCodeRadioBtn.isDisplayed();
			boolean actallowReservationChkBox 	= allowReservationChkBox.isDisplayed();
			boolean actdefaultChkBox 			= defaultChkBox.isDisplayed();
			boolean actgroupMandatoryChkBox 	= groupMandatoryChkBox.isDisplayed();
			boolean actpickCodeChkBox 			= pickCodeChkBox.isDisplayed();
			boolean actdependentTab 			= dependentTab.isDisplayed();
			boolean actusedTab 					= usedTab.isDisplayed();
			boolean actmenuMinimizeBtn 			= menuMinimizeBtn.isDisplayed();
			
			boolean expmoduleDropdown       	= true;
			boolean expnameComboBox         	= true;
			boolean expcaptionTxt 				= true;
			boolean expsearchByNameRadioBtn 	= true;
			boolean expsearchByCodeRadioBtn 	= true;
			boolean expallowReservationChkBox 	= true;
			boolean expdefaultChkBox 			= true;
			boolean expgroupMandatoryChkBox 	= true;
			boolean exppickCodeChkBox 			= true;
			boolean expdependentTab 			= true;
			boolean expusedTab 					= true;
			boolean expmenuMinimizeBtn 			= true;
			boolean expmenuExpansionBtn 		= true;
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(menuMinimizeBtn));
			menuMinimizeBtn.click();
			
			boolean actmenuExpansionBtn 		= menuExpansionBtn.isDisplayed();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(menuExpansionBtn));
			menuExpansionBtn.click();
			
			
			int showDependencyHeaderCount = showDependencyHeader.size();
			
			ArrayList<String> showDependencyHeaderArray = new ArrayList<String>();
			
			for(int i=0;i<showDependencyHeaderCount;i++)
			{
				String data = showDependencyHeader.get(i).getText();
				showDependencyHeaderArray.add(data);
			}
		    		
			String actshowDependencyHeader = showDependencyHeaderArray.toString();
			
			String expshowDependencyHeader = "[Master Name, Tab Caption, Field Caption, Field Type]";
			
			System.out.println("showDependencyHeader Actual   : " + actshowDependencyHeader);
			System.out.println("showDependencyHeader Expected : " + expshowDependencyHeader);
			
			int menuPlusCount = menuPlus.size();
			int menuListCount = menuList.size();
			
			System.err.println("menuPlusCount : " + menuPlusCount);
			
			System.out.println("moduleDropdown Actual         : " + actmoduleDropdown);
			System.out.println("nameComboBox Actual           : " + actnameComboBox);
			System.out.println("captionTxt Actual             : " + actcaptionTxt);
			System.out.println("searchByNameRadioBtn Actual   : " + actsearchByNameRadioBtn);
			System.out.println("searchByCodeRadioBtn Actual   : " + actsearchByCodeRadioBtn);
			System.out.println("allowReservationChkBox Actual : " + actallowReservationChkBox);
			System.out.println("defaultChkBox Actual          : " + actdefaultChkBox);
			System.out.println("groupMandatoryChkBox Actual   : " + actgroupMandatoryChkBox);
			System.out.println("pickCodeChkBox Actual         : " + actpickCodeChkBox);
			System.out.println("dependentTab Actual           : " + actdependentTab);
			System.out.println("usedTab Actual                : " + actusedTab);
			System.out.println("menuMinimizeBtn Actual        : " + actmenuMinimizeBtn);
			System.out.println("menuExpansionBtn Actual       : " + actmenuExpansionBtn);
			
			boolean actMethod = actmoduleDropdown==expmoduleDropdown && actnameComboBox==expnameComboBox && actcaptionTxt==expcaptionTxt
								&& actsearchByNameRadioBtn==expsearchByNameRadioBtn && actsearchByCodeRadioBtn==expsearchByCodeRadioBtn
								&& actallowReservationChkBox==expallowReservationChkBox && actdefaultChkBox==expdefaultChkBox
								&& actgroupMandatoryChkBox==expgroupMandatoryChkBox && actpickCodeChkBox==exppickCodeChkBox
								&& actdependentTab==expdependentTab && actusedTab==expusedTab && actmenuExpansionBtn==expmenuExpansionBtn;
				
			String actResult = Boolean.toString(actMethod);
			
			System.out.println("ActMethod : " + actMethod);
			
			if(actMethod==true && actconfigMastersRibbonControl.equalsIgnoreCase(expconfigMastersRibbonControl)
					&& actconfigMastersHeaderList.equalsIgnoreCase(expconfigMastersHeaderList) 
					&& actshowDependencyHeader.equalsIgnoreCase(expshowDependencyHeader)
					)
			{	
				System.out.println("Test Pass : Bin Popup Displayed");
				
				return true;
			}
			else
			{
				System.out.println("Test Fail : Bin Popup NOT Displayed");
				
				return false;
			}
		}
		
		
		@FindBy(xpath="//div[contains(text(),'Save')]")
		private static WebElement cmSaveBtn;
		
		@FindBy(xpath="//*[@id='btnClose_ConfigureMasters']/div[1]/span")
		private static WebElement cmCloseBtn;
		
		
		public static boolean checkSavingMasterInConfigureMaster() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
		{
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizationTab));
			customizationTab.click();
			
			String expMessageOnClickingCustomizeTab = "Enter Master Name Or Create new Master";
			
			String actMessageOnClickingCustomizeTab = checkValidationMessageString(expMessageOnClickingCustomizeTab);
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmSaveBtn));
			cmSaveBtn.click();
			
			String expMessageOnSaveEmpty = "Select menu";
			
			String actMessageOnSaveEmpty = checkValidationMessageString(expMessageOnSaveEmpty);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
			nameComboBox.click();
			nameComboBox.sendKeys("Test");
			nameComboBox.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmSaveBtn));
			cmSaveBtn.click();
			
			String expMessageOnSaveNameInput = "Select menu";
			
			String actMessageOnSaveNameInput = checkValidationMessageString(expMessageOnSaveNameInput);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenuExpandBtn));
			homeMenuExpandBtn.click();
			
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterMenuBtn));
			masterMenuBtn.click();
			
			Thread.sleep(2000);
			
			/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
			nameComboBox.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(captionTxt));
			captionTxt.click();*/
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmSaveBtn));
			cmSaveBtn.click();
			
			String expMessageOnSave = "Master Saved Successfully";
			
			String actMessageOnSave = checkValidationMessageString(expMessageOnSave);
			
			if(actMessageOnClickingCustomizeTab .equalsIgnoreCase(expMessageOnClickingCustomizeTab ) && actMessageOnSaveEmpty.equalsIgnoreCase(expMessageOnSaveEmpty) 
					&& actMessageOnSaveNameInput.equalsIgnoreCase(expMessageOnSaveNameInput) && actMessageOnSave.equalsIgnoreCase(expMessageOnSave))
			{	
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		
		
		
		@FindBy(xpath="//a[contains(@class,'menu-selected theme_color-inverse')]//span[@class='Flabel'][contains(text(),'Masters')]")
		private static WebElement cmMastermenu;
		
		@FindBy(xpath="//span[contains(text(),'Header Details')]")
		private static WebElement cmHeaderDetailsTab;
		
		@FindBy(xpath="//div[@id='btnAdd_Field_MasterCust']//span[@class='icon-new icon-font7']")
		private static WebElement cmAddBtn;
		
		@FindBy(xpath="//span[@class='icon-ok icon-font8']")
		private static WebElement cmCustomizeOkBtn;
		
		@FindBy(xpath="//span[@class='icon-close icon-font8']")
		private static WebElement cmCustomizeloseBtn;
		
		@FindBy(xpath="//input[@id='txtMasterViewName']")
		private static WebElement viewComboBox;
		
		@FindBy(xpath="//*[@id='ul_details_TreeCust']/li/div/label")
		private static List<WebElement> treecustomizationlist;
	
		
		public boolean checkSavedMasterAndUpdatingTheMaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
				nameComboBox.click();
				nameComboBox.sendKeys(Keys.END);
				nameComboBox.sendKeys(Keys.SHIFT,Keys.HOME);
				nameComboBox.sendKeys(Keys.BACK_SPACE);
				nameComboBox.sendKeys(Keys.SPACE);
				
				int nameComboBoxListCount = nameComboBoxList.size();
				
				System.err.println("nameComboBoxListCount : "+nameComboBoxListCount);
				
				ArrayList<String> nameComboBoxListArray = new ArrayList<String>();
				
				for(int i=0;i<nameComboBoxListCount;i++)
				{
					String data = nameComboBoxList.get(i).getText();
					
					System.err.println("Data : " + data);
					
					if(data.equalsIgnoreCase("Test"))
					{
						nameComboBoxList.get(i).click();
						break;
					}
				}
				
				nameComboBox.sendKeys(Keys.TAB);
				
				
				String actnameComboBox = nameComboBox.getAttribute("value");
				String expnameComboBox = "Test";
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(captionTxt));
				
				String actcaptionTxt = captionTxt.getAttribute("value");
				String expcaptionTxt = "Test";
				
				boolean actcmMastermenu = cmMastermenu.isDisplayed();
				boolean expcmMastermenu = true;
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(captionTxt));
				captionTxt.click();
				captionTxt.clear();
				captionTxt.sendKeys("TestUpdate");
				captionTxt.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmSaveBtn));
				cmSaveBtn.click();
				
				String expMessageOnSaveUpdate = "Master updated successfully";
				
				String actMessageOnSaveUpdate = checkValidationMessageString(expMessageOnSaveUpdate);
				
				System.out.println("nameComboBox Actual            : " + actnameComboBox          + " Value Expected : "+expnameComboBox);
				System.out.println("captionTxt Actual              : " + actcaptionTxt            + " Value Expected : "+expcaptionTxt);
				System.out.println("cmMastermenu Actual            : " + actcmMastermenu          + " Value Expected : "+expcmMastermenu);
				
				if(actnameComboBox.equalsIgnoreCase(expnameComboBox) && actcaptionTxt.equalsIgnoreCase(expcaptionTxt)
					&& actcmMastermenu==expcmMastermenu && actMessageOnSaveUpdate.equalsIgnoreCase(expMessageOnSaveUpdate))
				{	
					System.out.println("Test Pass : Bin Popup Displayed");
					return true;
				}
				else
				{
					System.out.println("Test Fail : Bin Popup NOT Displayed");
					return false;
				}
			}
		
		
			

			@FindBy(xpath="//div[@class='col-sm-12 btnMain_header_img']//span[@class='icon-delete icon-font7']")
			private static WebElement cmDeleteBtn;
		
			@FindBy(xpath="//label[@id='lblMessage_Modal']")
			private static WebElement cmGetMgsonDelete;

			@FindBy(xpath="//button[@id='btnDeleteMaster_Ok']")
			private static WebElement cmclickOnOkInDelete;
			
			public static boolean checkUpdatedMasterAndDeleteThatMaster() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
			{
				Thread.sleep(3000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
				nameComboBox.click();
				nameComboBox.sendKeys(Keys.END);
				nameComboBox.sendKeys(Keys.SHIFT,Keys.HOME);
				nameComboBox.sendKeys(Keys.BACK_SPACE);
				nameComboBox.sendKeys(Keys.SPACE);
				
				int nameComboBoxListCount = nameComboBoxList.size();
				
				System.err.println("nameComboBoxListCount : "+nameComboBoxListCount);
				
				ArrayList<String> nameComboBoxListArray = new ArrayList<String>();
				
				for(int i=0;i<nameComboBoxListCount;i++)
				{
					String data = nameComboBoxList.get(i).getText();
					
					System.err.println("Data : " + data);
					
					if(data.equalsIgnoreCase("Test"))
					{
						nameComboBoxList.get(i).click();
						break;
					}
				}
				
				nameComboBox.sendKeys(Keys.TAB);
				
				
				String actnameComboBox = nameComboBox.getAttribute("value");
				String expnameComboBox = "Test";
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(captionTxt));
				
				String actcaptionTxt = captionTxt.getAttribute("value");
				String expcaptionTxt = "TestUpdate";
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmDeleteBtn));
				cmDeleteBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmGetMgsonDelete));

				String actMessageOnClickOnDeleteButton = cmGetMgsonDelete.getText();
				
				String expMessageOnClickOnDeleteButton = "Are you sure that you want to delete Master?";
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmclickOnOkInDelete));
				cmclickOnOkInDelete.click();
				
				String expMessageOnClickingOkInDelete = "Master delete successfully";
				
				String actMessageOnClickingOkInDelete = checkValidationMessageString(expMessageOnClickingOkInDelete);
				
				System.out.println("MessageOnClickOnDeleteButton Actual : " + actMessageOnClickOnDeleteButton + " Value Expected : " + expMessageOnClickOnDeleteButton);
				System.out.println("MessageOnClickingOkInDelete  Actual : " + actMessageOnClickingOkInDelete  + " Value Expected : " + expMessageOnClickingOkInDelete);
				
				if(actnameComboBox.equalsIgnoreCase(expnameComboBox) && actcaptionTxt.equalsIgnoreCase(expcaptionTxt) 
						&& actMessageOnClickOnDeleteButton.equalsIgnoreCase(expMessageOnClickOnDeleteButton)
						&& actMessageOnClickingOkInDelete.equalsIgnoreCase(expMessageOnClickingOkInDelete))
				{	
					return true;
				}
				else
				{
					return false;
				}
			}
			
			
			
			@FindBy(xpath="//*[@id='btn_common_header']/div[5]")
			private static WebElement closeConfigMasters;
			
			
			
			public static boolean checkSavingMasterForRecordCreation() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
			{	
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
				nameComboBox.click();
				nameComboBox.sendKeys("ConfigMaster");
				nameComboBox.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenuExpandBtn));
				homeMenuExpandBtn.click();
				
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterMenuBtn));
				masterMenuBtn.click();
				
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
				nameComboBox.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(captionTxt));
				captionTxt.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmSaveBtn));
				cmSaveBtn.click();
				
				String expMessageOnSave = "Master Saved Successfully";
				
				String actMessageOnSave = checkValidationMessageString(expMessageOnSave);
				
				Thread.sleep(2000);
				
				if(actMessageOnSave.equalsIgnoreCase(expMessageOnSave))
				{	
					closeConfigMasters.click();
					Thread.sleep(2000);
					return true;
				}
				else
				{
					closeConfigMasters.click();
					Thread.sleep(2000);
					return false;
				}
			}
			
			
			
			
			@FindBy(xpath="//*[@id='1182']/span")
			private static WebElement ConfigMasterInMastersList;
			
			@FindBy (xpath="//*[@id='1']/div/span")
		    public static WebElement homeMenu;
			
			@FindBy (xpath="//*[@id='1000']/span")
			public static WebElement mastersMenu;
			
			@FindBy(xpath="//i[@class='icon-font6 icon-new']")
			public static WebElement masterNewBtn;
				
			@FindBy(xpath="//i[@class='icon-font6 icon-add-group']")
			public static WebElement masterAddGroupBtn; 
			 
			@FindBy(xpath="//i[@class='icon-font6 icon-edit']")
			public static WebElement masterEditBtn; 
	
			@FindBy(xpath="//i[@class='icon-font6 icon-clone']")
			public static WebElement masterCloneBtn; 
	
			@FindBy(xpath="//i[@class='icon-properties icon-font6']")
			public static WebElement masterPropertiesBtn; 
	
			@FindBy(xpath="//i[@class='icon-font6 icon-delete']")
			public static WebElement masterDeleteBtn; 
	
			@FindBy(xpath="//i[@class='icon-font6 icon-close']")
			public static WebElement masterCloseBtn; 
	
			@FindBy(xpath="//i[@class='icon-font6 icon-group']")
			public static WebElement masterGroupBtn; 
			
			@FindBy(xpath="//*[@id='sName']")
			public static WebElement NameTxt; 
			
			@FindBy(xpath="//*[@id='sCode']")
			public static WebElement codeTxt; 
			
			@FindBy(xpath="//*[@id='btnMasterSaveClick']")
			public static WebElement saveBtn;

			@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
			public static WebElement closeBtn;

		    //Edit option Fields
			
			@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[6]")
			public static WebElement editcloseBtn;
			
			@FindBy(xpath="//i[@class='icon-font6 icon-paste-clipboard']")
			public static WebElement pasteBtn;
			
			@FindBy(xpath="//button[@id='btnMasterClone']")
			public static WebElement editcloneBtn;
			
			@FindBy(xpath="//*[@id='btnMasterCopy']")
			public static WebElement copyBtn;
			
		
			public static boolean checkSavedMaserInMastersListAndSaveRecord() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				homeMenu.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
				mastersMenu.click();
				
				Thread.sleep(3000);
				
				getAction().moveToElement(ConfigMasterInMastersList).build().perform();
				boolean actConfigMaster = ConfigMasterInMastersList.isDisplayed();
				boolean expConfigMaster = true;
				
				System.out.println("actConfigMaster "+actConfigMaster);
				System.out.println("expConfigMaster "+expConfigMaster);
				
				if(actConfigMaster == expConfigMaster )
				{
					getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ConfigMasterInMastersList));
					ConfigMasterInMastersList.click();
				}
				
				Thread.sleep(3000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
				masterNewBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(NameTxt));
				NameTxt.sendKeys("NewRecord");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
				codeTxt.sendKeys("CdNewRecord");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				Thread.sleep(2000);
				
				String expSaveMessage = "Saved Successfully";
				String actSaveMessage = checkValidationMessageString(expSaveMessage);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
				closeBtn.click();
				
				if (actSaveMessage.equalsIgnoreCase(expSaveMessage)) 
				{
					return true;
				} 
				else
				{
					return false;
				}
				
			}
			
			
			@FindBy(xpath="//*[@id='60']/div")
			private static WebElement  financialsMenu;
			
			@FindBy(xpath="//*[@id='61']/span")
			private static WebElement  financialsTransactionMenu; 
			
			@FindBy(xpath="//*[@id='myNavbar']/div/div[10]/div[1]/span")
			private static WebElement Receipts_SettingsBtn;
			
			@FindBy(xpath="//a[@id='2001']//span[contains(text(),'Cash and Bank')]")
			private static WebElement  cashAndBankMenu; 
			
			@FindBy(xpath="//a[@id='2002']//span[contains(text(),'Receipts')]")
			private static WebElement  receiptsVoucher;
			
			@FindBy(xpath="//*[@id='doc_TagsTable_col_2-1']")
			private static WebElement  mastersDropdownInReceipts;
			
			@FindBy(xpath="//select[@id='doc_TagsTableMasterDropDown']")
			private static WebElement  selectMasterdropdown;
			
			@FindBy(xpath="//*[@id='doc_TagsTable_col_2-2']")
			private static WebElement  masterHeaderOrBodyDropdown;
			
			
			@FindBy(xpath="//select[@id='doc_TagsPositionDropDown']")
			private static WebElement  selectHeaderOrBodyDropdown;
			
			
			
			public static boolean checkDeletigCreatedMasterWithTheRecord() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
				settingsmenuBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsConfigureMasters));
				settingsConfigureMasters.click();
				
				Thread.sleep(3000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
				nameComboBox.click();
				nameComboBox.sendKeys(Keys.END);
				nameComboBox.sendKeys(Keys.SHIFT,Keys.HOME);
				nameComboBox.sendKeys(Keys.BACK_SPACE);
				nameComboBox.sendKeys(Keys.SPACE);
				
				int nameComboBoxListCount = nameComboBoxList.size();
				
				System.err.println("nameComboBoxListCount : "+nameComboBoxListCount);
				
				ArrayList<String> nameComboBoxListArray = new ArrayList<String>();
				
				for(int i=0;i<nameComboBoxListCount;i++)
				{
					String data = nameComboBoxList.get(i).getText();
					
					System.err.println("Data : " + data);
					
					if(data.equalsIgnoreCase("ConfigMaster"))
					{
						nameComboBoxList.get(i).click();
						break;
					}
				}
				
				nameComboBox.sendKeys(Keys.TAB);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmDeleteBtn));
				cmDeleteBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmGetMgsonDelete));

				String actMessageOnClickOnDeleteButton = cmGetMgsonDelete.getText();
				
				String expMessageOnClickOnDeleteButton = "Are you sure that you want to delete Master?";
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmclickOnOkInDelete));
				cmclickOnOkInDelete.click();
				
				
				String expMessageOnClickingOkInDelete = "Master delete successfully";
				
				String actMessageOnClickingOkInDelete = checkValidationMessageString(expMessageOnClickingOkInDelete);
				
				
				System.out.println("MessageOnClickOnDeleteButton Actual : " + actMessageOnClickOnDeleteButton + " Value Expected : " + expMessageOnClickOnDeleteButton);
				System.out.println("MessageOnClickingOkInDelete  Actual : " + actMessageOnClickingOkInDelete  + " Value Expected : " + expMessageOnClickingOkInDelete);
				
				
				if(actMessageOnClickOnDeleteButton.equalsIgnoreCase(expMessageOnClickOnDeleteButton)
						&& actMessageOnClickingOkInDelete.equalsIgnoreCase(expMessageOnClickingOkInDelete))
				{	
					return true;
				}
				else
				{
					return false;
				}
				
			}
			
			@FindBy(xpath="//*[@id='MasterMenus_div']/div/div[3]/button[1]")
			private static WebElement addGroupBtnInconfigureMaster;
			
			@FindBy(xpath="//*[@id='MasterMenus_div']/div/div[3]/button[2]")
			private static WebElement deleteGroupBtnInconfigureMaster;
			
			@FindBy(xpath="//*[@id='txtNewGroupName']")
			private static WebElement groupNameTxt;
			
			@FindBy(xpath="//*[@id='btnAddGroup_Ok']")
			private static WebElement okBtnInAddgroupPopup;
			
			
			@FindBy(xpath="//li[@id='mMenu1']/a/i")
			private static WebElement homeMenuExpandBtn;
			
			@FindBy(xpath="//li[@id='mMenu1000']/a/i")
			private static WebElement masterMenuExpandBtn;
			
			@FindBy(xpath="//li[@id='mMenu1000']/a/span")
			private static WebElement masterMenuBtn;
			
			@FindBy(xpath="//span[text()='GroupMaster']")
			private static WebElement GroupMasterMenuBtn;
			
			@FindBy(xpath="//span[text()='GroupMaster1']")
			private static WebElement GroupMaster1MenuBtn;
			
			//@FindBy(xpath="(//span[text()='GroupMaster1'])[2]")
			//private static WebElement GroupMaster1Btn;
			
			//@FindBy(xpath="//span[text()='GroupMasterToDelete']")
			//private static WebElement GroupMasterToDeleteMenuBtn;
			
			
			@FindBy(xpath="(//span[text()='GroupMaster'])[2]")
			private static WebElement GroupMasterBtn;
			
			@FindBy(xpath="//span[text()='GroupMasterToDelete']")
			private static WebElement GroupMasterToDeleteMenuBtn;
			
			
			
			public static boolean checkAddingGroupMasterInConfigureMaster() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
				settingsmenuBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsConfigureMasters));
				settingsConfigureMasters.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addGroupBtnInconfigureMaster));
				addGroupBtnInconfigureMaster.click();
				
				String expMessageOnWithoutMenu = "Select the menu in which you want to add Group";
				String actMessageOnWithoutMenu = checkValidationMessageString(expMessageOnWithoutMenu);
				
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenuExpandBtn));
				homeMenuExpandBtn.click();
				
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterMenuBtn));
				masterMenuBtn.click();
				
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addGroupBtnInconfigureMaster));
				addGroupBtnInconfigureMaster.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(groupNameTxt));
				groupNameTxt.sendKeys("GroupMaster");
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAddgroupPopup));
				okBtnInAddgroupPopup.click();
				
				Thread.sleep(3000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenuExpandBtn));
				homeMenuExpandBtn.click();
				
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterMenuExpandBtn));
				masterMenuExpandBtn.click();
				
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(GroupMasterMenuBtn));
				String actGroup = GroupMasterMenuBtn.getText();
				String expGroup = "GroupMaster"; 
				
				System.out.println("Added Group : "+actGroup+"  Value Expected  "+expGroup);
				
				if (actMessageOnWithoutMenu.equalsIgnoreCase(expMessageOnWithoutMenu) && actGroup.equalsIgnoreCase(expGroup)) 
				{
					return true;
				} 
				else
				{
					return false;
				}
			}
	
			
			
			
			
			
			public static boolean checkAddingChildMasterInGroupMaster() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameComboBox));
				nameComboBox.click();
				nameComboBox.sendKeys("ChildMaster");
				Thread.sleep(2000);
				nameComboBox.sendKeys(Keys.TAB);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(GroupMasterMenuBtn));
				GroupMasterMenuBtn.click();
				
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cmSaveBtn));
				cmSaveBtn.click();
				
				String expMessageOnSave = "Master Saved Successfully";
				
				String actMessageOnSave = checkValidationMessageString(expMessageOnSave);
				
				if(actMessageOnSave.equalsIgnoreCase(expMessageOnSave))
				{	
					return true;
				}
				else
				{
					return false;
				}
			}
			
			
			
			
			public static boolean checkDeletingSavedGroupmasterWithChildmaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenuExpandBtn));
				homeMenuExpandBtn.click();
				
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterMenuExpandBtn));
				masterMenuExpandBtn.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(GroupMasterBtn));
				GroupMasterBtn.click();
				
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteGroupBtnInconfigureMaster));
				deleteGroupBtnInconfigureMaster.click();
				
				String expDeleteMessage = "Cannot delete this group having child menus!";
				String actDeleteMessage = checkValidationMessageString(expDeleteMessage);
				
				if (actDeleteMessage.equalsIgnoreCase(expDeleteMessage))
				{
					return true;
				}
				else
				{
					return false;
				} 
			}
			
			
			
			
			
			
			public static boolean checkAddingGroupMasterForDeletion() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
				settingsmenuBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsConfigureMasters));
				settingsConfigureMasters.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenuExpandBtn));
				homeMenuExpandBtn.click();
				
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterMenuBtn));
				masterMenuBtn.click();
				
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(addGroupBtnInconfigureMaster));
				addGroupBtnInconfigureMaster.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(groupNameTxt));
				groupNameTxt.sendKeys("GroupMasterToDelete");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtnInAddgroupPopup));
				okBtnInAddgroupPopup.click();
				
				Thread.sleep(3000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenuExpandBtn));
				homeMenuExpandBtn.click();
				
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterMenuExpandBtn));
				masterMenuExpandBtn.click();
				
				Thread.sleep(1000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(GroupMasterToDeleteMenuBtn));
				GroupMasterToDeleteMenuBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deleteGroupBtnInconfigureMaster));
				deleteGroupBtnInconfigureMaster.click();
				
				String expDeleteMessage = "Group deleted successfully!";
				String actDeleteMessage = checkValidationMessageString(expDeleteMessage);
				
				if (actDeleteMessage.equalsIgnoreCase(expDeleteMessage))
				{
					return true;
				}
				else
				{
					return false;
				} 
			}
			
			
			
			
			
			@FindBy(xpath="//*[@id='262']/span")
			private static WebElement GrpMnadatoryInmasters;
			
			@FindBy(xpath="//*[@id='1184']/span")
			private static WebElement childNode;
			
			public static boolean checkSavingGroupUnderCreatedMaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				homeMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
				mastersMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(GrpMnadatoryInmasters));
				GrpMnadatoryInmasters.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(childNode));
				childNode.click();
				
				Thread.sleep(2000);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));
				masterAddGroupBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(NameTxt));
				NameTxt.sendKeys("Grp");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
				codeTxt.sendKeys("Grp");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				
				String expSaveMessage = "Saved Successfully";
				String actSaveMessage = checkValidationMessageString(expSaveMessage);
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
				closeBtn.click();
				
				if (actSaveMessage.equalsIgnoreCase(expSaveMessage))
				{
					return true;
				} 
				else
				{
					return false;
				}
			}
			
			
			
			@FindBy(xpath="//tbody[@id='oc_Group_table_body']//tr//td[2]")
			private static List<WebElement> groupList;
			
			@FindBy(xpath="//*[@id='oc_Group_input_image']/span")
			private static WebElement groupTogglebtn;
			
			
			public static boolean checkSavingARecordUnderMasterThroughgroupDropdown() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
				masterNewBtn.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(NameTxt));
				NameTxt.sendKeys("TestRecord");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
				codeTxt.sendKeys("TestRecord");
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				
				String expMessageOnsaveWithoutGrp = "Group Field is Required";
				String actMessageOnsaveWithoutGrp = checkValidationMessageString(expMessageOnsaveWithoutGrp);
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(groupTogglebtn));
				groupTogglebtn.click();
				
				int ListCount = groupList.size();
				
				ArrayList<String> ListArray = new ArrayList<String>();
				
				for(int i=0;i<ListCount;i++)
				{
					String data = groupList.get(i).getText();
					
					if(data.equalsIgnoreCase("Grp"))
					{
						groupList.get(i).click();
						
						
						break;
					}
					
				}
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
				saveBtn.click();
				
				String expMessageOnsave = "Saved Successfully";
				String actMessageOnsave = checkValidationMessageString(expMessageOnsave);
				
				Thread.sleep(2000);
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
				closeBtn.click();
				
				if(actMessageOnsaveWithoutGrp.equalsIgnoreCase(expMessageOnsaveWithoutGrp) && actMessageOnsave.equalsIgnoreCase(expMessageOnsave))
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			
			@FindBy(xpath="//tbody[@id='LandingGridBody']//tr//td[10]")
			private static List<WebElement> RecordnamegridList;
			
			@FindBy(xpath="//*[@id='lblnchecked']/input")
			private static WebElement Recordcheckbox;
			
			 
			public static boolean checkRecordcretedUnderGroup() throws InterruptedException
			{
				int ListCount = RecordnamegridList.size();
				
				ArrayList<String> ListArray = new ArrayList<String>();
				
				for(int i=0;i<ListCount;i++)
				{
					String data = RecordnamegridList.get(i).getText();
					
					if(data.equalsIgnoreCase("Grp"))
					{
						getAction().doubleClick(Recordcheckbox).build().perform();
						break;
					}
					
				}
				
				Thread.sleep(2000);
				
				boolean savedRecord = false;
				
				for(int i=0;i<ListCount;i++)
				{
					String data = RecordnamegridList.get(i).getText();
					
					if(data.equalsIgnoreCase("TestRecord"))
					{
						savedRecord = true;
						break;
					}
					
				}
				
				if (savedRecord == true)
				{
					return true;
				} 
				else 
				{
					return false;
				}
			}
			

			
			
			
	public ConfigureMasterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
