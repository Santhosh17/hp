package com.eprint.testcases.Settings.MIS_Settings.Other_Costs.Category;

import org.openqa.selenium.NoSuchElementException;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.eprint.libraries.EprintSpecificLinks;
import com.eprint.libraries.ProjectLibrary;
import com.eprint.libraries.SuperTestNG;
import com.eprint.pageObjects.Settings.OtherCosts.Category.OtherCostCategoryViewPage;

public class OCCategoryAdd extends SuperTestNG
{
	@Test(groups ={ "Other Cost", "Category", "Category Add" })
	public void testOCCategoryAdd()
	{
		try
		{
			EprintSpecificLinks.login();
		}
		catch (NoSuchElementException e)
		{
			Reporter.log("Already Logged in Continuing with Testing Process",true);

		}
		String xlpath = "./src/com/eprint/testData/Settings/EprintMIS/OtherCosts/Other Costs.xls";
		String sheetName = "Category";
		EprintSpecificLinks.clicksettings();
		EprintSpecificLinks.selectEprintMIS();
		EprintSpecificLinks.selectOtherCosts();
		EprintSpecificLinks.selectCategory();
		ProjectLibrary.ClickOnLinkByLinkText("Add New Record", "Add New Record");
		ProjectLibrary.StringDDTextBox(xlpath,sheetName,1,1,"Name",OtherCostCategoryViewPage.AddNewRecord.txtbx_Name());
		ProjectLibrary.SingleSelectDropDownbyVisibleText(xlpath,sheetName,2,1,"Job Card Catagory",OtherCostCategoryViewPage.AddNewRecord.drpdn_JobCardCategory());
		ProjectLibrary.ClickOnButton("Save",OtherCostCategoryViewPage.AddNewRecord.btn_Save());
		EprintSpecificLinks.SuccessMsgVerify("Other Cost Category Inserted successfully", OtherCostCategoryViewPage.txt_OCValidation());
	}
}