package com.focus.testcases;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.AttributePage;
import com.focus.Pages.DebitNotesPage;
import com.focus.base.BaseEngine;

public class AttributeTest extends BaseEngine {
	
	static AttributePage ap;
	
	@Test(priority=101)
	public void checkLoginTOBRS() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ap=new AttributePage(getDriver());
		Assert.assertEquals(ap.checkLoginTOBRS(), true);
	}
	
	
	
	
	@Test(priority=102)
	public void checkConfigureTransactionMastersUnderSettings() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		ap=new AttributePage(getDriver());
		Assert.assertEquals(ap.checkConfigureTransactionMastersUnderSettings(), true);
	}
	
	
	

	@Test(priority=103)
	public static void checkItemAttributeValuesinMastersUnderSettingsConfigureTransactions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		ap=new AttributePage(getDriver());
		Assert.assertEquals(ap.checkItemAttributeValuesinMastersUnderSettingsConfigureTransactions(), true);
	}


	@Test(priority=104)
	public void checkCloseOptionInMastersScreenUnderSettingsMenu() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		ap=new AttributePage(getDriver());
		Assert.assertEquals(ap.checkCloseOptionInMastersScreenUnderSettingsMenu(), true);	
	}
	
	
	@Test(priority=105)
	public void CheckAttributesTabinItemMenu() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		ap=new AttributePage(getDriver());
		Assert.assertEquals(ap.CheckAttributesTabinItemMenu(), true);
	}	
	
	@Test(priority=106)
	public void checkItemsAdddinginAttribute0Tab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		ap=new AttributePage(getDriver());
		Assert.assertEquals(ap.checkItemsAdddinginAttribute0Tab(), true);
	}
	
	
	@Test(priority=107)
	public void checkItemsAdddinginAttribute1Tab() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		ap=new AttributePage(getDriver());
		Assert.assertEquals(ap.checkItemsAdddinginAttribute1Tab(), true);
	}
	
	
	
	@Test(priority=108)
	public void  checkItemsSavedinMasterItemforFruitsandSubItems() throws InterruptedException{
		ap=new AttributePage(getDriver());
		Assert.assertEquals(ap.checkItemsSavedinMasterItemforFruitsandSubItems(),true);
	}
	
	
@Test(priority=109)
	public void checkItemsSavedinMasterItemforElectronicsandSubItems() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		ap=new AttributePage(getDriver());
		Assert.assertEquals(ap.checkItemsSavedinMasterItemforElectronicsandSubItems(),true);
	}
	
	
	@Test(priority=110)
	public void checktheNewBtninSubItemsofanItemFruits() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException{
		ap=new AttributePage(getDriver());
		Assert.assertEquals(ap.checktheNewBtninSubItemsofanItemFruits(), true);
	}
	


	@Test(priority=111)
		public void checkFruitsItemProperties() throws InterruptedException{
		ap=new AttributePage(getDriver());
		Assert.assertEquals(ap.checkFruitsItemProperties(), true);
	}

	@Test(priority=112)
	public void checkElectronicsItemProperties() throws InterruptedException{
		ap=new AttributePage(getDriver());
		Assert.assertEquals(ap.checkElectronicsItemProperties(), true);
	}
	
	@Test(priority=113)
	public void checkLogoutAndLoginAgain() throws InterruptedException{
		ap=new AttributePage(getDriver());
		Assert.assertEquals(ap.checkLogoutAndLoginAgain(), true);
	}
/*
	

	@Test(priority=114)
	public void checkPurchaseVocherVATtoAddAttributeItemFruitsasItem() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		ap=new AttributePage(getDriver());
		Assert.assertEquals(ap.checkPurchaseVocherVATtoAddAttributeItemFruitsasItem(),true);
	}

		
	@Test(priority=115)	
	public void checkPurchaseVocherVATtoAddAttributeItemElectronicsasItem() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException{
		ap=new AttributePage(getDriver());
		Assert.assertEquals(ap.checkPurchaseVocherVATtoAddAttributeItemElectronicsasItem(), true);
	}
	
	@Test(priority=116)
	public void checkSettingsInventoryOptionsinPurchaseVATforInputAttributeCheckBox() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		ap=new AttributePage(getDriver());
		Assert.assertEquals(ap.checkSettingsInventoryOptionsinPurchaseVATforInputAttributeCheckBox(),true);
	}
		

	@Test(priority=117)
	public void checkDisplayingofAttribute0WindowinItemsTabinPurchaseVocherVAT() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		ap=new AttributePage(getDriver());
		
		Assert.assertEquals(ap.checkDisplayingofAttribute0WindowinItemsTabinPurchaseVocherVAT(), true);
		
	}
	
	@Test(priority=118)
	public void checkDisplayingofAttribute1WindowinItemsTabinPurchaseVocherVAT() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException
	{
		ap=new AttributePage(getDriver());
		
		Assert.assertEquals(ap.checkDisplayingofAttribute1WindowinItemsTabinPurchaseVocherVAT(), true);
		
	}

	@Test(priority=119)
	public void checkAddingitemSTDCOGSRateinItemWindowinPurchaseVocherVAT() throws EncryptedDocumentException, InvalidFormatException, InterruptedException, IOException{
		ap=new AttributePage(getDriver());
		Assert.assertEquals(ap.checkAddingitemSTDCOGSRateinItemWindowinPurchaseVocherVAT(), true);
	}
	
	*/
	
}
