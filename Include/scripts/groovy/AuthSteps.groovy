import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class AuthSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User on landing screen")
	def onLandingScreen() {
		Mobile.startApplication('C:\\Users\\User\\Downloads\\app-release.apk', true)
		Mobile.tap(findTestObject('Object Repository/Authorization/android.widget.Button (12)'), 10)
		Mobile.tap(findTestObject('Object Repository/Authorization/android.widget.Button (13)'), 10)
	}
	@When("User input fullname")
	def inputFullname() {
		Mobile.tap(findTestObject('Object Repository/Authorization/android.widget.EditText - Alex Under, Fullname (4)'), 10)
		Mobile.setText(findTestObject('Object Repository/Authorization/android.widget.EditText - Alex Under, Fullname (5)'), 'Queen',
			10)
	}
	@And("User input email")
	def inputEmail() {
		Mobile.tap(findTestObject('Object Repository/Authorization/android.widget.EditText - alexemail.com, Email (4)'), 10)
		Mobile.setText(findTestObject('Object Repository/Authorization/android.widget.EditText - alexemail.com, Email (5)'), 'queen26@email.com',
			10)
	}
	@And("User input password")
	def inputPassword() {
		Mobile.tap(findTestObject('Object Repository/Authorization/android.widget.EditText - 123123123, Password (4)'), 10)
		Mobile.setText(findTestObject('Object Repository/Authorization/android.widget.EditText - 123123123, Password (5)'), '12345678',
			10)
	}
	@Then("User tap register button")
	def tapRegisterButton() {
		Mobile.tap(findTestObject('Object Repository/Authorization/android.widget.Button (14)'), 10)
		Mobile.verifyElementVisible(findTestObject('Authorization/android.view.View (7)'), 10)
		Mobile.closeApplication()
	}
	@Given("User on login screen")
	def onLoginScreen() {
		Mobile.startApplication('C:\\Users\\User\\Downloads\\app-release.apk', true)
		Mobile.tap(findTestObject('Object Repository/Authorization/android.widget.Button (3)'), 10)
	}
	@When("User input valid email")
	def inputValidEmail() {
		Mobile.tap(findTestObject('Object Repository/Authorization/android.widget.EditText - Email'), 10)
		Mobile.setText(findTestObject('Object Repository/Authorization/android.widget.EditText - Email (1)'), 'queen123@email.com',
				10)
	}
	@And("User input valid password")
	def inputValidPassword() {
		Mobile.tap(findTestObject('Object Repository/Authorization/android.widget.EditText - Password'), 10)
		Mobile.setText(findTestObject('Object Repository/Authorization/android.widget.EditText - Password (1)'), '123456', 10)
	}
	@Then("User tap login button")
	def tapLoginButton() {
		Mobile.tap(findTestObject('Object Repository/Authorization/android.widget.Button (4)'), 10)
		Mobile.verifyElementVisible(findTestObject('Authorization/android.view.View (5)'), 10)
		Mobile.closeApplication()
	}
	@Given("User on login accounts")
	def onloginAccounts() {
		Mobile.startApplication('C:\\Users\\User\\Downloads\\app-release.apk', true)
		Mobile.tap(findTestObject('Object Repository/Authorization/android.widget.Button (17)'), 10)
	}
	@When("User input valid email and password")
	def inputValidEmailAndPassword() {
		Mobile.tap(findTestObject('Object Repository/Authorization/android.widget.EditText - Email (8)'), 10)
		Mobile.setText(findTestObject('Object Repository/Authorization/android.widget.EditText - Email (9)'), 'queen123@email.com',
			10)
		Mobile.tap(findTestObject('Object Repository/Authorization/android.widget.EditText - Password (8)'), 10)
		Mobile.setText(findTestObject('Object Repository/Authorization/android.widget.EditText - Password (9)'), '123456', 10)
	}
	@And("User tap login")
	def tapLogin() {
		Mobile.tap(findTestObject('Object Repository/Authorization/android.widget.Button (18)'), 10)
	}
	@Then("User tap logout button")
	def tapLogoutButton() {
		Mobile.tap(findTestObject('Object Repository/Authorization/android.widget.Button (9)'), 10)
		Mobile.verifyElementVisible(findTestObject('Object Repository/Authorization/android.view.View (10)'), 10)
		Mobile.closeApplication()
	}
}