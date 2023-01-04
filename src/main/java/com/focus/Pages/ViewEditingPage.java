package com.focus.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class ViewEditingPage extends BaseEngine{
	
	@FindBy(xpath="//div[contains(text(),'Settings')]")
	private static WebElement  settingsmenuBtn;
	
	@FindBy(xpath="//span[contains(text(),'Configure Transactions')]")
	private static WebElement  configureTransactionBtn;
	
	@FindBy(xpath="//label[contains(text(),'Preferences')]")
	private static WebElement  preferencesBtn;
	
	@FindBy(xpath="//div[@id='docCustomization']")
	private static WebElement  documentCustomization45Btn;
	
	@FindBy(xpath="//a[@id='768']")
	private static WebElement  purchaseVoucherBtn;
	
	@FindBy(xpath="//a[@id='2008']/span")
	private static WebElement  purchaseVoucher;
	
	@FindBy(xpath="//span[@class='dropdown icon-menuicon1 icon-font6 theme_color-inverse pull-right']")
	private static WebElement  toogleExpandBtn;
	
	@FindBy(xpath="//*[@id='navHidetab4']")
	private static WebElement  viewsBtn;
	
	@FindBy(xpath="//input[@id='views_existingViews']")
	private static WebElement  ViewExistingViewTxt;

	
	@FindBy(xpath="//*[@id='views_FieldsTable']/tbody/tr/td[3]")
	private static List<WebElement>  viewsGridFiledsList;
	
	@FindBy(xpath="//*[@id='views_FieldsTable']/tbody/tr/td[1]")
	private static List<WebElement>  viewsGridFiledsEditList;
	
	
	@FindBy(xpath = "//*[@id='EditLayout_FieldsCustomization_FieldDetails_DataType']")
	private static WebElement fieldDetails_DataTypeDrpdwn;
	
	@FindBy(xpath = "//*[@id='editScreen_FieldsCustomization_DefaultValue']")
	private static WebElement fieldDetails_DefaultValueTxt;
	
	@FindBy(xpath = "//i[@class='icon-apply icon-font7']")
	private static WebElement fieldDetails_ApplyBtn;
	
	@FindBy(xpath = "//div[@id='views_tabContent']//tr[11]//td[1]//span[1]")
	private static WebElement viewGridRow11EditBtn;
	
	@FindBy(xpath="//input[@id='views_User_3']")
	private static WebElement  viewsUserAllOptionsSTChkbox;
	
	@FindBy(xpath="//span[@id='spnSaveView']")
	private static WebElement  viewSaveView;
	
	
	
	
	public boolean checkCreatingViewOptionInPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		getDriver().navigate().refresh();


		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsmenuBtn));
		settingsmenuBtn.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(configureTransactionBtn));
		configureTransactionBtn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentCustomization45Btn));

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentCustomization45Btn));
		documentCustomization45Btn.click();


		Thread.sleep(1999);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucherBtn));
		purchaseVoucherBtn.click();

		Thread.sleep(1999);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentsTab));
		documentsTab.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toogleExpandBtn));
		toogleExpandBtn.click();

		Thread.sleep(1999);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(viewsBtn));
		viewsBtn.click();

		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewExistingViewTxt));
		ViewExistingViewTxt.click();
		
		ViewExistingViewTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		
		ViewExistingViewTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		ViewExistingViewTxt.sendKeys("PurchaseView");
		Thread.sleep(2000);
		ViewExistingViewTxt.sendKeys(Keys.TAB);
		
        Thread.sleep(2000);
		
		int Count = viewsGridFiledsList.size();
		
		
		System.out.println("Count    : "+Count);
		
		ArrayList<String> actviewsGridFiledsList  = new ArrayList<String>();
		
		for (int i = 0; i < Count; i++) 
		{
			String data		  = viewsGridFiledsList.get(i).getText();

    		if(data.equalsIgnoreCase("Item"))
			
			{
    			viewsGridFiledsEditList.get(i).click();
				
				break;
			}
		}
		
	
        
        getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(viewGridRow11EditBtn));
        getAction().doubleClick(viewGridRow11EditBtn).build().perform();
        
        
		Thread.sleep(6000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fieldDetails_DataTypeDrpdwn));			
		fieldDetails_DataTypeDrpdwn.click();
		
		Select data=new Select(fieldDetails_DataTypeDrpdwn);
		data.selectByVisibleText("Read Only");
		
		String actDataType=data.getFirstSelectedOption().getText();
		String expDataType="Read Only";

		
		System.err.println("FiledCaption For date In Create View  : "+actDataType+" Value Exp : "+expDataType);
		
		Thread.sleep(2000);
       getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fieldDetails_ApplyBtn));
       fieldDetails_ApplyBtn.click();
		
       
       Thread.sleep(2000);
       
       getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(viewsUserAllOptionsSTChkbox));
       viewsUserAllOptionsSTChkbox.click();
		
       Thread.sleep(2000);
       getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(viewSaveView));
       viewSaveView.click();
       
       String expMessage= "Data saved successfully";
       
       String actMessage=checkValidationMessage(expMessage);
       
       
       getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateBtn));
	   updateBtn.click();
	
	   checkValidationMessage("data saved succesfully");
		
	   Thread.sleep(1999);
	   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
	   closeBtn.click();
       
       
       if (actMessage.equalsIgnoreCase(expMessage) && actDataType.equalsIgnoreCase(expDataType)) 
       { 
			System.out.println("Test Pass : VIew Created In Purchase Voucher");
			return true;
		  }
		  else
		  {
			System.out.println("Test Fail : VIew Created In Purchase Voucher");
			return false;
		  }
	}





public static String checkValidationMessage(String ExpMessage) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
        try
        {
                getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(errorMessage));
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


public boolean checkLogoutandLoginwithUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
{
	getDriver().navigate().refresh();
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
	userNameDisplay.click();
	
    	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
    	logoutOption.click();

    	Thread.sleep(3000);
    	
	LoginPage lp=new LoginPage(getDriver()); 
	
    String unamelt="UserAllOptionsST";
  
    String pawslt="12345";
      
    lp.enterUserName(unamelt);
    
    lp.enterPassword(pawslt);
    
    lp.clickOnSignInBtn();
    
    //checkRefershPopOnlogin();
    
    //checkPopUpWindow();
  
	Thread.sleep(6000);

	String actUserInfo=userNameDisplay.getText();
	
	System.out.println("User Info  : "+actUserInfo);
	
	System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
	companyLogo.click();
	
	String getCompanyTxt=companyName.getText();
	String getLoginCompanyName=getCompanyTxt.substring(0, 19);
	System.out.println("company name  :  "+ getLoginCompanyName);
	companyLogo.click();
	
	
	String expUserInfo           ="UserAllOptionsST";
	String expLoginCompanyName   ="Automation";
	
	boolean actDashboard = dashboard.isDisplayed();
	boolean expDashboard = true;
	
	System.out.println("**********************************************checkLogoutAndLoginWithUserAllOptions*********************************************");
	
	System.out.println("User Info               : "+actUserInfo         +" Value Expected "+expUserInfo);
	System.out.println("Login Company           : "+getLoginCompanyName +" Value Expected "+expLoginCompanyName);
	System.out.println("Dashboard is Displaying : "+actDashboard        +" Value Expected "+expDashboard );

	if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
	{
		return true;
	}
	else
	{
		return false;
	}

}


@FindBy(xpath="//input[@id='id_header_3']")
private static WebElement  MRpurchaseAccountTxt;

