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

WebUI.callTestCase(findTestCase('001_login_email_successful'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('LogIn/div_Hi user'))

WebUI.delay(1)

WebUI.click(findTestObject('Account/a_Account Details'))

WebUI.delay(1)

WebUI.click(findTestObject('Account/a_ Password tab'))

WebUI.delay(1)

WebUI.setText(findTestObject('Account/input_password'), GlobalVariable.password)

WebUI.setText(findTestObject('Account/input_newpassword'), 'wrongft')

WebUI.setText(findTestObject('Account/input_renewpassword'), 'wrongft')

WebUI.click(findTestObject('Account/button_Save password'))

WebUI.delay(3)

WebUI.verifyElementPresent(findTestObject('Account/span_Ensure it contains at lea'), 0)

WebUI.delay(1)

WebUI.click(findTestObject('LogIn/div_Hi user'))

WebUI.delay(1)

WebUI.click(findTestObject('LogIn/a_Sign out'))

WebUI.delay(1)

WebUI.click(findTestObject('Account/button_Sign Out'))

WebUI.delay(1)

CustomKeywords.'autoKeywords.verifyLoggedOut.verifyNotLogged'()

WebUI.click(findTestObject('LogIn/div_Log in'))

WebUI.setText(findTestObject('LogIn/input_email'), GlobalVariable.email)

WebUI.setText(findTestObject('LogIn/input_password'), 'wrongft')

WebUI.click(findTestObject('LogIn/button_Login'))

WebUI.delay(3)

CustomKeywords.'autoKeywords.verifyLoggedOut.verifyNotLogged'()

