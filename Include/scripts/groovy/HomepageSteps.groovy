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



class HomepageSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User login account")
	def loginAccount() {
		Mobile.startApplication('C:\\Users\\User\\Downloads\\app-release.apk', true)
		Mobile.tap(findTestObject('Object Repository/Homepage/android.widget.Button'), 10)
	}
	@When("User input email and password")
	def inputEmailAndPassword() {
		Mobile.tap(findTestObject('Object Repository/Homepage/android.widget.EditText - Email'), 10)
		Mobile.setText(findTestObject('Object Repository/Homepage/android.widget.EditText - Email (1)'), 'queen123@email.com', 10)
		Mobile.tap(findTestObject('Object Repository/Homepage/android.widget.EditText - Password'), 10)
		Mobile.setText(findTestObject('Object Repository/Homepage/android.widget.EditText - Password (1)'), '123456', 10)
	}
	@And("User click button login")
	def clickButtonLogin() {
		Mobile.tap(findTestObject('Object Repository/Homepage/android.widget.Button (1)'), 10)
	}
	@Then("User verification items")
	def verificationItems() {
		Mobile.verifyElementVisible(findTestObject('Homepage/android.view.View'), 0)
		Mobile.closeApplication()
	}
	@Given("User login accounts")
	def loginAccounts() {
		Mobile.startApplication('C:\\Users\\User\\Downloads\\app-release.apk', true)
		Mobile.tap(findTestObject('Object Repository/Homepage/android.widget.Button (2)'), 10)
	}
	@When("User fill email and password")
	def fillEmailAndPassword() {
		Mobile.tap(findTestObject('Object Repository/Homepage/android.widget.EditText - Email (2)'), 10)
		Mobile.setText(findTestObject('Object Repository/Homepage/android.widget.EditText - Email (3)'), 'queen123@email.com', 10)
		Mobile.tap(findTestObject('Object Repository/Homepage/android.widget.EditText - Password (2)'), 10)
		Mobile.setText(findTestObject('Object Repository/Homepage/android.widget.EditText - Password (3)'), '123456', 10)
	}
	@And("User clicks button login")
	def clicksButtonLogin() {
		Mobile.tap(findTestObject('Object Repository/Homepage/android.widget.Button (3)'), 10)
	}
	@And("User tap buy")
	def tapBuy() {
		Mobile.tap(findTestObject('Object Repository/Homepage/android.widget.Button (4)'), 10)
		Mobile.tap(findTestObject('Object Repository/Homepage/android.widget.Button (5)'), 10)
	}
	@Then("User verification cart")
	def verificationCart() {
		Mobile.verifyElementVisible(findTestObject('Homepage/android.view.View (1)'), 10)
		Mobile.closeApplication()
	}
}