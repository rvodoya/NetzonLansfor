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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://dev.lansforsakringar.smash.netzon.se/#/checklist')

WebUI.setText(findTestObject('Personal Info/Namn'), 'Lorem ipsum dolor sit amet')

WebUI.setText(findTestObject('Personal Info/Personnummer'), '890521-5094')

WebUI.setText(findTestObject('Personal Info/Forsakringnummer'), 'Lorem ipsum dolor sit amet')

WebUI.setText(findTestObject('Personal Info/Utdelningsaddress'), 'Lorem ipsum dolor sit amet')

WebUI.setText(findTestObject('Personal Info/Postnummer'), 'Lorem ipsum dolor sit amet')

WebUI.setText(findTestObject('Personal Info/Telefon'), 'Lorem ipsum dolor sit amet')

WebUI.setText(findTestObject('Personal Info/Mobiltelefon'), 'Lorem ipsum dolor sit amet')

WebUI.setText(findTestObject('Personal Info/E-post'), 'Lorem ipsum dolor sit amet')

WebUI.setText(findTestObject('Personal Info/Villans'), 'Lorem ipsum dolor sit amet')

WebUI.setText(findTestObject('Personal Info/Huvudsaktlig'), 'Lorem ipsum dolor sit amet')

WebUI.click(findTestObject('Personal Info/Inbrottslarm'))

