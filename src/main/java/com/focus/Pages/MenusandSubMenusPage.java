package com.focus.Pages;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import com.focus.base.BaseEngine;

public class MenusandSubMenusPage extends BaseEngine {
	
	
	//private static final List<WebElement> subMenusUnderMiscellaneousAnalysisMenuList = null;

	//Home Menu
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li")
	public static List<WebElement> subMenusunderHomeMenuList;
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[1]/ul/li")
	public static List<WebElement> subMenusunderCompanyMenuList;
	
	@FindBy(xpath="//*[@id='3']")
	public static WebElement newCompanyMenu;
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[1]/ul/li[2]/ul/li")
	public static List<WebElement> subMenusUnderNewCompanyMenuList;
	
	
	@FindBy(xpath="//*[@id='131']")
	public static WebElement yearEndProcessMenu;
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[1]/ul/li[5]/ul/li")
	public static List<WebElement> subMenusUnderYearEndProcessMenuList;
	
	
	@FindBy(xpath="//*[@id='125']")
	public static WebElement interCompanyTransactionsMenu;
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[1]/ul/li[6]/ul/li")
	public static List<WebElement> subMenusUnderinterCompanyTransactionsMenuList;
	
	@FindBy(xpath="//*[@id='6']")
	public static WebElement securityMenu;
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[2]/ul/li")
	public static List<WebElement> subMenusUnderSecurityMenuList;
	
	@FindBy(xpath="//*[@id='221']")
	public static WebElement itemMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[3]/ul/li[3]/ul/li")
	public static List<WebElement> subMenuUnderItemMenuList;
	
	
	@FindBy(xpath="//*[@id='8002']")
	public static WebElement schemesMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[3]/ul/li[4]/ul/li")
	public static List<WebElement> subMenuUnderSchemesMenuList;
	
	
	
	//@FindBy(xpath="(//span[contains(text(),'Discount Definition')])[1]")
	@FindBy(xpath="//*[@id='8015']/span")
	public static WebElement schemesDiscountDefinitionMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[3]/ul/li[4]/ul/li[3]/ul/li")
	public static List<WebElement> subMenuUnderSchemesDiscountDefinitionMenuList;
	
	
	@FindBy(xpath="//*[@id='224']")
	public static WebElement MRPMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[3]/ul/li[5]/ul/li")
	public static List<WebElement> subMenuUnderMRPMenuList;
	
	
	@FindBy(xpath="//*[@id='225']")
	public static WebElement QCMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[3]/ul/li[6]/ul/li")
	public static List<WebElement> subMenuUnderQCMenuList;
	
	@FindBy(xpath="//*[@id='251']")
	public static WebElement maintainanceMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[3]/ul/li[7]/ul/li")
	public static List<WebElement> subMenuUnderMaintainanceMenuList;
	
	@FindBy(xpath="//*[@id='8001']")
	public static WebElement pointOfSaleMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[3]/ul/li[8]/ul/li")
	public static List<WebElement> subMenuUnderPointOfSaleMenuList;
	
	@FindBy(xpath="//*[@id='8005']")
	public static WebElement pointOfSaleMemberMenu;
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[3]/ul/li[8]/ul/li[1]/ul/li")
	public static List<WebElement> subMenuUnderPointOfSaleMemberMenuList;
	
	@FindBy(xpath="//*[@id='8006']")
	public static WebElement pointOfSaleGiftVoucherMenu;
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[3]/ul/li[8]/ul/li[2]/ul/li")
	public static List<WebElement> subMenuUnderPointOfSaleGiftVoucherMenuList;
	
	@FindBy(xpath="//*[@id='8035']")
	public static WebElement pointOfSaleDiscountVoucherMenu;
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[3]/ul/li[8]/ul/li[3]/ul/li")
	public static List<WebElement> subMenuUnderPointOfSaleDiscountVoucherMenuList;
	
	@FindBy(xpath="//*[@id='1025']")
	public static WebElement pointOfSaleTableManagementMenu;
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[3]/ul/li[8]/ul/li[4]/ul/li")
	public static List<WebElement> subMenuUnderPointOfSaleTableManagementMenuList;
	
	
	@FindBy(xpath="//*[@id='1103']")
	public static WebElement payrollMenu;
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[3]/ul/li[9]/ul/li")
	public static List<WebElement> subMenuUnderPayrollMenuList;
	
	
	//Financial Menu
	@FindBy(xpath="//*[@id='62']")
	public static WebElement creditManagementMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[2]/ul/li")
	public static List<WebElement> subMenusUnderCreditManagementMenuList;
	
	@FindBy(xpath="//*[@id='217']")
	public static WebElement delinquencyMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[2]/ul/li[5]/ul/li")
	public static List<WebElement> subMenusUnderdelinquencyMenuList;
	
	
	@FindBy(xpath="//*[@id='81']")
	public static WebElement reportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li")
	public static List<WebElement> subMenusUnderReportsMenuList;
	
	@FindBy(xpath="//*[@id='82']")
	public static WebElement reportsCashAndBankBooksMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li[4]/ul/li")
	public static List<WebElement> subMenusUnderReportsCashBankBooksMenuList;
	
	
	@FindBy(xpath="//*[@id='502']")
	public static WebElement salesReportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li[5]/ul/li")
	public static List<WebElement> subMenusUnderSalesReportsMenuList;
	
	@FindBy(xpath="//*[@id='506']")
	public static WebElement purchaseReportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li[6]/ul/li")
	public static List<WebElement> subMenusUnderPurchaseReportsMenuList;
	
	@FindBy(xpath="//*[@id='514']")
	public static WebElement registerReportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li[7]/ul/li")
	public static List<WebElement> subMenusUnderRegisterReportsMenuList;
	
	@FindBy(xpath="//*[@id='523']")
	public static WebElement salesandPurchasesAnalysisMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li[8]/ul/li")
	public static List<WebElement> subMenusUndersalesandPurchasesAnalysisMenuList;
	
	@FindBy(xpath="//*[@id='568']")
	public static WebElement miscellaneousAnalysisMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li[9]/ul/li")
	public static List<WebElement> subMenusUndermiscellaneousAnalysisMenuList;
	
	
	@FindBy(xpath="//*[@id='536']")
	public static WebElement masterInformationsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li[10]/ul/li")
	public static List<WebElement> subMenusUnderMasterInformationsMenuList;
	
	
	@FindBy(xpath="//*[@id='520']")
	public static WebElement auditTrailMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[3]/ul/li[11]/ul/li")
	public static List<WebElement> subMenusUnderAuditTrailMenuList;
	
	
	@FindBy(xpath="//*[@id='530']")
	public static WebElement finalAccountsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[4]/ul/li")
	public static List<WebElement> subMenusUnderFinalAccountsMenuList;
	
	@FindBy(xpath="//*[@id='558']")
	public static WebElement receivableandPayableAnalysisMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[5]/ul/li")
	public static List<WebElement> subMenusUnderreceivableandPayableAnalysisMenuList;
	
	@FindBy(xpath="//*[@id='605']")
	public static WebElement customerDetailMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[5]/ul/li[1]/ul/li")
	public static List<WebElement> subMenusUnderCustomerDetailMenuList;
	
	@FindBy(xpath="//*[@id='607']")
	public static WebElement customerSummaryMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[5]/ul/li[2]/ul/li")
	public static List<WebElement> subMenusUnderCustomerSummaryMenuList;
	
	@FindBy(xpath="//*[@id='606']")
	public static WebElement vendorDetailMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[5]/ul/li[3]/ul/li")
	public static List<WebElement> subMenusUnderVendorDetailMenuList;
	
	@FindBy(xpath="//*[@id='608']")
	public static WebElement vendorSummaryMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[5]/ul/li[4]/ul/li")
	public static List<WebElement> subMenusUnderVendorSummaryMenuList;
	
	@FindBy(xpath="//*[@id='3301']")
	public static WebElement budgetMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[6]/ul/li")
	public static List<WebElement> subMenusUnderBudgetMenuList;
	
	
	@FindBy(xpath="//*[@id='3304']")
	public static WebElement reviseBudgetMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[6]/ul/li[3]/ul/li")
	public static List<WebElement> subMenusUnderReviseBudgetMenuList;
	
	@FindBy(xpath="//*[@id='3321']")
	public static WebElement budgetReportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[6]/ul/li[8]/ul/li")
	public static List<WebElement> subMenusUnderBudgetReportsMenuList;
	
	
	@FindBy(xpath="//*[@id='3311']")
	public static WebElement onlinePaymentsMenu;
	
	
	
	//Inventory Menu
	
	@FindBy(xpath="//*[@id='135']")
	public static WebElement inventoryMenu;
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[7]/ul/li")
	public static List<WebElement> subMenusUnderOnlinePaymentsMenuList;
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[3]/ul/li")
	public static List<WebElement> subMenusUnderInventoryMenuList;
	
	@FindBy(xpath="//*[@id='137']")
	public static WebElement inventoryTransactionsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[3]/ul/li[1]/ul/li")
	public static List<WebElement> subMenusUnderInventoryTransactionsMenuList;
	
	@FindBy(xpath="//*[@id='139']")
	public static WebElement inventoryTransactionsPurchaseMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[3]/ul/li[1]/ul/li[1]/ul/li")
	public static List<WebElement> subMenusUnderInventoryTransactionsPurchaseMenuList;
	
	
	@FindBy(xpath="//*[@id='140']")
	public static WebElement inventoryTransactionsSalesMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[3]/ul/li[1]/ul/li[2]/ul/li")
	public static List<WebElement> subMenusUnderInventoryTransactionsSalesMenuList;
	
	
	@FindBy(xpath="//*[@id='2033']")
	public static WebElement inventoryTransactionsStocksMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[3]/ul/li[1]/ul/li[3]/ul/li")
	public static List<WebElement> subMenusUnderInventoryTransactionsStocksMenuList;
	
	
	@FindBy(xpath="//*[@id='200']")
	public static WebElement inventoryReportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[3]/ul/li[2]/ul/li")
	public static List<WebElement> subMenusUnderInventoryReportsMenuList;
	
	
	@FindBy(xpath="//*[@id='540']")
	public static WebElement inventoryBinReportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[3]/ul/li[2]/ul/li[13]/ul/li")
	public static List<WebElement> subMenusUnderInventoryBinReportsMenuList;
	
	@FindBy(xpath="//*[@id='621']")
	public static WebElement inventoryStockAgeingAnalysisReportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[3]/ul/li[2]/ul/li[15]/ul/li")
	public static List<WebElement> subMenusUnderInventoryStockAgeingAnalysisReportsMenuList;
	
	@FindBy(xpath="//*[@id='550']")
	public static WebElement inventoryOrderManagementMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[3]/ul/li[3]/ul/li")
	public static List<WebElement> subMenusUnderInventoryOrderManagementMenuList;
	
	@FindBy(xpath="//*[@id='600']")
	public static WebElement inventoryOrderManagementAnalysisOfLinkedUnLinkedDocumentsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[3]/ul/li[3]/ul/li[1]/ul/li")
	public static List<WebElement> subMenusUnderInventoryOrderManagementAnalysisOfLinkedUnLinkedDocumentsMenuList;
	
	
	//Fixed Asset
	
	@FindBy(xpath="//*[@id='136']")
	public static WebElement fixedAssetMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[4]/ul/li")
	public static List<WebElement> subMenusUnderFixedAssetMenuList;
	
	@FindBy(xpath="//*[@id='138']")
	public static WebElement fixedAssetTransactionsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[4]/ul/li[1]/ul/li")
	public static List<WebElement> subMenusUnderFixedAssetTransactionsMenuList;
	
	
	@FindBy(xpath="//*[@id='50010']")
	public static WebElement fixedAssetReportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[4]/ul/li[2]/ul/li")
	public static List<WebElement> subMenusUnderFixedAssetReportsMenuList;
	
	//Production Menu
	
