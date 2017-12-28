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

'This test case will always fail cause of verification at while loop'
WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.verifyElementClickable(findTestObject('HomePage/button_promonext'))

WebUI.verifyElementNotClickable(findTestObject('HomePage/button_promoprev'))

while (WebUI.verifyElementClickable(findTestObject('HomePage/button_promonext'), FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('HomePage/button_promonext'))
}

WebUI.delay(1)

WebUI.verifyElementNotClickable(findTestObject('HomePage/button_promonext'))

WebUI.verifyElementClickable(findTestObject('HomePage/button_promoprev'))

while (WebUI.verifyElementClickable(findTestObject('HomePage/button_promoprev'), FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.click(findTestObject('HomePage/button_promoprev'))
}

WebUI.delay(1)

WebUI.verifyElementClickable(findTestObject('HomePage/button_promonext'))

WebUI.verifyElementNotClickable(findTestObject('HomePage/button_promoprev'))