@FindBy(xpath="//*[@id='id_header_268435459']")
private static WebElement  departmentValuetxt;


public static boolean checkSavinfPurchaseOrderVoucherforView() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
	inventoryMenu.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(invTransactionsMenu));
	invTransactionsMenu.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchasesMenu));
	inventoryTransactionsPurchasesMenu.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesOrdersVoucher));
	purchasesOrdersVoucher.click();

	Thread.sleep(3000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
	newBtn.click();

	Thread.sleep(3000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MRpurchaseAccountTxt));
	MRpurchaseAccountTxt.click();
	MRpurchaseAccountTxt.sendKeys("STD RATE COGS ACC INV");
	Thread.sleep(3000);
	MRpurchaseAccountTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
	vendorAccountTxt.click();
	vendorAccountTxt.sendKeys("Vendor B");
	Thread.sleep(3000);
	vendorAccountTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentValuetxt));
	departmentValuetxt.click();
	departmentValuetxt.sendKeys("INDIA");
	Thread.sleep(3000);
	departmentValuetxt.sendKeys(Keys.TAB);



	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
	select1stRow_1stColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	enter_ItemTxt.click();
	enter_ItemTxt.sendKeys(Keys.SPACE);

	Thread.sleep(2000);

	int pvvGridItemListCount=pvvGridItemList.size();
	for (int i = 0; i < pvvGridItemListCount; i++) 
	{
		String Item=pvvGridItemList.get(i).getText();
		if (Item.equalsIgnoreCase("STD RATE COGS ITEM")) 
		{
			pvvGridItemList.get(i).click();
			break;
		}
	}
	enter_ItemTxt.sendKeys(Keys.TAB);	


	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_3rdColumn));
	select1stRow_3rdColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
	enter_Quantity.sendKeys("2");


	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
	select1stRow_4thColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
	enter_Rate.sendKeys("10");
	enter_Rate.sendKeys(Keys.TAB);
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
	voucherSaveBtn.click();


	
	String expMessage1 = "Voucher saved successfully";
	
	String actMessage = checkValidationMessage(expMessage1);
	String expMessage2 = ": 1";
	
	
	System.out.println("Actual Message    : "+actMessage);
	System.out.println("Expected Message  : "+expMessage1);

	if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) )

	{
		return true;
	}
	else
	{
		return false;
	}
}

@FindBy (xpath="//ul[@id='id_transaction_viewcontainer']/li[2]/a")
private static WebElement pendingPurchasesOrdersLink;


public static boolean checkConvertPurchaseOrderVouchertoPurchaseVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
	financialsTransactionMenu.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
	financialsTransactionsPurchaseMenu.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVoucher));
	purchaseVoucher.click();

	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pendingPurchasesOrdersLink));
	pendingPurchasesOrdersLink.click();

	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(grid_ChkBox1));

	int vcount = grid_VoucherNoList.size();

	for (int i = 0; i < vcount; i++) 
	{
		String VoucherNo = grid_VoucherNoList.get(i).getText();

		if (VoucherNo.equalsIgnoreCase("1")) 
		{
			if (grid_CheckBoxList.get(i).isSelected()==false) 
			{
				grid_CheckBoxList.get(i).click();
				break;
			}
		}
	}

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(convertBtn));
	convertBtn.click();

	checkValidationMessage("Screen opened");

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));

	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
	String actDocNo = documentNumberTxt.getAttribute("value");
	String expDocNo = "1";

	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
	String actVendor = vendorAccountTxt.getAttribute("value");
	String expVendor = "Vendor B";



	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
	String actDepartment = departmentTxt.getAttribute("value");
	String expDepartment = "INDIA";

	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
	String actItemEdit=enter_ItemTxt.getAttribute("disabled");
	String expItemEdit="true";
	
	String actR1Item = select1stRow_1stColumn.getText();
	String expR1Item = "STD RATE COGS ITEM";


	String actR1Units = select1stRow_2ndColumn.getText();
	String expR1Units = "Dozs";

	String actR1Quantity = select1stRow_4thColumn.getText();
	String expR1Quantity = "2.00";

	String actR1LPurchase = select1stRow_5thColumn.getText();
	String expR1LPurchase = "PurOrd:2";

	String actR1Rate = select1stRow_6thColumn.getText();
	String expR1Rate = "10.00";

	String actR1Gross = select1stRow_7thColumn.getText();
	String expR1Gross = "20.00";
	
	
	
	System.out.println("*******************************checkSavingPurchaseVoucherVATVoucher1ConvertLink**********************************");

	System.out.println("Document No     : "+actDocNo			+"  Value Expected  "+expDocNo);
	System.out.println("Vendor          : "+actVendor			+"  Value Expected  "+expVendor);
	
	System.out.println("Department      : "+actDepartment		+"  Value Expected  "+expDepartment);

	System.out.println("*******************************ROW1**********************************");
	System.out.println("Item Editing           : "+actItemEdit				+"  Value Expected  "+expItemEdit);
	System.out.println("Item            : "+actR1Item				+"  Value Expected  "+expR1Item);
	
	System.out.println("Units           : "+actR1Units				+"  Value Expected  "+expR1Units);
	System.out.println("Quantity        : "+actR1Quantity			+"  Value Expected  "+expR1Quantity);
	System.out.println("LPurchase       : "+actR1LPurchase			+"  Value Expected  "+expR1LPurchase);
	System.out.println("Rate            : "+actR1Rate				+"  Value Expected  "+expR1Rate);
	System.out.println("Gross           : "+actR1Gross				+"  Value Expected  "+expR1Gross);

	

	if(actDocNo.equalsIgnoreCase(expDocNo) && actVendor.equalsIgnoreCase(expVendor) 
			&& actDepartment.equalsIgnoreCase(expDepartment) && actItemEdit.equalsIgnoreCase(expItemEdit) 
			&& actR1Item.equalsIgnoreCase(expR1Item) 
			&& actR1Units.equalsIgnoreCase(expR1Units) && actR1Quantity.equalsIgnoreCase(expR1Quantity) && actR1LPurchase.equalsIgnoreCase(expR1LPurchase)
			&& actR1Rate.equalsIgnoreCase(expR1Rate) && actR1Gross.equalsIgnoreCase(expR1Gross))
			{
		
		return true;
	} 
	else 
	{
		
		return false;
	}
			
	
}
	
@FindBy(xpath="//*[@id='id_body_33554435']")
public static WebElement enter_Discount;

@FindBy(xpath="//*[@id='id_footer_134217749']")
public static WebElement enter_FD;


//*[@id="id_footer_134217749"]

public static boolean check2ndRowEditingofPurchaseVoucherView() throws InterruptedException, AWTException
{
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
	select1stRow_8thColumn.click();
	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
	enter_Discount.click();
	enter_Discount.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	 	Robot robot = new Robot();   
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
		
		if(enter_FD.isEnabled())
		{
			return true;
		}
		else
		{
			return false;
		}
			
}


@FindBy(xpath="//*[@id='myNavbar']/div/div[9]")
private static WebElement  SettingsBtn;


@FindBy(xpath="//*[@id='spnCreateRule']")
public static WebElement createRuleIcon;

@FindBy(xpath = "//input[@class='btn btn-link']")
private static WebElement rulesTabAddRuleBtn;

@FindBy(xpath="//input[@id='txtMasterRuleName_DocCustViewRules']")
public static WebElement ViewrulesTabRuleNameTxt;

@FindBy(xpath="//*[@class='tab-name Flabel']")
public static WebElement ViewrulesTabNameSettingBtn;

