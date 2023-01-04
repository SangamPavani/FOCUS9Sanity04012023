package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.CopyDocumentPage;
import com.focus.base.BaseEngine;

public class CopyDocumentTest extends BaseEngine{
	
	CopyDocumentPage CDP;
	
	
	@Test(priority=291)
	public void checkLoginTOMaintainQuantityCompany() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		CDP=new CopyDocumentPage(getDriver());
		Assert.assertEquals(CDP.checkLoginTOMaintainQuantityCompany(), true);
	}
	

	@Test(priority=292)
	public void checkCopyDocumentScreeninStockTransferVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		CDP=new CopyDocumentPage(getDriver());
		Assert.assertEquals(CDP.checkCopyDocumentScreeninStockTransferVoucher(), true);
	}
	
	
	
	@Test(priority=293)
	public void checkVoucherTypeinCopyDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		CDP=new CopyDocumentPage(getDriver());
		Assert.assertEquals(CDP.checkVoucherTypeinCopyDocument(), true);
	}
	
		
	@Test(priority=294)
	public void checkSerachOptioninCopyDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		CDP=new CopyDocumentPage(getDriver());
		Assert.assertEquals(CDP.checkSerachOptioninCopyDocument(), true);
	}
		
	
	
	@Test(priority=295)
	public void checkFilterOptioninCopyDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		CDP=new CopyDocumentPage(getDriver());
		Assert.assertEquals(CDP.checkFilterOptioninCopyDocument(), true);
	}  
	
	
	@Test(priority=296)
	public void checkClubSimilarCheckBoxinCopyDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		CDP=new CopyDocumentPage(getDriver());
		Assert.assertEquals(CDP.checkClubSimilarCheckBoxinCopyDocument(), true);
	}  
	
	
	
	@Test(priority=297)
	public void checkColumnValuesafterClubinStockTransferVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		CDP=new CopyDocumentPage(getDriver());
		Assert.assertEquals(CDP.checkColumnValuesafterClubinStockTransferVoucher(), true);
	}  
	
	
	

}
