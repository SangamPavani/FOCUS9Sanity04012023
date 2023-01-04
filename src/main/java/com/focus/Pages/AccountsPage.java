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

import com.focus.base.BaseEngine;

public class AccountsPage extends BaseEngine
{
	
	@FindBy (xpath="//*[@id='1']/div/span")
    public static WebElement homeMenu;
	
        //Masters Menu	
		@FindBy (xpath="//a[@id='1000']//span[contains(text(),'Masters')]")
	    public static WebElement mastersMenu;
		
		    //Accounts 
			@FindBy (xpath="//a[@id='1104']//span[contains(text(),'Account')]")
			public static WebElement accounts;
			
				//Accounts Title
				@FindBy (xpath="//span[@id='spnHeaderText']")
				public static WebElement accountsTitle;
		
				//Master Main Header Fields		
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
		
				@FindBy(xpath="//i[@class='icon-font6 icon-group']")
				public static WebElement masterGroupBtn; 
				
				
			
				
				@FindBy(xpath="//*[@id='toggle_ribbon']")
				public static WebElement masterRibbonToExpandOptions; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-delete-all']")
				public static WebElement masterDeleteAllBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-closed-account']")
				public static WebElement masterCloseAccountOrItemOrUnitsOrDepartmentOrWareHouseOrStateOrCity; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-open-close-account']")
				public static WebElement masteropenCloseAccountOrItemOrDepartmentOrWareHouseOrState; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-import']")
				public static WebElement masterAdvanceMasterImportORExportBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-info']")
				public static WebElement masterAuthorInfoBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-up-arrow']")
				public static WebElement masterMoveUpBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-down-arrow']")
				public static WebElement masterMoveDownBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-sort']")
				public static WebElement masterSortBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-mass-update']")
				public static WebElement masterMassUpdateBtn; 
		
				@FindBy(xpath="//a[@class='lSNext']")
				public static WebElement masterRibbonControlNextBtn; 
				
				@FindBy(xpath="//*[@id='btnXMLImport']")
				public static WebElement masterImportFromXmlBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-xmlexport']")
				public static WebElement masterExportFormatToXmlBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-custamize']")
				public static WebElement masterCustamizemasterBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-options']")
				public static WebElement masterCustamizeViewBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-tree']")
				public static WebElement mastercustamizeTreeBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-stock-ledger']")
				public static WebElement masterLedgerBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-financial-1']")
				public static WebElement masterManageCreditBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-department-appropriation']")
				public static WebElement masterDepartmentAppropriationBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-budget']")
				public static WebElement masterBudgetBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-backtrack']")
				public static WebElement masterBackTrackBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-transfer']")
				public static WebElement masterTranferBtn; 
		
				@FindBy(xpath="//*[@id='btnNewSets']")
				public static WebElement masterNewSetBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-modifier']")
				public static WebElement masterModifierBtn; 
		
				@FindBy(xpath="//*[@id='btnSetType']")
				public static WebElement masterSetTypeBtn; 
		
				@FindBy(xpath="//i[@class='icon-convert icon-font6']")
				public static WebElement masterUnitConversionBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-alternate-product-1']")
				public static WebElement masterAlternateItemBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-related-product']")
				public static WebElement masterRelatedItemBtn; 
		
				@FindBy(xpath="//i[@class='icon-font6 icon-stock-ledger']")
				public static WebElement masterStockLedgerBtn; 
		
				
				
				@FindBy(xpath="//tbody[@id='LandingGridBody']/tr/td[11]")
				private static List<WebElement> masterAccountsList;
	    
				//New General Elements
				//Name
				@FindBy(xpath="//input[@id='sName']")
				public static WebElement nameTxt;
				
				
				//Code
				@FindBy(xpath="//input[@id='sCode']")
				public static WebElement codeTxt;
				
			    //AccountType	
				@FindBy(xpath="//select[@id='iAccountType']")
				public static WebElement accountTypeDropdown;
				
				
				//CreditLimit
				@FindBy(xpath="//input[@id='fCreditLimit']")
				public static WebElement creditLimitTxt;

				//CreditDays
				@FindBy(xpath="//input[@id='iCreditDays']")
				public static WebElement creditdaysTxt;
				
				
				//ChequeDiscountLimit
				@FindBy(xpath="//input[@id='fChequeDiscountLimit']")
				public static WebElement chequeDiscountLimitTxt;
				
				
				//Rate Of Interest
				@FindBy(xpath="//input[@id='fRateofinterest']")
				public static WebElement rateofinterestTxt;
				
				
				//BankAccount
				@FindBy(xpath="//input[@id='iBankAc']")
				public static WebElement bankAccountTxt;
				
