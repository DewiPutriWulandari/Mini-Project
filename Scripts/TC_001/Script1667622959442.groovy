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

Mobile.startApplication('C:\\Users\\User\\Downloads\\app-release.apk', true)

Mobile.tap(findTestObject('Object Repository/Authorization/android.widget.Button (12)'), 0)

Mobile.tap(findTestObject('Object Repository/Authorization/android.widget.Button (13)'), 0)

Mobile.tap(findTestObject('Object Repository/Authorization/android.widget.EditText - Alex Under, Fullname (4)'), 0)

Mobile.setText(findTestObject('Object Repository/Authorization/android.widget.EditText - Alex Under, Fullname (5)'), 'Queen', 
    0)

Mobile.tap(findTestObject('Object Repository/Authorization/android.widget.EditText - alexemail.com, Email (4)'), 0)

Mobile.setText(findTestObject('Object Repository/Authorization/android.widget.EditText - alexemail.com, Email (5)'), 'queen26@email.com', 
    0)

Mobile.tap(findTestObject('Object Repository/Authorization/android.widget.EditText - 123123123, Password (4)'), 0)

Mobile.setText(findTestObject('Object Repository/Authorization/android.widget.EditText - 123123123, Password (5)'), '12345678', 
    0)

Mobile.tap(findTestObject('Object Repository/Authorization/android.widget.Button (14)'), 0)

Mobile.verifyElementVisible(findTestObject('Authorization/android.view.View (7)'), 0)

Mobile.closeApplication()

