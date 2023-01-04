package com.focus.Pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;

public class AttributePage extends BaseEngine
{
	//private static final List<WebElement> masterGridBodyNameforElectronics = null;
	//SettingsMenu
	@FindBy(xpath="//*[@id='16']/div/span")
	public static WebElement settings;
//config transactions
	@FindBy(xpath="//*[@id='17']/span")
	public static WebElement configTrans;
	
//config transactions preferences
	@FindBy(xpath="//*[@id='preferenceUL']/li[6]/a")
	public static WebElement configTransPreferencesMaster;

	//Label of Masters tab
	@FindBy(xpath="//*[@id='ScreenTitle']")
	public static WebElement LblMaster;

	@FindBy(xpath="//*[@id='ProductAttributesValues']")
	public static WebElement attributes;

	@FindBy(xpath="//*[@id='grdProductAttributesValues_body']/tr[1]/td[3]")
	public static WebElement attribute0;
	
	@FindBy(xpath="//*[@id='txtProductName']")
	public static WebElement attributeAfterclick;
	
	@FindBy(xpath="//*[@id='grdProductAttributesValues_body']/tr[2]/td[3]")
	public static WebElement attribute1;

	//update 
	@FindBy(xpath="//*[@id='updateButton']/i")
	public static WebElement updtBtn;
	
	//close
	@FindBy(xpath="//*[@id='configTransMenu']/ul/li[2]/span[2]/i")
	public static WebElement closeBtn;
	
	@FindBy(xpath="//*[@id='dashName']")
	public static WebElement dashboard;
	
	
	//Home Menu
	@FindBy (xpath="//*[@id='1']/div/span")
    public static WebElement homeMenu;
	
        //Masters Menu	
		@FindBy (xpath="//a[@id='1000']//span[contains(text(),'Masters')]")
	    public static WebElement mastersMenu;
		
		//Items Menu
		@FindBy(xpath="//*[@id='221']")
	public static WebElement itemMenu;
		
		@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[3]/ul/li[3]/ul/li[1]")
		public static WebElement item;
	
		
		
		@FindBy(xpath="//*[@id='spnHeaderText']")
		public static WebElement LblItem;
		
		@FindBy(xpath="//*[@id='btnNew']/i")
		public static WebElement newBtn;
		
		@FindBy(xpath="//*[@id='divBtnGroup9']/div/a")
		public static WebElement attribute0Tab;
		
		@FindBy(xpath="//*[@id='divBtnGroup10']/div/a")
		public static WebElement attribute1Tab;
		
		
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
	

	public boolean checkLoginTOBRS() throws InterruptedException
	{

		 getDriver().navigate().refresh();
		 Thread.sleep(1999);
		 
		 getDriver().navigate().refresh();
		 Thread.sleep(1999);

		LoginPage lp=new LoginPage(getDriver()); 

		String unamelt="su";
				      
		String pawslt="su";
				      
		lp.enterUserName(unamelt);

		Thread.sleep(2000);
				
		lp.enterPassword(pawslt);

		String compname="BRS";

		 Select oSelect = new Select(companyDropDownList);
		 
		 List <WebElement> elementCount = oSelect.getOptions();

		 int cqSize = elementCount.size();
		 
		 System.out.println("CompanyDropdownList Count :"+cqSize);

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
			
	        Thread.sleep(2000);
			
			lp.clickOnSignInBtn();
				
			//checkRefershPopOnlogin();
			        
		//checkPopUpWindow();

		//Thread.sleep(2000);
				           	
		String userInfo=userNameDisplay.getText();
				    	
		System.out.println("User Info : "+userInfo);
				    	
		System.out.println("User Info Capture Text :"+userNameDisplay.getText());
				    	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
				    	
		companyLogo.click();
				    	
		if(userInfo.equalsIgnoreCase("SU"))
		{

			System.out.println("Test Pass :Logined to BRS Company");
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :Logined to BRS Company");
				return false;

			}
		
	}
	
	
	

	public boolean checkConfigureTransactionMastersUnderSettings() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settings));
		settings.click();

		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(configTrans));
	
		configTrans.click();

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(configTransPreferencesMaster));
		getAction().moveToElement(configTransPreferencesMaster).build().perform();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(configTransPreferencesMaster));
		configTransPreferencesMaster.click();
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(LblMaster));
		
		String actLabelMaster=LblMaster.getText();
		String expLabelMaster="Masters";
		
		System.out.println("Label: "+actLabelMaster+" Value Expected "+expLabelMaster);

		if (actLabelMaster.equalsIgnoreCase(expLabelMaster)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}

	
	
	
	public boolean checkItemAttributeValuesinMastersUnderSettingsConfigureTransactions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(attributes));
		Select select=new Select(attributes);
		select.selectByVisibleText("2");
		
	//Entering first attribute

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(attribute0));
		
		attribute0.click();
		//attribute0.clear();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(attributeAfterclick));
		attributeAfterclick.clear();
		attributeAfterclick.sendKeys("Att1");
		
		//Entering second attribute 
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(attribute1));
		attribute1.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(attributeAfterclick));
		attributeAfterclick.clear();
		attributeAfterclick.sendKeys("Att2");
		
		Thread.sleep(2000);
		
		//clicking update button
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updtBtn));
		updtBtn.click();
		
		getWaitForAlert();
		
		System.out.println("Alert message "+ getDriver().switchTo().alert().getText());
		
		String actAlert=getAlert().getText();
		String expAlrert="Do you want to save the changes?";
		
		getAlert().accept();

		String expMessage = "Data saved Successfully";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		}
		else 
		{
			return false;
		}
		
	}
		public boolean checkCloseOptionInMastersScreenUnderSettingsMenu() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			
			//clicking on close
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
			closeBtn.click();
			
			Thread.sleep(1000);
			
			String expMessage="Graph with Active and setAsDefault";
			String actMessage=dashboard.getText();
			
			if(actMessage.equalsIgnoreCase(expMessage))
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		
		@FindBy(xpath="//*[@id='lastTab']/div/div/a/span")
		public static WebElement itemLasttab;
	

	public boolean CheckAttributesTabinItemMenu() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMenu));
		itemMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(item));
		item.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(LblItem));
		/*String actMessage=LblItem.getText();
		String expMessage="Item";
		if(actMessage.equalsIgnoreCase(expMessage))
			return true;
		else
			return false;
		*/
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemLasttab));
		itemLasttab.click();
		Thread.sleep(1000);
		
		String actAttribute0=attribute0Tab.getText();
		String expAttribute0="Attribute-0";
		
		System.err.println("Attribute-0 Tab : "+actAttribute0+"  Value Expected  "+expAttribute0);
		
		Thread.sleep(1000);
		
		
		
		String actAttribute1=attribute1Tab.getText();
		String expAttribute1="Attribute-1";
		
		System.err.println("Attribute-1 Tab : "+actAttribute1+"  Value Expected  "+expAttribute1);
		
		if(actAttribute0.equalsIgnoreCase(expAttribute0)&&actAttribute1.equalsIgnoreCase(expAttribute1) ){
			return true;
		}
		else
			return false;
	}
	

