package com.eprint.pageObjects.Estimates.OtherCosts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.eprint.libraries.SuperTestNG;

public class Estimate_Add_OC_Add extends SuperTestNG
{
	public static WebElement txtbx_ItemTitle()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCOtherCosts_txt_ItemTitle"));
		return element;
	}
	public static WebElement txtbx_FinishedQty1()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCOtherCosts_txtQuantity1"));
		return element;
	}
	public static WebElement txtbx_FinishedQty2()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCOtherCosts_txtQuantity2"));
		return element;
	}
	public static WebElement txtbx_FinishedQty3()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCOtherCosts_txtQuantity3"));
		return element;
	}
	public static WebElement txtbx_FinishedQty4()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCOtherCosts_txtQuantity4"));
		return element;
	}
	public static WebElement tab_BusCard()
	{
		WebElement element = driver.findElement(By.xpath("//div/b/span[text()='Bus Card']"));
		return element;
	}
	public static WebElement tab_All()
	{
		WebElement element = driver.findElement(By.xpath("//div/b/span[text()='All']"));
		return element;
	}
	public static WebElement lnk_ClickOnRecord(String OtherCostRecordName)
	{
		WebElement element = driver.findElement(By.xpath("//div[1]/a[contains(text(),'"+OtherCostRecordName+"')]"));
		return element;
	}
	public static WebElement btn_Previous()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btncostcentrePrevious"));
		return element;
	}
	public static WebElement btn_Finish()
	{
		WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_btncostcentre"));
		return element;
	}
	public static class OtherCostRadwindow
	{
		public static class FormulaBased 
		{
			public static WebElement txtbx_Description()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtDescription"));
				return element;
			}
			public static WebElement txtbx_CostFormula()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFormula"));
				return element;
			}
			public static WebElement txtbx_QtyWithActuals1()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtWithActuals"));
				return element;
			}
			public static WebElement txtbx_QtyWithActuals2()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtWithActuals1"));
				return element;
			}
			public static WebElement txtbx_QtyWithActuals3()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtWithActuals2"));
				return element;
			}
			public static WebElement txtbx_QtyWithActuals4()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtWithActuals3"));
				return element;
			}	
			public static WebElement txtbx_Cost1()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFormulaCost"));
				return element;
			}
			public static WebElement txtbx_Cost2()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFormulaCost1"));
				return element;
			}
			public static WebElement txtbx_Cost3()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFormulaCost2"));
				return element;
			}
			public static WebElement txtbx_Cost4()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFormulaCost3"));
				return element;
			}
			public static WebElement txtbx_Markup1()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFormulaProfit"));
				return element;
			}
			public static WebElement txtbx_Markup2()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFormulaProfit1"));
				return element;
			}
			public static WebElement txtbx_Markup3()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFormulaProfit2"));
				return element;
			}
			public static WebElement txtbx_Markup4()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFormulaProfit3"));
				return element;
			}
			public static WebElement txtbx_SellingPrice1()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFormulaSellingPrice"));
				return element;
			}
			public static WebElement txtbx_SellingPrice2()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFormulaSellingPrice1"));
				return element;
			}
			public static WebElement txtbx_SellingPrice3()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFormulaSellingPrice2"));
				return element;
			}
			public static WebElement txtbx_SellingPrice4()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFormulaSellingPrice3"));
				return element;
			}
			public static WebElement btn_Save()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_btnSave"));
				return element;
			}
		}
		public static class FormulaBasedMatrix extends FormulaBased
		{
			public static WebElement btn_MatrixClose()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_ImageButton2"));
				return element;
			}
			public static WebElement txtbx_Prompt()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtprompt"));
				return element;
			}
			public static WebElement txtbx_Column1()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtCol1"));
				return element;
			}
			public static WebElement txtbx_Column2()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtCol2"));
				return element;
			}
			public static WebElement txtbx_Column3()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtCol3"));
				return element;
			}
			public static WebElement txtbx_Column4()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtCol4"));
				return element;
			}
			public static WebElement txtbx_Column5()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtCol5"));
				return element;
			}
			public static WebElement txtbx_Column6()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtCol6"));
				return element;
			}
			public static WebElement txtbx_Column7()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtCol7"));
				return element;
			}
			public static WebElement txtbx_Column8()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtCol8"));
				return element;
			}
			public static WebElement txtbx_Column9()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtCol9"));
				return element;
			}
			public static WebElement txtbx_Column10()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtCol10"));
				return element;
			}
			public static WebElement txtbx_Qtyfrm1()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFrm1"));
				return element;
			}
			public static WebElement txtbx_Qtyfrm2()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFrm2"));
				return element;
			}
			public static WebElement txtbx_Qtyfrm3()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFrm3"));
				return element;
			}
			public static WebElement txtbx_Qtyfrm4()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFrm4"));
				return element;
			}
			public static WebElement txtbx_Qtyfrm5()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFrm5"));
				return element;
			}
			public static WebElement txtbx_Qtyfrm6()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFrm6"));
				return element;
			}
			public static WebElement txtbx_Qtyfrm7()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFrm7"));
				return element;
			}
			public static WebElement txtbx_Qtyfrm8()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFrm8"));
				return element;
			}
			public static WebElement txtbx_Qtyfrm9()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFrm9"));
				return element;
			}
			public static WebElement txtbx_Qtyfrm10()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFrm10"));
				return element;
			}
			public static WebElement txtbx_Qtyfrm11()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFrm11"));
				return element;
			}
			public static WebElement txtbx_Qtyfrm12()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFrm12"));
				return element;
			}
			public static WebElement txtbx_Qtyfrm13()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFrm13"));
				return element;
			}
			public static WebElement txtbx_Qtyfrm14()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFrm14"));
				return element;
			}
			public static WebElement txtbx_Qtyfrm15()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFrm15"));
				return element;
			}
			public static WebElement txtbx_Qtyfrm16()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFrm16"));
				return element;
			}
			public static WebElement txtbx_Qtyfrm17()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFrm17"));
				return element;
			}
			public static WebElement txtbx_Qtyfrm18()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFrm18"));
				return element;
			}
			public static WebElement txtbx_Qtyfrm19()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFrm19"));
				return element;
			}
			public static WebElement txtbx_Qtyfrm20()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtFrm20"));
				return element;
			}
			public static WebElement txtbx_Qtyto1()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtTo1"));
				return element;
			}
			public static WebElement txtbx_Qtyto2()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtTo2"));
				return element;
			}
			public static WebElement txtbx_Qtyto3()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtTo3"));
				return element;
			}
			public static WebElement txtbx_Qtyto4()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtTo4"));
				return element;
			}
			public static WebElement txtbx_Qtyto5()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtTo5"));
				return element;
			}
			public static WebElement txtbx_Qtyto6()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtTo6"));
				return element;
			}
			public static WebElement txtbx_Qtyto7()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtTo7"));
				return element;
			}
			public static WebElement txtbx_Qtyto8()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtTo8"));
				return element;
			}
			public static WebElement txtbx_Qtyto9()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtTo9"));
				return element;
			}
			public static WebElement txtbx_Qtyto10()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtTo10"));
				return element;
			}
			public static WebElement txtbx_Qtyto11()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtTo11"));
				return element;
			}
			public static WebElement txtbx_Qtyto12()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtTo12"));
				return element;
			}
			public static WebElement txtbx_Qtyto13()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtTo13"));
				return element;
			}
			public static WebElement txtbx_Qtyto14()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtTo14"));
				return element;
			}
			public static WebElement txtbx_Qtyto15()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtTo15"));
				return element;
			}
			public static WebElement txtbx_Qtyto16()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtTo16"));
				return element;
			}
			public static WebElement txtbx_Qtyto17()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtTo17"));
				return element;
			}
			public static WebElement txtbx_Qtyto18()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtTo18"));
				return element;
			}
			public static WebElement txtbx_Qtyto19()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtTo19"));
				return element;
			}
			public static WebElement txtbx_MatrixValue1_1() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA51"));
				return element;
			}
			public static WebElement txtbx_MatrixValue2_1() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA52"));
				return element;
			}
			public static WebElement txtbx_MatrixValue3_1() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA53"));
				return element;
			}
			public static WebElement txtbx_MatrixValue4_1() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA54"));
				return element;
			}
			public static WebElement txtbx_MatrixValue5_1() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA55"));
				return element;
			}
			public static WebElement txtbx_MatrixValue6_1() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA56"));
				return element;
			}
			public static WebElement txtbx_MatrixValue7_1() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA57"));
				return element;
			}
			public static WebElement txtbx_MatrixValue8_1() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA58"));
				return element;
			}
			public static WebElement txtbx_MatrixValue9_1() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA59"));
				return element;
			}
			public static WebElement txtbx_MatrixValue10_1() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA510"));
				return element;
			}
			public static WebElement txtbx_MatrixValue11_1() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA511"));
				return element;
			}
			public static WebElement txtbx_MatrixValue12_1() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA512"));
				return element;
			}
			public static WebElement txtbx_MatrixValue13_1() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA513"));
				return element;
			}
			public static WebElement txtbx_MatrixValue14_1() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA514"));
				return element;
			}
			public static WebElement txtbx_MatrixValue15_1() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA515"));
				return element;
			}
			public static WebElement txtbx_MatrixValue16_1() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA516"));
				return element;
			}
			public static WebElement txtbx_MatrixValue17_1() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA517"));
				return element;
			}
			public static WebElement txtbx_MatrixValue18_1() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA518"));
				return element;
			}
			public static WebElement txtbx_MatrixValue19_1() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA519"));
				return element;
			}
			public static WebElement txtbx_MatrixValue20_1() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA520"));
				return element;
			}
			public static WebElement txtbx_MatrixValue1_2() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA41"));
				return element;
			}
			public static WebElement txtbx_MatrixValue2_2() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA42"));
				return element;
			}
			public static WebElement txtbx_MatrixValue3_2() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA43"));
				return element;
			}
			public static WebElement txtbx_MatrixValue4_2() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA44"));
				return element;
			}
			public static WebElement txtbx_MatrixValue5_2() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA45"));
				return element;
			}
			public static WebElement txtbx_MatrixValue6_2() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA46"));
				return element;
			}
			public static WebElement txtbx_MatrixValue7_2() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA47"));
				return element;
			}
			public static WebElement txtbx_MatrixValue8_2() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA48"));
				return element;
			}
			public static WebElement txtbx_MatrixValue9_2() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA49"));
				return element;
			}
			public static WebElement txtbx_MatrixValue10_2() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA410"));
				return element;
			}
			public static WebElement txtbx_MatrixValue11_2() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA411"));
				return element;
			}
			public static WebElement txtbx_MatrixValue12_2() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA412"));
				return element;
			}
			public static WebElement txtbx_MatrixValue13_2() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA413"));
				return element;
			}
			public static WebElement txtbx_MatrixValue14_2() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA414"));
				return element;
			}
			public static WebElement txtbx_MatrixValue15_2() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA415"));
				return element;
			}
			public static WebElement txtbx_MatrixValue16_2() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA416"));
				return element;
			}
			public static WebElement txtbx_MatrixValue17_2() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA417"));
				return element;
			}
			public static WebElement txtbx_MatrixValue18_2() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA418"));
				return element;
			}
			public static WebElement txtbx_MatrixValue19_2() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA419"));
				return element;
			}
			public static WebElement txtbx_MatrixValue20_2() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA420"));
				return element;
			}
			public static WebElement txtbx_MatrixValue1_3() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA31"));
				return element;
			}
			public static WebElement txtbx_MatrixValue2_3() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA32"));
				return element;
			}
			public static WebElement txtbx_MatrixValue3_3() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA33"));
				return element;
			}
			public static WebElement txtbx_MatrixValue4_3() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA34"));
				return element;
			}
			public static WebElement txtbx_MatrixValue5_3() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA35"));
				return element;
			}
			public static WebElement txtbx_MatrixValue6_3() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA36"));
				return element;
			}
			public static WebElement txtbx_MatrixValue7_3() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA37"));
				return element;
			}
			public static WebElement txtbx_MatrixValue8_3() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA38"));
				return element;
			}
			public static WebElement txtbx_MatrixValue9_3() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA39"));
				return element;
			}
			public static WebElement txtbx_MatrixValue10_3() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA310"));
				return element;
			}
			public static WebElement txtbx_MatrixValue11_3() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA311"));
				return element;
			}
			public static WebElement txtbx_MatrixValue12_3() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA312"));
				return element;
			}
			public static WebElement txtbx_MatrixValue13_3() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA313"));
				return element;
			}
			public static WebElement txtbx_MatrixValue14_3() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA314"));
				return element;
			}
			public static WebElement txtbx_MatrixValue15_3() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA315"));
				return element;
			}
			public static WebElement txtbx_MatrixValue16_3() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA316"));
				return element;
			}
			public static WebElement txtbx_MatrixValue17_3() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA317"));
				return element;
			}
			public static WebElement txtbx_MatrixValue18_3() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA318"));
				return element;
			}
			public static WebElement txtbx_MatrixValue19_3() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA319"));
				return element;
			}
			public static WebElement txtbx_MatrixValue20_3() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA320"));
				return element;
			}
			public static WebElement txtbx_MatrixValue1_4() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA21"));
				return element;
			}
			public static WebElement txtbx_MatrixValue2_4() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA22"));
				return element;
			}
			public static WebElement txtbx_MatrixValue3_4() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA23"));
				return element;
			}
			public static WebElement txtbx_MatrixValue4_4() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA24"));
				return element;
			}
			public static WebElement txtbx_MatrixValue5_4() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA25"));
				return element;
			}
			public static WebElement txtbx_MatrixValue6_4() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA26"));
				return element;
			}
			public static WebElement txtbx_MatrixValue7_4() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA27"));
				return element;
			}
			public static WebElement txtbx_MatrixValue8_4() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA28"));
				return element;
			}
			public static WebElement txtbx_MatrixValue9_4() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA29"));
				return element;
			}
			public static WebElement txtbx_MatrixValue10_4() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA210"));
				return element;
			}
			public static WebElement txtbx_MatrixValue11_4() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA211"));
				return element;
			}
			public static WebElement txtbx_MatrixValue12_4() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA212"));
				return element;
			}
			public static WebElement txtbx_MatrixValue13_4() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA213"));
				return element;
			}
			public static WebElement txtbx_MatrixValue14_4() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA214"));
				return element;
			}
			public static WebElement txtbx_MatrixValue15_4() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA215"));
				return element;
			}
			public static WebElement txtbx_MatrixValue16_4() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA216"));
				return element;
			}
			public static WebElement txtbx_MatrixValue17_4() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA217"));
				return element;
			}
			public static WebElement txtbx_MatrixValue18_4() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA218"));
				return element;
			}
			public static WebElement txtbx_MatrixValue19_4() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA219"));
				return element;
			}
			public static WebElement txtbx_MatrixValue20_4() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_txtA220"));
				return element;
			}
			public static WebElement txtbx_MatrixValue1_5() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA61"));
				return element;
			}
			public static WebElement txtbx_MatrixValue2_5() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA62"));
				return element;
			}
			public static WebElement txtbx_MatrixValue3_5() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA63"));
				return element;
			}
			public static WebElement txtbx_MatrixValue4_5() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA64"));
				return element;
			}
			public static WebElement txtbx_MatrixValue5_5() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA65"));
				return element;
			}
			public static WebElement txtbx_MatrixValue6_5() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA66"));
				return element;
			}
			public static WebElement txtbx_MatrixValue7_5() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA67"));
				return element;
			}
			public static WebElement txtbx_MatrixValue8_5() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA68"));
				return element;
			}
			public static WebElement txtbx_MatrixValue9_5() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA69"));
				return element;
			}
			public static WebElement txtbx_MatrixValue10_5() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA610"));
				return element;
			}
			public static WebElement txtbx_MatrixValue11_5() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA611"));
				return element;
			}
			public static WebElement txtbx_MatrixValue12_5() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA612"));
				return element;
			}
			public static WebElement txtbx_MatrixValue13_5() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA613"));
				return element;
			}
			public static WebElement txtbx_MatrixValue14_5() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA614"));
				return element;
			}
			public static WebElement txtbx_MatrixValue15_5() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA615"));
				return element;
			}
			public static WebElement txtbx_MatrixValue16_5() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA616"));
				return element;
			}
			public static WebElement txtbx_MatrixValue17_5() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA617"));
				return element;
			}
			public static WebElement txtbx_MatrixValue18_5() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA618"));
				return element;
			}
			public static WebElement txtbx_MatrixValue19_5() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA619"));
				return element;
			}
			public static WebElement txtbx_MatrixValue20_5() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA620"));
				return element;
			}
			public static WebElement txtbx_MatrixValue1_6() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA71"));
				return element;
			}
			public static WebElement txtbx_MatrixValue2_6() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA72"));
				return element;
			}
			public static WebElement txtbx_MatrixValue3_6() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA73"));
				return element;
			}
			public static WebElement txtbx_MatrixValue4_6() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA74"));
				return element;
			}
			public static WebElement txtbx_MatrixValue5_6() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA75"));
				return element;
			}
			public static WebElement txtbx_MatrixValue6_6() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA76"));
				return element;
			}
			public static WebElement txtbx_MatrixValue7_6() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA77"));
				return element;
			}
			public static WebElement txtbx_MatrixValue8_6() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA78"));
				return element;
			}
			public static WebElement txtbx_MatrixValue9_6() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA79"));
				return element;
			}
			public static WebElement txtbx_MatrixValue10_6() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA710"));
				return element;
			}
			public static WebElement txtbx_MatrixValue11_6() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA711"));
				return element;
			}
			public static WebElement txtbx_MatrixValue12_6() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA712"));
				return element;
			}
			public static WebElement txtbx_MatrixValue13_6() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA713"));
				return element;
			}
			public static WebElement txtbx_MatrixValue14_6() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA714"));
				return element;
			}
			public static WebElement txtbx_MatrixValue15_6() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA715"));
				return element;
			}
			public static WebElement txtbx_MatrixValue16_6() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA716"));
				return element;
			}
			public static WebElement txtbx_MatrixValue17_6() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA717"));
				return element;
			}
			public static WebElement txtbx_MatrixValue18_6() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA718"));
				return element;
			}
			public static WebElement txtbx_MatrixValue19_6() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA719"));
				return element;
			}
			public static WebElement txtbx_MatrixValue20_6() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA720"));
				return element;
			}
			public static WebElement txtbx_MatrixValue1_7() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA81"));
				return element;
			}
			public static WebElement txtbx_MatrixValue2_7() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA82"));
				return element;
			}
			public static WebElement txtbx_MatrixValue3_7() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA83"));
				return element;
			}
			public static WebElement txtbx_MatrixValue4_7() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA84"));
				return element;
			}
			public static WebElement txtbx_MatrixValue5_7() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA85"));
				return element;
			}
			public static WebElement txtbx_MatrixValue6_7() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA86"));
				return element;
			}
			public static WebElement txtbx_MatrixValue7_7() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA87"));
				return element;
			}
			public static WebElement txtbx_MatrixValue8_7() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA88"));
				return element;
			}
			public static WebElement txtbx_MatrixValue9_7() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA89"));
				return element;
			}
			public static WebElement txtbx_MatrixValue10_7() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA810"));
				return element;
			}
			public static WebElement txtbx_MatrixValue11_7() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA811"));
				return element;
			}
			public static WebElement txtbx_MatrixValue12_7() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA812"));
				return element;
			}
			public static WebElement txtbx_MatrixValue13_7() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA813"));
				return element;
			}
			public static WebElement txtbx_MatrixValue14_7() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA814"));
				return element;
			}
			public static WebElement txtbx_MatrixValue15_7() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA815"));
				return element;
			}
			public static WebElement txtbx_MatrixValue16_7() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA816"));
				return element;
			}
			public static WebElement txtbx_MatrixValue17_7() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA817"));
				return element;
			}
			public static WebElement txtbx_MatrixValue18_7() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA818"));
				return element;
			}
			public static WebElement txtbx_MatrixValue19_7() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA819"));
				return element;
			}
			public static WebElement txtbx_MatrixValue20_7() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA820"));
				return element;
			}
			public static WebElement txtbx_MatrixValue1_8() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA91"));
				return element;
			}
			public static WebElement txtbx_MatrixValue2_8() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA92"));
				return element;
			}
			public static WebElement txtbx_MatrixValue3_8() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA93"));
				return element;
			}
			public static WebElement txtbx_MatrixValue4_8() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA94"));
				return element;
			}
			public static WebElement txtbx_MatrixValue5_8() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA95"));
				return element;
			}
			public static WebElement txtbx_MatrixValue6_8() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA96"));
				return element;
			}
			public static WebElement txtbx_MatrixValue7_8() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA97"));
				return element;
			}
			public static WebElement txtbx_MatrixValue8_8() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA98"));
				return element;
			}
			public static WebElement txtbx_MatrixValue9_8() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA99"));
				return element;
			}
			public static WebElement txtbx_MatrixValue10_8() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA910"));
				return element;
			}
			public static WebElement txtbx_MatrixValue11_8() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA911"));
				return element;
			}
			public static WebElement txtbx_MatrixValue12_8() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA912"));
				return element;
			}
			public static WebElement txtbx_MatrixValue13_8() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA913"));
				return element;
			}
			public static WebElement txtbx_MatrixValue14_8() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA914"));
				return element;
			}
			public static WebElement txtbx_MatrixValue15_8() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA915"));
				return element;
			}
			public static WebElement txtbx_MatrixValue16_8() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA916"));
				return element;
			}
			public static WebElement txtbx_MatrixValue17_8() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA917"));
				return element;
			}
			public static WebElement txtbx_MatrixValue18_8() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA918"));
				return element;
			}
			public static WebElement txtbx_MatrixValue19_8() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA919"));
				return element;
			}
			public static WebElement txtbx_MatrixValue20_8() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA920"));
				return element;
			}
			public static WebElement txtbx_MatrixValue1_9() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA101"));
				return element;
			}
			public static WebElement txtbx_MatrixValue2_9() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA102"));
				return element;
			}
			public static WebElement txtbx_MatrixValue3_9() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA103"));
				return element;
			}
			public static WebElement txtbx_MatrixValue4_9() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA104"));
				return element;
			}
			public static WebElement txtbx_MatrixValue5_9() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA105"));
				return element;
			}
			public static WebElement txtbx_MatrixValue6_9() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA106"));
				return element;
			}
			public static WebElement txtbx_MatrixValue7_9() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA107"));
				return element;
			}
			public static WebElement txtbx_MatrixValue8_9() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA108"));
				return element;
			}
			public static WebElement txtbx_MatrixValue9_9() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA109"));
				return element;
			}
			public static WebElement txtbx_MatrixValue10_9() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA1010"));
				return element;
			}
			public static WebElement txtbx_MatrixValue11_9() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA1011"));
				return element;
			}
			public static WebElement txtbx_MatrixValue12_9() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA1012"));
				return element;
			}
			public static WebElement txtbx_MatrixValue13_9() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA1013"));
				return element;
			}
			public static WebElement txtbx_MatrixValue14_9() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA1014"));
				return element;
			}
			public static WebElement txtbx_MatrixValue15_9() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA1015"));
				return element;
			}
			public static WebElement txtbx_MatrixValue16_9() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA1016"));
				return element;
			}
			public static WebElement txtbx_MatrixValue17_9() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA1017"));
				return element;
			}
			public static WebElement txtbx_MatrixValue18_9() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA1018"));
				return element;
			}
			public static WebElement txtbx_MatrixValue19_9() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA1019"));
				return element;
			}
			public static WebElement txtbx_MatrixValue20_9() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA1020"));
				return element;
			}
			public static WebElement txtbx_MatrixValue1_10() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA111"));
				return element;
			}
			public static WebElement txtbx_MatrixValue2_10() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA112"));
				return element;
			}
			public static WebElement txtbx_MatrixValue3_10() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA113"));
				return element;
			}
			public static WebElement txtbx_MatrixValue4_10() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA114"));
				return element;
			}
			public static WebElement txtbx_MatrixValue5_10() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA115"));
				return element;
			}
			public static WebElement txtbx_MatrixValue6_10() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA116"));
				return element;
			}
			public static WebElement txtbx_MatrixValue7_10() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA117"));
				return element;
			}
			public static WebElement txtbx_MatrixValue8_10() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA118"));
				return element;
			}
			public static WebElement txtbx_MatrixValue9_10() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA119"));
				return element;
			}
			public static WebElement txtbx_MatrixValue10_10() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA1110"));
				return element;
			}
			public static WebElement txtbx_MatrixValue11_10() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA1111"));
				return element;
			}
			public static WebElement txtbx_MatrixValue12_10() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA1112"));
				return element;
			}
			public static WebElement txtbx_MatrixValue13_10() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA1113"));
				return element;
			}
			public static WebElement txtbx_MatrixValue14_10() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA1114"));
				return element;
			}
			public static WebElement txtbx_MatrixValue15_10() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA1115"));
				return element;
			}
			public static WebElement txtbx_MatrixValue16_10() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA1116"));
				return element;
			}
			public static WebElement txtbx_MatrixValue17_10() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA1117"));
				return element;
			}
			public static WebElement txtbx_MatrixValue18_10() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA1118"));
				return element;
			}
			public static WebElement txtbx_MatrixValue19_10() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA1119"));
				return element;
			}
			public static WebElement txtbx_MatrixValue20_10() 
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtA1120"));
				return element;
			}
			public static WebElement btn_Matrix1() 
			{
				WebElement element = driver.findElement(By.xpath("//div[@id='div_Matrixbtn1']/img"));
				return element;
			}
			public static WebElement btn_Matrix2() 
			{
				WebElement element = driver.findElement(By.xpath("//div[@id='div_Matrixbtn2']/img"));
				return element;
			}
			public static WebElement btn_Matrix3() 
			{
				WebElement element = driver.findElement(By.xpath("//div[@id='div_Matrixbtn3']/img"));
				return element;
			}
			public static WebElement btn_Matrix4() 
			{
				WebElement element = driver.findElement(By.xpath("//div[@id='div_Matrixbtn4']/img"));
				return element;
			}
		}
		public static class QuantityBased
		{
			public static WebElement txtbx_Description()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtDescription"));
				return element;
			}
			public static WebElement txtbx_UnitRate1()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtQtyUnitRate"));
				return element;
			}
			public static WebElement txtbx_UnitRate2()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtQtyUnitRate1"));
				return element;
			}
			public static WebElement txtbx_UnitRate3()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtQtyUnitRate2"));
				return element;
			}
			public static WebElement txtbx_UnitRate4()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtQtyUnitRate3"));
				return element;
			}
			public static WebElement txtbx_Quantity1()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtQtyQuantity"));
				return element;
			}
			public static WebElement txtbx_Quantity2()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtQtyQuantity1"));
				return element;
			}
			public static WebElement txtbx_Quantity3()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtQtyQuantity2"));
				return element;
			}
			public static WebElement txtbx_Quantity4()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtQtyQuantity3"));
				return element;
			}
			public static WebElement txtbx_Markup1()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtQtyProfit"));
				return element;
			}
			public static WebElement txtbx_Markup2()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtQtyProfit1"));
				return element;
			}
			public static WebElement txtbx_Markup3()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtQtyProfit2"));
				return element;
			}
			public static WebElement txtbx_Markup4()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtQtyProfit3"));
				return element;
			}
			public static WebElement txtbx_SellingPrice1()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtQtySellingPrice"));
				return element;
			}
			public static WebElement txtbx_SellingPrice2()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtQtySellingPrice1"));
				return element;
			}
			public static WebElement txtbx_SellingPrice3()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtQtySellingPrice2"));
				return element;
			}
			public static WebElement txtbx_SellingPrice4()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtQtySellingPrice3"));
				return element;
			}
			public static WebElement btn_Save()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_btnSave"));
				return element;
			}
			public static WebElement btn_Advanced()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_btnAdvanced"));
				return element;
			}
			public static WebElement txtbx_SetupTime()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtQtySetUpTime"));
				return element;
			}
			public static WebElement txtbx_HourlyRate()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtQtyHourlyRate"));
				return element;
			}
			public static WebElement txt_TotalTime()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_lblQtyTotalTime"));
				return element;
			}
			
		}
		public static class TimeBased
		{
			public static WebElement txtbx_Description()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtDescription"));
				return element;
			}
			public static WebElement txtbx_PerHourCost()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtHourlyRate"));
				return element;
			}
			public static WebElement txtbx_MakeReadyTime()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtSetUpTime"));
				return element;
			}
			public static WebElement txtbx_Hours()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtHours"));
				return element;
			}
			public static WebElement txtbx_Passes()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtPasses"));
				return element;
			}
			public static WebElement txtbx_Markup()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtProfit"));
				return element;
			}
			public static WebElement txtbx_SellingPrice()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtSellingPrice"));
				return element;
			}
			public static WebElement btn_Save()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_btnSave"));
				return element;
			}
			public static WebElement btn_Advanced()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_btnAdvanced"));
				return element;
			}
			public static WebElement txtbx_RunsRequired()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_txtRunsRequired"));
				return element;
			}
			public static WebElement txt_Speed()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_lblSpeed"));
				return element;
			}
			public static WebElement txt_TotalTime()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_lblTotalTime"));
				return element;
			}
			public static WebElement txt_Cost()
			{
				WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_ctl00_lblCost"));
				return element;
			}
		}
	}
	public static class EstimateSummary
	{
		public static WebElement txt_EstimateNumber()
		{
			WebElement element = driver.findElement(By.id("ctl00_ContentPlaceHolder1_UCItemSummaryMain_lblEstJobInvNo"));
			return element;
		}
		public static WebElement btn_AddSubItem()
		{
			WebElement element = driver.findElement(By.xpath("//div/a/input[@value='Add Sub Item']"));
			return element;
		}
		public static WebElement lnk_SheetFedDigital()
		{
			WebElement element = driver.findElement(By.xpath("//form/div/ul/li/a/span[text()='Sheet Fed Digital']"));
			return element;
		}
		public static WebElement lnk_SheetFedDigital_SingleItem()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li[1]/div/ul/li/a/span[contains(text(),'Single Item')]"));
			return element;
		}
		public static WebElement lnk_SheetFedDigital_Pads()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li[1]/div/ul/li/a/span[contains(text(),'Pads')]"));
			return element;
		}
		public static WebElement lnk_SheetFedOffset()
		{
			WebElement element = driver.findElement(By.xpath("//form/div/ul/li/a/span[text()='Sheet Fed Offset']"));
			return element;
		}
		public static WebElement lnk_SheetFedOffset_SingleItem()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li[2]/div/ul/li/a/span[contains(text(),'Single Item')]"));
			return element;
		}
		public static WebElement lnk_SheetFedOffset_Pads()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li[2]/div/ul/li/a/span[contains(text(),'Pads')]"));
			return element;
		}
		public static WebElement lnk_LargeFormat()
		{
			WebElement element = driver.findElement(By.xpath("//form/div/ul/li/a/span[text()='Large Format']"));
			return element;
		}
		public static WebElement lnk_LargeFormat_Linear()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li[3]/div/ul/li/a/span[contains(text(),'Linear')]"));
			return element;
		}
		public static WebElement lnk_LargeFormat_SquareMeter()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li[3]/div/ul/li/a/span[contains(text(),'Square Meter')]"));
			return element;
		}
		public static WebElement lnk_ProductCatalogue()
		{
			WebElement element = driver.findElement(By.xpath("//form/div/ul/li/a/span[text()='Product Catalogue']"));
			return element;
		}
		public static WebElement lnk_Outwork()
		{
			WebElement element = driver.findElement(By.xpath("//form/div/ul/li/a/span[text()='Outwork']"));
			return element;
		}
		public static WebElement lnk_OtherCosts()
		{
			WebElement element = driver.findElement(By.xpath("//form/div/ul/li/a/span[text()='Other Costs']"));
			return element;
		}
		public static WebElement btn_Options()
		{
			WebElement element = driver.findElement(By.xpath("//div/div/a/input[@value='Action']"));
			return element;
		}
		public static WebElement lnk_ReRun_Item()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li/a/span[text()='Re-Run Item']"));
			return element;
		}
		public static WebElement lnk_Copy_Item()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li/a/span[text()='Copy Item']"));
			return element;
		}
		public static WebElement lnk_Delete_Item()
		{
			WebElement element = driver.findElement(By.xpath("/html/body/div/form/div/ul/li/a/span[text()='Delete Item']"));
			return element;
		}
		public static WebElement txt_ItemTitle()
		{
			WebElement element = driver.findElement(By.xpath("//tr[td[1][div[contains(text(),'Item Title')]]]/td/div/label"));
			return element;
		}
		public static WebElement txt_Qty1()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[td[1][div[contains(text(),'Quantity')]]]/td[2]/table/tbody/tr/td[1]/span"));
			return element;
		}
		public static WebElement txt_Qty2()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[td[1][div[contains(text(),'Quantity')]]]/td[2]/table/tbody/tr/td[2]/span"));
			return element;
		}
		public static WebElement txt_Qty3()
		{
			WebElement element = driver.findElement(By.id("//table/tbody/tr[td[1][div[contains(text(),'Quantity')]]]/td[2]/table/tbody/tr/td[3]/span"));
			return element;
		}
		public static WebElement txt_Qty4()
		{
			WebElement element = driver.findElement(By.id("//table/tbody/tr[td[1][div[contains(text(),'Quantity')]]]/td[2]/table/tbody/tr/td[4]/span"));
			return element;
		}
		public static WebElement txt_Price1(String ItemName)
		{
			WebElement element = driver.findElement(By.id("//table/tbody/tr/td/table[3]/tbody/tr[td[1][div[a[contains(text(),'"+ItemName+"')]]]]/td[2]/table/tbody/tr/td[1]/span"));
			return element;
		}
		public static WebElement txt_Price2(String ItemName)
		{
			WebElement element = driver.findElement(By.id("//table/tbody/tr/td/table[3]/tbody/tr[td[1][div[a[contains(text(),'"+ItemName+"')]]]]/td[2]/table/tbody/tr/td[2]/span"));
			return element;
		}
		public static WebElement txt_Price3(String ItemName)
		{
			WebElement element = driver.findElement(By.id("//table/tbody/tr/td/table[3]/tbody/tr[td[1][div[a[contains(text(),'"+ItemName+"')]]]]/td[2]/table/tbody/tr/td[3]/span"));
			return element;
		}
		public static WebElement txt_Price4(String ItemName)
		{
			WebElement element = driver.findElement(By.id("//table/tbody/tr/td/table[3]/tbody/tr[td[1][div[a[contains(text(),'"+ItemName+"')]]]]/td[2]/table/tbody/tr/td[4]/span"));
			return element;
		}
		public static WebElement txt_CostPrice_Excl_Markup1()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnCostExMarkup1_')]"));
			return element;
		}
		public static WebElement txt_CostPrice_Excl_Markup2()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnCostExMarkup2_')]"));
			return element;
		}
		public static WebElement txt_CostPrice_Excl_Markup3()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnCostExMarkup3_')]"));
			return element;
		}
		public static WebElement txt_CostPrice_Excl_Markup4()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnCostExMarkup4_')]"));
			return element;
		}
		public static WebElement txt_Markup1()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnMarkupPrice1_')]"));
			return element;
		}
		public static WebElement txt_Markup2()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnMarkupPrice2_')]"));
			return element;
		}
		public static WebElement txt_Markup3()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnMarkupPrice3_')]"));
			return element;
		}
		public static WebElement txt_Markup4()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnMarkupPrice4_')]"));
			return element;
		}
		public static WebElement txt_CostPrice_Incl_Markup1()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnCostInMarkup1_')]"));
			return element;
		}
		public static WebElement txt_CostPrice_Incl_Markup2()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnCostInMarkup2_')]"));
			return element;
		}
		public static WebElement txt_CostPrice_Incl_Markup3()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnCostInMarkup3_')]"));
			return element;
		}
		public static WebElement txt_CostPrice_Incl_Markup4()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/span[contains(@id,'spnCostInMarkup4_')]"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPercentage1()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtProfitMarginPercentage1_')]"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPercentage2()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtProfitMarginPercentage2_')]"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPercentage3()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtProfitMarginPercentage3_')]"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPercentage4()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtProfitMarginPercentage4_')]"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPrice1()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtProfitMarginPrice1_')]"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPrice2()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtProfitMarginPrice2_')]"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPrice3()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtProfitMarginPrice3_')]"));
			return element;
		}
		public static WebElement txtbx_ProfitMarginPrice4()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtProfitMarginPrice4_')]"));
			return element;
		}
		public static WebElement txtbx_SubTotal1()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtSubTotal1_')]"));
			return element;
		}
		public static WebElement txtbx_SubTotal2()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtSubTotal2_')]"));
			return element;
		}
		public static WebElement txtbx_SubTotal3()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtSubTotal3_')]"));
			return element;
		}
		public static WebElement txtbx_SubTotal4()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/input[contains(@id,'txtSubTotal4_')]"));
			return element;
		}
		public static WebElement drpdn_Tax()
		{
			WebElement element = driver.findElement(By.xpath("//div/select[contains(@id,'ddlTax_')]"));
			return element;
		}
		public static WebElement txt_TaxValue1()
		{
			WebElement element = driver.findElement(By.xpath("//td/span[contains(@id,'spnTaxPrice1_')]"));
			return element;
		}
		public static WebElement txt_TaxValue2()
		{
			WebElement element = driver.findElement(By.xpath("//td/span[contains(@id,'spnTaxPrice2_')]"));
			return element;
		}
		public static WebElement txt_TaxValue3()
		{
			WebElement element = driver.findElement(By.xpath("//td/span[contains(@id,'spnTaxPrice3_')]"));
			return element;
		}
		public static WebElement txt_TaxValue4()
		{
			WebElement element = driver.findElement(By.xpath("//td/span[contains(@id,'spnTaxPrice4_')]"));
			return element;
		}
		public static WebElement txt_SellingPrice1()
		{
			WebElement element = driver.findElement(By.xpath("//td/span[contains(@id,'spnSellingPrice1_')]"));
			return element;
		}
		public static WebElement txt_SellingPrice2()
		{
			WebElement element = driver.findElement(By.xpath("//td/span[contains(@id,'spnSellingPrice2_')]"));
			return element;
		}
		public static WebElement txt_SellingPrice3()
		{
			WebElement element = driver.findElement(By.xpath("//td/span[contains(@id,'spnSellingPrice3_')]"));
			return element;
		}
		public static WebElement txt_SellingPrice4()
		{
			WebElement element = driver.findElement(By.xpath("//td/span[contains(@id,'spnSellingPrice4_')]"));
			return element;
		}
		public static WebElement txt_GrossProfitPrice1()
		{
			WebElement element = driver.findElement(By.xpath("//td/div/span[contains(@id,'spnGrossProfitPrice1_')]"));
			return element;
		}
		public static WebElement txt_GrossProfitPrice2()
		{
			WebElement element = driver.findElement(By.xpath("//td/div/span[contains(@id,'spnGrossProfitPrice2_')]"));
			return element;
		}
		public static WebElement txt_GrossProfitPrice3()
		{
			WebElement element = driver.findElement(By.xpath("//td/div/span[contains(@id,'spnGrossProfitPrice3_')]"));
			return element;
		}
		public static WebElement txt_GrossProfitPrice4()
		{
			WebElement element = driver.findElement(By.xpath("//td/div/span[contains(@id,'spnGrossProfitPrice4_')]"));
			return element;
		}
		public static WebElement txt_GrossProfitPercentage1()
		{
			WebElement element = driver.findElement(By.xpath("//td/div/span[contains(@id,'spnGrossProfitPercentage1_')]"));
			return element;
		}
		public static WebElement txt_GrossProfitPercentage2()
		{
			WebElement element = driver.findElement(By.xpath("//td/div/span[contains(@id,'spnGrossProfitPercentage2_')]"));
			return element;
		}
		public static WebElement txt_GrossProfitPercentage3()
		{
			WebElement element = driver.findElement(By.xpath("//td/div/span[contains(@id,'spnGrossProfitPercentage3_')]"));
			return element;
		}
		public static WebElement txt_GrossProfitPercentage4()
		{
			WebElement element = driver.findElement(By.xpath("//td/div/span[contains(@id,'spnGrossProfitPercentage4_')]"));
			return element;
		}
		public static WebElement btn_AccountingCode()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr/td/div/div[2]/input[contains(@id,'AccountCode_')]"));
			return element;
		}
		public static WebElement btn_SaveAndStay()
		{
			WebElement element = driver.findElement(By.xpath("//div/div/input[contains(@id,'btnStay')]"));
			return element;
		}
		public static WebElement btn_Save()
		{
			WebElement element = driver.findElement(By.xpath("//table/tbody/tr[2]/td/div/div[1]/div/input[@value='Save']"));
			return element;
		}
	}
}