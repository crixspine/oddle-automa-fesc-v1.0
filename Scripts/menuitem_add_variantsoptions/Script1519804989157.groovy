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

WebUI.callTestCase(findTestCase('homepage_set_pickup'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('AddItems/button_Add 1-XPATH'), 0)

WebUI.click(findTestObject('AddItems/button_Add 1-XPATH'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('AddItems/span_Var1-XPATH'), 0)

WebUI.click(findTestObject('AddItems/span_Var1-XPATH'), FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.scrollToElement(findTestObject('AddItems/div_Pick Options'), 0)

WebUI.waitForElementVisible(findTestObject('AddItems/div_Pick Options'), 0)

WebUI.click(findTestObject('AddItems/div_Pick Options'), FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.waitForElementVisible(findTestObject('AddItems/button_Op 1-XPATH'), 0)

WebUI.click(findTestObject('AddItems/button_Op 1-XPATH'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AddItems/button_Op 2-XPATH'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AddItems/button_Op 3-XPATH'), FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.scrollToElement(findTestObject('AddItems/div_Add to Cart'), 0)

WebUI.waitForElementVisible(findTestObject('AddItems/div_Add to Cart'), 0)

WebUI.click(findTestObject('AddItems/div_Add to Cart'), FailureHandling.STOP_ON_FAILURE)