				@FindBy(xpath="//*[@id='iBankAc_input_image']/span")
				public static WebElement bankAccount_ExpansionBtn;
				
				@FindBy(xpath="//*[@id='iBankAc_input_settings']/span")
				public static WebElement bankAccount_SettingBtn;

	
				@FindBy(xpath="//*[@id='btnMasterSaveClick']")
				public static WebElement saveBtn;
				
				@FindBy(xpath="//i[@class='icon-font6 icon-close']")
				public static WebElement closeBtn;
	
				
				
				@FindBy(xpath="//*[@id='btnDelete']/i")
				public static WebElement deleteBtn;
				
				@FindBy(xpath="//div[@id='idGlobalError']")
				public static WebElement validationConfirmationMessage;

				//@FindBy(xpath="//div[@class='theme_color font-6']")
				@FindBy(xpath = "//*[@id='idGlobalError']/div/table/tbody/tr/td[2]/div[2]")
				public static WebElement errorMessage;
				
				@FindBy(xpath="//span[@class='icon-reject2 theme_color']")
				public static WebElement errorMessageCloseBtn;
				
				
				
				@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]")
				public static WebElement masterCloseBtn;
				
				
				@FindBy(xpath="//*[@id='LandingGridBody']/tr[1]/td[11]")
				public static WebElement accountCreation;
				
				//@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[11]")
				@FindBy(xpath="//*[@id='LandingGridBody']/tr[1]/td[11]")
				public static WebElement accountNewCreationName;
				
				@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[11]")
				public static WebElement accountNewCreationNameOfLane;               
				
				@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
				public static WebElement accountFirstCheckBoxToSelection;

				@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[5]/span[1]")
				public static WebElement accountGroupTitleDisplay;
				
				
				@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[4]/span[1]")
				public static WebElement clickOnVendorGroup;
				
				@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/input[1]")
				public static WebElement getVendorGroupName;
				
				@FindBy(xpath="//button[@class='btn-link theme_icon-color btnGenerateMasterclose closeMasterPartial clsMasterSaveClose']//i[@class='icon-font6 icon-close']")
				public static WebElement closeAccountCreationScreen;
			
				@FindBy(xpath="//input[@id='chkRetainSelection']")
				public static WebElement accountMasterRetain;
				
				@FindBy(xpath="//input[@id='liSelectAllMasters']")
				public static WebElement accountMasterSelect;
				
			//	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
				@FindBy(xpath="//table[1]/tbody[1]/tr[1]/td[8]/div[1]/label[1]/input[1]")
				public static WebElement accountFirstCheckBox;
				                
				@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/div[1]/table[1]/tbody[1]/tr[2]/td[8]/div[1]/label[1]/input[1]")
				public static WebElement accountSecondCheckBox;
				
				@FindBy(xpath="//button[@class='btn-link theme_icon-color btnGenerateMasterclose closeMasterPartial clsMasterSaveClose']")
				public static WebElement closeAccMasterCreationScreen;
				
				
				@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/button[5]/i[1]")
				public static WebElement closeMaster;
				
				
			//	@FindBy(xpath="/html[1]/body[1]/section[1]/div[2]/div[1]/section[1]/div[9]/div[1]/div[1]/div[1]/div[2]/div[1]/label[1]")
				@FindBy(xpath="//*[@id='innerDivDeleteMasterModal']/div[2]/div[1]/label")
				public static WebElement getMsgOnDelete;
				
				@FindBy(xpath="//button[@id='btnOkForDelete']")
				public static WebElement clickOnOkInDelete;
				
				@FindBy(xpath="//button[@id='btnCancelForDelete']")
				public static WebElement clickOnCancelInDelete;
				
				
				
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
		
	
	
	
	
	public static boolean checkSavingAccountINAccountMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	    homeMenu.click();
		
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	    mastersMenu.click();
	     
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
	    accounts.click();
	    	  
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsTitle));
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
	    masterNewBtn.click();
		 
		System.out.println("********************************checkSavingAccountINAccountMaster*****************************");
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		nameTxt.clear();
		nameTxt.sendKeys("Trail Account");
		nameTxt.sendKeys(Keys.TAB);
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.click();
		codeTxt.clear();
		codeTxt.sendKeys("TrailAccount");
		codeTxt.sendKeys(Keys.TAB);
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
		accountTypeDropdown.sendKeys(Keys.TAB);
		 
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		 
		String expMessage="Saved Successfully";
			
		String actMessage=checkValidationMessage(expMessage);
		 
		System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCloseBtn));
		masterCloseBtn.click();
			
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			 return true;
		}
		else
		{
			 return false;
		}
	}
	
	
	@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[8]//input")
	private static List<WebElement> masterGridBodyChkbox;

	  @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[11]")
	  private static List<WebElement> masterGridBodyName;
	
	
	
	
	public static boolean checkEditingInSavedAccountINAccountMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 System.out.println("********************************checkEditingInSavedAccountINAccountMaster********************");
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountFirstCheckBox));
			
		 int count = masterGridBodyName.size();
			
			for (int i = 0; i < count; i++) 
			{
				String data = masterGridBodyName.get(i).getText();
				
				if (data.equalsIgnoreCase("Trail Account")) 
				{
					getAction().doubleClick(masterGridBodyChkbox.get(i)).build().perform();
					break;
				}
			}
		    
		    Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		 nameTxt.click();
		 nameTxt.clear();
		 nameTxt.sendKeys("Trail Account Update");
		 nameTxt.sendKeys(Keys.TAB);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		 codeTxt.click();
		 codeTxt.clear();
		 codeTxt.sendKeys("TrailAccountUpdate");
		 codeTxt.sendKeys(Keys.TAB);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
		 accountTypeDropdown.sendKeys(Keys.TAB);
         
	     getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		 saveBtn.click();
		 Thread.sleep(2000);
		 
		 String expMessage="Updated Successfully";
			
		 String actMessage=checkValidationMessage(expMessage);
		 
		 System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 return true;
		 }
		 
		 else
		 {
			 return false;
		 }
	}
	
	
	
	
	
	
	
	public static boolean checkUpdatedAccountDisplayInAccountGridBeforeCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		String actaccountNewCreationName = null;
		int count = masterGridBodyName.size();
		
		for (int i = 0; i < count; i++) 
		{
			String data = masterGridBodyName.get(i).getText();

			if (data.equalsIgnoreCase("Trail Account Update")) 
			{
				actaccountNewCreationName = data;
				break;
			}
		}
	    
	    Thread.sleep(2000);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountNewCreationName));
		 
		 String expaccountNewCreationName  ="Trail Account Update";
		 
		 System.out.println("************************checkUpdatedAccountDisplayInAccountGridBeforeCustomization***********************");
		 
		 System.out.println("accountNewCreationName  : "+actaccountNewCreationName+" Value Expected : "+expaccountNewCreationName);
		 
		 if(actaccountNewCreationName.equalsIgnoreCase(expaccountNewCreationName))
		 { 
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	}
	
	
	
	
	
	
	
	
	
	public static boolean checkDeleteAccountInAccountMaster() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 int count = masterGridBodyName.size();
			
			for (int i = 0; i < count; i++) 
			{
				String data = masterGridBodyName.get(i).getText();
				
				if (data.equalsIgnoreCase("Trail Account Update")) 
				{
					if (masterGridBodyChkbox.get(i).isSelected()==false) 
					{
						masterGridBodyChkbox.get(i).click();
						break;
					}
				}
			}
		    
		    Thread.sleep(2000);	
		 
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDeleteBtn));
     
         masterDeleteBtn.click();
         
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getMsgOnDelete));
         System.out.println(getMsgOnDelete.getText());
         
         //Thread.sleep(2000);
         
         getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnOkInDelete));
         clickOnOkInDelete.click();
         
         String expMessage="Record Deleted Successfully.";
 		
         String actMessage=checkValidationMessage(expMessage);
         
         System.out.println("********************************checkDeleteAccountBeforeCustomization***************************");
			
		 System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
			
		 if(actMessage.equalsIgnoreCase(expMessage))
		 {
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			 closeBtn.click();
			 return true;
		 }
		 
		 else
		 {
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			 closeBtn.click();
			 return false;
		 }
	}
	
	
	
	@FindBy(xpath="//span[@id='toggle_ribbon']")
	public static WebElement toggleRibbon;

	@FindBy(xpath="//span[@id='btnAdvImportForMaster']")
	public static WebElement advanceMasterImportExportBtn;;

	@FindBy(xpath="(//*[@id='viewheading']/div/span[2])[2]")
	public static WebElement advanceMasterLabel;
					 
	@FindBy(xpath="//button[@id='btnFile']")
	public static WebElement FileUploadBtn;
		



	@FindBy(xpath="//span[@id='btnImportDataForAdvanceMasterPopUp']")
	public static WebElement advMasterImportDataBtn;;


	@FindBy(xpath="//*[@id='LandingGridBody']/tr/td[11]")
	private static List<WebElement> accNameList;

	
	public String actAccList=null;
	public String expAccList=null;
	
		
	public boolean checkAccountsListBeforeImportingDataFromExcel() throws InterruptedException
	{
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		   	homeMenu.click();
		   	
		   	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		   	mastersMenu.click();
		   	
		   	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
			     
		   	accounts.click();
			   
		   	Thread.sleep(2000);
		   	
		
		 
		 int accCount = accNameList.size();
		

		 ArrayList<String> acclist = new ArrayList<String>();

		 		for (int i = 0; i < accCount; i++)
		 		{
		 			 String data = accNameList.get(i).getText();
		 			 Thread.sleep(1500);
		 			acclist.add(data);
		 			
		 		}
		 		
		 		 actAccList=acclist.toString();
		 		 expAccList="[Pricebook Vendor Account Two, Pricebook Vendor Account One, Pricebook Account One, Pricebook Account Two, Pricebook Group Two, Pricebook Group One, Round off Exchange gain / loss, ASSETS, EXPENSES, CONTROL ACCOUNTS, REVENUE, EQUITIES, LIABILITIES, COGS POSTING ACC, BR COGS ACC INV, FIFO COGS ACC INV, WA COGS ACC INV, STD RATE COGS ACC INV, SR COGS POSTING ACC, SHORTAGE COGS POSTING ACC, EXCESS COGS POSTING ACC, VAT OUTPUT, VAT ADVANCE SALE, VAT ADVANCE PURCHASE, PURCHASE VARIANCE, VAT INPUT]";
		 		
		 		System.out.println("Actual Accounts List:  "+actAccList);
		 		System.out.println("Expected Accounts List:  "+expAccList);
		 		
		 		if(actAccList.equalsIgnoreCase(expAccList))
		 		{
		 			return true;
		 		}
		 		else
		 		{
		 			return false;
		 		}
		 		
	}

	public boolean checkAdvanceMasterImportExportAccount() throws InterruptedException
	{
		Thread.sleep(2000);
		
	   	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleRibbon));
	   	toggleRibbon.click();
	   	Thread.sleep(2000);
	   	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(advanceMasterImportExportBtn));
	   	advanceMasterImportExportBtn.click();
	   	
	   	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(advanceMasterLabel));
	    System.out.println("Advance Master import/Export Label  "+advanceMasterLabel.getText());
	      	
	  	if(advanceMasterLabel.getText().equalsIgnoreCase("Advance Master Import/Export----> Account"))
		{	
			return true;
		}	 
		else
		{
			return false;
		}
	   	
	   	
	}
	public boolean checkImportDatainAdvanceMasterImportExportAccount() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(advMasterImportDataBtn));
		 advMasterImportDataBtn.click();
		 Thread.sleep(2000);
		 String expMessage="Please load excel sheet";
		String actMessage=checkValidationMessage(expMessage);
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FileUploadBtn));
		FileUploadBtn.click();
		Thread.sleep(2000);
		
		 Runtime.getRuntime().exec(getBaseDir()+"\\autoIt\\scripts\\AccountImportFromExcel.exe");
		 Thread.sleep(5000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(advMasterImportDataBtn));
		 advMasterImportDataBtn.click();
		 Thread.sleep(4000);
		 
		 String expMessage1="112 Records Imported Successfully";
		 String actMessage1=checkValidationMessage(expMessage);
		 
		 if(actMessage.equalsIgnoreCase(expMessage) && actMessage1.equalsIgnoreCase(expMessage1))
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
		
		}

	@FindBy(xpath="//*[@id='LandingGridBody']/tr[28]/td")
	public static List<WebElement> accounts28thRowList;

	public boolean checkAccountsListAfterImportingDataFromExcel() throws InterruptedException
	{
		Thread.sleep(2000);
		 	 
		/* int accCount = accNameList.size();
			int count=accounts28thRowList.size();

		 ArrayList<String> acclist = new ArrayList<String>();

		 		for (int i = 0; i < accCount; i++)
		 		{
		 			 String data = accNameList.get(i).getText();
		 			 Thread.sleep(1000);
		 			 if(data.equals("AccountImport"))
		 			 {
		 				 System.out.println("Data Imported");
		 				for (int j = 0; j < count; j++)
				 		{
				 			 String data1 = accounts28thRowList.get(j).getText();
				 			acclist.add(data1);
				 			 
		 			 }
		 				break;
		 			 }
		 			//acclist.add(data);
		 			
		 		}*/
		
		
		 int accCount = accNameList.size();
			

		 ArrayList<String> acclist = new ArrayList<String>();

	 		for (int i = 0; i < accCount; i++)
	 		{
	 			 String data = accNameList.get(i).getText();
	 			acclist.add(data);
	 			
	 		}
		 		
		 		 actAccList=acclist.toString();
		 		 expAccList="[Pricebook Vendor Account Two, Pricebook Vendor Account One, Pricebook Account One, Pricebook Account Two, Pricebook Group Two, Pricebook Group One, Round off Exchange gain / loss, SALES, ASSETS, EXPENSES, CONTROL ACCOUNTS, REVENUE, EQUITIES, LIABILITIES, COGS POSTING ACC, BR COGS ACC INV, FIFO COGS ACC INV, WA COGS ACC INV, STD RATE COGS ACC INV, SR COGS POSTING ACC, SHORTAGE COGS POSTING ACC, EXCESS COGS POSTING ACC, VAT OUTPUT, VAT ADVANCE SALE, VAT ADVANCE PURCHASE, PURCHASE VARIANCE, VAT INPUT, AccountImport, GroupAccountImport]";
		 		
		 		System.out.println("Actual Accounts List:  "+actAccList);
		 		System.out.println("Expected Accounts List:  "+expAccList);
		 		
		 		if(actAccList.equalsIgnoreCase(expAccList))
		 		{
		 			return true;
		 		}
		 		else
		 		{
		 			return false;
		 		}
		 		
		 		
		 		
		 		
	}