//clicking on item menu	
	@FindBy(xpath="//*[@id='sName']")
	public static WebElement itemName;
	
	@FindBy(xpath="//*[@id='sCode']")
	public static WebElement itemCode;
	
	//units tab
	@FindBy(xpath="//*[@id='divBtnGroup1']/div/a")
	public static WebElement unitsTab;
	
	@FindBy(xpath="//*[@id='iDefaultBaseUnit']")
	public static WebElement baseUnit;
	
	@FindBy(xpath="//*[@id='iDefaultSalesUnit']")
	public static WebElement salesUnit;
	
	@FindBy(xpath="//*[@id='iDefaultPurchaseUnit']")
	public static WebElement purchaseUnit;
	
	@FindBy(xpath="//*[@id='chkProductAttribute0']")
	public static WebElement checkBox0;
	
	
	@FindBy(xpath="//*[@id='txtProdAttributeName0']")
	public static WebElement Valueattribute1;
	
	
	@FindBy(xpath="//*[@id='txtProdAttributeCode0']")
	public static WebElement Codeattribute1;
	
	//*[@id="txtProdAttributeName1"]
	
	@FindBy(xpath="//*[@id='txtProdAttributeName1']")
	public static WebElement Valueattribute2;
		
	@FindBy(xpath="//*[@id='txtProdAttributeCode1']")
	public static WebElement Codeattribute2;

	
	@FindBy(xpath="//*[@id='txtProdAttributeName3']")
	public static WebElement Valueattribute3;
	
	@FindBy(xpath="//*[@id='txtProdAttributeCode3']")
	public static WebElement Codeattribute3;
	
	
	@FindBy(xpath="//*[@id='txtProdAttributeName4']")
	public static WebElement Valueattribute4;
	
	@FindBy(xpath="//*[@id='txtProdAttributeCode4']")
	public static WebElement Codeattribute4;
	
	@FindBy(xpath="//*[@id='btnMasterSaveClick']/i")
	public static WebElement saveBtn;
	
	@FindBy(xpath="//*[@id='divBtnGroup9']/div/a")
	public static WebElement valid;
	
	@FindBy(xpath="//*[@id='GenerateNewMasterModel']/div/div[1]/div[2]/div/ul/li[2]/button[5]/i")
	public static WebElement closeBtnforAttributes;
	
	public boolean checkItemsAdddinginAttribute0Tab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMenu));
		itemMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(item));
		item.click();
		
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();
		
		itemName.click();
		itemName.clear();
		itemName.sendKeys("Fruits1");
		itemName.sendKeys(Keys.TAB);
		
		itemCode.click();
		itemCode.clear();
		itemCode.sendKeys("Fruits1");
		itemCode.sendKeys(Keys.TAB);
		
		//units addding
		unitsTab.click();
		
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseUnit));
		baseUnit.click();
		baseUnit.clear();
		baseUnit.sendKeys("Dozs");
		Thread.sleep(1000);
		baseUnit.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesUnit));
		salesUnit.click();
		salesUnit.clear();
		salesUnit.sendKeys("Pcs");
		Thread.sleep(1000);
		salesUnit.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseUnit));
		purchaseUnit.click();
		purchaseUnit.clear();
		purchaseUnit.sendKeys("Dozs");
		Thread.sleep(1000);
		purchaseUnit.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemLasttab));
		itemLasttab.click();
		Thread.sleep(1000);
		
		attribute0Tab.click();
		Thread.sleep(1000);
		checkBox0.click();
		Thread.sleep(1000);
		
		//System.err.println("Attribute name" +attribute0Tab.getText());
		
		Valueattribute1.sendKeys("Apple");
		Valueattribute1.sendKeys(Keys.TAB);
		Codeattribute1.sendKeys("A");
		Codeattribute1.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		Valueattribute2.sendKeys("Banana");
		Valueattribute2.sendKeys(Keys.TAB);
		Codeattribute2.sendKeys("B");
		Codeattribute2.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		Valueattribute3.sendKeys("Orange");
		Valueattribute3.sendKeys(Keys.TAB);
		Codeattribute3.sendKeys("O");
		Codeattribute3.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		Valueattribute4.sendKeys("Grapes");
		Valueattribute4.sendKeys(Keys.TAB);
		Codeattribute4.sendKeys("G");
		Codeattribute4.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		saveBtn.click();
		closeBtnforAttributes.click();
		Thread.sleep(1000);
		itemCloseBtn.click();
		Thread.sleep(1000);
		String expMessage = "Saved Successfully";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	
	}
	
	
	@FindBy(xpath="//*[@id='chkProductAttribute1']")
	public static WebElement checkBox1;
	
	//*[@id="txtProdAttributeName0"]
	@FindBy(xpath="(//tbody[@id='tblProductAttributesBody'])[2]/tr[1]/td[4]/input")
	public static WebElement ValueforAttribute1;
	@FindBy(xpath="(//tbody[@id='tblProductAttributesBody'])[2]/tr[1]/td[5]/input")
	public static WebElement CodeforAttribute1;
	
	
	@FindBy(xpath="(//tbody[@id='tblProductAttributesBody'])[2]/tr[2]/td[4]/input")
	public static WebElement ValueforAttribute2;
	@FindBy(xpath="(//tbody[@id='tblProductAttributesBody'])[2]/tr[2]/td[5]/input")
	public static WebElement CodeforAttribute2;
	
	@FindBy(xpath="(//tbody[@id='tblProductAttributesBody'])[2]/tr[3]/td[4]/input")
	public static WebElement ValueforAttribute3;
	@FindBy(xpath="(//tbody[@id='tblProductAttributesBody'])[2]/tr[3]/td[5]/input")
	public static WebElement CodeforAttribute3;
	
	@FindBy(xpath="(//tbody[@id='tblProductAttributesBody'])[2]/tr[4]/td[4]/input")
	public static WebElement ValueforAttribute4;
	@FindBy(xpath="(//tbody[@id='tblProductAttributesBody'])[2]/tr[4]/td[5]/input")
	public static WebElement CodeforAttribute4;
	
	@FindBy(xpath="//*[@id='btnClose']/i")
	public static WebElement itemCloseBtn;
	
public boolean checkItemsAdddinginAttribute1Tab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	homeMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	mastersMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMenu));
	itemMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(item));
	item.click();
	
	Thread.sleep(1000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
	newBtn.click();
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemName));
		itemName.click();
		itemName.clear();
		itemName.sendKeys("Electronics1");
		itemName.sendKeys(Keys.TAB);
		
		itemCode.click();
		itemCode.clear();
		itemCode.sendKeys("Electronics1");
		itemCode.sendKeys(Keys.TAB);
		
		//units addding
		unitsTab.click();
		
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(baseUnit));
		baseUnit.click();
		baseUnit.clear();
		baseUnit.sendKeys("Dozs");
		Thread.sleep(1000);
		baseUnit.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesUnit));
		salesUnit.click();
		salesUnit.clear();
		salesUnit.sendKeys("Pcs");
		Thread.sleep(1000);
		salesUnit.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseUnit));
		purchaseUnit.click();
		purchaseUnit.clear();
		purchaseUnit.sendKeys("Dozs");
		Thread.sleep(1000);
		purchaseUnit.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemLasttab));
		itemLasttab.click();
		Thread.sleep(1000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(attribute1Tab));
		attribute1Tab.click();
		Thread.sleep(1000);
		checkBox1.click();
		Thread.sleep(1000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ValueforAttribute1));
		ValueforAttribute1.sendKeys("Computers");
		ValueforAttribute1.sendKeys(Keys.TAB);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CodeforAttribute1));
		CodeforAttribute1.sendKeys("C");
		CodeforAttribute1.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(ValueforAttribute2));
		ValueforAttribute2.sendKeys("Laptops");
		ValueforAttribute2.sendKeys(Keys.TAB);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(CodeforAttribute2));
		CodeforAttribute2.sendKeys("L");
		CodeforAttribute2.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		ValueforAttribute3.sendKeys("Mobiles");
		ValueforAttribute3.sendKeys(Keys.TAB);
		CodeforAttribute3.sendKeys("M");
		CodeforAttribute3.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		ValueforAttribute4.sendKeys("Television");
		ValueforAttribute4.sendKeys(Keys.TAB);
		Codeattribute4.sendKeys("T");
		CodeforAttribute4.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		saveBtn.click();
		Thread.sleep(1000);
		closeBtnforAttributes.click();
		Thread.sleep(1000);
		itemCloseBtn.click();
		Thread.sleep(1000);

		String expMessage = "Saved Successfully";
		String actMessage = checkValidationMessage(expMessage);
		
		if (actMessage.equalsIgnoreCase(expMessage)) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
}


//opening PurchaseVocher VAT
@FindBy(xpath="//*[@id='60']/div")
public static WebElement financeMenu;

@FindBy(xpath="//*[@id='61']")
public static WebElement transactionsMenu;

@FindBy(xpath="//*[@id='2007']/span")
public static WebElement purchasesMenu;

@FindBy(xpath="//*[@id='2057']/span")
public static WebElement purchaseVocherVAT;

@FindBy(xpath="//*[@id='id_transaction_homescreen_new']/div[1]/span")
public static WebElement purchaseVochernewBtn;

@FindBy(xpath="//*[@id='id_header_1']")
public static WebElement documentNumberTxt;

@FindBy(xpath="//*[@id='id_header_2']")
public static WebElement dateTxt;

@FindBy(xpath="//*[@id='id_header_4']")
public static WebElement vendorAcct;

@FindBy(xpath="//*[@id='id_header_6']")
public static WebElement dueDate;


@FindBy(xpath="//*[@id='id_header_10']")
public static WebElement vocherHeaderCurrency;

@FindBy(xpath="//*[@id='id_header_268435459']")
public static WebElement departmentTxt;

@FindBy(xpath="//*[@id='id_header_268435470']")
public static WebElement placeOfsupply;

@FindBy(xpath="//*[@id='id_header_268435471']")
public static WebElement jurisdictionTxt;

@FindBy(xpath="//*[@id='id_header_67108938']")
public static WebElement narration;