@FindBy(xpath="//*[@class='ELSE-Tab']")
public static WebElement ViewrulesTabElseTab;

@FindBy(xpath="//*[@class='IF-Tab active']")
public static WebElement ViewrulesTabIFTab;

@FindBy(xpath="//input[@id='txtField_RC_1_1_DocCustViewRules']")
public static WebElement ViewrulesTabIFSelectTabTxt;

@FindBy(xpath = "//select[@id='ddlMasterFields_RULES_DocCustViewRules']")
private static WebElement ViewrulesTabIFSelectTabDrpdwn;

@FindBy(xpath = "//select[@id='ddlExtraFields_1_1_DocCustViewRules']")
private static WebElement ViewrulesTabExtraFieldDrpdwn;

@FindBy(xpath="//select[@id='ddlOperators_RC_1_1_DocCustViewRules']")
public static WebElement ViewrulesTabOperatorsDrpdwn;

@FindBy(xpath="//select[@id='ddlCompareWith_RC_1_1_DocCustViewRules']")
public static WebElement ViewrulesTabCompareWithDrpdwn;

@FindBy(xpath="//input[@id='txtCompareType_RC_1_1_DocCustViewRules']")
public static WebElement ViewrulesTabValueTxt;

@FindBy(xpath="//select[@id='ddlConjunction_RC_1_1_DocCustViewRules']")
public static WebElement ViewrulesTabConjunctionDrpdwn;


	@FindBy(xpath = "//input[@id='optControl_RulesCondition_DocCustViewRules']	")
	private static WebElement ViewrulesTabConditionTxt;



@FindBy(xpath="//input[@id='chkCreatingGroup_Rule_DocCustViewRules']")
public static WebElement ViewrulesCreatingGroupsChkBox;

@FindBy(xpath="//input[@id='chkNewRecord_Rule_DocCustViewRules']")
public static WebElement ViewrulesNewRecordChkBox;

@FindBy(xpath="//input[@id='chkEdit_Rule_DocCustViewRules']")
public static WebElement ViewrulesEditChkBox;

@FindBy(xpath="//input[@id='chkLoad_Rule_DocCustViewRules']")
public static WebElement ViewrulesLoadChkBox;


@FindBy(xpath="//input[@id='chkOnLeave_Rule_DocCustViewRules']")
public static WebElement ViewrulesViewOnLeaveChkBox;

@FindBy(xpath="//input[@id='chkOnEnter_Rule_DocCustViewRules']")
public static WebElement ViewrulesOnEnterChkBox;

@FindBy(xpath="//input[@id='chkBeforeSave_Rule_DocCustViewRules']")
public static WebElement ViewrulesBeforeSaveChkBox;

@FindBy(xpath="//input[@id='chkBeforeDelete_Rule_DocCustViewRules']")
public static WebElement ViewrulesBeforeDeleteChkBox;

@FindBy(xpath="//input[@id='chkIsRuleActive_Rule_DocCustViewRules']")
public static WebElement ViewrulesActiveChkBox;

 

@FindBy(xpath="//input[@id='chkNoRuleCondition_DocCustViewRules']")
public static WebElement ViewrulesNoConditionChkBox;

@FindBy(xpath="(//span[@class='icon-close icon-font7'])[2]")
public static WebElement ViewrulesIFConditionCloseBtn;


@FindBy(xpath="//*[@id='Rule_IF_DocCustViewRules']/div[2]/div[1]/ul/li[2]/a/span")
public static WebElement ViewrulesTab_IFMessageTab;


@FindBy(xpath="//*[@id='Rule_IF_DocCustViewRules']/div[2]/div[1]/ul/li[1]/a")
public static WebElement ViewrulesTab_IFFormattingTab;


@FindBy(xpath="//*[@id='Rule_IF_DocCustViewRules']/div[2]/div[1]/ul/li[3]/a/span")
public static WebElement ViewrulesTab_IFAlertsTab;


@FindBy(xpath="//input[@id='txtGeneralMsg_RuleIfMsg_DocCustViewRules']")
public static WebElement  ViewrulesIFMessagesGenralMessageTxt;

	    	   
@FindBy(xpath="//*[@id='Rule_Else_DocCustViewRules']/div/div[1]/ul/li[2]/a")
public static WebElement ViewrulesTab_ElseMessageTab;


@FindBy(xpath="//*[@id='Rule_Else_DocCustViewRules']/div/div[1]/ul/li[1]/a")
public static WebElement ViewrulesTab_ElseFormattingTab;


@FindBy(xpath="//*[@id='Rule_Else_DocCustViewRules']/div/div[1]/ul/li[3]/a")
public static WebElement ViewrulesTab_ElseAlertsTab;

@FindBy(xpath="//button[@id='btnSaveViewRule']")
public static WebElement ViewrulesTab_SaveRuleBtn;


@FindBy(xpath="(//button[contains(text(),'Cancel')])[2]")
public static WebElement ViewrulesTab_CancelRuleBtn;



 @FindBy(xpath="//td[@id='tblFormating_IF_Rule_DocCustViewRules_col_1-1']")
	private static WebElement ViewrulesGrid1stRow_1stcol ;
  
 @FindBy(xpath="//td[@id='tblFormating_IF_Rule_DocCustRules_col_1-2']")
	private static WebElement ViewrulesGrid1stRow_2ndcol ;
 
 @FindBy(xpath="//td[@id='tblFormating_IF_Rule_DocCustRules_col_1-5']")
	private static WebElement ViewrulesGrid1stRow_5thcol ;
 
 @FindBy(xpath="//td[@id='tblFormating_IF_Rule_DocCustViewRules_col_2-1']")
	private static WebElement ViewrulesGrid2ndRow_1stcol ;
 
 @FindBy(xpath="//td[@id='tblFormating_IF_Rule_DocCustViewRules_col_2-4']")
	private static WebElement ViewrulesGrid2ndRow_4thcol ;
 
 @FindBy(xpath="//td[@id='tblFormating_IF_Rule_DocCustViewRules_col_2-5']")
	private static WebElement ViewrulesGrid2ndRow_5thcol ;	    
 
 @FindBy(xpath="//td[@id='tblFormating_Else_Rule_DocCustViewRules_col_1-1']")
	private static WebElement ViewrulesGridElse1stRow_1stcol ;
  
 @FindBy(xpath="//td[@id='tblFormating_Else_Rule_DocCustViewRules_col_2-1']")
	private static WebElement ViewrulesGridElse2ndRow_1stcol ;
 
 @FindBy(xpath="//td[@id='tblFormating_Else_Rule_DocCustViewRules_col_2-4']")
	private static WebElement ViewrulesGridElse2ndRow_4thcol ;
 
 @FindBy(xpath="//td[@id='tblFormating_Else_Rule_DocCustViewRules_col_2-5']")
	private static WebElement ViewrulesGridElse2ndRow_5thcol ;
 
 @FindBy(xpath="//select[@id='ddlFieldsDiv_Rule_IF_DocCustViewRules']")
	private static WebElement ViewrulesIFEnterFiled ;
  
 @FindBy(xpath="//select[@id='ddlFieldsDiv_Rule_ELSE_DocCustViewRules']")
	private static WebElement ViewrulesElseEnterFiled ;


 @FindBy(xpath="//select[@id='ddlChangeValueFormat_IF_DocCustViewRules']")
	 private static WebElement ViewrulesIFEnterChangeValueDrpdwn;
  
  @FindBy(xpath="//select[@id='ddlChangeValueFormat_ELSE_DocCustViewRules']")
	 private static WebElement ViewrulesElseEnterChangeValueDrpdwn;

  @FindBy(xpath="//input[@id='ValuesDivFormat_IF_DocCustViewRules']")
	 private static WebElement ViewrulesIFEnterValue;
  
  @FindBy(xpath = "//td[@id='tblFormating_IF_Rule_DocCustViewRules_col_1-10']")
		private static WebElement ViewrulesTabGrid1st_10thCol;
	
		@FindBy(xpath = "//input[@id='chkMandatoryFormat_IF_DocCustViewRules']")
		private static WebElement ViewrulesTabGridMandatoryChkbox;	
		
		@FindBy(xpath = "//input[@id='txtCaptionFormat_IF_DocCustViewRules']")
		private static WebElement ViewrulesTabIFGridEnterCaption;

		@FindBy(xpath = "//input[@id='txtCaptionFormat_Else_DocCustViewRules']")
		private static WebElement ViewrulesTabElseGridEnterCaption;
		
		
		@FindBy(xpath="//*[@id='ddlExtraFields_1_1_DocCustViewRules']")
		private static WebElement ViewruleConditionRow1Of2ndColbox;
		
		@FindBy(xpath="//select[@id='ddlOperators_RC_1_1_DocCustViewRules']")
		private static WebElement ViewruleConditionRow1Of3rdColbox;
		
		@FindBy(xpath="//*[@id='ddlCompareWith_RC_1_1_DocCustViewRules']")
		private static WebElement ViewruleConditionRow1Of4thColbox;
		
		@FindBy(xpath="//input[@id='txtCompareType_RC_1_1_DocCustViewRules']")
		private static WebElement ViewruleConditionRow1Of5thColbox;
		
		  @FindBy(xpath="//td[@id='tblFormating_IF_Rule_DocCustRules_col_1-2']")
		 	private static WebElement rulesGrid1stRow_2ndcol ;
		  
		  
		  @FindBy(xpath="//td[@id='tblFormating_IF_Rule_DocCustRules_col_1-4']")
		 	private static WebElement rulesGrid1stRow_4thcol ;
		  
		  @FindBy(xpath="//td[@id='tblFormating_IF_Rule_DocCustRules_col_1-5']")
		 	private static WebElement rulesGrid1stRow_5thcol ;
		     
		   
		    
		    @FindBy(xpath=" //input[@id='txtField_RC_2_1_DocCustRules']")
		 	private static WebElement  condition2ndRow_1stcol ;



