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

'ensure menu only has 1 store'
WebUI.waitForElementVisible(findTestObject('HomePage/button_Pickup'), 0)

WebUI.click(findTestObject('HomePage/button_Pickup'), FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('SetDeliveryInfo/button_Continue to Date Time Pickup-XPATH'), 
    0)

WebUiBuiltInKeywords.click(findTestObject('SetDeliveryInfo/button_Continue to Date Time Pickup-XPATH'), FailureHandling.STOP_ON_FAILURE)

storeName = WebUI.getText(findTestObject('HomePage/p_Set Pickup Window_ Store'))

WebUI.waitForElementVisible(findTestObject('HomePage/button_Set Pickup Date  Time'), 0)

WebUiBuiltInKeywords.click(findTestObject('HomePage/button_Set Pickup Date  Time'))

WebUI.delay(3)

CustomKeywords.'autoKeywords.VerifyDeliveryMethod.isPickup'()

WebUI.waitForElementVisible(findTestObject('HomePage/span_homepage_ Store Address-XPATH'), 0)

storeName2 = WebUiBuiltInKeywords.getText(findTestObject('HomePage/span_homepage_ Store Address-XPATH'))

'ensure pickup store is consistent'
WebUI.verifyMatch(storeName, storeName2, false)

