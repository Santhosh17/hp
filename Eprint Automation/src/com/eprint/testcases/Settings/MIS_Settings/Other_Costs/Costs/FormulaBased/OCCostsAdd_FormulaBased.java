// Script for Other Cost Add Formula Based 
package com.eprint.testcases.Settings.MIS_Settings.Other_Costs.Costs.FormulaBased;
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

public class OCCostsAdd_FormulaBased extends SuperTestNG
{
	@Test
	public void testOCCostsAdd_FormulaBased()
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
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 2, 1, "Name", OtherCost_AddPage.txtbx_Name());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 3, 1, "Description",  OtherCost_AddPage.txtbx_Description());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 4, 1, "Category ",OtherCost_AddPage.drpdn_Category());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 5, 1, "Calculation Used", OtherCost_AddPage.drpdn_CalculationUsed());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath, sheetName, 6, 1, "Supplier", OtherCost_AddPage.drpdn_Supplier());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 7, 1, "Markup (%)",OtherCost_AddPage.txtbx_MarkupPercentage());
		ProjectLibrary.StringDDTextBox(xlpath, sheetName, 8, 1, "Minimum Charge($)", OtherCost_AddPage.txtbx_MinimumChargePrice());
		ProjectLibrary.ClickOnButton("Reset", OtherCost_AddPage.FormulaBased.btn_Reset());
		Generic.BlindWait(1);
		ProjectLibrary.ClickOnButton("(",OtherCost_AddPage.FormulaBased.btn_LeftParentheses());
		ProjectLibrary.ClickOnButton("(", OtherCost_AddPage.FormulaBased.btn_LeftParentheses());
		ProjectLibrary.ClickOnButton("Booklet Variables", OtherCost_AddPage.FormulaBased.lnk_BookletVariables());
		ProjectLibrary.ClickOnButton("Booklet quantity required", OtherCost_AddPage.FormulaBased.BookletVariables.lnk_BookletQtyReqd_Section1());
		ProjectLibrary.ClickOnButton("+",OtherCost_AddPage.FormulaBased.btn_Plus());
		ProjectLibrary.ClickOnButton("Number Of sections", OtherCost_AddPage.FormulaBased.BookletVariables.lnk_NumberOfSections());
		ProjectLibrary.ClickOnButton(")", OtherCost_AddPage.FormulaBased.btn_RightParentheses());
		ProjectLibrary.ClickOnButton("-", OtherCost_AddPage.FormulaBased.btn_Minus());
		ProjectLibrary.ClickOnButton("(", OtherCost_AddPage.FormulaBased.btn_LeftParentheses());
		ProjectLibrary.ClickOnButton("Total number of pages", OtherCost_AddPage.FormulaBased.BookletVariables.lnk_TotalNumberOfPages_AllSections());
		ProjectLibrary.ClickOnButton("*", OtherCost_AddPage.FormulaBased.btn_Multiply());
		ProjectLibrary.ClickOnButton("Print sheet quantity all sections (excluding spoilage)",OtherCost_AddPage.FormulaBased.BookletVariables.lnk_PrintSheetQtyAllSections_ExcludingSpoilage());
		ProjectLibrary.ClickOnButton(")", OtherCost_AddPage.FormulaBased.btn_RightParentheses());
		ProjectLibrary.ClickOnButton("/", OtherCost_AddPage.FormulaBased.btn_Divide());
		ProjectLibrary.ClickOnButton("(", OtherCost_AddPage.FormulaBased.btn_LeftParentheses());
		ProjectLibrary.ClickOnButton("Print sheet quantity all sections (including spoilage)", OtherCost_AddPage.FormulaBased.BookletVariables.lnk_PrintSheetQtyAllSections_IncludingSpoilage());
		ProjectLibrary.ClickOnButton("%", OtherCost_AddPage.FormulaBased.btn_Percentage());
		ProjectLibrary.ClickOnButton("Number of sections", OtherCost_AddPage.FormulaBased.BookletVariables.lnk_NumberOfSections());
		ProjectLibrary.ClickOnButton(")", OtherCost_AddPage.FormulaBased.btn_RightParentheses());
		ProjectLibrary.ClickOnButton(")", OtherCost_AddPage.FormulaBased.btn_RightParentheses());
		WebElement NameErrorMessage = driver.findElement(By.id("spn_alreadyExist"));
		if (NameErrorMessage.isDisplayed())
		{
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 2, 2, "Name", OtherCost_AddPage.txtbx_Name());
			ProjectLibrary.StringDDTextBox(xlpath, sheetName, 3, 1, "Description", OtherCost_AddPage.txtbx_Description());
			Generic.BlindWait(1);
		}
		ProjectLibrary.ClickOnButton("Save", OtherCost_AddPage.FormulaBased.btn_Save());
		EprintSpecificLinks.SuccessMsgVerify("Other Cost saved successfully", OtherCost_ViewPage.txt_SuccessMsg());
	}
}