public boolean checkRuleTabOptionsUnderViewsTabinSalesInvoiceVATVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
		salesInvoiceVATVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsBtn));
		SettingsBtn.click();

		Thread.sleep(2000);
	    
	    Thread.sleep(1000);
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toogleExpandBtn));
		  toogleExpandBtn.click();

		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(viewsBtn));
		  viewsBtn.click();
		  Thread.sleep(1000);
	 
	 
	 
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewExistingViewTxt));
		ViewExistingViewTxt.click();
		
		ViewExistingViewTxt.sendKeys("RuleView");
		
		ViewExistingViewTxt.sendKeys(Keys.TAB);

		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewExistingViewTxt));
		ViewExistingViewTxt.click();
		
		ViewExistingViewTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		
		ViewExistingViewTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		ViewExistingViewTxt.sendKeys("RuleView");
		Thread.sleep(2000);
		ViewExistingViewTxt.sendKeys(Keys.TAB);
		
		
		
   /* Thread.sleep(7000);
		
		int Count = viewsGridFiledsList.size();
		
		
		System.out.println("Count    : "+Count);
		
		ArrayList<String> actviewsGridFiledsList  = new ArrayList<String>();
		
		for (int i = 0; i < Count; i++) 
		{
			String data		  = viewsGridFiledsList.get(i).getText();

   		if(data.equalsIgnoreCase("DocNo"))
			
			{
   			viewsGridFiledsEditList.get(i).click();
				
				break;
			}
		}
		
	
    
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(viewGridRow1EditBtn));
    getAction().doubleClick(viewGridRow1EditBtn).build().perform();
    
    
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fieldDetails_DataTypeDrpdwn));			
		fieldDetails_DataTypeDrpdwn.click();
		
		Select data=new Select(fieldDetails_DataTypeDrpdwn);
		data.selectByVisibleText("Read Only");
		
		String actDataType=data.getFirstSelectedOption().getText();
		String expDataType="";

		
		System.err.println("FiledCaption For date In Create View  : "+actDataType);
		
   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fieldDetails_ApplyBtn));
   fieldDetails_ApplyBtn.click();
		
   
   Thread.sleep(2000);
   
   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(viewsUserAllOptionsSTChkbox));
   viewsUserAllOptionsSTChkbox.click();
   Thread.sleep(2000);
   */
   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRuleIcon));
   createRuleIcon.click();
   Thread.sleep(2000);
   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesTabAddRuleBtn));
	rulesTabAddRuleBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesTabRuleNameTxt));
	ViewrulesTabRuleNameTxt.click();
	
	Thread.sleep(2000);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesTabRuleNameTxt));

	boolean actrulesTabRuleNameTxt                           = ViewrulesTabRuleNameTxt.isDisplayed();
	boolean actrulesTabRuleNameSettingBtn                    = ViewrulesTabNameSettingBtn.isDisplayed();
	boolean actrulesTabElseTab                               = ViewrulesTabElseTab.isDisplayed(); 
	boolean actrulesTabIFSelectTabDrpdwn                     = ViewrulesTabIFSelectTabTxt.isDisplayed(); 
	boolean actrulesTabOperatorsDrpdwn                       = ViewrulesTabOperatorsDrpdwn.isDisplayed();
	boolean actrulesTabCompareWithDrpdwn                     = ViewrulesTabCompareWithDrpdwn.isDisplayed();
	boolean actrulesTabValueTxt                              = ViewrulesTabValueTxt.isDisplayed();
	boolean actrulesTabConjunctionDrpdwn                     = ViewrulesTabConjunctionDrpdwn.isDisplayed();
	boolean actrulesTabNoConditionChkbbox                    = ViewrulesNoConditionChkBox.isDisplayed();
	boolean actrulesTab_IFFormattingTab                      = ViewrulesTab_IFFormattingTab.isDisplayed();
	boolean actrulesTab_IFMessageTab                         = ViewrulesTab_IFMessageTab.isDisplayed();
	boolean actrulesTab_IFFAlertsTab                         = ViewrulesTab_IFAlertsTab.isDisplayed();
	boolean actrulesTabNewRecordChkbox                       = ViewrulesNewRecordChkBox.isDisplayed();
	boolean actrulesTabeditChkbox                            = ViewrulesEditChkBox.isDisplayed();
	boolean actrulesTabLoadChkbox                            = ViewrulesLoadChkBox.isDisplayed();
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesTabElseTab));
	ViewrulesTabElseTab.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesTab_ElseFormattingTab));
	boolean actrulesTab_ElseFormattingTab                    =ViewrulesTab_ElseFormattingTab.isDisplayed();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesTab_ElseMessageTab));
	boolean actrulesTab_ElseMessageTab                       =ViewrulesTab_ElseMessageTab.isDisplayed();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesTab_ElseAlertsTab));
	boolean actrulesTab_ElseFAlertsTab                       =ViewrulesTab_ElseAlertsTab.isDisplayed();
	boolean actrulesTab_SaveRuleBtn                          =ViewrulesTab_SaveRuleBtn.isDisplayed();
	//boolean actrulesTab_DeleteRuleBtn                        =ViewrulesTab_CancelRuleBtn.isDisplayed();
			
	boolean exprulesTabNewRecordChkbox =true;
	boolean exprulesTabeditChkbox=true;
	boolean exprulesTabLoadChkbox=true;
	boolean exprulesTabRuleNameTxt                           = true;
	boolean exprulesTabRuleNameSettingBtn                    = true;
	boolean exprulesTabElseTab                               = true; 
	boolean exprulesTabIFSelectTabDrpdwn                     = true;  
	boolean exprulesTabOperatorsDrpdwn                       = true;
	boolean exprulesTabCompareWithDrpdwn                     = true;
	boolean exprulesTabValueTxt                              = true;
	boolean exprulesTabConjunctionDrpdwn                     = true;
	boolean exprulesTabNoConditionChkbbox                    = true;
   boolean exprulesTab_IFFormattingTab                      = true;
	boolean exprulesTab_IFMessageTab                         = true;
	boolean exprulesTab_IFFAlertsTab                         = true;
	boolean exprulesTab_ElseFormattingTab                    = true;
	boolean exprulesTab_ElseMessageTab       				 = true;
	boolean exprulesTab_ElseAlertsTab						 = true;
	boolean exprulesTab_SaveRuleBtn                          = true;
	//boolean exprulesTab_DeleteRuleBtn                        = true;
	
	
   System.out.println("rulesTabRuleNameTxt Value Actual                : " + actrulesTabRuleNameTxt          +" Value Expected : " + exprulesTabRuleNameTxt);
   System.out.println("rulesTabRuleNameSetting Value Actual            : " + actrulesTabRuleNameSettingBtn   +" Value Expected : " + exprulesTabRuleNameSettingBtn);
   System.out.println("rulesTabElseTab Value Actual                    : " + actrulesTabElseTab 			  +" Value Expected : " + exprulesTabElseTab);
   System.out.println("rulesTabIFSelectTabDrpdwn Value Actual          : " + actrulesTabIFSelectTabDrpdwn    +" Value Expected : " + exprulesTabIFSelectTabDrpdwn);
   System.out.println("rulesTabOperatorsDrpdwn Value Actual            : " + actrulesTabOperatorsDrpdwn      +" Value Expected : " + exprulesTabOperatorsDrpdwn);
   System.out.println("rulesTabCompareWithDrpdwn Value Actual          : " + actrulesTabCompareWithDrpdwn    +" Value Expected : " + exprulesTabCompareWithDrpdwn);
   System.out.println("rulesTabValueTxt Value Actual                   : " + actrulesTabValueTxt             +" Value Expected : " + exprulesTabValueTxt);
   System.out.println("rulesTabConjunctionDrpdwn Value Actual          : " + actrulesTabConjunctionDrpdwn    +" Value Expected : " + exprulesTabConjunctionDrpdwn);
   System.out.println("rulesTabNoConditionChkbbox Value Actual         : " + actrulesTabNoConditionChkbbox   +" Value Expected : " + exprulesTabNoConditionChkbbox);
   System.out.println("rulesTab_IFFormattingTab Analysis Value Actual  : " + actrulesTab_IFFormattingTab     +" Value Expected : " + exprulesTab_IFFormattingTab);
   System.out.println("rulesTab_IFFormattingTab  Menu Value Actual     : " + actrulesTab_IFMessageTab        +" Value Expected : " + exprulesTab_IFMessageTab);
   System.out.println("rulesTab_IFFAlertsTab Indent Value Actual       : " + actrulesTab_IFFAlertsTab        +" Value Expected : " + exprulesTab_IFFAlertsTab);
   System.out.println("ElseFormattingTab Analysis Value Actual         : " + actrulesTab_ElseFormattingTab   +" Value Expected : " + exprulesTab_ElseFormattingTab);
   System.out.println("ElseFormattingTab  Menu Value Actual            : " + actrulesTab_ElseMessageTab      +" Value Expected : " + exprulesTab_ElseMessageTab);
   System.out.println("ElseFAlertsTab Indent Value Actual              : " + actrulesTab_ElseFAlertsTab      +" Value Expected : " + exprulesTab_ElseAlertsTab);
   System.out.println("Save Rule Value Actual                          : " + actrulesTab_SaveRuleBtn         +" Value Expected : " + exprulesTab_SaveRuleBtn);
  // System.out.println("Delete Value Actual                             : " + actrulesTab_DeleteRuleBtn       +" Value Expected : " + exprulesTab_DeleteRuleBtn);
    
   System.out.println("Record Value Actual                             : " + actrulesTabNewRecordChkbox       +" Value Expected : " + exprulesTabNewRecordChkbox );
   System.out.println("Edit Value Actual                               : " + actrulesTabeditChkbox       +" Value Expected : " + exprulesTabeditChkbox);
   System.out.println("Load Value Actual                               : " + actrulesTabLoadChkbox       +" Value Expected : " + exprulesTabLoadChkbox);
   
   boolean displayResult=actrulesTabRuleNameTxt==exprulesTabRuleNameTxt && actrulesTabRuleNameSettingBtn==exprulesTabRuleNameSettingBtn
							&& actrulesTabElseTab==exprulesTabElseTab && actrulesTabIFSelectTabDrpdwn==exprulesTabIFSelectTabDrpdwn
							&& actrulesTabOperatorsDrpdwn==exprulesTabOperatorsDrpdwn && actrulesTabCompareWithDrpdwn==exprulesTabCompareWithDrpdwn
							&& actrulesTabValueTxt==exprulesTabValueTxt && actrulesTabConjunctionDrpdwn==exprulesTabConjunctionDrpdwn
							&& actrulesTabNoConditionChkbbox==exprulesTabNoConditionChkbbox 
							 && actrulesTab_IFFormattingTab==exprulesTab_IFFormattingTab
							&& actrulesTab_IFMessageTab==exprulesTab_IFMessageTab && actrulesTab_IFFAlertsTab==exprulesTab_IFFAlertsTab
							&& actrulesTab_ElseFormattingTab==exprulesTab_ElseFormattingTab && actrulesTab_ElseMessageTab==exprulesTab_ElseMessageTab
							&& actrulesTab_ElseFAlertsTab==exprulesTab_ElseAlertsTab /*&& actrulesTab_DeleteRuleBtn==exprulesTab_DeleteRuleBtn*/ && 
							actrulesTabNewRecordChkbox==exprulesTabNewRecordChkbox && actrulesTabeditChkbox==exprulesTabeditChkbox && 
							actrulesTabLoadChkbox==exprulesTabLoadChkbox;
   
   String actDisplayResult=Boolean.toString(displayResult);
   String expDisplayResult="true";
   
  

	if(actDisplayResult.equalsIgnoreCase(expDisplayResult))
	{
   	System.out.println(" Test Pass:  Add Link is Displayed ");
   
		return true;
	}
   else
   {
   	System.out.println("Test Fail: Add Rule Link is Not Displayed ");
   	
       return false;
	}
	}

