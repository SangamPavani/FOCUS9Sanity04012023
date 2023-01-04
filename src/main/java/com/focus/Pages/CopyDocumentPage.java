package com.focus.Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;

public class CopyDocumentPage extends BaseEngine{
	
//////CopyDocument Elements
	
	@FindBy(xpath="//input[@id='optCopyDocType']")
	public static WebElement cd_VoucherTypeDropDown;
	
	@FindBy(xpath="//tbody[@id='optCopyDocType_table_body']//tr//td[2]")
	public static List<WebElement> cd_VoucherTypeList;
	
	
	@FindBy(xpath="//input[@id='copydoc_HeaderChkBox']")
	public static WebElement cd_HeaderCheckBox;

	@FindBy(xpath="//*[@id='id_copydoc_grid1_buttonsrow']/div[2]/input")
	public static WebElement cd_OKBtn;
	
	@FindBy(xpath="//*[@id='id_copydoc_grid1_buttonsrow']/div[3]/input")
	public static WebElement cd_SelectAllBtn;

		
	@FindBy(xpath="//*[@id='btn_firstPage']")
	public static WebElement cd_FirstBtn;

	
	@FindBy(xpath="//*[@id='btn_previousPage']")
	public static WebElement cd_PreviousBtn;

	
	@FindBy(xpath="//*[@id='btn_nextPage']")
	public static WebElement cd_NextBtn;

	
	@FindBy(xpath="//*[@id='btn_lastPage']")
	public static WebElement cd_LastBtn;

	@FindBy(xpath="//*[@id='input_pagenumber']")
	public static WebElement cd_PageNumberTxt;

	@FindBy(xpath="//*[@id='id_chkclubsimilartxn']")
	public static WebElement cd_ClubSimilarTransChkBox;
	
	@FindBy(xpath="//select[@id='id_searchoncolumns']")
	public static WebElement cd_SelectSearchColumn;
	
	@FindBy(xpath="(//*[@id='id_transaction_copydocpopup']//select)[2]")
	public static WebElement cd_SelectSearchType;
	
	
	@FindBy(xpath="//*[@id='srch_doc']")
	public static WebElement cd_SearchTxt;
	

	@FindBy(xpath="//i[@class='icon-search']")
	public static WebElement cd_SearchIcon;
	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_copydocument_refresh']")
	public static WebElement cd_RefreshBtn;
	
	
	@FindBy(xpath="//*[@id='id_transaction_entry_copydocument_filter_togglebutton']")
	public static WebElement cd_FilterBtn;
	
	
	@FindBy(xpath="//span[@id='idFilterCustomizeIcon']")
	private static WebElement  cd_FilterCustomizeBtn;
	
	@FindBy(xpath="//*[@id='txtfiltersearch']")	
	public static WebElement cd_FilterCustomizeSearchTxt;
	
	
	
	@FindBy(xpath="(//*[@id='FilterFields_3072_0']/li[8]/a/i)[1]")	
	public static WebElement cd_FilterItemExpnsion;
	
	
	@FindBy(xpath="(//*[@id='5021'])[2]")	
	public static WebElement cd_FilterItemSearchChkBox;
	
	@FindBy(xpath="(//button[@class='Fbutton'])[1]")
	private static WebElement  cd_FilterCustomize_OkBtn;
	
	@FindBy(xpath="//*[@id='FOption_3072_0_DefaultFilter_0']")
	private static WebElement  cd_FilterItemDefaultFilterTxt;
	
	@FindBy(xpath="(//*[@id='1'])[1]")	
	public static WebElement cd_FilterDocNoChkBox;
	
	@FindBy(xpath="//*[@id='3072_0_DefaultFilter_0']")	
	public static WebElement cd_FilterDocNoDefaultFilterTxt;
	
	
	@FindBy(xpath="//*[@id='btncopydocfilter_ok']")
	private static WebElement  cd_FilterOkBtn;
	
		
	@FindBy(xpath="//*[@id='id_transaction_copydoc_cancel']")
	public static WebElement cd_CancelBtn;
	
	@FindBy(xpath="//tbody[@id='copydoc_tblBodyTransRender']")
	public static WebElement copyTable;
	
	@FindBy(xpath="//table[@id='id_copydoc_TranTable']/tbody/tr[1]/td[1]")
	public static WebElement cd_Select1stRow1stColumn;


	@FindBy(xpath="//table[@id='id_copydoc_TranTable']/tbody/tr[2]/td[1]")
	public static WebElement cd_Select2ndRow1stColumn;



	@FindBy(xpath="//table[@id='id_copydoc_TranTable']/tbody/tr[1]/td[2]")
	public static WebElement cd_Select1stRow2ndColumn;


