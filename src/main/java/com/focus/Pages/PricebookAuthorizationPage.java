package com.focus.Pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
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

public class PricebookAuthorizationPage extends BaseEngine{
	
	
	 @FindBy(xpath="//div[contains(text(),'Settings')]")
	private static WebElement  settingsmenuBtn;
	
	@FindBy(xpath="//*[@id='235']/span")
	private static WebElement  pricebookAuthorizationBtn;
	
	@FindBy(xpath="//input[@id='txtDoc']")
	private static WebElement  pricebookDropdown;
	
	@FindBy(xpath="//li[normalize-space(text())='Buying Price Book']")
	private static WebElement  BuyingPriceBook;
	
	@FindBy(xpath="//li[normalize-space(text())='Selling Price Book']")
	private static WebElement  SellingPriceBook;
	
	  @FindBy(xpath="//*[@id='ctrlAuthorizationH']")
	  private static WebElement transAuthNameTxt; 
	  
	  
	  @FindBy(xpath="//*[@id='spnAddLevel']/i")
	  private static WebElement addLevelBtn; 
	  
	  
	  @FindBy(xpath="//*[@id='txtDescription']")
	  private static WebElement descriptionTxt; 
		
	  @FindBy(xpath="//*[@id='chkConditionNotRequired']")
	  private static WebElement conditionNotRequiredChkBox; 
	  
	  @FindBy(xpath="//*[@id='id_report_popup_body']/div[2]/div/div[1]/ul/li[2]/a/span")
	  private static WebElement userSelectionTab;
	
	  @FindBy(xpath="//*[@id='ddlUserSelection']")
	  private static WebElement userselectionDropdown;
	
	  @FindBy(xpath="//*[@id='ddlCriteria']")
	  private static WebElement criteriaDropdown;
	  
	  @FindBy(xpath="//*[@id='id_tblUserSelection_User']")
	  private static WebElement userDropdown;
		
	  @FindBy(xpath="//td[@id='id_tblUserSelection_col_1-1']")
	  private static WebElement userrow1;
		
	  @FindBy(xpath="//td[@id='id_tblUserSelection_col_2-1']")
	  private static WebElement userrow2;
	  
	  @FindBy(xpath="//*[@id='id_report_popup_ok']")
	  private static WebElement definitionOkBtn;					
				
	  @FindBy(xpath="//span[@id='id_report_popup_cancel']")
	  private static WebElement definitionCloseBtn;	
	  
	  
	  @FindBy(xpath="//*[@id='ulAuthBtns']/li[5]/span/i")
	  private static WebElement tranAuthCancelBtn; 
			
	  @FindBy(xpath="//*[@id='btnSaveAuthorization']")
	  private static WebElement tranAuthSaveBtn; 
	  
	  @FindBy(xpath="//*[@id='spndeleteProfile']")
	  private static WebElement tranAuthDeleteBtn; 
	  
		@FindBy(xpath="//*[@id='id_report_popup_body']/div[2]/div/div[1]/ul/li[3]/a/span")
		private static WebElement alertsTab;
	  
		@FindBy(xpath="//u[contains(text(),'Email Header Template')]")
		private static WebElement emailHeaderTemplateLink;
	  
		@FindBy(xpath="//input[@id='smsTemplateOptCtrl']")
		private static WebElement templateTxt;
	  
		@FindBy(xpath="//tbody[@id='smsTemplateOptCtrl_table_body']/tr/td[2]")
		private static List<WebElement> custTemplatesList;
	  
		@FindBy(xpath="//span[@id='btnCloseSMSModal']")
		private static WebElement custTemplateCloseBtn;
		
		
		@FindBy(xpath="//*[@id='chkActive']")
		private static WebElement activeChkBox;  
		
		@FindBy(xpath="//*[@id='chkAlwaysauthorizationstartsfromfirstlevel']")
		private static WebElement alwaysauthorizationstartsfromfirstlevelChkBox; 
		
		@FindBy(xpath="//*[@id='spnAddParallel']/i")
		private static WebElement addParallelBtn;    
		
		@FindBy(xpath="//*[@class='icon-font7 icon-clear']")
		private static WebElement clearbtnInAuth; 
		
		@FindBy(xpath="//*[@class='icon-cancel icon-font7']")
		private static WebElement cancelBtnInAuth; 
			
		@FindBy(xpath="//*[@id='chkDateRange']")
		private static WebElement dateRangeChkBox; 
			
		@FindBy(xpath="//*[@id='dpFromDate']")
		private static WebElement fromDateTxt; 
			
		@FindBy(xpath="//*[@id='dpToDate']")
		private static WebElement toDateTxt; 
		
		@FindBy(xpath="//*[@id='chkTimeRange']")
		private static WebElement timeRangeChkBox;
			
		@FindBy(xpath="//*[@id='tpFromTime']")
		private static WebElement fromTimeTxt; 
			
		@FindBy(xpath="//*[@id='tpToTime']")
		private static WebElement totimeTxt; 
		
		@FindBy(xpath="//i[@id='id_StartNode']")
		private static WebElement startPointBtn; 
		
		@FindBy(xpath="//span[contains(text(),'Condition')]")
		private static WebElement conditionTab; 
		
		
		@FindBy(xpath="//*[@id='235_0_AdvanceFilter_']/table/tbody/tr/td[1]/select")
		private static WebElement conjunctionDropdown; 
			
		@FindBy(xpath="//tbody//input[@placeholder='Select Field']")
		private static WebElement selectFieldTxt; 
		
		@FindBy(xpath="//*[@id='235_0_AdvanceFilter_']//tbody/tr/td[3]/select[@class='Fselect']")
		private static WebElement selectOperatorDropdown; 
			
		@FindBy(xpath="//*[@id='235_0_AdvanceFilter_']//tbody/tr/td[4]/select[@class='Fselect']")
		private static WebElement compareWithDropdown; 
			
		@FindBy(xpath="//*[@id='235_0_AdvanceFilter_']//tbody/tr/td[5]/input")
		private static WebElement valueTxt;
		
		@FindBy(xpath="//select[@id='ddlStatus']")
		private static WebElement selectStatus;
		
		@FindBy(xpath="//*[@id='chkFullAuthorization']")
		private static WebElement fullAuthorizationChkBox;
		
		@FindBy(xpath="//select[@id='ddlUndoAuthEditing']")
		private static WebElement selectUndoAuthEditing;
		
		@FindBy(xpath="//*[@id='id_report_popup_cancel']/i")
		private static WebElement definitionCancelBtn;	
		
		@FindBy(xpath="//*[@id='chkReceived']")
		private static WebElement receivedChkBox;	
			
		@FindBy(xpath="//*[@id='chkApproved']")
		private static WebElement approvedChkBox;	
			
		@FindBy(xpath="//*[@id='chkRejected']")
		private static WebElement rejectedChkBox;	
			
		@FindBy(xpath="//*[@id='chkStopped']")
		private static WebElement stoppedChkBox;	
		
		@FindBy(xpath="//*[@id='id_tblAlerts_control_heading_2']/div/u")
		private static WebElement emailHeaderTemplateBtn;	
		
		@FindBy(xpath="//u[contains(text(),'Email Template')]")
		private static WebElement emailTemplateBtn;	
		
		@FindBy(xpath="//u[contains(text(),'Alerts')]")
		private static WebElement headerAlert;

		@FindBy(xpath="//div[@class='divStopNode']//i[@class='icon-end icon-font4 grey']")
		private static WebElement endpoint;
		
		@FindBy(xpath="//li[normalize-space(text())='Buying Price Book (1)']")
		private static WebElement  createBuyingPriceBook;
		
		@FindBy(xpath="//*[@id='advancefilter_TableOptionControl_235_0']")
		private static WebElement enter_valueTxt;
		
		@FindBy(xpath="(//*[@id='1'])[2]")
		private static WebElement selectFieldpricebookName;
		
		@FindBy(xpath="//span[contains(text(),'Alerts')]")
		private static WebElement alertTabInEdit;
		
		@FindBy(xpath="//u[contains(text(),'SMS template')]")
		private static WebElement headerSMSTemplate;	
		