public boolean checkCreatingRulewithNoConditionunderViewsTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException

{
	
	
Thread.sleep(2000);

/* getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRuleIcon));
createRuleIcon.click();
Thread.sleep(2000);
getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesTabAddRuleBtn));
rulesTabAddRuleBtn.click();


Thread.sleep(2000);

*/
getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesTabRuleNameTxt));
ViewrulesTabRuleNameTxt.click();
ViewrulesTabRuleNameTxt.sendKeys("TrialRule");
Thread.sleep(2000);
ViewrulesTabRuleNameTxt.sendKeys(Keys.TAB);

Thread.sleep(2000);

if(ViewrulesNewRecordChkBox.isSelected()==false)
{

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesNewRecordChkBox));
ViewrulesNewRecordChkBox.click();
}
Thread.sleep(2000);
if(ViewrulesLoadChkBox.isSelected()==false)
{
getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesLoadChkBox));
ViewrulesLoadChkBox.click();
}
Thread.sleep(2000);
if(ViewrulesNoConditionChkBox.isSelected()==false)
{
getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesNoConditionChkBox));
ViewrulesNoConditionChkBox.click();
}
Thread.sleep(2000);
getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesTab_IFMessageTab));
ViewrulesTab_IFMessageTab.click();

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesIFMessagesGenralMessageTxt));
ViewrulesIFMessagesGenralMessageTxt.click();
ViewrulesIFMessagesGenralMessageTxt.clear();
ViewrulesIFMessagesGenralMessageTxt.sendKeys("TrialRuleMessage");

