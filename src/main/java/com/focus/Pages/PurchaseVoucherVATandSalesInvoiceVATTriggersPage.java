package com.focus.Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
import com.testautomationguru.utility.PDFUtil;

public class PurchaseVoucherVATandSalesInvoiceVATTriggersPage extends BaseEngine{
	
	
	
	@FindBy(xpath="//*[@id='txtSearchMenu_MainLayout']")
    private static WebElement serachMenuTextHomePage;
	
	@FindBy(xpath="//li/span")
    private static WebElement searchMenuTextClick;
	
	@FindBy(xpath="//div[@id='docCustomization']")
	private static WebElement  documentCustomization45Btn;
	
	  @FindBy(xpath="//a[@id='769']")
	  private static WebElement  purchaseVouchersVATBtn;
	
	  @FindBy(xpath="//span[@class='dropdown icon-menuicon1 icon-font6 theme_color-inverse pull-right']")
	  private static WebElement  toogleExpandBtn;
	  
	  @FindBy(xpath="//*[@id='navHidetab7']")
	  private static WebElement  triggersBtn;
	  
	  @FindBy(xpath="//*[@id='triggers_FieldsDiv']/div[2]/div[2]/div[1]/label/input")
	private static WebElement  triggersSuspendedChkboxs;
	  
	  @FindBy(xpath="//*[@id='triggers_existTriggers']")
	  private static WebElement  editLayoutTriggerName;
	  
	  @FindBy(xpath="//td[@id='triggers_docTable_col_1-1']")
      private static WebElement  trigger1stRow1stCol;
	  
	  @FindBy(xpath="//td[@id='triggers_docTable_col_1-2']")
      private static WebElement  trigger1stRow2ndCol;
	  
	  @FindBy(xpath="//select[@id='triggers_docTableFieldDropDown']")
      private static WebElement  triggerSelectFieldDropdown;
	  
	  @FindBy(xpath="//select[@id='triggers_docTableMapDropDown']")
      private static WebElement  triggerSelectMapDropdown;
	  
		@FindBy(xpath="//i[@class='icon-save icon-font7']")
		private static WebElement  editLayoutTriggersSaveBtn;
	  
		@FindBy(xpath="//span[@id='updateButton']")
		private static WebElement  updateBtn;
	  
		 @FindBy(xpath="//*[@id='triggers_chkraiseNewDoc']")
		  private static WebElement editLayoutTriggerRaiseDoc;  	
		  
		  
		  @FindBy(xpath="//select[@id='triggers_allVoucherDropDown']")
		  private static WebElement selectRaiseaDocument;  	
		  
		  
		  @FindBy(xpath="//select[@id='triggers_allVoucherDropDown']")
		  private static WebElement editLayoutTriggersAllVouchers;  	
		  
		  
			@FindBy(xpath="//span/div/table/tbody/tr/td/select")
			private static WebElement  triggersConjuctionDrpdwn;
			
			@FindBy(xpath="//div/table/tbody/tr/td[2]/input")
			private static WebElement  triggersSelectFieldTxt;
			
			@FindBy(xpath="//tbody/tr/td[3]/select")
			private static WebElement  triggersSelectOperdrpdwn;
			
			@FindBy(xpath="//tbody/tr/td[4]/select")
			private static WebElement  triggersCompareWithdrpdwn;
			
		//	@FindBy(xpath="//input[@id='advancefilter_master_17_1_']")
			@FindBy(xpath="//input[@id='advancefilter_master_0_1_']")
			private static WebElement  triggersValueTxt;
			
			@FindBy(xpath="//ul[@class='treeview col-xs-12']//a[@id='4']//span[@class='icon-right-arrow']")
			private static WebElement  triggerVendorACExpansionBtn;
		  
			@FindBy(xpath="(//*[@id='5002'])[2]")
			private static WebElement  triggerVendorAcName;
			
			@FindBy(xpath="(//*[@id='5002'])[1]")
			private static WebElement  triggerCustomerAcName;
			
			@FindBy(xpath="//*[@id='4']")
			private static WebElement  triggerVendorAc;
			
			@FindBy(xpath="//*[@id='5002']")
			private static WebElement  triggerNameUnderVendor;
		  
			//@FindBy(xpath="//td[@id='advancefilter_master_17_1__input_image']/span")
			@FindBy(xpath="//*[@id='0_1_AdvanceFilter_']/table/tbody/tr/td[5]")
			private static WebElement  triggersValueToEnterTxt;
			
			@FindBy(xpath="//td[@id='advancefilter_master_17_1__input_image']/span")
			private static WebElement  triggersValueTxt1;
			
			
			@FindBy(xpath="//span[@id='btnPick']")
			private static WebElement pickBtn;

			@FindBy(xpath="//input[@id='txtNewReference']")
			private static WebElement newReferenceTxt;

			@FindBy(xpath="//span[@id='btnOk']")
			private static WebElement Bill_OkBtn;
			