@FindBy(xpath="//*[@id='id_header_67108972']")
public static WebElement permitNo;

@FindBy(xpath="//*[@id='id_header_67109036']")
public static WebElement billNum;

@FindBy(xpath="//*[@id='id_body_536870916']")
public static WebElement warehouseTxt;

@FindBy(xpath="//*[@id='id_body_16777323']")
public static WebElement taxCode;

@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[5]")
public static WebElement purchaseAccount;

@FindBy(xpath="//*[@id='id_body_13']")
public static WebElement batchTxt;

@FindBy(xpath="//*[@id='id_transaction_entry_detail_table_body']/tr[1]/td[19]")
public static WebElement RMATxt;

@FindBy(xpath="//*[@id='id_transactionentry_save']/div[1]/span")
public static WebElement voucherSaveBtn;

@FindBy(xpath="//*[@id='txtNewReference']")
public static WebElement newBillReferenceTxt;

@FindBy(xpath="//*[@id='btnPick']")
public static WebElement pickBtn;

@FindBy(xpath="//*[@id='btnOk']")
public static WebElement okBtn;


public boolean checkPurchaseVocherVATtoAddAttributeItemFruitsasItem() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financeMenu));
	financeMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionsMenu));
	transactionsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesMenu));
	purchasesMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVocherVAT));
	purchaseVocherVAT.click();
	
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVochernewBtn));
	purchaseVochernewBtn.click();
	
	
	checkValidationMessage("Screen opened");
	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
	documentNumberTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
	dateTxt.sendKeys(Keys.TAB);
	
	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAcct));
	vendorAcct.sendKeys("Vendor A");
	vendorAcct.sendKeys(Keys.TAB);
	vendorAcct.sendKeys(Keys.TAB);
*/
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
	vendorAccountTxt.click();

	vendorAccountTxt.sendKeys(Keys.SPACE);	

	ArrayList<String>  actVendorAccountList= new ArrayList<String>(); 

	int vendorcount=vendorAccountListCount.size();

	System.err.println(vendorcount);

	for(int i=0 ; i < vendorcount ;i++)
	{
		String data=vendorAccountListCount.get(i).getText();

		if (data.equalsIgnoreCase("Vendor B")) 
		{
			vendorAccountListCount.get(i).click();
			break;
		}
	}

	vendorAccountTxt.sendKeys(Keys.TAB);

	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dueDate));
	dueDate.sendKeys(Keys.TAB);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
	voucherHeaderCurrency.sendKeys("INR");
	voucherHeaderCurrency.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
	departmentTxt.sendKeys("INDIA");
	departmentTxt.sendKeys(Keys.TAB);
	*/
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderDueDate));
	voucherHeaderDueDate.click();
	voucherHeaderDueDate.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
	voucherHeaderCurrency.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
	voucherHeaderCurrency.sendKeys(Keys.SPACE);

	int currencycount=currencyListCount.size();

	System.err.println(currencycount);

	for(int i=0 ; i < currencycount ;i++)
	{
		String data=currencyListCount.get(i).getText();

		if (data.equalsIgnoreCase("INR")) 
		{
			currencyListCount.get(i).click();
			break;
		}
	}

	voucherHeaderCurrency.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
	departmentTxt.click();
	departmentTxt.sendKeys(Keys.SPACE);	

	ArrayList<String> actDepartmentList= new ArrayList<String>(); 

	int departmentCount=departmentListCount.size();

	System.err.println(departmentCount);

	for(int i=0 ; i < departmentCount ;i++)
	{
		String data=departmentListCount.get(i).getText();

		if (data.equalsIgnoreCase("INDIA")) 
		{
			departmentListCount.get(i).click();
			break;
		}
	}

	departmentTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(placeOfsupply));
	placeOfsupply.sendKeys("Abu Dhabi");
	placeOfsupply.sendKeys(Keys.TAB);
	Thread.sleep(1000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
	jurisdictionTxt.click();
	jurisdictionTxt.sendKeys("DUBAI");
	Thread.sleep(2000);
	jurisdictionTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
	select1stRow_1stColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
	enter_WarehouseTxt.click();

	enter_WarehouseTxt.sendKeys(Keys.SPACE);

	int warehousecount=warehouseBodyComboList.size();

	for(int i=0 ; i < warehousecount ;i++)
	{
		String data=warehouseBodyComboList.get(i).getText();

		if (data.equalsIgnoreCase("HYDERABAD")) 
		{
			warehouseBodyComboList.get(i).click();
			break;
		}
	}

	enter_WarehouseTxt.sendKeys(Keys.TAB);
	
	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	enter_ItemTxt.click();
	enter_ItemTxt.sendKeys(Keys.SPACE);*/
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	enter_ItemTxt.click();
	enter_ItemTxt.sendKeys("Fruits");
	enter_ItemTxt.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	int size=pvvGridItemList.size();
	System.err.println("Items under Fruits Item are:  "+size);
	int pvvGridItemListCount=pvvGridItemList.size();
	for (int i = 0; i < pvvGridItemListCount; i++) 
	{
		String Item=pvvGridItemList.get(i).getText();
		
	/*	if(Item.contains("Fruits")){
			
			System.err.println(Item);	
			
		}*/
		if (Item.equalsIgnoreCase("Fruits-Orange")) 
		{
			pvvGridItemList.get(i).click();
			break;
		}
	}
	enter_ItemTxt.sendKeys(Keys.TAB);	
	//*[@id="id_transactionentry_save"]/div[1]/span
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(taxCode));
	taxCode.sendKeys(Keys.TAB);
	
	Thread.sleep(1000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
	select1stRow_4thColumn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PurchaseAccountTxt));
	enter_PurchaseAccountTxt.sendKeys("Purchase");
	enter_PurchaseAccountTxt.sendKeys(Keys.TAB);

	Thread.sleep(1000);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_9thColumn));
	select1stRow_9thColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
	enter_Quantity.click();
	enter_Quantity.clear();
	enter_Quantity.sendKeys("2");
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
	select1stRow_11thColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
	enter_Rate.click();
	enter_Rate.clear();
	enter_Rate.sendKeys("10");
	enter_Rate.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
	enter_Gross.click();
	enter_Gross.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
	select1stRow_14thColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvVat));
	enter_PvVat.click();

	enter_PvVat.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvTaxable));
	enter_PvTaxable.click();
	enter_PvTaxable.sendKeys(Keys.TAB);
	
	
	//entering second item	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
	select2ndRow_1stColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
	enter_WarehouseTxt.click();
	enter_WarehouseTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
	enter_WarehouseTxt.sendKeys(Keys.SPACE);

	int warehousecount1=warehouseBodyComboList.size();

	for(int i=0 ; i < warehousecount1 ;i++)
	{
		String data=warehouseBodyComboList.get(i).getText();

		if (data.equalsIgnoreCase("HYDERABAD")) 
		{
			warehouseBodyComboList.get(i).click();
			break;
		}
	}

	enter_WarehouseTxt.sendKeys(Keys.TAB);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_2ndColumn));
	select2ndRow_2ndColumn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	enter_ItemTxt.click();
	enter_ItemTxt.sendKeys(Keys.SPACE);
	int pvvGridItemListCount1=pvvGridItemList.size();
	for (int i = 0; i < pvvGridItemListCount1; i++) 
	{
		String Item=pvvGridItemList.get(i).getText();
		if (Item.equalsIgnoreCase("Fruits-Banana")) 
		{
			pvvGridItemList.get(i).click();
			break;
		}
	}
	enter_ItemTxt.sendKeys(Keys.TAB);	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(taxCode));
	taxCode.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_4thColumn));
	select2ndRow_4thColumn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PurchaseAccountTxt));
	enter_PurchaseAccountTxt.sendKeys("Purchase");
	enter_PurchaseAccountTxt.sendKeys(Keys.TAB);

	Thread.sleep(1000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_9thColumn));
	select2ndRow_9thColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
	enter_Quantity.click();
	enter_Quantity.clear();
	enter_Quantity.sendKeys("2");
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_11thColumn));
	select2ndRow_11thColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
	enter_Rate.click();
	enter_Rate.clear();
	enter_Rate.sendKeys("10");
	enter_Rate.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
	enter_Gross.click();
	enter_Gross.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_14thColumn));
	select2ndRow_14thColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvVat));
	enter_PvVat.click();

	enter_PvVat.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvTaxable));
	enter_PvTaxable.click();
	enter_PvTaxable.sendKeys(Keys.TAB);
	
	Thread.sleep(3000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
	voucherSaveBtn.click();
	
	Thread.sleep(1000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBillReferenceTxt));
	
	newBillReferenceTxt.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
	pickBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtn));

	okBtn.click();
	
	Thread.sleep(3000);
	
	String expMessage="Voucher saved successfully(00:096) : 6";
	String actMessage=checkValidationMessage(expMessage);
	if(actMessage.equalsIgnoreCase(expMessage)){
		return true;
	}
	else
		return false;
}
	


