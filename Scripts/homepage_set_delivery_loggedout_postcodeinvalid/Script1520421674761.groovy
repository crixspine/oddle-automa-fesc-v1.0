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

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('SetDeliveryInfo/button_Delivery'), 0)

WebUI.click(findTestObject('SetDeliveryInfo/button_Delivery'))

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('Account/input_deliveryAddressPostal'), 0)

WebUI.setText(findTestObject('SetDeliveryInfo/input_deliveryAddressPostal'), '123456')

WebUI.delay(1)

WebUI.setText(findTestObject('SetDeliveryInfo/input_deliveryAddressOne'), GlobalVariable.address)

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('SetDeliveryInfo/button_Continue to Date Time Delivery-XPATH'), 0)

WebUI.click(findTestObject('SetDeliveryInfo/button_Continue to Date Time Delivery-XPATH'))

WebUI.delay(3)

WebUI.verifyElementText(findTestObject('SetDeliveryInfo/span_error_general-XPATH'), 'error_general')

WebUI.delay(1)