			public boolean checkEraseAllTransactions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
			{
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
				homeMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
				dataMangementMenu.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAll));
				eraseAll.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseTranscationsRadio));
				eraseTranscationsRadio.click();
				
				getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(eraseAllOkBtn));
				eraseAllOkBtn.click();
				
				if(getIsAlertPresent())
				{
					getWaitForAlert();
					
					getAlert().accept();
				}
				
				String expMessage = "Data deleted successfully.";
				
				String actMessage = checkValidationMessage(expMessage);
				
				System.out.println("************************************* checkEraseAllTransactionsAfterCompletingAllValidations  *********************************");
				System.out.println("Message  :  "+actMessage +" Value Expected : "+expMessage);
				
				if (actMessage.equalsIgnoreCase(expMessage))
				{
					System.out.println("Voucher Saved");
					return true;
				}
				else
				{
					System.out.println("Voucher Not Saved");
					return false;
				}
			}
			 @FindBy (xpath="//table[@id='editScreen_bodyTable']/tbody/tr[5]/td/span[2]")
			 private static WebElement editScreenBodyRow5Delete;				
			
	public boolean checkDeleteVATFieldinEditScreenofPurchaseVoucherVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
		System.out.println("Setting buton is enabled");
		serachMenuTextHomePage.click();
		serachMenuTextHomePage.sendKeys("Configure Transactions");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMenuTextClick));
		searchMenuTextClick.click();	  
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentCustomization45Btn));
		documentCustomization45Btn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersVATBtn));
		purchaseVouchersVATBtn.click();
						 	    	
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editScreenTab));
		editScreenTab.click();
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editScreenBodyTab));
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editScreenBodyRow5Delete));
		editScreenBodyRow5Delete.click();
		
		getWaitForAlert();
		getAlert().accept();
		
		System.out.println("*******************************************checkDeleteFieldInEditScreenBodyInTrialPurchaseUpdate*******************************************");
			
		String expMessage = "Data deleted successfully";
		String actMessage = checkValidationMessage(expMessage);
		if(actMessage.equalsIgnoreCase(expMessage) )
		{	
			return  true;
		}
		else
		{
			return  false;
		}
		
		
		
	}
			
			
			
			
	  
	public boolean checkSaveTriggerwithDiscountasMapFieldinPVVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
							 	    	
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toogleExpandBtn));
		toogleExpandBtn.click();
			  
		Thread.sleep(2000);
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggersBtn));
		triggersBtn.click();
		
		
			
		Thread.sleep(4000);
		
		checkDeletingTriggerInPurchaseVoucherVAT();
		Thread.sleep(6000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggerName));
		editLayoutTriggerName.click();
		editLayoutTriggerName.sendKeys(Keys.SHIFT,Keys.HOME);
		Thread.sleep(1000);
		editLayoutTriggerName.sendKeys("Map Trigger");
		Thread.sleep(2000);
		editLayoutTriggerName.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		
		triggersConjuctionDrpdwn.click();
        Thread.sleep(2000);		
		triggersConjuctionDrpdwn.sendKeys(Keys.ARROW_DOWN);			
		triggersConjuctionDrpdwn.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggersSelectFieldTxt));
		triggersSelectFieldTxt.click();
					
		Thread.sleep(3000);
		
		getAction().moveToElement(triggerVendorACExpansionBtn).build().perform();
		Thread.sleep(1000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggerVendorACExpansionBtn));
		triggerVendorACExpansionBtn.click();
		
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggerVendorAcName));
		triggerVendorAcName.click();
		
		Thread.sleep(2000);
	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggersSelectOperdrpdwn));
		triggersSelectOperdrpdwn.click();
		triggersSelectOperdrpdwn.sendKeys("Equal");
		
		
		Thread.sleep(5000);
		triggersSelectOperdrpdwn.sendKeys(Keys.TAB);
		
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggersCompareWithdrpdwn));
		triggersCompareWithdrpdwn.click();
		triggersCompareWithdrpdwn.sendKeys("value");
		//triggersCompareWithdrpdwn.sendKeys(Keys.ARROW_DOWN);
		Thread.sleep(2000);
		triggersCompareWithdrpdwn.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		triggersValueToEnterTxt.click();
		Thread.sleep(1000);
		triggersValueTxt.sendKeys(Keys.SPACE);
		Thread.sleep(3000);
		triggersValueTxt.sendKeys("Vendor B");
		Thread.sleep(1500);
		triggersValueTxt.sendKeys(Keys.TAB);

		
		Thread.sleep(1500);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggerRaiseDoc));
		editLayoutTriggerRaiseDoc.click();
							
		getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(editLayoutTriggersAllVouchers));
		Select s=new Select(editLayoutTriggersAllVouchers);
		s.selectByVisibleText("Job orders");
		Thread.sleep(3000);
		
		
		getAction().moveToElement(trigger1stRow1stCol).build().perform();
		
		
		ClickUsingJs(trigger1stRow1stCol);
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggerSelectFieldDropdown));
	
		Thread.sleep(1000);
		Select s1=new Select(triggerSelectFieldDropdown);
		s1.selectByVisibleText("Discount");
		Thread.sleep(3000);
		triggerSelectFieldDropdown.sendKeys(Keys.TAB);
		
		
		ClickUsingJs(trigger1stRow2ndCol);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggerSelectMapDropdown));
		Select s2=new Select(triggerSelectMapDropdown);
		s2.selectByVisibleText("Discount");
		Thread.sleep(2000);
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggersSaveBtn));
		editLayoutTriggersSaveBtn.click();
		Thread.sleep(2000);
		
		String expSaveMessage = "Data saved successfully";
		String actSaveMessage = checkValidationMessage(expSaveMessage);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateBtn));
		updateBtn.click();
		
		
		String expUpdateMessage = "Data saved successfully";
		String actUpdateMessage = checkValidationMessage(expUpdateMessage);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
			
		if( actSaveMessage.equalsIgnoreCase(expSaveMessage))
		{
			System.out.println("Test Pass : Trigger  Added Successfully");
			
			return true;
		}
		else
		{
			System.out.println("Test Fail : Trigger NOT Added Successfully");
			
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
	
	
	
	
	
	
	
	
	
	public boolean checkSavingPurchaseVoucherVATVoucher1withDiscountasMapField() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersVat));
		purchaseVouchersVat.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		checkValidationMessage("Screen opened");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();

		vendorAccountTxt.sendKeys(Keys.SPACE);	

		ArrayList<String>  actVendorAccountList= new ArrayList<String>(); 

		int count=vendorAccountListCount.size();

		System.err.println(count);

		for(int i=0 ; i < count ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();

			if (data.equalsIgnoreCase("Vendor B")) 
			{
				vendorAccountListCount.get(i).click();
				break;
			}
		}

		vendorAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(3000);

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
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(placeOFSupplyTxt));
		placeOFSupplyTxt.click();
		placeOFSupplyTxt.clear();
		placeOFSupplyTxt.sendKeys("Abu Dhabi");
		Thread.sleep(2000);
		placeOFSupplyTxt.sendKeys(Keys.TAB);

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

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.click();
		enter_ItemTxt.sendKeys(Keys.SPACE);
		int pvvGridItemListCount=pvvGridItemList.size();
		for (int i = 0; i < pvvGridItemListCount; i++) 
		{
			String Item=pvvGridItemList.get(i).getText();
			if (Item.equalsIgnoreCase("BR COGS ITEM")) 
			{
				pvvGridItemList.get(i).click();
				break;
			}
		}
		enter_ItemTxt.sendKeys(Keys.TAB);	

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_TaxCode));
		enter_TaxCode.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PurchaseAccountTxt));
		enter_PurchaseAccountTxt.sendKeys(Keys.TAB);

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

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_13thColumn));
		select1stRow_13thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.clear();
		enter_Discount.sendKeys("10");
		enter_Discount.sendKeys(Keys.TAB);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
		select1stRow_14thColumn.click();

		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvVat));
		enter_PvVat.sendKeys(Keys.TAB);*/

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvTaxable));
		enter_PvTaxable.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Batch));
		enter_Batch.click();
		enter_Batch.sendKeys("PVATR1#V1");
		enter_Batch.sendKeys(Keys.TAB);

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		Calendar cal=Calendar.getInstance();
		SimpleDateFormat currentDate = new SimpleDateFormat("dd/MM/yyyy");
		cal.add(Calendar.DATE, 2); 

		String next2DaysDate=df.format(cal.getTime());

		System.out.println(">>>>>>>>>Expiry Date After Adding 2Days>>>>>>>> : "+next2DaysDate);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Expirydate));
		enter_Expirydate.click();
		enter_Expirydate.sendKeys(Keys.HOME);
		enter_Expirydate.sendKeys(next2DaysDate);
		enter_Expirydate.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		billRefNewReferenceTxt.click();
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
		pickBtn.click();
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Bill_OkBtn));
		Bill_OkBtn.click();
		
		Thread.sleep(2000);

				
		String expMessage1 = "Voucher saved successfully";
		
		String actMessage = checkValidationMessage(expMessage1);
		String expMessage2 = ": SU/IND/TEXT1";
		
		
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
	
	
	public static  ArrayList<String> checkNetValueofVoucher1inPurchaseVoucherVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(1000);
		getWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		documentNumberTxt.click();
		documentNumberTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
		documentNumberTxt.sendKeys("SU/IND/TEXT1");
		Thread.sleep(2000);
		documentNumberTxt.sendKeys(Keys.TAB);

		checkValidationMessage("Voucher loaded successfully");

		ArrayList<String> DiscNetArry = new ArrayList<String>();
		String actDiscount = select1stRow_13thColumn.getText();
		
		
		String actNetValue= voucherFooterNetValue.getText();
		
		DiscNetArry.add(actDiscount);
		DiscNetArry.add(actNetValue);
		
		
		return DiscNetArry;
		
	}
	
	
	
	
	
	
	
	@FindBy(xpath="//label[@id='id_transactionentry_footer_panel_summary_value_net']")
	public static WebElement voucherFooterNetValue;
	
	
	public boolean checkTriggerOptionsaftersavewithMapField() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		ArrayList<String> DiscNetArry = new ArrayList<String>();
		DiscNetArry=checkNetValueofVoucher1inPurchaseVoucherVAT();
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
		System.out.println("Setting buton is enabled");
		serachMenuTextHomePage.click();
		serachMenuTextHomePage.sendKeys("Job Order");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMenuTextClick));
		searchMenuTextClick.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		
		int voucherGridDocNoCount = voucherGridDocNo.size();

		for(int i=0;i<voucherGridDocNoCount;i++)
		{
			String data ="1";
			if(voucherGridDocNo.get(i).getText().equalsIgnoreCase(data))
			{
				voucherGridIndexChkBox.get(i).click();
				break;
			}
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editBtn));
		editBtn.click();
		Thread.sleep(2000);
		
		
		
		String actDiscountValue=select1stRow_6thColumn.getText();
		String expDiscountValue=DiscNetArry.get(0);
		
		String actNetValue=voucherFooterNetValue.getText();
		
		String expNetValue=DiscNetArry.get(1);
		
		System.out.println("Actual Discount    : "+actDiscountValue);
		System.out.println("Expected Discount  : "+expDiscountValue);
		
		System.out.println("Actual Net   : "+actNetValue);
		System.out.println("ExpectedNet  : "+expNetValue);
		
		
		
		if(actDiscountValue.equalsIgnoreCase(expDiscountValue)&&actNetValue.equalsIgnoreCase(expNetValue))
		{
			return true;
		}
		else
		{
			return false;
		}
					
	}
	
	@FindBy (xpath="//*[@id='6']/span")
    public static WebElement securityMenu;
	
	@FindBy(xpath="//span[contains(text(),'Create User')]")
	public static WebElement createUserMenu;
	
	@FindBy(xpath="//i[@class='icon-font6 icon-create-user']")
	public static WebElement createUserIcon;
	
	@FindBy(xpath="//input[@id='loginName']")
	public static WebElement createUserLoginNameTxt;
	
	@FindBy(xpath="//select[@id='ERPRoles']")
	public static WebElement createUserERPRoleDropDown;

	@FindBy(xpath="//select[@id='passwordPolicy']")
	public static WebElement createUserPasswordPolicyDropdown;

	@FindBy(xpath="//input[@id='password']")
	public static WebElement createUserPasswordTxt;

	@FindBy(xpath="//input[@id='confirmpassword']")
	public static WebElement createUserConfirmPasswordTxt;

	@FindBy(xpath="//input[@id='Username']")
	public static WebElement createUserNameTxt;

	@FindBy(xpath="//input[@id='lginAbbr']")
	public static WebElement createUserLoginAbbrivationTxt;

	@FindBy(xpath="//select[@id='SecurityQues']")
	public static WebElement createUserSecurityQuestionDropDown;

	@FindBy(xpath="//input[@id='SecurityAns']")
	public static WebElement createUserSecurityAnswerTxt;

	@FindBy(xpath="//select[@id='language']")
	public static WebElement createUserLanguageTxt;

	@FindBy(xpath="//select[@id='altLanguage']")
	public static WebElement createUserAlternateLanguageTxt;

	@FindBy(xpath="//i[@class='icon-unlock-user icon-font6']")
	public static WebElement createUserUnlockUserIcon;

	@FindBy(xpath="//i[@class='icon-move-user icon-font6']")
	public static WebElement createUserMoveUserIcon;

	@FindBy(xpath="//i[@class='icon-reset icon-font6']")
	public static WebElement createUserResetIcon;

	@FindBy(xpath="//span[@id='btnLoadFrom']")
	public static WebElement createUserLoadFromIcon;	
	
	@FindBy(xpath="//span[@id='btnSave']//i[@class='icon-save icon-font6']")
	public static WebElement createUserSaveIcon;

	@FindBy(xpath="//*[@id='CancelCreateUser']")
	public static WebElement createUserCloseIcon;
	
	@FindBy(xpath="//select[@id='ERPRoles']/option")
	public static List<WebElement> createUserERPRolesDropdownOptions;
	
	@FindBy(xpath="//select[@id='language']/option")
	 public static List<WebElement> createUserLanguageDropdownList;
	
	 @FindBy(xpath="//select[@id='language']")
	 public static WebElement getLanguage;

	 
	 @FindBy(xpath="//select[@id='altLanguage']")
	 public static WebElement getAltLanguage;

	 
	 @FindBy(xpath="//select[@id='altLanguage']/option")
	 public static List<WebElement> createUserAltLanguageDropdownList;

	 @FindBy(xpath="//select[@id='typeOfUser']")
		public static WebElement createUserUserTypeDrpDwn;
		
		@FindBy(xpath="//input[@id='emailId']")
		public static WebElement createUserEmailTxt;
		
		
		@FindBy(xpath="//span[contains(text(),'Additional Info')]")
		public static WebElement createUserAdditionalInfoTab;
		
	public static boolean checkCreateUserforTriggers() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getDriver().navigate().refresh();
		Thread.sleep(3000);
		
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		 homeMenu.click();
						
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
		 securityMenu.click();

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserMenu));
		 createUserMenu.click();
		
		 Thread.sleep(2000);
	    
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserIcon));
		 createUserIcon.click();
		 
		 Thread.sleep(10000);
		 
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginNameTxt));
		 createUserLoginNameTxt.click();
		 createUserLoginNameTxt.sendKeys("TriggerUser");

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserERPRoleDropDown));
		 createUserERPRoleDropDown.click();
		 createUserERPRoleDropDown.sendKeys("Role ST");
		 
	     int count = createUserERPRolesDropdownOptions.size()-1;
		 System.out.println("Count "+ count);
	    
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserPasswordTxt));
		 createUserPasswordTxt.sendKeys("12345");

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserConfirmPasswordTxt));
		 createUserConfirmPasswordTxt.sendKeys("12345");
		 	
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserNameTxt));
		 createUserNameTxt.sendKeys("UserCreation");
		 	
		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserLoginAbbrivationTxt));
		 createUserLoginAbbrivationTxt.sendKeys("UC");
		 
		 createUserSecurityQuestionDropDown.click();
		 Select s = new Select(createUserSecurityQuestionDropDown);
		 s.selectByVisibleText("In which county were you born?");

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSecurityAnswerTxt));	
		 createUserSecurityAnswerTxt.sendKeys("India");
		 	 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getLanguage));
			 getLanguage.click();
			 int counnt = createUserLanguageDropdownList.size()-1;
			 String actLanguageDropdownCount = Integer.toString(counnt);
			 String expLanguageDropdownCount = "2";
			 
			 Set LanguageDropdownList = new HashSet<String>();
			 
			 for (int i = 1; i < counnt; i++) 
			 {
				 String data = createUserLanguageDropdownList.get(i).getText();
				 LanguageDropdownList.add(data);
			 }
			 
			 String actLanguageDropdownList = LanguageDropdownList.toString();
			 String expLanguageDropdownList = "[English, Arabic]";
			 
			 System.out.println("LanguageDropdownCount  : "+actLanguageDropdownCount  +"  value expected  "+expLanguageDropdownCount);
			 System.out.println("LanguageDropdownList   : "+actLanguageDropdownList   +"  value expected  "+expLanguageDropdownList);
			 
			 getLanguage.sendKeys(Keys.TAB);
			 
			 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(getAltLanguage));
				 getAltLanguage.click();
				 int cont = createUserAltLanguageDropdownList.size()-1;
				 String actAltLanguageDropdownCount = Integer.toString(count);
				 String expAltLanguageDropdownCount ="2";
				 
				 Set AltLanguageDropdownList = new HashSet<String>();
				 
				 for (int i = 1; i < cont; i++) 
				 {
					 String data = createUserAltLanguageDropdownList.get(i).getText();
					 AltLanguageDropdownList.add(data);
				 }
				 
				 String actAltLanguageDropdownList = AltLanguageDropdownList.toString();
				 String expAltLanguageDropdownList = "[English, Arabic]";
				 
				 getAltLanguage.sendKeys(Keys.TAB);
				 
				 Thread.sleep(2000);
		 
				 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserAdditionalInfoTab));
				 createUserAdditionalInfoTab.click();

				 Thread.sleep(2000);
		 
			 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserUserTypeDrpDwn));
			 Select user = new Select(createUserUserTypeDrpDwn);
			 user.selectByVisibleText("Customer");
		 
		    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserEmailTxt));
			createUserEmailTxt.click();
			createUserEmailTxt.clear();
			createUserEmailTxt.sendKeys("emailvalidationone@gmail.com");

		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserSaveIcon));
		 createUserSaveIcon.click();
		 
		 String expMessage = "new user created successfully";
		 String actMessage = checkValidationMessage(expMessage);
		 
		 System.out.println(actMessage);
		 System.out.println(expMessage);
		 
		 
	     if (actMessage.equalsIgnoreCase(expMessage)) 
	     {
	    	 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCloseIcon));
	    	 createUserCloseIcon.click();
	    	 return true;
	 	 } 
	 	 else 
	 	 {
	 		 getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createUserCloseIcon));
	    	 createUserCloseIcon.click();
	    	 
			return false;
	 	 }
	}
	
	
	
	
	
	@FindBy(xpath="//input[@id='triggers_chksendAlert']")
	public static WebElement sendAlertChkBox;
	
	
	
	@FindBy(xpath="//*[@id='triggers_FieldsDiv']//div[3]/div[1]/button")
	public static WebElement cretaNewAlertButton;
	
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
	
	
	@FindBy(xpath="//select[@id='triggers_sendAlert']")
	private static WebElement selectSendAlert;
	
	
	
	public static boolean checkCreatingAlertinTriggersPurchaseVoucherVAT() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
		
		serachMenuTextHomePage.click();
		serachMenuTextHomePage.sendKeys("Configure Transactions");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMenuTextClick));
		searchMenuTextClick.click();	  
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentCustomization45Btn));
		documentCustomization45Btn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersVATBtn));
		purchaseVouchersVATBtn.click();
						 	    	
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toogleExpandBtn));
		toogleExpandBtn.click();
			  
		Thread.sleep(2000);
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggersBtn));
		triggersBtn.click();
			
		Thread.sleep(4000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggerName));
		editLayoutTriggerName.click();
		editLayoutTriggerName.sendKeys(Keys.SHIFT,Keys.HOME);
		Thread.sleep(1000);
		editLayoutTriggerName.sendKeys("Map Trigger");
		Thread.sleep(2000);
		editLayoutTriggerName.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendAlertChkBox));
		sendAlertChkBox.click();*/
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cretaNewAlertButton));
		cretaNewAlertButton.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newButtonInCreateTemplate));
		newButtonInCreateTemplate.click();
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailTemplates));
		emailTemplates.sendKeys("MapAlertTriggerTemplate");
		emailTemplates.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyNameTemplateArea));
		companyNameTemplateArea.click();
		Thread.sleep(1500);
		

		Runtime.getRuntime().exec(getBaseDir() + "\\autoIt\\scripts\\TriggerAlerts.exe");
		
		Thread.sleep(150000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInEmailTemplateHeader));
		saveBtnInEmailTemplateHeader.click();
		
		Thread.sleep(2000);
		System.err.println("Template save button clicked");
		
		String expEmailTemplateSaveMsg = "Template saved successfully";
		String actEmailTemplateSaveMsg =  checkValidationMessage(expEmailTemplateSaveMsg);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeButtonInCreateTemplate));
		closeButtonInCreateTemplate.click();
		Thread.sleep(2000);
		if(actEmailTemplateSaveMsg.equalsIgnoreCase(expEmailTemplateSaveMsg))
		{
			return true;
		}
		else
		{
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
  	
	
	
	
	
	public static boolean checkCreatedAlertandUserSelectinPurchaseVoucherVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
		System.out.println("Setting buton is enabled");
		serachMenuTextHomePage.click();
		serachMenuTextHomePage.sendKeys("Configure Transactions");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMenuTextClick));
		searchMenuTextClick.click();	  
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentCustomization45Btn));
		documentCustomization45Btn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersVATBtn));
		purchaseVouchersVATBtn.click();
						 	    	
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toogleExpandBtn));
		toogleExpandBtn.click();
			  
		Thread.sleep(2000);
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggersBtn));
		triggersBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggerName));
		editLayoutTriggerName.click();
		editLayoutTriggerName.sendKeys(Keys.SHIFT,Keys.HOME);
		Thread.sleep(1000);
		editLayoutTriggerName.sendKeys("Map Trigger");
		Thread.sleep(2000);
		editLayoutTriggerName.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendAlertChkBox));
		sendAlertChkBox.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectSendAlert));
		Select s=new Select(selectSendAlert);
		s.selectByVisibleText("MapAlertTriggerTemplate");
		Thread.sleep(2000);
		String actMsg=s.getFirstSelectedOption().getText();
		String expMsg="MapAlertTriggerTemplate";
		
		System.out.println("Actual Message: 	" 		+ actMsg);
		System.out.println("Expected Message:  	"	+expMsg);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loginChkBox));
		if(loginChkBox.isSelected()==false)
		{
			loginChkBox.click();
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectUsersList));
		Select s1=new Select(selectUsersList);
		s1.selectByVisibleText("UserAllOptionsST");
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggersSaveBtn));
		editLayoutTriggersSaveBtn.click();
		Thread.sleep(2000);
		
		String expSaveMessage = "Data saved successfully";
		String actSaveMessage = checkValidationMessage(expSaveMessage);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateBtn));
		updateBtn.click();
		
		
		String expUpdateMessage = "Data saved successfully";
		String actUpdateMessage = checkValidationMessage(expUpdateMessage);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		
		if(actMsg.equalsIgnoreCase(expMsg) && actSaveMessage.equalsIgnoreCase(expSaveMessage))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
	public static boolean checkSavingVoucher2inPVVATforAlerts() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		Thread.sleep(2000);
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersVat));
		purchaseVouchersVat.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		checkValidationMessage("Screen opened");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();

		vendorAccountTxt.sendKeys(Keys.SPACE);	

		ArrayList<String>  actVendorAccountList= new ArrayList<String>(); 

		int count=vendorAccountListCount.size();

		System.err.println(count);

		for(int i=0 ; i < count ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();

			if (data.equalsIgnoreCase("Vendor B")) 
			{
				vendorAccountListCount.get(i).click();
				break;
			}
		}

		vendorAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(3000);

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
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(placeOFSupplyTxt));
		placeOFSupplyTxt.click();
		placeOFSupplyTxt.clear();
		placeOFSupplyTxt.sendKeys("Abu Dhabi");
		Thread.sleep(2000);
		placeOFSupplyTxt.sendKeys(Keys.TAB);

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

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.click();
		enter_ItemTxt.sendKeys(Keys.SPACE);
		int pvvGridItemListCount=pvvGridItemList.size();
		for (int i = 0; i < pvvGridItemListCount; i++) 
		{
			String Item=pvvGridItemList.get(i).getText();
			if (Item.equalsIgnoreCase("BR COGS ITEM")) 
			{
				pvvGridItemList.get(i).click();
				break;
			}
		}
		enter_ItemTxt.sendKeys(Keys.TAB);	

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_TaxCode));
		enter_TaxCode.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PurchaseAccountTxt));
		enter_PurchaseAccountTxt.sendKeys(Keys.TAB);

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

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_13thColumn));
		select1stRow_13thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.clear();
		enter_Discount.sendKeys("10");
		enter_Discount.sendKeys(Keys.TAB);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
		select1stRow_14thColumn.click();

		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvVat));
		enter_PvVat.sendKeys(Keys.TAB);*/

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvTaxable));
		enter_PvTaxable.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Batch));
		enter_Batch.click();
		enter_Batch.sendKeys("PVATR1#V1");
		enter_Batch.sendKeys(Keys.TAB);

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		Calendar cal=Calendar.getInstance();
		SimpleDateFormat currentDate = new SimpleDateFormat("dd/MM/yyyy");
		cal.add(Calendar.DATE, 2); 

		String next2DaysDate=df.format(cal.getTime());

		System.out.println(">>>>>>>>>Expiry Date After Adding 2Days>>>>>>>> : "+next2DaysDate);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Expirydate));
		enter_Expirydate.click();
		enter_Expirydate.sendKeys(Keys.HOME);
		enter_Expirydate.sendKeys(next2DaysDate);
		enter_Expirydate.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		billRefNewReferenceTxt.click();
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
		pickBtn.click();
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Bill_OkBtn));
		Bill_OkBtn.click();
		
		Thread.sleep(2000);

				
		String expMessage1 = "Voucher saved successfully";
		
		String actMessage = checkValidationMessage(expMessage1);
		String expMessage2 = ": SU/IND/TEXT2";
		
		
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
	
	
	
		public boolean checkLogoutandLoginwithUserAllOptionsSTforAlertMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException 
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
	
		 @FindBy(xpath="//span[@id='noofalerts']")
		  private static WebElement noOfAlertsDisplay;

		  @FindBy(xpath="//li[@class='header']")
		  private static WebElement alertsMainHeader;

		  @FindBy(xpath="//ul[@id='alertsUL']/li[2]/ul/li/a")
			 private static List<WebElement> alertTransaction;
		
		  @FindBy(xpath="(//ul[@id='alertsUL']/li[2]/ul/li/ul/li/a)[1]")
			 private static List<WebElement> transactionAuthorization;
		  
		  
		  @FindBy(xpath="//ul[@id='alertsUL']/li[2]/ul/li/ul/li/ul/li/a/span")
			 private static List<WebElement> transactionAuthorizationText;
		  
		  @FindBy(xpath="(//ul[@id='alertsUL']/li[2]/ul/li/ul/li/a)[2]")
			 private static List<WebElement> transactionAuthorization2;
		  
		  
		  @FindBy(xpath="(//ul[@id='alertsUL']/li[2]/ul/li/ul/li/ul/li/a/span)[2]")
			 private static List<WebElement> transactionAuthorizationText2;
		  
		  
		
		public static boolean checkTriggerAlertMessageinUserAllOptionsST() throws InterruptedException
	{
		getWebDriverWait().until(ExpectedConditions.visibilityOf(noOfAlertsDisplay));
		noOfAlertsDisplay.click();
		
		// Actual
		String  actAlertsMainHeader=alertsMainHeader.getText();
		
		boolean actNoOfAlertsDisplay=alertsMainHeader.isDisplayed();
		boolean expNoOfAlertsDisplay=true;
		
		System.out.println("Alerts is display"+ actAlertsMainHeader);
		
		
		
		int count = alertTransaction.size();
		
		String alertTest=null;
		
		for(int i=0; i<count; i++)
		{
			String data = alertTransaction.get(i).getText();
			
			if(data.equalsIgnoreCase("  Transactions (1)"))
			{
				alertTransaction.get(i).click();
				Thread.sleep(2000);
				transactionAuthorization.get(i).click();
				Thread.sleep(2000);
				alertTest=transactionAuthorizationText.get(i).getText();
				
				
			}
		}
		
		
		String actAlertMsg=alertTest;
		String expAlertMsg="Automation Company : 08/10/2020 5:43 PMSUHYDERABADBR COGS ACC INV218.00NDT57:SU/IND/TEXT2Vendor B";
		
		System.out.println("Actual Alert Text: 		" 	+	alertTest);
		System.out.println("Expected Alert Text: 	" 	+	expAlertMsg);
		
		if(actNoOfAlertsDisplay==expNoOfAlertsDisplay && actAlertMsg.equalsIgnoreCase(expAlertMsg))
		{
		return true;
		}
		else
		{
			return false;
		}
	}
	
	
	
	@FindBy(xpath="//input[@id='triggers_chksendEmail']")
	public static WebElement sendEmailChkBox;
	
	
	
	@FindBy(xpath="//input[@id='Triggers_LayoutID']")
	public static WebElement sendEmailTxtBox;
	
	@FindBy(xpath="//*[@id='triggers_FieldsDiv']//div[3]/div[2]/button")
	public static WebElement createNewEmailButton;
	
	
	@FindBy(xpath="//i[@class='icon-font6 icon-new']")
	public static WebElement emailNewBtn;
	

	@FindBy(xpath="//*[@id='forHf']/span[1]//li/a[1]")
	public static WebElement emailNewLayoutBtn;
	
		
	@FindBy(xpath="//i[@class='icon-font6 icon-save']")
	public static WebElement emailSaveBtn;
	
	
	@FindBy(xpath="//*[@id='forHf']/span[3]//li/a[1]")
	public static WebElement emailSaveOptionBtn;
	
	@FindBy(xpath="//h4[@id='popup_title']")
	public static WebElement emailSavePopupTitle;
	
	@FindBy(xpath="//input[@id='id_PopuplayoutName']")
	public static WebElement emailSaveTxt;
	
	
	@FindBy(xpath="//*[@id='btn_PopUpOk']")
	public static WebElement emailSaveLayoutBtn;
	
	
	@FindBy(xpath="//*[@id='li_InvoicePreview']/a")
	public static WebElement emailLayoutPreviewBtn;
	
	
	@FindBy(xpath="(//i[@class='icon-font6 icon-close'])[1]")
	public static WebElement emailLayoutExitBtn;
	
	@FindBy(xpath="//input[@id='triggers_chksendSMS']")
	public static WebElement sendSMSChkBox;
	
	@FindBy(xpath="//*[@id='triggers_FieldsDiv']//div[3]/div[3]/button")
	public static WebElement createNewSMSBtn;
	
	
	//input[@id='triggers_chksendTypeLogin']
	
	@FindBy(xpath="//input[@id='triggers_chksendTypeLogin']")
	public static WebElement loginChkBox;
	
	@FindBy(xpath="//input[@id='triggers_chksendTypeCustomeVendor']")
	public static WebElement customerChkBox;
	
	@FindBy(xpath="//select[@id='triggers_sendTypeloginUsers']")
	public static WebElement selectUsersList;
	
	
	
	
	public static boolean checkEmailTemplateCreationinPurchaseVoucherVATTriggers() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
		System.out.println("Setting buton is enabled");
		serachMenuTextHomePage.click();
		serachMenuTextHomePage.sendKeys("Configure Transactions");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMenuTextClick));
		searchMenuTextClick.click();	  
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentCustomization45Btn));
		documentCustomization45Btn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersVATBtn));
		purchaseVouchersVATBtn.click();
						 	    	
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toogleExpandBtn));
		toogleExpandBtn.click();
			  
		Thread.sleep(2000);
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggersBtn));
		triggersBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggerName));
		editLayoutTriggerName.click();
		editLayoutTriggerName.sendKeys(Keys.SHIFT,Keys.HOME);
		Thread.sleep(1000);
		editLayoutTriggerName.sendKeys("Map Trigger");
		Thread.sleep(2000);
		editLayoutTriggerName.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailChkBox));
		sendEmailChkBox.click();
		Thread.sleep(2000);
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createNewEmailButton));
		createNewEmailButton.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailNewBtn));
		emailNewBtn.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailNewLayoutBtn));
		emailNewLayoutBtn.click();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec(getBaseDir() + "\\autoIt\\scripts\\EmailTriggerLayout.exe");
		
		Thread.sleep(75000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailSaveBtn));
		emailSaveBtn.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailSaveOptionBtn));
		emailSaveOptionBtn.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailSavePopupTitle));
		boolean actTitleDisplay=emailSavePopupTitle.isDisplayed();
		boolean expTitleDisplay=true;
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailSaveTxt));
		emailSaveTxt.click();
		emailSaveTxt.sendKeys("TriggersEmailLayout");
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailSaveLayoutBtn));
		emailSaveLayoutBtn.click();
		Thread.sleep(2000);
		String expSaveLayotMsg="Layout saved successfully";
		String actSaveLayoutMsg=checkValidationMessage(expSaveLayotMsg);
		
		
		System.out.println("Actual Message: 	"	+actSaveLayoutMsg);
		System.out.println("Expected Message:	"	+expSaveLayotMsg);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailLayoutPreviewBtn));
		emailLayoutPreviewBtn.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailLayoutExitBtn));
		emailLayoutExitBtn.click();
		Thread.sleep(2000);
		
		if(actTitleDisplay==expTitleDisplay && actSaveLayoutMsg.equalsIgnoreCase(expSaveLayotMsg))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
	public static boolean checkCreatedEmailTemplateinPVVATView() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
		System.out.println("Setting buton is enabled");
		serachMenuTextHomePage.click();
		serachMenuTextHomePage.sendKeys("Configure Transactions");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMenuTextClick));
		searchMenuTextClick.click();	  
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentCustomization45Btn));
		documentCustomization45Btn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersVATBtn));
		purchaseVouchersVATBtn.click();
						 	    	
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toogleExpandBtn));
		toogleExpandBtn.click();
			  
		Thread.sleep(2000);
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggersBtn));
		triggersBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggerName));
		editLayoutTriggerName.click();
		editLayoutTriggerName.sendKeys(Keys.SHIFT,Keys.HOME);
		Thread.sleep(1000);
		editLayoutTriggerName.sendKeys("Map Trigger");
		Thread.sleep(2000);
		editLayoutTriggerName.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendAlertChkBox));
		if(sendAlertChkBox.isSelected()==true)
		{
			sendAlertChkBox.click();
		}
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailChkBox));
		if(sendEmailChkBox.isSelected()==false)
		{
		sendEmailChkBox.click();
		}
		Thread.sleep(2000);
		
		
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailTxtBox));
		sendEmailTxtBox.click();
		sendEmailTxtBox.sendKeys(Keys.HOME,Keys.SHIFT,Keys.END);
		sendEmailTxtBox.sendKeys("TriggersEmailLayout");
		Thread.sleep(3000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loginChkBox));
		if(loginChkBox.isSelected()==false)
		{
			loginChkBox.click();
		}
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectUsersList));
		Select s1=new Select(selectUsersList);
		s1.selectByVisibleText("TriggerUser");
		Thread.sleep(2000);
		/*s1.selectByVisibleText("UserAllOptionsST");
		Thread.sleep(2000);*/
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggersSaveBtn));
		editLayoutTriggersSaveBtn.click();
		Thread.sleep(2000);
		
		String expSaveMessage = "Data saved successfully";
		String actSaveMessage = checkValidationMessage(expSaveMessage);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateBtn));
		updateBtn.click();
		
		
		String expUpdateMessage = "Data saved successfully";
		String actUpdateMessage = checkValidationMessage(expUpdateMessage);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		
		if(actSaveMessage.equalsIgnoreCase(expSaveMessage))
		{
			return true;
		}
		else
		{
			return false;
		}
	
		
	}
	
	
	@FindBy(xpath="//select[@id='triggers_sendSMS']")
	public static WebElement selectSMSTemplateAlert;
	
	
	
	public static boolean checkCreatingSMSTemplateforTriggersinPVVATVoucher() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
	{
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
		System.out.println("Setting buton is enabled");
		serachMenuTextHomePage.click();
		serachMenuTextHomePage.sendKeys("Configure Transactions");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMenuTextClick));
		searchMenuTextClick.click();	  
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentCustomization45Btn));
		documentCustomization45Btn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersVATBtn));
		purchaseVouchersVATBtn.click();
						 	    	
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toogleExpandBtn));
		toogleExpandBtn.click();
			  
		Thread.sleep(2000);
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggersBtn));
		triggersBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggerName));
		editLayoutTriggerName.click();
		editLayoutTriggerName.sendKeys(Keys.SHIFT,Keys.HOME);
		Thread.sleep(1000);
		editLayoutTriggerName.sendKeys("Map Trigger");
		Thread.sleep(2000);
		editLayoutTriggerName.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendSMSChkBox));
		sendSMSChkBox.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createNewSMSBtn));
		createNewSMSBtn.click();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newButtonInCreateTemplate));
		newButtonInCreateTemplate.click();
		Thread.sleep(1500);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailTemplates));
		emailTemplates.sendKeys("MapSMSTriggerTemplate");
		emailTemplates.sendKeys(Keys.TAB);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyNameTemplateArea));
		companyNameTemplateArea.click();
		Thread.sleep(1500);
		

		Runtime.getRuntime().exec(getBaseDir() + "\\autoIt\\scripts\\TriggerAlerts.exe");
		
		Thread.sleep(150000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInEmailTemplateHeader));
		saveBtnInEmailTemplateHeader.click();
		
		Thread.sleep(2000);
		System.err.println("Template save button clicked");
		
		String expEmailTemplateSaveMsg = "Template saved successfully";
		String actEmailTemplateSaveMsg =  checkValidationMessage(expEmailTemplateSaveMsg);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeButtonInCreateTemplate));
		closeButtonInCreateTemplate.click();
		Thread.sleep(2000);
		if(actEmailTemplateSaveMsg.equalsIgnoreCase(expEmailTemplateSaveMsg))
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	
	
	public boolean checkCreatedSMSAlertinPurchaseVoucherVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(2000);
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
		System.out.println("Setting buton is enabled");
		serachMenuTextHomePage.click();
		serachMenuTextHomePage.sendKeys("Configure Transactions");
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMenuTextClick));
		searchMenuTextClick.click();	  
		
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentCustomization45Btn));
		documentCustomization45Btn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersVATBtn));
		purchaseVouchersVATBtn.click();
						 	    	
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toogleExpandBtn));
		toogleExpandBtn.click();
			  
		Thread.sleep(2000);
	    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggersBtn));
		triggersBtn.click();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggerName));
		editLayoutTriggerName.click();
		editLayoutTriggerName.sendKeys(Keys.SHIFT,Keys.HOME);
		Thread.sleep(1000);
		editLayoutTriggerName.sendKeys("Map Trigger");
		Thread.sleep(2000);
		editLayoutTriggerName.sendKeys(Keys.TAB);
		Thread.sleep(5000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendAlertChkBox));
		if(sendAlertChkBox.isSelected()==true)
		{
			sendAlertChkBox.click();
		}
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailChkBox));
		if(sendEmailChkBox.isSelected()==true)
		{
		sendEmailChkBox.click();
		}
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendSMSChkBox));
		sendSMSChkBox.click();
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectSMSTemplateAlert));
		Select s=new Select(selectSMSTemplateAlert);
		s.selectByVisibleText("MapSMSTriggerTemplate");
		Thread.sleep(2000);
		String actMsg=s.getFirstSelectedOption().getText();
		String expMsg="MapSMSTriggerTemplate";
		
		System.out.println("Actual Message: 	" 		+ actMsg);
		System.out.println("Expected Message:  	"	+expMsg);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggersSaveBtn));
		editLayoutTriggersSaveBtn.click();
		Thread.sleep(2000);
		
		String expSaveMessage = "Data saved successfully";
		String actSaveMessage = checkValidationMessage(expSaveMessage);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateBtn));
		updateBtn.click();
		
		
		String expUpdateMessage = "Data saved successfully";
		String actUpdateMessage = checkValidationMessage(expUpdateMessage);
			
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
		closeBtn.click();
		
		
		
		
		if(actMsg.equalsIgnoreCase(expMsg))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
	public static boolean checkSavingVoucher3inPVVATforEmailValidation() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{

		Thread.sleep(2000);
		getDriver().navigate().refresh();
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
		financialsMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
		financialsTransactionMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
		financialsTransactionsPurchaseMenu.click();

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersVat));
		purchaseVouchersVat.click();

		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
		newBtn.click();

		checkValidationMessage("Screen opened");

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
		vendorAccountTxt.click();

		vendorAccountTxt.sendKeys(Keys.SPACE);	

		ArrayList<String>  actVendorAccountList= new ArrayList<String>(); 

		int count=vendorAccountListCount.size();

		System.err.println(count);

		for(int i=0 ; i < count ;i++)
		{
			String data=vendorAccountListCount.get(i).getText();

			if (data.equalsIgnoreCase("Vendor B")) 
			{
				vendorAccountListCount.get(i).click();
				break;
			}
		}

		vendorAccountTxt.sendKeys(Keys.TAB);
		
		Thread.sleep(3000);

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
		

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(placeOFSupplyTxt));
		placeOFSupplyTxt.click();
		placeOFSupplyTxt.clear();
		placeOFSupplyTxt.sendKeys("Abu Dhabi");
		Thread.sleep(2000);
		placeOFSupplyTxt.sendKeys(Keys.TAB);

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

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
		enter_ItemTxt.click();
		enter_ItemTxt.sendKeys(Keys.SPACE);
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

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_TaxCode));
		enter_TaxCode.sendKeys(Keys.TAB);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PurchaseAccountTxt));
		enter_PurchaseAccountTxt.sendKeys(Keys.TAB);

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

		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_13thColumn));
		select1stRow_13thColumn.click();
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
		enter_Discount.click();
		enter_Discount.clear();
		enter_Discount.sendKeys("10");
		enter_Discount.sendKeys(Keys.TAB);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
		select1stRow_14thColumn.click();

		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvVat));
		enter_PvVat.sendKeys(Keys.TAB);*/

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvTaxable));
		enter_PvTaxable.sendKeys(Keys.TAB);
		
		Thread.sleep(2000);
		
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Batch));
		enter_Batch.click();
		enter_Batch.sendKeys("PVATR1#V1");
		enter_Batch.sendKeys(Keys.TAB);

		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

		Calendar cal=Calendar.getInstance();
		SimpleDateFormat currentDate = new SimpleDateFormat("dd/MM/yyyy");
		cal.add(Calendar.DATE, 2); 

		String next2DaysDate=df.format(cal.getTime());

		System.out.println(">>>>>>>>>Expiry Date After Adding 2Days>>>>>>>> : "+next2DaysDate);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Expirydate));
		enter_Expirydate.click();
		enter_Expirydate.sendKeys(Keys.HOME);
		enter_Expirydate.sendKeys(next2DaysDate);
		enter_Expirydate.sendKeys(Keys.TAB);

		Thread.sleep(2000);

		*/

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
		voucherSaveBtn.click();
		
		Thread.sleep(2000);
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
		billRefNewReferenceTxt.click();
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
		pickBtn.click();
		
		Thread.sleep(2000);

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Bill_OkBtn));
		Bill_OkBtn.click();
		
		Thread.sleep(2000);

				
		String expMessage1 = "Voucher saved successfully";
		
		String actMessage = checkValidationMessage(expMessage1);
		String expMessage2 = ": SU/IND/TEXT3";
		
		
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
	
	
	   @FindBy(xpath="//span[contains(text(),'Next')]")
		private static WebElement  NextBtn;
	
	   @FindBy(xpath="//table[@id=':22']/tbody/tr/td[4]/div[2]/span[1]/span")
	    private static List<WebElement> row1mailFromList;
	
	@FindBy(xpath="//input[@name='Passwd']")
	private static WebElement  PasswordTxt;

	@FindBy(xpath="//div[@id=':2i']")
	private static WebElement  row1;

	@FindBy(xpath="//input[@id='HeaderChkBox']")
	private static WebElement voucherHomeHeaderCheckbox;

	/*@FindBy(xpath="//span[contains(text(),'Next')]")
	private static WebElement NextBtn;
*/

	@FindBy(xpath="//*[@id='yDmH0d']/div[5]/div/div[2]/div[3]/div[1]/span/span")
	private static WebElement yesRemoveBtn;