	@FindBy(xpath="//table[@id='id_copydoc_TranTable']/tbody/tr[1]/td")
	public static List<WebElement> cd_Select1stRow;


@FindBy(xpath="//*[@id='3072_0_AdvanceFilter_']/table/tbody/tr/td[5]/input")
public static WebElement cd_advnFilterTxtField;

@FindBy(xpath="//table[@id='id_copydoc_TranTable']/tbody/tr")
public static List<WebElement> cd_SelectRowsList;

@FindBy(xpath="//tbody[@id='id_copydoc_grid2_tbody']/tr")
public static List<WebElement> cd_SelectRowsListafterClub;

@FindBy(xpath="//tbody[@id='id_copydoc_grid2_tbody']/tr[1]/td[1]")
public static WebElement cd_SelectClub1stRow1stColumn;


@FindBy(xpath="//tbody[@id='id_copydoc_grid2_tbody']/tr/td[4]")
public static List<WebElement> cd_Club4thColumnList;


@FindBy(xpath="//tbody[@id='id_copydoc_grid2_tbody']/tr/td[5]")
public static List<WebElement> cd_Club5thColumnList;

@FindBy(xpath="//tbody[@id='id_copydoc_grid2_tbody']/tr/td[6]")
public static List<WebElement> cd_Club6thColumnList;

@FindBy(xpath="//tbody[@id='id_copydoc_grid2_tbody']/tr/td[7]")
public static List<WebElement> cd_Club7thColumnList;

@FindBy(xpath="//tbody[@id='id_copydoc_grid2_tbody']/tr/td[8]")
public static List<WebElement> cd_Club8thColumnList;

@FindBy(xpath="//tbody[@id='id_copydoc_grid2_tbody']/tr/td[9]")
public static List<WebElement> cd_Club9thColumnList;


@FindBy(xpath="//tbody[@id='id_copydoc_grid2_tbody']/tr[1]/td")
public static List<WebElement> cd_SelectClub1stRowsList;

@FindBy(xpath="//tbody[@id='id_copydoc_grid2_tbody']/tr[2]/td")
public static List<WebElement> cd_SelectClub2ndRowsList;

@FindBy(xpath="//tbody[@id='id_copydoc_grid2_tbody']/tr[3]/td")
public static List<WebElement> cd_SelectClub3rdRowsList;

@FindBy(xpath="//tbody[@id='id_copydoc_grid2_tbody']/tr[4]/td")
public static List<WebElement> cd_SelectClub4thRowsList;


@FindBy(xpath="//tbody[@id='id_transaction_entry_detail_table_body']/tr")
public static List<WebElement> cd_VoucherRowsList;


@FindBy(xpath="//tbody[@id='id_transaction_entry_detail_table_body']/tr/td[3]")
public static List<WebElement> cd_Voucher3rdColumnList;

@FindBy(xpath="//tbody[@id='id_transaction_entry_detail_table_body']/tr/td[4]")
public static List<WebElement> cd_Voucher4thColumnList;

@FindBy(xpath="//tbody[@id='id_transaction_entry_detail_table_body']/tr/td[5]")
public static List<WebElement> cd_Voucher5thColumnList;



@FindBy(xpath="//tbody[@id='id_transaction_entry_detail_table_body']/tr/td[6]")
public static List<WebElement> cd_Voucher6thColumnList;



@FindBy(xpath="//tbody[@id='id_transaction_entry_detail_table_body']/tr/td[7]")
public static List<WebElement> cd_Voucher7thColumnList;


@FindBy(xpath="//tbody[@id='id_transaction_entry_detail_table_body']/tr/td[8]")
public static List<WebElement> cd_Voucher8thColumnList;


@FindBy(xpath="//tbody[@id='id_transaction_entry_detail_table_body']/tr/td[9]")
public static List<WebElement> cd_Voucher9thColumnList;






	
	public boolean checkLoginTOMaintainQuantityCompany() throws InterruptedException
	{

		 getDriver().navigate().refresh();
		 Thread.sleep(1999);
		 
		

		LoginPage lp=new LoginPage(getDriver()); 

		String unamelt="su";
				      
		String pawslt="su";
				      
		LoginPage.enterUserName(unamelt);

		Thread.sleep(1000);
				
		LoginPage.enterPassword(pawslt);

		String compname="Maintain Quantity and Value by Warehouse";

		 Select oSelect = new Select(companyDropDownList);
		// oSelect.selectByValue("36");
		 
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
			
	        Thread.sleep(1000);
			
			LoginPage.clickOnSignInBtn();
				
			//checkRefershPopOnlogin();
			        
		//checkPopUpWindow();

		//Thread.sleep(2000);
				           	
		String userInfo=userNameDisplay.getText();
				    	
		System.out.println("User Info : "+userInfo);
				    	
		System.out.println("User Info Capture Text :"+userNameDisplay.getText());
				    	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));
				    	
		companyLogo.click();
				    	
		if(homeMenu.isDisplayed()==true)
		{

			System.out.println("Test Pass :Logined to Automation Company");
			return true;
			
		}
		else
		{
			System.out.println("Test Fail :Logined to BRS Company");
				return false;

			}
		
	}
	
	
	
	
	

