package com.focus.Pages;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import com.focus.base.BaseEngine;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xdgf.usermodel.section.geometry.GeometryRowFactory;
import org.omg.IOP.ExceptionDetailMessage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import com.focus.supporters.ExcelReader;
import com.focus.utilities.POJOUtility;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import com.focus.base.BaseEngine;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Action;



public class ReportDesignerPage extends BaseEngine
{
	//Logout and Login Screen
	
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
    
    
	    
		 
	public static void checkPopUpWindow() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 
	        
	        try 
	        {
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(doNotShowCheckbox));
				doNotShowCheckbox.click();
				
				
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtnInDemoPopupScreen));
				closeBtnInDemoPopupScreen.click(); 
				
				System.err.println("POP UP DISPLAYED AND CLOSED SUCCESSFULLY");
				
			} 
	        catch (Exception e)
	        {
	        	System.err.println("NO POP UP DISPLAYED");
			}
	
	    	
	    	
	}
			 
			
	@FindBy(xpath="//div[@class='theme_color font-6']")
	public static WebElement errorMessage;
	
	@FindBy(xpath="//span[@class='icon-reject2 theme_color']")
	public static WebElement errorMessageCloseBtn;
	
	public static String checkValidationMessage(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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
	
	
	
	@FindBy(xpath="//button[contains(text(),'Ok')]")
	private static WebElement loginRefreshOkBtn;
	
	
	public static void checkRefershPopOnlogin() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
	
	try 
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loginRefreshOkBtn));
		loginRefreshOkBtn.click();
		
		
	} 
	catch (Exception e)
	{
		System.err.println("NO ALERT POP UP DISPLAYED");
	}
	
	
	
	}
	
	 private static String xlfile;
	 private static String resPass="Pass";
	 private static String resFail="Fail";
	 private static ExcelReader excelReader;

	 private static int cSize;
	 
	 
		@FindBy(xpath="//*[@id='dashName']")
	    private static WebElement labelDashboard ;
		
		@FindBy(xpath="//*[@id='Select_dash']")
		private static WebElement selectDashboard ;
			
		@FindBy(xpath="//*[@id='Dashboard_AddDash']")
	    private static WebElement newAddDashBoard;
		 
	    @FindBy(xpath="//*[@id='Dashboard_Dash_Config']")
        private static WebElement dashboardCustomizationSettings;
	
	public static boolean checkLoginForReportDesigner() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		
		LoginPage lp=new LoginPage(getDriver()); 
			
	    String unamelt="su";
	  
	    String pawslt="su";
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(username));
	    username.click();
	    Thread.sleep(2000);
		username.clear();
	    Thread.sleep(2000);
	    username.sendKeys(unamelt);
	    getAction().moveToElement(username).sendKeys(Keys.TAB).perform();
	
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(password));
		password.click();
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(2000);
		password.sendKeys(pawslt);
	    
		/*String compname="Automation Company";
		
		Select oSelect = new Select(companyDropDownList);
		 
		List <WebElement> elementCount = oSelect.getOptions();
		
		int cqSize = elementCount.size();
		 
		int zqSize=cSize+1;
		 
		System.out.println("CompanyDropdownList Count :"+cqSize);
		 
		System.out.println("Company dropdown is :"+ zqSize);
	 
	 
		//Select dropdown= new Select(lp.companyDropDownList);
	    int i;
		  
		//List<WebElement> list = dropdown.getOptions();
	
		//List<String> text = new ArrayList<>();
		for(i=0; i<elementCount.size(); i++) 
		{
			elementCount.get(i).getText();
			String optionName = elementCount.get(i).getText();
			if(optionName.toUpperCase().startsWith(compname.toUpperCase()))
			{
				System.out.println("q"+elementCount.get(i).getText());
				elementCount.get(i).click();
			}	
		}*/
	
	    lp.clickOnSignInBtn();
	    
	    //checkRefershPopOnlogin();
	    
	    //checkPopUpWindow();
	    
	    Thread.sleep(8000);
	          
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
	   	userNameDisplay.click();
	           	
		String userInfo=userNameDisplay.getText();
		
		System.out.println("User Info : "+userInfo);
		
		System.out.println("User Info Capture Text :"+userNameDisplay.getText());
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
		
		companyLogo.click();
		
		String getCompanyTxt=companyName.getText();
		String getLoginCompanyName=getCompanyTxt.substring(0, 19);
		System.out.println("company name :"+ getLoginCompanyName);
		companyLogo.click();
		
	    
	    
	    String expuserInfo            ="SU";
	    String expLoginCompanyName    ="Automation Company ";
	    String expDashboard			  ="Graph with Active and setAsDefault";
	    boolean expdashboardGraph	  =true;
		boolean expdashboardLedger    =true;
		boolean expdashboardInfoPanel =true;
		String expAccountsTitle       ="Account";
		
		System.out.println("***********************************checkOpenAccountsMenu*********************************");
	    
	    System.out.println("User Info                        : "+userInfo               +"  value expected  "+expuserInfo);
	    System.out.println("Login Company Name               : "+getLoginCompanyName    +"  value expected  "+expLoginCompanyName);
	  
		if(userInfo.equalsIgnoreCase(expuserInfo) && getLoginCompanyName.equalsIgnoreCase(expLoginCompanyName))
		{	
			return true;
		}	 
		else
		{
			return false;
		}
	 }
	

	@FindBy(xpath="//a[@id='22']//span[contains(text(),'Report Designer')]")
	private static WebElement reportDesignerMenu;
	
	@FindBy(xpath="//span[@class='icon-xmlimport icon-font6']")
	private static WebElement importFromExcelBtn;
	
	@FindBy(xpath="//div[@id='myNavbar']//ul[@class='nav navbar-nav navbar-right']")
	private static WebElement exportFromExcelBtn;
	
	@FindBy(xpath="//div[contains(text(),'Reset')]")
	private static WebElement restartBtn;
	
	@FindBy(xpath="//div[contains(text(),'Delete')]")
	private static WebElement deleteBtn;
	
	@FindBy(xpath="//div[@id='myNavbar']//ul[@class='nav navbar-nav navbar-right']")
	private static WebElement backTab;
	
	@FindBy(xpath="//div[@onclick='RD_ENTRY.onNext_Click();']//div[@class='col-sm-12 toolbar_button_image']")
	private static WebElement nextTab;
	
	@FindBy(xpath="//span[@class='icon-ok icon-font6']")
	private static WebElement finishBtn;
	
	@FindBy(xpath="//span[@class='icon-close icon-font6']")
	private static WebElement cancelBtn;
	
	@FindBy(xpath="//div[@class='btn col-xs-12 header_button_group stop_text_overflow theme_background-color-inverse theme_color-inverse']")
	private static WebElement definitionTab;
	
	@FindBy(xpath="//input[@id='id_rd_definition_reportname']")
	private static WebElement reportNameDropdown;


	@FindBy(xpath="//select[@id='id_rd_definition_reporttype']")
	private static WebElement reportTypeDropdown; 	
	
	@FindBy(xpath="//input[@id='advanceEngine']")
	private static WebElement advanceEngineCkeckbox;


	@FindBy(xpath="//select[@id='id_rd_definition_modules']")
	private static WebElement moduleDropdown;
	
	
	
	@FindBy(xpath="//select[@id='id_rd_definition_datasets']")
	private static WebElement dataSetDropdown;


	@FindBy(xpath="//input[@id='id_rd_parameter_entry_fieldname']")
	private static WebElement fieldNameTextbox;
	
	@FindBy(xpath="//input[@id='id_rd_parameter_entry_variablename']")
	private static WebElement variablenameTextbox;


	@FindBy(xpath="//select[@id='id_rd_parameter_entry_fieldtype']")
	private static WebElement fieldTypeDropddown;
	
	@FindBy(xpath="//input[@id='id_rd_parameter_entry_viewname']")
	private static WebElement viewnameTextBox;


	@FindBy(xpath="//input[@id='id_rd_parameter_entry_valuecolumn']")
	private static WebElement valueColoumTextBox;
	
	@FindBy(xpath="//input[@id='id_rd_parameter_entry_displaycolumn']")
	private static WebElement displayColumnTexBox;
	
	@FindBy(xpath="//input[@onclick='RD_ENTRY.PARAMETER.onOK_Click();']")
	private static WebElement okBtn;
	
	@FindBy(xpath="//input[@onclick='RD_ENTRY.PARAMETER.onCancel_Click();']")
	private static WebElement cancelBtnatLast;
	
	@FindBy(xpath="//input[@value='Add']")
	private static WebElement addBtn;
	
	@FindBy(xpath="//input[@onclick='RD_ENTRY.PARAMETER.onDelete_Click();']")
	private static WebElement deleteBtnatLast;
	
	@FindBy (xpath="//*[@id='1']/div/span")
    public static WebElement homeMenu;
	
	
	  @FindBy (xpath="//*[@id='navigation_menu']/li[1]/ul/li[5]/ul/li")
	  private static List<WebElement> utilitesList;
	  
	  @FindBy(xpath="//a[@id='20']//span[contains(text(),'Utilities')]")
		private static WebElement  utilities;
	  
	  @FindBy(xpath="//*[@id='id_menu_tree_135']/a/i")
	  private static WebElement  inventoryExpandBtn;
	  
	  @FindBy(xpath="	//*[@id='id_menu_tree_200']/a/span")
	  private static WebElement  reportsBtn;
	  
		//DATA SET Tab
		
		
		@FindBy(xpath="//*[@id='id_rd_header_button_group_2']/div[1]")
		private static WebElement dataSetTab;
		
		@FindBy(xpath="//span[@id='id_rd_customization_transet_tab_add']")
		private static WebElement plusBtn;
		
		
		@FindBy(xpath="//select[@id='id_rd_transet0_documentstatus']")
		private static WebElement documentStatsDropdown;
		
		
		@FindBy(xpath="//select[@id='id_rd_transet0_verificationstatus']")
		private static WebElement verificationDropdown;
		
		
		@FindBy(xpath="//select[@id='id_rd_transet0_authorizationstatus']")
		private static WebElement authorizationStatusDropdown;
		
		
		@FindBy(xpath="//select[@id='id_rd_transet0_brsstatus']")
		private static WebElement brsStatusDropdown;
		
		
		@FindBy(xpath="//span[@id='idFilterCustomizeIcon']")
		private static WebElement customizeIcon;
		
		
		@FindBy(xpath="//span[@id='a']")
		private static WebElement filterIcon;
		
		@FindBy(xpath="//*[@id='id_rd_transet0_select']/li")
		private static List<WebElement> transactionSetList;
		
		// Customization Tab
		
		@FindBy(xpath="//*[@id='id_rd_header_button_group_3']/div[1]/span[2]")
		private static WebElement customizationTab;
		
		
		@FindBy(xpath="//div[@id='id_rd_customization_columnproperty']//div[@class='col-sm-12 toolbar_button_image']")
		private static WebElement columnPropertyTab;
		
		
		@FindBy(xpath="//input[@id='id_rd_customization_tree_search']")
		private static WebElement searchBox;
		
		
		@FindBy(xpath="//span[@class='icon-searchnumaric icon-font6']")
		private static WebElement searchNumericIcon;
		
		
		@FindBy(xpath="//span[@class='glyphicon glyphicon-text-color']")
		private static WebElement searchStringItemIcon;
		
		
		@FindBy(xpath="//span[@class='icon-left-and-right-panel-icon icon-font6']")
		private static WebElement closingPanelIcon;
		
		
		@FindBy(xpath="//input[@value='Create Virtual Field']")
		private static WebElement createVirtualFieldBox;
		
		//Row Formatting Tab
		
		
		
		@FindBy(xpath="//div[@id='id_rd_customization_rowformatting']//div[@class='col-sm-12 toolbar_button_image']")
		private static WebElement rowFormattingTab;
		
		
		@FindBy(xpath="//input[@id='rfnew']")
		private static WebElement newBtn;
		
		
		@FindBy(xpath="//input[@id='rfdelete']")
		private static WebElement deleteBtnInRf;
		
		
		@FindBy(xpath="//select[@id='id_set_on_column']")
		private static WebElement setOnColumnDropdown;
		
		
		@FindBy(xpath="//input[@id='id_label_for_condition']")
		private static WebElement labelForConditionTextBox;
		
		
		@FindBy(xpath="//div[@id='id_rowformatting_browsefile_ctrl_container']//table")
		private static WebElement imageForCondtionFileElement;
		
		
		@FindBy(xpath="//span[@class='icon-edit icon-font7 theme_color-inverse FAttachment_Img']")
		private static WebElement imageForConitionNeworEditFile;
		
		@FindBy(xpath="//input[@id='id_rf_font']")
		private static WebElement fontBtn;
		
		
		@FindBy(xpath="//input[@id='id_DontUseAbsoluteValue']")
		private static WebElement useDefaultValueCheckBox;
		
		
		@FindBy(xpath="//input[@id='rfok']")
		private static WebElement okBtnAtLast;
		
		
		@FindBy(xpath="//input[@id='rfclear']")
		private static WebElement cancelBtnAtLast;
		
		//SORTING TAB
		
		
		@FindBy(xpath="//div[@id='id_rd_customization_sorting']//div[contains(@class,'col-sm-12 toolbar_button_image')]")
		private static WebElement sortingTab;
		
		@FindBy(xpath="//i[contains(@class,'fa fa-caret-right fa-2x')]")
		private static WebElement forwardBtn;
		
		
		@FindBy(xpath="//i[contains(@class,'fa fa-caret-left fa-2x')]")
		private static WebElement backwardBtn;
		
		@FindBy(xpath="//select[@id='id_rd_customization_sorting_select']")
		private static WebElement noneDropdown;
		
		
		@FindBy(xpath="//input[@id='id_rd_customization_sorting_rows']")
		private static WebElement emptyTextArea;
		
		@FindBy(xpath="//input[contains(@onclick,'RD_ENTRY.CUSTOMIZATION.SORTING.onOK_Click(event);')]")
		private static WebElement okButton;
		
		
		@FindBy(xpath="//input[contains(@onclick,'RD_ENTRY.on_Customization_ColumnProperty_Click();')]")
		private static WebElement cancelButton;
		
		@FindBy(xpath="//label[normalize-space()='Landscape Orientation']")
		private static WebElement landScapeOrientationTab;
		
		
		@FindBy(xpath="//l")
		private static WebElement printZeroValue;
		
		@FindBy(xpath="//div[@id='id_rd_header_button_group_4']//div[contains(@class,'btn col-xs-12 header_button_group stop_text_overflow theme_background-color theme_color')]")
		private static WebElement headerFooterTab;
		
		@FindBy(xpath="//div[@id='id_rd_header_button_group_5']//div[contains(@class,'btn col-xs-12 header_button_group stop_text_overflow theme_background-color theme_color')]")
		private static WebElement previewTab;
		
		@FindBy(xpath="//*[@id='rd_customization_tree0']/a/i")
		private static WebElement transactionExpandBtn;
		
		@FindBy(xpath="(//li[@data-fieldname='Date']/a/i)[1]")
		private static WebElement dateExpandBtn;
		
		@FindBy(xpath="(//li[@data-fieldname='Date']/a/span)[2]")
		private static WebElement dateFieldBtn;

		@FindBy(xpath="//*[@id='rd_customization_tree51']/a/span")
		private static WebElement docNoFieldBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree58']/a/i")
		private static WebElement itemExpandBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree58']/ul/li[1]/a/span")
		private static WebElement itemNameBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree223']/a/span")
		private static WebElement quantityBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree227']/a/span")
		private static WebElement rateBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree55']/a/span")
		private static WebElement grossBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree319']/a/i")
		private static WebElement deptExpandBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree319']/ul/li[1]/a/span")
		private static WebElement deptNameBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree361']/a/i")
		private static WebElement warehouseExpandBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree361']/ul/li[1]/a/span")
		private static WebElement warehouseNameBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree310']/a/span")
		private static WebElement voucherAliasBtn;
		
		@FindBy(xpath="//*[@id='rd_customization_tree1618']/a/span")
		private static WebElement voucherNameBtn;
		
		@FindBy (xpath="//select[@id='id_rd_transet0_select_documentclass']")
		private static WebElement dataSetTabVouchersTab;
		
		@FindBy (xpath="//*[@id='rd_customization_tree0']/ul/li[1]/a/i")
		private static WebElement transactionFieldsExpandBtn;
		
		@FindBy (xpath="//*[@id='rd_customization_tree0']/ul/li[2]/a/i")
		private static WebElement extraFieldsExpandBtn;
		
		
		
 	public static boolean checkSavingReportDesignerOfAllTransactionsOfDocumentClass() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
 		homeMenu.click();
 			
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilities));
 		utilities.click();
 		    
 		Thread.sleep(2000);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportDesignerMenu));
 		reportDesignerMenu.click();
		 
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportNameDropdown));
 		reportNameDropdown.sendKeys("All transactions of document class");
 		reportNameDropdown.sendKeys(Keys.TAB);
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportTypeDropdown));
 		Select rtd= new Select(reportTypeDropdown);
 		rtd.selectByVisibleText("Details");
		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryExpandBtn));
 		inventoryExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportsBtn));
 		reportsBtn.click();
 		
 		
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataSetTab));
 		dataSetTab.click();
 		
 		Thread.sleep(2000);
 		
 		int transactionSetListCount = transactionSetList.size();
 		
 		for(int i=0;i<=transactionSetListCount;i++)
 		{
 			String data = transactionSetList.get(i).getText();
 			
 			if(data.equalsIgnoreCase("All transactions of document class"))
 			{
 				transactionSetList.get(i).click();
 				
 				break;
 			}
 		}
 		
 		Select voucher = new Select(dataSetTabVouchersTab);
 		voucher.selectByVisibleText("Purchases Vouchers");
 		
 		Thread.sleep(2000);
 		
 		
 		
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customizationTab));
 		customizationTab.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionExpandBtn));
 		transactionExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionFieldsExpandBtn));
 		transactionFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateExpandBtn));
 		dateExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateFieldBtn));
 		getAction().doubleClick(dateFieldBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateExpandBtn));
 		dateExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(docNoFieldBtn));
 		getAction().doubleClick(docNoFieldBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtn));
 		itemExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemNameBtn));
 		getAction().doubleClick(itemNameBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemExpandBtn));
 		itemExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(quantityBtn));
 		getAction().doubleClick(quantityBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rateBtn));
 		getAction().doubleClick(rateBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grossBtn));
 		getAction().doubleClick(grossBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionFieldsExpandBtn));
 		transactionFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFieldsExpandBtn));
 		extraFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deptExpandBtn));
 		deptExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deptNameBtn));
 		getAction().doubleClick(deptNameBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(deptExpandBtn));
 		deptExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseExpandBtn));
 		warehouseExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseNameBtn));
 		getAction().doubleClick(warehouseNameBtn).build().perform();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(warehouseExpandBtn));
 		warehouseExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(extraFieldsExpandBtn));
 		extraFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionFieldsExpandBtn));
 		transactionFieldsExpandBtn.click();
 		
 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finishBtn));
 		finishBtn.click();
 		
 		String expMessage = "Data saved successfully.";
 		
 		String actMessage = checkValidationMessage(expMessage);
 		
 		System.out.println("Validation Message : "+actMessage+" Value Expected : "+expMessage);
		
		if(actMessage.equalsIgnoreCase(expMessage))
 		{
		 
 			return true;
 		}
 		else
 		{
 			return false;
 		}
	}
	
 	
 	@FindBy(xpath="//*[@id='id_rd_definition_reportname_table_data']/tbody/tr/td")
 	private static List<WebElement> reportNameList;
 	
 	@FindBy(xpath="//*[@id='id_rd_customization_table']/thead/tr/th")
 	private static List<WebElement> customizeTabTableHeaderLsist;
	
 	
 	
	 
     public ReportDesignerPage(WebDriver driver)
     {
    	PageFactory.initElements(driver, this);
    	
     }
	
	
}