/*	@FindBy(xpath="//table[@id=':23']/tbody/tr/td[5]/div[1]/div/div/span/span")
	private static List<WebElement> row1mailFromList;

		@FindBy(xpath="//input[@id='identifierId']")
	private static WebElement  userNameTxt;
*/


		//@FindBy(xpath="//div[text()='Attachments area']/parent::div/div[4]//span/div/div[1]")
	@FindBy(xpath="(//*[@data-tooltip='Download'])[1]")
		private static WebElement mailAttachmentDownloadBtn;
	    

		
	/*@FindBy(xpath="//*[@id=':4']/div[2]/div[1]/div/div[2]/div[3]")
	private static WebElement mailDeleteButton;
*/
	@FindBy(xpath="//*[@id=':4']/div[2]/div[1]/div/div[1]/div/div")
	private static WebElement backToIndexBtn;



	/*@FindBy(xpath="//*[@id='gb']/div[2]/div[3]/div[1]/div[2]/div/a/img")
	private static WebElement gmailUserBtn;

	@FindBy(xpath="//div[@id='yDmH0d']//*[text()='Sign out']")
	private static WebElement gmailSignOutBtn;
*/
	@FindBy(xpath="(//*[@id='gb']//iframe)[2]")
	private static WebElement SignOutFrame;




	@FindBy(xpath="//*[contains(text(),'Remove an account')]")
	private static WebElement removeAccountBtn;

	@FindBy(xpath="//body/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/div[1]/div[2]/*[1]")
	private static WebElement removeDeleteBtn;


	/*@FindBy(xpath="//*[@id='yDmH0d']/div[5]/div/div[2]/div[3]/div[1]/span/span")
	private static WebElement yesRemoveBtn;
	*/

	@FindBy(xpath="//*[@id=':2d']")
	private static WebElement emailBody;

	@FindBy(xpath="//tbody/tr/td[5]/div[1]/div/div/span/span")
	private static List<WebElement> emailSubjectList;

	@FindBy(xpath="//tbody/tr[1]//td[5]//div[1]/div/div")
	private static WebElement emailRow1Subject;

	@FindBy(xpath="//*[@id=':22']/div[1]/span")
	private static WebElement selectAllMailsChckbx;

	@FindBy(xpath="//*[@id=':4']/div/div[1]/div[1]/div/div/div[2]/div[3]")
	private static WebElement selectAllMailsDltBtn;

	//Email

	@FindBy(xpath="//*[@id='tomailId']")
	public static WebElement ToAddressInMail;

	@FindBy(xpath="//*[@id='subjectMail']")
	public static WebElement subjectInMail;


	@FindBy(xpath="//*[@id='emailSettings']//button[2]")
	public static WebElement okBtnInEmailOptions;



	@FindBy(xpath="//*[@id='attachpdf']")
	public static WebElement attachPDFChkBox;

	//Template header

	@FindBy(xpath="//*[@id='btnEmailheaer']")
	public static WebElement emailTemplateHeaderInEmailOptions;

	@FindBy(xpath="//*[@id='smsTemplateOptCtrl']")
	public static WebElement templateName;

	@FindBy(xpath="//*[@id='btnSaveSmsTemplate']")
	public static WebElement templateSaveBtn;


	@FindBy(xpath="//*[@id='btnCloseSMSModal']")
	public static WebElement templateCloseBtn;


	@FindBy(xpath="//input[@id='identifierId']")
	private static WebElement  userNameTxt;
	
	
	
	  @FindBy(xpath="//*[@id=':4']/div[2]/div[1]/div/div[2]/div[3]")
	    private static WebElement mailDeleteButton;
	    
	    @FindBy(xpath="//*[@id='gb']/div[2]/div[3]/div[1]/div[2]/div/a/img")
	    private static WebElement gmailUserBtn;
	
	
	    @FindBy(xpath="//div[@id='yDmH0d']//*[text()='Sign out']")
	    private static WebElement gmailSignOutBtn;
	
	
	
	
	
	
