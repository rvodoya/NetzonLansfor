import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dev.lansforsakringar.smash.netzon.se/#/checklist')

WebUI.setText(findTestObject('Page_Digital villabesiktning/input_Frskringsnummer_ng-untou'), 'Lorem')

WebUI.setText(findTestObject('Object Repository/Page_Digital villabesiktning/input_Frskringsnummer_ng-valid'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.setText(findTestObject('Object Repository/Page_Digital villabesiktning/input_Telefon dagtid_ng-untouc'), '123465789')

WebUI.setText(findTestObject('Object Repository/Page_Digital villabesiktning/input_Mobiltelefon_ng-untouche'), '123456789')

WebUI.setText(findTestObject('Object Repository/Page_Digital villabesiktning/input_Villans byggr_ng-untouch'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.click(findTestObject('Object Repository/Page_Digital villabesiktning/button_Skicka in'))

WebUI.acceptAlert()