public boolean  checkCopyDocumentScreeninStockTransferVoucher() throws InterruptedException
{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
	inventoryMenu.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
	inventoryTransactionsMenu.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsStocksMenu));
	inventoryTransactionsStocksMenu.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(stockTransfersVoucher));
	stockTransfersVoucher.click();

	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newBtn));
	newBtn.click();
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(toggleBtn));
	toggleBtn.click();

	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(copyDocumentOption));
	copyDocumentOption.click();

	Thread.sleep(4000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_VoucherTypeDropDown));
	
	boolean actVoucherTypeDisplayed=cd_VoucherTypeDropDown.isDisplayed();
	boolean expVoucherTypeDisplayed=true;
	
	cd_VoucherTypeDropDown.click();
	cd_VoucherTypeDropDown.sendKeys(Keys.HOME,Keys.SHIFT,Keys.END);
	cd_VoucherTypeDropDown.sendKeys(Keys.SPACE);
	
	
	int count=cd_VoucherTypeList.size();
	
	ArrayList<String> voucherTypeListArray = new ArrayList<String>();
	for(int i=1;i<count;i++)
	{
		String data = cd_VoucherTypeList.get(i).getText();
		voucherTypeListArray.add(data);
	}
	String actVoucherTypeList = voucherTypeListArray.toString();
	String expVoucherTypeList = "[Delivery Notes, Excesses in Stocks, Hire-Purchase Sales, Issues to Production, Job Order, Job orders, Job Work Issues, Job Work Receipts, Material Receipt Notes, Material Requisition, New PV, New sales invoice, NEW SO, Opening StockN, Opening Stocks, Payroll Postings, POS Sales, Production Order, Production Process, Purchases Orders, Purchases Quotations, Purchases Returns, Purchases Vouchers, Receipts from production, Request For Quote, Returns from Shop Floor, sales invoice N, Sales Invoices, Sales Orders, Sales Quotations, Sales Returns, Shortages in Stock, Stock adjustment, Stock in, Stock out, Stock revaluation, Stock Transfers]";
	
	
	System.out.println("************************************checkSearchColumnList********************************************");
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_SelectSearchColumn));
	Select s=new Select(cd_SelectSearchColumn);
	Thread.sleep(2000);
	ArrayList<String> searchColumnListArray = new ArrayList<String>();
	for(WebElement e:s.getOptions())
	{
		searchColumnListArray.add(e.getText());
	}
	
	String actSearchColList = searchColumnListArray.toString();
	String expSearchColList = "[All Columns, Date, Voucher No, Created by, Modified by, Created date, Modified date, Created time, Modified time, Suspended, AuthStatus, Balance link value, Link status]";
	
	
	System.out.println("************************************checkSearchTypeList********************************************");
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_SelectSearchType));
	Select s1=new Select(cd_SelectSearchType);
	Thread.sleep(2000);
	ArrayList<String> searchTypeListArray = new ArrayList<String>();
	for(WebElement e:s1.getOptions())
	{
		searchTypeListArray.add(e.getText());
	}
	
	String actSearchTypeList = searchTypeListArray.toString();
	String expSearchTypeList = "[Containing, Beginning, Ending]";
	
	
	
	
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_RefreshBtn));
	boolean actRefreshBtnDisplayed=cd_RefreshBtn.isDisplayed();
	boolean actFilterBtnDisplayed=cd_FilterBtn.isDisplayed();
	boolean actSelectAllBtnDisplayed=cd_SelectAllBtn.isDisplayed();
	boolean actFirstBtnDisplayed=cd_FirstBtn.isDisplayed();
	boolean actPreviousBtnDisplayed=cd_PreviousBtn.isDisplayed();
	boolean actPageNumberBtnDisplayed=cd_PageNumberTxt.isDisplayed();
	boolean actNextBtnDisplayed=cd_NextBtn.isDisplayed();
	boolean actLastBtnDisplayed=cd_LastBtn.isDisplayed();
	boolean actOKBtnDisplayed=cd_OKBtn.isDisplayed();
	boolean actOkBtnDisplayed=cd_OkBtn.isDisplayed();
	boolean actCancelBtnDisplayed=cd_CancelBtn.isDisplayed();
	
	
	
	boolean expRefreshBtnDisplayed=true;
	boolean expFilterBtnDisplayed=true;
	boolean expSelectAllBtnDisplayed=true;
	boolean expFirstBtnDisplayed=true;
	boolean expPreviousBtnDisplayed=true;
	boolean expPageNumberBtnDisplayed=true;
	boolean expNextBtnDisplayed=true;
	boolean expLastBtnDisplayed=true;
	boolean expOKBtnDisplayed=true;
	boolean expOkBtnDisplayed=true;
	boolean expCancelBtnDisplayed=true;
	
	

	System.out.println("************************************checkCopyDocument********************************************");
	
	System.out.println("actVoucherTypeDisplayed  : "+actVoucherTypeDisplayed);
	System.out.println("expVoucherTypeDisplayed  : "+expVoucherTypeDisplayed);
	
	System.out.println("actVoucherTypeList  : "+actVoucherTypeList);
	System.out.println("expVoucherTypeList  : "+expVoucherTypeList);
	
	System.out.println("actSearchColList  : "+actSearchColList);
	System.out.println("expSearchColList  : "+expSearchColList);
	
	System.out.println("actSearchTypeList  : "+actSearchTypeList);
	System.out.println("expSearchTypeList  : "+expSearchTypeList);
	
	
	
	System.out.println("actRefreshBtnDisplayed  : "+actRefreshBtnDisplayed);
	System.out.println("expRefreshBtnDisplayed  : "+expRefreshBtnDisplayed);
	
	System.out.println("actFilterBtnDisplayed  : "+actFilterBtnDisplayed);
	System.out.println("expFilterBtnDisplayed  : "+expFilterBtnDisplayed);
	
	System.out.println("actSelectAllBtnDisplayed  : "+actSelectAllBtnDisplayed);
	System.out.println("expSelectAllBtnDisplayed  : "+expSelectAllBtnDisplayed);
	
	System.out.println("actFirstBtnDisplayed  : "+actFirstBtnDisplayed);
	System.out.println("expFirstBtnDisplayed  : "+expFirstBtnDisplayed);
	
	System.out.println("actPreviousBtnDisplayed  : "+actPreviousBtnDisplayed);
	System.out.println("expPreviousBtnDisplayed  : "+expPreviousBtnDisplayed);
	
	System.out.println("actPageNumberBtnDisplayed  : "+actPageNumberBtnDisplayed);
	System.out.println("expPageNumberBtnDisplayed  : "+expPageNumberBtnDisplayed);
	
	System.out.println("actNextBtnDisplayed  : "+actNextBtnDisplayed);
	System.out.println("expNextBtnDisplayed  : "+expNextBtnDisplayed);
	
	System.out.println("actLastBtnDisplayed  : "+actLastBtnDisplayed);
	System.out.println("expLastBtnDisplayed  : "+expLastBtnDisplayed);
	
	System.out.println("actOKBtnDisplayed  : "+actOKBtnDisplayed);
	System.out.println("expOKBtnDisplayed  : "+expOKBtnDisplayed);
	
	System.out.println("actOkBtnDisplayed  : "+actOkBtnDisplayed);
	System.out.println("expOkBtnDisplayed  : "+expOkBtnDisplayed);
	
	System.out.println("actCancelBtnDisplayed  : "+actCancelBtnDisplayed);
	System.out.println("expCancelBtnDisplayed  : "+expCancelBtnDisplayed);
	
	
	if(actVoucherTypeList.equalsIgnoreCase(expVoucherTypeList)&& actSearchColList.equalsIgnoreCase(expSearchColList)
			&&actSearchTypeList.equalsIgnoreCase(expSearchTypeList)
			&&actRefreshBtnDisplayed==expRefreshBtnDisplayed && actFilterBtnDisplayed==expFilterBtnDisplayed
			&& actSelectAllBtnDisplayed==expSelectAllBtnDisplayed && actFirstBtnDisplayed==expFirstBtnDisplayed
			&& actPreviousBtnDisplayed==expPreviousBtnDisplayed && actPageNumberBtnDisplayed==expPageNumberBtnDisplayed
			&& actNextBtnDisplayed==expNextBtnDisplayed && actLastBtnDisplayed==expLastBtnDisplayed &&
			actOKBtnDisplayed==expOKBtnDisplayed && actOkBtnDisplayed==expOkBtnDisplayed
			&& actCancelBtnDisplayed== expCancelBtnDisplayed)
	{
		return true;
	}
	else
	{
		return false;
	}
	
		
}