	@FindBy(xpath="//*[@id='3000']")
	public static WebElement productionMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[5]/ul/li")
	public static List<WebElement> subMenusUnderProductionMenuList;
	
	
	@FindBy(xpath="//*[@id='3001']")
	public static WebElement productionTransactionsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[5]/ul/li[1]/ul/li")
	public static List<WebElement> subMenusUnderProductionTransactionsMenuList;
	
	
	@FindBy(xpath="//*[@id='625']")
	public static WebElement productionReportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[5]/ul/li[2]/ul/li")
	public static List<WebElement> subMenusUnderProductionReportsMenuList;
	
	
	@FindBy(xpath="//*[@id='3006']")
	public static WebElement productionMRPSettingsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[5]/ul/li[3]/ul/li")
	public static List<WebElement> subMenusUnderProductionMRPSettingsMenuList;
	
	//PointOfSale
	
	@FindBy(xpath="//*[@id='8000']")
	public static WebElement PointOfSaleMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[6]/ul/li")
	public static List<WebElement> subMenusUnderPointOfSaleMenuList;
	
	@FindBy(xpath="//*[@id='8004']")
	public static WebElement pointOfSalesMainScreenMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[6]/ul/li[1]/ul/li")
	public static List<WebElement> subMenusUnderPointOfSaleMainScreenMenuList;
	
	
	@FindBy(xpath="//*[@id='8500']")
	public static WebElement pointOfSalesPOSReportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[6]/ul/li[2]/ul/li")
	public static List<WebElement> subMenusUnderPointOfSalePOSReportsMenuList;
	
	//Submenus of POSReports
	
	@FindBy(xpath="//*[@id='8501']")
	public static WebElement POSReportsRetailSalesReportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[6]/ul/li[2]/ul/li[1]/ul/li")
	public static List<WebElement> subMenusUnderPOSReportsRetailSalesReportsMenuList;
	
	
	@FindBy(xpath="//*[@id='8507']")
	public static WebElement POSReportsSummarySalesReportMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[6]/ul/li[2]/ul/li[2]/ul/li")
	public static List<WebElement> subMenusUnderPOSReportsSummarySalesReportsMenuList;
	
	
	@FindBy(xpath="//*[@id='8513']")
	public static WebElement POSReportsPreorderReportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[6]/ul/li[2]/ul/li[3]/ul/li")
	public static List<WebElement> subMenusUnderPOSReportsPreorderReportsMenuList;
	
	
	@FindBy(xpath="//*[@id='8519']")
	public static WebElement POSReportsPreorderPaymentReportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[6]/ul/li[2]/ul/li[4]/ul/li")
	public static List<WebElement> subMenusUnderPOSReportsPreorderPaymentReportsMenuList;
	
	
	@FindBy(xpath="//*[@id='8523']")
	public static WebElement POSReportsMemberReportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[6]/ul/li[2]/ul/li[5]/ul/li")
	public static List<WebElement> subMenusUnderPOSReportsMemberReportsMenuList;
	
	
	@FindBy(xpath="//*[@id='8530']")
	public static WebElement POSReportsMemberPointsReportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[6]/ul/li[2]/ul/li[6]/ul/li")
	public static List<WebElement> subMenusUnderPOSReportsMemberPointsReportsMenuList;
	
	
	@FindBy(xpath="//*[@id='8535']")
	public static WebElement POSReportsItemReportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[6]/ul/li[2]/ul/li[7]/ul/li")
	public static List<WebElement> subMenusUnderPOSReportsItemReportsMenuList;
	
	
	@FindBy(xpath="//*[@id='8540']")
	public static WebElement POSReportsCashReportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[6]/ul/li[2]/ul/li[8]/ul/li")
	public static List<WebElement> subMenusUnderPOSReportsCashReportsMenuList;
	
	@FindBy(xpath="//*[@id='8545']")
	public static WebElement POSReportsStockReportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[6]/ul/li[2]/ul/li[9]/ul/li")
	public static List<WebElement> subMenusUnderPOSReportsStockReportsMenuList;
	
	
	@FindBy(xpath="//*[@id='8550']")
	public static WebElement POSReportsPeriodicSalesReportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[6]/ul/li[2]/ul/li[10]/ul/li")
	public static List<WebElement> subMenusUnderPOSReportsPeriodicSalesReportsMenuList;
	
	@FindBy(xpath="//*[@id='8556']")
	public static WebElement POSReportsLastYearComparisonReportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[6]/ul/li[2]/ul/li[11]/ul/li")
	public static List<WebElement> subMenusUnderPOSReportsLastYearComparisonReportsMenuList;
	
	
	@FindBy(xpath="//*[@id='8562']")
	public static WebElement POSReportsMiscellaneousReportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[6]/ul/li[2]/ul/li[12]/ul/li")
	public static List<WebElement> subMenusUnderPOSReportsMiscellaneousReportsMenuList;
	
	@FindBy(xpath="//*[@id='8571']")
	public static WebElement POSReportsRestaurantReportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[6]/ul/li[2]/ul/li[13]/ul/li")
	public static List<WebElement> subMenusUnderPOSReportsRestaurantReportsMenuList;
	
	//PointOfSales
	@FindBy(xpath="//*[@id='8900']")
	public static WebElement PointOfSaleTableManagementMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[6]/ul/li[3]/ul/li")
	public static List<WebElement> subMenusUnderPointOfSaleTableManagementMenuList;
	
	@FindBy(xpath="//*[@id='8003']")
	public static WebElement PointOfSaleUtilitiesMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[6]/ul/li[4]/ul/li")
	public static List<WebElement> subMenusUnderPointOfSaleUtilitiesMenuList;
	
	
	@FindBy(xpath="//*[@id='8027']")
	public static WebElement PointOfSaleUtilitiesBBQConversionMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[6]/ul/li[4]/ul/li[10]/ul/li")
	public static List<WebElement> subMenusUnderPointOfSaleUtilitiesBBQConversionMenuList;
	
	//Quality Control
	
	@FindBy(xpath="//*[@id='150']")
	public static WebElement qualityControlMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[7]/ul/li")
	public static List<WebElement> subMenusUnderQualityControlMenuList;
	
	
	@FindBy(xpath="//*[@id='151']")
	public static WebElement qualityControlTransactionsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[7]/ul/li[1]/ul/li")
	public static List<WebElement> subMenusUnderQualityControlTransactionsMenuList;
	
	@FindBy(xpath="//*[@id='152']")
	public static WebElement qualityControlReportsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[7]/ul/li[2]/ul/li")
	public static List<WebElement> subMenusUnderQualityControlReportsMenuList;
	
	
	//Settings
	
