package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.MenusandSubMenusPage;
import com.focus.base.BaseEngine;

public class MenusandSubMenusTest extends BaseEngine{
	
	MenusandSubMenusPage msmp;
	
	@Test(priority=1000)
	public void checkLogin() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkLogin(), true);	
	}

	
	@Test(priority=1001)
	public void checkHomeMenuSubMenusList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkHomeMenuSubMenusList(), true);	
	}

	
	@Test(priority=1002)
	public void checkSubMenusUnderCompanyMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderCompanyMenuList(), true);	
	}
	
	
	
	@Test(priority=1003)
	public void checkSubMenusUnderNewCompanyMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderNewCompanyMenuList(), true);	
	}
	
	@Test(priority=1004)
	public void checkSubMenusUnderYearEndProcessMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderYearEndProcessMenuList(), true);	
	}

	
	@Test(priority=1005)
	public void checkSubMenusUnderInterCompanyTransactionsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderInterCompanyTransactionsMenuList(), true);	
	}
	
	@Test(priority=1006)
	public void checkSubMenusUnderSecurityMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderSecurityMenuList(), true);	
	}
	

	@Test(priority=1007)
	public void checkSubMenusUnderMasterMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderMasterMenuList(), true);	
	}
	
	

	@Test(priority=1008)
	public void checkSubMenusUnderCurrencyMasterMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderCurrencyMasterMenuList(), true);	
	}
	
	

	@Test(priority=1009)
	public void checkSubMenusUnderItemMasterMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderItemMasterMenuList(), true);	
	}
	
	

	@Test(priority=1010)
	public void checkSubMenusUnderSchemesMasterMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderSchemesMasterMenuList(), true);	
	}
	

	@Test(priority=1011)
	public void checkSubMenusUnderSchemesDiscountDifinitionMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderSchemesDiscountDifinitionMenuList(), true);	
	}
	

	
	
	@Test(priority=1012)
	public void checkSubMenusUnderMRPMasterMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderMRPMasterMenuList(), true);	
	}
	

	
	
	@Test(priority=1013)
	public void checkSubMenusUnderQCMasterMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderQCMasterMenuList(), true);	
	}
	

	
	@Test(priority=1014)
	public void checkSubMenusUnderMaintainanceMasterMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderMaintainanceMasterMenuList(), true);	
	}
	
	
	@Test(priority=1015)
	public void checkSubMenusUnderPointOfSaleMasterMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPointOfSaleMasterMenuList(), true);	
	}
	

	
	
	@Test(priority=1016)
	public void checkSubMenusUnderPointOfSaleMemberMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPointOfSaleMemberMenuList(), true);	
	}
	

	
	
	@Test(priority=1017)
	public void checkSubMenusUnderPointOfSaleGiftVoucherMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPointOfSaleGiftVoucherMenuList(), true);	
	}
	

	
	@Test(priority=1018)
	public void checkSubMenusUnderPointOfSaleDiscountVoucherMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPointOfSaleDiscountVoucherMenuList(), true);	
	}
	

	@Test(priority=1019)
	public void checkSubMenusUnderPointOfSaleTableManagementMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPointOfSaleTableManagementMenuList(), true);	
	}
	
	//checkSubMenusUnderPoitnOfSaleMenuTableManagementMenuList