public boolean checkVoucherTypeinCopyDocument() throws InterruptedException
{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_VoucherTypeDropDown));
	cd_VoucherTypeDropDown.click();
	
	cd_VoucherTypeDropDown.sendKeys(Keys.HOME,Keys.SHIFT,Keys.END);
	cd_VoucherTypeDropDown.sendKeys(Keys.SPACE);
	cd_VoucherTypeDropDown.sendKeys("Cash-Sales");
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_FilterBtn));
	cd_FilterBtn.click();
	Thread.sleep(2000);
	
	boolean actCopyTable = copyTable.getText().isEmpty();
	boolean expCopyTable = true;
	
	
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_VoucherTypeDropDown));
	cd_VoucherTypeDropDown.click();
	
	cd_VoucherTypeDropDown.sendKeys(Keys.HOME,Keys.SHIFT,Keys.END);
	cd_VoucherTypeDropDown.sendKeys(Keys.SPACE);
	cd_VoucherTypeDropDown.sendKeys("Stock Transfers");
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_FilterBtn));
	cd_FilterBtn.click();
	Thread.sleep(2000);
	
	boolean actCopyTable1 = copyTable.getText().isEmpty();
	boolean expCopyTable1 = false;
	
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_Select1stRow1stColumn));
	int reportsRow1ListCount = cd_Select1stRow.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=0;i<reportsRow1ListCount;i++)
	{
		String data = cd_Select1stRow.get(i).getText();
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[, 03/09/2021, 71, SU, SU, 16/11/2022, 16/11/2022, 18:00:36, 18:00:36, False, Authorized, , ]";
	
	Thread.sleep(2000);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_LastBtn));
	cd_LastBtn.click();
	Thread.sleep(2000);
	
	int pages=Integer.parseInt(cd_PageNo.getText());
	System.err.println(pages);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_FirstBtn));
	cd_FirstBtn.click();
	Thread.sleep(2000);
	
	int rows=getDriver().findElements(By.xpath("//table[@id='id_copydoc_TranTable']/tbody/tr")).size();
	
	System.err.println(rows);
	
	String beforePath="//table[@id='id_copydoc_TranTable']/tbody/tr[";
	String afterPath="]//td[3]";
	int j=0, k;
	label1:
	for(int i=0;i<pages;i++)
	{
		System.err.println("i: "+i);
		
		if(copyTable.getText().isEmpty())
		{
			System.err.println("No Data");
			break label1;
		}
		
		rows=getDriver().findElements(By.xpath("//table[@id='id_copydoc_TranTable']/tbody/tr")).size();
	
				for( j=1;j<=rows;j++)
				{
									
					String text=getDriver().findElement(By.xpath(beforePath + j + afterPath)).getText();
					Thread.sleep(1500);
				
		
					if(text.equals("1"))
					{	
						break label1;
					}
					
				}
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_NextBtn));
		cd_NextBtn.click();
								
	}	
	
	int reportsLastRowListCount = (getDriver().findElements(By.xpath(beforePath + j +"]//td"))).size();
	System.err.println("Count: "+reportsLastRowListCount);
	
	ArrayList<String> reportsLastRowListArray = new ArrayList<String>();
	for(int i=0;i<reportsLastRowListCount;i++)
	{
		String data = (getDriver().findElements(By.xpath(beforePath + j +"]//td"))).get(i).getText();
		System.err.println(data);
		reportsLastRowListArray.add(data);
	}
	String actLastRow1List = reportsLastRowListArray.toString();
	String expLastRow1List = "[, 02/10/2020, 1, SU, SU, 14/10/2020, 14/10/2020, 12:52:54, 12:52:54, False, Authorized, , ]";
	
	
	
	
	