Thread.sleep(2000);

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesTab_SaveRuleBtn));
ViewrulesTab_SaveRuleBtn.click();
Thread.sleep(2000);

System.out.println("******************************checkSavingRuleInTrialVoucherUpdate*********************************");

String expMessage = "Rule Saved Successfully";
String actMessage = checkValidationMessage(expMessage);

boolean result=checkSavingViewAfterRuleSaved();
Thread.sleep(2000);

if (actMessage.equalsIgnoreCase(expMessage)&& result)
{
	
	return true;
}
else
{
    return false;
}
}





public boolean checkEditRuleofSavedRuleUnderViewsTab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException 
{
	Thread.sleep(2000);
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
		salesInvoiceVATVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsBtn));
		SettingsBtn.click();

		Thread.sleep(2000);
	    
	    Thread.sleep(1000);
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toogleExpandBtn));
		  toogleExpandBtn.click();

		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(viewsBtn));
		  viewsBtn.click();
		  Thread.sleep(1000);
	 
	 
	 
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewExistingViewTxt));
		ViewExistingViewTxt.click();
		
		ViewExistingViewTxt.sendKeys("RuleView");
		
		ViewExistingViewTxt.sendKeys(Keys.TAB);

		
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewExistingViewTxt));
		ViewExistingViewTxt.click();
		
		ViewExistingViewTxt.sendKeys(Keys.SHIFT,Keys.HOME);
		
		ViewExistingViewTxt.sendKeys(Keys.SPACE);
		Thread.sleep(2000);
		ViewExistingViewTxt.sendKeys("RuleView");
		Thread.sleep(2000);
		ViewExistingViewTxt.sendKeys(Keys.TAB);
		
	*/
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRuleIcon));
    createRuleIcon.click();
    Thread.sleep(1000);
    createRuleIcon.click();
    Thread.sleep(2000);
    
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesTabAddRuleBtn));
	rulesTabAddRuleBtn.click();
	
	
	Thread.sleep(2000);
    
  
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesTabRuleNameTxt));
	ViewrulesTabRuleNameTxt.click();
	ViewrulesTabRuleNameTxt.clear();
	ViewrulesTabRuleNameTxt.sendKeys("TrialRule");
	Thread.sleep(2000);
	ViewrulesTabRuleNameTxt.sendKeys(Keys.TAB);
    
	Thread.sleep(2000);
	
	if(ViewrulesNewRecordChkBox.isSelected()==false)
	{
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesNewRecordChkBox));
	ViewrulesNewRecordChkBox.click();
	}
	if(ViewrulesLoadChkBox.isSelected()==false)
	{
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesLoadChkBox));
	ViewrulesLoadChkBox.click();
	}
	/*if(ViewrulesEditChkBox.isSelected()==false)
	{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesEditChkBox));
	ViewrulesEditChkBox.click();
	}
	*/
	if(ViewrulesActiveChkBox.isSelected()==false)
	{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesActiveChkBox));
	ViewrulesActiveChkBox.click();
	}
	
	if(ViewrulesNoConditionChkBox.isSelected()==true)
	{
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesNoConditionChkBox));
	ViewrulesNoConditionChkBox.click();
	}
	Thread.sleep(2000);
	
	
	ViewrulesTabIFSelectTabTxt.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesTabIFSelectTabDrpdwn));
	Select account=new Select(ViewrulesTabIFSelectTabDrpdwn);
	account.selectByVisibleText("CustomerAC");
	ViewrulesTabIFSelectTabDrpdwn.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
					
	ViewrulesTabExtraFieldDrpdwn.click();
	
	ViewrulesTabExtraFieldDrpdwn.sendKeys(Keys.ARROW_DOWN);
	ViewrulesTabExtraFieldDrpdwn.sendKeys(Keys.TAB);

	ViewrulesTabOperatorsDrpdwn.click();
	
	ViewrulesTabOperatorsDrpdwn.sendKeys(Keys.ARROW_DOWN);
	
	ViewrulesTabOperatorsDrpdwn.sendKeys(Keys.TAB);
				
	ViewrulesTabValueTxt.click();
	
	Thread.sleep(1000);
	Select Value=new Select(ViewrulesTabCompareWithDrpdwn);
	Value.selectByValue("1");
	ViewrulesTabCompareWithDrpdwn.sendKeys(Keys.TAB);
	ViewrulesTabCompareWithDrpdwn.sendKeys(Keys.TAB);
				
	Thread.sleep(2000);
	ViewrulesTabConditionTxt.sendKeys(Keys.SPACE);
	ViewrulesTabConditionTxt.sendKeys(Keys.BACK_SPACE);
	Thread.sleep(2000);
	
	ViewrulesTabConditionTxt.sendKeys("Customer A");
				
	Thread.sleep(4000);
	
	ViewrulesTabConditionTxt.sendKeys(Keys.TAB);

	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesTab_IFFormattingTab));
	ViewrulesTab_IFFormattingTab.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesGrid1stRow_1stcol));
	ViewrulesGrid1stRow_1stcol.click();
	
	ViewrulesIFEnterFiled.sendKeys("Department");
	ViewrulesIFEnterFiled.sendKeys(Keys.TAB);
	ViewrulesIFEnterChangeValueDrpdwn.sendKeys("Value");
	ViewrulesIFEnterChangeValueDrpdwn.sendKeys(Keys.TAB);
	Thread.sleep(2000);
				
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesIFEnterValue));
	ViewrulesIFEnterValue.click();		
	ViewrulesIFEnterValue.sendKeys("India");
	Thread.sleep(1000);
	ViewrulesIFEnterValue.sendKeys(Keys.TAB);
	
	Thread.sleep(1000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesTabGrid1st_10thCol));
	ViewrulesTabGrid1st_10thCol.click();
	Thread.sleep(1000);
	
	ViewrulesTabGridMandatoryChkbox.click();
	Thread.sleep(2000);
	ViewrulesTabGridMandatoryChkbox.sendKeys(Keys.TAB);
			
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesGrid2ndRow_1stcol));
	ViewrulesGrid2ndRow_1stcol.click();
	
	ViewrulesIFEnterFiled.sendKeys("Item");
	ViewrulesIFEnterFiled.sendKeys(Keys.TAB);
	ViewrulesIFEnterChangeValueDrpdwn.sendKeys("Value");
	Thread.sleep(2000);
							
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesGrid2ndRow_5thcol));
	ViewrulesGrid2ndRow_5thcol.click();
	Thread.sleep(2000);
	
	ViewrulesTabIFGridEnterCaption.sendKeys("FCaption");
	
	ViewrulesTabIFGridEnterCaption.sendKeys(Keys.TAB);			
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesTab_IFMessageTab));
	ViewrulesTab_IFMessageTab.click();
	Thread.sleep(1000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesIFMessagesGenralMessageTxt));
	ViewrulesIFMessagesGenralMessageTxt.click();
	ViewrulesIFMessagesGenralMessageTxt.clear();
	ViewrulesIFMessagesGenralMessageTxt.sendKeys("ViewRuleActivated");
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesTabElseTab));
	ViewrulesTabElseTab.click();
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesGridElse1stRow_1stcol));
	ViewrulesGridElse1stRow_1stcol.click();
	
	ViewrulesElseEnterFiled.sendKeys("Department");
	ViewrulesElseEnterFiled.sendKeys(Keys.TAB);
	ViewrulesElseEnterChangeValueDrpdwn.sendKeys("None");
	
	ViewrulesElseEnterChangeValueDrpdwn.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesGridElse2ndRow_1stcol));
	ViewrulesGridElse2ndRow_1stcol.click();
	
	ViewrulesElseEnterFiled.sendKeys("Item");
	ViewrulesElseEnterFiled.sendKeys(Keys.TAB);
	ViewrulesElseEnterChangeValueDrpdwn.sendKeys("None");
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesGridElse2ndRow_5thcol));
	ViewrulesGridElse2ndRow_5thcol.click();
	Thread.sleep(2000);
	
	ViewrulesTabElseGridEnterCaption.sendKeys("Item");
	
	ViewrulesTabElseGridEnterCaption.sendKeys(Keys.TAB);			
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesTab_SaveRuleBtn));
	ViewrulesTab_SaveRuleBtn.click();
	
	String expMessageOnSaveRule = "Rule saved Successfully";
	String actMessageOnSaveRule=checkValidationMessage(expMessageOnSaveRule);
		
	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateBtn));
	updateBtn.click();
	
   getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
   closeBtn.click();
	
	String expMessageOnClickOnUpdate = "Data saved Successfully";
	String actMessageOnClickOnUpdate=checkValidationMessage(expMessageOnClickOnUpdate);*/
	
	
	
	
	if (actMessageOnSaveRule.equalsIgnoreCase(expMessageOnSaveRule) 
			/*&&expMessageOnClickOnUpdate.equalsIgnoreCase(expMessageOnClickOnUpdate)*/)
	{
    	System.out.println(" Test Pass:  Rule Created Successful");
    	
		return true;
	}
    else
    {
    	System.out.println("Test Fail:  Rule not Created ");
    	
        return false;
	}
	
	
	
}