public boolean checkPurchaseVocherVATtoAddAttributeItemElectronicsasItem() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financeMenu));
	financeMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionsMenu));
	transactionsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesMenu));
	purchasesMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVocherVAT));
	purchaseVocherVAT.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVochernewBtn));
	purchaseVochernewBtn.click();
	
	checkValidationMessage("Screen opened(00:710)");

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
	documentNumberTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
	dateTxt.sendKeys(Keys.TAB);
	
	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAcct));
	vendorAcct.sendKeys("Vendor A");
	vendorAcct.sendKeys(Keys.TAB);
	vendorAcct.sendKeys(Keys.TAB);
*/
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
	vendorAccountTxt.click();

	vendorAccountTxt.sendKeys(Keys.SPACE);	

	ArrayList<String>  actVendorAccountList= new ArrayList<String>(); 

	int vendorcount=vendorAccountListCount.size();

	System.err.println(vendorcount);

	for(int i=0 ; i < vendorcount ;i++)
	{
		String data=vendorAccountListCount.get(i).getText();

		if (data.equalsIgnoreCase("Vendor B")) 
		{
			vendorAccountListCount.get(i).click();
			break;
		}
	}

	vendorAccountTxt.sendKeys(Keys.TAB);

	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dueDate));
	dueDate.sendKeys(Keys.TAB);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
	voucherHeaderCurrency.sendKeys("INR");
	voucherHeaderCurrency.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
	departmentTxt.sendKeys("INDIA");
	departmentTxt.sendKeys(Keys.TAB);
	*/
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderDueDate));
	voucherHeaderDueDate.click();
	voucherHeaderDueDate.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
	voucherHeaderCurrency.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
	voucherHeaderCurrency.sendKeys(Keys.SPACE);

	int currencycount=currencyListCount.size();

	System.err.println(currencycount);

	for(int i=0 ; i < currencycount ;i++)
	{
		String data=currencyListCount.get(i).getText();

		if (data.equalsIgnoreCase("INR")) 
		{
			currencyListCount.get(i).click();
			break;
		}
	}

	voucherHeaderCurrency.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
	departmentTxt.click();
	departmentTxt.sendKeys(Keys.SPACE);	

	ArrayList<String> actDepartmentList= new ArrayList<String>(); 

	int departmentCount=departmentListCount.size();

	System.err.println(departmentCount);

	for(int i=0 ; i < departmentCount ;i++)
	{
		String data=departmentListCount.get(i).getText();

		if (data.equalsIgnoreCase("INDIA")) 
		{
			departmentListCount.get(i).click();
			break;
		}
	}

	departmentTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(placeOfsupply));
	placeOfsupply.sendKeys("Abu Dhabi");
	placeOfsupply.sendKeys(Keys.TAB);
	Thread.sleep(1000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
	jurisdictionTxt.click();
	jurisdictionTxt.sendKeys("DUBAI");
	Thread.sleep(2000);
	jurisdictionTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
	select1stRow_1stColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
	enter_WarehouseTxt.click();

	enter_WarehouseTxt.sendKeys(Keys.SPACE);

	int warehousecount=warehouseBodyComboList.size();

	for(int i=0 ; i < warehousecount ;i++)
	{
		String data=warehouseBodyComboList.get(i).getText();

		if (data.equalsIgnoreCase("HYDERABAD")) 
		{
			warehouseBodyComboList.get(i).click();
			break;
		}
	}

	enter_WarehouseTxt.sendKeys(Keys.TAB);
	
	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	enter_ItemTxt.click();
	enter_ItemTxt.sendKeys(Keys.SPACE);*/
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	enter_ItemTxt.click();
	enter_ItemTxt.sendKeys("Electronics");
	enter_ItemTxt.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	int pvvGridItemListCount=pvvGridItemList.size();
	for (int i = 0; i < pvvGridItemListCount; i++) 
	{
		String Item=pvvGridItemList.get(i).getText();
		
		/*if(Item.contains("Electronics")){
			
			System.err.println(Item);	
			
		}*/
		if (Item.equalsIgnoreCase("Electronics-Laptop")) 
		{
			pvvGridItemList.get(i).click();
			break;
		}
	}
	enter_ItemTxt.sendKeys(Keys.TAB);	
	//*[@id="id_transactionentry_save"]/div[1]/span
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(taxCode));
	taxCode.sendKeys(Keys.TAB);
	
	Thread.sleep(1000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
	select1stRow_4thColumn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PurchaseAccountTxt));
	enter_PurchaseAccountTxt.sendKeys("Purchase");
	enter_PurchaseAccountTxt.sendKeys(Keys.TAB);

	Thread.sleep(1000);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_9thColumn));
	select1stRow_9thColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
	enter_Quantity.click();
	enter_Quantity.clear();
	enter_Quantity.sendKeys("2");
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
	select1stRow_11thColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
	enter_Rate.click();
	enter_Rate.clear();
	enter_Rate.sendKeys("10");
	enter_Rate.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
	enter_Gross.click();
	enter_Gross.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
	select1stRow_14thColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvVat));
	enter_PvVat.click();

	enter_PvVat.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvTaxable));
	enter_PvTaxable.click();
	enter_PvTaxable.sendKeys(Keys.TAB);
	
	
	//entering second item	
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
	select2ndRow_1stColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
	enter_WarehouseTxt.click();
	enter_WarehouseTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
	enter_WarehouseTxt.sendKeys(Keys.SPACE);

	int warehousecount1=warehouseBodyComboList.size();

	for(int i=0 ; i < warehousecount1 ;i++)
	{
		String data=warehouseBodyComboList.get(i).getText();

		if (data.equalsIgnoreCase("HYDERABAD")) 
		{
			warehouseBodyComboList.get(i).click();
			break;
		}
	}

	enter_WarehouseTxt.sendKeys(Keys.TAB);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_2ndColumn));
	select2ndRow_2ndColumn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	enter_ItemTxt.click();
	enter_ItemTxt.sendKeys(Keys.SPACE);
	int pvvGridItemListCount1=pvvGridItemList.size();
	for (int i = 0; i < pvvGridItemListCount1; i++) 
	{
		String Item=pvvGridItemList.get(i).getText();
		if (Item.equalsIgnoreCase("Electronics-Mobile")) 
		{
			pvvGridItemList.get(i).click();
			break;
		}
	}
	enter_ItemTxt.sendKeys(Keys.TAB);	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(taxCode));
	taxCode.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_4thColumn));
	select2ndRow_4thColumn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PurchaseAccountTxt));
	enter_PurchaseAccountTxt.sendKeys("Purchase");
	enter_PurchaseAccountTxt.sendKeys(Keys.TAB);

	Thread.sleep(1000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_9thColumn));
	select2ndRow_9thColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
	enter_Quantity.click();
	enter_Quantity.clear();
	enter_Quantity.sendKeys("2");
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_11thColumn));
	select2ndRow_11thColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
	enter_Rate.click();
	enter_Rate.clear();
	enter_Rate.sendKeys("10");
	enter_Rate.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
	enter_Gross.click();
	enter_Gross.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_14thColumn));
	select2ndRow_14thColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvVat));
	enter_PvVat.click();

	enter_PvVat.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvTaxable));
	enter_PvTaxable.click();
	enter_PvTaxable.sendKeys(Keys.TAB);
	
	Thread.sleep(3000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
	voucherSaveBtn.click();
	
	Thread.sleep(1000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBillReferenceTxt));
	
	newBillReferenceTxt.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
	pickBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtn));

	okBtn.click();
	
	Thread.sleep(3000);
	
	String expMessage="Voucher saved successfully";
	String actMessage=checkValidationMessage(expMessage);
	if(actMessage.contains(expMessage)){
		return true;
	}
	else
		return false;
}


	public AttributePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	@FindBy(xpath="//*[@id='myNavbar']/div/div[9]/div[1]/span")
	public static WebElement settingsBtn;
	
	@FindBy(xpath="//*[@id='navigationtab14']/div/span[2]")
	public static WebElement InventoryOptions;

	@FindBy(xpath="//*[@id='inventoryOpt_chkInputQntyBreakup']")
	public static WebElement attributeCheckBox;
	
	@FindBy(xpath="//*[@id='updateButton']/i")
	public static WebElement updateBtn;
	
	@FindBy(xpath="//*[@id='callbackbtn']/i")
	public static WebElement settingscloseBtn;
	
	@FindBy(xpath="//*[@id='dvHomeTransClose']/div[1]/span")
	public static WebElement purchaseVATcloseBtn;
	
	
	public boolean checkSettingsInventoryOptionsinPurchaseVATforInputAttributeCheckBox() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financeMenu));
		financeMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionsMenu));
		transactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesMenu));
		purchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVocherVAT));
		purchaseVocherVAT.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsBtn));
		settingsBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(InventoryOptions));
		InventoryOptions.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(attributeCheckBox));
		attributeCheckBox.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateBtn));
		updateBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingscloseBtn));
		settingscloseBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVATcloseBtn));
		 purchaseVATcloseBtn.click();
		String expMessage="Data saved successfully";
		String actMessage=checkValidationMessage(expMessage);
		if(actMessage.equalsIgnoreCase(actMessage)){
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

	//*[@id="id_body_productattribute_attributeEntryOptinCtrl"]
	@FindBy(xpath="//*[@id='id_body_productattribute_attributeEntryOptinCtrl']")
	public static WebElement attributeEntryOption;
			
	@FindBy(xpath="//*[@id='id_body_productattribute']/div/div/div[1]")
	public static WebElement window;
	
	@FindBy(xpath="//*[@id='id_body_productattribute_0_']")
	public static WebElement selectAttributeItem;
	
	@FindBy(xpath="//*[@id='id_body_productattribute']/div/div/div[3]/button[1]")
	public static WebElement OkBtn;
	
	@FindBy(xpath="//*[@id='id_transactionentry_close']/div[1]/span")
	public static WebElement purchaseVATAfterSavecloseBtn;

	@FindBy(xpath="//*[@id='dvHomeTransClose']/div[1]/span")
	public static WebElement purchaseVochercloseBtn;
	
	public boolean checkDisplayingofAttribute0WindowinItemsTabinPurchaseVocherVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financeMenu));
		financeMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionsMenu));
		transactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesMenu));
		purchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVocherVAT));
		purchaseVocherVAT.click();
		
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVochernewBtn));
		purchaseVochernewBtn.click();
		
		checkValidationMessage("Screen opened(00:710)");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		documentNumberTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.sendKeys(Keys.TAB);
		
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();

		vendorAccountTxt.sendKeys(Keys.SPACE);	

		ArrayList<String>  actVendorAccountList= new ArrayList<String>(); 

		int vendorcount=vendorAccountListCount.size();

		System.err.println(vendorcount);

		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();

			if (data.equalsIgnoreCase("Vendor B")) 
			{
				vendorAccountListCount.get(i).click();
				break;
			}
		}

		vendorAccountTxt.sendKeys(Keys.TAB);

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderDueDate));
		voucherHeaderDueDate.click();
		voucherHeaderDueDate.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
		voucherHeaderCurrency.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		voucherHeaderCurrency.sendKeys(Keys.SPACE);

		int currencycount=currencyListCount.size();

		System.err.println(currencycount);

		for(int i=0 ; i < currencycount ;i++)
		{
			String data=currencyListCount.get(i).getText();

			if (data.equalsIgnoreCase("INR")) 
			{
				currencyListCount.get(i).click();
				break;
			}
		}

		voucherHeaderCurrency.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys(Keys.SPACE);	

		ArrayList<String> actDepartmentList= new ArrayList<String>(); 

		int departmentCount=departmentListCount.size();

		System.err.println(departmentCount);

		for(int i=0 ; i < departmentCount ;i++)
		{
			String data=departmentListCount.get(i).getText();

			if (data.equalsIgnoreCase("INDIA")) 
			{
				departmentListCount.get(i).click();
				break;
			}
		}

		departmentTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(placeOfsupply));
		placeOfsupply.sendKeys("Abu Dhabi");
		placeOfsupply.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
		jurisdictionTxt.click();
		jurisdictionTxt.sendKeys("DUBAI");
		Thread.sleep(2000);
		jurisdictionTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.click();

		enter_WarehouseTxt.sendKeys(Keys.SPACE);

		int warehousecount=warehouseBodyComboList.size();

		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=warehouseBodyComboList.get(i).getText();

			if (data.equalsIgnoreCase("HYDERABAD")) 
			{
				warehouseBodyComboList.get(i).click();
				break;
			}
		}

		enter_WarehouseTxt.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(window));
		window.click();
		
		
		getAction().moveToElement(attributeEntryOption);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(attributeEntryOption));
		attributeEntryOption.click();
		attributeEntryOption.sendKeys("Fruits");
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(1000);
		
		String ExpsubAttributeItem="Apple";
		
		Select select=new Select(selectAttributeItem);
		List<WebElement> data=select.getOptions();
		ArrayList<String> subAttrItems=new ArrayList<String>();
		for(WebElement e:data){
			String Attrdata=e.getText();
			
			subAttrItems.add(Attrdata);
			
			System.err.println("SubAttrributes---"+subAttrItems);
			
		}
		
		//System.err.println(subAttrItems);
		
		String ActsubAttributeItem=subAttrItems.get(0);
		
		if(ActsubAttributeItem.equals(ExpsubAttributeItem))
		{
			System.err.println("true");
		}
		else
		{
			System.err.println("AttributeItems not matched");
		}
		
		select.selectByVisibleText("Banana");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(taxCode));
		taxCode.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
		select1stRow_4thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PurchaseAccountTxt));
		enter_PurchaseAccountTxt.sendKeys("Purchase");
		Thread.sleep(1000);
		enter_PurchaseAccountTxt.sendKeys(Keys.TAB);

		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_9thColumn));
		select1stRow_9thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.click();
		enter_Quantity.clear();
		enter_Quantity.sendKeys("2");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
		select1stRow_11thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.clear();
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
		select1stRow_14thColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvVat));
		enter_PvVat.click();

		enter_PvVat.sendKeys(Keys.TAB);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_15thColumn));
		select1stRow_15thColumn.click();