System.out.println("************************************checkCopyDocument********************************************");
	
	System.out.println("actCopyTableEmpty  : "+actCopyTable);
	System.out.println("expCopyTableEmpty  : "+expCopyTable);
	

	
	System.out.println("actCopyTableNotEmpty  : "+actCopyTable1);
	System.out.println("expCopyTableNotEmpty  : "+expCopyTable1);
	
	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	
	System.out.println("actLastRow1List  : "+actLastRow1List);
	System.out.println("expLastRow1List  : "+expLastRow1List);
	
	
	
	
	if(actCopyTable==expCopyTable && actCopyTable1==expCopyTable1 && actRow1List.equalsIgnoreCase(expRow1List)
			&& actLastRow1List.equalsIgnoreCase(expLastRow1List))
			
	{
		return true;
	}
	else
	{
		return false;
	}

}



public boolean checkSerachOptioninCopyDocument() throws InterruptedException
{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_RefreshBtn));
	cd_RefreshBtn.click();
	
	Thread.sleep(3000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_SelectSearchColumn));
	cd_SelectSearchColumn.click();
	Select s=new Select(cd_SelectSearchColumn);
	//s.selectByVisibleText("Suspended ");
	s.selectByIndex(1);
	
	Thread.sleep(20000);
	cd_SelectSearchColumn.sendKeys(Keys.TAB);
	
	cd_SelectSearchType.click();
	Select s1=new Select(cd_SelectSearchType);
	s1.selectByVisibleText("Containing");
	Thread.sleep(2000);
	cd_SelectSearchType.sendKeys(Keys.TAB);
	
	cd_SearchTxt.click();
	cd_SearchTxt.sendKeys("03/09/2021");
	
	cd_SearchTxt.sendKeys(Keys.TAB);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_SearchIcon));
	cd_SearchIcon.click();
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_Select1stRow2ndColumn));
	String actSelectedRow=cd_Select1stRow2ndColumn.getAttribute("style");
	String expSelectedRow="text-align: left; color: rgb(0, 0, 0); background-color: rgb(204, 204, 204);";
	
	System.out.println("actSelectedRow  : "+actSelectedRow);
	System.out.println("expSelectedRow  : "+expSelectedRow);
	if(actSelectedRow.equalsIgnoreCase(expSelectedRow))
	{
		return true;
	}
	else
	{
		return false;
	}
	
}

