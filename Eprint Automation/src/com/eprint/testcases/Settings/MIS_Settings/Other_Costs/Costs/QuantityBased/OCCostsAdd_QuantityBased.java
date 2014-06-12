// Script for Other Cost Quantity Based
package com.eprint.testcases.Settings.MIS_Settings.Other_Costs.Costs.QuantityBased;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
import com.eprint.pageObjects.Settings.OtherCosts.Costs.OtherCost_AddPage;
import com.eprint.pageObjects.Settings.OtherCosts.Costs.OtherCost_ViewPage;

public class OCCostsAdd_QuantityBased extends SuperTestNG
{
	@Test 
	public void testOCCostsAdd_QuantityBased()
	{
		try
		{
			EprintSpecificLinks.login();
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Already Logged in Continuing with Testing Process",true);
		}
		String xlpath="./src/com/eprint/testData/Settings/EprintMIS/OtherCosts/Other Costs.xls";
		String sheetName = "Costs";
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectOtherCosts();
		EprintSpecificLinks.selectCosts();
		ProjectLibrary.ClickOnLinkByLinkText("Add New Record", "Add New Record");
		ProjectLibrary.StringDDTextBox(xlpath, sheetName,11,1, "Name", OtherCost_AddPage.txtbx_Name());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName,12,1, "Description", OtherCost_AddPage.txtbx_Description());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName,13,1, "Category ", OtherCost_AddPage.drpdn_Category());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName,14,1, "Calculation Used ", OtherCost_AddPage.drpdn_CalculationUsed());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName,15,1, "Supplier", OtherCost_AddPage.drpdn_Supplier());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName,16,1, " Per Hour Cost($)", OtherCost_AddPage.txtbx_PerHourCostPrice());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName,17,1, "Markup (%)", OtherCost_AddPage.txtbx_MarkupPercentage());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName,18,1, "Minimum Charge($)", OtherCost_AddPage.txtbx_MinimumChargePrice());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName,19,1, "Hourly Rate($) ", OtherCost_AddPage.QuantityBased.txtbx_HourlyRatePrice());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName,20,1, "Make Ready Time  ", OtherCost_AddPage.QuantityBased.txtbx_MakeReadyTime());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName,21,1, "Time Per Unit (Mins)",OtherCost_AddPage.QuantityBased.txtbx_TimePerUnitMins());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName,22,1, "Unit Cost($)", OtherCost_AddPage.QuantityBased.txtbx_UnitCost());
		String DefaultQtytoRecommend = Generic.getXlCellValue(xlpath, sheetName,23, 1);
		if (DefaultQtytoRecommend.equals("Fixed Value"))
		{
			OtherCost_AddPage.QuantityBased.rb_FixedValue().click();
			Reporter.log("Clicked on Fixed Value Radio Button",true);
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 24, 1, "Fixed Value", OtherCost_AddPage.QuantityBased.txtbx_FixedValue());
		}
		else if (DefaultQtytoRecommend.equals("Variable Value"))
		{
			OtherCost_AddPage.QuantityBased.rb_VariableValue().click();
			Reporter.log("Clicked on Variable Value Radio Button",true);
			ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 25, 1, "Variable Value", OtherCost_AddPage.QuantityBased.drpdn_VariableValue());
		}
		WebElement NameErrorMessage = driver.findElement(By.id("spn_alreadyExist"));
		if (NameErrorMessage.isDisplayed())
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 11, 2, "Name", OtherCost_AddPage.txtbx_Name());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 12, 1, "Description", OtherCost_AddPage.txtbx_Description());
			Generic.BlindWait(1);
		}
		ProjectLibrary.ClickOnButton("Save", OtherCost_AddPage.QuantityBased.btn_Save());
		EprintSpecificLinks.SuccessMsgVerify("Other Cost saved successfully", OtherCost_ViewPage.txt_SuccessMsg());
	}
}