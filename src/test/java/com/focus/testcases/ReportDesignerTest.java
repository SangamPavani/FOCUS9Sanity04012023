package com.focus.testcases;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.focus.Pages.ReportDesignerPage;
import com.focus.base.BaseEngine;

public class ReportDesignerTest extends BaseEngine 
{
	  ReportDesignerPage RDP ;

	  @Test(priority=2311)
	  public void checkSavingReportDesignerOfAllTransactionsOfDocumentClass() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	  {
		  RDP=new ReportDesignerPage(getDriver());
		  Assert.assertEquals(RDP.checkSavingReportDesignerOfAllTransactionsOfDocumentClass(), true);
	  }
	  
	  
	  
  	
	  
	  
	  
	  
	  
}