//checkSubMenusUnderPoitnOfSaleTableManagementMenuList
	
	@Test(priority=1020)
	public void checkSubMenusUnderPayrollMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPayrollMenuList(), true);	
	}
	

	@Test(priority=1021)
	public void checkSubMenusUnderDataManagementMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderDataManagementMenuList(), true);	
	}
	
	
	@Test(priority=1022)
	public void checkSubMenusUnderUtilitiesMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderUtilitiesMenuList(), true);	
	}
	
	
	//Financial Menu
	
	@Test(priority=1023)
	public void checkSubMenusUnderFinancialMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialMenuList(), true);	
	}
	
	
	@Test(priority=1024)
	public void checkSubMenusUnderFinancialTransactionsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialTransactionsMenuList(), true);	
	}
	

	
	@Test(priority=1025)
	public void checkSubMenusUnderFinancialTransactionsCashAndBankMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialTransactionsCashAndBankMenuList(), true);	
	}
	

	@Test(priority=1026)
	public void checkSubMenusUnderFinancialTransactionsPurchaseMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialTransactionsPurchaseMenuList(), true);	
	}
	
	
	@Test(priority=1027)
	public void checkSubMenusUnderFinancialTransactionsSalesMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialTransactionsSalesMenuList(), true);	
	}
	
	
	@Test(priority=1028)
	public void checkSubMenusUnderFinancialTransactionsJournalsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialTransactionsJournalsMenuList(), true);	
	}
	

	@Test(priority=1029)
	public void checkSubMenusUnderFinancialTransactionsAutoPostingsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialTransactionsAutoPostingsMenuList(), true);	
	}
	
	@Test(priority=1030)
	public void checkSubMenusUnderFinancialCreditManagementMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialCreditManagementMenuList(), true);	
	}
	
	
	@Test(priority=1031)
	public void checkSubMenusUnderFinancialCreditManagementDelinquencyMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialCreditManagementDelinquencyMenuList(), true);	
	}
	
	
	@Test(priority=1032)
	public void checkSubMenusUnderFinancialReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialReportsMenuList(), true);	
	}
	

	@Test(priority=1033)
	public void checkSubMenusUnderFinancialReportsCashAndBankBooksMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialReportsCashAndBankBooksMenuList(), true);	
	}
	
	@Test(priority=1034)
	public void checkSubMenusUnderFinancialSalesReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialSalesReportsMenuList(), true);	
	}
	
	@Test(priority=1035)
	public void checkSubMenusUnderFinancialPurchaseReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialPurchaseReportsMenuList(), true);	
	}
	
	@Test(priority=1036)
	public void checkSubMenusUnderFinancialRegisterReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialRegisterReportsMenuList(), true);	
	}
	
	
	@Test(priority=1037)
	public void checkSubMenusUnderFinancialSalesAndPurchaseAnalysisReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialSalesAndPurchaseAnalysisReportsMenuList(), true);	
	}
	

	@Test(priority=1038)
	public void checkSubMenusUnderFinancialMiscellaneousAnalysisReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialMiscellaneousAnalysisReportsMenuList(), true);	
	}
	
	@Test(priority=1039)
	public void checkSubMenusUnderFinancialMasterInformationReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialMasterInformationReportsMenuList(), true);	
	}
	
	@Test(priority=1040)
	public void checkSubMenusUnderFinancialAuditTrailReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialAuditTrailReportsMenuList(), true);	
	}
	
	@Test(priority=1041)
	public void checkSubMenusUnderFinancialFinalAccountsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialFinalAccountsMenuList(), true);	
	}
	
	
	@Test(priority=1042)
	public void checkSubMenusUnderFinancialReceivableAndPayableAnalysisMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialReceivableAndPayableAnalysisMenuList(), true);	
	}
	
	@Test(priority=1043)
	public void checkSubMenusUnderFinancialReceivableAndPayableAnalysisCustomerDetailMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialReceivableAndPayableAnalysisCustomerDetailMenuList(), true);	
	}
	
	@Test(priority=1044)
	public void checkSubMenusUnderFinancialReceivableAndPayableAnalysisCustomerSummaryMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialReceivableAndPayableAnalysisCustomerSummaryMenuList(), true);	
	}
	
	
	@Test(priority=1045)
	public void checkSubMenusUnderFinancialReceivableAndPayableAnalysisVendorDetailMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialReceivableAndPayableAnalysisVendorDetailMenuList(), true);	
	}
	
	
	@Test(priority=1046)
	public void checkSubMenusUnderFinancialReceivableAndPayableAnalysisVendorSummaryMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialReceivableAndPayableAnalysisVendorSummaryMenuList(), true);	
	}
	
	@Test(priority=1047)
	public void checkSubMenusUnderFinancialBudgetMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialBudgetMenuList(), true);	
	}
	
	
	@Test(priority=1048)
	public void checkSubMenusUnderFinancialBudgetReviseBudgetMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialBudgetReviseBudgetMenuList(), true);	
	}
	
	
	@Test(priority=1049)
	public void checkSubMenusUnderFinancialBudgetReportMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialBudgetReportMenuList(), true);	
	}
	
	
	@Test(priority=1050)
	public void checkSubMenusUnderFinancialOnlinePaymentsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFinancialOnlinePaymentsMenuList(), true);	
	}
	
	
	/// Inventory Menu
	
	@Test(priority=1051)
	public void checkSubMenusUnderInventoryMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderInventoryMenuList(), true);	
	}
	
	
	@Test(priority=1052)
	public void checkSubMenusUnderInventoryTransactionsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderInventoryTransactionsMenuList(), true);	
	}
	
	@Test(priority=1053)
	public void checkSubMenusUnderInventoryTransactionsPurchaseMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderInventoryTransactionsPurchaseMenuList(), true);	
	}
	
	
	@Test(priority=1054)
	public void checkSubMenusUnderInventoryTransactionsSalesMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderInventoryTransactionsSalesMenuList(), true);	
	}
	
	
	@Test(priority=1055)
	public void checkSubMenusUnderInventoryTransactionsStocksMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderInventoryTransactionsStocksMenuList(), true);	
	}
	
	
	@Test(priority=1056)
	public void checkSubMenusUnderInventoryReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderInventoryReportsMenuList(), true);	
	}
	
	
	@Test(priority=1057)
	public void checkSubMenusUnderInventoryBinReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderInventoryBinReportsMenuList(), true);	
	}
	
	
	@Test(priority=1058)
	public void checkSubMenusUnderInventoryStockAgeingAnalysisReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderInventoryStockAgeingAnalysisReportsMenuList(), true);	
	}
	
	
	@Test(priority=1059)
	public void checkSubMenusUnderInventoryOrderManagementMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderInventoryOrderManagementMenuList(), true);	
	}
	
	
	@Test(priority=1060)
	public void checkSubMenusUnderInventoryOrderManagementAnalysisOfLinkedAndUnLinkedDocumentsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderInventoryOrderManagementAnalysisOfLinkedAndUnLinkedDocumentsMenuList(), true);	
	}
	
	////Fixed Asset Menu
	
	
	@Test(priority=1061)
	public void checkSubMenusUnderFixedAssetMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFixedAssetMenuList(), true);	
	}
	
	
	@Test(priority=1062)
	public void checkSubMenusUnderFixedAssetTransactionsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFixedAssetTransactionsMenuList(), true);	
	}
	
	
	@Test(priority=1063)
	public void checkSubMenusUnderFixedAssetReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderFixedAssetReportsMenuList(), true);	
	}
	
	
	///Production Menu
	
	@Test(priority=1064)
	public void checkSubMenusUnderProductionMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderProductionMenuList(), true);	
	}
	
	
	@Test(priority=1065)
	public void checkSubMenusUnderProductionTransactionsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderProductionTransactionsMenuList(), true);	
	}
	
	
	@Test(priority=1066)
	public void checkSubMenusUnderProductionReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderProductionReportsMenuList(), true);	
	}
	
	
	@Test(priority=1067)
	public void checkSubMenusUnderProductionMRPSettingsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderProductionMRPSettingsMenuList(), true);	
	}
	
	
	///Point Of Sale
	
	
	@Test(priority=1068)
	public void checkSubMenusUnderPoitnOfSaleMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPoitnOfSaleMenuList(), true);	
	}
	
	
	@Test(priority=1069)
	public void checkSubMenusUnderPoitnOfSaleMainScreenMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPoitnOfSaleMainScreenMenuList(), true);	
	}
	
	
	@Test(priority=1070)
	public void checkSubMenusUnderPoitnOfSalePOSReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPoitnOfSalePOSReportsMenuList(), true);	
	}
	
	
	@Test(priority=1071)
	public void checkSubMenusUnderPoitnOfSalePOSReportsRetailSalesReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPoitnOfSalePOSReportsRetailSalesReportsMenuList(), true);	
	}
	
	//
	
	@Test(priority=1072)
	public void checkSubMenusUnderPoitnOfSalePOSReportsSummarySalesReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPoitnOfSalePOSReportsSummarySalesReportsMenuList(), true);	
	}
	
	
	@Test(priority=1073)
	public void checkSubMenusUnderPoitnOfSalePOSReportsPreorderReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPoitnOfSalePOSReportsPreorderReportsMenuList(), true);	
	}
	
	
	@Test(priority=1074)
	public void checkSubMenusUnderPoitnOfSalePOSReportsPreorderPaymentReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPoitnOfSalePOSReportsPreorderPaymentReportsMenuList(), true);	
	}
	
	
	@Test(priority=1075)
	public void checkSubMenusUnderPoitnOfSalePOSReportsMemberReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPoitnOfSalePOSReportsMemberReportsMenuList(), true);	
	}
	
	//
	@Test(priority=1076)
	public void checkSubMenusUnderPoitnOfSalePOSReportsMemberPointsReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPoitnOfSalePOSReportsMemberPointsReportsMenuList(), true);	
	}
	
	
	@Test(priority=1077)
	public void checkSubMenusUnderPoitnOfSalePOSReportsItemReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPoitnOfSalePOSReportsItemReportsMenuList(), true);	
	}
	
	
	@Test(priority=1078)
	public void checkSubMenusUnderPoitnOfSalePOSReportsCashReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPoitnOfSalePOSReportsCashReportsMenuList(), true);	
	}
	
	
	@Test(priority=1079)
	public void checkSubMenusUnderPoitnOfSalePOSReportsStockReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPoitnOfSalePOSReportsStockReportsMenuList(), true);	
	}
	
	
	@Test(priority=1080)
	public void checkSubMenusUnderPoitnOfSalePOSReportsPeriodicSalesReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPoitnOfSalePOSReportsPeriodicSalesReportsMenuList(), true);	
	}
	
	
	@Test(priority=1081)
	public void checkSubMenusUnderPoitnOfSalePOSReportsLastYearComparisonReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPoitnOfSalePOSReportsLastYearComparisonReportsMenuList(), true);	
	}
	
	
	@Test(priority=1082)
	public void checkSubMenusUnderPoitnOfSalePOSReportsMiscellaneousReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPoitnOfSalePOSReportsMiscellaneousReportsMenuList(), true);	
	}
	
	
	@Test(priority=1083)
	public void checkSubMenusUnderPoitnOfSalePOSReportsRestaurantReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPoitnOfSalePOSReportsRestaurantReportsMenuList(), true);	
	}
	
	
	@Test(priority=1084)
	public void checkSubMenusUnderPoitnOfSaleMenuTableManagementMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPoitnOfSaleMenuTableManagementMenuList(), true);	
	}
	
	
	@Test(priority=1085)
	public void checkSubMenusUnderPoitnOfSaleUtilitiesMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPoitnOfSaleUtilitiesMenuList(), true);	
	}
	
	@Test(priority=1086)
	public void checkSubMenusUnderPoitnOfSaleUtilitiesBBQConversionMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderPoitnOfSaleUtilitiesBBQConversionMenuList(), true);	
	}
	
	//Quality Control
	
	@Test(priority=1087)
	public void checkSubMenusUnderQualityControlMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderQualityControlMenuList(), true);	
	}
	
	
	@Test(priority=1088)
	public void checkSubMenusUnderQualityControlTransactionsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderQualityControlTransactionsMenuList(), true);	
	}
	
	@Test(priority=1089)
	public void checkSubMenusUnderQualityControlReportsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderQualityControlReportsMenuList(), true);	
	}
	
	
	//Settings
	@Test(priority=1090)
	public void checkSubMenusUnderSettingsMenuList() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		msmp=new MenusandSubMenusPage(getDriver());
		Assert.assertEquals(msmp.checkSubMenusUnderSettingsMenuList(), true);	
	}
	
}
