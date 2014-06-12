// Script for Other Cost Time Based 
package com.eprint.testcases.Settings.MIS_Settings.Other_Costs.Costs.TimeBased;
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

public class OCCostsAdd_TimeBased extends SuperTestNG
{
	@Test 
	public void testOCCostsAdd_TimeBased()
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
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 28, 1, "Name", OtherCost_AddPage.txtbx_Name());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 1, "Description", OtherCost_AddPage.txtbx_Description());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 30, 1, "Category ", OtherCost_AddPage.drpdn_Category());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 31, 1, "Calculation Used ", OtherCost_AddPage.drpdn_CalculationUsed());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 32, 1, "Supplier", OtherCost_AddPage.drpdn_Supplier());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName,33, 1, " Per Hour Cost($)", OtherCost_AddPage.txtbx_PerHourCostPrice());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName,34, 1, "Markup (%)", OtherCost_AddPage.txtbx_MarkupPercentage());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName,35, 1, "Minimum Charge($)", OtherCost_AddPage.txtbx_MinimumChargePrice());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName,36, 1, "Hourly Rate($)", OtherCost_AddPage.TimeBased.txtbx_HourlyRate());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName,37, 1, "Make Ready Time",OtherCost_AddPage.TimeBased.txtbx_MakeReadyTime());
		String TimeBasedType = Generic.getXlCellValue(xlpath, sheetName, 39, 1);
		if (TimeBasedType.equals("Machine & Labour"))
		{
			OtherCost_AddPage.TimeBased.rb_MachineAndLabour().click();
			Reporter.log("Clicking on Machine and Labour",true);
			ProjectLibrary.StringDDTextBox(xlpath, sheetName,38, 1, " Hourly Run Speed ", OtherCost_AddPage.TimeBased.txtbx_HourlyRunSpeed());
			String DefaultQtytoRecommend = Generic.getXlCellValue(xlpath, sheetName, 40, 1);
			if (DefaultQtytoRecommend.equals("Fixed Hours"))
			{
				OtherCost_AddPage.TimeBased.rb_FixedHours().click();
				Reporter.log("Clicking on Fixed Hours",true);
				ProjectLibrary.StringDDTextBox(xlpath, sheetName, 41,1, "Fixed Hours", OtherCost_AddPage.TimeBased.txtbx_FixedHours());
			}
			else if (DefaultQtytoRecommend.equals("Hrs Calculated based on Qty and run Speed"))
			{
				OtherCost_AddPage.TimeBased.rb_HrsCalcBasedOnQtyandRunSpeed().click();
				Reporter.log("Clicking on Hrs Calculated based on Qty and run Speed",true);
				ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 42, 1, "Hrs Calculated based on Qty and run Speed", OtherCost_AddPage.TimeBased.txtbx_HrsCalcBasedOnQtyandRunSpeed());
			}
		}
		else if (TimeBasedType.equals("Labour Only"))
		{
			OtherCost_AddPage.TimeBased.rb_LabourOnly().click();
			Reporter.log("Clicking on Labour Only",true);
			OtherCost_AddPage.TimeBased.rb_FixedHours().click();
			Reporter.log("Clicking on Fixed Hours",true);
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 41,1, "Fixed Hours", OtherCost_AddPage.TimeBased.txtbx_FixedHours());
		}
		WebElement NameErrorMessage = driver.findElement(By.id("spn_alreadyExist"));
		if (NameErrorMessage.isDisplayed())
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 28, 2, "Name", OtherCost_AddPage.txtbx_Name());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 29, 1, "Description", OtherCost_AddPage.txtbx_Description());
			Generic.BlindWait(1);
		}
		ProjectLibrary.ClickOnButton("Save", OtherCost_AddPage.TimeBased.btn_Save());
		EprintSpecificLinks.SuccessMsgVerify("Other Cost saved successfully", OtherCost_ViewPage.txt_SuccessMsg());
	}
}