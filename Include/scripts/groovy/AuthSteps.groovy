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
	@Given("User on the register page")
	def onTheRegisterPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/register')
	}
	@When("User input fullname")
	def inputFullname() {
		WebUI.setText(findTestObject('Object Repository/Author/Page_frontend-web (1)/input_Nama Lengkap_input-18'), 'Dewi Putri Wulandari')
	}
	@And("User input email")
	def inputEmail() {
		WebUI.setText(findTestObject('Object Repository/Author/Page_frontend-web (1)/input_Email_input-21'), 'dewiptrwlndri26@gmail.com')
	}
	@And("User input password")
	def inputPassword() {
		WebUI.setText(findTestObject('Object Repository/Author/Page_frontend-web (1)/input_Password_input-24'), 'Dewisukasuka123')
	}
	@Then("User click register button")
	def clickRegisterButton() {
		WebUI.click(findTestObject('Object Repository/Author/Page_frontend-web (1)/span_Register'))
		WebUI.verifyElementText(findTestObject('Object Repository/Author/Page_frontend-web (1)/h3_AltaShop'), 'AltaShop')
		WebUI.closeBrowser()
	}
	@Given("User is on the register page")
	def isOnTheRegisterPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/register')
	}
	@When("User input fullname already use")
	def inputFullnameAlreadyUse() {
		WebUI.setText(findTestObject('Object Repository/Author/Page_frontend-web (1)/Page_frontend-web/input_Nama Lengkap_input-18'),
				'Dewi Putri Wulandari')
	}
	@And("User input email already use")
	def inputEmailAlreadyUse() {
		WebUI.setText(findTestObject('Object Repository/Author/Page_frontend-web (1)/Page_frontend-web/input_Email_input-21'), 'dewiptrwlndri26@gmail.com')
	}
	@And("User input password already use")
	def inputPasswordAlreadyUse() {
		WebUI.setText(findTestObject('Object Repository/Author/Page_frontend-web (1)/Page_frontend-web/input_Password_input-24'),
				'Dewisukasuka123')
	}
	@Then("User clicks the register button")
	def clicksTheRegisterButton() {
		WebUI.click(findTestObject('Object Repository/Author/Page_frontend-web (1)/Page_frontend-web/span_Register'))
		WebUI.verifyElementText(findTestObject('Object Repository/Author/Page_frontend-web (1)/Page_frontend-web/div_Register_v-alert__wrapper'),
				'')
		WebUI.closeBrowser()
	}
	@Given("User on the login page")
	def onTheLoginPage() {
		WebUI.openBrowser('')
		WebUI.maximizeWindow()
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
	}
	@When("User fill email")
	def fillEmail() {
		WebUI.setText(findTestObject('Object Repository/Author/Page_frontend-web/input_Email_input-18'), 'dewiptrwlndri26@gmail.com')
	}
	@And("User fill password")
	def fillPassword() {
		WebUI.setText(findTestObject('Object Repository/Author/Page_frontend-web/input_Password_input-21'), 'Dewisukasuka123')
	}

	@Then("User click login button")
	def clickLoginButton() {
		WebUI.click(findTestObject('Object Repository/Author/Page_frontend-web/span_Login'))
		WebUI.rightClick(findTestObject('Object Repository/Author/Page_frontend-web/h3_AltaShop'))
		WebUI.closeBrowser()
	}
	@Given("User is on the login page")
	def isOnTheLoginPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
	}
	@When("User fill valid email")
	def fillInvalidEmail() {
		WebUI.setText(findTestObject('Object Repository/Author/Page_frontend-web (1)/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/input_Email_input-18'),
				'dewiptrwlndri26@gmail.com')
	}
	@And("User fill invalid password")
	def fillValidPassword() {
		WebUI.setText(findTestObject('Object Repository/Author/Page_frontend-web (1)/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/input_Password_input-21'),
				'Dewisuka1234')
	}

	@Then("User clicks the login button")
	def clicksTheLoginButton() {
		WebUI.click(findTestObject('Object Repository/Author/Page_frontend-web (1)/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/span_Login'))
		WebUI.verifyElementText(findTestObject('Object Repository/Author/Page_frontend-web (1)/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/div_email or password is invalid'),
				'email or password is invalid')
		WebUI.closeBrowser()
	}
	@Given("User login account")
	def loginAccount() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
		WebUI.setText(findTestObject('Object Repository/Author/Page_frontend-web (1)/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/input_Email_input-18'),
				'dewiptrwlndri26@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Author/Page_frontend-web (1)/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/input_Password_input-21'),
				'Dewisukasuka123')
		WebUI.click(findTestObject('Object Repository/Author/Page_frontend-web (1)/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/span_Login'))
	}
	@When("User click profile icon at navbar")
	def clickProfileIconAtNavbar() {
		WebUI.click(findTestObject('Object Repository/Author/Page_frontend-web (1)/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-user t_f0827e'))
	}
	@Then("User click logout")
	def clickLogout() {
		WebUI.click(findTestObject('Object Repository/Author/Page_frontend-web (1)/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/div_Logout'))
		WebUI.verifyElementText(findTestObject('Object Repository/Author/Page_frontend-web (1)/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/div_Login'),
				'Login')
		WebUI.closeBrowser()
	}
}