public static boolean checkEmailValidationUserforCreatedTriggerTemplate() throws InterruptedException, AWTException, IOException
{
	
	File Efile1=new File(getBaseDir()+"\\autoIt\\ExportFiles\\TriggersEmail.pdf");
	
	if(Efile1.exists())
	{
		Efile1.delete();
	}
	
		Robot robot = new Robot();   
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
		Thread.sleep(4000);
		
		ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());

	 	System.out.println("openTabs"+openTabs);

	 	getDriver().switchTo().window(openTabs.get(0));
	 	
	 	getDriver().switchTo().window(openTabs.get(1));
		
	
	 	getDriver().get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	 	
	 	Thread.sleep(2000);
	 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameTxt));
	 	userNameTxt.click();
	 	
	 	userNameTxt.sendKeys("emailvalidationone@gmail.com");
	 	
	 	Thread.sleep(2000);
	 	
	 	System.out.println("User enter text");
	 	
	 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(NextBtn));
	 	NextBtn.click();
	 	
	 	Thread.sleep(2000);
	 	
	 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PasswordTxt));
	 	PasswordTxt.click();
	 	
	 	PasswordTxt.sendKeys("validationone");
	 	
	 	Thread.sleep(2000);
	 	
	 	NextBtn.click();
	 	
	 	Thread.sleep(8000);

	 	int count1 = row1mailFromList.size();
	 	System.out.println("No.of mails in the list"+count1);
	 	
	 	System.err.println("Email Body *"+emailBody.getText()+"*");
	 	
	 	if (emailBody.getText().isEmpty()==false) 
	 	{
	 		int count = emailSubjectList.size();
	 		System.err.println("No.of mails in the list"+count);
		 	
		 	for (int i = 0; i < count; i++) 
	 	{
	 		String mailFromTxt = emailSubjectList.get(i).getText();
	 		
	 		if (mailFromTxt.equalsIgnoreCase("Focus 8 Transaction")) 
	 		{
	 			emailSubjectList.get(i).click();
	 			break;
			}
		}
		 	
		 	
		 	Thread.sleep(3000);
 	
 	Thread.sleep(3000);
 	
 	getAction().moveToElement(mailAttachmentDownloadBtn).build().perform();
 	
 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mailAttachmentDownloadBtn));
 	mailAttachmentDownloadBtn.click();
 	
 	Thread.sleep(3000);
 	
 	 
 	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_J);
	robot.keyRelease(KeyEvent.VK_J);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	
	
	Thread.sleep(5000);
	
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(3000);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_S);
	robot.keyRelease(KeyEvent.VK_S);
	robot.keyRelease(KeyEvent.VK_CONTROL);
 	
	Thread.sleep(2000);
	
			
			Runtime.getRuntime().exec(getBaseDir() + "\\autoIt\\scripts\\TriggersEmail.exe");
			
			Thread.sleep(4000);
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_J);
			robot.keyRelease(KeyEvent.VK_J);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
			Thread.sleep(2000);
			
			ArrayList<String> newTabs = new ArrayList<String>(getDriver().getWindowHandles());
				
			int actOpenWindowsCount = getDriver().getWindowHandles().size();
			int expOpenWindowsCount = 4;
			
			System.out.println("Number of Windows  : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
			
			getDriver().switchTo().window(newTabs.get(3)).close();
		 	Thread.sleep(1000);
		 	getDriver().switchTo().window(newTabs.get(2)).close();
		 	Thread.sleep(1000);
		 	getDriver().switchTo().window(newTabs.get(1));
		 	Thread.sleep(1000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mailDeleteButton));
		 	mailDeleteButton.click();
		 	
		 	Thread.sleep(2000);
		 	

		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gmailUserBtn));
		 	gmailUserBtn.click();
		 	
		 	Thread.sleep(3000);
		 	getDriver().switchTo().frame(SignOutFrame);
			Thread.sleep(1000);
		 	getAction().moveToElement(gmailSignOutBtn).click().build().perform();
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(removeAccountBtn));
		 	removeAccountBtn.click();
		 	
		 	Thread.sleep(1000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(removeDeleteBtn));
		 	removeDeleteBtn.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(yesRemoveBtn));
		 	yesRemoveBtn.click();
		 	
		 	Thread.sleep(2000);
		 	
				 
		 	getDriver().switchTo().window(newTabs.get(1)).close();
		 	Thread.sleep(2000);
		 	getDriver().switchTo().window(newTabs.get(0));
		 	Thread.sleep(2000);
		 
		 	
		 	String actAccount1PDF = getBaseDir()+"\\autoIt\\ExportFiles\\TriggersEmail.pdf";
			String expAccount1PDF = getBaseDir()+"\\autoIt\\ImportFiles\\TriggersEmail.pdf";
			
			PDFUtil pdfutil = new PDFUtil();
			
			
			
			boolean result = pdfutil.compare(actAccount1PDF, expAccount1PDF);
			Calendar cal=Calendar.getInstance();
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			String currentDate = df.format(cal.getTime());
			
			String actAccount1Data = pdfutil.getText(actAccount1PDF);
			String expAccount1Data = pdfutil.getText(expAccount1PDF).replaceAll("26/12/2022", currentDate);
					
			System.err.println(actAccount1Data);
			System.err.println(expAccount1Data);
			
		
		 	
			
			if (actAccount1Data.equalsIgnoreCase(expAccount1Data)) 
			{
			
				System.err.println("PDF file is as Expected");
				return true;
			}
			else
			{
									
				System.err.println("PDF file is not as Expected");
				return false;
			}
			
			
		} 
		 	else 
		{	
		 		
		 		
		 		System.err.println("Subject : "+emailRow1Subject.getText());
		 		
		 		Thread.sleep(2000);
		 		
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllMailsChckbx));
		 		selectAllMailsChckbx.click();
		 		
		 		Thread.sleep(2000);
		 	
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllMailsDltBtn));
		 		selectAllMailsDltBtn.click();
		 		
		 		Thread.sleep(4000);

		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gmailUserBtn));
		 	gmailUserBtn.click();
		 	
		 	Thread.sleep(3000);
		 getDriver().switchTo().frame(SignOutFrame);
			Thread.sleep(1000);
		 	getAction().moveToElement(gmailSignOutBtn).click().build().perform();
		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(removeAccountBtn));
		 	removeAccountBtn.click();
		 	
		 	Thread.sleep(1000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(removeDeleteBtn));
		 	removeDeleteBtn.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(yesRemoveBtn));
		 	yesRemoveBtn.click();
		 	
		 	Thread.sleep(2000);
		 		return false;
		}
	 	
	}

@FindBy(xpath="//*[@id='divBtnGroup2']/div/a")
public static WebElement detailsTab;