/*
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvTaxable));
		enter_PvTaxable.click();
		enter_PvTaxable.sendKeys(Keys.TAB);
	*/	
		//Thread.sleep(1000);
		
		
		//Entering second item in same vocher
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
		select2ndRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.click();
		
		enter_WarehouseTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		enter_WarehouseTxt.sendKeys(Keys.SPACE);

		int warehousecount1=warehouseBodyComboList.size();

		for(int i=0 ; i < warehousecount ;i++)
		{
			String data1=warehouseBodyComboList.get(i).getText();

			if (data1.equalsIgnoreCase("HYDERABAD")) 
			{
				warehouseBodyComboList.get(i).click();
				break;
			}
		}

		enter_WarehouseTxt.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(window));
		window.click();
		
		
		getAction().moveToElement(attributeEntryOption);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(attributeEntryOption));
		attributeEntryOption.click();
		attributeEntryOption.sendKeys("Fruits");
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(1000);
		
		String ExpsubAttributeItem2="Mango";
		
		Select select1=new Select(selectAttributeItem);
		List<WebElement> data1=select1.getOptions();
		ArrayList<String> subAttrItems1=new ArrayList<String>();
		for(WebElement e:data1){
			String Attrdata=e.getText();
			
			subAttrItems1.add(Attrdata);
			
			System.err.println("SubAttrributes---"+subAttrItems1);
			
		}
		
		//System.err.println(subAttrItems);
		
		String ActsubAttributeItem2=subAttrItems1.get(2);
		
		if(ActsubAttributeItem2.equals(ExpsubAttributeItem2))
		{
			System.err.println("true");
		}
		else
		{
			System.err.println("Actual Fruit-----"+ActsubAttributeItem2 +     "Expected Fruit"+ExpsubAttributeItem2);
			System.err.println("AttributeItems not matched");
		}
		
		select.selectByVisibleText("Orange");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(taxCode));
		taxCode.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_4thColumn));
		select2ndRow_4thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PurchaseAccountTxt));
		enter_PurchaseAccountTxt.sendKeys("Purchase");
		Thread.sleep(1000);
		enter_PurchaseAccountTxt.sendKeys(Keys.TAB);

		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_9thColumn));
		select2ndRow_9thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.click();
		enter_Quantity.clear();
		enter_Quantity.sendKeys("2");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_11thColumn));
		select2ndRow_11thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.clear();
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_14thColumn));
		select2ndRow_14thColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvVat));
		enter_PvVat.click();

		enter_PvVat.sendKeys(Keys.TAB);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_15thColumn));
		select2ndRow_15thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBillReferenceTxt));
		
		newBillReferenceTxt.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
		pickBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtn));

		okBtn.click();
		
		purchaseVATAfterSavecloseBtn.click();
		Thread.sleep(2000);
		purchaseVochercloseBtn.click();
		
		Thread.sleep(3000);
		String expMessage="Voucher saved successfully";
		String actMessage=checkValidationMessage(expMessage);
		if(actMessage.contains(expMessage))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}


	
	public boolean checkDisplayingofAttribute1WindowinItemsTabinPurchaseVocherVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financeMenu));
		financeMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionsMenu));
		transactionsMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesMenu));
		purchasesMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVocherVAT));
		purchaseVocherVAT.click();
		
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVochernewBtn));
		purchaseVochernewBtn.click();
		
		checkValidationMessage("Screen opened(00:710)");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		documentNumberTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
		dateTxt.sendKeys(Keys.TAB);
		
		
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();

		vendorAccountTxt.sendKeys(Keys.SPACE);	

		ArrayList<String>  actVendorAccountList= new ArrayList<String>(); 

		int vendorcount=vendorAccountListCount.size();

		System.err.println(vendorcount);

		for(int i=0 ; i < vendorcount ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();

			if (data.equalsIgnoreCase("Vendor B")) 
			{
				vendorAccountListCount.get(i).click();
				break;
			}
		}

		vendorAccountTxt.sendKeys(Keys.TAB);

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderDueDate));
		voucherHeaderDueDate.click();
		voucherHeaderDueDate.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
		voucherHeaderCurrency.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		voucherHeaderCurrency.sendKeys(Keys.SPACE);

		int currencycount=currencyListCount.size();

		System.err.println(currencycount);

		for(int i=0 ; i < currencycount ;i++)
		{
			String data=currencyListCount.get(i).getText();

			if (data.equalsIgnoreCase("INR")) 
			{
				currencyListCount.get(i).click();
				break;
			}
		}

		voucherHeaderCurrency.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
		departmentTxt.click();
		departmentTxt.sendKeys(Keys.SPACE);	

		ArrayList<String> actDepartmentList= new ArrayList<String>(); 

		int departmentCount=departmentListCount.size();

		System.err.println(departmentCount);

		for(int i=0 ; i < departmentCount ;i++)
		{
			String data=departmentListCount.get(i).getText();

			if (data.equalsIgnoreCase("INDIA")) 
			{
				departmentListCount.get(i).click();
				break;
			}
		}

		departmentTxt.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(placeOfsupply));
		placeOfsupply.sendKeys("Abu Dhabi");
		placeOfsupply.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
		jurisdictionTxt.click();
		jurisdictionTxt.sendKeys("DUBAI");
		Thread.sleep(2000);
		jurisdictionTxt.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
		select1stRow_1stColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.click();

		enter_WarehouseTxt.sendKeys(Keys.SPACE);

		int warehousecount=warehouseBodyComboList.size();

		for(int i=0 ; i < warehousecount ;i++)
		{
			String data=warehouseBodyComboList.get(i).getText();

			if (data.equalsIgnoreCase("HYDERABAD")) 
			{
				warehouseBodyComboList.get(i).click();
				break;
			}
		}

		enter_WarehouseTxt.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(window));
		window.click();
		
		
		getAction().moveToElement(attributeEntryOption);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(attributeEntryOption));
		attributeEntryOption.click();
		attributeEntryOption.sendKeys("Electronics");
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(1000);
		
		String ExpsubAttributeItem="Laptop";
		
		Select select=new Select(selectAttributeItem);
		List<WebElement> data=select.getOptions();
		ArrayList<String> subAttrItems=new ArrayList<String>();
		for(WebElement e:data){
			String Attrdata=e.getText();
			
			subAttrItems.add(Attrdata);
			
			System.err.println("SubAttrributes of Electronics---"+subAttrItems);
			
		}
		
		//System.err.println(subAttrItems);
		
		String ActsubAttributeItem=subAttrItems.get(1);
		
		if(ActsubAttributeItem.equals(ExpsubAttributeItem))
		{
			System.err.println("true");
		}
		else
		{
			System.err.println("AttributeItems not matched");
			System.err.println("Actual subattribute Item"+ActsubAttributeItem+    "Expected subattribute Item   "+ExpsubAttributeItem);
		}
		
		select.selectByVisibleText("Laptop");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(taxCode));
		taxCode.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
		select1stRow_4thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PurchaseAccountTxt));
		enter_PurchaseAccountTxt.sendKeys("Purchase");
		Thread.sleep(1000);
		enter_PurchaseAccountTxt.sendKeys(Keys.TAB);

		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_9thColumn));
		select1stRow_9thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.click();
		enter_Quantity.clear();
		enter_Quantity.sendKeys("2");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
		select1stRow_11thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.clear();
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
		select1stRow_14thColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvVat));
		enter_PvVat.click();

		enter_PvVat.sendKeys(Keys.TAB);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_15thColumn));
		select1stRow_15thColumn.click();