public boolean checkImportedAccountDelete() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	 int count = masterGridBodyName.size();
		
		for (int i = 0; i < count; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			
			if (data.equalsIgnoreCase("AccountImport") ) 
			{
				if (masterGridBodyChkbox.get(i).isSelected()==false) 
				{
					masterGridBodyChkbox.get(i).click();
					break;
				}
			}
		}
		
		
		
		 int count1 = masterGridBodyName.size();
			
			for (int i = 0; i < count1; i++) 
			{
				String data = masterGridBodyName.get(i).getText();
				
				if (data.equalsIgnoreCase("GroupAccountImport")) 
				{
					if (masterGridBodyChkbox.get(i).isSelected()==false) 
					{
						masterGridBodyChkbox.get(i).click();
						break;
					}
				}
			}
		
		
		
	    
	    Thread.sleep(2000);	
	 
  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDeleteBtn));

  masterDeleteBtn.click();
  
  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getMsgOnDelete));
  System.out.println(getMsgOnDelete.getText());
  
  //Thread.sleep(2000);
  
  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnOkInDelete));
  clickOnOkInDelete.click();
  
  String expMessage="Record Deleted Successfully.";
	
  String actMessage=checkValidationMessage(expMessage);
  
  System.out.println("********************************checkDeleteAccountBeforeCustomization***************************");
		
	 System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
		
	 if(actMessage.equalsIgnoreCase(expMessage))
	 {
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		 closeBtn.click();
		 return true;
	 }
	 
	 else
	 {
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		 closeBtn.click();
		 return false;
	 }
}