@FindBy(xpath="//*[@id='sEMail']")
public static WebElement emailTxt;

@FindBy(xpath="(//*[@id='btnMasterSaveClick']/i)[2]")
public static WebElement saveBtn;



public static boolean checkSavingPurchaseVoucherVATforVendorEmail() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
{
	Thread.sleep(2000);
	getDriver().navigate().refresh();
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsMenu));
	financialsMenu.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionMenu));
	financialsTransactionMenu.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(financialsTransactionsPurchaseMenu));
	financialsTransactionsPurchaseMenu.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersVat));
	purchaseVouchersVat.click();

	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
	newBtn.click();

	checkValidationMessage("Screen opened");

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
	vendorAccountTxt.click();

	vendorAccountTxt.sendKeys(Keys.SPACE);	

	ArrayList<String>  actVendorAccountList= new ArrayList<String>(); 

	int count=vendorAccountListCount.size();

	System.err.println(count);

	for(int i=0 ; i < count ;i++)
	{
		String data=vendorAccountListCount.get(i).getText();

		if (data.equalsIgnoreCase("Vendor B")) 
		{
			vendorAccountListCount.get(i).click();
			break;
		}
	}
	
	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorAccountTxt));
	vendorAccountTxt.click();
	Thread.sleep(2000);
	
	Robot robot = new Robot();   
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_E);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_E);
	
	vendorAccountTxt.sendKeys(Keys.TAB);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(detailsTab));
	detailsTab.click();
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailTxt));
	emailTxt.sendKeys("emailvalidationone@gmail.com");
	emailTxt.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	saveBtn.click();
	Thread.sleep(2000);
	
	vendorAccountTxt.sendKeys(Keys.TAB);
	
	Thread.sleep(3000);

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
	

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(placeOFSupplyTxt));
	placeOFSupplyTxt.click();
	placeOFSupplyTxt.clear();
	placeOFSupplyTxt.sendKeys("Abu Dhabi");
	Thread.sleep(2000);
	placeOFSupplyTxt.sendKeys(Keys.TAB);

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

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	enter_ItemTxt.click();
	enter_ItemTxt.sendKeys(Keys.SPACE);
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

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_TaxCode));
	enter_TaxCode.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PurchaseAccountTxt));
	enter_PurchaseAccountTxt.sendKeys(Keys.TAB);

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

	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_13thColumn));
	select1stRow_13thColumn.click();
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Discount));
	enter_Discount.click();
	enter_Discount.clear();
	enter_Discount.sendKeys("10");
	enter_Discount.sendKeys(Keys.TAB);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
	select1stRow_14thColumn.click();

	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvVat));
	enter_PvVat.sendKeys(Keys.TAB);*/

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_PvTaxable));
	enter_PvTaxable.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	
	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Batch));
	enter_Batch.click();
	enter_Batch.sendKeys("PVATR1#V1");
	enter_Batch.sendKeys(Keys.TAB);

	DateFormat df = new SimpleDateFormat("dd/MM/yyyy");

	Calendar cal=Calendar.getInstance();
	SimpleDateFormat currentDate = new SimpleDateFormat("dd/MM/yyyy");
	cal.add(Calendar.DATE, 2); 

	String next2DaysDate=df.format(cal.getTime());

	System.out.println(">>>>>>>>>Expiry Date After Adding 2Days>>>>>>>> : "+next2DaysDate);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Expirydate));
	enter_Expirydate.click();
	enter_Expirydate.sendKeys(Keys.HOME);
	enter_Expirydate.sendKeys(next2DaysDate);
	enter_Expirydate.sendKeys(Keys.TAB);

	Thread.sleep(2000);

	*/

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
	voucherSaveBtn.click();
	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
	billRefNewReferenceTxt.click();
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
	pickBtn.click();
	
	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Bill_OkBtn));
	Bill_OkBtn.click();
	
	Thread.sleep(2000);

			
	String expMessage1 = "Voucher saved successfully";
	
	String actMessage = checkValidationMessage(expMessage1);
	String expMessage2 = ": SU/IND/TEXT4";
	
	
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


public static boolean checkCreateEmailTemplateforVendor() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{

	Thread.sleep(2000);
	getDriver().navigate().refresh();
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
	System.out.println("Setting buton is enabled");
	serachMenuTextHomePage.click();
	serachMenuTextHomePage.sendKeys("Configure Transactions");
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMenuTextClick));
	searchMenuTextClick.click();	  
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentCustomization45Btn));
	documentCustomization45Btn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseVouchersVATBtn));
	purchaseVouchersVATBtn.click();
					 	    	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toogleExpandBtn));
	toogleExpandBtn.click();
		  
	Thread.sleep(2000);
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggersBtn));
	triggersBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggerName));
	editLayoutTriggerName.click();
	editLayoutTriggerName.sendKeys(Keys.SHIFT,Keys.HOME);
	Thread.sleep(1000);
	editLayoutTriggerName.sendKeys("Map Trigger");
	Thread.sleep(2000);
	editLayoutTriggerName.sendKeys(Keys.TAB);
	Thread.sleep(5000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailChkBox));
	if(sendEmailChkBox.isSelected()==false)
	{
	sendEmailChkBox.click();
	}
	Thread.sleep(2000);
	
	
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailTxtBox));
	sendEmailTxtBox.click();
	sendEmailTxtBox.sendKeys(Keys.HOME,Keys.SHIFT,Keys.END);
	sendEmailTxtBox.sendKeys("TriggersEmailLayout");
	Thread.sleep(3000);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerChkBox));
	if(customerChkBox.isSelected()==false)
	{
		customerChkBox.click();
	}
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggersSaveBtn));
	editLayoutTriggersSaveBtn.click();
	Thread.sleep(2000);
	
	String expSaveMessage = "Data saved successfully";
	String actSaveMessage = checkValidationMessage(expSaveMessage);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateBtn));
	updateBtn.click();
	
	
	String expUpdateMessage = "Data saved successfully";
	String actUpdateMessage = checkValidationMessage(expUpdateMessage);
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
	closeBtn.click();
	
	
	if( actSaveMessage.equalsIgnoreCase(expSaveMessage))
	{
		return true;
	}
	else
	{
		return false;
	}



}
	


@FindBy(xpath="//div[@id='trigger_Controlbuttons']/span[1]")
private static WebElement  editLayoutTriggerDeleteBtn;



public void checkDeletingTriggerInPurchaseVoucherVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggerName));
	editLayoutTriggerName.click();
	editLayoutTriggerName.sendKeys(Keys.HOME,Keys.SHIFT,Keys.END);;
	editLayoutTriggerName.sendKeys("Test Trigger");
	Thread.sleep(3000);
	editLayoutTriggerName.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggersSuspendedChkboxs));
	boolean acttriggersSuspendedChkboxs = triggersSuspendedChkboxs.isSelected();
	boolean exptriggersSuspendedChkboxs = true;
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggerDeleteBtn));
	editLayoutTriggerDeleteBtn.click();
	
	if (getIsAlertPresent())
	{
		getWaitForAlert();
		
		getAlert().accept();
	}
	else
	{
		editLayoutTriggerDeleteBtn.click();
		
		getWaitForAlert();
		
		getAlert().accept();
	}
	
		
}


@FindBy(xpath="(//a[@id='3333'])[2]")
public static WebElement salesInvoiceVATBtn;

	
@FindBy (xpath="//table[@id='editScreen_bodyTable']/tbody/tr[7]/td/span[2]")
private static WebElement editScreenBodyRow7Delete;

@FindBy(xpath="//i[@class='icon-pick icon-font5']")
private static WebElement batchPickOnFIFOIcon;

@FindBy(xpath="//label[@id='div_Ok']")
private static WebElement batchOkIcon;




public boolean checkDeleteVATFieldinEditScreenofSalesInvoiceVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
	System.out.println("Setting buton is enabled");
	serachMenuTextHomePage.click();
	serachMenuTextHomePage.sendKeys("Configure Transactions");
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMenuTextClick));
	searchMenuTextClick.click();	  
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentCustomization45Btn));
	documentCustomization45Btn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATBtn));
	salesInvoiceVATBtn.click();
					 	    	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editScreenTab));
	editScreenTab.click();
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editScreenBodyTab));
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editScreenBodyRow7Delete));
	editScreenBodyRow7Delete.click();
	
	getWaitForAlert();
	Thread.sleep(2000);
	getAlert().accept();
	
	System.out.println("*******************************************checkDeleteFieldInEditScreenBodyInTrialPurchaseUpdate*******************************************");
		
	String expMessage = "Data deleted successfully";
	String actMessage = checkValidationMessage(expMessage);
	if(actMessage.equalsIgnoreCase(expMessage) )
	{	
		return  true;
	}
	else
	{
		return  false;
	}
	
		
}
		
public boolean checkSaveTriggerwithDiscountasMapFieldinSalesInvoiceVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
						 	    	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toogleExpandBtn));
	toogleExpandBtn.click();
		  
	Thread.sleep(2000);
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggersBtn));
	triggersBtn.click();
	
			
	Thread.sleep(4000);
	
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggerName));
	editLayoutTriggerName.click();
	editLayoutTriggerName.sendKeys(Keys.SHIFT,Keys.HOME);
	Thread.sleep(1000);
	editLayoutTriggerName.sendKeys("Sales Map Trigger");
	Thread.sleep(2000);
	editLayoutTriggerName.sendKeys(Keys.TAB);
	Thread.sleep(5000);
	
	triggersConjuctionDrpdwn.click();
    Thread.sleep(2000);		
	triggersConjuctionDrpdwn.sendKeys(Keys.ARROW_DOWN);			
	triggersConjuctionDrpdwn.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggersSelectFieldTxt));
	triggersSelectFieldTxt.click();
				
	Thread.sleep(3000);
	
	getAction().moveToElement(triggerVendorACExpansionBtn).build().perform();
	Thread.sleep(1000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggerVendorACExpansionBtn));
	triggerVendorACExpansionBtn.click();
	
	Thread.sleep(3000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggerCustomerAcName));
	triggerCustomerAcName.click();
	
	Thread.sleep(2000);

	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggersSelectOperdrpdwn));
	triggersSelectOperdrpdwn.click();
	triggersSelectOperdrpdwn.sendKeys("Equal");
	
	
	Thread.sleep(5000);
	triggersSelectOperdrpdwn.sendKeys(Keys.TAB);
	
	Thread.sleep(5000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggersCompareWithdrpdwn));
	triggersCompareWithdrpdwn.click();
	triggersCompareWithdrpdwn.sendKeys("value");
	//triggersCompareWithdrpdwn.sendKeys(Keys.ARROW_DOWN);
	Thread.sleep(2000);
	triggersCompareWithdrpdwn.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	
	triggersValueToEnterTxt.click();
	Thread.sleep(1000);
	triggersValueTxt.sendKeys(Keys.SPACE);
	Thread.sleep(3000);
	triggersValueTxt.sendKeys("Customer A");
	Thread.sleep(1500);
	triggersValueTxt.sendKeys(Keys.TAB);

	
	Thread.sleep(1500);
	
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggerRaiseDoc));
	editLayoutTriggerRaiseDoc.click();
						
	getFluentWebDriverWait().until(ExpectedConditions.visibilityOf(editLayoutTriggersAllVouchers));
	Select s=new Select(editLayoutTriggersAllVouchers);
	s.selectByVisibleText("Cash Sales");
	Thread.sleep(3000);
	
	
	getAction().moveToElement(trigger1stRow1stCol).build().perform();
	
	
	ClickUsingJs(trigger1stRow1stCol);
	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggerSelectFieldDropdown));

	Thread.sleep(1000);
	Select s1=new Select(triggerSelectFieldDropdown);
	s1.selectByVisibleText("Discount");
	Thread.sleep(3000);
	triggerSelectFieldDropdown.sendKeys(Keys.TAB);
	
	
	ClickUsingJs(trigger1stRow2ndCol);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggerSelectMapDropdown));
	Select s2=new Select(triggerSelectMapDropdown);
	s2.selectByVisibleText("Discount");
	Thread.sleep(2000);
	
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggersSaveBtn));
	editLayoutTriggersSaveBtn.click();
	Thread.sleep(2000);
	
	String expSaveMessage = "Data saved successfully";
	String actSaveMessage = checkValidationMessage(expSaveMessage);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateBtn));
	updateBtn.click();
	
	
	String expUpdateMessage = "Data saved successfully";
	String actUpdateMessage = checkValidationMessage(expUpdateMessage);
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
	closeBtn.click();
		
	if( actSaveMessage.equalsIgnoreCase(expSaveMessage))
	{
		System.out.println("Test Pass : Trigger  Added Successfully");
		
		return true;
	}
	else
	{
		System.out.println("Test Fail : Trigger NOT Added Successfully");
		
		return false;
	}

		
}

@FindBy(xpath = "//input[@id='id_body_33554476']")
public static WebElement enter_AQTxt;

@FindBy(xpath = "//input[@id='id_body_33554477']")
public static WebElement enter_FQTxt;

	
public static boolean checkSavingSalesInvoiceVATVoucher1withDiscountasMapField() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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

	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
	newBtn.click();

	checkValidationMessage("Screen opened");

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
	customerAccountTxt.click();
	customerAccountTxt.sendKeys(Keys.END);
	customerAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	customerAccountTxt.sendKeys(Keys.SPACE);

	int customercount=customerAccountListCount.size();

	System.err.println(customercount);

	for(int i=0 ; i < customercount ;i++)
	{
		String data=customerAccountListCount.get(i).getText();

		if(data.equalsIgnoreCase("Customer A"))
		{
			customerAccountListCount.get(i).click();

			break;
		}
	}

	customerAccountTxt.sendKeys(Keys.TAB);


	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
	departmentTxt.click();
	departmentTxt.sendKeys(Keys.SPACE);

	int departmentcount=departmentListCount.size();

	System.err.println(departmentcount);

	for(int i=0 ; i < departmentcount ;i++)
	{
		String data=departmentListCount.get(i).getText();

		if(data.equalsIgnoreCase("DUBAI"))
		{
			departmentListCount.get(i).click();

			break;
		}
	}

	departmentTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
	salesInvoiceVATPlaceOFSupply.click();
	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);


	int placeOFSupplyListCount=placeOFSupplyList.size();

	System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);

	for(int i=0 ; i < placeOFSupplyListCount ;i++)
	{
		String data=placeOFSupplyList.get(i).getText();

		if(data.equalsIgnoreCase("Abu Dhabi"))
		{
			placeOFSupplyList.get(i).click();

			break;
		}
	}

	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
	jurisdictionTxt.click();
	jurisdictionTxt.sendKeys(Keys.END);
	jurisdictionTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	jurisdictionTxt.sendKeys("DUBAI");
	Thread.sleep(2000);
	jurisdictionTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
	select1stRow_1stColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
	pvWareHouseTxt.click();
	pvWareHouseTxt.sendKeys(Keys.SPACE);

	int warehousecount=pvwareHouseListCount.size();

	System.err.println(warehousecount);

	for(int i=0 ; i < warehousecount ;i++)
	{
		String data=pvwareHouseListCount.get(i).getText();

		if(data.equalsIgnoreCase("SECUNDERABAD"))
		{
			pvwareHouseListCount.get(i).click();

			break;
		}	
	}

	pvWareHouseTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	enter_ItemTxt.sendKeys(Keys.END);
	enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	enter_ItemTxt.sendKeys(Keys.BACK_SPACE);
	enter_ItemTxt.sendKeys(Keys.SPACE);

	int itemcount1=itemListCount.size();

	System.err.println(itemcount1);

	for(int i=0 ; i < itemcount1 ;i++)
	{
		String data=itemListCount.get(i).getText();

		if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
		{
			itemListCount.get(i).click();

			break;
		}
	}

	enter_ItemTxt.sendKeys(Keys.TAB);

	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
	select1stRow_5thColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
	select1stRow_8thColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
	enter_AQTxt.sendKeys("6");
	enter_AQTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
	enter_FQTxt.sendKeys("6");
	enter_FQTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
	select1stRow_11thColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
	select1stRow_14thColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
	enter_Rate.click();
	enter_Rate.clear();
	enter_Rate.sendKeys("10");
	enter_Rate.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
	enter_Gross.click();
	enter_Gross.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_16thColumn));
	select1stRow_16thColumn.click();	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SIVAT_enter_Discount));
	SIVAT_enter_Discount.click();
	SIVAT_enter_Discount.clear();
	SIVAT_enter_Discount.sendKeys("10");
	SIVAT_enter_Discount.sendKeys(Keys.TAB);
	Thread.sleep(2000);

	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFIFOIcon));
	batchPickOnFIFOIcon.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchOkIcon));
	batchOkIcon.click();
