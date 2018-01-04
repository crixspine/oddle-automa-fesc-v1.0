import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('001_login_email_successful'), [:], FailureHandling.STOP_ON_FAILURE)

'Ensure that account only has 1 and only 1 address '
WebUI.click(findTestObject('LogIn/div_Hi user'))

WebUI.delay(1)

WebUI.click(findTestObject('Account/a_Address Book'))

WebUI.click(findTestObject('Account/button_Add Address'))

WebUI.setText(findTestObject('Account/input_deliveryAddressPostal'), GlobalVariable.postalcode)

WebUI.delay(3)

WebUI.setText(findTestObject('Account/input_deliveryAddressTwo'), GlobalVariable.unit)

WebUI.click(findTestObject('Account/button_Save Address'))

WebUI.delay(3)

WebUI.click(findTestObject('HomePage/a_Home'))

WebUI.click(findTestObject('LogIn/div_Hi user'))

WebUI.delay(1)

WebUI.click(findTestObject('Account/a_Address Book'))

WebUI.delay(1)

WebUI.verifyElementPresent(findTestObject('Account/div_new address added'), 0)

WebUI.verifyElementPresent(findTestObject('Account/h4_new address header'), 0)

WebUI.verifyElementText(findTestObject('Account/span_new address postcode'), 'Singapore ' + GlobalVariable.postalcode)