////////////////////////////

@FindBy(xpath="//*[@id='lblnchecked']/input")

public static List<WebElement> accChkBoxList;


public boolean checkOpenGroupAccountMaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
    homeMenu.click();
	
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
    mastersMenu.click();
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
    accounts.click();
    	  
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountsTitle));
    
  
	 
	System.out.println("********************************checkOpeningGroupAccountINAccountMaster*****************************");
	 
	int accNameListCount = accNameList.size();
	ArrayList<String>accNameListArray = new ArrayList<String>();
	for(int i=0;i<accNameListCount;i++)
	{
		String data = accNameList.get(i).getText();
		Thread.sleep(2000);
		if(data.equals("ASSETS"))
		{
			Thread.sleep(2000);
			getAction().doubleClick(accChkBoxList.get(i)).build().perform();
			Thread.sleep(2000);
			break;
		}
	}
	
	int accNameListCount1 = accNameList.size();

	for(int i=0;i<accNameListCount1;i++)
	{
		String data = accNameList.get(i).getText();
		accNameListArray.add(data);
		
	}
	

	
	String actRow1List = accNameListArray.toString();
	String expRow1List = "[Fixed Assets, Current Assets]";
	
	
	System.out.println(actRow1List);
	System.out.println(expRow1List);	
	
	
	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCloseBtn));
	masterCloseBtn.click();*/
		
	if(actRow1List.equalsIgnoreCase(expRow1List))
	{
		 return true;
	}
	else
	{
		 return false;
	}

	
	
	
}
	
	

