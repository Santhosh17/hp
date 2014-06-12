package com.eprint.testcases.Estimates.OtherCosts;

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
import com.eprint.pageObjects.Estimates.OtherCosts.Estimate_Add_OC_Add;

public class Estimate_Create_OtherCostsQuantityBased extends SuperTestNG
{
	@Test
	public static void testEstimate_Create_OtherCostsQuantityBased()
	{
		try
		{
			EprintSpecificLinks.login();
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Aleready Logged in Continuing with Testing Process",true);
		}
		String xlpath = "./src/com/eprint/testData/Estimates/Other Cost.xls";
		String sheetName = "Quantity Based";
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
//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		Reporter.log("----------------------------------------------------------------------------------",true);
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 1, "Item Title",Estimate_Add_OC_Add.txtbx_ItemTitle());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 2, "Finished Quantity 1", Estimate_Add_OC_Add.txtbx_FinishedQty1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 4, "Finished Quantity 2", Estimate_Add_OC_Add.txtbx_FinishedQty2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 6, "Finished Quantity 3", Estimate_Add_OC_Add.txtbx_FinishedQty3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 30, 8, "Finished Quantity 4", Estimate_Add_OC_Add.txtbx_FinishedQty4());
		
		ProjectLibrary.ClickOnButton("All Tab", Estimate_Add_OC_Add.tab_All());
		
		String OtherCostName = Generic.getXlCellValue(xlpath, sheetName, 31, 1);
		driver.findElement(By.xpath("//div[@id='div_nameid']/a[contains(text(),'"+OtherCostName+"')]")).click();
		Reporter.log("Clicked on "+OtherCostName,true);
		
		driver.switchTo().frame("html/body/form/div[1]/table/tbody/tr[2]/td[2]/iframe");
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 32, 1, "Description", Estimate_Add_OC_Add.OtherCostRadwindow.TimeBased.txtbx_Description());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 33, 1, "Unit Rate 1", Estimate_Add_OC_Add.OtherCostRadwindow.QuantityBased.txtbx_UnitRate1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 33, 2, "Unit Rate 2", Estimate_Add_OC_Add.OtherCostRadwindow.QuantityBased.txtbx_UnitRate2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 33, 3, "Unit Rate 3", Estimate_Add_OC_Add.OtherCostRadwindow.QuantityBased.txtbx_UnitRate3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 33, 4, "Unit Rate 4", Estimate_Add_OC_Add.OtherCostRadwindow.QuantityBased.txtbx_UnitRate4());
		
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 34, 1, "Quantity 1", Estimate_Add_OC_Add.OtherCostRadwindow.QuantityBased.txtbx_Quantity1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 34, 2, "Quantity 2", Estimate_Add_OC_Add.OtherCostRadwindow.QuantityBased.txtbx_Quantity2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 34, 3, "Quantity 3", Estimate_Add_OC_Add.OtherCostRadwindow.QuantityBased.txtbx_Quantity3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 34, 4, "Quantity 4", Estimate_Add_OC_Add.OtherCostRadwindow.QuantityBased.txtbx_Quantity4());

		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 35, 1, "Markup 1", Estimate_Add_OC_Add.OtherCostRadwindow.QuantityBased.txtbx_Markup1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 35, 2, "Markup 2", Estimate_Add_OC_Add.OtherCostRadwindow.QuantityBased.txtbx_Markup2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 35, 3, "Markup 3", Estimate_Add_OC_Add.OtherCostRadwindow.QuantityBased.txtbx_Markup3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 35, 4, "Markup 4", Estimate_Add_OC_Add.OtherCostRadwindow.QuantityBased.txtbx_Markup4());

		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 36, 1, "Selling Price 1", Estimate_Add_OC_Add.OtherCostRadwindow.QuantityBased.txtbx_SellingPrice1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 36, 2, "Selling Price 2", Estimate_Add_OC_Add.OtherCostRadwindow.QuantityBased.txtbx_SellingPrice2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 36, 3, "Selling Price 3", Estimate_Add_OC_Add.OtherCostRadwindow.QuantityBased.txtbx_SellingPrice3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 36, 4, "Selling Price 4", Estimate_Add_OC_Add.OtherCostRadwindow.QuantityBased.txtbx_SellingPrice4());

		ProjectLibrary.ClickOnButton("Save", Estimate_Add_OC_Add.OtherCostRadwindow.QuantityBased.btn_Save());
		driver.switchTo().defaultContent();
		Generic.BlindWait(2);
		ProjectLibrary.ClickOnButton("Finish", Estimate_Add_OC_Add.btn_Finish());