@FindBy(xpath = "//div[@id='views_tabContent']//tr[2]//td[1]//span[1]")
private static WebElement viewGridRow2EditBtn;

public boolean checkSavingViewAfterRuleSaved() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException

{
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(viewGridRow2EditBtn));
     getAction().doubleClick(viewGridRow2EditBtn).build().perform();
     
     
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fieldDetails_DataTypeDrpdwn));			
		fieldDetails_DataTypeDrpdwn.click();
		
		Select data=new Select(fieldDetails_DataTypeDrpdwn);
		data.selectByVisibleText("Read Only");
		
	
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(viewsUserAllOptionsSTChkbox));
     viewsUserAllOptionsSTChkbox.click();
		
     Thread.sleep(2000);

 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(viewSaveView));
  viewSaveView.click();
  
 String expMessage = "Data saved Successfully";
String actMessage=checkValidationMessage(expMessage);
  

getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateBtn));
updateBtn.click();
Thread.sleep(2000);

String expMessageOnClickOnUpdate = "Data saved Successfully";
String actMessageOnClickOnUpdate=checkValidationMessage(expMessageOnClickOnUpdate);





if (actMessage.equalsIgnoreCase(expMessage) && actMessageOnClickOnUpdate.equalsIgnoreCase(expMessageOnClickOnUpdate) )
{
	System.out.println(" Test Pass:  View Created Successful");
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
	   closeBtn.click();
		
	
	return true;
}
else
{
	System.out.println("Test Fail:  View not Created ");
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
	   closeBtn.click();
		
	
    return false;
}

}


public boolean checkVerifyingSavedRule() throws InterruptedException
{
	getDriver().navigate().refresh();
	
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
		salesInvoiceVATVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SettingsBtn));
		SettingsBtn.click();

		Thread.sleep(2000);
	    
	    Thread.sleep(1000);
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toogleExpandBtn));
		  toogleExpandBtn.click();

		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(viewsBtn));
		  viewsBtn.click();
		  Thread.sleep(1000);
		  
		  getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewExistingViewTxt));
			ViewExistingViewTxt.click();
			ViewExistingViewTxt.sendKeys(Keys.HOME,Keys.SHIFT,Keys.END);
			ViewExistingViewTxt.sendKeys("RuleView");
			Thread.sleep(2000);
			ViewExistingViewTxt.sendKeys(Keys.TAB);
			Thread.sleep(3000);
	 
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createRuleIcon));
    createRuleIcon.click();
    Thread.sleep(2000);
    
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(rulesTabAddRuleBtn));
	rulesTabAddRuleBtn.click();
	 Thread.sleep(2000);
    
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesTabRuleNameTxt));
    ViewrulesTabRuleNameTxt.click();
	
    ViewrulesTabRuleNameTxt.clear();
	ViewrulesTabRuleNameTxt.sendKeys("TrialRule");
	Thread.sleep(1999);
	
	ViewrulesTabRuleNameTxt.sendKeys(Keys.TAB);
	
	Thread.sleep(3000);
	
	boolean RulesTabNewRecordChkbox=ViewrulesNewRecordChkBox.isSelected();
	String actRulesTabNewRecordChkbox=Boolean.toString(RulesTabNewRecordChkbox);
	String expRulesTabNewRecordChkbox="";
	
	
	boolean RulesTabEditChkbox=ViewrulesLoadChkBox.isSelected();
	String actRulesTabEditChkbox=Boolean.toString(RulesTabEditChkbox);
	String expRulesTabEditChkbox="";
	