*/
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
	String docno=documentNumberTxt.getAttribute("value");
	

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
	voucherSaveBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
	billRefNewReferenceTxt.click();
	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
	pickBtn.click();
	Thread.sleep(2000);
	

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Bill_OkBtn));
	Bill_OkBtn.click();
	checkValidationMessage("");


	Thread.sleep(3000);
	String expMsg="This Transaction will make the Stock Negative";
	
	String actMsg=checkValidationMessage(expMsg);
	Thread.sleep(2000);
	String expMessage1 = "Voucher saved successfully";

	String actMessage = checkValidationMessage(expMessage1);
	String expMessage2 = ": "+docno;

			
	System.out.println("Actual Message    : "+actMessage);
	System.out.println("Expected Message  : "+expMessage1);

	if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) )

	
	{
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		new_CloseBtn.click();
		Thread.sleep(2000);*/
		return true;
	}	
	else
	{
		/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		new_CloseBtn.click();
		Thread.sleep(2000);*/
		return false;
	}

	
	
	
}


public static  ArrayList<String> checkNetValueofVoucher1inSalesInvoiceVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	Thread.sleep(1000);
	getWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
	documentNumberTxt.click();
	documentNumberTxt.sendKeys(Keys.END,Keys.SHIFT,Keys.HOME);
	documentNumberTxt.sendKeys("1");
	Thread.sleep(2000);
	documentNumberTxt.sendKeys(Keys.TAB);

	checkValidationMessage("Voucher loaded successfully");

	ArrayList<String> DiscNetArry = new ArrayList<String>();
	String actDiscount = select1stRow_16thColumn.getText();
	
	
	String actNetValue= voucherFooterNetValue.getText();
	
	DiscNetArry.add(actDiscount);
	DiscNetArry.add(actNetValue);
	
	
	return DiscNetArry;
	
}


public boolean checkCashSalesVoucherafterTriggerOptionsSavewithMapField() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	ArrayList<String> DiscNetArry = new ArrayList<String>();
	DiscNetArry=checkNetValueofVoucher1inSalesInvoiceVAT();
	Thread.sleep(3000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
	System.out.println("Setting buton is enabled");
	serachMenuTextHomePage.click();
	serachMenuTextHomePage.sendKeys("Cash Sales");

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMenuTextClick));
	searchMenuTextClick.click();

	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
	
	int voucherGridDocNoCount = voucherGridDocNo.size();

	for(int i=0;i<voucherGridDocNoCount;i++)
	{
		String data ="1";
		if(voucherGridDocNo.get(i).getText().equalsIgnoreCase(data))
		{
			voucherGridIndexChkBox.get(i).click();
			break;
		}
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editBtn));
	editBtn.click();
	Thread.sleep(2000);
	
	
	
	String actDiscountValue=select1stRow_6thColumn.getText();
	String expDiscountValue=DiscNetArry.get(0);
	
	String actNetValue=voucherFooterNetValue.getText();
	
	String expNetValue=DiscNetArry.get(1);
	
	System.out.println("Actual Discount    : "+actDiscountValue);
	System.out.println("Expected Discount  : "+expDiscountValue);
	
	System.out.println("Actual Net   : "+actNetValue);
	System.out.println("ExpectedNet  : "+expNetValue);
	
	
	
	if(actDiscountValue.equalsIgnoreCase(expDiscountValue)&&actNetValue.equalsIgnoreCase(expNetValue))
	{
		return true;
	}
	else
	{
		return false;
	}
				
}


public static boolean checkCreatingAlertinTriggersSalesInvoiceVAT() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
	
	serachMenuTextHomePage.click();
	serachMenuTextHomePage.sendKeys("Configure Transactions");
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMenuTextClick));
	searchMenuTextClick.click();	  
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentCustomization45Btn));
	documentCustomization45Btn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATBtn));
	salesInvoiceVATBtn.click();
					 	    	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toogleExpandBtn));
	toogleExpandBtn.click();
		  
	Thread.sleep(2000);
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggersBtn));
	triggersBtn.click();
		
	Thread.sleep(4000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggerName));
	editLayoutTriggerName.click();
	editLayoutTriggerName.sendKeys(Keys.SHIFT,Keys.HOME);
	Thread.sleep(1000);
	editLayoutTriggerName.sendKeys("Sales Map Trigger");
	Thread.sleep(2000);
	editLayoutTriggerName.sendKeys(Keys.TAB);
	Thread.sleep(5000);
	
	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendAlertChkBox));
	sendAlertChkBox.click();*/
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cretaNewAlertButton));
	cretaNewAlertButton.click();
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newButtonInCreateTemplate));
	newButtonInCreateTemplate.click();
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailTemplates));
	emailTemplates.sendKeys("SalesMapAlertTriggerTemplate");
	emailTemplates.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyNameTemplateArea));
	companyNameTemplateArea.click();
	Thread.sleep(1500);
	

	Runtime.getRuntime().exec(getBaseDir() + "\\autoIt\\scripts\\salesTriggerAlert.exe");
	
	Thread.sleep(80000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInEmailTemplateHeader));
	saveBtnInEmailTemplateHeader.click();
	
	Thread.sleep(2000);
	System.err.println("Template save button clicked");
	
	String expEmailTemplateSaveMsg = "Template saved successfully";
	String actEmailTemplateSaveMsg =  checkValidationMessage(expEmailTemplateSaveMsg);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeButtonInCreateTemplate));
	closeButtonInCreateTemplate.click();
	Thread.sleep(2000);
	if(actEmailTemplateSaveMsg.equalsIgnoreCase(expEmailTemplateSaveMsg))
	{
		return true;
	}
	else
	{
		return false;
	}
	
		 
}


public static boolean checkCreatedAlertandUserSelectinSalesInvoiceVATVoucher() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	getDriver().navigate().refresh();
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
	System.out.println("Setting buton is enabled");
	serachMenuTextHomePage.click();
	serachMenuTextHomePage.sendKeys("Configure Transactions");
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMenuTextClick));
	searchMenuTextClick.click();	  
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentCustomization45Btn));
	documentCustomization45Btn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATBtn));
	salesInvoiceVATBtn.click();
					 	    	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toogleExpandBtn));
	toogleExpandBtn.click();
		  
	Thread.sleep(2000);
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggersBtn));
	triggersBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggerName));
	editLayoutTriggerName.click();
	editLayoutTriggerName.sendKeys(Keys.SHIFT,Keys.HOME);
	Thread.sleep(1000);
	editLayoutTriggerName.sendKeys("Sales Map Trigger");
	Thread.sleep(2000);
	editLayoutTriggerName.sendKeys(Keys.TAB);
	Thread.sleep(5000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendAlertChkBox));
	sendAlertChkBox.click();
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectSendAlert));
	Select s=new Select(selectSendAlert);
	s.selectByVisibleText("SalesMapAlertTriggerTemplate");
	Thread.sleep(2000);
	String actMsg=s.getFirstSelectedOption().getText();
	String expMsg="SalesMapAlertTriggerTemplate";
	
	System.out.println("Actual Message: 	" 		+ actMsg);
	System.out.println("Expected Message:  	"	+expMsg);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loginChkBox));
	if(loginChkBox.isSelected()==false)
	{
		loginChkBox.click();
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectUsersList));
	Select s1=new Select(selectUsersList);
	s1.selectByVisibleText("UserAllOptionsST");
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggersSaveBtn));
	editLayoutTriggersSaveBtn.click();
	Thread.sleep(2000);
	
	String expSaveMessage = "Data saved successfully";
	String actSaveMessage = checkValidationMessage(expSaveMessage);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateBtn));
	updateBtn.click();
	
	
	String expUpdateMessage = "Data saved successfully";
	String actUpdateMessage = checkValidationMessage(expUpdateMessage);
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
	closeBtn.click();
	
	
	if(actMsg.equalsIgnoreCase(expMsg) && actSaveMessage.equalsIgnoreCase(expSaveMessage))
	{
		return true;
	}
	else
	{
		return false;
	}
	
}


public static boolean checkSavingVoucher2inSalesInvoiceVATforAlertMessage() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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

	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
	newBtn.click();

	checkValidationMessage("Screen opened");

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
	customerAccountTxt.click();
	customerAccountTxt.sendKeys(Keys.END);
	customerAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	customerAccountTxt.sendKeys(Keys.SPACE);

	int customercount=customerAccountListCount.size();

	System.err.println(customercount);

	for(int i=0 ; i < customercount ;i++)
	{
		String data=customerAccountListCount.get(i).getText();

		if(data.equalsIgnoreCase("Customer A"))
		{
			customerAccountListCount.get(i).click();

			break;
		}
	}

	customerAccountTxt.sendKeys(Keys.TAB);


	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
	departmentTxt.click();
	departmentTxt.sendKeys(Keys.SPACE);

	int departmentcount=departmentListCount.size();

	System.err.println(departmentcount);

	for(int i=0 ; i < departmentcount ;i++)
	{
		String data=departmentListCount.get(i).getText();

		if(data.equalsIgnoreCase("DUBAI"))
		{
			departmentListCount.get(i).click();

			break;
		}
	}

	departmentTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
	salesInvoiceVATPlaceOFSupply.click();
	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);


	int placeOFSupplyListCount=placeOFSupplyList.size();

	System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);

	for(int i=0 ; i < placeOFSupplyListCount ;i++)
	{
		String data=placeOFSupplyList.get(i).getText();

		if(data.equalsIgnoreCase("Abu Dhabi"))
		{
			placeOFSupplyList.get(i).click();

			break;
		}
	}

	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
	jurisdictionTxt.click();
	jurisdictionTxt.sendKeys(Keys.END);
	jurisdictionTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	jurisdictionTxt.sendKeys("DUBAI");
	Thread.sleep(2000);
	jurisdictionTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
	select1stRow_1stColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
	pvWareHouseTxt.click();
	pvWareHouseTxt.sendKeys(Keys.SPACE);

	int warehousecount=pvwareHouseListCount.size();

	System.err.println(warehousecount);

	for(int i=0 ; i < warehousecount ;i++)
	{
		String data=pvwareHouseListCount.get(i).getText();

		if(data.equalsIgnoreCase("SECUNDERABAD"))
		{
			pvwareHouseListCount.get(i).click();

			break;
		}	
	}

	pvWareHouseTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	enter_ItemTxt.sendKeys(Keys.END);
	enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	enter_ItemTxt.sendKeys(Keys.BACK_SPACE);
	enter_ItemTxt.sendKeys(Keys.SPACE);

	int itemcount1=itemListCount.size();

	System.err.println(itemcount1);

	for(int i=0 ; i < itemcount1 ;i++)
	{
		String data=itemListCount.get(i).getText();

		if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
		{
			itemListCount.get(i).click();

			break;
		}
	}

	enter_ItemTxt.sendKeys(Keys.TAB);

	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
	select1stRow_5thColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
	select1stRow_8thColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
	enter_AQTxt.sendKeys("6");
	enter_AQTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
	enter_FQTxt.sendKeys("6");
	enter_FQTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
	select1stRow_11thColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
	select1stRow_14thColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
	enter_Rate.click();
	enter_Rate.clear();
	enter_Rate.sendKeys("10");
	enter_Rate.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
	enter_Gross.click();
	enter_Gross.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_16thColumn));
	select1stRow_16thColumn.click();	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SIVAT_enter_Discount));
	SIVAT_enter_Discount.click();
	SIVAT_enter_Discount.clear();
	SIVAT_enter_Discount.sendKeys("5");
	SIVAT_enter_Discount.sendKeys(Keys.TAB);
	Thread.sleep(2000);

	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFIFOIcon));
	batchPickOnFIFOIcon.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchOkIcon));
	batchOkIcon.click();
*/
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
	String docno=documentNumberTxt.getAttribute("value");
	

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
	voucherSaveBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
	billRefNewReferenceTxt.click();
	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
	pickBtn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Bill_OkBtn));
	Bill_OkBtn.click();

	Thread.sleep(3000);
	
	String expMessage1 = "Voucher saved successfully";

	String actMessage = checkValidationMessage(expMessage1);
	String expMessage2 = ": "+docno;

			
	System.out.println("Actual Message    : "+actMessage);
	System.out.println("Expected Message  : "+expMessage1);

	if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) )

	
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		new_CloseBtn.click();
		Thread.sleep(2000);
		return true;
	}	
	else
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		new_CloseBtn.click();
		Thread.sleep(2000);
		return false;
	}



}


public static boolean checkTriggerAlertMessageinUserAllOptionsSTofSalesInvoiceVAT() throws InterruptedException
{
	getDriver().navigate().refresh();
	
	Thread.sleep(2000);
getWebDriverWait().until(ExpectedConditions.visibilityOf(noOfAlertsDisplay));
noOfAlertsDisplay.click();
Thread.sleep(2000);

// Actual
String  actAlertsMainHeader=alertsMainHeader.getText();

boolean actNoOfAlertsDisplay=alertsMainHeader.isDisplayed();
boolean expNoOfAlertsDisplay=true;

System.out.println("Alerts is display"+ actAlertsMainHeader);

Thread.sleep(2000);

int count = alertTransaction.size();

String alertTest=null;

for(int i=0; i<count; i++)
{
	String data = alertTransaction.get(i).getText();
	
	if(data.contains("  Transactions "))
	{
		alertTransaction.get(i).click();
		Thread.sleep(2000);
		transactionAuthorization2.get(i).click();
		Thread.sleep(2000);
		alertTest=transactionAuthorizationText2.get(i).getText();
		
		
	}
}


String actAlertMsg=alertTest;
String expAlertMsg="Automation Company : 08/10/2020 5:43 PMSUSECUNDERABADNDT50:2";

System.out.println("Actual Alert Text: 		" 	+	alertTest);
System.out.println("Expected Alert Text: 	" 	+	expAlertMsg);

if(actNoOfAlertsDisplay==expNoOfAlertsDisplay && actAlertMsg.equalsIgnoreCase(expAlertMsg))
{
return true;
}
else
{
	return false;
}
}


