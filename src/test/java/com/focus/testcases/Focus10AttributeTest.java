package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.AttributePage;
import com.focus.Pages.Focus10AttributePage;
import com.focus.base.BaseEngine;

public class Focus10AttributeTest extends BaseEngine{
	static Focus10AttributePage ap;	
	
	@Test(priority=201)
	public void checkLoginTOBRS() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ap=new Focus10AttributePage(getDriver());
		Assert.assertEquals(ap.checkLoginTOBRS(), true);
	}
	
	/*
	
	
	@Test(priority=202)
	public void checkConfigureTransactionMastersUnderSettings() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ap=new Focus10AttributePage(getDriver());
		Assert.assertEquals(ap.checkConfigureTransactionMastersUnderSettings(), true);
	}
	
	
	@Test(priority=203)
	public static void checkItemAttributeValuesinMastersUnderSettingsConfigureTransactions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		ap=new Focus10AttributePage(getDriver());
		Assert.assertEquals(ap.checkItemAttributeValuesinMastersUnderSettingsConfigureTransactions(), true);
	}


	@Test(priority=204)
	public void checkCloseOptionInMastersScreenUnderSettingsMenu() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		ap=new Focus10AttributePage(getDriver());
		Assert.assertEquals(ap.checkCloseOptionInMastersScreenUnderSettingsMenu(), true);	
	}

	@Test(priority=205)
	public void CheckingAttributestabinItem() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		ap=new Focus10AttributePage(getDriver());
		Assert.assertEquals(ap.CheckAttributesTabinItem(), true);
	}	
	
	
	@Test(priority=206)
	public void checkItemsAdddinginAttribute0Tab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		ap=new Focus10AttributePage(getDriver());
		Assert.assertEquals(ap.checkItemsAdddinginAttribute0Tab(), true);
	}
	
	
	@Test(priority=207)
	public void checkItemsAdddinginAttribute1Tab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		ap=new Focus10AttributePage(getDriver());
		Assert.assertEquals(ap.checkItemsAdddinginAttribute1Tab(), true);
	}
	


	@Test(priority=208)
	public void checkItemsSavedinMasterItemforFruitsandSubItems() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		ap=new Focus10AttributePage(getDriver());
		Assert.assertEquals(ap.checkItemsSavedinMasterItemforFruitsandSubItems(), true);
	}
	
	@Test(priority=209)
	public void checkItemsSavedinMasterItemforElectronicsandSubItems() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		ap=new Focus10AttributePage(getDriver());
		Assert.assertEquals(ap.checkItemsSavedinMasterItemforElectronicsandSubItems(), true);
	}
	
	@Test(priority=210)
	public void checktheNewBtninSubItemsofanItemFruits() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		ap=new Focus10AttributePage(getDriver());
		Assert.assertEquals(ap.checktheNewBtninSubItemsofanItemFruits(), true);
	}
	*/
	@Test(priority=211)
	public void checkPurchaseVocherVATtoAddAttributeItemFruitsasItem() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException{
		ap=new Focus10AttributePage(getDriver());
		Assert.assertEquals(ap.checkPurchaseVocherVATtoAddAttributeItemFruitsasItem(), true);
	}
	
	@Test(priority=212)
	public void checkPurchaseVocherVATtoAddAttributeItemElectronicsasItem() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		ap=new Focus10AttributePage(getDriver());
		Assert.assertEquals(ap.checkPurchaseVocherVATtoAddAttributeItemElectronicsasItem(), true);
	}

	
	@Test(priority=213)
	public void checkSettingsInventoryOptionsinPurchaseVATforInputItemByAttributeCheckBox() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException{
		ap=new Focus10AttributePage(getDriver());
		Assert.assertEquals(ap.checkSettingsInventoryOptionsinPurchaseVATforInputItemByAttributeCheckBox(), true);
	}
	
	@Test(priority=214)
	public void checkDisplayingofAttribute0WindowinItemsTabinPurchaseVocherVAT() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException{
		ap=new Focus10AttributePage(getDriver());
		Assert.assertEquals(ap.checkDisplayingofAttribute0WindowinItemsTabinPurchaseVocherVAT(), true);
	}
	
	@Test(priority=215)
	public void checkDisplayingofAttribute1WindowinItemsTabinPurchaseVocherVAT() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException{
		ap=new Focus10AttributePage(getDriver());
		Assert.assertEquals(ap.checkDisplayingofAttribute1WindowinItemsTabinPurchaseVocherVAT(), true);
	}
	
	
	
	@Test(priority=216)
	public void checkAddingItemSTDCOGSRateinItemWindowinPurchaseVocherVAT() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException{
		ap=new Focus10AttributePage(getDriver());
		Assert.assertEquals(ap.checkAddingItemSTDCOGSRateinItemWindowinPurchaseVocherVAT(), true);
	}
	
	
	
}