/*
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvTaxable));
		enter_PvTaxable.click();
		enter_PvTaxable.sendKeys(Keys.TAB);
	*/	
		//Thread.sleep(1000);
		
		
		//Entering second item in same vocher
		
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_1stColumn));
		select2ndRow_1stColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
		enter_WarehouseTxt.click();
		
		enter_WarehouseTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		enter_WarehouseTxt.sendKeys(Keys.SPACE);

		int warehousecount1=warehouseBodyComboList.size();

		for(int i=0 ; i < warehousecount ;i++)
		{
			String data1=warehouseBodyComboList.get(i).getText();

			if (data1.equalsIgnoreCase("HYDERABAD")) 
			{
				warehouseBodyComboList.get(i).click();
				break;
			}
		}

		enter_WarehouseTxt.sendKeys(Keys.TAB);
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(window));
		window.click();
		
		
		getAction().moveToElement(attributeEntryOption);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(attributeEntryOption));
		attributeEntryOption.click();
		attributeEntryOption.sendKeys("Electronics");
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(1000);
		
		String ExpsubAttributeItem2="PC";
		
		Select select1=new Select(selectAttributeItem);
		List<WebElement> data1=select1.getOptions();
		ArrayList<String> subAttrItems1=new ArrayList<String>();
		for(WebElement e:data1){
			String Attrdata=e.getText();
			
			subAttrItems1.add(Attrdata);
			
			System.err.println("SubAttrributes of Electronics---"+subAttrItems1);
			
		}
		
		//System.err.println(subAttrItems);
		
		String ActsubAttributeItem2=subAttrItems1.get(2);
		
		if(ActsubAttributeItem2.equalsIgnoreCase(ExpsubAttributeItem2))
		{
			System.err.println("true");
		}
		else
		{
			System.err.println("Actual Electronic-----"+ActsubAttributeItem2 +     "Expected Electronic"+ExpsubAttributeItem2);
			System.err.println("AttributeItems not matched");
		}
		
		select.selectByVisibleText("Mobile");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
		OkBtn.click();
		
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(taxCode));
		taxCode.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_4thColumn));
		select2ndRow_4thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PurchaseAccountTxt));
		enter_PurchaseAccountTxt.sendKeys("Purchase");
		Thread.sleep(1000);
		enter_PurchaseAccountTxt.sendKeys(Keys.TAB);

		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_9thColumn));
		select2ndRow_9thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
		enter_Quantity.click();
		enter_Quantity.clear();
		enter_Quantity.sendKeys("2");
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_11thColumn));
		select2ndRow_11thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
		enter_Rate.click();
		enter_Rate.clear();
		enter_Rate.sendKeys("10");
		enter_Rate.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
		enter_Gross.click();
		enter_Gross.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_14thColumn));
		select2ndRow_14thColumn.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvVat));
		enter_PvVat.click();

		enter_PvVat.sendKeys(Keys.TAB);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select2ndRow_15thColumn));
		select2ndRow_15thColumn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBillReferenceTxt));
		
		newBillReferenceTxt.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
		pickBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtn));

		okBtn.click();
		
		Thread.sleep(3000);
		
		purchaseVATAfterSavecloseBtn.click();
		Thread.sleep(1000);
		purchaseVochercloseBtn.click();
		
		String expMessage="Voucher saved successfully";
		String actMessage=checkValidationMessage(expMessage);
		if(actMessage.contains(expMessage))
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

	  @FindBy(xpath="//*[@id='LandingGridBody']/tr/td[12]")
	  private static List<WebElement> masterGridBodyName;
	  
	  
	  @FindBy(xpath="//*[@id='ulCommonlyUsedRibbon']//li[7]")
	  private static WebElement propetiesIcon;
	  
	  @FindBy(xpath="//*[@id='chkDontMaintainStockbyBatch']")
	  private static WebElement DontMaintainStockbyBatchChkbox;
	  
	  @FindBy(xpath="//*[@id='chkDontinputBin']")
	  private static WebElement DontinputBinChkbox;
	  
	  @FindBy(xpath="//*[@id='chkDontMaintainStocksByRMA']")
	  private static WebElement DontMaintainStocksByRMAChkbox;
	  
	  @FindBy(xpath="//*[@id='divMasterProperty']/ul//li/span[1]")
	  private static WebElement propertiesOkBtn;
	  
	  @FindBy(xpath="//*[@id='divMasterProperty']/ul//li/span[2]")
	  private static WebElement propertiesCancelBtn;
	  
	  public boolean checkFruitsItemProperties() throws InterruptedException	{
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
			mastersMenu.click();
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMenu));
			itemMenu.click();
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(item));
			item.click();
			
			 int count = masterGridBodyName.size();
				
				for (int i = 0; i < count; i++) 
				{
					String data = masterGridBodyName.get(i).getText();
					Thread.sleep(1000);
					if (data.equalsIgnoreCase("Fruits")) 
					{
						getAction().click(masterGridBodyChkbox.get(i)).build().perform();
						Thread.sleep(2000);
						break;
					}
				}
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propetiesIcon));
			propetiesIcon.click();
			
			
			if(DontMaintainStockbyBatchChkbox.isSelected()==false){
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DontMaintainStockbyBatchChkbox));
				DontMaintainStockbyBatchChkbox.click();	
			}
			
			
			if(DontinputBinChkbox.isSelected()==false){
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DontinputBinChkbox));
				DontinputBinChkbox.click();	
			}
			
			if(DontMaintainStocksByRMAChkbox.isSelected()==false){
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DontMaintainStocksByRMAChkbox));
				DontMaintainStocksByRMAChkbox.click();	
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesOkBtn));
			propertiesOkBtn.click();	
			
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propetiesIcon));
			propetiesIcon.click();
			Thread.sleep(2000);
			
			if(DontMaintainStockbyBatchChkbox.isSelected()==true&&DontinputBinChkbox.isSelected()==true
					&&DontMaintainStocksByRMAChkbox.isSelected()==true)
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesCancelBtn));
				propertiesCancelBtn.click();
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemCloseBtn));
				itemCloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesCancelBtn));
				propertiesCancelBtn.click();
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemCloseBtn));
				itemCloseBtn.click();
				return false;
			}
			
		}  
	  

	  public boolean checkElectronicsItemProperties() throws InterruptedException	{
			
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
			homeMenu.click();
			Thread.sleep(2000);
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
			mastersMenu.click();
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMenu));
			itemMenu.click();
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(item));
			item.click();
			
			 int count = masterGridBodyName.size();
				
				for (int i = 0; i < count; i++) 
				{
					String data = masterGridBodyName.get(i).getText();
					Thread.sleep(1000);
					if (data.equalsIgnoreCase("Electronics")) 
					{
						getAction().click(masterGridBodyChkbox.get(i)).build().perform();
						Thread.sleep(2000);
						break;
					}
				}
			Thread.sleep(2000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propetiesIcon));
			propetiesIcon.click();
			
			
			if(DontMaintainStockbyBatchChkbox.isSelected()==false){
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DontMaintainStockbyBatchChkbox));
				DontMaintainStockbyBatchChkbox.click();	
			}
			
			
			if(DontinputBinChkbox.isSelected()==false){
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DontinputBinChkbox));
				DontinputBinChkbox.click();	
			}
			
			if(DontMaintainStocksByRMAChkbox.isSelected()==false){
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(DontMaintainStocksByRMAChkbox));
				DontMaintainStocksByRMAChkbox.click();	
			}
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesOkBtn));
			propertiesOkBtn.click();	
			
			Thread.sleep(1000);
			
			getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propetiesIcon));
			propetiesIcon.click();
			Thread.sleep(2000);
			
			if(DontMaintainStockbyBatchChkbox.isSelected()==true&&DontinputBinChkbox.isSelected()==true
					&&DontMaintainStocksByRMAChkbox.isSelected()==true)
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesCancelBtn));
				propertiesCancelBtn.click();
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemCloseBtn));
				itemCloseBtn.click();
				return true;
			}
			else
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(propertiesCancelBtn));
				propertiesCancelBtn.click();
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemCloseBtn));
				itemCloseBtn.click();
				return false;
			}
			
		}  
	  
	  
	  @FindBy(xpath="//*[@id='mainHeader_MainLayout']/nav/div/ul/li[6]/a/span")
	  private static WebElement userName;
	  
	  @FindBy(xpath="//*[@id='userprofile']/li/span[2]")
	  private static WebElement logoutBtn;
	  
	  
	 public boolean checkLogoutAndLoginAgain() throws InterruptedException{
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userName));
		 userName.click();
		 
		 Thread.sleep(2000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(logoutBtn));
		 logoutBtn.click();
		 Thread.sleep(2000);
		 
		 LoginPage lp=new LoginPage(getDriver()); 

			String unamelt="su";
					      
			String pawslt="su";
					      
			lp.enterUserName(unamelt);

			Thread.sleep(2000);
					
			lp.enterPassword(pawslt);

			String compname="BRS";

			 Select oSelect = new Select(companyDropDownList);
			 
			 List <WebElement> elementCount = oSelect.getOptions();

			 int cqSize = elementCount.size();
			 
			 System.out.println("CompanyDropdownList Count :"+cqSize);

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
				
		        Thread.sleep(2000);
				
				lp.clickOnSignInBtn();
				
				Thread.sleep(1000);
				
				String userInfo=userNameDisplay.getText();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
		    	
				companyLogo.click();
						    	
				if(userInfo.equalsIgnoreCase("SU"))
				{
					return true;
					
				}
				else
				{
					return false;

					}
				
		 
		 
	 }
	  

	public boolean checkItemsSavedinMasterItemforFruitsandSubItems() throws InterruptedException	{
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMenu));
		itemMenu.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(item));
		item.click();
		
		 int count = masterGridBodyName.size();
			
			for (int i = 0; i < count; i++) 
			{
				String data = masterGridBodyName.get(i).getText();
				Thread.sleep(1000);
				if (data.equalsIgnoreCase("Fruits")) 
				{
					getAction().doubleClick(masterGridBodyChkbox.get(i)).build().perform();
					Thread.sleep(2000);
					break;
				}
			}
		Thread.sleep(2000);
		
		 int count1 = masterGridBodyName.size();
		 
		 ArrayList<String >actList=new ArrayList<>();
		 
		 for (int i = 0; i < count1; i++) 
		 {
			 String data1 = masterGridBodyName.get(i).getText();
			 actList.add(data1);
		 }
		 

		 String actDATA=actList.toString();
		 String expDATA="[Fruits-Apple, Fruits-Banana, Fruits-Grapes, Fruits-Orange]";
		 
		 System.err.println("DATA Displayed : "+actDATA );
		 System.err.println("DATA Displayed : "+expDATA );
		 
		Thread.sleep(2000);
		
		itemCloseBtn.click();
		
		Thread.sleep(3000);
		
		if(actDATA.equalsIgnoreCase(expDATA))
		{		
			return true;
		}
		else
		{
			return false;
		}
		


		
	}

	
