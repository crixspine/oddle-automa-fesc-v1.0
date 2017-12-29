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

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.click(findTestObject('LogIn/div_Log in'))

WebUI.click(findTestObject('SignUp/a_ Sign up'), FailureHandling.STOP_ON_FAILURE)

def str1 = CustomKeywords.'autoKeywords.RandomStrGen.randomStr'('abcdefghijklmnopqrstuvwxyz1234567890', 10)

def str2 = CustomKeywords.'autoKeywords.RandomStrGen.randomStr'('abcdefghijklmnopqrstuvwxyz1234567890', 10)

WebUI.setText(findTestObject('SignUp/input_email'), ((str1 + '@') + str2) + '.com')

WebUI.setText(findTestObject('SignUp/input_firstName'), 'Oddle')

WebUI.setText(findTestObject('SignUp/input_lastName'), 'Automation')

WebUI.setText(findTestObject('SignUp/input_phone'), '91234567')

WebUI.setText(findTestObject('SignUp/input_password'), 'puToNtaB_1')

WebUI.click(findTestObject('SignUp/button_Sign Up'))

'Delay for signup success notification (WIP)'
WebUI.delay(3)

WebUI.click(findTestObject('SignUp/div_Hi Oddle'))

WebUI.delay(1)

WebUI.click(findTestObject('LogIn/a_Sign out'))

WebUI.delay(1)

WebUI.click(findTestObject('Account/button_Sign Out'))

WebUI.delay(1)

CustomKeywords.'autoKeywords.verifyLoggedOut.verifyNotLogged'()

WebUI.click(findTestObject('LogIn/div_Log in'))

WebUI.setText(findTestObject('LogIn/input_email'), ((str1 + '@') + str2) + '.com')

WebUI.setText(findTestObject('LogIn/input_password'), 'puToNtaB_1')

WebUI.click(findTestObject('LogIn/button_Login'))

WebUI.delay(3)

CustomKeywords.'autoKeywords.verifyLoggedIn.verifyLogged'()

