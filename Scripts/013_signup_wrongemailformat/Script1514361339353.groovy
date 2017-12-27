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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://mcdonaldstest.staging.oddle.co/en_SG')

WebUI.click(findTestObject('div_Log in'))

WebUI.click(findTestObject('SignUp/a_ Sign up'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('SignUp/input_email'), 'wrongemailformat')

WebUI.setText(findTestObject('SignUp/input_firstName'), 'Oddle')

WebUI.setText(findTestObject('SignUp/input_lastName'), 'Automation')

WebUI.setText(findTestObject('SignUp/input_phone'), '91234567')

WebUI.setText(findTestObject('SignUp/input_password'), 'puToNtaB_1')

WebUI.click(findTestObject('SignUp/button_Sign Up'))

WebUI.delay(1)

WebUI.verifyElementText(findTestObject('SignUp/span_Please enter correct emai'), 'Please enter correct email format e.g. test@example.com')