public boolean checkFilterOptioninCopyDocument() throws InterruptedException
{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_RefreshBtn));
	cd_RefreshBtn.click();
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_FilterBtn));
	cd_FilterBtn.click();
	Thread.sleep(1500);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_FilterCustomizeBtn));
	cd_FilterCustomizeBtn.click();
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_FilterDocNoChkBox));
	if(cd_FilterDocNoChkBox.isSelected()==false)
	{
		cd_FilterDocNoChkBox.click();
	}
	Thread.sleep(1000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_FilterCustomize_OkBtn));
	cd_FilterCustomize_OkBtn.click();
	Thread.sleep(1000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_FilterDocNoDefaultFilterTxt));
	cd_FilterDocNoDefaultFilterTxt.click();
	cd_FilterDocNoDefaultFilterTxt.sendKeys("55");
	Thread.sleep(1000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_FilterOkBtn));
	cd_FilterOkBtn.click();
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_Select1stRow1stColumn));
	int reportsRow1ListCount = cd_Select1stRow.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=1;i<reportsRow1ListCount;i++)
	{
		String data = cd_Select1stRow.get(i).getText();
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[12/05/2021, 55, SU, SU, 07/06/2021, 07/06/2021, 18:26:39, 18:26:39, False, Authorized, , ]";
	
	
	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	if(actRow1List.equalsIgnoreCase(expRow1List))
	{
		return true;
	}
	else
	{
		return false;
	}
	
	
	
}


