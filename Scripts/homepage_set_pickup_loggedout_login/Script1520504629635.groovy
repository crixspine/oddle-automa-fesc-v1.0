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

CustomKeywords.'autoKeywords.GoToHomepageMax.goToHomepage'()

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('HomePage/button_Pickup'), 0)

WebUI.click(findTestObject('HomePage/button_Pickup'))

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('SetDeliveryInfo/div_login to set pickup-XPATH'), 0)

WebUI.click(findTestObject('SetDeliveryInfo/div_login to set pickup-XPATH'))

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('LogIn/input_email-XPATH'), 0)

WebUI.setText(findTestObject('LogIn/input_email-XPATH'), GlobalVariable.email)

WebUI.setText(findTestObject('LogIn/input_password-XPATH'), GlobalVariable.password)

WebUI.click(findTestObject('LogIn/button_Log in-XPATH'))

WebUI.delay(3)

CustomKeywords.'autoKeywords.VerifyLoginStatus.verifyLoggedIn'()

WebUI.verifyElementPresent(findTestObject('SetDeliveryInfo/span_I want to pickup my food'), 0)

