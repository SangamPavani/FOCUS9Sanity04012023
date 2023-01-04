package com.focus.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.focus.Pages.PurchaseOrdersPage;
import com.focus.Pages.SanityDocCustViewPage;

import com.focus.base.BaseEngine;

public class SanityDocCustViewTest extends BaseEngine
{
	
	SanityDocCustViewPage dcp;
	
	
	@Test(priority=1032)
	public void checkLoginCompanyWithValidCredentials() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		 dcp=new SanityDocCustViewPage(getDriver());
		 Assert.assertEquals(dcp.checkLoginCompanyWithValidCredentials(), true);
	}
	
	
	@Test(priority=1035)
	public void checkUserCreatedVoucherDisplayWithDocumentTabInDocumentCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SanityDocCustViewPage(getDriver());
		Assert.assertEquals(dcp.checkUserCreatedVoucherDisplayWithDocumentTabInDocumentCustomization(), true);
	}
	
	@Test(priority=1036)
	public void checkCreatedVoucherMiscellaneousTabInDocumentCustoimization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SanityDocCustViewPage(getDriver());
		Assert.assertEquals(dcp.checkCreatedVoucherMiscellaneousTabInDocumentCustoimization(), true);
	}
	
	@Test(priority=1037)
	public void checkCreatedVoucherEditScreenTabInDocumentCustoimization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SanityDocCustViewPage(getDriver());
		Assert.assertEquals(dcp.checkCreatedVoucherEditScreenTabInDocumentCustoimization(), true);
	}
	
	@Test(priority=1038)
	public void checkCreatedVoucherInventoryTabInDocumentCustoimization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SanityDocCustViewPage(getDriver());
		Assert.assertEquals(dcp.checkCreatedVoucherInventoryTabInDocumentCustoimization(), true);
	}
	
	@Test(priority=1039)
	public void checkCreatedVoucherEditLayoutInDocumentCustomization() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SanityDocCustViewPage(getDriver());
		Assert.assertEquals(dcp.checkCreatedVoucherEditLayoutInDocumentCustomization(), true);
	}
	
	@Test(priority=1049)
	public void checktheNarrationinHeaderTabEditLayoutinPVVATVIEW() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SanityDocCustViewPage(getDriver());
		Assert.assertEquals(dcp.checktheNarrationinHeaderTabEditLayoutinPVVATVIEW(), true);
	}
		
	@Test(priority=1050)
	public void checkFieldDetailsTabInputDefaultValueAndPropertiesOptionReadOnlyAndClickOnApplyInEditLayout() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		dcp=new SanityDocCustViewPage(getDriver());
		Assert.assertEquals(dcp.checkFieldDetailsTabInputDefaultValueAndPropertiesOptionReadOnlyAndClickOnApplyInEditLayout(), true);
	}
		
    @Test(priority=1054)
    public void checkToggleExpansionINDocumentCustomizationVoucherScreen() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
    {
	  dcp=new SanityDocCustViewPage(getDriver());	
	  Assert.assertEquals(dcp.checkToggleExpansionINDocumentCustomizationVoucherScreen(), true);
    }
	   
	@Test(priority=1055)
	public void checkViewTabHeaderOptionsINVeiwTabUnderDocumentCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		  dcp=new SanityDocCustViewPage(getDriver());	
		  Assert.assertEquals(dcp.checkViewTabHeaderOptionsINVeiwTabUnderDocumentCustomization(), true);
	}
	   
	   @Test(priority=1056)
	   public void checkFieldTypesinBodyGridViewTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  dcp=new SanityDocCustViewPage(getDriver());	
		  Assert.assertEquals(dcp.checkFieldTypesinBodyGridViewTab(), true);
	   }
	   
	   @Test(priority=1057)
	   public void checkLoginUsersinViewsTabUnderDocumentCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  dcp=new SanityDocCustViewPage(getDriver());	
		  Assert.assertEquals(dcp.checkLoginUsersinViewsTabUnderDocumentCustomization(), true);
	   }
	   
	   @Test(priority=1058)
	   public void checkRolesInViewsTabUnderDocumentCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  dcp=new SanityDocCustViewPage(getDriver());	
		  Assert.assertEquals(dcp.checkRolesInViewsTabUnderDocumentCustomization(), true);
	   }
	   
	   @Test(priority=1059)
	   public void checkCreatingViewInViewTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  dcp=new SanityDocCustViewPage(getDriver());	
		  Assert.assertEquals(dcp.checkCreatingViewInViewTab(), true);
	   }
	   
	  
	   @Test(priority=1060)
	   public void checkDeleteinCreatedViewInViewTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  dcp=new SanityDocCustViewPage(getDriver());	
		  Assert.assertEquals(dcp.checkDeleteinCreatedViewInViewTab(), true);
	   }
	  
	   
	  @Test(priority=1061)
	   public void checkEditinginBodyFieldAndFooterFieldinInViewTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  dcp=new SanityDocCustViewPage(getDriver());	
		  Assert.assertEquals(dcp.checkEditinginBodyFieldAndFooterFieldinInViewTab(), true);
	   }
	   
	
	   
      
	   @Test(priority=1063)
	   public void checkRuleTabInDocumentCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  dcp=new SanityDocCustViewPage(getDriver());	
		  Assert.assertEquals(dcp.checkRuleTabInDocumentCustomization(), true);
	   }
	   
	   @Test(priority=1064)
	   public void checkRuleTabOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  dcp=new SanityDocCustViewPage(getDriver());	
		  Assert.assertEquals(dcp.checkRuleTabOptions(), true);
	   }
	   
	   @Test(priority=1065)
	   public void checkCreatingRuleinRuleTAbUnderDocumentCustomization() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  dcp=new SanityDocCustViewPage(getDriver());	
		  Assert.assertEquals(dcp.checkCreatingRuleinRuleTAbUnderDocumentCustomization(), true);
	   }
	  	
	  
	   
	 
	   
	   
	  // Document Numbering Tab
		
		
	   @Test(priority=1066)
	   public void checkNavigateToDocumentNumberingTabInPurchaseVoucherVatView() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  dcp=new SanityDocCustViewPage(getDriver());	
		  Assert.assertEquals(dcp.checkNavigateToDocumentNumberingTabInPurchaseVoucherVatView(), true);
	   }
	   
	   
	   @Test(priority=1067)
	   public void checkHeaderBodyandFooterFieldsinDocumentNUmberingTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  dcp=new SanityDocCustViewPage(getDriver());	
		  Assert.assertEquals(dcp.checkHeaderBodyandFooterFieldsinDocumentNUmberingTab(), true);
	   }
	   
	   
	   @Test(priority=1068)
	   public void checkTypeDropdownValues() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  dcp=new SanityDocCustViewPage(getDriver());	
		  Assert.assertEquals(dcp.checkTypeDropdownValues(), true);
	   }
	   
	   @Test(priority=1069)
	   public void checkLoadingValesinFieldsOnSelectingLoginInTypeDropDown() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  dcp=new SanityDocCustViewPage(getDriver());	
		  Assert.assertEquals(dcp.checkLoadingValesinFieldsOnSelectingLoginInTypeDropDown(), true);
	   }
	 
	   @Test(priority=1070)
	   public void checkSelectingLoginNameandInputingStartingValueandNoofCharactersandCheckFooterValue() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  dcp=new SanityDocCustViewPage(getDriver());	
		  Assert.assertEquals(dcp.checkSelectingLoginNameandInputingStartingValueandNoofCharactersandCheckFooterValue(), true);
	   }
	   	   
	   @Test(priority=1071)
	   public void checkInputingCharacterInputInSecondRowAndCheckFooterValue() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  dcp=new SanityDocCustViewPage(getDriver());	
		  Assert.assertEquals(dcp.checkInputingCharacterInputInSecondRowAndCheckFooterValue(), true);
	   }
	   
	   @Test(priority=1072)
	   public void checkLoadingValesinFieldsOnSelectingWareHouseInTypeDropDown() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  dcp=new SanityDocCustViewPage(getDriver());	
		  Assert.assertEquals(dcp.checkLoadingValesinFieldsOnSelectingWareHouseInTypeDropDown(), true);
	   }
	   
	   @Test(priority=1073)
	   public void checkSelectingNameandInputingStartingValueandNoofCharactersandCheckFooterValue() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  dcp=new SanityDocCustViewPage(getDriver());	
		  Assert.assertEquals(dcp.checkSelectingNameandInputingStartingValueandNoofCharactersandCheckFooterValue(), true);
	   }
	   
	   @Test(priority=1074)
	   public void checkInputingCharacterInputInFourthRowAndCheckFooterValue() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  dcp=new SanityDocCustViewPage(getDriver());	
		  Assert.assertEquals(dcp.checkInputingCharacterInputInFourthRowAndCheckFooterValue(), true);
	   }
	   
	   @Test(priority=1075)
	   public void checkInputingInputInTypeColumnInFifthRowAndCheckFooterValue() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  dcp=new SanityDocCustViewPage(getDriver());	
		  Assert.assertEquals(dcp.checkInputingInputInTypeColumnInFifthRowAndCheckFooterValue(), true);
	   }
	   
	   
	   @Test(priority=1076)
	   public void checkInputingIncrementInTypeColumnInFifthRowAndCheckFooterValue() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  dcp=new SanityDocCustViewPage(getDriver());	
		  Assert.assertEquals(dcp.checkInputingIncrementInTypeColumnInFifthRowAndCheckFooterValue(), true);
	   }
	   
	   
	   @Test(priority=1077)
	   public void checkSavingOnClickingUpdateOption() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  dcp=new SanityDocCustViewPage(getDriver());	
		  Assert.assertEquals(dcp.checkSavingOnClickingUpdateOption(), true);
	   }
	   
	   
	   
	   @Test(priority=1078)
	   public void checkSavedFieldsinPvVatViewVoucherDocumentNUmberingTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	   {
		  dcp=new SanityDocCustViewPage(getDriver());	
		  Assert.assertEquals(dcp.checkSavedFieldsinPvVatViewVoucherDocumentNUmberingTab(), true);
	   }
	   
	   


		@Test(priority=1079)
		public void checkRaiseDocumentOptionInTriggers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			  dcp=new SanityDocCustViewPage(getDriver());	
			  Assert.assertEquals(dcp.checkRaiseDocumentOptionInTriggers(), true);
		}
		
		
		@Test(priority=1080)
		public void checkSaveOptionInTriggerTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			  dcp=new SanityDocCustViewPage(getDriver());	
			  Assert.assertEquals(dcp.checkSaveOptionInTriggerTab(), true);
		}
		
		@Test(priority=1081)
		public void checkDeleteTriggerOptionInTriggers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			  dcp=new SanityDocCustViewPage(getDriver());	
			  Assert.assertEquals(dcp.checkDeleteTriggerOptionInTriggers(), true);
		}
		
		
		@Test(priority=1082)
		public void checkSaveTriggerWithRaiseDocumentOptionInTriggers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			  dcp=new SanityDocCustViewPage(getDriver());	
			  Assert.assertEquals(dcp.checkSaveTriggerWithRaiseDocumentOptionInTriggers(), true);
		}

     
		
		
		@Test(priority=1083)
		public void checkEditingInTriggersTabUnderPVVATView() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		{
			  dcp=new SanityDocCustViewPage(getDriver());	
			  Assert.assertEquals(dcp.checkEditingInTriggersTabUnderPVVATView(), true);
		}
		
	
		 @Test(priority=1084)
		 public void checkLogoutUserDocumentCustOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 {
			 dcp=new SanityDocCustViewPage(getDriver());	
			Assert.assertEquals(dcp.checkLogoutUserDocumentCustOptions(), true);
		 }
		 
		 
		 @Test(priority=1085)
		 public void checkLoginAfterDocumentCustOptions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 {
			 dcp=new SanityDocCustViewPage(getDriver());	
			Assert.assertEquals(dcp.checkLoginCompanyWithValidCredentials(), true);
		 }
		 
		 
	
	
	
	/*/////////////////Creating Rule Under View tab//////////////
		 
	     @Test(priority=1086)
		 public void checkRuleTabOptionsUnderViewsTabinSalesInvoiceVATVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 {
			 dcp=new SanityDocCustViewPage(getDriver());	
			Assert.assertEquals(dcp.checkRuleTabOptionsUnderViewsTabinSalesInvoiceVATVoucher(), true);
		 }
		 
		 
		 
	 @Test(priority=1087)
		 public void checkCreatingRulewithNoConditionunderViewsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 {
			 dcp=new SanityDocCustViewPage(getDriver());	
			Assert.assertEquals(dcp.checkCreatingRulewithNoConditionunderViewsTab(), true);
		 }
		 
	
		 
		 @Test(priority=1088)
		 public void checkEditRuleofSavedRuleUnderViewsTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 {
			 dcp=new SanityDocCustViewPage(getDriver());	
			Assert.assertEquals(dcp.checkEditRuleofSavedRuleUnderViewsTab(), true);
		 }
		 
		 @Test(priority=1089)
		 public void checkSavingViewAfterRuleSaved() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 {
			 dcp=new SanityDocCustViewPage(getDriver());	
			Assert.assertEquals(dcp.checkSavingViewAfterRuleSaved(), true);
		 }
		 
		 
		 @Test(priority=1090) //not getting Formatting Values
		 public void checkVerifyingSavedRule() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 {
			 dcp=new SanityDocCustViewPage(getDriver());	
			Assert.assertEquals(dcp.checkVerifyingSavedRule(), true);
		 }
	
		
		 
		 @Test(priority=1091)
		 public void checkSavedViewatVoucherLevel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 {
			 dcp=new SanityDocCustViewPage(getDriver());	
			Assert.assertEquals(dcp.checkSavedViewatVoucherLevel(), true);
		 }
		 
		 
		 
		 
		 @Test(priority=1092)
		 public void checkLogoutAndLoginWithUserAllOptionsST() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 {
			 dcp=new SanityDocCustViewPage(getDriver());	
			Assert.assertEquals(dcp.checkLogoutAndLoginWithUserAllOptionsST(), true);
		 }
		 
		 
		 @Test(priority=1093)
		 public void checkSavedViewatVoucherLevelofUserAllOptionsSTUser() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 {
			 dcp=new SanityDocCustViewPage(getDriver());	
			Assert.assertEquals(dcp.checkSavedViewatVoucherLevelofUserAllOptionsSTUser(), true);
		 }
		 
		 
		 
		 
		 @Test(priority=1094)
		 public void checkLogoutAndLoginWithSU() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 {
			 dcp=new SanityDocCustViewPage(getDriver());	
			Assert.assertEquals(dcp.checkLogoutAndLoginWithSU(), true);
		 }
		 
		 
		 
		 @Test(priority=1095)
		 public void checkRuleSavingUnderViewsTabinSalesInvoiceVoucher() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
		 {
			 dcp=new SanityDocCustViewPage(getDriver());	
			Assert.assertEquals(dcp.checkRuleSavingUnderViewsTabinSalesInvoiceVoucher(), true);
		 }
		 */
		/* 
		 ////////////////Saving Trigger and validating at voucher level//////////////////
		 
		@Test(priority=1096)
			public void checkSavingTriggerwithRaiseDocumentOptioninPurchaseOrders() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				  dcp=new SanityDocCustViewPage(getDriver());	
				  Assert.assertEquals(dcp.checkSavingTriggerwithRaiseDocumentOptioninPurchaseOrders(), true);
			}
		 
		 
		 
		 
		 @Test(priority=1097)
			public void checkSavingPurchasesOrderVoucher1() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				  dcp=new SanityDocCustViewPage(getDriver());	
				  Assert.assertEquals(dcp.checkSavingPurchasesOrderVoucher1(), true);
			}
		 
		 
		 
		 
		 @Test(priority=1098)
			public void checkSavedPurchaseVoucherVAT1AfterSavingPurchaseOrder() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				  dcp=new SanityDocCustViewPage(getDriver());	
				  Assert.assertEquals(dcp.checkSavedPurchaseVoucherVAT1AfterSavingPurchaseOrder(), true);
			}
		 
		 @Test(priority=1099)
			public void checkSavingPurchasesOrderVoucher2WithoutTriggers() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				  dcp=new SanityDocCustViewPage(getDriver());	
				  Assert.assertEquals(dcp.checkSavingPurchasesOrderVoucher2WithoutTriggers(), true);
			}
		 
		 
		 
		 
		 @Test(priority=1100)
			public void checkPurchaseVoucherVATVoucherNumberafterPurchaseOrder() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				  dcp=new SanityDocCustViewPage(getDriver());	
				  Assert.assertEquals(dcp.checkPurchaseVoucherVATVoucherNumberafterPurchaseOrder(), true);
			}
		 
		
		 
		 @Test(priority=1101)
			public void checkDeletingVoucher1PurchaseOrder() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
			 dcp=new SanityDocCustViewPage(getDriver());		
				  Assert.assertEquals(dcp.checkDeletingVoucher1PurchaseOrder(), true);
			}
		 
		  
		 
		 @Test(priority=1102)
			public void checkPurchaseVoucherVAtVoucherAfterDeletingPurchaseOrders() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
			 dcp=new SanityDocCustViewPage(getDriver());	
				  Assert.assertEquals(dcp.checkPurchaseVoucherVAtVoucherAfterDeletingPurchaseOrders(), true);
			}
*/	
		 
		 //////////////////////////Creating View for adding new fields in edit screen////////
		 
		 
		 
		 
		 
		 @Test(priority=1103)
			public void checkCreatingNewFieldsinEditScreenTabatDifferentPositions() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
			 dcp=new SanityDocCustViewPage(getDriver());	
				  Assert.assertEquals(dcp.checkCreatingNewFieldsinEditScreenTabatDifferentPositions(), true);
			}
		
		 
		 
		 @Test(priority=1104)
			public void  checkCreateViewforNewlyAddedFields() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
			 dcp=new SanityDocCustViewPage(getDriver());	
				  Assert.assertEquals(dcp. checkCreateViewforNewlyAddedFields(), true);
			}
		 
		  
		 
		 @Test(priority=1105)
			public void  checkFieldsinViewTabafterRefreshView() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
			 dcp=new SanityDocCustViewPage(getDriver());	
				  Assert.assertEquals(dcp. checkFieldsinViewTabafterRefreshView(), true);
			}
		
		 
		 @Test(priority=1106)
			public void   checkCreatedViewFieldsatVoucherLevel() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
			 dcp=new SanityDocCustViewPage(getDriver());	
				  Assert.assertEquals(dcp.  checkCreatedViewFieldsatVoucherLevel(), true);
			}
		 
		 @Test(priority=1107)
			public void   checkDeleteAddedFieldsinEditScreenTab() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
			 dcp=new SanityDocCustViewPage(getDriver());	
				  Assert.assertEquals(dcp.  checkDeleteAddedFieldsinEditScreenTab(), true);
			}
		 
		 
		 
		 
}