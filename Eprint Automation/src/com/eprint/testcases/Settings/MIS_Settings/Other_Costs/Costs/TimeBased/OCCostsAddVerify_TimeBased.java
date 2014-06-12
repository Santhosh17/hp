package com.eprint.testcases.Settings.MIS_Settings.Other_Costs.Costs.TimeBased;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.Generic;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
public class OCCostsAddVerify_TimeBased extends SuperTestNG
{
	@Test 
	public void testOCCostsAddVerify_TimeBased()
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
		ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 28, 1);
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 28, 1, "Name", "ctl00_ContentPlaceHolder1_txtName");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 29, 1, "Description", "ctl00_ContentPlaceHolder1_txtDescription");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 30, 1, "Category ", "ctl00_ContentPlaceHolder1_ddlCategory");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 31, 1, "Calculation Used ", "ctl00_ContentPlaceHolder1_ddlCalculation");
		ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 32, 1, "Supplier", "ctl00_ContentPlaceHolder1_ddlSupplier");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 33, 1, "Per Hour Cost($)", "ctl00_ContentPlaceHolder1_txtPerHourCost");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 34, 1, "Markup (%)", "ctl00_ContentPlaceHolder1_txtProfit");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName,35, 1, "Minimum Charge($)", "ctl00_ContentPlaceHolder1_txtMinimum");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName,36, 1, "Hourly Rate($)", "ctl00_ContentPlaceHolder1_txtHourlyRate");
		ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName,37, 1, "Make Ready Time", "ctl00_ContentPlaceHolder1_txtMakeReadyTime");
		String TimeBasedType = Generic.getXlCellValue(xlpath, sheetName, 39, 1);
		if (TimeBasedType.equals("Machine & Labour"))
		{
			WebElement RadioButton = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdlTimeCostType_0"));
			if (RadioButton.isSelected())
			{
				Reporter.log(TimeBasedType+" Radio Button Selection -- PASS",true);
				ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName,38, 1, "Hourly Run Speed ", "ctl00_ContentPlaceHolder1_txtRunSpeed");
				String DefaultValuestoRecommend = Generic.getXlCellValue(xlpath, sheetName, 40, 1);
				if (DefaultValuestoRecommend.equals("Fixed Hours"))
				{
					WebElement RadioButton2 = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdldefaultQty_0"));
					if (RadioButton2.isSelected())
					{
						Reporter.log(DefaultValuestoRecommend+" Radio Button Selection -- PASS",true);
						ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 41, 1, "Fixed Hours", "ctl00_ContentPlaceHolder1_txtFixedQty");
					}
					else
					{
						Assert.fail(DefaultValuestoRecommend+" Radio Button Not Selected");
					}
				}
				else if (DefaultValuestoRecommend.equals("Hrs Calculated based on Qty and run Speed"))
				{
					WebElement RadioButton2 = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdldefaultQty_1"));
					if (RadioButton2.isSelected())
					{
						Reporter.log(DefaultValuestoRecommend+" Radio Button Selection -- PASS",true);
						ProjectLibrary.CompareStringDropDownTextByID(xlpath, sheetName, 42, 1, "Hrs Calculated based on Qty and run Speed", "ctl00_ContentPlaceHolder1_ddlVariableQty");
					}
					else
					{
						Assert.fail(DefaultValuestoRecommend+" Radio Button Not Selected");
					}
				}
			}
			else
			{
				Assert.fail(TimeBasedType+" Radio Button Not Selected");
			}
		}
		
		else if (TimeBasedType.equals("Labour Only"))
		{
			WebElement RadioButton = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdlTimeCostType_1"));
			if (RadioButton.isSelected())
			{
				Reporter.log(TimeBasedType+" Radio Button Selection -- PASS",true);
				String DefaultValuestoRecommend = Generic.getXlCellValue(xlpath, sheetName, 40, 1);
				if (DefaultValuestoRecommend.equals("Fixed Hours"))
				{
					WebElement RadioButton2 = driver.findElement(By.id("ctl00_ContentPlaceHolder1_rdldefaultQty_0"));
					if (RadioButton2.isSelected())
					{
						Reporter.log(DefaultValuestoRecommend+" Radio Button Selection -- PASS",true);
						ProjectLibrary.CompareStringTextBoxByID(xlpath, sheetName, 41, 1, "Fixed Hours", "ctl00_ContentPlaceHolder1_txtFixedQty");
					}
					else
					{
						Assert.fail(DefaultValuestoRecommend+" Radio Button Not Selected");
					}
				}
				else if (DefaultValuestoRecommend.equals("Hrs Calculated based on Qty and run Speed"))
				{
					Assert.fail(DefaultValuestoRecommend+" is not a valid selection Please Change Value in Excel Sheet");
					
				}
			}
			else
			{
				Assert.fail(TimeBasedType+" Radio Button Not Selected");
			}
		}
	}		
}
