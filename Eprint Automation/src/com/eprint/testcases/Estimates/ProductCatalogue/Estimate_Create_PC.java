package com.eprint.testcases.Estimates.ProductCatalogue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
import com.eprint.pageObjects.Estimates.Estimate_Add;
import com.eprint.pageObjects.Estimates.ProductCatalogue.Estimate_Add_PC_AddPage;
import com.eprint.pageObjects.Estimates.QuickQuote.Estimate_Add_QuickQuote;

public class Estimate_Create_PC extends SuperTestNG
{
	@Test()
	public static void test_Estimate_Create_PC()
	{
	try
	{
		EprintSpecificLinks.login();
	}
	catch (NoSuchElementException ex)
	{
		Reporter.log("Already Logged in Continuing with Test Process",true);
	}
	String xlpath = "./src/com/eprint/testData/Estimates/Product Catalogue.xls";
	String sheetName = "Product Catalogue";
	try
	{
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		ProjectLibrary.HoverDropdownControlByXpath("Estimates", "//span[text()='Estimates']", "Add New","Add New");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	catch(NoSuchElementException e)
	{
		ProjectLibrary.HoverDropdownControlByXpath("Quotes", "//b/span[text()='Quotes']", "Add New","Add New");
	}
	
	driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCStage1_txtName")).click();
	Generic.BlindWait(2);
	WebElement Autocomplete = driver.findElement(By.id("ctl00_uc_ctl00_ClientName"));
	Actions actions = new Actions(driver);
	actions.moveToElement(Autocomplete).perform();
	actions.click().perform();
	
	ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 13, 1, "Estimate Type", Estimate_Add.drpdn_EstimateType());
	ProjectLibrary.StringDDTextBox(xlpath, sheetName, 14, 1, "Estimate title", Estimate_Add.txtbx_EstimateTitle());
	ProjectLibrary.StringDDTextBox(xlpath, sheetName, 15, 1, " Customer Order Number", Estimate_Add.txtbx_CustomerOrderNumber());
	ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 16, 1, "Status", Estimate_Add.drpdn_Status());
	