public static boolean checkEmailTemplateCreationinSalesInvoiceVATTriggers() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
	System.out.println("Setting buton is enabled");
	serachMenuTextHomePage.click();
	serachMenuTextHomePage.sendKeys("Configure Transactions");
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMenuTextClick));
	searchMenuTextClick.click();	  
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentCustomization45Btn));
	documentCustomization45Btn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATBtn));
	salesInvoiceVATBtn.click();
					 	    	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toogleExpandBtn));
	toogleExpandBtn.click();
		  
	Thread.sleep(2000);
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggersBtn));
	triggersBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggerName));
	editLayoutTriggerName.click();
	editLayoutTriggerName.sendKeys(Keys.SHIFT,Keys.HOME);
	Thread.sleep(1000);
	editLayoutTriggerName.sendKeys("Sales Map Trigger");
	Thread.sleep(2000);
	editLayoutTriggerName.sendKeys(Keys.TAB);
	Thread.sleep(5000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailChkBox));
	sendEmailChkBox.click();
	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createNewEmailButton));
	createNewEmailButton.click();
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailNewBtn));
	emailNewBtn.click();
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailNewLayoutBtn));
	emailNewLayoutBtn.click();
	Thread.sleep(2000);
	
	Runtime.getRuntime().exec(getBaseDir() + "\\autoIt\\scripts\\EmailTriggerLayout.exe");
	
	Thread.sleep(75000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailSaveBtn));
	emailSaveBtn.click();
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailSaveOptionBtn));
	emailSaveOptionBtn.click();
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailSavePopupTitle));
	boolean actTitleDisplay=emailSavePopupTitle.isDisplayed();
	boolean expTitleDisplay=true;
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailSaveTxt));
	emailSaveTxt.click();
	emailSaveTxt.sendKeys("SalesTriggersEmailLayout");
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailSaveLayoutBtn));
	emailSaveLayoutBtn.click();
	Thread.sleep(2000);
	String expSaveLayotMsg="Layout saved successfully";
	String actSaveLayoutMsg=checkValidationMessage(expSaveLayotMsg);
	
	
	System.out.println("Actual Message: 	"	+actSaveLayoutMsg);
	System.out.println("Expected Message:	"	+expSaveLayotMsg);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailLayoutPreviewBtn));
	emailLayoutPreviewBtn.click();
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailLayoutExitBtn));
	emailLayoutExitBtn.click();
	Thread.sleep(2000);
	
	if(actTitleDisplay==expTitleDisplay && actSaveLayoutMsg.equalsIgnoreCase(expSaveLayotMsg))
	{
		return true;
	}
	else
	{
		return false;
	}
	
	
}
	

public static boolean checkCreatedEmailTemplateinSalesInvoiceVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
	System.out.println("Setting buton is enabled");
	serachMenuTextHomePage.click();
	serachMenuTextHomePage.sendKeys("Configure Transactions");
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMenuTextClick));
	searchMenuTextClick.click();	  
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentCustomization45Btn));
	documentCustomization45Btn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATBtn));
	salesInvoiceVATBtn.click();
					 	    	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toogleExpandBtn));
	toogleExpandBtn.click();
		  
	Thread.sleep(2000);
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggersBtn));
	triggersBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggerName));
	editLayoutTriggerName.click();
	editLayoutTriggerName.sendKeys(Keys.SHIFT,Keys.HOME);
	Thread.sleep(1000);
	editLayoutTriggerName.sendKeys("Sales Map Trigger");
	Thread.sleep(2000);
	editLayoutTriggerName.sendKeys(Keys.TAB);
	Thread.sleep(6000);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendAlertChkBox));
	if(sendAlertChkBox.isSelected()==true)
	{
		sendAlertChkBox.click();
	}
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailChkBox));
	if(sendEmailChkBox.isSelected()==false)
	{
	sendEmailChkBox.click();
	}
	Thread.sleep(2000);
	
	
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailTxtBox));
	sendEmailTxtBox.click();
	sendEmailTxtBox.sendKeys(Keys.HOME,Keys.SHIFT,Keys.END);
	sendEmailTxtBox.sendKeys("SalesTriggersEmailLayout");
	Thread.sleep(3000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(loginChkBox));
	if(loginChkBox.isSelected()==false)
	{
		loginChkBox.click();
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectUsersList));
	Select s1=new Select(selectUsersList);
	s1.selectByVisibleText("TriggerUser");
	Thread.sleep(2000);
	//s1.selectByVisibleText("UserAllOptionsST");
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggersSaveBtn));
	editLayoutTriggersSaveBtn.click();
	Thread.sleep(2000);
	
	String expSaveMessage = "Data saved successfully";
	String actSaveMessage = checkValidationMessage(expSaveMessage);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateBtn));
	updateBtn.click();
	
	
	String expUpdateMessage = "Data saved successfully";
	String actUpdateMessage = checkValidationMessage(expUpdateMessage);
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
	closeBtn.click();
	
	
	if(actSaveMessage.equalsIgnoreCase(expSaveMessage))
	{
		return true;
	}
	else
	{
		return false;
	}

	
}


public static boolean checkSavingVoucher3inSalesInvoiceVATforEmailValidation() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
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

	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
	newBtn.click();

	checkValidationMessage("Screen opened");

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
	customerAccountTxt.click();
	customerAccountTxt.sendKeys(Keys.END);
	customerAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	customerAccountTxt.sendKeys(Keys.SPACE);

	int customercount=customerAccountListCount.size();

	System.err.println(customercount);

	for(int i=0 ; i < customercount ;i++)
	{
		String data=customerAccountListCount.get(i).getText();

		if(data.equalsIgnoreCase("Customer A"))
		{
			customerAccountListCount.get(i).click();

			break;
		}
	}

	customerAccountTxt.sendKeys(Keys.TAB);


	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
	departmentTxt.click();
	departmentTxt.sendKeys(Keys.SPACE);

	int departmentcount=departmentListCount.size();

	System.err.println(departmentcount);

	for(int i=0 ; i < departmentcount ;i++)
	{
		String data=departmentListCount.get(i).getText();

		if(data.equalsIgnoreCase("DUBAI"))
		{
			departmentListCount.get(i).click();

			break;
		}
	}

	departmentTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
	salesInvoiceVATPlaceOFSupply.click();
	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);


	int placeOFSupplyListCount=placeOFSupplyList.size();

	System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);

	for(int i=0 ; i < placeOFSupplyListCount ;i++)
	{
		String data=placeOFSupplyList.get(i).getText();

		if(data.equalsIgnoreCase("Abu Dhabi"))
		{
			placeOFSupplyList.get(i).click();

			break;
		}
	}

	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
	jurisdictionTxt.click();
	jurisdictionTxt.sendKeys(Keys.END);
	jurisdictionTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	jurisdictionTxt.sendKeys("DUBAI");
	Thread.sleep(2000);
	jurisdictionTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
	select1stRow_1stColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
	pvWareHouseTxt.click();
	pvWareHouseTxt.sendKeys(Keys.SPACE);

	int warehousecount=pvwareHouseListCount.size();

	System.err.println(warehousecount);

	for(int i=0 ; i < warehousecount ;i++)
	{
		String data=pvwareHouseListCount.get(i).getText();

		if(data.equalsIgnoreCase("SECUNDERABAD"))
		{
			pvwareHouseListCount.get(i).click();

			break;
		}	
	}

	pvWareHouseTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	enter_ItemTxt.sendKeys(Keys.END);
	enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	enter_ItemTxt.sendKeys(Keys.BACK_SPACE);
	enter_ItemTxt.sendKeys(Keys.SPACE);

	int itemcount1=itemListCount.size();

	System.err.println(itemcount1);

	for(int i=0 ; i < itemcount1 ;i++)
	{
		String data=itemListCount.get(i).getText();

		if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
		{
			itemListCount.get(i).click();

			break;
		}
	}

	enter_ItemTxt.sendKeys(Keys.TAB);

	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
	select1stRow_5thColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
	select1stRow_8thColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
	enter_AQTxt.sendKeys("6");
	enter_AQTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
	enter_FQTxt.sendKeys("6");
	enter_FQTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
	select1stRow_11thColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
	select1stRow_14thColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
	enter_Rate.click();
	enter_Rate.clear();
	enter_Rate.sendKeys("10");
	enter_Rate.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
	enter_Gross.click();
	enter_Gross.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_16thColumn));
	select1stRow_16thColumn.click();	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SIVAT_enter_Discount));
	SIVAT_enter_Discount.click();
	SIVAT_enter_Discount.clear();
	SIVAT_enter_Discount.sendKeys("5");
	SIVAT_enter_Discount.sendKeys(Keys.TAB);
	Thread.sleep(2000);

	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFIFOIcon));
	batchPickOnFIFOIcon.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchOkIcon));
	batchOkIcon.click();
*/
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
	String docno=documentNumberTxt.getAttribute("value");
	

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
	voucherSaveBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
	billRefNewReferenceTxt.click();
	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
	pickBtn.click();
	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Bill_OkBtn));
	Bill_OkBtn.click();

	Thread.sleep(3000);
	
	String expMessage1 = "Voucher saved successfully";

	String actMessage = checkValidationMessage(expMessage1);
	String expMessage2 = ": "+docno;

			
	System.out.println("Actual Message    : "+actMessage);
	System.out.println("Expected Message  : "+expMessage1);

	if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) )

	
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		new_CloseBtn.click();
		Thread.sleep(2000);
		return true;
	}	
	else
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		new_CloseBtn.click();
		Thread.sleep(2000);
		return false;
	}



}

public static boolean checkEmailValidationUserforCreatedSalesTriggerTemplate() throws InterruptedException, AWTException, IOException
{
	
	File Efile1=new File(getBaseDir()+"\\autoIt\\ExportFiles\\SalesTriggersEmail.pdf");
	
	if(Efile1.exists())
	{
		Efile1.delete();
	}
	
		Robot robot = new Robot();   
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
		Thread.sleep(4000);
		
		ArrayList<String> openTabs = new ArrayList<String>(getDriver().getWindowHandles());

	 	System.out.println("openTabs"+openTabs);

	 	getDriver().switchTo().window(openTabs.get(0));
	 	
	 	getDriver().switchTo().window(openTabs.get(1));
		
	
	 	getDriver().get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=AddSession");
	 	
	 	Thread.sleep(2000);
	 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(userNameTxt));
	 	userNameTxt.click();
	 	
	 	userNameTxt.sendKeys("emailvalidationone@gmail.com");
	 	
	 	Thread.sleep(2000);
	 	
	 	System.out.println("User enter text");
	 	
	 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(NextBtn));
	 	NextBtn.click();
	 	
	 	Thread.sleep(2000);
	 	
	 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PasswordTxt));
	 	PasswordTxt.click();
	 	
	 	PasswordTxt.sendKeys("validationone");
	 	
	 	Thread.sleep(2000);
	 	
	 	NextBtn.click();
	 	
	 	Thread.sleep(8000);

	 	int count1 = row1mailFromList.size();
	 	System.out.println("No.of mails in the list"+count1);
	 	
	 	System.err.println("Email Body *"+emailBody.getText()+"*");
	 	
	 	if (emailBody.getText().isEmpty()==false) 
	 	{
	 		int count = emailSubjectList.size();
	 		System.err.println("No.of mails in the list"+count);
		 	
		 	for (int i = 0; i < count; i++) 
	 	{
	 		String mailFromTxt = emailSubjectList.get(i).getText();
	 		
	 		if (mailFromTxt.equalsIgnoreCase("Focus 8 Transaction")) 
	 		{
	 			emailSubjectList.get(i).click();
	 			break;
			}
		}
		 	
		 	
		 	Thread.sleep(3000);
 	
 	Thread.sleep(3000);
 	
 	getAction().moveToElement(mailAttachmentDownloadBtn).build().perform();
 	
 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mailAttachmentDownloadBtn));
 	mailAttachmentDownloadBtn.click();
 	
 	Thread.sleep(3000);
 	
 	 
 	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_J);
	robot.keyRelease(KeyEvent.VK_J);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	
	
	Thread.sleep(5000);
	
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	robot.keyPress(KeyEvent.VK_TAB);
	robot.keyRelease(KeyEvent.VK_TAB);
	
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	Thread.sleep(3000);
	
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_S);
	robot.keyRelease(KeyEvent.VK_S);
	robot.keyRelease(KeyEvent.VK_CONTROL);
 	
	Thread.sleep(2000);
	
			
			Runtime.getRuntime().exec(getBaseDir() + "\\autoIt\\scripts\\SalesTriggersEmail.exe");
			
			Thread.sleep(4000);
			
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_J);
			robot.keyRelease(KeyEvent.VK_J);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			
			Thread.sleep(2000);
			
			ArrayList<String> newTabs = new ArrayList<String>(getDriver().getWindowHandles());
				
			int actOpenWindowsCount = getDriver().getWindowHandles().size();
			int expOpenWindowsCount = 4;
			
			System.out.println("Number of Windows  : "+actOpenWindowsCount+"  Value Expected  "+expOpenWindowsCount);
			
			getDriver().switchTo().window(newTabs.get(3)).close();
		 	Thread.sleep(1000);
		 	getDriver().switchTo().window(newTabs.get(2)).close();
		 	Thread.sleep(1000);
		 	getDriver().switchTo().window(newTabs.get(1));
		 	Thread.sleep(1000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mailDeleteButton));
		 	mailDeleteButton.click();
		 	
		 	Thread.sleep(2000);
		 	

		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gmailUserBtn));
		 	gmailUserBtn.click();
		 	
		 	Thread.sleep(3000);
		 	getDriver().switchTo().frame(SignOutFrame);
			Thread.sleep(1000);
		 	getAction().moveToElement(gmailSignOutBtn).click().build().perform();
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(removeAccountBtn));
		 	removeAccountBtn.click();
		 	
		 	Thread.sleep(1000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(removeDeleteBtn));
		 	removeDeleteBtn.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(yesRemoveBtn));
		 	yesRemoveBtn.click();
		 	
		 	Thread.sleep(2000);
		 	
				 
		 	getDriver().switchTo().window(newTabs.get(1)).close();
		 	Thread.sleep(2000);
		 	getDriver().switchTo().window(newTabs.get(0));
		 	Thread.sleep(2000);
		 
		 	
		 	String actAccount1PDF = getBaseDir()+"\\autoIt\\ExportFiles\\SalesTriggersEmail.pdf";
			String expAccount1PDF = getBaseDir()+"\\autoIt\\ImportFiles\\SalesTriggersEmail.pdf";
			
			PDFUtil pdfutil = new PDFUtil();
			
			
			
			boolean result = pdfutil.compare(actAccount1PDF, expAccount1PDF);
			Calendar cal=Calendar.getInstance();
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			String currentDate = df.format(cal.getTime());
			
			String actAccount1Data = pdfutil.getText(actAccount1PDF);
			String expAccount1Data = pdfutil.getText(expAccount1PDF).replaceAll("26/12/2022", currentDate);
					
			System.err.println(actAccount1Data);
			System.err.println(expAccount1Data);
			
		
		 	
			
			if (actAccount1Data.equalsIgnoreCase(expAccount1Data)) 
			{
			
				System.err.println("PDF file is as Expected");
				return true;
			}
			else
			{
									
				System.err.println("PDF file is not as Expected");
				return false;
			}
			
			
		} 
		 	else 
		{	
		 		
		 		
		 		System.err.println("Subject : "+emailRow1Subject.getText());
		 		
		 		Thread.sleep(2000);
		 		
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllMailsChckbx));
		 		selectAllMailsChckbx.click();
		 		
		 		Thread.sleep(2000);
		 	
		 		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectAllMailsDltBtn));
		 		selectAllMailsDltBtn.click();
		 		
		 		Thread.sleep(4000);

		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(gmailUserBtn));
		 	gmailUserBtn.click();
		 	
		 	Thread.sleep(3000);
		 getDriver().switchTo().frame(SignOutFrame);
			Thread.sleep(1000);
		 	getAction().moveToElement(gmailSignOutBtn).click().build().perform();
		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(removeAccountBtn));
		 	removeAccountBtn.click();
		 	
		 	Thread.sleep(1000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(removeDeleteBtn));
		 	removeDeleteBtn.click();
		 	
		 	Thread.sleep(2000);
		 	
		 	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(yesRemoveBtn));
		 	yesRemoveBtn.click();
		 	
		 	Thread.sleep(2000);
		 		return false;
		}
	 	
	}

