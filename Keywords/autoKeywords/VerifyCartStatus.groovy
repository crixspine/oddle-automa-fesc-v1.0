package autoKeywords

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

public class VerifyCartStatus {

	//verifies that cart is shown on screen
	@Keyword
	def verifyCart() {
		WebUI.verifyElementPresent(findTestObject('Cart/b_My Cart Verify'), 0);
		WebUI.verifyElementPresent(findTestObject('Cart/div_Delivery Method Field Verify-XPATH'), 0);
		WebUI.verifyElementPresent(findTestObject('Cart/div_Items Field Verify-XPATH'), 0);
		//WebUI.verifyElementPresent(findTestObject('Cart/div_Sub total Field Verify-XPATH'), 0); can't verify, need fix
		WebUI.verifyElementPresent(findTestObject('Cart/div_Total Field Verify-XPATH'), 0);
		WebUI.verifyElementPresent(findTestObject('Cart/button_Proceed to checkout Verify-XPATH'), 0);
	}	
	
	//verifies that cart is empty
	@Keyword
	def isEmpty() {
		WebUI.verifyElementPresent(findTestObject('Cart/span_Empty State Item Count Verify-XPATH'), 0);
		WebUI.verifyElementPresent(findTestObject('Cart/p_Empty State Text Verify-XPATH'), 0);
	}
}