	@FindBy(xpath="//*[@id='16']")
	public static WebElement SettingsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[8]/ul/li")
	public static List<WebElement> subMenusUnderSettingsMenuList;
	
	
	public  boolean checkLogin() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{

		Thread.sleep(1999);

		LoginPage lp=new LoginPage(getDriver()); 

		String unamelt="su";

		String pawslt="su";

		lp.enterUserName(unamelt);

		Thread.sleep(2000);

		lp.enterPassword(pawslt);

	

		Select oSelect = new Select(companyDropDownList);

		oSelect.selectByValue("216");
		Thread.sleep(2000);

		lp.clickOnSignInBtn();

		

		Thread.sleep(2000);

		String userInfo=userNameDisplay.getText();

		System.out.println("User Info : "+userInfo);

		System.out.println("User Info Capture Text :"+userNameDisplay.getText());

		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyLogo));

		companyLogo.click();

		if(userInfo.equalsIgnoreCase("SU"))
		{

			System.out.println("Test Pass :Logined to Automation Company");
			return true;

		}
		else
		{
			System.out.println("Test Fail :Logined to  Automation Company");
			return false;

		}
	}
	
	
	
	public  boolean checkHomeMenuSubMenusList() throws InterruptedException
	{
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
    homeMenu.click();
    
    Thread.sleep(2000);
    
   // getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable((By) subMenusunderHomeMenuList));
    
      
    
    int subMenusunderHomeMenuListCount = subMenusunderHomeMenuList.size();
	ArrayList<String> subMenusunderHomeMenuListArray = new ArrayList<String>();
	for(int i=0;i<subMenusunderHomeMenuListCount;i++)
	{
		
		String data=subMenusunderHomeMenuList.get(i).getText();
		
		subMenusunderHomeMenuListArray.add(data);
	}
	String actsubMenusunderHomeMenuListArray = subMenusunderHomeMenuListArray.toString();
	String expsubMenusunderHomeMenuListArray = "[Company, Security, Masters, Data Management, Utilities]";

	
	
	System.out.println("*******************SubMenusUnderHomeMenu***********************************");
	
	System.out.println("Actual SubMenus:  "+"        "+ actsubMenusunderHomeMenuListArray +"   "+"Expected SubMenus Under HomeMenu"+     expsubMenusunderHomeMenuListArray);
	
	if(actsubMenusunderHomeMenuListArray.equalsIgnoreCase(expsubMenusunderHomeMenuListArray))
		return true;
	else
		return false;
	
	
	}
	

	
	
	public  boolean checkSubMenusUnderCompanyMenuList() throws InterruptedException
	{
	
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
    homeMenu.click();
    
    Thread.sleep(2000);
    
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(companyMenu));
    companyMenu.click();
    Thread.sleep(2000);
    
    
      
    
    int subMenusunderCompanyMenuListCount = subMenusunderCompanyMenuList.size();
	ArrayList<String> subMenusunderCompanyMenuListArray = new ArrayList<String>();
	for(int i=0;i<subMenusunderCompanyMenuListCount;i++)
	{
		
		String data=subMenusunderCompanyMenuList.get(i).getText();
		
		subMenusunderCompanyMenuListArray.add(data);
	}
	String actsubMenusunderCompanyMenuListArray = subMenusunderCompanyMenuListArray.toString();
	String expsubMenusunderCompanyMenuListArray = "[Open Company, New Company, Edit Company, Delete Company, Year End Process, Inter Company Transactions]";

	
	
	System.out.println("*******************SubMenusUnderCompanyMenu***********************************");
	
	System.out.println("Actual SubMenus:  "+"        "+ actsubMenusunderCompanyMenuListArray +"   "+"Expected SubMenus Under HomeMenu"+     expsubMenusunderCompanyMenuListArray);
	
	if(actsubMenusunderCompanyMenuListArray.equalsIgnoreCase(expsubMenusunderCompanyMenuListArray))
		return true;
	else
		return false;
	
	
	}
	
	
	
	public  boolean checkSubMenusUnderNewCompanyMenuList() throws InterruptedException
	{
	    
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(newCompanyMenu));
    newCompanyMenu.click();
    Thread.sleep(1000);
    
    int subMenusUnderNewCompanyMenuListCount = subMenusUnderNewCompanyMenuList.size();
	ArrayList<String> subMenusUnderNewCompanyMenuListArray = new ArrayList<String>();
	for(int i=0;i<subMenusUnderNewCompanyMenuListCount;i++)
	{
		
		String data=subMenusUnderNewCompanyMenuList.get(i).getText();
		
		subMenusUnderNewCompanyMenuListArray.add(data);
	}
	String actsubMenusUnderNewCompanyMenuListArray = subMenusUnderNewCompanyMenuListArray.toString();
	String expsubMenusUnderNewCompanyMenuListArray = "[Create Company]";

	
	
	System.out.println("*******************SubMenusUnderNewCompanyMenu***********************************");
	
	System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderNewCompanyMenuListArray +"   "+"Expected SubMenus Under HomeMenu"+     expsubMenusUnderNewCompanyMenuListArray);
	
	if(actsubMenusUnderNewCompanyMenuListArray.equalsIgnoreCase(expsubMenusUnderNewCompanyMenuListArray))
		return true;
	else
		return false;
	
	
	}
	
	
	public  boolean checkSubMenusUnderYearEndProcessMenuList() throws InterruptedException
	{
	
		    
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(yearEndProcessMenu));
    yearEndProcessMenu.click();
    Thread.sleep(1000);
    
    int subMenusUnderYearEndProcessMenuListCount = subMenusUnderYearEndProcessMenuList.size();
	ArrayList<String> subMenusUnderYearEndProcessMenuListArray = new ArrayList<String>();
	for(int i=0;i<subMenusUnderYearEndProcessMenuListCount;i++)
	{
		
		String data=subMenusUnderYearEndProcessMenuList.get(i).getText();
		
		subMenusUnderYearEndProcessMenuListArray.add(data);
	}
	String actsubMenusUnderYearEndProcessMenuListArray = subMenusUnderYearEndProcessMenuListArray.toString();
	String expsubMenusUnderYearEndProcessMenuListArray = "[Close Company, Transfer Balances to P&L, Update COGS]";

	
	
	System.out.println("*******************SubMenusUnderYearEndProcessMenu***********************************");
	
	System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderYearEndProcessMenuListArray +"   "+"Expected SubMenus Under HomeMenu"+     expsubMenusUnderYearEndProcessMenuListArray);
	
	if(actsubMenusUnderYearEndProcessMenuListArray.equalsIgnoreCase(expsubMenusUnderYearEndProcessMenuListArray))
		return true;
	else
		return false;
	
	
	}
	
	
	public  boolean checkSubMenusUnderInterCompanyTransactionsMenuList() throws InterruptedException
	{
		
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(interCompanyTransactionsMenu));
    interCompanyTransactionsMenu.click();
    Thread.sleep(1000);
    
    int subMenusUnderinterCompanyTransactionsMenuListCount = subMenusUnderinterCompanyTransactionsMenuList.size();
	ArrayList<String> subMenusUnderinterCompanyTransactionsMenuListArray = new ArrayList<String>();
	for(int i=0;i<subMenusUnderinterCompanyTransactionsMenuListCount;i++)
	{
		
		String data=subMenusUnderinterCompanyTransactionsMenuList.get(i).getText();
		
		subMenusUnderinterCompanyTransactionsMenuListArray.add(data);
	}
	String actsubMenusUnderinterCompanyTransactionsMenuListArray = subMenusUnderinterCompanyTransactionsMenuListArray.toString();
	String expsubMenusUnderinterCompanyTransactionsMenuListArray = "[Inter Company Settings, Mapping, Inbox/Outbox, Offline Import]";

	
	
	System.out.println("*******************SubMenusUnderInterCompanyTransactionsMenu***********************************");
	
	System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderinterCompanyTransactionsMenuListArray +"   "+"Expected SubMenus Under HomeMenu"+     expsubMenusUnderinterCompanyTransactionsMenuListArray);
	
	if(actsubMenusUnderinterCompanyTransactionsMenuListArray.equalsIgnoreCase(expsubMenusUnderinterCompanyTransactionsMenuListArray))
		return true;
	else
		return false;
	
	
	}
	
	
	public  boolean checkSubMenusUnderSecurityMenuList() throws InterruptedException
	{
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	homeMenu.click();
	    
	Thread.sleep(2000);
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(securityMenu));
    securityMenu.click();
    Thread.sleep(1000);
    
    int subMenusUnderSecurityMenuListCount = subMenusUnderSecurityMenuList.size();
	ArrayList<String> subMenusUnderSecurityMenuListArray = new ArrayList<String>();
	for(int i=0;i<subMenusUnderSecurityMenuListCount;i++)
	{
		
		String data=subMenusUnderSecurityMenuList.get(i).getText();
		
		subMenusUnderSecurityMenuListArray.add(data);
	}
	String actsubMenusUnderSecurityMenuListArray = subMenusUnderSecurityMenuListArray.toString();
	String expssubMenusUnderSecurityMenuListArray = "[Network Policy, Password policy, Create Profile, Create Role, Create User, Change Password, Update Personal Info, Usage Log, Currently Logged Users, User license allocation, Security log report, User rights report, Enable Fingerprint, Role rights report, Profile rights report, Fingerprint Setting]";

	
	
	System.out.println("*******************SubMenusUnderSecurityMenu***********************************");
	
	System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderSecurityMenuListArray +"   "+"Expected SubMenus Under HomeMenu"+     expssubMenusUnderSecurityMenuListArray);
	
	if(actsubMenusUnderSecurityMenuListArray.equalsIgnoreCase(expssubMenusUnderSecurityMenuListArray))
		return true;
	else
		return false;
	
	
	}
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[3]/ul/li")
	public static List<WebElement>  subMenusUnderMastersMenuList;
	
	public  boolean checkSubMenusUnderMasterMenuList() throws InterruptedException
	{
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
	homeMenu.click();
	    
	Thread.sleep(2000);
    getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(mastersMenu));
    mastersMenu.click();
    Thread.sleep(1000);
    
    int subMenusUnderMastersMenuListCount = subMenusUnderMastersMenuList.size();
	ArrayList<String> subMenusUnderMastersMenuListArray = new ArrayList<String>();
	for(int i=0;i<subMenusUnderMastersMenuListCount;i++)
	{
		
		String data=subMenusUnderMastersMenuList.get(i).getText();
		
		subMenusUnderMastersMenuListArray.add(data);
	}
	String actsubMenusUnderMastersMenuListArray = subMenusUnderMastersMenuListArray.toString();
	String expsubMenusUnderMastersMenuListArray = "[Account, Currency, Item, Schemes, MRP, QC, Maintainance, Point of Sale, Payroll, Department, Warehouse, Cost Center, Location, Region, Country, State, City, Bins, Insurance, Fixed Assets, Tax Code, Portal Rights]";

	
	
	System.out.println("*******************SubMenusUnderMastersMenu***********************************");
	
	System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderMastersMenuListArray +"   "+"Expected SubMenus Under HomeMenu"+     expsubMenusUnderMastersMenuListArray);
	
	if(actsubMenusUnderMastersMenuListArray.equalsIgnoreCase(expsubMenusUnderMastersMenuListArray))
		return true;
	else
		return false;
	
	
	}
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[3]/ul/li[2]/ul/li")
	public static List<WebElement> subMenusUnderCurrencyMenuList;
	
	
	public  boolean checkSubMenusUnderCurrencyMasterMenuList() throws InterruptedException
	{
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(currencyMenu));
	currencyMenu.click();
	Thread.sleep(2000);
	    
	   
    int subMenusUnderCurrencyMenuListCount = subMenusUnderCurrencyMenuList.size();
	ArrayList<String> subMenusUnderCurrencyMenuListArray = new ArrayList<String>();
	for(int i=0;i<subMenusUnderCurrencyMenuListCount;i++)
	{
		
		String data=subMenusUnderCurrencyMenuList.get(i).getText();
		
		subMenusUnderCurrencyMenuListArray.add(data);
	}
	String actsubMenusUnderCurrencyMenuListArray = subMenusUnderCurrencyMenuListArray.toString();
	String expsubMenusUnderCurrencyMenuListArray = "[Currency Master, Exchange Rate, Exchange Rate History]";

	
	
	System.out.println("*******************SubMenusUnderCurrencyMastersMenu***********************************");
	
	System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderCurrencyMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderCurrencyMenuListArray);
	
	if(actsubMenusUnderCurrencyMenuListArray.equalsIgnoreCase(expsubMenusUnderCurrencyMenuListArray))
		return true;
	else
		return false;
	
	
	}
	
	
	public  boolean checkSubMenusUnderItemMasterMenuList() throws InterruptedException
	{
		
		Thread.sleep(2000);
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(itemMenu));
	itemMenu.click();
	    Thread.sleep(2000);
	   
    int subMenuUnderItemMenuListCount = subMenuUnderItemMenuList.size();
	ArrayList<String> subMenuUnderItemMenuListArray = new ArrayList<String>();
	for(int i=0;i<subMenuUnderItemMenuListCount;i++)
	{
		
		String data=subMenuUnderItemMenuList.get(i).getText();
		
		subMenuUnderItemMenuListArray.add(data);
	}
	String actsubMenuUnderItemMenuListArray = subMenuUnderItemMenuListArray.toString();
	String expsubMenuUnderItemMenuListArray = "[Item, Units, Unit Conversion, Seller Price Book, Buyer Price Book, Barcode Definition]";

	
	
	System.out.println("*******************SubMenusUnderItemMastersMenu***********************************");
	
	System.out.println("Actual SubMenus:  "+"        "+ actsubMenuUnderItemMenuListArray +"   "+"Expected SubMenus "+     expsubMenuUnderItemMenuListArray);
	
	if(actsubMenuUnderItemMenuListArray.equalsIgnoreCase(expsubMenuUnderItemMenuListArray))
		return true;
	else
		return false;
	
	
	}
	
	
	public  boolean checkSubMenusUnderSchemesMasterMenuList() throws InterruptedException
	{
		Thread.sleep(2000);
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(schemesMenu));
	schemesMenu.click();
	Thread.sleep(2000);
	    
	   
    int subMenuUnderSchemesMenuListCount = subMenuUnderSchemesMenuList.size();
	ArrayList<String> subMenuUnderSchemesMenuListArray = new ArrayList<String>();
	for(int i=0;i<subMenuUnderSchemesMenuListCount;i++)
	{
		
		String data=subMenuUnderSchemesMenuList.get(i).getText();
		
		subMenuUnderSchemesMenuListArray.add(data);
	}
	String actsubMenuUnderSchemesMenuListArray = subMenuUnderSchemesMenuListArray.toString();
	String expsubMenuUnderSchemesMenuListArray = "[Schemes, Free Items, Discount Definition, Schemes Mapping to Customers]";

	Thread.sleep(2000);
	
	
	
	
	System.out.println("*******************SubMenusUnderSchemesMastersMenu***********************************");
	
	System.out.println("Actual SubMenus:  "+"        "+ actsubMenuUnderSchemesMenuListArray +"   "+"Expected SubMenus "+     expsubMenuUnderSchemesMenuListArray);
	
	
	
	if(actsubMenuUnderSchemesMenuListArray.equalsIgnoreCase(expsubMenuUnderSchemesMenuListArray))
			
		return true;
	else
		return false;
	
	
	}
	
	public boolean checkSubMenusUnderSchemesDiscountDifinitionMenuList() throws InterruptedException
	{
		
		Thread.sleep(1000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(schemesDiscountDefinitionMenu));
		schemesDiscountDefinitionMenu.click();
		    
		   Thread.sleep(1000);
		  
		   
	    int subMenuUnderSchemesDiscountDefinitionMenuListCount = subMenuUnderSchemesDiscountDefinitionMenuList.size();
		ArrayList<String> subMenuUnderSchemesDiscountDefinitionMenuListArray = new ArrayList<String>();
		
		for(int i=0;i<subMenuUnderSchemesDiscountDefinitionMenuListCount;i++)
		{
			
			String data=subMenuUnderSchemesDiscountDefinitionMenuList.get(i).getText();
			
			subMenuUnderSchemesDiscountDefinitionMenuListArray.add(data);
		}
		String actsubMenuUnderSchemesDiscountDefinitionMenuListArray = subMenuUnderSchemesDiscountDefinitionMenuList.toString();
		String expsubMenuUnderSchemesDiscountDefinitionMenuListArray = "[Configure Transactions, Transaction Authorization, Pricebook Authorization, Configure Masters, Master Authorization, Credit Limit Authorization, Design Workflow, Settings Wizard, Export/Import Settings, Batch Code Generation, Map Credit Limit, VAT Tax Code, Customer Portal Admin, Budget Authorization, Payment Gateway Integration, AI Setup, Fixed Asset Authorization, Form Authorization]";
		
		System.out.println("*******************SubMenusUnderSchemesDiscountDefinitionMastersMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenuUnderSchemesDiscountDefinitionMenuListArray +"   "+"Expected SubMenus "+     expsubMenuUnderSchemesDiscountDefinitionMenuListArray);
		
		
		if(actsubMenuUnderSchemesDiscountDefinitionMenuListArray.equalsIgnoreCase(expsubMenuUnderSchemesDiscountDefinitionMenuListArray))
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
	
	
	
	public  boolean checkSubMenusUnderMRPMasterMenuList() throws InterruptedException
	{
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(MRPMenu));
	MRPMenu.click();
	Thread.sleep(2000);
	    
	   
    int subMenuUnderMRPMenuListCount = subMenuUnderMRPMenuList.size();
	ArrayList<String> subMenuUnderMRPMenuListArray = new ArrayList<String>();
	for(int i=0;i<subMenuUnderMRPMenuListCount;i++)
	{
		
		String data=subMenuUnderMRPMenuList.get(i).getText();
		
		subMenuUnderMRPMenuListArray.add(data);
	}
	String actsubMenuUnderMRPMenuListArray = subMenuUnderMRPMenuListArray.toString();
	String expsubMenuUnderMRPMenuListArray = "[Plant, Supply Area, Maintenance Parameter, Safety Instructions, Capacity, Work Center, Holiday, Process]";

	
	
	System.out.println("*******************SubMenusUnderMRPMastersMenu***********************************");
	
	System.out.println("Actual SubMenus:  "+"        "+ actsubMenuUnderMRPMenuListArray +"   "+"Expected SubMenus "+     expsubMenuUnderMRPMenuListArray);
	
	if(actsubMenuUnderMRPMenuListArray.equalsIgnoreCase(expsubMenuUnderMRPMenuListArray))
		return true;
	else
		return false;
	
	
	}
	
	
	public  boolean checkSubMenusUnderQCMasterMenuList() throws InterruptedException
	{
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(QCMenu));
	QCMenu.click();
	    Thread.sleep(2000);
	   
    int subMenuUnderQCMenuListCount = subMenuUnderQCMenuList.size();
	ArrayList<String> subMenuUnderQCMenuListArray = new ArrayList<String>();
	for(int i=0;i<subMenuUnderQCMenuListCount;i++)
	{
		
		String data=subMenuUnderQCMenuList.get(i).getText();
		
		subMenuUnderQCMenuListArray.add(data);
	}
	String actsubMenuUnderQCMenuListArray = subMenuUnderQCMenuListArray.toString();
	String expsubMenuUnderQCMenuListArray = "[Qc failure reason, QC Parameters]";

	
	
	System.out.println("*******************SubMenusUnderQCMastersMenu***********************************");
	
	System.out.println("Actual SubMenus:  "+"        "+ actsubMenuUnderQCMenuListArray +"   "+"Expected SubMenus "+     expsubMenuUnderQCMenuListArray);
	
	if(actsubMenuUnderQCMenuListArray.equalsIgnoreCase(expsubMenuUnderQCMenuListArray))
		return true;
	else
		return false;
	
	
	}
	
	
	
	public  boolean checkSubMenusUnderMaintainanceMasterMenuList() throws InterruptedException
	{
		
	getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(maintainanceMenu));
	maintainanceMenu.click();
	    Thread.sleep(2000);
	   
    int subMenuUnderMaintainanceMenuListCount = subMenuUnderMaintainanceMenuList.size();
	ArrayList<String> subMenuUnderMaintainanceMenuListArray = new ArrayList<String>();
	for(int i=0;i<subMenuUnderMaintainanceMenuListCount;i++)
	{
		
		String data=subMenuUnderMaintainanceMenuList.get(i).getText();
		
		subMenuUnderMaintainanceMenuListArray.add(data);
	}
	String actssubMenuUnderMaintainanceMenuListArray = subMenuUnderMaintainanceMenuListArray.toString();
	String expsubMenuUnderMaintainanceMenuListArray = "[Break down standard reason]";

	
	
	System.out.println("*******************SubMenusUnderMaintainanceMastersMenu***********************************");
	
	System.out.println("Actual SubMenus:  "+"        "+ actssubMenuUnderMaintainanceMenuListArray +"   "+"Expected SubMenus "+     expsubMenuUnderMaintainanceMenuListArray);
	
	if(actssubMenuUnderMaintainanceMenuListArray.equalsIgnoreCase(expsubMenuUnderMaintainanceMenuListArray))
		return true;
	else
		return false;
	
	
	}
	
	public  boolean checkSubMenusUnderPointOfSaleMasterMenuList() throws InterruptedException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pointOfSaleMenu));
		pointOfSaleMenu.click();
	    Thread.sleep(2000);
	   
	    int subMenuUnderPointOfSaleMenuListCount = subMenuUnderPointOfSaleMenuList.size();
		ArrayList<String> subMenuUnderPointOfSaleMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenuUnderPointOfSaleMenuListCount;i++)
		{
			
			String data=subMenuUnderPointOfSaleMenuList.get(i).getText();
			
			subMenuUnderPointOfSaleMenuListArray.add(data);
		}
		String actsubMenuUnderPointOfSaleMenuListArray = subMenuUnderPointOfSaleMenuListArray.toString();
		String expsubMenuUnderPointOfSaleMenuListArray = "[Member, Gift Voucher, Discount Voucher, Table Management, Outlet, Counter, Category, Bank Card Type, Return Remarks, Employee Discount Definition, Delivery Time Interval, E- Payment, Order Type, Order Source]";
	
		
		
		System.out.println("*******************SubMenusUnderPointOfSaleMastersMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenuUnderPointOfSaleMenuListArray +"   "+"Expected SubMenus "+     expsubMenuUnderPointOfSaleMenuListArray);
		
		if(actsubMenuUnderPointOfSaleMenuListArray.equalsIgnoreCase(expsubMenuUnderPointOfSaleMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	public  boolean checkSubMenusUnderPointOfSaleMemberMenuList() throws InterruptedException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pointOfSaleMemberMenu));
		pointOfSaleMemberMenu.click();
	    Thread.sleep(2000);
	   
	    int subMenuUnderPointOfSaleMemberMenuListCount = subMenuUnderPointOfSaleMemberMenuList.size();
		ArrayList<String> subMenuUnderPointOfSaleMemberMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenuUnderPointOfSaleMemberMenuListCount;i++)
		{
			
			String data=subMenuUnderPointOfSaleMemberMenuList.get(i).getText();
			
			subMenuUnderPointOfSaleMemberMenuListArray.add(data);
		}
		String actsubMenuUnderPointOfSaleMemberMenuListArray = subMenuUnderPointOfSaleMemberMenuListArray.toString();
		String expsubMenuUnderPointOfSaleMemberMenuListArray = "[Member Card Series Registration, Member Points Definition, Member Points Opening Balance, Member Type, Member, Member Card Definition]";
	
		
		
		System.out.println("*******************SubMenusUnderPointOfSaleMemberMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenuUnderPointOfSaleMemberMenuListArray +"   "+"Expected SubMenus "+     expsubMenuUnderPointOfSaleMemberMenuListArray);
		
		if(actsubMenuUnderPointOfSaleMemberMenuListArray.equalsIgnoreCase(expsubMenuUnderPointOfSaleMemberMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderPointOfSaleGiftVoucherMenuList() throws InterruptedException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pointOfSaleGiftVoucherMenu));
		pointOfSaleGiftVoucherMenu.click();
	    Thread.sleep(2000);
	   
	    int subMenuUnderPointOfSaleGiftVoucherMenuListCount = subMenuUnderPointOfSaleGiftVoucherMenuList.size();
		ArrayList<String> subMenuUnderPointOfSaleGiftVoucherMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenuUnderPointOfSaleGiftVoucherMenuListCount;i++)
		{
			
			String data=subMenuUnderPointOfSaleGiftVoucherMenuList.get(i).getText();
			
			subMenuUnderPointOfSaleGiftVoucherMenuListArray.add(data);
		}
		String actsubMenuUnderPointOfSaleGiftVoucherMenuListArray = subMenuUnderPointOfSaleGiftVoucherMenuListArray.toString();
		String expsubMenuUnderPointOfSaleGiftVoucherMenuListArray = "[Gift Voucher Registration, Gift Voucher Definition]";
	
		
		
		System.out.println("*******************SubMenusUnderPointOfSaleGiftVoucherMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenuUnderPointOfSaleGiftVoucherMenuListArray +"   "+"Expected SubMenus "+     expsubMenuUnderPointOfSaleGiftVoucherMenuListArray);
		
		if(actsubMenuUnderPointOfSaleGiftVoucherMenuListArray.equalsIgnoreCase(expsubMenuUnderPointOfSaleGiftVoucherMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderPointOfSaleDiscountVoucherMenuList() throws InterruptedException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pointOfSaleDiscountVoucherMenu));
		pointOfSaleDiscountVoucherMenu.click();
	    Thread.sleep(2000);
	   
	    int subMenuUnderPointOfSaleDiscountVoucherMenuListCount = subMenuUnderPointOfSaleDiscountVoucherMenuList.size();
		ArrayList<String> subMenuUnderPointOfSaleDiscountVoucherMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenuUnderPointOfSaleDiscountVoucherMenuListCount;i++)
		{
			
			String data=subMenuUnderPointOfSaleDiscountVoucherMenuList.get(i).getText();
			
			subMenuUnderPointOfSaleDiscountVoucherMenuListArray.add(data);
		}
		String actsubMenuUnderPointOfSaleDiscountVoucherMenuListArray = subMenuUnderPointOfSaleDiscountVoucherMenuListArray.toString();
		String expsubMenuUnderPointOfSaleDiscountVoucherMenuListArray = "[Discount Voucher Registration, Discount Voucher Definition]";
	
		
		
		System.out.println("*******************SubMenusUnderPointOfSaleDiscountVoucherMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenuUnderPointOfSaleDiscountVoucherMenuListArray +"   "+"Expected SubMenus "+     expsubMenuUnderPointOfSaleDiscountVoucherMenuListArray);
		
		if(actsubMenuUnderPointOfSaleDiscountVoucherMenuListArray.equalsIgnoreCase(expsubMenuUnderPointOfSaleDiscountVoucherMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	public  boolean checkSubMenusUnderPointOfSaleTableManagementMenuList() throws InterruptedException
	{
		//getAction().moveToElement(pointOfSaleTableManagementMenu).build().perform();
		
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
   		js.executeScript("arguments[0].scrollIntoView();", pointOfSaleTableManagementMenu);
   		Thread.sleep(1000);
   		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pointOfSaleTableManagementMenu));
		pointOfSaleTableManagementMenu.click();
	    Thread.sleep(2000);
	   
	    int subMenuUnderPointOfSaleTableManagementMenuListCount = subMenuUnderPointOfSaleTableManagementMenuList.size();
		ArrayList<String> subMenuUnderPointOfSaleTableManagementMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenuUnderPointOfSaleTableManagementMenuListCount;i++)
		{
			
			String data=subMenuUnderPointOfSaleTableManagementMenuList.get(i).getText();
			
			subMenuUnderPointOfSaleTableManagementMenuListArray.add(data);
		}
		String actsubMenuUnderPointOfSaleTableManagementMenuListArray = subMenuUnderPointOfSaleTableManagementMenuListArray.toString();
		String expsubMenuUnderPointOfSaleTableManagementMenuListArray = "[Floor, Section, Table, Guest, Void Remarks]";
	
		
		
		System.out.println("*******************SubMenusUnderPointOfSaleTableManagementMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenuUnderPointOfSaleTableManagementMenuListArray +"   "+"Expected SubMenus "+     expsubMenuUnderPointOfSaleTableManagementMenuListArray);
		
		if(actsubMenuUnderPointOfSaleTableManagementMenuListArray.equalsIgnoreCase(expsubMenuUnderPointOfSaleTableManagementMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderPayrollMenuList() throws InterruptedException
	{
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(payrollMenu));
		payrollMenu.click();
	    Thread.sleep(2000);
	   
	    int subMenuUnderPayrollMenuListCount = subMenuUnderPayrollMenuList.size();
		ArrayList<String> subMenuUnderPayrollMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenuUnderPayrollMenuListCount;i++)
		{
			
			String data=subMenuUnderPayrollMenuList.get(i).getText();
			
			subMenuUnderPayrollMenuListArray.add(data);
		}
		String actsubMenuUnderPayrollMenuListArray = subMenuUnderPayrollMenuListArray.toString();
		String expsubMenuUnderPayrollMenuListArray = "[Employee, Designation, Position, Qualification, Specialization, Nationality, Skill Type, Skill, SourceType, Source, RoundType, Grade, Scale, Course Type, Course, Trainer, Airline Sector, Venue, Request Types, Expense Claims, Employee Bank, Travel Agent, Job Grade]";
	
		
		
		System.out.println("*******************SubMenusUnderPayrollMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenuUnderPayrollMenuListArray +"   "+"Expected SubMenus "+     expsubMenuUnderPayrollMenuListArray);
		
		if(actsubMenuUnderPayrollMenuListArray.equalsIgnoreCase(expsubMenuUnderPayrollMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[4]/ul/li")
	public static List<WebElement> subMenuUnderDataManagementList;
	
	public  boolean checkSubMenusUnderDataManagementMenuList() throws InterruptedException
	{
		getDriver().navigate().refresh();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		Thread.sleep(2000);
		
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(dataMangementMenu));
		dataMangementMenu.click();
	    Thread.sleep(2000);
	   
	    int subMenuUnderDataManagementListCount = subMenuUnderDataManagementList.size();
		ArrayList<String> subMenuUnderDataManagementListArray = new ArrayList<String>();
		for(int i=0;i<subMenuUnderDataManagementListCount;i++)
		{
			
			String data=subMenuUnderDataManagementList.get(i).getText();
			
			subMenuUnderDataManagementListArray.add(data);
		}
		String actsubMenuUnderDataManagementListArray = subMenuUnderDataManagementListArray.toString();
		String expsubMenuUnderDataManagementListArray = "[Backup, Restore, Reindex, Erase All, Maintain Database, Archive, UnArchive, Lock/Unlock Database, Audit Log Delete Manual, Resave Vouchers]";
	
		
		
		System.out.println("*******************SubMenusUnderDataManagementMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenuUnderDataManagementListArray +"   "+"Expected SubMenus "+     expsubMenuUnderDataManagementListArray);
		
		if(actsubMenuUnderDataManagementListArray.equalsIgnoreCase(expsubMenuUnderDataManagementListArray))
			return true;
		else
			return false;
		
	
	}
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[1]/ul/li[5]/ul/li")
	public static List<WebElement> subMenuUnderUtilitesMenuList;
	
	public  boolean checkSubMenusUnderUtilitiesMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(homeMenu));
		homeMenu.click();
		Thread.sleep(2000);
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(utilitesMenu));
		utilitesMenu.click();
	    Thread.sleep(2000);
	   
	    int subMenuUnderUtilitesMenuListCount = subMenuUnderUtilitesMenuList.size();
		ArrayList<String> subMenuUnderUtilitesMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenuUnderUtilitesMenuListCount;i++)
		{
			
			String data=subMenuUnderUtilitesMenuList.get(i).getText();
			
			subMenuUnderUtilitesMenuListArray.add(data);
		}
		String actsubMenuUnderUtilitesMenuListArray = subMenuUnderUtilitesMenuListArray.toString();
		String expsubMenuUnderUtilitesMenuListArray = "[Calendar, Currently open reports, Focus RDP, Download RDP Setup, External Reports, Report Designer, Batch Report Printing, Schedule Report, Renumber Vouchers, Repost Vouchers, Adjust Foreign Exchange, Transaction Import, Data Statistics, App Menus Customization, Resource Manager, Electronic data interchange, EDI Generation, Standard Rate, Task Manager, Authorization Details, Auto Adjust, ReGroup, Manual Adjustment, Release Reservation, Authorization Audit Report, Integrations, Mount/Unmount Database, Document oreder, Release PickConfirm Reservation]";
	
		
		
		System.out.println("*******************SubMenusUnderUtilitesMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenuUnderUtilitesMenuListArray +"   "+"Expected SubMenus "+     expsubMenuUnderUtilitesMenuListArray);
		
		if(actsubMenuUnderUtilitesMenuListArray.equalsIgnoreCase(expsubMenuUnderUtilitesMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	@FindBy(xpath="//*[@id='60']")
	public static WebElement FinancialsMenu;
	
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li")
	public static List<WebElement> subMenusUnderFinancialsMenuList;
	
	public  boolean checkSubMenusUnderFinancialMenuList() throws InterruptedException
	{
		getDriver().navigate().refresh();
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(FinancialsMenu));
		FinancialsMenu.click();
	    Thread.sleep(2000);
	   
	    int subMenusUnderFinancialsMenuListCount = subMenusUnderFinancialsMenuList.size();
		ArrayList<String> subMenusUnderFinancialsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinancialsMenuListCount;i++)
		{
			
			String data=subMenusUnderFinancialsMenuList.get(i).getText();
			
			subMenusUnderFinancialsMenuListArray.add(data);
		}
		String actsubMenusUnderFinancialsMenuListArray = subMenusUnderFinancialsMenuListArray.toString();
		String expsubMenusUnderFinancialsMenuListArray = "[Transactions, Credit Management, Reports, Final Accounts, Receivable and Payable Analysis, Budget, Online Payments]";
	
		
		
		System.out.println("*******************SubMenusUnderFinancilasMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinancialsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinancialsMenuListArray);
		
		if(actsubMenusUnderFinancialsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinancialsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	@FindBy(xpath="//*[@id='61']")
	public static WebElement transactionsMenu;
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[1]/ul/li")
	public static List<WebElement> subMenusUnderTransactionsMenuList;
	
	@FindBy(xpath="//*[@id='2001']")
	public static WebElement cashAndBankMenu;
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[1]/ul/li[1]/ul/li")
	public static List<WebElement> subMenusUnderCashAndBankMenuList;
	
	
	
	public  boolean checkSubMenusUnderFinancialTransactionsMenuList() throws InterruptedException
	{
		
	
		
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(transactionsMenu));
		transactionsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderTransactionsMenuCount = subMenusUnderTransactionsMenuList.size();
		ArrayList<String> subMenusUnderTransactionsMenuArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderTransactionsMenuCount;i++)
		{
			
			String data=subMenusUnderTransactionsMenuList.get(i).getText();
			
			subMenusUnderTransactionsMenuArray.add(data);
		}
		String actsubMenusUnderTransactionsMenuArray = subMenusUnderTransactionsMenuArray.toString();
		String expsubMenusUnderTransactionsMenuArray = "[Cash and Bank, Purchases, Sales, Journals, Auto Postings]";
	
		
		
		System.out.println("*******************SubMenusUnderFinancilasTransactionsMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderTransactionsMenuArray +"   "+"Expected SubMenus "+     expsubMenusUnderTransactionsMenuArray);
		
		if(actsubMenusUnderTransactionsMenuArray.equalsIgnoreCase(expsubMenusUnderTransactionsMenuArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderFinancialTransactionsCashAndBankMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(cashAndBankMenu));
		cashAndBankMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderCashAndBankMenuListCount = subMenusUnderCashAndBankMenuList.size();
		ArrayList<String> subMenusUnderCashAndBankMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderCashAndBankMenuListCount;i++)
		{
			
			String data=subMenusUnderCashAndBankMenuList.get(i).getText();
			
			subMenusUnderCashAndBankMenuListArray.add(data);
		}
		String actsubMenusUnderCashAndBankMenuListArray = subMenusUnderCashAndBankMenuListArray.toString();
		String expsubMenusUnderCashAndBankMenuListArray = "[Receipts, Payments, Petty Cash, Post-Dated Receipts, Post-Dated Payments, Define Cheque Series, Cancel Cheque, Cheque book register report]";
	
		
		
		System.out.println("*******************SubMenusUnderFinancilasTransactionsCashAndBankMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderCashAndBankMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderCashAndBankMenuListArray);
		
		if(actsubMenusUnderCashAndBankMenuListArray.equalsIgnoreCase(expsubMenusUnderCashAndBankMenuListArray))
			return true;
		else
			return false;
		
	}
	
	
	@FindBy(xpath="//*[@id='2007']")
	public static WebElement purchaseMenu;
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[1]/ul/li[2]/ul/li")
	public static List<WebElement> subMenusUnderpurchaseMenuList;
	
	
	@FindBy(xpath="//*[@id='2014']")
	public static WebElement salesMenu;
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[1]/ul/li[3]/ul//li")
	public static List<WebElement> subMenusUnderSalesMenuList;
	
	
	@FindBy(xpath="//*[@id='2023']")
	public static WebElement journalsMenu;
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[1]/ul/li[4]/ul/li")
	public static List<WebElement> subMenusUnderJournalsMenuList;
	
	@FindBy(xpath="//*[@id='219']")
	public static WebElement autoPostingsMenu;
	
	@FindBy(xpath="//*[@id='navigation_menu']/li[2]/ul/li[1]/ul/li[5]/ul/li")
	public static List<WebElement> subMenusUnderAutoPostingsMenuList;
	
	
	public  boolean checkSubMenusUnderFinancialTransactionsPurchaseMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseMenu));
		purchaseMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderpurchaseMenuListCount = subMenusUnderpurchaseMenuList.size();
		ArrayList<String> subMenusUnderpurchaseMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderpurchaseMenuListCount;i++)
		{
			
			String data=subMenusUnderpurchaseMenuList.get(i).getText();
			
			subMenusUnderpurchaseMenuListArray.add(data);
		}
		String actsubMenusUnderpurchaseMenuListArray = subMenusUnderpurchaseMenuListArray.toString();
		String expsubMenusUnderpurchaseMenuListArray = "[Purchase Vouchers, Purchase Returns]";
	
		
		
		System.out.println("*******************SubMenusUnderFinancilasTransactionsPurchaseMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderpurchaseMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderpurchaseMenuListArray);
		
		if(actsubMenusUnderpurchaseMenuListArray.equalsIgnoreCase(expsubMenusUnderpurchaseMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderFinancialTransactionsSalesMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesMenu));
		salesMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderSalesMenuListCount = subMenusUnderSalesMenuList.size();
		ArrayList<String> subMenusUnderSalesMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderSalesMenuListCount;i++)
		{
			
			String data=subMenusUnderSalesMenuList.get(i).getText();
			
			subMenusUnderSalesMenuListArray.add(data);
		}
		String actsubMenusUnderSalesMenuListArray = subMenusUnderSalesMenuListArray.toString();
		String expsubMenusUnderSalesMenuListArray = "[Sales Invoices, Sales Returns, Cash Sales, Hire-Purchase Sales]";
	
		
		
		System.out.println("*******************SubMenusUnderFinancilasTransactionsSalesMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderSalesMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderSalesMenuListArray);
		
		if(actsubMenusUnderSalesMenuListArray.equalsIgnoreCase(expsubMenusUnderSalesMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	public  boolean checkSubMenusUnderFinancialTransactionsJournalsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(journalsMenu));
		journalsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderJournalsMenuListCount = subMenusUnderJournalsMenuList.size();
		ArrayList<String> subMenusUnderJournalsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderJournalsMenuListCount;i++)
		{
			
			String data=subMenusUnderJournalsMenuList.get(i).getText();
			
			subMenusUnderJournalsMenuListArray.add(data);
		}
		String actsubMenusUnderJournalsMenuListArray = subMenusUnderJournalsMenuListArray.toString();
		String expsubMenusUnderJournalsMenuListArray = "[Journal Entries, Forex JV, Inter-Departmental JV, Old Journal Entries, Debit Notes, Debit Notes (Linewise), Credit Notes, Credit Notes (Linewise)/Payroll, Opening Balances, Fixed Asset Depreciation Voucher]";
	
		
		
		System.out.println("*******************SubMenusUnderFinancilasTransactionsJournalsMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderJournalsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderJournalsMenuListArray);
		
		if(actsubMenusUnderJournalsMenuListArray.equalsIgnoreCase(expsubMenusUnderJournalsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderFinancialTransactionsAutoPostingsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(autoPostingsMenu));
		autoPostingsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderAutoPostingsMenuListCount = subMenusUnderAutoPostingsMenuList.size();
		ArrayList<String> subMenusUnderAutoPostingsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderAutoPostingsMenuListCount;i++)
		{
			
			String data=subMenusUnderAutoPostingsMenuList.get(i).getText();
			
			subMenusUnderAutoPostingsMenuListArray.add(data);
		}
		String actsubMenusUnderAutoPostingsMenuListArray = subMenusUnderAutoPostingsMenuListArray.toString();
		String expsubMenusUnderAutoPostingsMenuListArray = "[Recurring Journal, Post Recurring Journal, Recurring Journal Template, Post Interest, Convert Matured PDCs, Assign PDC Limit, Stock Replenishment]";
	
		
		
		System.out.println("*******************SubMenusUnderFinancilasTransactionsAutoPostingsMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderAutoPostingsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderAutoPostingsMenuListArray);
		
		if(actsubMenusUnderAutoPostingsMenuListArray.equalsIgnoreCase(expsubMenusUnderAutoPostingsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	
	
	public  boolean checkSubMenusUnderFinancialCreditManagementMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(creditManagementMenu));
		creditManagementMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderCreditManagementMenuListCount = subMenusUnderCreditManagementMenuList.size();
		ArrayList<String> subMenusUnderCreditManagementMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderCreditManagementMenuListCount;i++)
		{
			
			String data=subMenusUnderCreditManagementMenuList.get(i).getText();
			
			subMenusUnderCreditManagementMenuListArray.add(data);
		}
		String actsubMenusUnderCreditManagementMenuListArray = subMenusUnderCreditManagementMenuListArray.toString();
		String expsubMenusUnderCreditManagementMenuListArray = "[Payment Terms, Finance Terms, Reminder Terms, Send Reminder, Delinquency, Credit Approval]";
	
		
		
		System.out.println("*******************SubMenusUnderFinancilasCreditManagementMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderCreditManagementMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderCreditManagementMenuListArray);
		
		if(actsubMenusUnderCreditManagementMenuListArray.equalsIgnoreCase(expsubMenusUnderCreditManagementMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderFinancialCreditManagementDelinquencyMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(delinquencyMenu));
		delinquencyMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderdelinquencyMenuListCount = subMenusUnderdelinquencyMenuList.size();
		ArrayList<String> subMenusUnderdelinquencyMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderdelinquencyMenuListCount;i++)
		{
			
			String data=subMenusUnderdelinquencyMenuList.get(i).getText();
			
			subMenusUnderdelinquencyMenuListArray.add(data);
		}
		String actsubMenusUnderdelinquencyMenuListArray = subMenusUnderdelinquencyMenuListArray.toString();
		String expssubMenusUnderdelinquencyMenuListArray= "[Questionnaire, Delinquency Mgmt]";
	
		
		
		System.out.println("*******************SubMenusUnderFinancilasCreditManagementMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderdelinquencyMenuListArray +"   "+"Expected SubMenus "+     expssubMenusUnderdelinquencyMenuListArray);
		
		if(actsubMenusUnderdelinquencyMenuListArray.equalsIgnoreCase(expssubMenusUnderdelinquencyMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	public  boolean checkSubMenusUnderFinancialReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportsMenu));
		reportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderReportsMenuListCount = subMenusUnderReportsMenuList.size();
		ArrayList<String> subMenusUnderReportsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderReportsMenuListCount;i++)
		{
			
			String data=subMenusUnderReportsMenuList.get(i).getText();
			
			subMenusUnderReportsMenuListArray.add(data);
		}
		String actsubMenusUnderReportsMenuListArray = subMenusUnderReportsMenuListArray.toString();
		String expsubMenusUnderReportsMenuListArray= "[Ledger, Ledger detail, Sub Ledger, Cash and Bank Books, Sales Report, Purchase Report, Registers, Sales and Purchases Analysis, Miscellaneous Analysis, Master Informations, Audit Trail, Account Query, Transaction authorization report, Master authorization report]";
	
		
		
		System.out.println("*******************SubMenusUnderFinancilasReportstMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderReportsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderReportsMenuListArray);
		
		if(actsubMenusUnderReportsMenuListArray.equalsIgnoreCase(expsubMenusUnderReportsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	public  boolean checkSubMenusUnderFinancialReportsCashAndBankBooksMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reportsCashAndBankBooksMenu));
		reportsCashAndBankBooksMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderReportsCashBankBooksMenuListCount = subMenusUnderReportsCashBankBooksMenuList.size();
		ArrayList<String> subMenusUnderReportsCashBankBooksMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderReportsCashBankBooksMenuListCount;i++)
		{
			
			String data=subMenusUnderReportsCashBankBooksMenuList.get(i).getText();
			
			subMenusUnderReportsCashBankBooksMenuListArray.add(data);
		}
		String actsubMenusUnderReportsCashBankBooksMenuListArray = subMenusUnderReportsCashBankBooksMenuListArray.toString();
		String expsubMenusUnderReportsCashBankBooksMenuListArray= "[Cash Book, Bank Book, Petty Cash Book, Day Book, Virtual Bank Ledger, Bank Reconciliation, Bank Reconciliation Import, Customer Vendor Reconciliation, Bank Reconciliation Statement, Cheque Discounting]";
	
		
		
		System.out.println("*******************SubMenusUnderFinancialsReportsCashBankBooksMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderReportsCashBankBooksMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderReportsCashBankBooksMenuListArray);
		
		if(actsubMenusUnderReportsCashBankBooksMenuListArray.equalsIgnoreCase(expsubMenusUnderReportsCashBankBooksMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderFinancialSalesReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesReportsMenu));
		salesReportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderSalesReportsMenuListCount = subMenusUnderSalesReportsMenuList.size();
		ArrayList<String> subMenusUnderSalesReportsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderSalesReportsMenuListCount;i++)
		{
			
			String data=subMenusUnderSalesReportsMenuList.get(i).getText();
			
			subMenusUnderSalesReportsMenuListArray.add(data);
		}
		String actsubMenusUnderSalesReportsMenuListArray = subMenusUnderSalesReportsMenuListArray.toString();
		String expsubMenusUnderSalesReportsMenuListArray= "[Sales Register, Sales Return Register, Summary Sales Register, Monthly Sales Book, Top Customers List]";
	
		
		
		System.out.println("*******************SubMenusUnderFinancialsSalesReportsMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderSalesReportsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderSalesReportsMenuListArray);
		
		if(actsubMenusUnderSalesReportsMenuListArray.equalsIgnoreCase(expsubMenusUnderSalesReportsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderFinancialPurchaseReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(purchaseReportsMenu));
		purchaseReportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderPurchaseReportsMenuListCount = subMenusUnderPurchaseReportsMenuList.size();
		ArrayList<String> subMenusUnderPurchaseReportsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderPurchaseReportsMenuListCount;i++)
		{
			
			String data=subMenusUnderPurchaseReportsMenuList.get(i).getText();
			
			subMenusUnderPurchaseReportsMenuListArray.add(data);
		}
		String actsubMenusUnderPurchaseReportsMenuListArray = subMenusUnderPurchaseReportsMenuListArray.toString();
		String expsubMenusUnderPurchaseReportsMenuListArray= "[Purchase Register, Purchase Return Register, Summary Purchase Register]";
	
		
		
		System.out.println("*******************SubMenusUnderFinancialsPurchaseReportsMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderPurchaseReportsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderPurchaseReportsMenuListArray);
		
		if(actsubMenusUnderPurchaseReportsMenuListArray.equalsIgnoreCase(expsubMenusUnderPurchaseReportsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	
	public  boolean checkSubMenusUnderFinancialRegisterReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(registerReportsMenu));
		registerReportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderRegisterReportsMenuListCount = subMenusUnderRegisterReportsMenuList.size();
		ArrayList<String> subMenusUnderRegisterReportsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderRegisterReportsMenuListCount;i++)
		{
			
			String data=subMenusUnderRegisterReportsMenuList.get(i).getText();
			
			subMenusUnderRegisterReportsMenuListArray.add(data);
		}
		String actsubMenusUnderRegisterReportsMenuListArray = subMenusUnderRegisterReportsMenuListArray.toString();
		String expsubMenusUnderRegisterReportsMenuListArray= "[Opening Balance Register, Journal Entries Register, Credit Note Register, Debit Note Register, Receipt Register, Payment Register, PDC Receipts Register, PDC Payments Register, Entry Journal Register, Entry journal detail report]";
	
		
		
		System.out.println("*******************SubMenusUnderFinancialsRegisterReportsMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderRegisterReportsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderRegisterReportsMenuListArray);
		
		if(actsubMenusUnderRegisterReportsMenuListArray.equalsIgnoreCase(expsubMenusUnderRegisterReportsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderFinancialSalesAndPurchaseAnalysisReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(salesandPurchasesAnalysisMenu));
		salesandPurchasesAnalysisMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderSalesAndPurchaseAnalysisReportsMenuListCount = subMenusUndersalesandPurchasesAnalysisMenuList.size();
		ArrayList<String> subMenusUnderSalesAndPurchaseAnalysisReportsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderSalesAndPurchaseAnalysisReportsMenuListCount;i++)
		{
			
			String data=subMenusUndersalesandPurchasesAnalysisMenuList.get(i).getText();
			
			subMenusUnderSalesAndPurchaseAnalysisReportsMenuListArray.add(data);
		}
		String actsubMenusUnderSAndPAnalysisReportsMenuListArray = subMenusUnderSalesAndPurchaseAnalysisReportsMenuListArray.toString();
		String expsubMenusUnderSAndPAnalysisReportsMenuListArray= "[Sales Grouped by Customer, Sales Grouped by Product, Sales Grouped by Department, Purchases Grouped by Vendor, Purchases Grouped by Product, Purchases Grouped by Department]";
	
		
		
		System.out.println("*******************SubMenusUnderFinancialsSalesAndPurchaseAnalysisReportsMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderSAndPAnalysisReportsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderSAndPAnalysisReportsMenuListArray);
		
		if(actsubMenusUnderSAndPAnalysisReportsMenuListArray.equalsIgnoreCase(expsubMenusUnderSAndPAnalysisReportsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderFinancialMiscellaneousAnalysisReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(miscellaneousAnalysisMenu));
		miscellaneousAnalysisMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderMiscellaneousAnalysisMenuListCount = subMenusUndermiscellaneousAnalysisMenuList.size();
		ArrayList<String> subMenusUnderMiscellaneousAnalysisMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderMiscellaneousAnalysisMenuListCount;i++)
		{
			
			String data=subMenusUndermiscellaneousAnalysisMenuList.get(i).getText();
			
			subMenusUnderMiscellaneousAnalysisMenuListArray.add(data);
		}
		String actsubMenusUnderMiscellaneousAnalysisMenuListArray = subMenusUnderMiscellaneousAnalysisMenuListArray.toString();
		String expsubMenusUnderMiscellaneousAnalysisMenuListArray= "[Peak and Low Balances, Comprative Analysis, Transactions Type Analysis, ABC Analysis, Interest Calculation]";
	
		
		
		System.out.println("*******************SubMenusUnderMiscellaneousAnalysisReportsMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderMiscellaneousAnalysisMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderMiscellaneousAnalysisMenuListArray);
		
		if(actsubMenusUnderMiscellaneousAnalysisMenuListArray.equalsIgnoreCase(expsubMenusUnderMiscellaneousAnalysisMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	public  boolean checkSubMenusUnderFinancialMasterInformationReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(masterInformationsMenu));
		masterInformationsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderMasterInformationsMenuListCount = subMenusUnderMasterInformationsMenuList.size();
		ArrayList<String> subMenusUnderMasterInformationsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderMasterInformationsMenuListCount;i++)
		{
			
			String data=subMenusUnderMasterInformationsMenuList.get(i).getText();
			
			subMenusUnderMasterInformationsMenuListArray.add(data);
		}
		String actsubMenusUnderMasterInformationsMenuListArray = subMenusUnderMasterInformationsMenuListArray.toString();
		String expsubMenusUnderMasterInformationsMenuListArray= "[Master Info, Product Label, Unit conversion report, Skid Definition]";
	
		
		
		System.out.println("*******************SubMenusUnderMasterInformationsReportsMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderMasterInformationsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderMasterInformationsMenuListArray);
		
		if(actsubMenusUnderMasterInformationsMenuListArray.equalsIgnoreCase(expsubMenusUnderMasterInformationsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderFinancialAuditTrailReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(auditTrailMenu));
		auditTrailMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderAuditTrailMenuListCount = subMenusUnderAuditTrailMenuList.size();
		ArrayList<String> subMenusUnderAuditTrailMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderAuditTrailMenuListCount;i++)
		{
			
			String data=subMenusUnderAuditTrailMenuList.get(i).getText();
			
			subMenusUnderAuditTrailMenuListArray.add(data);
		}
		String actsubMenusUnderMasterInformationsMenuListArray = subMenusUnderAuditTrailMenuListArray.toString();
		String expsubMenusUnderMasterInformationsMenuListArray= "[Audit Trail transactions, Audit Trail logins]";
	
		
		
		System.out.println("*******************SubMenusUnderAuditTrailReportsMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderMasterInformationsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderMasterInformationsMenuListArray);
		
		if(actsubMenusUnderMasterInformationsMenuListArray.equalsIgnoreCase(expsubMenusUnderMasterInformationsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderFinancialFinalAccountsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(finalAccountsMenu));
		finalAccountsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderFinalAccountsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderFinalAccountsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Trial Balance, Profit and Loss, Trading Account, Trading and Profit and Loss, Balance Sheet, Final Account Schedules, Fund Flow, Cash Flow, Cash flow calendar, Cash Flow Analysis, Advance Cash Flow, Budget Planning, Income Expense Trends, Receivable Payable report]";
	
		
		
		System.out.println("*******************SubMenusUnderFinalAccountsMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderFinancialReceivableAndPayableAnalysisMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(receivableAndPayableAnalysisMenu));
		receivableAndPayableAnalysisMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderreceivableandPayableAnalysisMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderreceivableandPayableAnalysisMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Customer Detail, Customer Summary, Vendor Detail, Vendor Summary, Letter of Credit, Release Letter of Credit]";
	
		
		
		System.out.println("*******************subMenusUnderreceivableandPayableAnalysisMenu***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderFinancialReceivableAndPayableAnalysisCustomerDetailMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerDetailMenu));
		customerDetailMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderCustomerDetailMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderCustomerDetailMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Customer Listing of Outstanding Bills, Customer Statements, Customer Due Date Analysis, Customer Ageing Details, Customer Detail Ageing by Due Date, Customer Overdue Analysis]";
	
		
		
		System.out.println("*******************subMenusUnderCustomerDetailMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderFinancialReceivableAndPayableAnalysisCustomerSummaryMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(customerSummaryMenu));
		customerSummaryMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderCustomerSummaryMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderCustomerSummaryMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Customer Ageing Summary, Customer Summary Ageing by Due Date, Customer Overdue Summary, Customer bill-wise summary]";
	
		
		
		System.out.println("*******************subMenusUnderCustomerSummaryMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderFinancialReceivableAndPayableAnalysisVendorDetailMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorDetailMenu));
		vendorDetailMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderVendorDetailMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderVendorDetailMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Vendor Listing of Outstanding Bills, Vendor Statements, Vendor Due Date Analysis, Vendor Ageing Details, Vendor Detail Ageing by Due Date, Vendor Overdue Analysis]";
	
		
		
		System.out.println("*******************subMenusUnderVendorDetailMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderFinancialReceivableAndPayableAnalysisVendorSummaryMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(vendorSummaryMenu));
		vendorSummaryMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderVendorSummaryMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderVendorSummaryMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Vendor Ageing Summary, Vendor Summary Ageing by Due Date, Vendor Overdue Summary, Vendor bill-wise summary]";
	
		
		
		System.out.println("*******************subMenusUnderVendorSummaryMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderFinancialBudgetMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(budgetMenu));
		budgetMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderBudgetMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderBudgetMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Define Budget, Confirm Budget, Revise Budget, Approve Budget, Rejected Budget, Update SpillOver, Revise Budget Details, Budget Reports]";
	
		
		
		System.out.println("*******************subMenusUnderBudgetMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderFinancialBudgetReviseBudgetMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(reviseBudgetMenu));
		reviseBudgetMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderReviseBudgetMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderReviseBudgetMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Append Budget, Add / Reduce Budget, Transfer Budget]";
	
		
		
		System.out.println("*******************subMenusUnderReviseBudgetMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderFinancialBudgetReportMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(budgetReportsMenu));
		budgetReportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderBudgetReportsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderBudgetReportsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Advanced Budget Report, Revised Budget Report, Budget Authorization Report, Budget Detail Report]";
	
		
		
		System.out.println("*******************subMenusUnderBudgetReportsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderFinancialOnlinePaymentsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(onlinePaymentsMenu));
		onlinePaymentsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderOnlinePaymentsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderOnlinePaymentsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Online Bank Registration, Issue Payment to Bank, Reconcile Payments, Online Bank Reconcilation, Bank Statement]";
	
		
		
		System.out.println("*******************subMenusUnderOnlinePaymentsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderInventoryMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryMenu));
		inventoryMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderInventoryMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderInventoryMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Transactions, Reports, Order Management]";
	
		
		
		System.out.println("*******************SubMenusUnderInventoryMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	public  boolean checkSubMenusUnderInventoryTransactionsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsMenu));
		inventoryTransactionsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderInventoryTransactionsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderInventoryTransactionsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Purchases, Sales, Stocks, Hold/Unhold Stock, Stock Reconciliation, Stock Allocation]";
	
		
		
		System.out.println("*******************SubMenusUnderInventoryTransactionsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderInventoryTransactionsPurchaseMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsPurchaseMenu));
		inventoryTransactionsPurchaseMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderInventoryTransactionsPurchaseMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderInventoryTransactionsPurchaseMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Request for Quote, Purchases Quotations, Purchases Orders, Material Receipt Notes]";
	
		
		
		System.out.println("*******************SubMenusUnderInventoryTransactionsPurchaseMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderInventoryTransactionsSalesMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsSalesMenu));
		inventoryTransactionsSalesMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderInventoryTransactionsSalesMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderInventoryTransactionsSalesMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Sales Quotations, Delivery Notes, POS Sales, Production Orders, Sales Orders]";
	
		
		
		System.out.println("*******************SubMenusUnderInventoryTransactionsSalesMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderInventoryTransactionsStocksMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryTransactionsStocksMenu));
		inventoryTransactionsStocksMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderInventoryTransactionsStocksMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderInventoryTransactionsStocksMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Shortages in Stock, Excesses in Stocks, Stock Transfers, Opening Stocks, Material Requisition]";
	
		
		
		System.out.println("*******************SubMenusUnderInventoryTransactionsStocksMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	public  boolean checkSubMenusUnderInventoryReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryReportsMenu));
		inventoryReportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderInventoryReportsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderInventoryReportsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Item Query, Stock Ledger, Opening Stocks Register, Stock Statement, Stock movement, Multi Level Stock Movement, Virtual Stock Analysis, Stock Valuation, Stock report by Tag, ABC Analysis, Stock Analysis by Batch, Stock Analysis by RMA, Bins Report, Stock balance by warehouse, Stock ageing analysis, Reorder Report, Fast Moving Item, Slow Moving Item, Peak/Low Balances, Best Selling Item, Raise Indent Item with Low Stock, Stock transfer report, Raise request for quote, Stock reservation report, Transaction type-wise stock report, Actual consumption report, General ledger and Inventory mismatch report]";
	
		
		
		System.out.println("*******************SubMenusUnderInventoryReportsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderInventoryBinReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryBinReportsMenu));
		inventoryBinReportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderInventoryBinReportsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderInventoryBinReportsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Stock Details by Bins, Stock Balances by Bins, Stock Balances by Item by Bins, Expired Stock by Bins]";
	
		
		
		System.out.println("*******************SubMenusUnderInventoryBinReportsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	public  boolean checkSubMenusUnderInventoryStockAgeingAnalysisReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryStockAgeingAnalysisReportsMenu));
		inventoryStockAgeingAnalysisReportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderInventoryStockAgeingAnalysisReportsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderInventoryStockAgeingAnalysisReportsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Ageing Analysis, Ageing analysis by batch, Ageing analysis by RMA, Ageing Stock by Bins, Ageing by Item by bins]";
	
		
		
		System.out.println("*******************SubMenusUnderInventoryStockAgeingAnalysisReportsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderInventoryOrderManagementMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryOrderManagementMenu));
		inventoryOrderManagementMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderInventoryOrderManagementMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderInventoryOrderManagementMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Analysis of Linked/Unlinked Documents, Quotation Analysis, Purchases Quotation, Sales Quotation, Lowest Quotation, Purchases Orders Report, Sales Orders Report, Pending Link Status]";
	
		
		
		System.out.println("*******************SubMenusUnderInventoryOrderManagementMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderInventoryOrderManagementAnalysisOfLinkedAndUnLinkedDocumentsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(inventoryOrderManagementAnalysisOfLinkedUnLinkedDocumentsMenu));
		inventoryOrderManagementAnalysisOfLinkedUnLinkedDocumentsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderInventoryOrderManagementAnalysisOfLinkedUnLinkedDocumentsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderInventoryOrderManagementAnalysisOfLinkedUnLinkedDocumentsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Listing of Documents, Listing of Documents by Due Date, Ageing of Pending Documents, Ageing of Pending Documents by Due Date, Link chain analysis, Pending voucher report]";
	
		
		
		System.out.println("*******************SubMenusUnderInventoryOrderManagementAnalysisOfLinkedUnLinkedDocumentsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderFixedAssetMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fixedAssetMenu));
		fixedAssetMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderFixedAssetMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderFixedAssetMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Transactions, Reports]";
	
		
		
		System.out.println("*******************SubMenusUnderFixedAssetMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderFixedAssetTransactionsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fixedAssetTransactionsMenu));
		fixedAssetTransactionsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderFixedAssetTransactionsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderFixedAssetTransactionsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Asset Usage, Add Asset Value, Reduce Asset Value, Disposal Of Asset, Post Depreciation Entries, Capitalization of Asset, Multiple Asset Usage, Add Depreciation Years, Transfer Of Asset Request, Transfer Of Asset, Disposal Of Asset Request, Authorize Fixed Assets]";
	
		
		
		System.out.println("*******************SubMenusUnderFixedAssetTransactionsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderFixedAssetReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(fixedAssetReportsMenu));
		fixedAssetReportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderFixedAssetReportsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderFixedAssetReportsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Transfer of asset, Assets Usage, Add Assets value, Component Added, Reduce asset value, Component Reduced, Disposal of Asset, Fixed Asset Report, Depreciation Schedule, Fixed Asset Authorization Report]";
	
		
		
		System.out.println("*******************SubMenusUnderFixedAssetReportsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderProductionMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(productionMenu));
		productionMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderProductionMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderProductionMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Transactions, Reports, MRP Settings]";
	
		
		
		System.out.println("*******************SubMenusUnderProductionMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderProductionTransactionsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(productionTransactionsMenu));
		productionTransactionsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderProductionTransactionsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderProductionTransactionsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Bill of Material, Issues to Production, Job Order, Receipts from Production, Planned Independent Requirement, Production Process, Pending production order, Job Work Issues, Production Orders, Job Work Receipts, Returns from Shop Floor, Refresh Rates]";
	
		
		
		System.out.println("*******************SubMenusUnderProductionTransactionsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderProductionReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(productionReportsMenu));
		productionReportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderProductionReportsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderProductionReportsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Consumption Register, Production Register, BOM Detail Report, Consumption Summary, Production Summary, Replenishment Report, Work in Process Report, Work in Process Summary, Item-wise Work in Process, Standard Production Cost, Production Analysis by Production Batch, Production Costing and Variance Analysis, Production Forecasting Plan, Production order status Report]";
	
		
		
		System.out.println("*******************SubMenusUnderProductionReportsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderProductionMRPSettingsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(productionMRPSettingsMenu));
		productionMRPSettingsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderProductionMRPSettingsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderProductionMRPSettingsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Production Order Series]";
	
		
		
		System.out.println("*******************SubMenusUnderProductionMRPSettingsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderPoitnOfSaleMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PointOfSaleMenu));
		PointOfSaleMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderPointOfSaleMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderPointOfSaleMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Main Screen, POS Reports, Table Management, Utilities]";
	
		
		
		System.out.println("*******************SubMenusUnderPointOfSaleMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	public  boolean checkSubMenusUnderPoitnOfSaleMainScreenMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pointOfSalesMainScreenMenu));
		pointOfSalesMainScreenMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderPointOfSaleMainScreenMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderPointOfSaleMainScreenMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Point of Sale, Point of Sale Customization, Main Screen, Main Screen Customization]";
	
		
		
		System.out.println("*******************SubMenusUnderPointOfSaleMainScreenMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	
	public  boolean checkSubMenusUnderPoitnOfSalePOSReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(pointOfSalesPOSReportsMenu));
		pointOfSalesPOSReportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderPointOfSalePOSReportsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderPointOfSalePOSReportsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Retail Sales Reports, Summary Sales Report, Preorder Reports, Preorder Payment Reports, Member Reports, Member Points Reports, Item Reports, Cash Reports, Stock Reports, Periodic Sales Reports, Last Year Comparison Reports, Miscellaneous Reports, Restaurant Reports]";
	
		
		
		System.out.println("*******************SubMenusUnderPointOfSalePOSReportsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderPoitnOfSalePOSReportsRetailSalesReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(POSReportsRetailSalesReportsMenu));
		POSReportsRetailSalesReportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderPOSReportsRetailSalesReportsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderPOSReportsRetailSalesReportsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Retail Sales Analysis, Retail Sales by Outlet, Retail Sales by Counter, Retail Sales by Item, Retail Sales Transaction Analysis]";
	
		
		
		System.out.println("*******************SubMenusUnderPOSReportsRetailSalesReportsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderPoitnOfSalePOSReportsSummarySalesReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(POSReportsSummarySalesReportMenu));
		POSReportsSummarySalesReportMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderPOSReportsSummarySalesReportsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderPOSReportsSummarySalesReportsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Sales by Date, Sales by Outlet, Sales by Item, Sales by Quantity, Sales by Amount, Sales by Quantity by Amount, Sales Walkin/Preorder by Sales, Payment by Mode Sales, Payment by Mode Summary]";
	
		
		
		System.out.println("*******************SubMenusUnderPOSReportsSummarySalesReportsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	public  boolean checkSubMenusUnderPoitnOfSalePOSReportsPreorderReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(POSReportsPreorderReportsMenu));
		POSReportsPreorderReportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderPOSReportsPreorderReportsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderPOSReportsPreorderReportsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Sales Detail Reports, Sales Detail by Order, Refund Order Report, Sales Summary Report by Quantity, Sales Summary Report by Amount]";
	
		
		
		System.out.println("*******************SubMenusUnderPOSReportsPreorderReportsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderPoitnOfSalePOSReportsPreorderPaymentReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(POSReportsPreorderPaymentReportsMenu));
		POSReportsPreorderPaymentReportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderPOSReportsPreorderPaymentReportsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderPOSReportsPreorderPaymentReportsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Payment Collection Report, Payment Collection by Payment Mode, Payment Collection by Payment No]";
	
		
		
		System.out.println("*******************SubMenusUnderPOSReportsPreorderPaymentReportsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderPoitnOfSalePOSReportsMemberReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(POSReportsMemberReportsMenu));
		POSReportsMemberReportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderPOSReportsMemberReportsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderPOSReportsMemberReportsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Membership Recruitment, Membership Recruitment by Date, Member Frequency Visit, Member Birthday Report, Sales Info by Member]";
	
		
		
		System.out.println("*******************SubMenusUnderPOSReportsMemberReportsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderPoitnOfSalePOSReportsMemberPointsReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(POSReportsMemberPointsReportsMenu));
		POSReportsMemberPointsReportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderPOSReportsMemberPointsReportsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderPOSReportsMemberPointsReportsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Points Report, Points Expiry Report, Maximum Points Report, Minimum Points Report]";
	
		
		
		System.out.println("*******************SubMenusUnderPOSReportsMemberPointsReportsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderPoitnOfSalePOSReportsItemReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(POSReportsItemReportsMenu));
		POSReportsItemReportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderPOSReportsItemReportsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderPOSReportsItemReportsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Fast Moving Items, Slow Moving Items, Non Moving Items, Fast Moving Items by Outlet, Slow Moving Items by Outlet, Non Moving Items by Outlet]";
	
		
		
		System.out.println("*******************SubMenusUnderPOSReportsItemReportsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	public  boolean checkSubMenusUnderPoitnOfSalePOSReportsCashReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(POSReportsCashReportsMenu));
		POSReportsCashReportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderPOSReportsCashReportsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderPOSReportsCashReportsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Cash Collections, Cash Discrepancy]";
	
		
		
		System.out.println("*******************SubMenusUnderPOSReportsCashReportsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderPoitnOfSalePOSReportsStockReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(POSReportsStockReportsMenu));
		POSReportsStockReportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderPOSReportsStockReportsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderPOSReportsStockReportsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Stock In and Out, Stock Status by Uutlet]";
	
		
		
		System.out.println("*******************SubMenusUnderPOSReportsStockReportsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	
	public  boolean checkSubMenusUnderPoitnOfSalePOSReportsPeriodicSalesReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(POSReportsPeriodicSalesReportsMenu));
		POSReportsPeriodicSalesReportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderPOSReportsPeriodicSalesReportsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderPOSReportsPeriodicSalesReportsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Hourly Sales by Outlet, Daily Sales by Outlet, Daily Sales by Bank by Outlet, Monthly Sales by Outlet]";
	
		
		
		System.out.println("*******************SubMenusUnderPOSReportsPeriodicSalesReportsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderPoitnOfSalePOSReportsLastYearComparisonReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(POSReportsLastYearComparisonReportsMenu));
		POSReportsLastYearComparisonReportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderPOSReportsLastYearComparisonReportsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderPOSReportsLastYearComparisonReportsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Sales Info by Quantity, Sales Info by Amount, Sales Info by Quantity and Amount, Best Outlets Performance, Worst Outlets Performance]";
	
		
		
		System.out.println("*******************SubMenusUnderPOSReportsLastYearComparisonReportsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderPoitnOfSalePOSReportsMiscellaneousReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(POSReportsMiscellaneousReportsMenu));
		POSReportsMiscellaneousReportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderPOSReportsMiscellaneousReportsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderPOSReportsMiscellaneousReportsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[X-Reading, Outlet Status, EOD Summary Report]";
	
		
		
		System.out.println("*******************SubMenusUnderPOSReportsMiscellaneousReportsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderPoitnOfSalePOSReportsRestaurantReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(POSReportsRestaurantReportsMenu));
		POSReportsRestaurantReportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderPOSReportsRestaurantReportsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderPOSReportsRestaurantReportsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Daily Sales, Sales by Menu Category, Discount by Waiter, Clerk-Wise Sales]";
	
		
		
		System.out.println("*******************SubMenusUnderPOSReportsRestaurantReportsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	
	public  boolean checkSubMenusUnderPoitnOfSaleMenuTableManagementMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PointOfSaleTableManagementMenu));
		PointOfSaleTableManagementMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderPointOfSaleTableManagementMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderPointOfSaleTableManagementMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Table Layout, Table Reservation, Cancel Reservation, Move Reservation, Kitchen Display System Configuration]";
	
		
		
		System.out.println("*******************SubMenusUnderPointOfSaleTableManagementMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	
	public  boolean checkSubMenusUnderPoitnOfSaleUtilitiesMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PointOfSaleUtilitiesMenu));
		PointOfSaleUtilitiesMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderPointOfSaleUtilitiesMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderPointOfSaleUtilitiesMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Preferences, Gift Voucher Sale, Gift Voucher Transfer, Discount Voucher Transfer, Credit Note, Message Broadcasting, Item Restrictions In Bill, Day End, Reprint Day End, BBQ Conversion, Member Prepaid Topup, Item Cutoff Timings]";
	
		
		
		System.out.println("*******************SubMenusUnderPointOfSaleUtilitiesMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	
	public  boolean checkSubMenusUnderPoitnOfSaleUtilitiesBBQConversionMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(PointOfSaleUtilitiesBBQConversionMenu));
		PointOfSaleUtilitiesBBQConversionMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderPointOfSaleUtilitiesBBQConversionMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderPointOfSaleUtilitiesBBQConversionMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Products Mapping, BBQ Conversion]";
	
		
		
		System.out.println("*******************SubMenusUnderPointOfSaleUtilitiesBBQConversionMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	public  boolean checkSubMenusUnderQualityControlMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(qualityControlMenu));
		qualityControlMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderQualityControlMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderQualityControlMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Transactions, Reports]";
	
		
		
		System.out.println("*******************SubMenusUnderQualityControlMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	public  boolean checkSubMenusUnderQualityControlTransactionsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(qualityControlTransactionsMenu));
		qualityControlTransactionsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderQualityControlTransactionsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderQualityControlTransactionsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Test Definition, Map Test To Products, Requisition, Sample Check, Total Check, Modify Test Result, Quantity Breakup, QC Series Definition, Break Down]";
	
		
		
		System.out.println("*******************SubMenusUnderQualityControlTransactionsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderQualityControlReportsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(qualityControlReportsMenu));
		qualityControlReportsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderQualityControlReportsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderQualityControlReportsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Test Definition Report, Test Item Mapping, QC Requisition, QC Sample Testing]";
	
		
		
		System.out.println("*******************SubMenusUnderQualityControlReportsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public  boolean checkSubMenusUnderSettingsMenuList() throws InterruptedException
	{
		getFluentWebDriverWait().until(ExpectedConditions.elementToBeClickable(settingsMenu));
		settingsMenu.click();
		Thread.sleep(2000);
		
			   
	    int subMenusUnderFinalAccountsMenuListCount = subMenusUnderSettingsMenuList.size();
		ArrayList<String> subMenusUnderFinalAccountsMenuListArray = new ArrayList<String>();
		for(int i=0;i<subMenusUnderFinalAccountsMenuListCount;i++)
		{
			
			String data=subMenusUnderSettingsMenuList.get(i).getText();
			
			subMenusUnderFinalAccountsMenuListArray.add(data);
		}
		String actsubMenusUnderFinalAccountsMenuListArray = subMenusUnderFinalAccountsMenuListArray.toString();
		String expsubMenusUnderFinalAccountsMenuListArray= "[Configure Transactions, Transaction Authorization, Pricebook Authorization, Configure Masters, Master Authorization, Credit Limit Authorization, Design Workflow, Settings Wizard, Export/Import Settings, Batch Code Generation, Map Credit Limit, VAT Tax Code, Customer Portal Admin, Budget Authorization, Payment Gateway Integration, AI Setup, Fixed Asset Authorization, Form Authorization]";
	
		
		
		System.out.println("*******************subMenusUnderSettingsMenuList***********************************");
		
		System.out.println("Actual SubMenus:  "+"        "+ actsubMenusUnderFinalAccountsMenuListArray +"   "+"Expected SubMenus "+     expsubMenusUnderFinalAccountsMenuListArray);
		
		if(actsubMenusUnderFinalAccountsMenuListArray.equalsIgnoreCase(expsubMenusUnderFinalAccountsMenuListArray))
			return true;
		else
			return false;
		
	
	}
	
	
	public MenusandSubMenusPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}


}