	ProjectLibrary.ClickOnButton("Next", Estimate_Add.btn_Next());
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 27, 1, "Show Products", Estimate_Add_PC_AddPage.drpdn_ShowProducts());
	Generic.BlindWait(2);
	ProjectLibrary.StringDDTextBox(xlpath, sheetName, 28, 1, "Item Title Filter", Estimate_Add_PC_AddPage.txtbx_ItemTitle());
	ProjectLibrary.ClickOnButton("Item Title", Estimate_Add_PC_AddPage.btn_ItemTitleFilter());
	String Itemtitle = Generic.getXlCellValue(xlpath, sheetName, 28, 1);
	driver.findElement(By.xpath("//table/tbody/tr/td[2]/div/a[contains(text(),'"+Itemtitle+"')]")).click();
	Reporter.log("Clicking on the product name ",true);
	WebElement Framepath = driver.findElement(By.xpath("html/body/div/form/div[1]/table/tbody/tr[2]/td[2]/iframe"));
	driver.switchTo().frame(Framepath);
	Reporter.log("Switching to Radwindow frame ",true);
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 28, 1, "Item Title", Estimate_Add_PC_AddPage.ProductRadWindow.txtbx_ItemTitle());
	ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 30, 1, "Quantity 1", Estimate_Add_PC_AddPage.ProductRadWindow.drpdn_Quantity1());
	ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 30, 2, "Quantity 2", Estimate_Add_PC_AddPage.ProductRadWindow.drpdn_Quantity2());
	ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 30, 3, "Quantity 3", Estimate_Add_PC_AddPage.ProductRadWindow.drpdn_Quantity3());
	ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 30, 4, "Quantity 4", Estimate_Add_PC_AddPage.ProductRadWindow.drpdn_Quantity4());
	ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 31, 1, "Create Multiples Of ", Estimate_Add_PC_AddPage.ProductRadWindow.drpdn_CreateMultipleOf());
	ProjectLibrary.ClickOnButton("Save", Estimate_Add_PC_AddPage.ProductRadWindow.btn_Save());
	driver.switchTo().defaultContent();
	Generic.BlindWait(3);
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------//
	Reporter.log("----------------------------------------------------------------------------------",true);
	String EstimateNumber = Estimate_Add_PC_AddPage.EstimateSummary.txt_EstimateNumber().getText();
	Reporter.log("Estimate Number = "+EstimateNumber,true);
	Reporter.log("----------------------------------------------------------------------------------",true);
	ProjectLibrary.CompareStringText(xlpath, sheetName, 28, 1, "Item Title Name", Estimate_Add_QuickQuote.Estimate_Summary.txt_ItemTitle());
	
	ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 1, "Quantity 1", Estimate_Add_PC_AddPage.EstimateSummary.txt_Qty1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 2, "Quantity 2", Estimate_Add_PC_AddPage.EstimateSummary.txt_Qty2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 3, "Quantity 3", Estimate_Add_PC_AddPage.EstimateSummary.txt_Qty3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 4, "Quantity 4", Estimate_Add_PC_AddPage.EstimateSummary.txt_Qty4());
	
	ProjectLibrary.CompareStringText(xlpath, sheetName, 37, 2, "Multiple of 1", Estimate_Add_PC_AddPage.EstimateSummary.txt_MultipleOf1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 37, 3, "Multiple of 2", Estimate_Add_PC_AddPage.EstimateSummary.txt_MultipleOf2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 37, 4, "Multiple of 3", Estimate_Add_PC_AddPage.EstimateSummary.txt_MultipleOf3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 37, 5, "Multiple of 4", Estimate_Add_PC_AddPage.EstimateSummary.txt_MultipleOf4());
	
	ProjectLibrary.CompareStringText(xlpath, sheetName, 38, 2, "Cost for each set 1", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostForEachSet1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 38, 3, "Cost for each set 2", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostForEachSet2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 38, 4, "Cost for each set 3", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostForEachSet3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 38, 5, "Cost for each set 4", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostForEachSet4());
	
	ProjectLibrary.CompareStringText(xlpath, sheetName, 39, 2, "Additonal Options Cost 1", Estimate_Add_PC_AddPage.EstimateSummary.txt_AdditionalOptionsCost1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 39, 3, "Additonal Options Cost 2", Estimate_Add_PC_AddPage.EstimateSummary.txt_AdditionalOptionsCost2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 39, 4, "Additonal Options Cost 3", Estimate_Add_PC_AddPage.EstimateSummary.txt_AdditionalOptionsCost3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 39, 5, "Additonal Options Cost 4", Estimate_Add_PC_AddPage.EstimateSummary.txt_AdditionalOptionsCost4());
	
	ProjectLibrary.CompareStringText(xlpath, sheetName, 40, 2, "Total Cost 1", Estimate_Add_PC_AddPage.EstimateSummary.txt_TotalCost1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 40, 3, "Total Cost 2", Estimate_Add_PC_AddPage.EstimateSummary.txt_TotalCost2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 40, 4, "Total Cost 3", Estimate_Add_PC_AddPage.EstimateSummary.txt_TotalCost3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 40, 5, "Total Cost 4", Estimate_Add_PC_AddPage.EstimateSummary.txt_TotalCost4());
	
	ProjectLibrary.CompareStringText(xlpath, sheetName, 41, 2, "Cost Price (ex. Markup) 1", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostPrice_Excl_Markup1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 41, 3, "Cost Price (ex. Markup) 2", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostPrice_Excl_Markup2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 41, 4, "Cost Price (ex. Markup) 3", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostPrice_Excl_Markup3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 41, 5, "Cost Price (ex. Markup) 4", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostPrice_Excl_Markup4());
	
	ProjectLibrary.CompareStringText(xlpath, sheetName, 42, 2, "Markup 1", Estimate_Add_PC_AddPage.EstimateSummary.txt_Markup1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 42, 3, "Markup 2", Estimate_Add_PC_AddPage.EstimateSummary.txt_Markup2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 42, 4, "Markup 3", Estimate_Add_PC_AddPage.EstimateSummary.txt_Markup3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 42, 5, "Markup 4", Estimate_Add_PC_AddPage.EstimateSummary.txt_Markup4());
	
	ProjectLibrary.CompareStringText(xlpath, sheetName, 43, 2, "Cost Price (inc. Markup) 1", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostPrice_Incl_Markup1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 43, 3, "Cost Price (inc. Markup) 2", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostPrice_Incl_Markup2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 43, 4, "Cost Price (inc. Markup) 3", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostPrice_Incl_Markup3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 43, 5, "Cost Price (inc. Markup) 4", Estimate_Add_PC_AddPage.EstimateSummary.txt_CostPrice_Incl_Markup4());
	
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 44, 2, "Proft Margin (%) 1", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_ProfitMarginPercentage1());
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 44, 3, "Proft Margin (%) 2", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_ProfitMarginPercentage2());
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 44, 4, "Proft Margin (%) 3", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_ProfitMarginPercentage3());
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 44, 5, "Proft Margin (%) 4", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_ProfitMarginPercentage4());
	
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 45, 2, "Proft Margin ($) 1", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_ProfitMarginPrice1());
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 45, 3, "Proft Margin ($) 2", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_ProfitMarginPrice2());
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 45, 4, "Proft Margin ($) 3", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_ProfitMarginPrice3());
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 45, 5, "Proft Margin ($) 4", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_ProfitMarginPrice4());
	
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 46, 2, "SubTotal 1", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_SubTotal1());
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 46, 3, "SubTotal 2", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_SubTotal2());
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 46, 4, "SubTotal 3", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_SubTotal3());
	ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 46, 5, "SubTotal 4", Estimate_Add_PC_AddPage.EstimateSummary.txtbx_SubTotal4());
	
	ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 47, 1, "Tax", Estimate_Add_PC_AddPage.EstimateSummary.drpdn_Tax());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 47, 2, "Tax Value 1", Estimate_Add_PC_AddPage.EstimateSummary.txt_TaxValue1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 47, 3, "Tax Value 2", Estimate_Add_PC_AddPage.EstimateSummary.txt_TaxValue2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 47, 4, "Tax Value 3", Estimate_Add_PC_AddPage.EstimateSummary.txt_TaxValue3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 47, 5, "Tax Value 4", Estimate_Add_PC_AddPage.EstimateSummary.txt_TaxValue4());
	
	ProjectLibrary.CompareStringText(xlpath, sheetName, 48, 2, "Selling Price (inc. Tax) 1", Estimate_Add_PC_AddPage.EstimateSummary.txt_SellingPrice1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 48, 3, "Selling Price (inc. Tax) 2", Estimate_Add_PC_AddPage.EstimateSummary.txt_SellingPrice2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 48, 4, "Selling Price (inc. Tax) 3", Estimate_Add_PC_AddPage.EstimateSummary.txt_SellingPrice3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 48, 5, "Selling Price (inc. Tax) 4", Estimate_Add_PC_AddPage.EstimateSummary.txt_SellingPrice4());
	
	ProjectLibrary.CompareStringText(xlpath, sheetName, 49, 2, "Gross Profit ($) 1", Estimate_Add_PC_AddPage.EstimateSummary.txt_GrossProfitPrice1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 49, 3, "Gross Profit ($) 2", Estimate_Add_PC_AddPage.EstimateSummary.txt_GrossProfitPrice2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 49, 4, "Gross Profit ($) 3", Estimate_Add_PC_AddPage.EstimateSummary.txt_GrossProfitPrice3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 49, 5, "Gross Profit ($) 4", Estimate_Add_PC_AddPage.EstimateSummary.txt_GrossProfitPrice4());
	
	ProjectLibrary.CompareStringText(xlpath, sheetName, 50, 2, "Gross Profit (%) 1", Estimate_Add_PC_AddPage.EstimateSummary.txt_GrossProfitPercentage1());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 50, 3, "Gross Profit (%) 2", Estimate_Add_PC_AddPage.EstimateSummary.txt_GrossProfitPercentage2());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 50, 4, "Gross Profit (%) 3", Estimate_Add_PC_AddPage.EstimateSummary.txt_GrossProfitPercentage3());
	ProjectLibrary.CompareStringText(xlpath, sheetName, 50, 5, "Gross Profit (%) 4", Estimate_Add_PC_AddPage.EstimateSummary.txt_GrossProfitPercentage4());
	
	//ProjectLibrary.ClickOnButton("Save", Estimate_Add_PC_AddPage.EstimateSummary.btn_Save());

	}
}
