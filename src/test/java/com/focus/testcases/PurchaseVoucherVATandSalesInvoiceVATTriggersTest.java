package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.PurchaseVoucherVATandSalesInvoiceVATTriggersPage;
import com.focus.Pages.SanityDocCustViewPage;
import com.focus.base.BaseEngine;

public class PurchaseVoucherVATandSalesInvoiceVATTriggersTest extends BaseEngine{
	PurchaseVoucherVATandSalesInvoiceVATTriggersPage PST;
	
	
	
	@Test(priority=100)
	public void checkEraseAllTransactions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkEraseAllTransactions(), true);
	}
	
	@Test(priority=101)
	public void checkDeleteVATFieldinEditScreenofPurchaseVoucherVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkDeleteVATFieldinEditScreenofPurchaseVoucherVAT(), true);
	}
	
	
	
	@Test(priority=102)
	public void checkSaveOptionInTriggerTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkSaveTriggerwithDiscountasMapFieldinPVVAT(), true);
	}
	
	
	
	@Test(priority=103)
	public void checkSavingPurchaseVoucherVATVoucher1withDiscountasMapField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkSavingPurchaseVoucherVATVoucher1withDiscountasMapField(), true);
	}
	
	
	
	
	@Test(priority=104)
	public void checkTriggerOptionsaftersavewithMapField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkTriggerOptionsaftersavewithMapField(), true);
	}
	
	
	@Test(priority=105)
	public void checkCreatingAlertinTriggersPurchaseVoucherVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkCreatingAlertinTriggersPurchaseVoucherVAT(), true);
	}
	
	
		
	
	@Test(priority=106)
	public void checkCreatedAlertandUserSelectinPurchaseVoucherVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkCreatedAlertandUserSelectinPurchaseVoucherVAT(), true);
	}
	
	@Test(priority=107)
	public void checkLogoutAndLoginWithSU() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkLogoutAndLoginWithSU(), true);
	}
	
	
	@Test(priority=108)
	public void checkSavingVoucher2inPVVATforAlerts() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkSavingVoucher2inPVVATforAlerts(), true);
	}
	
	
	
	
	@Test(priority=109)
	public void checkLogoutandLoginwithUserAllOptionsSTforAlertMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkLogoutandLoginwithUserAllOptionsSTforAlertMessage(), true);
	}
	
	
	
	
	@Test(priority=110)
	public void checkTriggerAlertMessageinUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkTriggerAlertMessageinUserAllOptionsST(), true);
	}
	
	@Test(priority=111)
	public void checkAgainLogoutAndLoginWithSU() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkLogoutAndLoginWithSU(), true);
	}
	
	
	
	@Test(priority=112)
	public void checkCreateUserforTriggers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkCreateUserforTriggers(), true);
	}
	
	
	
	
	@Test(priority=113)
	public void checkEmailTemplateCreationinPurchaseVoucherVATTriggers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkEmailTemplateCreationinPurchaseVoucherVATTriggers(), true);
	}
	
	
	
	
	@Test(priority=114)
	public void checkCreatedEmailTemplateinPVVATView() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkCreatedEmailTemplateinPVVATView(), true);
	}
	
	
	@Test(priority=115)
	public void checkAgainLogoutAndLoginWithSUforEmailTemplateValidation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkLogoutAndLoginWithSU(), true);
	}
	
	
	@Test(priority=116)
	public void checkSavingVoucher3inPVVATforEmailValidation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkSavingVoucher3inPVVATforEmailValidation(), true);
	}
	
	
	
	@Test(priority=117)
	public void checkEmailValidationUserforCreatedTriggerTemplate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkEmailValidationUserforCreatedTriggerTemplate(), true);
	}
	
	
	@Test(priority=118)
	public void checkCreateEmailTemplateforVendor() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkCreateEmailTemplateforVendor(), true);
	}
	
	@Test(priority=119)
	public void checkSavingPurchaseVoucherVATforVendorEmail() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkSavingPurchaseVoucherVATforVendorEmail(), true);
	}
	
	
	@Test(priority=120)
	public void checkEmailValidationVendorforCreatedTriggerTemplate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkEmailValidationUserforCreatedTriggerTemplate(), true);
	}
	
	
	
	
	@Test(priority=121)
	public void checkCreatingSMSTemplateforTriggersinPVVATVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkCreatingSMSTemplateforTriggersinPVVATVoucher(), true);
	}
	
	@Test(priority=122)
	public void checkCreatedSMSAlertinPurchaseVoucherVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkCreatedSMSAlertinPurchaseVoucherVAT(), true);
	}
	
	////Sales Invoice VAT
	
	
	@Test(priority=125)
	public void checkDeleteVATFieldinEditScreenofSalesInvoiceVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkDeleteVATFieldinEditScreenofSalesInvoiceVAT(), true);
	}
	
	
	@Test(priority=126)
	public void checkSaveTriggerwithDiscountasMapFieldinSalesInvoiceVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkSaveTriggerwithDiscountasMapFieldinSalesInvoiceVAT(), true);
	}
	
	@Test(priority=127)
	public void checkSavingSalesInvoiceVATVoucher1withDiscountasMapField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkSavingSalesInvoiceVATVoucher1withDiscountasMapField(), true);
	}
	
	@Test(priority=128)
	public void checkCashSalesVoucherafterTriggerOptionsSavewithMapField() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkCashSalesVoucherafterTriggerOptionsSavewithMapField(), true);
	}
	
	@Test(priority=129)
	public void checkCreatingAlertinTriggersSalesInvoiceVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkCreatingAlertinTriggersSalesInvoiceVAT(), true);
	}
	
	@Test(priority=130)
	public void checkCreatedAlertandUserSelectinSalesInvoiceVATVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkCreatedAlertandUserSelectinSalesInvoiceVATVoucher(), true);
	}
	
	@Test(priority=131)
	public void checkSavingVoucher2inSalesInvoiceVATforAlertMessage() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkSavingVoucher2inSalesInvoiceVATforAlertMessage(), true);
	}
	
	
	@Test(priority=132)
	public void checkLogoutandLoginwithUserAllOptionsSTforAlertMessageofSalesInvoiceVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkLogoutandLoginwithUserAllOptionsSTforAlertMessage(), true);
	}
	
	@Test(priority=133)
	public void checkTriggerAlertMessageinUserAllOptionsSTofSalesInvoiceVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkTriggerAlertMessageinUserAllOptionsSTofSalesInvoiceVAT(), true);
	}
	
	@Test(priority=134)
	public void checkLogoutAndLoginWithSUforSalesInvoiceVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkLogoutAndLoginWithSU(), true);
	}
	
	
	
	
	
	
	@Test(priority=135)
	public void checkEmailTemplateCreationinSalesInvoiceVATTriggers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkEmailTemplateCreationinSalesInvoiceVATTriggers(), true);
	}
	
	
	@Test(priority=136)
	public void checkCreatedEmailTemplateinSalesInvoiceVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkCreatedEmailTemplateinSalesInvoiceVAT(), true);
	}
	
	
	
	@Test(priority=137)
	public void checkSavingVoucher3inSalesInvoiceVATforEmailValidation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkSavingVoucher3inSalesInvoiceVATforEmailValidation(), true);
	}
	
	
	@Test(priority=138)
	public void checkEmailValidationUserforCreatedSalesTriggerTemplate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkEmailValidationUserforCreatedSalesTriggerTemplate(), true);
	}
	
	@Test(priority=139)
	public void checkCreateEmailTemplateforCustomer() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkCreateEmailTemplateforCustomer(), true);
	}
	
	@Test(priority=140)
	public void checkSavingVoucher4inSalesInvoiceVATforCustomerEmailValidation() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkSavingVoucher4inSalesInvoiceVATforCustomerEmailValidation(), true);
	}
	
	@Test(priority=141)
	public void checkEmailValidationUserforCustomerCreatedSalesTriggerTemplate() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkEmailValidationUserforCreatedSalesTriggerTemplate(), true);
	}
	
	
	@Test(priority=142)
	public void checkCreatingSMSTemplateforTriggersinSalesInvoiceVATVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkCreatingSMSTemplateforTriggersinSalesInvoiceVATVoucher(), true);
	}
	
	@Test(priority=143)
	public void checkCreatedSMSAlertinSalesInvoiceVAT() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		  PST=new PurchaseVoucherVATandSalesInvoiceVATTriggersPage(getDriver());	
		  Assert.assertEquals(PST.checkCreatedSMSAlertinSalesInvoiceVAT(), true);
	}
	
	
	
	
	
	
	
	
	
}