@FindBy(xpath="//*[@id='cmbUserTypeMaster']")
public static WebElement comboSearchBox;

@FindBy(xpath="//*[@id='ol_treeNavigation']")
public static WebElement navigationAcc;;



public boolean checkSearchinganAccountUnderSubGroup() throws InterruptedException
{
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(comboSearchBox));
	comboSearchBox.click();
	comboSearchBox.clear();
	comboSearchBox.sendKeys("Vehicles");
	Thread.sleep(2000);
	comboSearchBox.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(navigationAcc));
	System.out.println(navigationAcc.getText());
	
	
	int accNameListCount = accNameList.size();
	boolean data=false ;
	for(int i=0;i<accNameListCount;i++)
	{
		 data = accChkBoxList.get(i).isSelected();
		 
		if(data==true)
		{
			
			break;
					
		}
	}
	
	if(data==true)
	{
		return true;
	}
		else
		{
			return false;
		}
	}
	
	
	/////////////////////Adding Groups and subgroups//////////////////////////

public boolean checkSavingAccountGroupinAccountMaster() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
{
	getDriver().navigate().refresh();
	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
    homeMenu.click();
	
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
    mastersMenu.click();
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
    accounts.click();
    	  
   /* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountList));
     accountList.click();*/
    Thread.sleep(2000);
    
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));
    masterAddGroupBtn.click();
    Thread.sleep(1000);
	 
	System.out.println("********************************checkSavingAccountGroupAccountMaster*****************************");
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
	nameTxt.click();
	nameTxt.clear();
	nameTxt.sendKeys("Group Account");
	nameTxt.sendKeys(Keys.TAB);
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
	codeTxt.click();
	codeTxt.clear();
	codeTxt.sendKeys("GroupAccount");
	codeTxt.sendKeys(Keys.TAB);
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
	accountTypeDropdown.sendKeys(Keys.TAB);
	 
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	saveBtn.click();
	 
	String expMessage="Saved Successfully";
		
	String actMessage=checkValidationMessage(expMessage);
	 
	System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCloseBtn));
	masterCloseBtn.click();
		
	if(actMessage.equalsIgnoreCase(expMessage))
	{
		 return true;
	}
	else
	{
		 return false;
	}

}