public boolean checkClubSimilarCheckBoxinCopyDocument() throws InterruptedException
{
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_FilterBtn));
	cd_FilterBtn.click();
	Thread.sleep(1500);
	
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_advnFilterTxtField));
	cd_advnFilterTxtField.sendKeys(Keys.SHIFT,Keys.HOME);
	cd_advnFilterTxtField.sendKeys("5");
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_FilterOkBtn));
	cd_FilterOkBtn.click();
	Thread.sleep(2000);
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_Select1stRow1stColumn));
	int rowCount=cd_SelectRowsList.size();
	System.err.println("Rows Count Before Club Option:" + rowCount);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_Select1stRow1stColumn));
	if(cd_Select1stRow1stColumn.isSelected()==false)
	{
		cd_Select1stRow1stColumn.click();
	}
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_Select2ndRow1stColumn));
	if(cd_Select2ndRow1stColumn.isSelected()==false)
	{
		cd_Select2ndRow1stColumn.click();
	}
	
	
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_ClubSimilarTransChkBox));
	if(cd_ClubSimilarTransChkBox.isSelected()==false)
	{
		cd_ClubSimilarTransChkBox.click();
	}
	Thread.sleep(2000);
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_SelectClub1stRow1stColumn));
	int rowCount1=cd_SelectRowsListafterClub.size();
	System.err.println("Rows Count After Club Option:" + rowCount1);
	
	
	int reportsRow1ListCount = cd_SelectClub1stRowsList.size();
	ArrayList<String> reportsRow1ListArray = new ArrayList<String>();
	for(int i=2;i<reportsRow1ListCount;i++)
	{
		String data = cd_SelectClub1stRowsList.get(i).getText();
		reportsRow1ListArray.add(data);
	}
	String actRow1List = reportsRow1ListArray.toString();
	String expRow1List = "[TEST, BR-BATCH, 6, 33, 198, 10.7777, 10.7777, 10072021PS, , , ]";
	
	
	int reportsRow2ListCount = cd_SelectClub2ndRowsList.size();
	ArrayList<String> reportsRow2ListArray = new ArrayList<String>();
	for(int i=2;i<reportsRow2ListCount;i++)
	{
		String data = cd_SelectClub2ndRowsList.get(i).getText();
		reportsRow2ListArray.add(data);
	}
	String actRow2List = reportsRow2ListArray.toString();
	String expRow2List = "[TEST, FIFO-BIN, 3, 33, 99, 1.7777, 10.4242, , BIN2, BIN3, ]";
	
	
	int reportsRow3ListCount = cd_SelectClub3rdRowsList.size();
	ArrayList<String> reportsRow3ListArray = new ArrayList<String>();
	for(int i=2;i<reportsRow3ListCount;i++)
	{
		String data = cd_SelectClub3rdRowsList.get(i).getText();
		reportsRow3ListArray.add(data);
	}
	String actRow3List = reportsRow3ListArray.toString();
	String expRow3List = "[TEST, WA-RMA, 6, 33, 198, 8.2731, 9.2085, , , , 10072021PS6,10072021PS7,10072021PS8]";
	
	
	int reportsRow4ListCount = cd_SelectClub4thRowsList.size();
	ArrayList<String> reportsRow4ListArray = new ArrayList<String>();
	for(int i=2;i<reportsRow4ListCount;i++)
	{
		String data = cd_SelectClub4thRowsList.get(i).getText();
		reportsRow4ListArray.add(data);
	}
	String actRow4List = reportsRow4ListArray.toString();
	String expRow4List = "[TEST, FIFO-BIN, 3, 33, 99, 6.1111, 10.3636, , BIN2, BIN3, ]";
	
	
	
	System.out.println("************************************checkClubItems********************************************");
	
	System.out.println("actRow1List  : "+actRow1List);
	System.out.println("expRow1List  : "+expRow1List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow2List  : "+actRow2List);
	System.out.println("expRow2List  : "+expRow2List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow3List  : "+actRow3List);
	System.out.println("expRow3List  : "+expRow3List);
	System.out.println("*********************************************************************");
			
	System.out.println("actRow4List  : "+actRow4List);
	System.out.println("expRow4List  : "+expRow4List);
	System.out.println("*********************************************************************");
	
	
	if(actRow1List.equalsIgnoreCase(expRow1List) && actRow2List.equalsIgnoreCase(expRow2List) 
			&& actRow3List.equalsIgnoreCase(expRow3List) && actRow4List.equalsIgnoreCase(expRow4List))
	
	{
		
		return true;
	}
	
	else
	{
		return false;
	}
	
}


public boolean checkColumnValuesafterClubinStockTransferVoucher() throws InterruptedException
{
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_SelectClub1stRow1stColumn));
	
	int reportsCol4ListCount = cd_Club4thColumnList.size();
	ArrayList<String> reportsCol4ListArray = new ArrayList<String>();
	for(int i=0;i<reportsCol4ListCount;i++)
	{
		String data = cd_Club4thColumnList.get(i).getText();
		reportsCol4ListArray.add(data);
	}
	String actCol4List = reportsCol4ListArray.toString();
	
	
	int reportsCol5ListCount = cd_Club5thColumnList.size();
	ArrayList<String> reportsCol5ListArray = new ArrayList<String>();
	for(int i=0;i<reportsCol5ListCount;i++)
	{
		String data = cd_Club5thColumnList.get(i).getText();
		reportsCol5ListArray.add(data);
	}
	String actCol5List = reportsCol5ListArray.toString();
	
	
	int reportsCol6ListCount = cd_Club5thColumnList.size();
	ArrayList<String> reportsCol6ListArray = new ArrayList<String>();
	for(int i=0;i<reportsCol6ListCount;i++)
	{
		String data = cd_Club6thColumnList.get(i).getText();
		reportsCol6ListArray.add(data);
	}
	String actCol6List = reportsCol6ListArray.toString();
	
	
	int reportsCol7ListCount = cd_Club7thColumnList.size();
	ArrayList<String> reportsCol7ListArray = new ArrayList<String>();
	for(int i=0;i<reportsCol7ListCount;i++)
	{
		String data = cd_Club7thColumnList.get(i).getText();
		reportsCol7ListArray.add(data);
	}
	String actCol7List = reportsCol7ListArray.toString();
	
	
	
	int reportsCol8ListCount = cd_Club8thColumnList.size();
	ArrayList<String> reportsCol8ListArray = new ArrayList<String>();
	for(int i=0;i<reportsCol8ListCount;i++)
	{
		String data = cd_Club8thColumnList.get(i).getText();
		reportsCol8ListArray.add(data);
	}
	String actCol8List = reportsCol8ListArray.toString();
	
	
	
	int reportsCol9ListCount = cd_Club9thColumnList.size();
	ArrayList<String> reportsCol9ListArray = new ArrayList<String>();
	for(int i=0;i<reportsCol9ListCount;i++)
	{
		String data = cd_Club9thColumnList.get(i).getText();
		reportsCol9ListArray.add(data);
	}
	String actCol9List = reportsCol9ListArray.toString();
	
	
	Thread.sleep(2000);
	
	
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cd_OkBtn));
	cd_OkBtn.click();
	Thread.sleep(2000);
	
	getWaitForAlert();
	System.err.println("Alert Text: "+getAlert().getText());
	Thread.sleep(2000);
	getAlert().accept();
	Thread.sleep(3000);
	
	int reportsVoucherCol3ListCount = cd_Voucher3rdColumnList.size();
	ArrayList<String> reportsVoucherCol3ListArray = new ArrayList<String>();
	for(int i=0;i<reportsVoucherCol3ListCount;i++)
	{
		String data = cd_Voucher3rdColumnList.get(i).getText();
		reportsVoucherCol3ListArray.add(data);
	}
	String expVoucherCol3List = reportsVoucherCol3ListArray.toString();
	
	
	Thread.sleep(2000);
	
	
	int reportsVoucherCol4ListCount = cd_Voucher4thColumnList.size();
	ArrayList<String> reportsVoucherCol4ListArray = new ArrayList<String>();
	for(int i=0;i<reportsVoucherCol4ListCount;i++)
	{
		String data = cd_Voucher4thColumnList.get(i).getText();
		reportsVoucherCol4ListArray.add(data);
	}
	String expVoucherCol4List = reportsVoucherCol4ListArray.toString();
	
	
	int reportsVoucherCol5ListCount = cd_Voucher5thColumnList.size();
	ArrayList<String> reportsVoucherCol5ListArray = new ArrayList<String>();
	for(int i=0;i<reportsVoucherCol5ListCount;i++)
	{
		String data = cd_Voucher5thColumnList.get(i).getText();
		reportsVoucherCol5ListArray.add(data);
	}
	String expVoucherCol5List = reportsVoucherCol5ListArray.toString();
	
	
	int reportsVoucherCol6ListCount = cd_Voucher6thColumnList.size();
	ArrayList<String> reportsVoucherCol6ListArray = new ArrayList<String>();
	for(int i=0;i<reportsVoucherCol6ListCount;i++)
	{
		String data = cd_Voucher6thColumnList.get(i).getText();
		reportsVoucherCol6ListArray.add(data);
	}
	String expVoucherCol6List = reportsVoucherCol6ListArray.toString();
	
	int reportsVoucherCol7ListCount = cd_Voucher7thColumnList.size();
	ArrayList<String> reportsVoucherCol7ListArray = new ArrayList<String>();
	for(int i=0;i<reportsVoucherCol7ListCount;i++)
	{
		String data = cd_Voucher7thColumnList.get(i).getText();
		reportsVoucherCol7ListArray.add(data);
	}
	String expVoucherCol7List = reportsVoucherCol7ListArray.toString();
	
	
	int reportsVoucherCol8ListCount = cd_Voucher8thColumnList.size();
	ArrayList<String> reportsVoucherCol8ListArray = new ArrayList<String>();
	for(int i=0;i<reportsVoucherCol8ListCount;i++)
	{
		String data = cd_Voucher8thColumnList.get(i).getText();
		reportsVoucherCol8ListArray.add(data);
	}
	String expVoucherCol8List = reportsVoucherCol8ListArray.toString();
	
	System.out.println("*******************Columns List after Club******************************");
	
	System.out.println("actCol4List  		: "+actCol4List);
	System.out.println("actVoucherCol3List  : "+expVoucherCol3List);
	System.out.println("*********************************************************************");
			
	System.out.println("actCol5List  		: "+actCol5List);
	System.out.println("actVoucherCol4List  : "+expVoucherCol4List);
	
	System.out.println("*********************************************************************");
			
	System.out.println("actCol6List  		: "+actCol6List);
	System.out.println("actVoucherCol5List  : "+expVoucherCol5List);
	
	System.out.println("*********************************************************************");
			
	System.out.println("actCol7List  		: "+actCol7List);
	System.out.println("actVoucherCol6List  : "+expVoucherCol6List);
	
	System.out.println("*********************************************************************");
	
	
	System.out.println("actCol8List  		: "+actCol8List);
	System.out.println("actVoucherCol7List  : "+expVoucherCol7List);
	
	System.out.println("*********************************************************************");
	
	
	System.out.println("actCol9List  		: "+actCol9List);
	System.out.println("actVoucherCol8List  : "+expVoucherCol8List);
	
	
	System.out.println("*********************************************************************");
	
	
	
if(actCol4List.equalsIgnoreCase(expVoucherCol3List) && actCol5List.equalsIgnoreCase(expVoucherCol4List) 
		&& actCol6List.equalsIgnoreCase(expVoucherCol5List) && actCol7List.equalsIgnoreCase(expVoucherCol6List) 
		&& actCol8List.equalsIgnoreCase(expVoucherCol7List) && actCol9List.equalsIgnoreCase(expVoucherCol8List)  )	
{
	return true;
}
else
{
	return false;
}
	
}



	public CopyDocumentPage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}



}
