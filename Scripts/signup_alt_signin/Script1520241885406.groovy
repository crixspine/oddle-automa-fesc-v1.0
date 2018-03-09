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

WebUI.waitForElementVisible(findTestObject('LogIn/div_Log in'), 0)

WebUI.click(findTestObject('LogIn/div_Log in'))

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('SignUp/a_ Sign up'), 0)

WebUI.click(findTestObject('SignUp/a_ Sign up'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SignUp/span_Login'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SignUp/a_ Sign up'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SignUp/span_Login'), FailureHandling.STOP_ON_FAILURE)

WebUiBuiltInKeywords.waitForElementVisible(findTestObject('LogIn/svg_close window-XPATH'), 0)

WebUI.click(findTestObject('LogIn/svg_close window-XPATH'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('LogIn/div_Log in'), FailureHandling.STOP_ON_FAILURE)

