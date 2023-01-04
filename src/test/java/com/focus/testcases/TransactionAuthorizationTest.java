package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.TransactionAuthorizationPage;
import com.focus.base.BaseEngine;

public class TransactionAuthorizationTest extends BaseEngine
{
	TransactionAuthorizationPage TP;
	
	
	 @Test(priority=100)
	 public void checkSavingTransactionAuthorizationInPurchaseReturns() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 TP=new TransactionAuthorizationPage(getDriver());
		 Assert.assertEquals(TP.checkSavingTransactionAuthorizationInPurchaseReturns(), true);
	 }
	 
	 @Test(priority=102)
	 public void checkEditingTransactionAuthorizationInPurchaseReturns() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 TP=new TransactionAuthorizationPage(getDriver());
		 Assert.assertEquals(TP.checkEditingTransactionAuthorizationInPurchaseReturns(), true);
	 }
	 
	 @Test(priority=210)
	 public void checkDeletingTransactionAuthorizationInPurchaseReturns() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	 {
		 TP=new TransactionAuthorizationPage(getDriver());
		 Assert.assertEquals(TP.checkDeletingTransactionAuthorizationInPurchaseReturns(), true);
	 }
	
/*	@Test(priority=103)
	 public void checkPurchaseReturnsVoucher1() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException{
		TP= new TransactionAuthorizationPage(getDriver());
		Assert.assertEquals(TP.checkPurchaseReturnsVoucher1(), true);
	}
	
	@Test(priority=104)
	 public void checkAuthorizationStatusOfVoucher1() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException{
		TP= new TransactionAuthorizationPage(getDriver());
		Assert.assertEquals(TP.checkAuthorizationStatusOfVoucher1(), true);
	}
	
	@Test(priority=105)
	 public void checkPurchaseReturnsVoucher2() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException{
		TP= new TransactionAuthorizationPage(getDriver());
		Assert.assertEquals(TP.checkPurchaseReturnsVoucher2(), true);
	}
	@Test(priority=106)
	 public void checkAuthorizationStatusOfVoucher2() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException{
		TP= new TransactionAuthorizationPage(getDriver());
		Assert.assertEquals(TP.checkAuthorizationStatusOfVoucher2(), true);
	}

	@Test(priority=107)
	 public void checkVerifyingAndDeletingPurchaseReturnsVoucher1() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException{
		TP= new TransactionAuthorizationPage(getDriver());
		Assert.assertEquals(TP.checkVerifyingAndDeletingPurchaseReturnsVoucher1(), true);
	}

	@Test(priority=108)
	 public void checkVerifyingAndDeletingPurchaseReturnsVoucher2() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException{
		TP= new TransactionAuthorizationPage(getDriver());
		Assert.assertEquals(TP.checkVerifyingAndDeletingPurchaseReturnsVoucher2(), true);
	}
*/

}