//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		Reporter.log("----------------------------------------------------------------------------------",true);
		String EstimateNumber = Estimate_Add_OC_Add.EstimateSummary.txt_EstimateNumber().getText();
		Reporter.log("Estimate Number = "+EstimateNumber,true);
		Reporter.log("----------------------------------------------------------------------------------",true);
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 29, 1, "Item Title", Estimate_Add_OC_Add.EstimateSummary.txt_ItemTitle());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 2, "Quantity 1", Estimate_Add_OC_Add.EstimateSummary.txt_Qty1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 4, "Quantity 2", Estimate_Add_OC_Add.EstimateSummary.txt_Qty2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 6, "Quantity 3", Estimate_Add_OC_Add.EstimateSummary.txt_Qty3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 30, 8, "Quantity 4", Estimate_Add_OC_Add.EstimateSummary.txt_Qty4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 43, 2, "Price 1", Estimate_Add_OC_Add.EstimateSummary.txt_Price1(OtherCostName));
		ProjectLibrary.CompareStringText(xlpath, sheetName, 43, 3, "Price 2", Estimate_Add_OC_Add.EstimateSummary.txt_Price2(OtherCostName));
		ProjectLibrary.CompareStringText(xlpath, sheetName, 43, 4, "Price 3", Estimate_Add_OC_Add.EstimateSummary.txt_Price3(OtherCostName));
		ProjectLibrary.CompareStringText(xlpath, sheetName, 43, 5, "Price 4", Estimate_Add_OC_Add.EstimateSummary.txt_Price4(OtherCostName));
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 44, 2, "Cost Price (ex. Markup) 1", Estimate_Add_OC_Add.EstimateSummary.txt_CostPrice_Excl_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 44, 3, "Cost Price (ex. Markup) 2", Estimate_Add_OC_Add.EstimateSummary.txt_CostPrice_Excl_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 44, 4, "Cost Price (ex. Markup) 3", Estimate_Add_OC_Add.EstimateSummary.txt_CostPrice_Excl_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 44, 5, "Cost Price (ex. Markup) 4", Estimate_Add_OC_Add.EstimateSummary.txt_CostPrice_Excl_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 45, 2, "Markup 1", Estimate_Add_OC_Add.EstimateSummary.txt_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 45, 3, "Markup 2", Estimate_Add_OC_Add.EstimateSummary.txt_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 45, 4, "Markup 3", Estimate_Add_OC_Add.EstimateSummary.txt_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 45, 5, "Markup 4", Estimate_Add_OC_Add.EstimateSummary.txt_Markup4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 46, 2, "Cost Price (Inc. Markup) 1", Estimate_Add_OC_Add.EstimateSummary.txt_CostPrice_Incl_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 46, 3, "Cost Price (Inc. Markup) 2", Estimate_Add_OC_Add.EstimateSummary.txt_CostPrice_Incl_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 46, 4, "Cost Price (Inc. Markup) 3", Estimate_Add_OC_Add.EstimateSummary.txt_CostPrice_Incl_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 46, 5, "Cost Price (Inc. Markup) 4", Estimate_Add_OC_Add.EstimateSummary.txt_CostPrice_Incl_Markup4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 47, 2, "Profit Margin (%) 1", Estimate_Add_OC_Add.EstimateSummary.txtbx_ProfitMarginPercentage1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 47, 3, "Profit Margin (%) 2", Estimate_Add_OC_Add.EstimateSummary.txtbx_ProfitMarginPercentage2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 47, 4, "Profit Margin (%) 3", Estimate_Add_OC_Add.EstimateSummary.txtbx_ProfitMarginPercentage3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 47, 5, "Profit Margin (%) 4", Estimate_Add_OC_Add.EstimateSummary.txtbx_ProfitMarginPercentage4());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 48, 2, "Profit Margin ($) 1", Estimate_Add_OC_Add.EstimateSummary.txtbx_ProfitMarginPrice1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 48, 3, "Profit Margin ($) 2", Estimate_Add_OC_Add.EstimateSummary.txtbx_ProfitMarginPrice1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 48, 4, "Profit Margin ($) 3", Estimate_Add_OC_Add.EstimateSummary.txtbx_ProfitMarginPrice1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 48, 5, "Profit Margin ($) 4", Estimate_Add_OC_Add.EstimateSummary.txtbx_ProfitMarginPrice1());
		
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 49, 2, "Sub Total 1", Estimate_Add_OC_Add.EstimateSummary.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 49, 3, "Sub Total 1", Estimate_Add_OC_Add.EstimateSummary.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 49, 4, "Sub Total 1", Estimate_Add_OC_Add.EstimateSummary.txtbx_SubTotal1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, 49, 5, "Sub Total 1", Estimate_Add_OC_Add.EstimateSummary.txtbx_SubTotal1());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 50, 1, "Tax", Estimate_Add_OC_Add.EstimateSummary.drpdn_Tax());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 50, 2, "Tax Value 1", Estimate_Add_OC_Add.EstimateSummary.txt_TaxValue1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 50, 3, "Tax Value 2", Estimate_Add_OC_Add.EstimateSummary.txt_TaxValue2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 50, 4, "Tax Value 3", Estimate_Add_OC_Add.EstimateSummary.txt_TaxValue3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 50, 5, "Tax Value 4", Estimate_Add_OC_Add.EstimateSummary.txt_TaxValue4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 51, 2, "Selling Price (inc Tax) 1", Estimate_Add_OC_Add.EstimateSummary.txt_SellingPrice1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 51, 3, "Selling Price (inc Tax) 2", Estimate_Add_OC_Add.EstimateSummary.txt_SellingPrice2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 51, 4, "Selling Price (inc Tax) 3", Estimate_Add_OC_Add.EstimateSummary.txt_SellingPrice3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 51, 5, "Selling Price (inc Tax) 4", Estimate_Add_OC_Add.EstimateSummary.txt_SellingPrice4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 52, 2, "Gross Profit ($) 1", Estimate_Add_OC_Add.EstimateSummary.txt_GrossProfitPrice1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 52, 3, "Gross Profit ($) 2", Estimate_Add_OC_Add.EstimateSummary.txt_GrossProfitPrice2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 52, 4, "Gross Profit ($) 3", Estimate_Add_OC_Add.EstimateSummary.txt_GrossProfitPrice3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 52, 5, "Gross Profit ($) 4", Estimate_Add_OC_Add.EstimateSummary.txt_GrossProfitPrice4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, 53, 2, "Gross Profit (%) 1", Estimate_Add_OC_Add.EstimateSummary.txt_GrossProfitPercentage1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 53, 3, "Gross Profit (%) 2", Estimate_Add_OC_Add.EstimateSummary.txt_GrossProfitPercentage2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 53, 4, "Gross Profit (%) 3", Estimate_Add_OC_Add.EstimateSummary.txt_GrossProfitPercentage3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, 53, 5, "Gross Profit (%) 4", Estimate_Add_OC_Add.EstimateSummary.txt_GrossProfitPercentage4());
		
//		ProjectLibrary.ClickOnButton("Save", Estimate_Add_OC_Add.EstimateSummary.btn_Save());
	}
}