		@FindBy(xpath="//input[@id='smsTemplateOptCtrl']")
		private static WebElement emailTemplates;
		
		@FindBy(xpath="//i[@class='icon-open icon-font7']")
		private static WebElement companyMenu;
		
		@FindBy(xpath="//span[contains(text(),'Company Name')]")
		private static WebElement companyNameSource;
		
		@FindBy(xpath="//textarea[@id='txtTemplate']")
		private static WebElement companyNameTemplateArea;
		
		@FindBy(xpath="//span[@id='btnSaveSmsTemplate']")
		private static WebElement saveBtnInEmailTemplateHeader;
		
		@FindBy(xpath="//span[@id='btnNewSmsTemplate']")
		private static WebElement newButtonInCreateTemplate;
		
		@FindBy(xpath="//span[@id='btnCloseSMSModal']")
		private static WebElement closeButtonInCreateTemplate;
		
		
		
		
		public boolean 	checkOpenPricebookAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
			settingsmenuBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pricebookAuthorizationBtn));
			pricebookAuthorizationBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pricebookDropdown));
			
		    boolean actpricebookDropdown                       = pricebookDropdown.isDisplayed();
			boolean actnameTxt                              = nameTxt.isDisplayed();
			boolean actactiveChkBox                         = activeChkBox.isDisplayed();
			boolean actalwaysauthorstartsfirstlevelChkBox   = alwaysauthorizationstartsfromfirstlevelChkBox.isDisplayed();
			boolean actaddLevelBtn                          = addLevelBtn.isDisplayed();
			boolean actaddParallelBtn                       = addParallelBtn.isDisplayed();
			boolean actclearbtn               				= clearbtnInAuth.isDisplayed();
			boolean actsaveBtn  							= saveBtn.isDisplayed();
			boolean actcancelBtn 							= cancelBtnInAuth.isDisplayed();
			boolean actdeleteBtn			                = deleteBtn.isDisplayed();
			
			boolean exppricebookDropdown                       = true;
			boolean expnameTxt            					= true;
			boolean expactiveChkBox                			= true;
			boolean expalwaysauthorstartsfirstlevelChkBox   = true;
			boolean expaddLevelBtn          				= true;
			boolean expaddParallelBtn              			= true;
			boolean expclearbtn               				= true;
			boolean expsaveBtn  							= true;
			boolean expcancelBtn							= true;
			boolean expdeleteBtn							= true;
			
			System.out.println("********************* checkTransactionAuthorizationOptions ******************");
		
			System.out.println("Home Page pricebookDropdown                     :"+actpricebookDropdown                      +"  Value Expected : "+exppricebookDropdown);
			System.out.println("Home Page nameTxt                            :"+actnameTxt                             +"  Value Expected : "+expnameTxt);
			System.out.println("Home Page activeChkBox                       :"+actactiveChkBox                        +"  Value Expected : "+expactiveChkBox);
			System.out.println("Home Page alwaysauthorstartsfirstlevelChkBox :"+actalwaysauthorstartsfirstlevelChkBox  +"  Value Expected : "+expalwaysauthorstartsfirstlevelChkBox);
	        System.out.println("Home Page addLevelBtn                        :"+actaddLevelBtn                         +"  Value Expected : "+expaddLevelBtn);
			System.out.println("Home Page addParallelBtn                     :"+actaddParallelBtn                      +"  Value Expected : "+expaddParallelBtn);
			System.out.println("Home Page clearbtn                           :"+actclearbtn                            +"  Value Expected : "+expclearbtn);
			System.out.println("Home Page saveBtn                            :"+actsaveBtn                             +"  Value Expected : "+expsaveBtn);
			System.out.println("Home Page cancelBtn 						 :"+actcancelBtn                           +"  Value Expected : "+expcancelBtn);
			System.out.println("Home Page deleteBtn                          :"+actdeleteBtn                           +"  Value Expected : "+expdeleteBtn);
			
			
			boolean res =  actpricebookDropdown==exppricebookDropdown  && actnameTxt==expnameTxt &&
					actactiveChkBox==expactiveChkBox && actalwaysauthorstartsfirstlevelChkBox==expalwaysauthorstartsfirstlevelChkBox && 
					actaddLevelBtn==expaddLevelBtn  && actaddParallelBtn==expaddParallelBtn && 
				    actclearbtn==expclearbtn && actsaveBtn==expsaveBtn && actcancelBtn==expcancelBtn && actdeleteBtn==expdeleteBtn;
			
			String actres = Boolean.toString(res);
			String expres = "true";
			
			
			
			System.err.println("Dispaly Result : "+actres+" Value Expected : "+expres);
			
			if(actres.equalsIgnoreCase(expres))
				
			{
				System.out.println("Test Pass : PriceBook Authorization is Displayed");
				
				return true;
			}
			else
			{
				System.out.println("Test Fail : PriceBook Authorization is Displayed");
				
				return false;
			}
		}
		
		
		public boolean 	checkPricebookDropdownOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			String actpricebookDropdown=pricebookDropdown.getAttribute("placeholder");
			String exppricebookDropdown="pricebook Type";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pricebookDropdown));
			pricebookDropdown.click();
			
			Thread.sleep(2000);
			pricebookDropdown.sendKeys(Keys.SPACE);
			
		
			 boolean actbuyingpricebook        = BuyingPriceBook.isDisplayed();
			 boolean actsellingpricebook        = SellingPriceBook.isDisplayed();
			 
			 boolean expbuyingpricebook        = true;
			 boolean expsellingpricebook        = true;

				
			 System.out.println("****************************** checkpricebookDropdownOptions  ********************************************");
			 System.out.println("Buyingpricebook        : "+actbuyingpricebook         +"   Value Expected  : "+expbuyingpricebook);
			 System.out.println("Sellingpricebook               :"+actsellingpricebook                 +"   Value Expected : "+expsellingpricebook);
			 
			 boolean res =  actbuyingpricebook==expbuyingpricebook && actsellingpricebook==expsellingpricebook;
				
			 String actres = Boolean.toString(res);
			 String expres = "true";
				
			 
				
			 if(actres.equalsIgnoreCase(expres))
			{
				System.out.println("Test Pass : Master Dropdown Options Are As expected");
				
				return true;
			}
			else
			{
				System.out.println("Test Fail : Master Dropdown Options Are NOT As expected");
				
				return false;
			}
		}

		public boolean 	checkSaveWithoutSelectionOfPriceBook() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			
			System.out.println("************************************checkSaveWithoutSelectionOfPriceBook**********************************");
			
			String expMessage="Give proper Authorization name.";
			
			String actMessage=checkValidationMessage(expMessage);	
			
			
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Error Message is As Expected");
				
				return true;
			}
			else
			{
				System.out.println("Test Fail : PriceBook Authorization is Displayed");
				
				return false;
			}
		}
		
		
		
		public boolean 	checkSelectingBuyingPriceBookinPriceBookDropdown() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pricebookDropdown));
			pricebookDropdown.click();
			pricebookDropdown.sendKeys(Keys.SPACE);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(BuyingPriceBook));
			BuyingPriceBook.click();
			
			Thread.sleep(2000);
			
			
			String actPriceBookDropdown=pricebookDropdown.getAttribute("value");
			String expPriceBookDropdown="Buying Price Book";
			
			

			System.out.println("********************************checkSelectingBuyingPriceBookinPriceBookDropdown*********************"); 
			
			
			System.out.println("PriceBookDropdown   : "+actPriceBookDropdown+" Value Expected : "+expPriceBookDropdown);
			
			if(actPriceBookDropdown.equalsIgnoreCase(expPriceBookDropdown))
			{
				System.out.println("Test Pass : Buying PriceBook is Selected");
				
				return true;
			}
			else
			{
				System.out.println("Test Fail :Buying PriceBook is Not Selected");
				
				return false;
			}
			
			
		}

		public boolean 	checkSaveWithoutName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
					
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			System.out.println("********************************************checkSaveWithoutName***************************");
			
			String expMessage="Give proper Authorization name.";
			
			String actMessage=checkValidationMessage(expMessage);
					
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Error Message is As Expected");
				
				return true;
			}
			else
			{
				System.out.println("Test Fail : Pricebook Authorization is Displayed");
				
				return false;
			}
		}  
	  
	  
		public boolean 	checkActiveCheckBox() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(activeChkBox));
			
			boolean actactiveChkBox=activeChkBox.isSelected();
			boolean expactiveChkBox=true;
			
			System.out.println("*****************************************checkActiveCheckBox***********");
			
			System.out.println("activeChkBox   :"+actactiveChkBox +"  Value Expected : "+expactiveChkBox);
			
			boolean res = actactiveChkBox==expactiveChkBox;
			
			String actres = Boolean.toString(res);
			String expres = "true";
	
			if(actres.equalsIgnoreCase(expres))
			{
				System.out.println("Test Pass : Active ChkBox IS Enabled/Checked");
				
				return true;
			}
			else
			{
				System.out.println("Test Fail : Active ChkBox IS NOT Enabled/Checked");
				
				return false;
			}
		}
		
		public boolean 	checkInputNameAndClickOnSaveWithoutAuthorizationSettings() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.sendKeys("Buyer");
			//nameTxt.sendKeys(Keys.TAB);
			
			
			Thread.sleep(2000);
			
			String actnameTxt=nameTxt.getAttribute("value");
			String expnameTxt="Buyer";
			
			
			
			System.out.println("**********************************************checkInputNameAndClickOnSaveWithoutAuthorizationSettings**********************");
			
			System.out.println("nameTxt   :"+actnameTxt +" Value Expected : "+expnameTxt);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			String expMessage="Create Authorization before Saving";
			
			String actMessage=checkValidationMessage(expMessage);
			
			
			
			if(actnameTxt.equalsIgnoreCase(expnameTxt) && actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Test Pass : Account inputed Successfully");
				return true;
			}
			else
			{
				System.out.println("Test Fail : Account NOT inputed Successfully");
				return false;
			}
		}	
	
		
		public boolean 	checkStartPoint() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startPointBtn));
			 getAction().doubleClick(startPointBtn).build().perform();
			
			 Thread.sleep(2000);
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionTab));
			 boolean actconditionTab            = conditionTab.isDisplayed();
			 boolean actuserSelectionTab        = userSelectionTab.isDisplayed();
			 boolean actalertsTab               = alertsTab.isDisplayed();
			  
			 boolean expconditionTab            = true;
			 boolean expuserSelectionTab        = true;
			 boolean expalertsTab               = true;
			  
			 System.out.println("***********************************************checkStartPoint****************");
			  
			 System.out.println("conditionTab            "+actconditionTab         +"  Value Expected  :"+expconditionTab);
			 System.out.println("userSelectionTab        "+actuserSelectionTab     +"  Value Expected  :"+expuserSelectionTab);
			 System.out.println("alertsTab               "+actalertsTab            +"  Value Expected  :"+expalertsTab);
			 
			 boolean res = actconditionTab==expconditionTab && actuserSelectionTab==expuserSelectionTab && actalertsTab==expalertsTab;
				
			 String actres = Boolean.toString(res);
			 String expres = "true";
					
			
			  
			 if(actres.equalsIgnoreCase(expres))
			{
				System.out.println("Test Pass : Start Point works As Expected");
				
				return true;
			}
			else
			{
				System.out.println("Test Fail : Start Point NOT works As Expected");
				
				return false;
			}
		}
		
		
		public boolean 	checkConditionTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionTab));
			 conditionTab.click();
			
			 Thread.sleep(2000);

			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
			 boolean actdescriptionTxt                    = descriptionTxt.isDisplayed();
			 boolean actconditionNotRequiredChkBox        = conditionNotRequiredChkBox.isDisplayed();
			 boolean actdateRangeChkBox                   = dateRangeChkBox.isDisplayed();
			 boolean acttimeRangeChkBox           		  = timeRangeChkBox.isDisplayed();
			 boolean actfromDateTxt           			  = fromDateTxt.isDisplayed();
			 boolean acttoDateTxt           			  = toDateTxt.isDisplayed();
			 boolean actfromTimeTxt            			  = fromTimeTxt.isDisplayed();
			 boolean acttotimeTxt                         = totimeTxt.isDisplayed();
			 boolean actconjunctionDropdown        		  = conjunctionDropdown.isDisplayed();
			 boolean actselectFieldTxt               	  = selectFieldTxt.isDisplayed();
			 boolean actselectOperatorDropdown            = selectOperatorDropdown.isDisplayed();
			 boolean actcompareWithDropdown               = compareWithDropdown.isDisplayed();
			 boolean actvalueTxt               			  = valueTxt.isDisplayed();
			 boolean actStatus							  = selectStatus.isDisplayed();
			 boolean actfullAuthorizationChkBox			  = fullAuthorizationChkBox.isDisplayed();
			 boolean actUndoAuthEditing					  =	selectUndoAuthEditing.isDisplayed();
			 
				
			 boolean expdescriptionTxt                    = true;
			 boolean expconditionNotRequiredChkBox        = true;
			 boolean expdateRangeChkBox                   = true;
			 boolean exptimeRangeChkBox           		  = true;
			 boolean expfromDateTxt           			  = true;
			 boolean exptoDateTxt                         = true;
			 boolean expfromTimeTxt                       = true;
			 boolean exptotimeTxt                         = true;
			 boolean expconjunctionDropdown               = true;
			 boolean expselectFieldTxt                    = true;
			 boolean expselectOperatorDropdown            = true;
			 boolean expcompareWithDropdown               = true;
			 boolean expvalueTxt               			  = true;
			 boolean expStatus							  = true;
			 boolean expfullAuthorizationChkBox			  = true;
			 boolean expUndoAuthEditing					  =	true;
			 
			 
			 
			
			 System.out.println("****************************** checkConditionTabOptions  ********************************************");
			 
			 System.out.println("descriptionTxt               :"+actdescriptionTxt             +"    Value Expected : "+expdescriptionTxt);
			 System.out.println("conditionNotRequiredChkBox   :"+actconditionNotRequiredChkBox +"    Value Expected : "+expconditionNotRequiredChkBox);
			 System.out.println("dateRangeChkBox              :"+actdateRangeChkBox            +"	 Value Expected : "+expdateRangeChkBox);
			 System.out.println("timeRangeChkBox              :"+acttimeRangeChkBox            +"	 Value Expected : "+exptimeRangeChkBox);
			 System.out.println("fromDateTxt                  :"+actfromDateTxt                +"	 Value Expected : "+expfromDateTxt);
			 System.out.println("toDateTxt                    :"+acttoDateTxt                  +"	 Value Expected : "+exptoDateTxt);
			 System.out.println("fromTimeTxt                  :"+actfromTimeTxt                +"	 Value Expected : "+expfromTimeTxt);
			 System.out.println("totimeTxt                    :"+acttotimeTxt                  +"	 Value Expected : "+exptotimeTxt);
			 System.out.println("conjunctionDropdown          :"+actconjunctionDropdown        +"	 Value Expected : "+expconjunctionDropdown);
			 System.out.println("selectFieldTxt               :"+actselectFieldTxt             +"	 Value Expected : "+expselectFieldTxt);
			 System.out.println("selectOperatorDropdown       :"+actselectOperatorDropdown     +"	 Value Expected : "+expselectOperatorDropdown);
			 System.out.println("compareWithDropdown          :"+actcompareWithDropdown        +"    Value Expected : "+expcompareWithDropdown);
			 System.out.println("valueTxt                     :"+actvalueTxt                   +"	 Value Expected : "+expvalueTxt);
			 System.out.println("status                       :"+actStatus                     +"	 Value Expected : "+expStatus);
			 System.out.println("fullAuthChkBox               :"+actfullAuthorizationChkBox    +"	 Value Expected : "+expfullAuthorizationChkBox);
			 System.out.println("undoAuthEditing              :"+actUndoAuthEditing            +"	 Value Expected : "+expUndoAuthEditing);
			 
			
			 boolean res = actdescriptionTxt==expdescriptionTxt  && actconditionNotRequiredChkBox==expconditionNotRequiredChkBox && actdateRangeChkBox==expdateRangeChkBox
					 && acttimeRangeChkBox==exptimeRangeChkBox && actfromDateTxt==expfromDateTxt && acttoDateTxt==exptoDateTxt&& actfromTimeTxt==expfromTimeTxt 
					 && acttotimeTxt==exptotimeTxt && actconjunctionDropdown==expconjunctionDropdown && actselectFieldTxt==expselectFieldTxt 
					 && actselectOperatorDropdown==expselectOperatorDropdown && actcompareWithDropdown==expcompareWithDropdown && actvalueTxt==expvalueTxt 
					&&actStatus==expStatus && actfullAuthorizationChkBox==expfullAuthorizationChkBox && actUndoAuthEditing==expUndoAuthEditing;
				
			 String actres = Boolean.toString(res);
			 String expres = "true";
					
			
			 
			 
			 if(actres.equalsIgnoreCase(expres))
			{
				System.out.println("Test Pass : Condition Tab Options Are Displayed ");
				
				return true;
			}
			else
			{
				System.out.println("Test Fail : Condition Tab Options Are NOT Displayed ");
				
				return false;
			}
			
		}
		
		public boolean 	checkUserSelectionTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
			userSelectionTab.click();
			
			Thread.sleep(2000);
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userselectionDropdown));
			 boolean actuserselectionDropdown             = userselectionDropdown.isDisplayed();
			 boolean actcriteriaDropdown                  = criteriaDropdown.isDisplayed();
			 boolean actuserrow1                          = userrow1.isDisplayed();
			 boolean actuserrow2                          = userrow2.isDisplayed();
			  
			 boolean expuserselectionDropdown             = true;
			 boolean expcriteriaDropdown                  = true;
			 boolean expuserrow1                          = true;
			 boolean expuserrow2                          = true;
			  
			 System.out.println("***********************************************checkUserSelectionTabOptions****************");
			  
			 System.out.println("UserselectionDropdown    :"+actuserselectionDropdown  +"  Value Expected  :"+expuserselectionDropdown);
			 System.out.println("CriteriaDropdown         :"+actcriteriaDropdown       +"  Value Expected  :"+expcriteriaDropdown);
			 System.out.println("Userrow1                 :"+actuserrow1               +"  Value Expected  :"+expuserrow1);
			 System.out.println("userrow2                 :"+actuserrow2               +"  Value Expected  :"+expuserrow2);
			 
			 boolean res = actuserselectionDropdown==expuserselectionDropdown && actcriteriaDropdown==expcriteriaDropdown && 
					  actuserrow1==expuserrow1 && actuserrow2==expuserrow2;
				
			 String actres = Boolean.toString(res);
			 String expres = "true";
					
			 
			  
			 if(actres.equalsIgnoreCase(expres))
			{
				System.out.println("Test Pass : User Selection TAb Options Are Displayed");
				
				return true;
			}
			else
			{
				System.out.println("Test Fail : User Selection TAb Options Are NOT Displayed");
				
				return false;
			}
		}
		
		
		
		
		/*@FindBy(xpath="//*[@id='id_tblUserSelection_User']")
		private static WebElement userDropdown;
		*/
		
		public boolean 	checkUserDropdownOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{		
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userselectionDropdown));
			userselectionDropdown.click();
			
			String userq=userselectionDropdown.getAttribute("value");
			
			System.out.println("userq"+userq);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(criteriaDropdown));
			criteriaDropdown.click();
			
			String userc=criteriaDropdown.getText();
			
			System.out.println("userc"+userc);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
			userrow1.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userDropdown));
			userDropdown.click();
			userDropdown.sendKeys("UserALOptionsST");
			userDropdown.sendKeys(Keys.ENTER);
			
			String Strlpl= userDropdown.getText();
		
			System.out.println(Strlpl);
			 
	        String[] testString=Strlpl.split("\n");
	        
	        List<String> listg = Arrays.asList(testString);
	        
	        System.out.println("********************************************checkUserDropdownOptions*************************************");
	        
	        System.out.println("Converting to string array"+listg);
	        
	        
	        String actlist = listg.toString();
	        String explist = "[SU, UserAllOptionsST, UserRestrictionST, UserExclusionST, UserForItemRestriction, PortalUser]";
	        
	        System.out.println("The Users in User Dropdown Value Expected : " + actlist + "Value Actual : " + explist);
			
	        
	       if(actlist.equalsIgnoreCase(explist))
	       {
	    	  
	    	   return true;
	       }
	       else
	       {
	    	   
	    	   return false;
	       }
	}	
		
		public boolean 	checkAlertsTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(alertsTab));
			 alertsTab.click();
			
			 Thread.sleep(2000);
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedChkBox));
			 boolean actreceivedChkBox                   = receivedChkBox.isDisplayed();
		     boolean actapprovedChkBox                   = approvedChkBox.isDisplayed();
			 boolean actrejectedChkBox                   = rejectedChkBox.isDisplayed();
			 boolean actemailHeaderTemplateBtn           = emailHeaderTemplateBtn.isDisplayed();
			 boolean actemailTemplateBtn                 = emailTemplateBtn.isDisplayed();
			 boolean actheaderAlert                      = headerAlert.isDisplayed();
			 
			 boolean expreceivedChkBox                   = true;
			 boolean expapprovedChkBox                   = true;
			 boolean exprejectedChkBox                   = true;
			 boolean expemailHeaderTemplateBtn           = true;
			 boolean expemailTemplateBtn                 = true;
			 boolean expheaderAlert                      = true;
			 	
			 System.out.println("****************************** checkAlertsTabOptions  ********************************************");
			 
			 System.out.println("ReceivedChkBox                :"+actreceivedChkBox         +"   Value Expected : "+expreceivedChkBox);
			 System.out.println("ApprovedChkBox                :"+actapprovedChkBox         +"   Value Expected : "+expapprovedChkBox);
			 System.out.println("RejectedChkBox                :"+actrejectedChkBox         +"	 Value Expected : "+exprejectedChkBox);
			 System.out.println("EmailHeaderTemplateBtn        :"+actemailHeaderTemplateBtn +"	 Value Expected : "+expemailHeaderTemplateBtn);
			 System.out.println("EmailTemplateBtn      	       :"+actemailTemplateBtn       +"	 Value Expected : "+expemailTemplateBtn);
			 System.out.println("HeaderAlert                   :"+actheaderAlert            +"	 Value Expected : "+expheaderAlert);
			 
			 boolean res = actreceivedChkBox==expreceivedChkBox&& actapprovedChkBox==expapprovedChkBox  && actrejectedChkBox==exprejectedChkBox 
					 && actemailHeaderTemplateBtn==expemailHeaderTemplateBtn 
					  && actemailTemplateBtn==expemailTemplateBtn && actheaderAlert==expheaderAlert ;
				
			 String actres = Boolean.toString(res);
			 String expres = "true";
					
			 
			  	
			 if(actres.equalsIgnoreCase(expres))
			{
				System.out.println("Test Pass : Alerts TAb Options Are Displayed");
				
				return true;
			}
			else
			{
				System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
				
				return false;
			}
		}
		
		
		
		
		public boolean 	checkCancelButtonInDefinitionScreen() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionCancelBtn));
			definitionCancelBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pricebookDropdown));
			
			boolean actbudgetDropdown                       = pricebookDropdown.isDisplayed();
			boolean actnameTxt                              = nameTxt.isDisplayed();
			boolean actactiveChkBox                         = activeChkBox.isDisplayed();
			boolean actalwaysauthorstartsfirstlevelChkBox   = alwaysauthorizationstartsfromfirstlevelChkBox.isDisplayed();
			boolean actaddLevelBtn                          = addLevelBtn.isDisplayed();
			boolean actaddParallelBtn                       = addParallelBtn.isDisplayed();
			boolean actclearbtn               				= clearbtnInAuth.isDisplayed();
			boolean actsaveBtn  							= saveBtn.isDisplayed();
			boolean actcancelBtn 							= cancelBtnInAuth.isDisplayed();
			boolean actdeleteBtn			                = deleteBtn.isDisplayed();
			
			boolean expbudgetDropdown                       = true;
			boolean expnameTxt            					= true;
			boolean expactiveChkBox                			= true;
			boolean expalwaysauthorstartsfirstlevelChkBox   = true;
			boolean expaddLevelBtn          				= true;
			boolean expaddParallelBtn              			= true;
			boolean expclearbtn               				= true;
			boolean expsaveBtn  							= true;
			boolean expcancelBtn							= true;
			boolean expdeleteBtn							= true;
			
			System.out.println("********************************************** checkCancelButtonInDefinitionScreen ******************");
		
			System.out.println("Home Page budgetDropdown                     :"+actbudgetDropdown                      +"  Value Expected : "+expbudgetDropdown);
			System.out.println("Home Page nameTxt                            :"+actnameTxt                             +"  Value Expected : "+expnameTxt);
			System.out.println("Home Page activeChkBox                       :"+actactiveChkBox                        +"  Value Expected : "+expactiveChkBox);
			System.out.println("Home Page alwaysauthorstartsfirstlevelChkBox :"+actalwaysauthorstartsfirstlevelChkBox  +"  Value Expected : "+expalwaysauthorstartsfirstlevelChkBox);
	        System.out.println("Home Page addLevelBtn                        :"+actaddLevelBtn                         +"  Value Expected : "+expaddLevelBtn);
			System.out.println("Home Page addParallelBtn                     :"+actaddParallelBtn                      +"  Value Expected : "+expaddParallelBtn);
			System.out.println("Home Page clearbtn                           :"+actclearbtn                            +"  Value Expected : "+expclearbtn);
			System.out.println("Home Page saveBtn                            :"+actsaveBtn                             +"  Value Expected : "+expsaveBtn);
			System.out.println("Home Page cancelBtn 						 :"+actcancelBtn                           +"  Value Expected : "+expcancelBtn);
			System.out.println("Home Page deleteBtn                          :"+actdeleteBtn                           +"  Value Expected : "+expdeleteBtn);
			
			
			 boolean res =  actbudgetDropdown==expbudgetDropdown  && actnameTxt==expnameTxt &&
						actactiveChkBox==expactiveChkBox && actalwaysauthorstartsfirstlevelChkBox==expalwaysauthorstartsfirstlevelChkBox && 
						actaddLevelBtn==expaddLevelBtn  && actaddParallelBtn==expaddParallelBtn && 
					    actclearbtn==expclearbtn && actsaveBtn==expsaveBtn && actcancelBtn==expcancelBtn && actdeleteBtn==expdeleteBtn ;
				
			 String actres = Boolean.toString(res);
			 String expres = "true";
					
						  	
			if(actres.equalsIgnoreCase(expres))
				
			{
				System.out.println("Test Pass : Cancel Option Working ");
				return true;
			}
			else
			{
				System.out.println("Test Fail : Cancel Option Not Working");
				return false;
			}
		}
		
		
		
		public boolean 	checkDescriptionAsMandatory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.click();
			
			getAction().doubleClick(startPointBtn).build().perform();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
			descriptionTxt.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
			definitionOkBtn.click();
			
			System.out.println("****************************checkDescriptionAsMandatory************************************"); 
		
			
			String expMessage="Description is cannot be blank";
			
			String actMessage=checkValidationMessage(expMessage);
			
			
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Error Message is As Expected");
				
				return true;
			}
			else
			{
				System.out.println(" NO Error Message");
				
				return false;
			}
		}
		
		
		
		
		
		public boolean 	checkConditionAsMandatory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
						
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(descriptionTxt));
			descriptionTxt.click();
			
			descriptionTxt.sendKeys("BuyerPriceBook");
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
			definitionOkBtn.click();
			
			System.out.println("*****************************************************checkConditionAsMandatory************************************");
			
			String expMessage="In User Selection tab select user , User selection is mandatory";
			
			String actMessage=checkValidationMessage(expMessage);
			
			
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Error Message is As Expected");
				
				return true;
			}
			else
			{
				System.out.println(" NO Error Message");
				
				return false;
			}
		}
		
		
		
		public boolean 	checkUserSelectionIsManadatory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionNotRequiredChkBox));
			conditionNotRequiredChkBox.click();
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
			definitionOkBtn.click();
			
			System.out.println("*******************************************************checkUserSelectionIsManadatory*****************************************");
			
			String expMessage="In User Selection tab select user , User selection is mandatory";
			
			String actMessage=checkValidationMessage(expMessage);
			
			
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Error Message is As Expected");
				
				return true;
			}
			else
			{
				System.out.println(" NO Error Message");
				
				return false;
			}
		}
		
				
		public boolean 	checkOkButtonOnSelectingUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userSelectionTab));
			userSelectionTab.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userrow1));
			userrow1.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userDropdown));
			userDropdown.click();
			
			userDropdown.sendKeys("UserAllOptionsST");
			
			/*Select s=new Select(userDropdown);
			s.selectByVisibleText(excelReader.getCellData("BudgetAuthorization", 45, 6));*/
			
			Thread.sleep(5000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(definitionOkBtn));
			definitionOkBtn.click();
			
			Thread.sleep(2000);
			
			boolean Endpoint=endpoint.isDisplayed();


			String actendpoint = Boolean.toString(Endpoint);
			
			String expendpoint = "true";
			
			System.out.println("***************************************checkOkButtonOnSelectingUser*****************************");
			System.out.println("endpoint     : "+actendpoint +"  Value Expected : "+expendpoint);
			
			if(actendpoint.equalsIgnoreCase(expendpoint))
			{
				System.out.println("Test Pass : Image Displayed In Design Area");
			
				return true;
			}
			else
			{
				System.out.println("Test Fail : Image NOT Displayed In Design Area");
			
				return false;
			}
		}
		
		
		
		
		
		
		public boolean 	checkSavingBuyingPriceBookAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{		
			
			Thread.sleep(5000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
			saveBtn.click();
			
			System.out.println("**********************************checkSavingDefineBudgetAuthorization*****************************");
			
			String expMessage="Authorization Flow saved successfully.";
			
			String actMessage=checkValidationMessage(expMessage);
			
				
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Error Message is As Expected");
				
				return true;
			}
			else
			{
				System.out.println(" NO Error Message");
				
				return false;
			}
		}
		
		
		
		
		public boolean 	checkCancelButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cancelBtnInAuth));
			cancelBtnInAuth.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dashboard));
			
			boolean Dashboard=dashboard.isDisplayed();
			
			String actdashboard = Boolean.toString(Dashboard);
			
			String expdashboard = "true";	
			
			System.out.println("********************************checkCancelButton*************************");
			
			System.out.println("dashboard  :"+actdashboard +"  Value Expected  : "+expdashboard);
			
			if(actdashboard.equalsIgnoreCase(expdashboard))
				
			{
				System.out.println("Test Pass : Cancel Option Working ");
				
				return true;
			}
			else
			{
				System.out.println("Test Fail : Cancel Option Not Working");
				
				return false;
			}
		}

	
		
		public boolean 	checkDisplayingMastersNameInListOfMasters() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
			settingsmenuBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pricebookAuthorizationBtn));
			pricebookAuthorizationBtn.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pricebookDropdown));
			pricebookDropdown.click();
			pricebookDropdown.sendKeys(Keys.SPACE);
			boolean buyingPricebook=createBuyingPriceBook.isDisplayed();


			String actbuyingPricebook = Boolean.toString(buyingPricebook);
			String expbuyingPricebook = "true";
			System.out.println("***********************************************checkDisplayingMastersNameInListOfMasters*******");
			
			System.out.println("Buying Price Book       : "+actbuyingPricebook+"  Value Expected : "+expbuyingPricebook);
			
			if(actbuyingPricebook.equalsIgnoreCase(expbuyingPricebook))
			{
				System.out.println("Test Pass : Buying Price Book(1) Is Displayed");
			
				return true;
			}
			else
			{
				System.out.println("Test Fail : Buying Price Book(1)) Is NOT Displayed");
				
				return false;
			}
		}
			
		
		
		public boolean 	checkSavedNameDisplayInNameTextBox() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createBuyingPriceBook));
			createBuyingPriceBook.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
			nameTxt.click();
			nameTxt.sendKeys("Buyer");
			
			Thread.sleep(3000);
			
			nameTxt.sendKeys(Keys.TAB);
			
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(startPointBtn));
			boolean actstartPointBtn     = startPointBtn.isDisplayed();
			boolean actendpoint          = endpoint.isDisplayed();
			
			boolean expstartPointBtn     = true;
			boolean expendpoint          = true;
			
			boolean res = actstartPointBtn==expstartPointBtn && actendpoint==expendpoint;
			
			String actres = Boolean.toString(res);
			
			String expres = "true";
			
			System.out.println("*************************************checkSavedNameDisplayInNameTextBox************************************");
			
			System.out.println("startPointBtn    :"+actstartPointBtn   +"  Value Expected : "+expstartPointBtn);
			System.out.println("endpoint         :"+actendpoint        +"  Value Expected : "+expendpoint);
			
			if(actres.equalsIgnoreCase(expres))
			{
				System.out.println("Test Pass : Saved Data is Displayed");
				
				return true;
			}
			else
			{
				System.out.println("Test Fail : Saved Data is NOT Displayed");
				
				return false;
			}
			
		}
		

		@FindBy(xpath="//div[@id='divLevel1']//i[@class='icon-edit icon-font7']")
		private static WebElement Level1editBtn;
		

		public boolean 	checkEditBudgetAuthorizationSettings() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Level1editBtn));
			Level1editBtn.click();
			
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionTab));
	        boolean actconditionTab                 = conditionTab.isDisplayed();
			boolean actuserSelectionTab             = userSelectionTab.isDisplayed();
			boolean actalertsTab                    = alertsTab.isDisplayed();
			
			boolean expconditionTab                 = true;
			boolean expuserSelectionTab             = true;
			boolean expalertsTab                    = true;
			
			boolean res = actconditionTab==expconditionTab  && actuserSelectionTab==expuserSelectionTab && actalertsTab==expalertsTab;
			
			String actres = Boolean.toString(res);
			
			String expres = "true";
			
			
			
			System.out.println("********************* checkEditBudgetAuthorizationSettings ******************");
		
			System.out.println("ConditionTab             :"+actconditionTab     +"  Value Expected : "+expconditionTab);
			System.out.println("UserSelectionTab         :"+actuserSelectionTab +"  Value Expected : "+expuserSelectionTab);
			System.out.println("AlertsTab                :"+actalertsTab        +"	Value Expected : "+expalertsTab);
			
			if(actres.equalsIgnoreCase(expres))
			{
				System.out.println("Test Pass : Edit Btn Opened definition Screen");
				
				return true;
			}
			else
			{
				System.out.println("Test Fail : Edit Btn NOT Opened definition Screen");
				
				return false;
			}
			
		}
		
			
		public boolean checkConditionCheckbox() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conditionNotRequiredChkBox));
			conditionNotRequiredChkBox.click();
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conjunctionDropdown));
			conjunctionDropdown.click();
			Thread.sleep(1500);
			Select s=new Select(conjunctionDropdown);
			s.selectByValue("0");
			//conjunctionDropdown.sendKeys("where");
			conjunctionDropdown.sendKeys(Keys.TAB);
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFieldTxt));
			selectFieldTxt.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectFieldpricebookName));
			selectFieldpricebookName.click();
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectOperatorDropdown));
			selectOperatorDropdown.click();
			selectOperatorDropdown.sendKeys("Equal to");
			selectOperatorDropdown.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(compareWithDropdown));
			compareWithDropdown.click();
			compareWithDropdown.sendKeys("value");
			compareWithDropdown.sendKeys(Keys.TAB);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_valueTxt));
			enter_valueTxt.clear();
			enter_valueTxt.sendKeys("TestSmokeBuyigRates");
			enter_valueTxt.sendKeys(Keys.TAB);
			Thread.sleep(3000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(conjunctionDropdown));
			Select s1=new Select(conjunctionDropdown);
			String actconjunctionDropdown=s1.getFirstSelectedOption().getText();
			String expconjunctionDropdown="Where";
			
			
			String actselectFieldTxt=selectFieldTxt.getAttribute("value");
			String expselectFieldTxt="PriceBookName";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectOperatorDropdown));
			Select s2=new Select(selectOperatorDropdown);
			String actselectOperatorDropdown=s2.getFirstSelectedOption().getText();
			String expselectOperatorDropdown="Equal to";
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(compareWithDropdown));
			Select s3=new Select(compareWithDropdown);
			String actcompareWithDropdown=s3.getFirstSelectedOption().getText();
			String expcompareWithDropdown="value";
			
			String actvalueTxt=enter_valueTxt.getAttribute("value");
			String expvalueTxt="TestSmokeBuyigRates";
			System.out.println("************************************checkConditionCheckbox******************************************************************************");
			
			System.out.println("conjunctionDropdown     :"+actconjunctionDropdown        +" Value Expected  : "+expconjunctionDropdown); 
			System.out.println("selectFieldTxt          :"+actselectFieldTxt             +" Value Expected  : "+expselectFieldTxt);
			System.out.println("selectOperatorDropdown  :"+actselectOperatorDropdown     +"  Value Expected : "+expselectOperatorDropdown); 
			System.out.println("compareWithDropdown     :"+actcompareWithDropdown        +" Value Expected  : "+expcompareWithDropdown);
			System.out.println("valueTxt                :"+actvalueTxt                   +" Value Expected  : "+expvalueTxt);
			
			if(actconjunctionDropdown.equals(expconjunctionDropdown) && actselectFieldTxt.equalsIgnoreCase(expselectFieldTxt) && 
					actselectOperatorDropdown.equals(expselectOperatorDropdown)
					&& actcompareWithDropdown.equals(expcompareWithDropdown) && actvalueTxt.equalsIgnoreCase(expvalueTxt))
			{
				System.out.println("Test Pass : Data entered");
				
				return true;
			}
			else
			{
				System.out.println("Test Fail : Data NOT entered");
				
				return false;
			}
			
		}
		


		public boolean 	checkEditOnSelectAlertsTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			 Thread.sleep(2000);
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(alertTabInEdit));
			 alertTabInEdit.click();
			
			 Thread.sleep(2000);
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedChkBox));
			 boolean actreceivedChkBox                   = receivedChkBox.isDisplayed();
		     boolean actapprovedChkBox                   = approvedChkBox.isDisplayed();
			 boolean actrejectedChkBox                   = rejectedChkBox.isDisplayed();
			 boolean actemailHeaderTemplateBtn           = emailHeaderTemplateBtn.isDisplayed();
			 boolean actemailTemplateBtn                 = emailTemplateBtn.isDisplayed();
			 boolean actheaderAlert                      = headerAlert.isDisplayed();
			 
			 boolean expreceivedChkBox                   = true;
			 boolean expapprovedChkBox                   = true;
			 boolean exprejectedChkBox                   = true;
			 boolean expemailHeaderTemplateBtn           = true;
			 boolean expemailTemplateBtn                 = true;
			 boolean expheaderAlert                      = true;
			 	
			 System.out.println("****************************** checkEditOnSelectAlertsTabOptions  ********************************************");
			 
			 System.out.println("ReceivedChkBox                :"+actreceivedChkBox         +"   Value Expected : "+expreceivedChkBox);
			 System.out.println("ApprovedChkBox                :"+actapprovedChkBox         +"   Value Expected : "+expapprovedChkBox);
			 System.out.println("RejectedChkBox                :"+actrejectedChkBox         +"	 Value Expected : "+exprejectedChkBox);
			 System.out.println("EmailHeaderTemplateBtn        :"+actemailHeaderTemplateBtn +"	 Value Expected : "+expemailHeaderTemplateBtn);
			 System.out.println("EmailTemplateBtn      	       :"+actemailTemplateBtn       +"	 Value Expected : "+expemailTemplateBtn);
			 System.out.println("HeaderAlert                   :"+actheaderAlert            +"	 Value Expected : "+expheaderAlert);
			  	
			 
			 boolean res = actreceivedChkBox==expreceivedChkBox&& actapprovedChkBox==expapprovedChkBox  && actrejectedChkBox==exprejectedChkBox 
					 && actemailHeaderTemplateBtn==expemailHeaderTemplateBtn 
					  && actemailTemplateBtn==expemailTemplateBtn && actheaderAlert==expheaderAlert;
				
			 String actres = Boolean.toString(res);
			 
			 String expres = "true";
			 if(actres.equalsIgnoreCase(expres))
			{
				System.out.println("Test Pass : Alerts TAb Options Are Displayed");
				
				return true;
			}
			else
			{
				System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
				
				return false;
			}
		}

		public boolean checkSaveWithAllMandatoryInputs() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
		
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailHeaderTemplateBtn));
			emailHeaderTemplateBtn.click();

			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailTemplates));
			emailTemplates.sendKeys("BuyerPricebookTemplate");

			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyNameTemplateArea));
			companyNameTemplateArea.click();
			companyNameTemplateArea.sendKeys("<<Company Name>>");
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyNameTemplateArea));
			companyNameTemplateArea.click();
			companyNameTemplateArea.sendKeys("<<PriceBookName>>");
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInEmailTemplateHeader));
			saveBtnInEmailTemplateHeader.click();
			
			System.out.println("**************************************checkSaveWithAllMandatoryInputs*******************************");
			
			String expMessage="Template saved successfully";
			 
			String actMessage=checkValidationMessage(expMessage);
			
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeButtonInCreateTemplate));
			closeButtonInCreateTemplate.click();
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				System.out.println("Test Pass : Alerts TAb Options Are Displayed");
				
				return true;
			}
			else
			{
				System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
				
				return false;
			}
		}
		
		@FindBy(xpath="//td[@id='id_tblAlerts_col_1-2']")
		private static WebElement recievedEmailHeaderTemplate;
		
		@FindBy(xpath="//select[@id='id_tblAlerts_EmailHeaderTemplate']")
		private static WebElement receivedEmailHeaderTemplateInput;
		
		
		public boolean checkCreatedEmailInEmailHedaerTemplate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivedChkBox));
			receivedChkBox.click();
			
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(recievedEmailHeaderTemplate));
			recievedEmailHeaderTemplate.click();
			Thread.sleep(2000);
			
			//receivedEmailHeaderTemplateInput.click();
			
			//Thread.sleep(2000);
			
			
			Select s=new Select(receivedEmailHeaderTemplateInput);
			s.selectByVisibleText("BuyerPriceBookTemplate");
			
			receivedEmailHeaderTemplateInput.sendKeys(Keys.TAB);
			
			//receivedEmailHeaderTemplateInput.sendKeys("createEmailTemplate");
			
			Thread.sleep(2000);
			
			//receivedEmailHeaderTemplateInput.click();
			
			//Thread.sleep(2000);
			
			
			 String actreceivedEmailHeaderTemplateInput=recievedEmailHeaderTemplate.getText();
			
			
			String expreceivedEmailHeaderTemplateInput="";
			
		
			
			System.out.println("actreceivedEmailHeaderTemplateInput : "+actreceivedEmailHeaderTemplateInput);
			System.out.println("expreceivedEmailHeaderTemplateInput : "+expreceivedEmailHeaderTemplateInput);
			
			System.out.println("**************************************checkCreatedEmailInEmailHedaerTemplate*********************");
			
			System.out.println(" receivedEmailHeaderTemplateInput  :"+actreceivedEmailHeaderTemplateInput+"  Value Expected : "+expreceivedEmailHeaderTemplateInput);
			
			if(actreceivedEmailHeaderTemplateInput.equalsIgnoreCase(expreceivedEmailHeaderTemplateInput))
			{
				System.out.println("Test Pass : Alerts TAb Options Are Displayed");
				
				return true;
			}
			else
			{
				System.out.println("Test Fail : Alerts TAb Options Are NOT Displayed");
				
				return false;
			}
		}
		
		@FindBy(xpath="//span[contains(text(),'Users')]//i[@class='icon-expand icon-font8']")
		private static WebElement userExpandBtn;


		@FindBy(xpath="//span[contains(text(),'Users')]//i[@class='icon-collepse icon-font8']")
		private static WebElement userMinimizeBtn;


		@FindBy(xpath="//span[contains(text(),'Logged in Username')]")
		private static WebElement  user_LoggedInUserNameDragandDrop;

		@FindBy(xpath="//span[contains(text(),'Logged in Login Abbreviation')]")
		private static WebElement  user_LoggedInLoginAbbreviationDragandDrop;

		@FindBy(xpath="//span[contains(text(),'End User')]")
		private static WebElement  user_EndUserDragandDrop;

		@FindBy(xpath="//i[@class='icon-font6 icon-new']")
		private static WebElement  Newdropdown;

		public boolean checkEmailTemplateUserExpandInFieldsTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailTemplateBtn));
		 	 emailTemplateBtn.click();
		
		     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Newdropdown));
			
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userExpandBtn));
			 userExpandBtn.click();
			
		
			 Thread.sleep(3000);
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(user_LoggedInUserNameDragandDrop));
			 boolean actuser_LoggedInUserNameDragandDrop             = user_LoggedInUserNameDragandDrop.isDisplayed();
		     boolean actuser_LoggedInLoginAbbreviationDragandDrop    = user_LoggedInLoginAbbreviationDragandDrop.isDisplayed();
			 boolean actuser_EndUserDragandDrop                      = user_EndUserDragandDrop.isDisplayed();
			 
			 boolean expuser_LoggedInUserNameDragandDrop             = true;
			 boolean expuser_LoggedInLoginAbbreviationDragandDrop    = true;
			 boolean expuser_EndUserDragandDrop                      = true;
			 
				
			 System.out.println("****************************** checkEmailTemplateUserExpandInFieldsTabOptions  ********************************************");
			 
			 System.out.println("user_LoggedInUserNameDragandDrop          :"+actuser_LoggedInUserNameDragandDrop           +"    Value Expected : "+expuser_LoggedInUserNameDragandDrop);
			 System.out.println("user_LoggedInLoginAbbreviationDragandDrop :"+actuser_LoggedInLoginAbbreviationDragandDrop  +"    Value Expected : "+expuser_LoggedInLoginAbbreviationDragandDrop);
			 System.out.println("user_EndUserDragandDrop                   :"+actuser_EndUserDragandDrop                    +"	  Value Expected : "+expuser_EndUserDragandDrop);
			 
			 
			 boolean res = actuser_LoggedInUserNameDragandDrop==expuser_LoggedInUserNameDragandDrop
					 && actuser_LoggedInLoginAbbreviationDragandDrop==expuser_LoggedInLoginAbbreviationDragandDrop 
					 && actuser_EndUserDragandDrop==expuser_EndUserDragandDrop;
				
			 String actres = Boolean.toString(res);
			 
			 String expres = "true";
			 
			
			 
			 if(actres.equalsIgnoreCase(expres))
			{
				System.out.println("Test Pass : Fields Options Are Displayed");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userMinimizeBtn));
				userMinimizeBtn.click();
				
				return true;
			}
			else
			{
				System.out.println("Test Fail : Fields Options Are NOT Displayed");
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userMinimizeBtn));
				userMinimizeBtn.click();
				
				return false;
			}
		}

		@FindBy(xpath="//span[contains(text(),'Pricebook Fields')]//i[@class='icon-expand icon-font8']")
		private static WebElement pricebookFieldsExpdBtn;
		
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[1]/a/span")
		private static WebElement  pricebook_pricebookName;

		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[2]/a/span")
		private static WebElement  pricebook_productCode;

		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[3]/a/span")
		private static WebElement  pricebook_productName;

		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[4]/a/span")
		private static WebElement  pricebook_accountCode;

		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[5]/a/span")
		private static WebElement  pricebook_AccountNameDragandDrop;

		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[6]/a/span")
		private static WebElement  pricebook_Unit;

		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[7]/a/span")
		private static WebElement  pricebook_currency;

		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[8]/a/span")
		private static WebElement  pricebook_Tag;

		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[9]/a/span")
		private static WebElement  pricebook_StartDate;

		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[10]/a/span")
		private static WebElement  pricebook_EndDate;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[11]/a/span")
		private static WebElement  pricebook_MinQty;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[12]/a/span")
		private static WebElement  pricebook_MaxQty;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[13]/a/span")
		private static WebElement  pricebook_Rate;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[14]/a/span")
		private static WebElement  pricebook_Val1;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[15]/a/span")
		private static WebElement  pricebook_Val2;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[16]/a/span")
		private static WebElement  pricebook_Val3;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[17]/a/span")
		private static WebElement  pricebook_Val4;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[18]/a/span")
		private static WebElement  pricebook_Val5;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[19]/a/span")
		private static WebElement  pricebook_Val6;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[20]/a/span")
		private static WebElement  pricebook_Val7;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[21]/a/span")
		private static WebElement  pricebook_Val8;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[22]/a/span")
		private static WebElement  pricebook_Val9;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[23]/a/span")
		private static WebElement  pricebook_Val10;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[24]/a/span")
		private static WebElement  pricebook_Val11;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[25]/a/span")
		private static WebElement  pricebook_Val12;
		
		@FindBy(xpath="//*[@id='InvoiceDesignFields']/ul/li[2]/ul/li[26]/a/span")
		private static WebElement  pricebook_Val13;
		
		
