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

WebUI.callTestCase(findTestCase('login_email_successful'), [:], FailureHandling.STOP_ON_FAILURE)

'ensure account has 1 linked address'
WebUI.waitForElementVisible(findTestObject('HomePage/button_Delivery'), 0)

WebUI.click(findTestObject('HomePage/button_Delivery'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('HomePage/button_Continue to Date  Time-XPATH'), 0)

WebUiBuiltInKeywords.click(findTestObject('HomePage/button_Continue to Date  Time-XPATH'))

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('HomePage/p_Set Delivery Window_ Address'), 0)

deliveryAddress = WebUI.getText(findTestObject('HomePage/p_Set Delivery Window_ Address'))

WebUI.waitForElementVisible(findTestObject('HomePage/button_Set Delivery Date  Time'), 0)

WebUiBuiltInKeywords.click(findTestObject('HomePage/button_Set Delivery Date  Time'))

WebUI.delay(3)

CustomKeywords.'autoKeywords.VerifyDeliveryMethod.isDelivery'()

WebUI.waitForElementVisible(findTestObject('HomePage/span_homepage_ Store Address-XPATH'), 0)

deliveryAddress2 = WebUiBuiltInKeywords.getText(findTestObject('HomePage/span_homepage_ Store Address-XPATH'))

'ensure delivery address is consistent'
WebUI.verifyMatch(deliveryAddress, deliveryAddress2, false)

