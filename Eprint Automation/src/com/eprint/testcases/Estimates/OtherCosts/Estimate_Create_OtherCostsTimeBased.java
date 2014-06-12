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
import com.eprint.pageObjects.Estimates.LargeFormat.Estimate_Add_LF_Linear;
import com.eprint.pageObjects.Estimates.OtherCosts.Estimate_Add_OC_Add;

public class Estimate_Create_OtherCostsTimeBased extends SuperTestNG
{
	@Test
	public static void testEstimate_Create_OtherCostsTimeBased()
	{
		try 
		{
			EprintSpecificLinks.login();
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Aleready Logged in Continuing with Testing Process",true);
		}
		
		String xlpath = "./src/com/eprint/testData/Estimates/Large Format Linear.xls";
		String sheetName = "Large Format Main";
		
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
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Item Title",Estimate_Add_OC_Add.txtbx_ItemTitle());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Finished Quantity 1", Estimate_Add_OC_Add.txtbx_FinishedQty1());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Finished Quantity 2", Estimate_Add_OC_Add.txtbx_FinishedQty2());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Finished Quantity 3", Estimate_Add_OC_Add.txtbx_FinishedQty3());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Finished Quantity 4", Estimate_Add_OC_Add.txtbx_FinishedQty4());
		
		ProjectLibrary.ClickOnButton("All Tab", Estimate_Add_OC_Add.tab_All());
		
		String OtherCostName = Generic.getXlCellValue(xlpath, sheetName, rownum, cellnum);
		driver.findElement(By.xpath("//div[@id='div_nameid']/a[contains(text(),'"+OtherCostName+"')]")).click();
		Reporter.log("Clicked on "+OtherCostName,true);
		
		driver.switchTo().frame("html/body/form/div[1]/table/tbody/tr[2]/td[2]/iframe");
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Description", Estimate_Add_OC_Add.OtherCostRadwindow.TimeBased.txtbx_Description());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Per Hour Cost", Estimate_Add_OC_Add.OtherCostRadwindow.TimeBased.txtbx_PerHourCost());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Make Ready Time", Estimate_Add_OC_Add.OtherCostRadwindow.TimeBased.txtbx_PerHourCost());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Hours", Estimate_Add_OC_Add.OtherCostRadwindow.TimeBased.txtbx_PerHourCost());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Passes", Estimate_Add_OC_Add.OtherCostRadwindow.TimeBased.txtbx_PerHourCost());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Markup", Estimate_Add_OC_Add.OtherCostRadwindow.TimeBased.txtbx_PerHourCost());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, rownum, cellnum, "Selling Price $", Estimate_Add_OC_Add.OtherCostRadwindow.TimeBased.txtbx_PerHourCost());
		ProjectLibrary.ClickOnButton("Save", Estimate_Add_OC_Add.OtherCostRadwindow.TimeBased.btn_Save());
		driver.switchTo().defaultContent();
		ProjectLibrary.ClickOnButton("Finish", Estimate_Add_OC_Add.btn_Finish());