public static boolean checkCreateEmailTemplateforCustomer() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{

	Thread.sleep(2000);
	getDriver().navigate().refresh();
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
	System.out.println("Setting buton is enabled");
	serachMenuTextHomePage.click();
	serachMenuTextHomePage.sendKeys("Configure Transactions");
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMenuTextClick));
	searchMenuTextClick.click();	  
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentCustomization45Btn));
	documentCustomization45Btn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATBtn));
	salesInvoiceVATBtn.click();
					 	    	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toogleExpandBtn));
	toogleExpandBtn.click();
		  
	Thread.sleep(2000);
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggersBtn));
	triggersBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggerName));
	editLayoutTriggerName.click();
	editLayoutTriggerName.sendKeys(Keys.SHIFT,Keys.HOME);
	Thread.sleep(1000);
	editLayoutTriggerName.sendKeys("SalesMap Trigger");
	Thread.sleep(2000);
	editLayoutTriggerName.sendKeys(Keys.TAB);
	Thread.sleep(5000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailChkBox));
	if(sendEmailChkBox.isSelected()==false)
	{
	sendEmailChkBox.click();
	}
	Thread.sleep(2000);
	
	
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailTxtBox));
	sendEmailTxtBox.click();
	sendEmailTxtBox.sendKeys(Keys.HOME,Keys.SHIFT,Keys.END);
	sendEmailTxtBox.sendKeys("SalesTriggersEmailLayout");
	Thread.sleep(3000);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerChkBox));
	if(customerChkBox.isSelected()==false)
	{
		customerChkBox.click();
	}
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggersSaveBtn));
	editLayoutTriggersSaveBtn.click();
	Thread.sleep(2000);
	
	String expSaveMessage = "Data saved successfully";
	String actSaveMessage = checkValidationMessage(expSaveMessage);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateBtn));
	updateBtn.click();
	
	
	String expUpdateMessage = "Data saved successfully";
	String actUpdateMessage = checkValidationMessage(expUpdateMessage);
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
	closeBtn.click();
	
	
	if( actSaveMessage.equalsIgnoreCase(expSaveMessage))
	{
		return true;
	}
	else
	{
		return false;
	}



}


public static boolean checkSavingVoucher4inSalesInvoiceVATforCustomerEmailValidation() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
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

	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
	newBtn.click();

	checkValidationMessage("Screen opened");

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
	customerAccountTxt.click();
	customerAccountTxt.sendKeys(Keys.END);
	customerAccountTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	customerAccountTxt.sendKeys(Keys.SPACE);

	int customercount=customerAccountListCount.size();

	System.err.println(customercount);

	for(int i=0 ; i < customercount ;i++)
	{
		String data=customerAccountListCount.get(i).getText();

		if(data.equalsIgnoreCase("Customer A"))
		{
			customerAccountListCount.get(i).click();

			break;
		}
	}

	//customerAccountTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerAccountTxt));
	customerAccountTxt.click();
	Thread.sleep(2000);
	
	Robot robot = new Robot();   
	robot.keyPress(KeyEvent.VK_CONTROL);
	robot.keyPress(KeyEvent.VK_E);
	robot.keyRelease(KeyEvent.VK_CONTROL);
	robot.keyRelease(KeyEvent.VK_E);
	
	customerAccountTxt.sendKeys(Keys.TAB);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(detailsTab));
	detailsTab.click();
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailTxt));
	emailTxt.sendKeys("emailvalidationone@gmail.com");
	emailTxt.sendKeys(Keys.TAB);
	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtn));
	saveBtn.click();
	Thread.sleep(2000);
	
	vendorAccountTxt.sendKeys(Keys.TAB);
	
	Thread.sleep(3000);
	
	

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(departmentTxt));
	departmentTxt.click();
	departmentTxt.sendKeys(Keys.SPACE);

	int departmentcount=departmentListCount.size();

	System.err.println(departmentcount);

	for(int i=0 ; i < departmentcount ;i++)
	{
		String data=departmentListCount.get(i).getText();

		if(data.equalsIgnoreCase("DUBAI"))
		{
			departmentListCount.get(i).click();

			break;
		}
	}

	departmentTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATPlaceOFSupply));
	salesInvoiceVATPlaceOFSupply.click();
	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.END);
	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SHIFT,Keys.HOME);
	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.SPACE);


	int placeOFSupplyListCount=placeOFSupplyList.size();

	System.err.println("placeOFSupplyListCount   : "+placeOFSupplyListCount);

	for(int i=0 ; i < placeOFSupplyListCount ;i++)
	{
		String data=placeOFSupplyList.get(i).getText();

		if(data.equalsIgnoreCase("Abu Dhabi"))
		{
			placeOFSupplyList.get(i).click();

			break;
		}
	}

	salesInvoiceVATPlaceOFSupply.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(jurisdictionTxt));
	jurisdictionTxt.click();
	jurisdictionTxt.sendKeys(Keys.END);
	jurisdictionTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	jurisdictionTxt.sendKeys("DUBAI");
	Thread.sleep(2000);
	jurisdictionTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_1stColumn));
	select1stRow_1stColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pvWareHouseTxt));
	pvWareHouseTxt.click();
	pvWareHouseTxt.sendKeys(Keys.SPACE);

	int warehousecount=pvwareHouseListCount.size();

	System.err.println(warehousecount);

	for(int i=0 ; i < warehousecount ;i++)
	{
		String data=pvwareHouseListCount.get(i).getText();

		if(data.equalsIgnoreCase("SECUNDERABAD"))
		{
			pvwareHouseListCount.get(i).click();

			break;
		}	
	}

	pvWareHouseTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_ItemTxt));
	enter_ItemTxt.sendKeys(Keys.END);
	enter_ItemTxt.sendKeys(Keys.SHIFT,Keys.HOME);
	enter_ItemTxt.sendKeys(Keys.BACK_SPACE);
	enter_ItemTxt.sendKeys(Keys.SPACE);

	int itemcount1=itemListCount.size();

	System.err.println(itemcount1);

	for(int i=0 ; i < itemcount1 ;i++)
	{
		String data=itemListCount.get(i).getText();

		if(data.equalsIgnoreCase("STD RATE COGS ITEM"))
		{
			itemListCount.get(i).click();

			break;
		}
	}

	enter_ItemTxt.sendKeys(Keys.TAB);

	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_5thColumn));
	select1stRow_5thColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_8thColumn));
	select1stRow_8thColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_AQTxt));
	enter_AQTxt.sendKeys("6");
	enter_AQTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_FQTxt));
	enter_FQTxt.sendKeys("6");
	enter_FQTxt.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_11thColumn));
	select1stRow_11thColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Quantity));

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_14thColumn));
	select1stRow_14thColumn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Rate));
	enter_Rate.click();
	enter_Rate.clear();
	enter_Rate.sendKeys("10");
	enter_Rate.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(enter_Gross));
	enter_Gross.click();
	enter_Gross.sendKeys(Keys.TAB);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(select1stRow_16thColumn));
	select1stRow_16thColumn.click();	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(SIVAT_enter_Discount));
	SIVAT_enter_Discount.click();
	SIVAT_enter_Discount.clear();
	SIVAT_enter_Discount.sendKeys("3");
	SIVAT_enter_Discount.sendKeys(Keys.TAB);
	Thread.sleep(2000);

	/*getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchPickOnFIFOIcon));
	batchPickOnFIFOIcon.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(batchOkIcon));
	batchOkIcon.click();
*/
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentNumberTxt));
	String docno=documentNumberTxt.getAttribute("value");
	

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(voucherSaveBtn));
	voucherSaveBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(billRefNewReferenceTxt));
	billRefNewReferenceTxt.click();
	Thread.sleep(2000);

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pickBtn));
	pickBtn.click();
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(Bill_OkBtn));
	Bill_OkBtn.click();

	Thread.sleep(3000);
	
	String expMessage1 = "Voucher saved successfully";

	String actMessage = checkValidationMessage(expMessage1);
	String expMessage2 = ": "+docno;

			
	System.out.println("Actual Message    : "+actMessage);
	System.out.println("Expected Message  : "+expMessage1);

	if(actMessage.startsWith(expMessage1) && actMessage.endsWith(expMessage2) )

	
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		new_CloseBtn.click();
		Thread.sleep(2000);
		return true;
	}	
	else
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(new_CloseBtn));
		new_CloseBtn.click();
		Thread.sleep(2000);
		return false;
	}



}


public static boolean checkCreatingSMSTemplateforTriggersinSalesInvoiceVATVoucher() throws InterruptedException, IOException, EncryptedDocumentException, InvalidFormatException
{
	getDriver().navigate().refresh();
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
	System.out.println("Setting buton is enabled");
	serachMenuTextHomePage.click();
	serachMenuTextHomePage.sendKeys("Configure Transactions");
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMenuTextClick));
	searchMenuTextClick.click();	  
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentCustomization45Btn));
	documentCustomization45Btn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATBtn));
	salesInvoiceVATBtn.click();
					 	    	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toogleExpandBtn));
	toogleExpandBtn.click();
		  
	Thread.sleep(2000);
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggersBtn));
	triggersBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggerName));
	editLayoutTriggerName.click();
	editLayoutTriggerName.sendKeys(Keys.SHIFT,Keys.HOME);
	Thread.sleep(1000);
	editLayoutTriggerName.sendKeys("Sales Map Trigger");
	Thread.sleep(2000);
	editLayoutTriggerName.sendKeys(Keys.TAB);
	Thread.sleep(5000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendSMSChkBox));
	sendSMSChkBox.click();
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(createNewSMSBtn));
	createNewSMSBtn.click();
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newButtonInCreateTemplate));
	newButtonInCreateTemplate.click();
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(emailTemplates));
	emailTemplates.sendKeys("SalesMapSMSTriggerTemplate");
	emailTemplates.sendKeys(Keys.TAB);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyNameTemplateArea));
	companyNameTemplateArea.click();
	Thread.sleep(1500);
	

	Runtime.getRuntime().exec(getBaseDir() + "\\autoIt\\scripts\\salesTriggerAlert.exe");
	
	Thread.sleep(150000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(saveBtnInEmailTemplateHeader));
	saveBtnInEmailTemplateHeader.click();
	
	Thread.sleep(2000);
	System.err.println("Template save button clicked");
	
	String expEmailTemplateSaveMsg = "Template saved successfully";
	String actEmailTemplateSaveMsg =  checkValidationMessage(expEmailTemplateSaveMsg);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeButtonInCreateTemplate));
	closeButtonInCreateTemplate.click();
	Thread.sleep(2000);
	if(actEmailTemplateSaveMsg.equalsIgnoreCase(expEmailTemplateSaveMsg))
	{
		return true;
	}
	else
	{
		return false;
	}
	
	
}


public boolean checkCreatedSMSAlertinSalesInvoiceVAT() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
{
	Thread.sleep(2000);
	getDriver().navigate().refresh();
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(serachMenuTextHomePage));
	System.out.println("Setting buton is enabled");
	serachMenuTextHomePage.click();
	serachMenuTextHomePage.sendKeys("Configure Transactions");
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(searchMenuTextClick));
	searchMenuTextClick.click();	  
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(documentCustomization45Btn));
	documentCustomization45Btn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesInvoiceVATBtn));
	salesInvoiceVATBtn.click();
					 	    	
	Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toogleExpandBtn));
	toogleExpandBtn.click();
		  
	Thread.sleep(2000);
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(triggersBtn));
	triggersBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggerName));
	editLayoutTriggerName.click();
	editLayoutTriggerName.sendKeys(Keys.SHIFT,Keys.HOME);
	Thread.sleep(1000);
	editLayoutTriggerName.sendKeys("Sales Map Trigger");
	Thread.sleep(2000);
	editLayoutTriggerName.sendKeys(Keys.TAB);
	Thread.sleep(5000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendAlertChkBox));
	if(sendAlertChkBox.isSelected()==true)
	{
		sendAlertChkBox.click();
	}
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendEmailChkBox));
	if(sendEmailChkBox.isSelected()==true)
	{
	sendEmailChkBox.click();
	}
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(sendSMSChkBox));
	sendSMSChkBox.click();
	Thread.sleep(2000);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(selectSMSTemplateAlert));
	Select s=new Select(selectSMSTemplateAlert);
	s.selectByVisibleText("SalesMapSMSTriggerTemplate");
	Thread.sleep(2000);
	String actMsg=s.getFirstSelectedOption().getText();
	String expMsg="SalesMapSMSTriggerTemplate";
	
	System.out.println("Actual Message: 	" 		+ actMsg);
	System.out.println("Expected Message:  	"	+expMsg);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(editLayoutTriggersSaveBtn));
	editLayoutTriggersSaveBtn.click();
	Thread.sleep(2000);
	
	String expSaveMessage = "Data saved successfully";
	String actSaveMessage = checkValidationMessage(expSaveMessage);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(updateBtn));
	updateBtn.click();
	
	
	String expUpdateMessage = "Data saved successfully";
	String actUpdateMessage = checkValidationMessage(expUpdateMessage);
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(closeBtn));
	closeBtn.click();
	
	
	
	
	if(actMsg.equalsIgnoreCase(expMsg) && expUpdateMessage.equalsIgnoreCase(expUpdateMessage))
	{
		return true;
	}
	else
	{
		return false;
	}
	
}



	 public PurchaseVoucherVATandSalesInvoiceVATTriggersPage(WebDriver driver)
	 {
	    	
	    	PageFactory.initElements(driver, this);
	    	
	 }
	
	
	

}