@FindBy(xpath="//*[@id='0']/a")
public static WebElement accountList;
	
	

@FindBy(xpath="(//*[@id='0']/li)[1]/a[1]")
public static WebElement accountGrp;




@FindBy(xpath="//*[@id='ol_treeNavigation']/li[2]/span")
public static WebElement GroupAccountLabel;

public static boolean checkSavingAccountSubGroupinAccountMaster() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
{
	int accNameListCount = accNameList.size();

	for(int i=0;i<accNameListCount;i++)
	{
		String data = accNameList.get(i).getText();
		Thread.sleep(2000);
		if(data.equals("Group Account"))
		{
			Thread.sleep(2000);
			getAction().doubleClick(accChkBoxList.get(i)).build().perform();
			Thread.sleep(2000);
			break;
		}
	}
	
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterAddGroupBtn));
	    masterAddGroupBtn.click();
		 
		System.out.println("********************************checkSavingAccountSubGroupAccountMaster*****************************");
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		nameTxt.clear();
		nameTxt.sendKeys("SubGroup1 Account");
		nameTxt.sendKeys(Keys.TAB);
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.click();
		codeTxt.clear();
		codeTxt.sendKeys("SubGroup1Account");
		codeTxt.sendKeys(Keys.TAB);
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
		accountTypeDropdown.sendKeys(Keys.TAB);
		 
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		Thread.sleep(3000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		nameTxt.clear();
		nameTxt.sendKeys("SubGroup2 Account");
		nameTxt.sendKeys(Keys.TAB);
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.click();
		codeTxt.clear();
		codeTxt.sendKeys("SubGroup2Account");
		codeTxt.sendKeys(Keys.TAB);
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
		accountTypeDropdown.sendKeys(Keys.TAB);
		 
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		 
		String expMessage="Saved Successfully";
			
		String actMessage=checkValidationMessage(expMessage);
		 
		System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCloseBtn));
		masterCloseBtn.click();
			
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			 return true;
		}
		else
		{
			 return false;
		}

}

public boolean checkCreatedGroupDisplayedonLeftPanel()
{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountGrp));
	
	boolean s=accountGrp.isDisplayed();
	if(s)
	{
	return true;
	}
	else
	{
		return false;
	}
}
	

