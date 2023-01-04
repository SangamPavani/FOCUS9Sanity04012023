package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.PricebookAuthorizationPage;
import com.focus.base.BaseEngine;

public class PriceBookAuthorizationTest extends BaseEngine{
	
	PricebookAuthorizationPage pap;
	
	 @Test(priority=10000)
		public void checkOpenPricebookAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkOpenPricebookAuthorization(), true);	
		}
		
		
		
		@Test(priority=10001)
		public void checkPricebookDropdownOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());	
			Assert.assertEquals(pap.checkPricebookDropdownOptions(), true);
		}
		
		
		
		@Test(priority=10002)
		public void checkSaveWithoutSelectionOfPriceBook() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkSaveWithoutSelectionOfPriceBook(), true);
		}
		

		@Test(priority=10003)
		public void checkSelectingBuyingPriceBookinPriceBookDropdown() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkSelectingBuyingPriceBookinPriceBookDropdown(), true);
		}
		
		@Test(priority=10004)
		public void checkSaveWithoutName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkSaveWithoutName(), true);
		}
		
		@Test(priority=10005)
		public void checkActiveCheckBox() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkActiveCheckBox(), true);
		}
		
		
		@Test(priority=10006)
		public void checkInputNameAndClickOnSaveWithoutAuthorizationSettings() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkInputNameAndClickOnSaveWithoutAuthorizationSettings(), true);
		}
		
		
		@Test(priority=10007)
		public void checkStartPoint() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkStartPoint(), true);
		}
		
		@Test(priority=10008)
		public void checkConditionTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkConditionTabOptions(), true);
		}
		
		@Test(priority=10009)
		public void checkUserSelectionTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkUserSelectionTabOptions(), true);
		}
		
		
		@Test(priority=100010)
		public void checkUserDropdownOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkUserDropdownOptions(), true);
		}
		
		
		@Test(priority=100011)
		public void checkAlertsTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkAlertsTabOptions(), true);
		}
		
		
		
		@Test(priority=100012)
		public void checkCancelButtonInDefinitionScreen() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkCancelButtonInDefinitionScreen(), true);
		}
		
		@Test(priority=100013)
		public void checkDescriptionAsMandatory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkDescriptionAsMandatory(), true);
		}
		
		
		
		@Test(priority=100014)
		public void checkConditionAsMandatory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkConditionAsMandatory(), true);
		}
		
		
		@Test(priority=100015)
		public void checkUserSelectionIsManadatory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkUserSelectionIsManadatory(), true);
		}
		
		
		@Test(priority=100016)
		public void checkOkButtonOnSelectingUser() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkOkButtonOnSelectingUser(), true);
		}
		
		
		@Test(priority=100017)
		public void checkSavingBuyingPriceBookAuthorization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkSavingBuyingPriceBookAuthorization(), true);
		}
		
		
		@Test(priority=100018)
		public void checkCancelButton() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkCancelButton(), true);
		}
		
		
		@Test(priority=100019)
		public void checkDisplayingMastersNameInListOfMasters() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkDisplayingMastersNameInListOfMasters(), true);
		}
		
		
		@Test(priority=100020)
		public void checkSavedNameDisplayInNameTextBox() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkSavedNameDisplayInNameTextBox(), true);
		}

		
		@Test(priority=100021)
		public void checkEditBudgetAuthorizationSettings() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkEditBudgetAuthorizationSettings(), true);
		}
		
		@Test(priority=100022) 
		public void checkConditionCheckbox() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkConditionCheckbox(), true);
		}
		
		
		@Test(priority=100023)
		public void checkEditOnSelectAlertsTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkEditOnSelectAlertsTabOptions(), true);
		}
		
		
		@Test(priority=100024)
		public void checkSaveWithAllMandatoryInputs() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkSaveWithAllMandatoryInputs(), true);
		}
		
		
		
		@Test(priority=100025)
		public void checkCreatedEmailInEmailHedaerTemplate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkCreatedEmailInEmailHedaerTemplate(), true);
		}
		
		
				
		@Test(priority=100026)
		public void checkEmailTemplateUserExpandInFieldsTabOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkEmailTemplateUserExpandInFieldsTabOptions(), true);
		}
		
		
		
		@Test(priority=100027)
		public void checkFieldsTabPricebookFieldsOptions() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			pap=new PricebookAuthorizationPage(getDriver());		
			Assert.assertEquals(pap.checkFieldsTabPricebookFieldsOptions(), true);
		}
		
		
		
		
}
