package com.eprint.testcases.Settings.MIS_Settings.Other_Costs.Costs.FormulaBasedWithMatrixTable;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;

public class OCCostsDelete_FormulaBasedMatrix extends SuperTestNG
{
	@Test 
	public void testOCCostsDelete_FormulaBasedMatrix()
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
			ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 45, 1);
		}
		catch (NoSuchElementException ex)
		{
			ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 45, 14);
		}
		catch(java.util.NoSuchElementException e)
		{			
			ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 45, 2);
		}
		catch (RuntimeException e)
		{
			ProjectLibrary.SelectPreviousRecord(xlpath, sheetName, 45, 15);
		}
		ProjectLibrary.ClickOnButtonByID("Close Button in Popup", "ctl00_ContentPlaceHolder1_ImageButton1");
		ProjectLibrary.ClickOnButtonByID("Delete", "ctl00_ContentPlaceHolder1_btnDelete");
		ProjectLibrary.SwitchToAlertPopup();
		EprintSpecificLinks.SuccessMsgVerification("Other Cost deleted successfully", "ctl00_ContentPlaceHolder1_ctl01_lblMessage");
	}
}