//------------------------------------------------------------------------------------------------------------------------------------------------------------------//
		Reporter.log("----------------------------------------------------------------------------------",true);
		String EstimateNumber = Estimate_Add_OC_Add.EstimateSummary.txt_EstimateNumber().getText();
		Reporter.log("Estimate Number = "+EstimateNumber,true);
		Reporter.log("----------------------------------------------------------------------------------",true);
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Item Title", Estimate_Add_OC_Add.EstimateSummary.txt_ItemTitle());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Quantity 1", Estimate_Add_OC_Add.EstimateSummary.txt_Qty1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Quantity 2", Estimate_Add_OC_Add.EstimateSummary.txt_Qty2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Quantity 3", Estimate_Add_OC_Add.EstimateSummary.txt_Qty3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Quantity 4", Estimate_Add_OC_Add.EstimateSummary.txt_Qty4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Price 1", Estimate_Add_OC_Add.EstimateSummary.txt_Price1(OtherCostName));
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Price 2", Estimate_Add_OC_Add.EstimateSummary.txt_Price2(OtherCostName));
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Price 3", Estimate_Add_OC_Add.EstimateSummary.txt_Price3(OtherCostName));
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Price 4", Estimate_Add_OC_Add.EstimateSummary.txt_Price4(OtherCostName));
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Cost Price (ex. Markup) 1", Estimate_Add_OC_Add.EstimateSummary.txt_CostPrice_Excl_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Cost Price (ex. Markup) 2", Estimate_Add_OC_Add.EstimateSummary.txt_CostPrice_Excl_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Cost Price (ex. Markup) 3", Estimate_Add_OC_Add.EstimateSummary.txt_CostPrice_Excl_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Cost Price (ex. Markup) 4", Estimate_Add_OC_Add.EstimateSummary.txt_CostPrice_Excl_Markup4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Markup 1", Estimate_Add_OC_Add.EstimateSummary.txt_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Markup 2", Estimate_Add_OC_Add.EstimateSummary.txt_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Markup 3", Estimate_Add_OC_Add.EstimateSummary.txt_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Markup 4", Estimate_Add_OC_Add.EstimateSummary.txt_Markup4());

		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Cost Price (Inc. Markup) 1", Estimate_Add_OC_Add.EstimateSummary.txt_CostPrice_Incl_Markup1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Cost Price (Inc. Markup) 2", Estimate_Add_OC_Add.EstimateSummary.txt_CostPrice_Incl_Markup2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Cost Price (Inc. Markup) 3", Estimate_Add_OC_Add.EstimateSummary.txt_CostPrice_Incl_Markup3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Cost Price (Inc. Markup) 4", Estimate_Add_OC_Add.EstimateSummary.txt_CostPrice_Incl_Markup4());

		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, rownum, cellnum, "Profit Margin (%) 1", Estimate_Add_OC_Add.EstimateSummary.txtbx_ProfitMarginPercentage1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, rownum, cellnum, "Profit Margin (%) 2", Estimate_Add_OC_Add.EstimateSummary.txtbx_ProfitMarginPercentage2());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, rownum, cellnum, "Profit Margin (%) 3", Estimate_Add_OC_Add.EstimateSummary.txtbx_ProfitMarginPercentage3());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, rownum, cellnum, "Profit Margin (%) 4", Estimate_Add_OC_Add.EstimateSummary.txtbx_ProfitMarginPercentage4());

		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, rownum, cellnum, "Profit Margin ($) 1", Estimate_Add_OC_Add.EstimateSummary.txtbx_ProfitMarginPrice1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, rownum, cellnum, "Profit Margin ($) 2", Estimate_Add_OC_Add.EstimateSummary.txtbx_ProfitMarginPrice1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, rownum, cellnum, "Profit Margin ($) 3", Estimate_Add_OC_Add.EstimateSummary.txtbx_ProfitMarginPrice1());
		ProjectLibrary.CompareStringTextBox(xlpath, sheetName, rownum, cellnum, "Profit Margin ($) 4", Estimate_Add_OC_Add.EstimateSummary.txtbx_ProfitMarginPrice1());
		
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, rownum, cellnum, "Tax", Estimate_Add_OC_Add.EstimateSummary.drpdn_Tax());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Tax Value 1", Estimate_Add_OC_Add.EstimateSummary.txt_TaxValue1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Tax Value 2", Estimate_Add_OC_Add.EstimateSummary.txt_TaxValue2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Tax Value 3", Estimate_Add_OC_Add.EstimateSummary.txt_TaxValue3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Tax Value 4", Estimate_Add_OC_Add.EstimateSummary.txt_TaxValue4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Selling Price (inc Tax) 1", Estimate_Add_OC_Add.EstimateSummary.txt_SellingPrice1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Selling Price (inc Tax) 2", Estimate_Add_OC_Add.EstimateSummary.txt_SellingPrice2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Selling Price (inc Tax) 3", Estimate_Add_OC_Add.EstimateSummary.txt_SellingPrice3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Selling Price (inc Tax) 4", Estimate_Add_OC_Add.EstimateSummary.txt_SellingPrice4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Gross Profit ($) 1", Estimate_Add_OC_Add.EstimateSummary.txt_GrossProfitPrice1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Gross Profit ($) 2", Estimate_Add_OC_Add.EstimateSummary.txt_GrossProfitPrice2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Gross Profit ($) 3", Estimate_Add_OC_Add.EstimateSummary.txt_GrossProfitPrice3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Gross Profit ($) 4", Estimate_Add_OC_Add.EstimateSummary.txt_GrossProfitPrice4());
		
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Gross Profit (%) 1", Estimate_Add_OC_Add.EstimateSummary.txt_GrossProfitPercentage1());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Gross Profit (%) 2", Estimate_Add_OC_Add.EstimateSummary.txt_GrossProfitPercentage2());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Gross Profit (%) 3", Estimate_Add_OC_Add.EstimateSummary.txt_GrossProfitPercentage3());
		ProjectLibrary.CompareStringText(xlpath, sheetName, rownum, cellnum, "Gross Profit (%) 4", Estimate_Add_OC_Add.EstimateSummary.txt_GrossProfitPercentage4());
		
//		ProjectLibrary.ClickOnButton("Save", Estimate_Add_OC_Add.EstimateSummary.btn_Save());
	}
}