public boolean checkSavingAccountsinSubGroupsinAccountMaster() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
{
		
	int accNameListCount = accNameList.size();

	for(int i=0;i<accNameListCount;i++)
	{
		String data = accNameList.get(i).getText();
		Thread.sleep(2000);
		if(data.equals("SubGroup1 Account"))
		{
			Thread.sleep(2000);
			getAction().doubleClick(accChkBoxList.get(i)).build().perform();
			Thread.sleep(2000);
			break;
		}
	}
	
	    
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
	    masterNewBtn.click();
		 
		System.out.println("********************************checkSavingAccountSubGroupAccountMaster*****************************");
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		nameTxt.clear();
		nameTxt.sendKeys("Account1");
		nameTxt.sendKeys(Keys.TAB);
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.click();
		codeTxt.clear();
		codeTxt.sendKeys("Account1");
		codeTxt.sendKeys(Keys.TAB);
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
		accountTypeDropdown.sendKeys(Keys.TAB);
		 
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCloseBtn));
		masterCloseBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(GroupAccountLabel));
		GroupAccountLabel.click();
		Thread.sleep(2000);
		
		int accNameListCount1 = accNameList.size();

		for(int i=0;i<accNameListCount1;i++)
		{
			String data = accNameList.get(i).getText();
			Thread.sleep(2000);
			if(data.equals("SubGroup2 Account"))
			{
				Thread.sleep(2000);
				getAction().doubleClick(accChkBoxList.get(i)).build().perform();
				Thread.sleep(2000);
				break;
			}
		}
		
		    
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterNewBtn));
		    masterNewBtn.click();
			 
		
	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(nameTxt));
		nameTxt.click();
		nameTxt.clear();
		nameTxt.sendKeys("Account2");
		nameTxt.sendKeys(Keys.TAB);
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(codeTxt));
		codeTxt.click();
		codeTxt.clear();
		codeTxt.sendKeys("Account2");
		codeTxt.sendKeys(Keys.TAB);
		 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountTypeDropdown));
		accountTypeDropdown.sendKeys(Keys.TAB);
		 
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
		saveBtn.click();
		
		 
		String expMessage="Saved Successfully";
			
		String actMessage=checkValidationMessage(expMessage);
		 
		System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
		
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterCloseBtn));
		masterCloseBtn.click();
			
		if(actMessage.equalsIgnoreCase(expMessage))
		{
			 return true;
		}
		else
		{
			 return false;
		}
}