/*	boolean RulesTabOnLeaveChkbox=ViewrulesViewOnLeaveChkBox.isSelected();
	String actRulesTabOnLeaveChkbox=Boolean.toString(RulesTabOnLeaveChkbox);
	String expRulesTabOnLeaveChkbox="";*/
	
	boolean RulesTabActiveChkbox=ViewrulesActiveChkBox.isSelected();
	String actRulesTabActiveChkbox=Boolean.toString(RulesTabActiveChkbox);
	String expRulesTabActiveChkbox="";
	
	
	ViewrulesTabIFSelectTabTxt.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesTabIFSelectTabDrpdwn));
	Select account=new Select(ViewrulesTabIFSelectTabDrpdwn);
	
	String  actrulesTabIFSelectTabDrpdwn=account.getFirstSelectedOption().getText();
	String exprulesTabIFSelectTabDrpdwn="CustomerAC";
	
	System.out.println("rulesTabIFSelectTabDrpdwn : "+actrulesTabIFSelectTabDrpdwn +" Value : "+exprulesTabIFSelectTabDrpdwn);
	
	Thread.sleep(1999);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewruleConditionRow1Of2ndColbox));
	Select con1=new Select(ViewruleConditionRow1Of2ndColbox);
	
	String  actruleConditionRow1Of2ndColbox=con1.getFirstSelectedOption().getText();
	String expruleConditionRow1Of2ndColbox="sName";
	
	System.out.println("ruleConditionRow1Of2ndColbox : "+actruleConditionRow1Of2ndColbox +" Value : "+expruleConditionRow1Of2ndColbox);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewruleConditionRow1Of3rdColbox));
	Select con2=new Select(ViewruleConditionRow1Of3rdColbox);
	
	String  actruleConditionRow1Of3rdColbox=con2.getFirstSelectedOption().getText();
	String expruleConditionRow1Of3rdColbox="Equal To";
	
	System.out.println("ruleConditionRow1Of3rdColbox : "+actruleConditionRow1Of3rdColbox +" Value : "+expruleConditionRow1Of3rdColbox);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewruleConditionRow1Of4thColbox));
	Select con3=new Select(ViewruleConditionRow1Of4thColbox);
	
	String  actruleConditionRow1Of4thColbox=con3.getFirstSelectedOption().getText();
	String expruleConditionRow1Of4thColbox="value";
	
	System.out.println("ruleConditionRow1Of4thColbox : "+actruleConditionRow1Of4thColbox +" Value : "+expruleConditionRow1Of4thColbox);
	
	Thread.sleep(1999);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewruleConditionRow1Of5thColbox));
	
	
	String  actruleConditionRow1Of5thColbox=ViewruleConditionRow1Of5thColbox.getAttribute("value");
	String expruleConditionRow1Of5thColbox="Customer A";
	
	System.out.println("ruleConditionRow1Of5thColbox : "+actruleConditionRow1Of5thColbox +" Value : "+expruleConditionRow1Of5thColbox);
	
	Thread.sleep(1999);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesTabIFTab));
	ViewrulesTabIFTab.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesGrid1stRow_1stcol));
	getAction().moveToElement(ViewrulesGrid1stRow_1stcol).build().perform();
	String actrulesGrid1stRow_1stcol=ViewrulesGrid1stRow_1stcol.getText();
	String exprulesGrid1stRow_1stcol="";
	
	System.out.println(" rulesGrid1stRow_1stcol : "+actrulesGrid1stRow_1stcol +" Value : "+exprulesGrid1stRow_1stcol);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesGrid1stRow_2ndcol));
	String actrulesGrid1stRow_2ndcol=ViewrulesGrid1stRow_2ndcol.getText();
	String exprulesGrid1stRow_2ndcol="";
	
	System.out.println(" rulesGrid1stRow_2ndcol : "+actrulesGrid1stRow_2ndcol +" Value : "+exprulesGrid1stRow_2ndcol);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesGrid1stRow_5thcol));
	String actrulesGrid1stRow_4thcol=ViewrulesGrid1stRow_5thcol.getText();
	String exprulesGrid1stRow_4thcol="";
	
	System.out.println(" rulesGrid1stRow_4thcol : "+actrulesGrid1stRow_4thcol +" Value : "+exprulesGrid1stRow_4thcol);
	
	Thread.sleep(1999);		
	getDriver().navigate().refresh();
	
	if (actRulesTabNewRecordChkbox.equalsIgnoreCase(expRulesTabNewRecordChkbox)
			&& actRulesTabEditChkbox.equalsIgnoreCase(expRulesTabEditChkbox) &&
			actRulesTabActiveChkbox.equalsIgnoreCase(expRulesTabActiveChkbox) && 
			/*actRulesTabOnLeaveChkbox.equalsIgnoreCase(expRulesTabOnLeaveChkbox)&&*/
			actrulesTabIFSelectTabDrpdwn.equalsIgnoreCase(exprulesTabIFSelectTabDrpdwn) &&
			actrulesGrid1stRow_1stcol.equalsIgnoreCase(exprulesGrid1stRow_1stcol) && 
			actrulesGrid1stRow_4thcol.equalsIgnoreCase(exprulesGrid1stRow_4thcol) && 
			
			actruleConditionRow1Of2ndColbox.equalsIgnoreCase(expruleConditionRow1Of2ndColbox) &&
			actruleConditionRow1Of3rdColbox.equalsIgnoreCase(expruleConditionRow1Of3rdColbox) &&
			actruleConditionRow1Of4thColbox.equalsIgnoreCase(expruleConditionRow1Of4thColbox) &&
			actruleConditionRow1Of5thColbox.equalsIgnoreCase(expruleConditionRow1Of5thColbox) ) 
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesTab_CancelRuleBtn));
		ViewrulesTab_CancelRuleBtn.click();
		return true;
		
	} else {
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ViewrulesTab_CancelRuleBtn));
		ViewrulesTab_CancelRuleBtn.click();

		return false;
	}
	
	
}
	
	



public static boolean checkLogoutAndLoginWithSU() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
{
	getDriver().navigate().refresh();
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameDisplay));
	userNameDisplay.click();
	Thread.sleep(2000);
	
     	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutOption));
     	logoutOption.click();

     	Thread.sleep(3000);
     	
	LoginPage lp=new LoginPage(getDriver()); 
	
    String unamelt="su";
  
    String pawslt="su";
      
    lp.enterUserName(unamelt);
    
    lp.enterPassword(pawslt);
    
    lp.clickOnSignInBtn();
    
    //checkRefershPopOnlogin();
    
    //checkPopUpWindow();
  
	Thread.sleep(6000);

	String actUserInfo=userNameDisplay.getText();
	
	System.out.println("User Info  : "+actUserInfo);
	
	System.out.println("User Info Capture Text  :  "+userNameDisplay.getText());
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
	companyLogo.click();
	
	String getCompanyTxt=companyName.getText();
	String getLoginCompanyName=getCompanyTxt.substring(0, 19);
	System.out.println("company name  :  "+ getLoginCompanyName);
	companyLogo.click();
	
	
	String expUserInfo           ="su";
	String expLoginCompanyName   ="Automation";
	
	boolean actDashboard = dashboard.isDisplayed();
	boolean expDashboard = true;
	
	System.out.println("**********************************************checkLogoutAndLoginWithSU*********************************************");
	
	System.out.println("User Info               : "+actUserInfo         +" Value Expected "+expUserInfo);
	System.out.println("Login Company           : "+getLoginCompanyName +" Value Expected "+expLoginCompanyName);
	System.out.println("Dashboard is Displaying : "+actDashboard        +" Value Expected "+expDashboard );

	if (actUserInfo.equalsIgnoreCase(expUserInfo) && getLoginCompanyName.contains(expLoginCompanyName) && actDashboard==expDashboard) 
	{
		return true;
	}
	else
	{
		return false;
	}
}
	

public boolean checkSavedViewatVoucherLevelofUserAllOptionsSTUser() throws InterruptedException
{
	
	getDriver().navigate().refresh();
	Thread.sleep(2000);
	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialTransactionSalesMenu));
		financialTransactionSalesMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATVoucher));
		salesInvoiceVATVoucher.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		Thread.sleep(2000);
		
		String actDocTxt=dateTxt.getAttribute("disabled");
		String expDocTxt="true";
		
		
		if(actDocTxt.equalsIgnoreCase(expDocTxt))
		{
			System.out.println("View Applicable");
			return true;
		}
		else
		{
			System.out.println(" No View Applicable");
			return false;
		}
		
		
	
	
}


public ViewEditingPage(WebDriver driver)
{
   	
   	PageFactory.initElements(driver, this);
   	
}


}

