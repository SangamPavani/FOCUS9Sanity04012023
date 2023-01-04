package com.focus.Pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.focus.base.BaseEngine;

public class StockReconciliationPage extends BaseEngine{
	
	
	//StockReconciliation
	
	@FindBy(xpath="//*[@id='selectStatus']")
	public static WebElement sr_SelectType;
	
	
	@FindBy(xpath="//*[@id='batchChk']")
	public static WebElement sr_ByBatchChkBox;
	
	
	@FindBy(xpath="//*[@id='binChk']")
	public static WebElement sr_ByBinChkBox;
	
	@FindBy(xpath="//*[@id='optInvDepartment']")
	public static WebElement sr_DepartmentDropdown;
	
	@FindBy(xpath="//*[@id='uploadBtn']")
	public static WebElement sr_FileUploadBtn;
	
	//Voucher Selection
	
	@FindBy(xpath="//*[@id='optPostingPhysical']")
	public static WebElement sr_PhysicalStockDropdown;
	
	@FindBy(xpath="//*[@id='dpPhysicalStockPostingDate']")
	public static WebElement sr_PhysicalStockDate;
	
	@FindBy(xpath="//*[@id='dpPhysicalStockPostingDate_input_image']/span")
	public static WebElement sr_PhysicalStockDateImg;
	
	@FindBy(xpath="//*[@id='optpostingExcess']")
	public static WebElement sr_ExcessStock;
	
	@FindBy(xpath="//*[@id='dpExcessStockPostingDate']")
	public static WebElement sr_ExcessStockDate;
	
	@FindBy(xpath="//*[@id='dpExcessStockPostingDate_input_image']/span")
	public static WebElement sr_ExcessStockDateImg;
	
	@FindBy(xpath="//*[@id='optPostingShortages']")
	public static WebElement sr_ShortagesStock;
	
	@FindBy(xpath="//*[@id='dpShortageStockPostingDate']")
	public static WebElement sr_ShortagesStockDate;
	
	@FindBy(xpath="//*[@id='dpShortageStockPostingDate_input_image']/span")
	public static WebElement sr_ShortagesStockDateImg;
	
	
	//Fields Mapping
	
	//Focus Fields
	
	@FindBy(xpath="//*[@id='mapoptName']")
	public static WebElement sr_FocusFieldsName;
	
	@FindBy(xpath="//*[@id='mapoptInvCode']")
	public static WebElement sr_FocusFieldsCode;
	
	@FindBy(xpath="//*[@id='mapQuantity']")
	public static WebElement sr_FocusFieldsQuantity;
	
	@FindBy(xpath="//*[@id='mapUnit']")
	public static WebElement sr_FocusFieldsUnit;
	
	//FileFields
	
	@FindBy(xpath="//*[@id='optCode']")
	public static WebElement sr_FileFields1stRow;
	
	@FindBy(xpath="//*[@id='optWharehouse']")
	public static WebElement sr_FileFields2ndRow;
	
	@FindBy(xpath="//*[@id='optQuantity']")
	public static WebElement sr_FileFieldsQuantity;
	
	@FindBy(xpath="//*[@id='optUnit']")
	public static WebElement sr_FileFieldsUnit;
	
	
	///Filter
	
	@FindBy(xpath="//*[@id='plusMinusFilter']")
	public static WebElement sr_MinusFilter;
	
	@FindBy(xpath="//*[@id='93_0_AdvanceFilter_']/table/tbody/tr/td[1]/select")
	public static WebElement sr_ConjunctionDropdown;
	
	@FindBy(xpath="//*[@id='93_0_AdvanceFilter_']/table/tbody/tr/td[2]/input")
	public static WebElement sr_FieldDropdown;
	
	@FindBy(xpath="//*[@id='93_0_AdvanceFilter_']/table/tbody/tr/td[3]/select")
	public static WebElement sr_ComparewithDropdown;
	
	@FindBy(xpath="//*[@id='93_0_AdvanceFilter_']/table/tbody/tr/td[4]/select")
	public static WebElement sr_ValueDropdown;
	
	@FindBy(xpath="//*[@id='93_0_AdvanceFilter_']/table/tbody/tr/td[5]/input")
	public static WebElement sr_DateField;
	
	@FindBy(xpath="//*[@id='93_0_AdvanceFilter_']/table/tbody/tr[1]/td[6]/span")
	public static WebElement sr_FilterDeleteBtn;
	
	@FindBy(xpath="//*[@id='93_0_AdvanceFilter_']/table/tbody/tr[1]/td[7]/span")
	public static WebElement sr_FilterAddBtn;
	
	
	//Show Items
	
	@FindBy(xpath="//*[@id='allItem']")
	public static WebElement sr_AllItemsRadioBtn;
	
	@FindBy(xpath="//*[@id='misMatchItem']")
	public static WebElement sr_MismatchedItemRadioBtn;
	
	@FindBy(xpath="//*[@id='chkShowFocusAndSheetItems']")
	public static WebElement sr_FocusandSheetItems;
	
	
	@FindBy(xpath="//*[@id='btnClear']/div/div[1]/span")
	public static WebElement sr_ClearBtn;
	
	@FindBy(xpath="//*[@id='btnImportRefresh']/div/div[1]/span")
	public static WebElement sr_RefreshBtn;
	
	//Report Table
	
	@FindBy(xpath="//*[@id='SRTable_row_heading']//th")
	public static List<WebElement> sr_ReportTableHeadingsList;
	
	
	@FindBy(xpath="//*[@id='SRTable_body']//tr[1]//td")
	public static List<WebElement> sr_Report1stRowList;
	
	@FindBy(xpath="//*[@id='SRTable_body']//tr[2]//td")
	public static List<WebElement> sr_Report2ndRowList;
	
	@FindBy(xpath="//*[@id='SRTable_body']//tr[3]//td")
	public static List<WebElement> sr_Report3rdRowList;
	
	@FindBy(xpath="//*[@id='SRTable_body']//tr[4]//td")
	public static List<WebElement> sr_Report4thRowList;
	
	@FindBy(xpath="//*[@id='SRTable_body']//tr[5]//td")
	public static List<WebElement> sr_Report5thRowList;
	
	//Headers Fields
	
	@FindBy(xpath="//*[@id='myNavbar']/ul//li[1]")
	public static List<WebElement> sr_PhysicalStockandDiff;
	
	@FindBy(xpath="//*[@id='myNavbar']/ul//li[2]")
	public static List<WebElement> sr_PostAllVouchers;
	
	@FindBy(xpath="//*[@id='myNavbar']/ul//li[3]")
	public static List<WebElement> sr_ExporttoExcel;
	
	@FindBy(xpath="//*[@id='myNavbar']/ul//li[4]")
	public static List<WebElement> sr_PostPhysicalStock;
	
	
	@FindBy(xpath="//*[@id='myNavbar']/ul//li[5]")
	public static List<WebElement> sr_PostDifference;
	
	@FindBy(xpath="//*[@id='myNavbar']/ul//li[6]")
	public static List<WebElement> sr_CancelBtn;
	
	
	
	
}