public static boolean checkAccountsSavedinGroupsandSubGroupsinAccountMaster() throws InterruptedException
{
	getDriver().navigate().refresh();
	Thread.sleep(2000);
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	   	homeMenu.click();
	   	
	   	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	   	mastersMenu.click();
	   	
	   	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
		     
	   	accounts.click();
		   
	   	Thread.sleep(2000);
	   	
	
	   	int accCount = accNameList.size();
	
	   	ArrayList<String> acclist = new ArrayList<String>();

	 		for (int i = 0; i < accCount; i++)
	 		{
	 			 String data = accNameList.get(i).getText();
	 			acclist.add(data);
	 			
	 		}
	 		
	 		String actAccList=acclist.toString();
	 		String  expAccList="[Group Account, Pricebook Vendor Account Two, Pricebook Vendor Account One, Pricebook Account One, Pricebook Account Two, Pricebook Group Two, Pricebook Group One, Round off Exchange gain / loss, ASSETS, EXPENSES, CONTROL ACCOUNTS, REVENUE, EQUITIES, LIABILITIES, COGS POSTING ACC, BR COGS ACC INV, FIFO COGS ACC INV, WA COGS ACC INV, STD RATE COGS ACC INV, SR COGS POSTING ACC, SHORTAGE COGS POSTING ACC, EXCESS COGS POSTING ACC, VAT OUTPUT, VAT ADVANCE SALE, VAT ADVANCE PURCHASE, PURCHASE VARIANCE, VAT INPUT]";
	 		

	 		int accNameListCount = accNameList.size();

	 		for(int i=0;i<accNameListCount;i++)
	 		{
	 			String data = accNameList.get(i).getText();
	 			Thread.sleep(2000);
	 			if(data.equals("Group Account"))
	 			{
	 				Thread.sleep(2000);
	 				getAction().doubleClick(accChkBoxList.get(i)).build().perform();
	 				Thread.sleep(2000);
	 				break;
	 			}
	 		}
	 		
	 		
	 		int accCount1= accNameList.size();
	 		ArrayList<String> acclist1 = new ArrayList<String>();

	 		for (int i = 0; i < accCount1; i++)
	 		{
	 			 String data = accNameList.get(i).getText();
	 			 acclist1.add(data);
	 		}
	 		 		
	 	String actGrpAccList=acclist1.toString();
	 	String  expGrpAccList="[SubGroup2 Account, SubGroup1 Account]";
	 		 		
	 	
	 	int accNameListCount1 = accNameList.size();
 		for(int i=0;i<accNameListCount1;i++)
 		{
	 		String data = accNameList.get(i).getText();
	 		Thread.sleep(2000);
	 		if(data.equals("SubGroup1 Account"))
	 		{
	 			Thread.sleep(2000);
	 			getAction().doubleClick(accChkBoxList.get(i)).build().perform();
	 			Thread.sleep(2000);
	 			break;
	 		}
	 	}
	 
 		
 		int accCount2= accNameList.size();
	 	 ArrayList<String> acclist2 = new ArrayList<String>();
 		for (int i = 0; i < accCount2; i++)
 		{
	 		 String data = accNameList.get(i).getText();
	 	   	acclist2.add(data);
	 	}
	 
 		String actSubGrpAccList=acclist2.toString();
	 	String  expSubGrpAccList="[Account1]";
	 		 		 		
	 
	 	
	 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(GroupAccountLabel));
		GroupAccountLabel.click();
		Thread.sleep(2000);
	 	
	 	int accNameListCount3 = accNameList.size();
 		for(int i=0;i<accNameListCount3;i++)
 		{
	 		String data = accNameList.get(i).getText();
	 		Thread.sleep(2000);
	 		if(data.equals("SubGroup2 Account"))
	 		{
	 			Thread.sleep(2000);
	 			getAction().doubleClick(accChkBoxList.get(i)).build().perform();
	 			Thread.sleep(2000);
	 			break;
	 		}
	 	}
	 
 		
 		int accCount3= accNameList.size();
	 	 ArrayList<String> acclist3 = new ArrayList<String>();
 		for (int i = 0; i < accCount3; i++)
 		{
	 		 String data = accNameList.get(i).getText();
	 	   	acclist3.add(data);
	 	}
	 
 		String actSubGrpAcc2List=acclist3.toString();
	 	String  expSubGrpAcc2List="[Account2]";
	 		 		 		
	 	System.out.println("********************************checkSavingGroupsandSubGroupAccountMaster*****************************");
	 	
	 	
	 	System.out.println("Actual Accounts List:  "+actAccList);
 		System.out.println("Expected Accounts List:  "+expAccList);
	 	
 		System.out.println("Actual Sub Group Accounts List:  "+actGrpAccList);
	 	System.out.println("Expected Sub Group Accounts List:  "+expGrpAccList);
	 	
		System.out.println("Actual  Accounts in Sub Group1 List:  "+actSubGrpAccList);
	 	System.out.println("Expected Accounts in Sub Group1 List:  "+expSubGrpAccList);
	 	
	 	System.out.println("Actual  Accounts in Sub Group2 List:  "+actSubGrpAcc2List);
	 	System.out.println("Expected Accounts in Sub Group2 List:  "+expSubGrpAcc2List);
	 	
	 	
	 	if(actAccList.equalsIgnoreCase(expAccList) && actGrpAccList.equalsIgnoreCase(expGrpAccList)
	 			&& actSubGrpAccList.equalsIgnoreCase(expSubGrpAccList) && actSubGrpAcc2List.equalsIgnoreCase(expSubGrpAcc2List))
	 	{

	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
	 		closeBtn.click();
	 		return true;
	 	}
	 	else
	 	{
	 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
	 		closeBtn.click();
	 		return false;
	 	}
	 	
}


public boolean checkDeleteGroupAccountinAccountMaster() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
    homeMenu.click();
	
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
    mastersMenu.click();
     
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accounts));
    accounts.click();
    	  
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(accountList));
     accountList.click();
    Thread.sleep(2000);
	

	 int count1 = masterGridBodyName.size();
		
		for (int i = 0; i < count1; i++) 
		{
			String data = masterGridBodyName.get(i).getText();
			
			if (data.equalsIgnoreCase("Group Account")) 
			{
				if (masterGridBodyChkbox.get(i).isSelected()==false) 
				{
					masterGridBodyChkbox.get(i).click();
					break;
				}
			}
		}

   Thread.sleep(2000);	

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterDeleteBtn));

masterDeleteBtn.click();

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getMsgOnDelete));
System.out.println(getMsgOnDelete.getText());

//Thread.sleep(2000);

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(clickOnOkInDelete));
clickOnOkInDelete.click();

String expMessage="Record Deleted Successfully.";

String actMessage=checkValidationMessage(expMessage);

System.out.println("********************************checkDeleteAccountBeforeCustomization***************************");
	
System.out.println("Message     : "+actMessage+" Value Expected : "+expMessage);
	
if(actMessage.equalsIgnoreCase(expMessage))
{
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
	 closeBtn.click();
	 return true;
}

else
{
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
	 closeBtn.click();
	 return false;
}
	
	
}

	
	public AccountsPage(WebDriver driver)
    {
		PageFactory.initElements(driver, this);
    }
	
	

}
