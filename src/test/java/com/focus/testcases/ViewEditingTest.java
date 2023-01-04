package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.PurchaseVoucherVATandSalesInvoiceVATTriggersPage;
import com.focus.Pages.ViewEditingPage;
import com.focus.base.BaseEngine;

public class ViewEditingTest extends BaseEngine{
	
	ViewEditingPage vep;
	
	/*
	@Test(priority=1000)
	public void checkCreatingViewOptionInPurchaseVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		vep=new ViewEditingPage(getDriver());	
		  Assert.assertEquals(vep.checkCreatingViewOptionInPurchaseVoucher(), true);
		  
	}
	
	
	@Test(priority=1001)
	public void checkLogoutandLoginwithUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		vep=new ViewEditingPage(getDriver());	
		  Assert.assertEquals(vep.checkLogoutandLoginwithUserAllOptionsST(), true);
		  
	}

	
	@Test(priority=1002)
	public void checkSavinfPurchaseOrderVoucherforView() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		vep=new ViewEditingPage(getDriver());	
		  Assert.assertEquals(vep.checkSavinfPurchaseOrderVoucherforView(), true);
		  
	}
	
	
	@Test(priority=1003)
	public void checkConvertPurchaseOrderVouchertoPurchaseVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		vep=new ViewEditingPage(getDriver());	
		  Assert.assertEquals(vep.checkConvertPurchaseOrderVouchertoPurchaseVoucher(), true);
		  
	}
	
		
	
	@Test(priority=1004)
	public void check2ndRowEditingofPurchaseVoucherView() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		vep=new ViewEditingPage(getDriver());	
		  Assert.assertEquals(vep.check2ndRowEditingofPurchaseVoucherView(), true);
		  
	}*/
	//////////Creating Rule Under View
	
	@Test(priority=1005)
	public void checkLogoutAndLoginWithSU() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		vep=new ViewEditingPage(getDriver());	
		  Assert.assertEquals(vep.checkLogoutAndLoginWithSU(), true);
		  
	}
	
	
	
	@Test(priority=1006)
	public void checkRuleTabOptionsUnderViewsTabinSalesInvoiceVATVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		vep=new ViewEditingPage(getDriver());	
		  Assert.assertEquals(vep.checkRuleTabOptionsUnderViewsTabinSalesInvoiceVATVoucher(), true);
		  
	}
	
	@Test(priority=1007)
	public void checkCreatingRulewithNoConditionunderViewsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		vep=new ViewEditingPage(getDriver());	
		  Assert.assertEquals(vep.checkCreatingRulewithNoConditionunderViewsTab(), true);
		  
	}
	
	
	@Test(priority=1008)
	public void checkEditRuleofSavedRuleUnderViewsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		vep=new ViewEditingPage(getDriver());	
		  Assert.assertEquals(vep.checkEditRuleofSavedRuleUnderViewsTab(), true);
		  
	}
	
	@Test(priority=1009)//if tab formatting values is not comming
	public void checkVerifyingSavedRule() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		vep=new ViewEditingPage(getDriver());	
		  Assert.assertEquals(vep.checkVerifyingSavedRule(), true);
		  
	}
	
	@Test(priority=1010)
	public void checkLogoutandLoginwithUserAllOptionsSTforView() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		vep=new ViewEditingPage(getDriver());	
		  Assert.assertEquals(vep.checkLogoutandLoginwithUserAllOptionsST(), true);
		  
	}
	@Test(priority=1011)
	public void checkSavedViewatVoucherLevelofUserAllOptionsSTUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		vep=new ViewEditingPage(getDriver());	
		  Assert.assertEquals(vep.checkSavedViewatVoucherLevelofUserAllOptionsSTUser(), true);
		  
	}
	
	
	@Test(priority=1012)
	public void checkLogoutAndLoginWithSUAgain() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		vep=new ViewEditingPage(getDriver());	
		  Assert.assertEquals(vep.checkLogoutAndLoginWithSU(), true);
		  
	}
	
	

}