public boolean checkItemsSavedinMasterItemforElectronicsandSubItems() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException	{
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
		mastersMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMenu));
		itemMenu.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(item));
		item.click();
		
		Thread.sleep(2000);
		
		 int count = masterGridBodyName.size();
			
			for (int i = 0; i < count; i++) 
			{
				String data = masterGridBodyName.get(i).getText();
				Thread.sleep(1000);
				if (data.equalsIgnoreCase("Electronics")) 
				{
					getAction().doubleClick(masterGridBodyChkbox.get(i)).build().perform();
					Thread.sleep(2000);
					break;
				}
			}
		Thread.sleep(2000);
		
		 int count1 = masterGridBodyName.size();
		 
		 ArrayList<String >actList=new ArrayList<>();
		 
		 for (int i = 0; i < count1; i++) 
		 {
			 String data1 = masterGridBodyName.get(i).getText();
			 actList.add(data1);
		 }
		 

		 String actDATA=actList.toString();
		 String expDATA="[Electronics-Computers, Electronics-Laptops, Electronics-Mobiles, Electronics-Television]";
		 
		 System.err.println("DATA Displayed : "+actDATA );
		 System.err.println("DATA Displayed : "+expDATA );
		 
		Thread.sleep(2000);
		
		itemCloseBtn.click();
		
		Thread.sleep(3000);
		
		if(actDATA.equalsIgnoreCase(expDATA))
		{		
			return true;
		}
		else
		{
			return false;
		}
		

}

