import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.verifyElementPresent(findTestObject('Landing Page/Page_CURA Healthcare Service/a_infokatalon.com'), 0)

WebUI.verifyElementPresent(findTestObject('Landing Page/Page_CURA Healthcare Service/a_Make Appointment'), 0)

WebUI.verifyElementPresent(findTestObject('Landing Page/Page_CURA Healthcare Service/div_CURA Healthcare Service        We Care About Your Health                Make Appointment'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landing Page/Page_CURA Healthcare Service/h1_CURA Healthcare Service'), 0)

WebUI.verifyElementPresent(findTestObject('Landing Page/Page_CURA Healthcare Service/h3_We Care About Your Health'), 0)

WebUI.verifyElementPresent(findTestObject('Landing Page/Page_CURA Healthcare Service/i_(678) 813-1KMS_fa fa-envelope-o fa-fw'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landing Page/Page_CURA Healthcare Service/i_infokatalon.com_fa fa-dribbble fa-fw fa-3x'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landing Page/Page_CURA Healthcare Service/i_infokatalon.com_fa fa-facebook fa-fw fa-3x'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landing Page/Page_CURA Healthcare Service/i_infokatalon.com_fa fa-twitter fa-fw fa-3x'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landing Page/Page_CURA Healthcare Service/li_(678) 813-1KMS'), 0)

WebUI.verifyElementPresent(findTestObject('Landing Page/Page_CURA Healthcare Service/p_Atlanta 550 Pharr Road NE Suite 525Atlanta, GA 30305'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landing Page/Page_CURA Healthcare Service/p_Copyright  CURA Healthcare Service 2023'), 
    0)

WebUI.verifyElementPresent(findTestObject('Landing Page/Page_CURA Healthcare Service/strong_CURA Healthcare Service'), 0)

WebUI.click(findTestObject('Object Repository/Login/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Login/Page_CURA Healthcare Service/a_Login'))

WebUI.setText(findTestObject('Object Repository/Login/Page_CURA Healthcare Service/input_Username_username'), 'John Doe')

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_CURA Healthcare Service/input_Password_password'), 'g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM')

WebUI.click(findTestObject('Object Repository/Login/Page_CURA Healthcare Service/button_Login'))

WebUI.click(findTestObject('Object Repository/Login/Page_CURA Healthcare Service/a_CURA Healthcare_menu-toggle'))

WebUI.click(findTestObject('Object Repository/Login/Page_CURA Healthcare Service/a_Logout'))

