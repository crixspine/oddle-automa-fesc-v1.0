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

WebUI.waitForElementVisible(findTestObject('SignUp/a_ Sign up'), 0)

WebUI.click(findTestObject('SignUp/a_ Sign up'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('SignUp/input_email'), 0)

WebUI.setText(findTestObject('SignUp/input_email'), GlobalVariable.email_placeholder)

WebUI.setText(findTestObject('SignUp/input_firstName'), GlobalVariable.fname)

WebUI.setText(findTestObject('SignUp/input_lastName'), GlobalVariable.lname)

WebUI.setText(findTestObject('SignUp/input_phone'), GlobalVariable.phone)

WebUI.setText(findTestObject('SignUp/input_password'), 'pw123')

WebUI.scrollToElement(findTestObject('SignUp/button_Sign Up'), 0)

WebUI.click(findTestObject('SignUp/button_Sign Up'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('SignUp/span_Password should be at lea'), FailureHandling.STOP_ON_FAILURE)