public boolean checktheNewBtninSubItemsofanItemFruits() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	homeMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	mastersMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMenu));
	itemMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(item));
	item.click();
	
	 int count = masterGridBodyName.size();
		
		for (int i = 0; i < count; i++) 

			
		{
			Thread.sleep(1000);
			String data = masterGridBodyName.get(i).getText();
			
			
			if (data.equalsIgnoreCase("Fruits")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(masterGridBodyChkbox.get(i)).build().perform();
				
				break;
			}
		}
	Thread.sleep(5000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(subItemNewBtn));
	subItemNewBtn.click();
	Thread.sleep(2000);
	
	String expMessage="Can not create item in attribute group";
	String actMessage=checkValidationMessage(expMessage);
	
	if(actMessage.equalsIgnoreCase(expMessage)){
		return true;
	}
	else
	{
	return false;
	}
	
	
	}


@FindBy(xpath="//*[@id='btnNew']/i")
public static WebElement subItemNewBtn;

/*public boolean checkTheNewBtninsubitemsOfAnItem() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	homeMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
	mastersMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMenu));
	itemMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(item));
	item.click();
	
	 int count = masterGridBodyNameforFruits.size();
		
		for (int i = 0; i < count; i++) 

			
		{
			Thread.sleep(1000);
			String data = masterGridBodyNameforFruits.get(i).getText();
			
			
			if (data.equalsIgnoreCase("Fruits")) 
			{
				Thread.sleep(1000);
				getAction().doubleClick(masterGridBodyChkboxforFruits.get(i)).build().perform();
				
				break;
			}
		}
	Thread.sleep(5000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(subItemNewBtn));
	subItemNewBtn.click();
	
	String expMessage="Can not create item in attribute group";
	String actMessage=checkValidationMessage(expMessage);
	
	if(actMessage.equalsIgnoreCase(expMessage)){
		return true;
	}
	else
	{
	return false;
	}
	
	
	}

*/
/*
public boolean checkDisplayingitemsunderFruitsinItemcolumninPurchaseVocherVat() throws InterruptedException{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financeMenu));
	financeMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionsMenu));
	transactionsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesMenu));
	purchasesMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVocherVAT));
	purchaseVocherVAT.click();
	
	Thread.sleep(1000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVochernewBtn));
	purchaseVochernewBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_2ndColumn));
	select1stRow_2ndColumn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	enter_ItemTxt.click();
	enter_ItemTxt.sendKeys("Fruits");
	enter_ItemTxt.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	int size=pvvGridItemList.size();
	System.err.println("Items under Fruits Item are:  "+size);
	
	
	 String Expfruit1="Fruits-Apple 0.00";
	 String Expfruit2="Fruits-Banana";
	 String Expfruit3="Fruits-Orange";
	 String Expfruit4="Fruits-Grapes";
	
	 ArrayList<String> subItems=new ArrayList<String>();
	for(int i=0;i<size;i++){
		String data=pvvGridItemList.get(i).getText();
		subItems.add(data);
			}
	
	System.err.println(subItems);
	
	String ActFruit1=subItems.get(0);
	String ActFruit2=subItems.get(1);
	String ActFruit3=subItems.get(2);
	String ActFruit4=subItems.get(3);
		
		if(ActFruit1.equalsIgnoreCase(Expfruit1)&&
				ActFruit2.equalsIgnoreCase(Expfruit2)
				&&ActFruit3.equalsIgnoreCase(Expfruit3)&&
				ActFruit4.equalsIgnoreCase(Expfruit4) ){
			
			return true;
		}
		else
		{
			return false;
		}
	
	
}
*/


public boolean checkAddingitemSTDCOGSRateinItemWindowinPurchaseVocherVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financeMenu));
	financeMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionsMenu));
	transactionsMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchasesMenu));
	purchasesMenu.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVocherVAT));
	purchaseVocherVAT.click();
	
	Thread.sleep(1000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVochernewBtn));
	purchaseVochernewBtn.click();
	
	checkValidationMessage("Screen opened(00:710)");

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
	documentNumberTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dateTxt));
	dateTxt.sendKeys(Keys.TAB);
	
	

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
	vendorAccountTxt.click();

	vendorAccountTxt.sendKeys(Keys.SPACE);	

	ArrayList<String>  actVendorAccountList= new ArrayList<String>(); 

	int vendorcount=vendorAccountListCount.size();

	System.err.println(vendorcount);

	for(int i=0 ; i < vendorcount ;i++)
	{
		String data=vendorAccountListCount.get(i).getText();

		if (data.equalsIgnoreCase("Vendor B")) 
		{
			vendorAccountListCount.get(i).click();
			break;
		}
	}

	vendorAccountTxt.sendKeys(Keys.TAB);

	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderDueDate));
	voucherHeaderDueDate.click();
	voucherHeaderDueDate.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherHeaderCurrency));
	voucherHeaderCurrency.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
	voucherHeaderCurrency.sendKeys(Keys.SPACE);

	int currencycount=currencyListCount.size();

	System.err.println(currencycount);

	for(int i=0 ; i < currencycount ;i++)
	{
		String data=currencyListCount.get(i).getText();

		if (data.equalsIgnoreCase("INR")) 
		{
			currencyListCount.get(i).click();
			break;
		}
	}

	voucherHeaderCurrency.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
	departmentTxt.click();
	departmentTxt.sendKeys(Keys.SPACE);	

	ArrayList<String> actDepartmentList= new ArrayList<String>(); 

	int departmentCount=departmentListCount.size();

	System.err.println(departmentCount);

	for(int i=0 ; i < departmentCount ;i++)
	{
		String data=departmentListCount.get(i).getText();

		if (data.equalsIgnoreCase("INDIA")) 
		{
			departmentListCount.get(i).click();
			break;
		}
	}

	departmentTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(placeOfsupply));
	placeOfsupply.sendKeys("Abu Dhabi");
	placeOfsupply.sendKeys(Keys.TAB);
	Thread.sleep(1000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
	jurisdictionTxt.click();
	jurisdictionTxt.sendKeys("DUBAI");
	Thread.sleep(2000);
	jurisdictionTxt.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
	select1stRow_1stColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_WarehouseTxt));
	enter_WarehouseTxt.click();

	enter_WarehouseTxt.sendKeys(Keys.SPACE);

	int warehousecount=warehouseBodyComboList.size();

	for(int i=0 ; i < warehousecount ;i++)
	{
		String data=warehouseBodyComboList.get(i).getText();

		if (data.equalsIgnoreCase("HYDERABAD")) 
		{
			warehouseBodyComboList.get(i).click();
			break;
		}
	}

	enter_WarehouseTxt.sendKeys(Keys.TAB);
	Thread.sleep(1000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(window));
	window.click();
	
	
	getAction().moveToElement(attributeEntryOption);
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(attributeEntryOption));
	attributeEntryOption.click();
	
	attributeEntryOption.sendKeys("STD RATE COGS ITEM");
	Thread.sleep(2000);
	attributeEntryOption.sendKeys(Keys.TAB);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(OkBtn));
	OkBtn.click();
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(taxCode));
	taxCode.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_4thColumn));
	select1stRow_4thColumn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PurchaseAccountTxt));
	//enter_PurchaseAccountTxt.sendKeys("Purchase");
	//Thread.sleep(1000);
	enter_PurchaseAccountTxt.sendKeys(Keys.TAB);

	Thread.sleep(1000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_9thColumn));
	select1stRow_9thColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));
	enter_Quantity.click();
	enter_Quantity.clear();
	enter_Quantity.sendKeys("2");
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
	select1stRow_11thColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
	enter_Rate.click();
	enter_Rate.clear();
	enter_Rate.sendKeys("10");
	enter_Rate.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
	enter_Gross.click();
	enter_Gross.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
	select1stRow_14thColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvVat));
	enter_PvVat.click();

	enter_PvVat.sendKeys(Keys.TAB);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_15thColumn));
	select1stRow_15thColumn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
	voucherSaveBtn.click();
	Thread.sleep(1000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBillReferenceTxt));
	
	newBillReferenceTxt.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
	pickBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(okBtn));

	okBtn.click();
	
	Thread.sleep(3000);
	
	purchaseVATAfterSavecloseBtn.click();
	//purchaseVochercloseBtn.click();
	
	String expMessage="Voucher saved successfully";
	String actMessage=checkValidationMessage(expMessage);
	if(actMessage.contains(expMessage))
	{
		return true;
	}
	else
	{
		return false;
	}
}
}
