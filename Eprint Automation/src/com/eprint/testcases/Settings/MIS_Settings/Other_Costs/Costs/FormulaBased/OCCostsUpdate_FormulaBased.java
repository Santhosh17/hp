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

public class OCCostsUpdate_FormulaBased extends SuperTestNG
{
	@Test 
	public void testOCCostsUpdate_FormulaBased()
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
		try
		{
			ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 2, 1);
		}
		catch (NoSuchElementException ex)
		{
			ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 2, 2);
		}
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 2, 14, "Name", "ctl00_ContentPlaceHolder1_txtName");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 3, 14, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 4, 14, "Category ", "ctl00_ContentPlaceHolder1_ddlCategory");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 5, 14, "Calculation Used", "ctl00_ContentPlaceHolder1_ddlCalculation");
		ProjectLibrary.SingleSelectDropDownbyVisibleTextbyID(xlpath, sheetName, 6, 14, "Supplier", "ctl00_ContentPlaceHolder1_ddlSupplier");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 7, 14, "Markup (%)", "ctl00_ContentPlaceHolder1_txtProfit");
		ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 8, 14, "Minimum Charge($)", "ctl00_ContentPlaceHolder1_txtMinimum");
		ProjectLibrary.ClickOnButtonByXpath("Reset", "//div[3]/div[3]/div/input[10]");
		Generic.BlindWait(1);
		ProjectLibrary.ClickOnButtonByXpath("(", "//div[3]/div[3]/div/input[1]");
		ProjectLibrary.ClickOnButtonByXpath("(", "//div[3]/div[3]/div/input[1]");
		ProjectLibrary.ClickOnButtonByXpath("Booklet Variables", ".//*[@id='divclose_0']/table/tbody/tr/td[2]/b");
		ProjectLibrary.ClickOnButtonByXpath("Booklet quantity required", "//table[2]/tbody/tr/td/div/table/tbody/tr/td[3]");
		ProjectLibrary.ClickOnButtonByXpath("+", "//div[3]/div/input[3]");
		ProjectLibrary.ClickOnButtonByXpath("Number Of sections", "//table[3]/tbody/tr/td/div/table/tbody/tr/td[3]");
		ProjectLibrary.ClickOnButtonByXpath(")", "//div[3]/div/input[2]");
		ProjectLibrary.ClickOnButtonByXpath("-", "//div[3]/div/input[4]");
		ProjectLibrary.ClickOnButtonByXpath("(", "//div[3]/div[3]/div/input[1]");
		ProjectLibrary.ClickOnButtonByXpath("Total number of pages", "//table[4]/tbody/tr/td/div/table/tbody/tr/td[3]");
		ProjectLibrary.ClickOnButtonByXpath("*", "//div[3]/div/input[5]");
		ProjectLibrary.ClickOnButtonByXpath("Print sheet quantity all sections (excluding spoilage)", "//table[5]/tbody/tr/td/div/table/tbody/tr/td[3]");
		ProjectLibrary.ClickOnButtonByXpath(")", "//div[3]/div/input[2]");
		ProjectLibrary.ClickOnButtonByXpath("/", "//div[3]/div/input[6]");
		ProjectLibrary.ClickOnButtonByXpath("(", "//div[3]/div[3]/div/input[1]");
		ProjectLibrary.ClickOnButtonByXpath("Print sheet quantity all sections (including spoilage)", "//table[6]/tbody/tr/td/div/table/tbody/tr/td[3]");
		ProjectLibrary.ClickOnButtonByXpath("%", "//div[3]/div[3]/div/input[7]");
		ProjectLibrary.ClickOnButtonByXpath("Number of sections", "//table[3]/tbody/tr/td/div/table/tbody/tr/td[3]");
		ProjectLibrary.ClickOnButtonByXpath(")", "//div[3]/div/input[2]");
		ProjectLibrary.ClickOnButtonByXpath(")", "//div[3]/div/input[2]");
		WebElement NameErrorMessage = driver.findElement(By.id("spn_alreadyExist"));
		if (NameErrorMessage.isDisplayed())
		{
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 2, 15, "Name", "ctl00_ContentPlaceHolder1_txtName");
			ProjectLibrary.StringDDTextBoxID(xlpath, sheetName, 3, 14, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
			Generic.BlindWait(1);
		}
		ProjectLibrary.ClickOnButtonByID("Save", "ctl00_ContentPlaceHolder1_btnSave");
		EprintSpecificLinks.SuccessMsgVerification("Other Cost updated successfully", "ctl00_ContentPlaceHolder1_ctl01_lblMessage");
		}
}