public boolean checkFieldsTabPricebookFieldsOptions() throws InterruptedException
{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pricebookFieldsExpdBtn));
	pricebookFieldsExpdBtn.click();
	Thread.sleep(2000);
	
	boolean actpricebookName						=	pricebook_pricebookName.isDisplayed();
	boolean actproductcode							=	pricebook_productCode.isDisplayed();
	boolean actproductName							=	pricebook_productName.isDisplayed();
	boolean actaccountCode							=	pricebook_accountCode.isDisplayed();
	boolean actaccountName							=	pricebook_AccountNameDragandDrop.isDisplayed();
	boolean actUnit									=	pricebook_Unit.isDisplayed();
	boolean actCurrency								=	pricebook_currency.isDisplayed();
	boolean actTag									=	pricebook_Tag.isDisplayed();
	boolean actstartdate							=	pricebook_StartDate.isDisplayed();
	boolean actenddate								=	pricebook_EndDate.isDisplayed();
	boolean actminqty								=	pricebook_MinQty.isDisplayed();
	boolean actmaxqty								=	pricebook_MaxQty.isDisplayed();
	boolean actrate									=	pricebook_Rate.isDisplayed();
	boolean actVal1									=	pricebook_Val1.isDisplayed();
	boolean actVal2									=	pricebook_Val2.isDisplayed();
	boolean actVal3									=	pricebook_Val3.isDisplayed();
	boolean actVal4									=	pricebook_Val4.isDisplayed();
	boolean actVal5									=	pricebook_Val5.isDisplayed();
	boolean actVal6									=	pricebook_Val6.isDisplayed();
	boolean actVal7									=	pricebook_Val7.isDisplayed();
	boolean actVal8									=	pricebook_Val8.isDisplayed();
	boolean actVal9									=	pricebook_Val9.isDisplayed();
	boolean actVal10								=	pricebook_Val10.isDisplayed();
	boolean actVal11								=	pricebook_Val11.isDisplayed();
	boolean actVal12								=	pricebook_Val12.isDisplayed();
	boolean actVal13								=	pricebook_Val13.isDisplayed();
	
	
	boolean exppricebookName						=	true;
	boolean expproductcode							=	true;
	boolean expproductName							=	true;
	boolean expaccountCode							=	true;
	boolean expaccountName							=	true;
	boolean expUnit									=	true;
	boolean expCurrency								=	true;
	boolean expTag									=	true;
	boolean expstartdate							=	true;
	boolean expenddate								=	true;
	boolean expminqty								=	true;
	boolean expmaxqty								=	true;
	boolean exprate									=	true;
	boolean expVal1									=	true;
	boolean expVal2									=	true;
	boolean expVal3									=	true;
	boolean expVal4									=	true;	
	boolean expVal5									=	true;
	boolean expVal6									=	true;
	boolean expVal7									=	true;
	boolean expVal8									=	true;
	boolean expVal9									=	true;
	boolean expVal10								=	true;
	boolean expVal11								=	true;
	boolean expVal12								=	true;
	boolean expVal13								=	true;
	
	System.out.println("****************************** checkFieldsTabPricebookFieldsOptions  ********************************************");
	System.out.println("actpricebookName       :"+actpricebookName     +"  Value Expected : "+exppricebookName);
	System.out.println("actproductcode       :"+actproductcode     +"  Value Expected : "+expproductcode);
	System.out.println("actproductName       :"+actproductName     +"  Value Expected : "+expproductName);
	System.out.println("actaccountCode       :"+actaccountCode     +"  Value Expected : "+expaccountCode);
	System.out.println("actaccountName       :"+actaccountName     +"  Value Expected : "+expaccountName);
	System.out.println("actUnit       		 :"+actUnit     	   +"  Value Expected : "+expUnit);
	System.out.println("actCurrency          :"+actCurrency        +"  Value Expected : "+expCurrency);
	System.out.println("actTag       	     :"+actTag     		   +"  Value Expected : "+expTag);
	System.out.println("actstartdate         :"+actstartdate       +"  Value Expected : "+expstartdate);
	System.out.println("actenddate           :"+actenddate     	   +"  Value Expected : "+expenddate);
	System.out.println("actminqty       	 :"+actminqty     	   +"  Value Expected : "+expminqty);
	System.out.println("actmaxqty       	 :"+actmaxqty     	   +"  Value Expected : "+expmaxqty);
	System.out.println("actrate       	     :"+actrate     	   +"  Value Expected : "+exprate);
	System.out.println("actVal1       		 :"+actVal1     	   +"  Value Expected : "+expVal1);
	System.out.println("actVal2       		 :"+actVal2     	   +"  Value Expected : "+expVal2);
	System.out.println("actVal3       		 :"+actVal3     	   +"  Value Expected : "+expVal3);
	System.out.println("actVal4       		 :"+actVal4     	   +"  Value Expected : "+expVal4);
	System.out.println("actVal5       		 :"+actVal5     	   +"  Value Expected : "+expVal5);
	System.out.println("actVal6       		 :"+actVal6     	   +"  Value Expected : "+expVal6);
	System.out.println("actVal7       		 :"+actVal7     	   +"  Value Expected : "+expVal7);
	System.out.println("actVal8       		 :"+actVal8     	   +"  Value Expected : "+expVal8);
	System.out.println("actVal9       		 :"+actVal9     	   +"  Value Expected : "+expVal9);
	System.out.println("actVal10       		 :"+actVal10     	   +"  Value Expected : "+expVal10);
	System.out.println("actVal11       		 :"+actVal11    	   +"  Value Expected : "+expVal11);
	System.out.println("actVal12       		 :"+actVal12    	   +"  Value Expected : "+expVal12);
	System.out.println("actVal13       		 :"+actVal13    	   +"  Value Expected : "+expVal13);
	
		
	
	
	
	
	boolean result=actpricebookName==exppricebookName && actproductcode==expproductcode&&actproductName==expproductName
			&& actaccountCode==expaccountCode && actaccountName==expaccountName&&actUnit==expUnit && actCurrency==expCurrency
			&& actTag==expTag && actstartdate==expstartdate && actenddate==expenddate && actminqty==expminqty
			&& actmaxqty==expmaxqty && actrate==exprate && actVal1==expVal1 && actVal2==expVal2 && actVal3==expVal3
					&& actVal4==expVal4 && actVal5==expVal5 && actVal6==expVal6 && actVal7==expVal7 && actVal8==expVal8
							&& actVal9==expVal9 && actVal10==expVal10 && actVal11==expVal11 && actVal12==expVal12 && actVal13==expVal13;
String actres=Boolean.toString(result);
String expres="true";

if(actres.equalsIgnoreCase(expres))
{
	return true;
}

else
{
	return false;
}
		
		
}

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


public  PricebookAuthorizationPage(WebDriver driver) 
{
	PageFactory.initElements(driver, this);
}






}