WebUI.setText(findTestObject('Personal Info/Typ Av'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.uploadFile(findTestObject('Personal Info/Laddup build'), 'C:\\Users\\netzon.rhobert\\git\\NetzonLansfor\\Data Files\\petra.jpg')

WebUI.setText(findTestObject('Personal Info/Ovrig'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.delay(2)

WebUI.click(findTestObject('Personal Info/Nasta'))

WebUI.setText(findTestObject('Kitchen/Bygg'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.click(findTestObject('Kitchen/Ar nagon'))

WebUI.click(findTestObject('Kitchen/Finns'))

WebUI.click(findTestObject('Kitchen/kyl och frys'))

WebUI.click(findTestObject('Kitchen/Vatten'))

WebUI.click(findTestObject('Kitchen/Finns'))

WebUI.click(findTestObject('Kitchen/samtliga'))

WebUI.click(findTestObject('Kitchen/alla ror'))

WebUI.click(findTestObject('Kitchen/fria fran'))

WebUI.click(findTestObject('Kitchen/stumt fastmorande'))

WebUI.uploadFile(findTestObject('Kitchen/Laddup build'), 'C:\\Users\\netzon.rhobert\\git\\NetzonLansfor\\Data Files\\busan1.jpg')

WebUI.setText(findTestObject('Kitchen/Ovrig kommentar'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.delay(2)

WebUI.click(findTestObject('Kitchen/Nasta'))

WebUI.setText(findTestObject('Laundry/Bygg'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.setText(findTestObject('Laundry/Ytmaterial'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.click(findTestObject('Laundry/renovering'))

WebUI.click(findTestObject('Laundry/vattentat'))

WebUI.click(findTestObject('Laundry/narmast'))

WebUI.click(findTestObject('Laundry/Finns det'))

WebUI.uploadFile(findTestObject('Laundry/Laddup build'), 'C:\\Users\\netzon.rhobert\\git\\NetzonLansfor\\Data Files\\busan2.jpg')

WebUI.setText(findTestObject('Laundry/Ovrig kommentar'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.delay(2)

WebUI.click(findTestObject('Laundry/Nasta'))

WebUI.setText(findTestObject('Bathroom/Bygg'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.setText(findTestObject('Bathroom/Ytmaterial'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.click(findTestObject('Bathroom/renovering'))

WebUI.click(findTestObject('Bathroom/duschstang'))

WebUI.click(findTestObject('Bathroom/golvytan'))

WebUI.click(findTestObject('Bathroom/kann pa klamringen'))

WebUI.click(findTestObject('Bathroom/Finns det nagra'))

WebUI.uploadFile(findTestObject('Bathroom/Laddup build'), 'C:\\Users\\netzon.rhobert\\git\\NetzonLansfor\\Data Files\\petra.jpg')

WebUI.setText(findTestObject('Bathroom/Information'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.delay(2)

WebUI.click(findTestObject('Bathroom/Nasta'))

WebUI.setText(findTestObject('Water Heater/var i huset'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.click(findTestObject('Water Heater/Varvattemenberedaren'))

WebUI.click(findTestObject('Water Heater/golvytan'))

WebUI.setText(findTestObject('Water Heater/Ovrig kommentar'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.click(findTestObject('Water Heater/Nasta'))

WebUI.click(findTestObject('Heat/i huset'))

WebUI.click(findTestObject('Heat/star'))

WebUI.click(findTestObject('Heat/Ar det'))

WebUI.uploadFile(findTestObject('Heat/Laddup build'), 'C:\\Users\\netzon.rhobert\\git\\NetzonLansfor\\Data Files\\chateau.jpg')

WebUI.setText(findTestObject('Heat/Ovrig kommentar'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.delay(2)

WebUI.click(findTestObject('Heat/Nasta'))

WebUI.click(findTestObject('Other-water/finns huvudav'))

WebUI.click(findTestObject('Other-water/Ar vatten'))

WebUI.click(findTestObject('Other-water/finns vattem'))

WebUI.setText(findTestObject('Other-water/Ovrig kommentar'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.delay(2)

WebUI.click(findTestObject('Other-water/Nasta'))

WebUI.click(findTestObject('Fire-safety/brandvarnare'))

WebUI.click(findTestObject('Fire-safety/branslackare'))

WebUI.click(findTestObject('Fire-safety/jordfelsbytare'))

WebUI.click(findTestObject('Fire-safety/kamin'))

WebUI.click(findTestObject('Fire-safety/ar denna'))

WebUI.click(findTestObject('Fire-safety/forvaras'))

WebUI.uploadFile(findTestObject('Fire-safety/Laddup build'), 'C:\\Users\\netzon.rhobert\\git\\NetzonLansfor\\Data Files\\junker.jpg')

WebUI.setText(findTestObject('Fire-safety/Ovrig kommentar'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.click(findTestObject('Fire-safety/Nasta'))

WebUI.delay(2)

WebUI.uploadFile(findTestObject('Photograph/Villan'), 'C:\\Users\\netzon.rhobert\\git\\NetzonLansfor\\Data Files\\junker.jpg')

WebUI.uploadFile(findTestObject('Photograph/Altan'), 'C:\\Users\\netzon.rhobert\\git\\NetzonLansfor\\Data Files\\chateau.jpg')

WebUI.uploadFile(findTestObject('Photograph/Garage'), 'C:\\Users\\netzon.rhobert\\git\\NetzonLansfor\\Data Files\\busan2.jpg')

WebUI.uploadFile(findTestObject('Photograph/Grunden'), 'C:\\Users\\netzon.rhobert\\git\\NetzonLansfor\\Data Files\\busan1.jpg')

WebUI.uploadFile(findTestObject('Photograph/Eventuella'), 'C:\\Users\\netzon.rhobert\\git\\NetzonLansfor\\Data Files\\petra.jpg')

WebUI.setText(findTestObject('Photograph/Ovrig kommentar'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.click(findTestObject('Photograph/Nasta'))

WebUI.click(findTestObject('Close/Nej Tack'))

WebUI.delay(4)

WebUI.click(findTestObject('Skicka in'))

WebUI.setText(findTestObject('Ort och datum'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.setText(findTestObject('Namn Textbox'), 'Lorem Ipsum Dolor Sit Amet')

WebUI.click(findTestObject('Skicka In Popup'))

WebUI.delay(4)

WebUI.click(findTestObject('Slipp'))

WebUI.closeBrowser()

