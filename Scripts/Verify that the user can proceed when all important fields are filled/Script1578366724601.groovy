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

WebUI.setText(findTestObject('Personal Info/Namn'), 'Lorem ipsum dolor sit amet')

WebUI.setText(findTestObject('Personal Info/Personnummer'), '890521-5094')

WebUI.setText(findTestObject('Personal Info/Utdelningsaddress'), 'Lorem ipsum dolor sit amet')

WebUI.setText(findTestObject('Personal Info/Postnummer'), 'Lorem ipsum dolor sit amet')

WebUI.setText(findTestObject('Personal Info/E-post'), 'Lorem ipsum dolor sit amet')

WebUI.click(findTestObject('Personal Info/Inbrottslarm'))

WebUI.click(findTestObject('Personal Info/Nasta'))

WebUI.click(findTestObject('Kitchen/Nasta'))

WebUI.click(findTestObject('Laundry/Nasta'))

WebUI.click(findTestObject('Bathroom/Nasta'))

WebUI.click(findTestObject('Water Heater/Nasta'))

WebUI.click(findTestObject('Heat/Nasta'))

WebUI.click(findTestObject('Other-water/Nasta'))

WebUI.click(findTestObject('Fire-safety/Nasta'))

WebUI.uploadFile(findTestObject('Photograph/Villan'), 'C:\\Users\\netzon.rhobert\\git\\NetzonLansfor\\Data Files\\junker.jpg')

WebUI.click(findTestObject('Photograph/Nasta'))

WebUI.delay(4)

WebUI.click(findTestObject('Close/Nej Tack'))

WebUI.delay(4)

WebUI.click(findTestObject('Skicka in'))

WebUI.setText(findTestObject('Ort och datum'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.setText(findTestObject('Namn Textbox'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.click(findTestObject('Skicka In Popup'))

WebUI.delay(4)

WebUI.closeBrowser()

