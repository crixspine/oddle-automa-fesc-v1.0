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

WebUI.callTestCase(findTestCase('cart_view_button'), [:], FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('Cart/button_Proceed to checkout Verify-XPATH'), 0)

WebUiBuiltInKeywords.click(findTestObject('Cart/button_Proceed to checkout Verify-XPATH'))

'ensure 20% Off promotion is available'
WebUiBuiltInKeywords.waitForElementVisible(findTestObject('Promotions/h5_20 Off'), 0)

WebUiBuiltInKeywords.click(findTestObject('Promotions/h5_20 Off'))

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('Promotions/button_Proceed to checkout-XPATH'), 0)

WebUiBuiltInKeywords.click(findTestObject('Promotions/button_Proceed to checkout-XPATH'))

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('Promotions/button_Proceed to checkout_Promotion Added-XPATH'), 
    0)

WebUiBuiltInKeywords.click(findTestObject('Promotions/button_Proceed to checkout_Promotion Added-XPATH'))

