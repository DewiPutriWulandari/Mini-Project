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



class CartSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User in the homepage")
	def inTheHomepage() {
		println("\n I in the homepage")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
		WebUI.click(findTestObject('Object Repository/Homepage2/Page_frontend-web/Page_frontend-web/div_Email'))
		WebUI.setText(findTestObject('Object Repository/Homepage2/Page_frontend-web/Page_frontend-web/input_Email_input-18'), 'dewiptrwlndri26@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Homepage2/Page_frontend-web/Page_frontend-web/input_Password_input-21'),
				'Dewisukasuka123')
		WebUI.click(findTestObject('Object Repository/Homepage2/Page_frontend-web/Page_frontend-web/span_Login'))
	}
	@When("User clicks cart")
	def clicksCart() {
		println("\n I clicks cart")
		WebUI.click(findTestObject('Object Repository/Homepage2/Page_frontend-web/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-shoppi_c66ce9'))
	}
	@Then("User view items in cart")
	def viewItemsInCart() {
		println("\n I view items in cart")
		WebUI.verifyElementText(findTestObject('Object Repository/Homepage2/Page_frontend-web/Page_frontend-web/div_Order is empty'),
				'Order is empty!')
		WebUI.closeBrowser()
	}
	@Given("User on cart page")
	def onCartPage() {
		println("\n I on cart page")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
		WebUI.openBrowser('')
		WebUI.closeBrowser()
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
		WebUI.setText(findTestObject('Object Repository/Cart/Page_frontend-web/input_Email_input-18'), 'dewiptrwlndri26@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Cart/Page_frontend-web/input_Password_input-21'), 'Dewisukasuka123')
		WebUI.click(findTestObject('Object Repository/Cart/Page_frontend-web/span_Login'))
		WebUI.click(findTestObject('Object Repository/Cart/Page_frontend-web/span_Beli'))
	}
	@Then("User click add icon")
	def clickAddIcon() {
		println("\n I click add icon")
		WebUI.click(findTestObject('Object Repository/Cart/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-shoppi_c66ce9'))
		WebUI.click(findTestObject('Object Repository/Cart/Page_frontend-web/span_'))
		WebUI.click(findTestObject('Object Repository/Cart/Page_frontend-web/span_'))
		WebUI.verifyElementText(findTestObject('Object Repository/Cart/Page_frontend-web/span_3'), '3')
		WebUI.closeBrowser()
	}
	@Given("User navigate to cart page")
	def navigatesToCartPage() {
		println("\n I navigates to cart page")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
		WebUI.setText(findTestObject('Object Repository/Cart/Page_frontend-web/Page_frontend-web/input_Email_input-18'), 'dewiptrwlndri26@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Cart/Page_frontend-web/Page_frontend-web/input_Password_input-21'), 'Dewisukasuka123')
		WebUI.click(findTestObject('Object Repository/Cart/Page_frontend-web/Page_frontend-web/span_Login'))
		WebUI.click(findTestObject('Object Repository/Cart/Page_frontend-web/Page_frontend-web/button_Beli'))
	}
	@Then("User click the less icon")
	def clickTheLessIcon() {
		println("\n I click the less icon")
		WebUI.click(findTestObject('Object Repository/Cart/Page_frontend-web/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-shoppi_c66ce9'))
		WebUI.doubleClick(findTestObject('Object Repository/Cart/Page_frontend-web/Page_frontend-web/span_'))
		WebUI.doubleClick(findTestObject('Object Repository/Cart/Page_frontend-web/Page_frontend-web/span_-'))
		WebUI.rightClick(findTestObject('Object Repository/Cart/Page_frontend-web/Page_frontend-web/span_1'))
		WebUI.verifyElementText(findTestObject('Object Repository/Cart/Page_frontend-web/Page_frontend-web/span_1'), '1')
		WebUI.closeBrowser()
	}
	@Given("User is in cart")
	def isInCart() {
		println("\n I is in cart")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
		WebUI.click(findTestObject('Object Repository/Cart/Page_frontend-web/Page_frontend-web/Page_frontend-web/div_Email'))
		WebUI.setText(findTestObject('Object Repository/Cart/Page_frontend-web/Page_frontend-web/Page_frontend-web/input_Email_input-18'),
				'dewiptrwlndri26@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Cart/Page_frontend-web/Page_frontend-web/Page_frontend-web/input_Password_input-21'),
				'Dewisukasuka123')
		WebUI.click(findTestObject('Object Repository/Cart/Page_frontend-web/Page_frontend-web/Page_frontend-web/span_Login'))
		WebUI.doubleClick(findTestObject('Object Repository/Cart/Page_frontend-web/Page_frontend-web/Page_frontend-web/span_Beli'))
		WebUI.click(findTestObject('Object Repository/Cart/Page_frontend-web/Page_frontend-web/Page_frontend-web/span_Beli'))
		WebUI.click(findTestObject('Object Repository/Cart/Page_frontend-web/Page_frontend-web/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-shoppi_c66ce9'))
	}
	@Then("User click pay")
	def clickPay() {
		println("\n I click pay")
		WebUI.click(findTestObject('Object Repository/Cart/Page_frontend-web/Page_frontend-web/Page_frontend-web/span_Bayar'))
		WebUI.verifyElementText(findTestObject('Object Repository/Cart/Page_frontend-web/Page_frontend-web/Page_frontend-web/td_Sony PS5'),
				'Sony PS5')
		WebUI.closeBrowser()
	}
	@Given("User is in cart without login")
	def isInCartWithoutLogin() {
		println("\n I is in cart without login")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/')
		WebUI.click(findTestObject('Object Repository/Cart/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/span_Beli'))
		WebUI.click(findTestObject('Object Repository/Cart/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-shoppi_c66ce9'))
	}
	@Then("User click pay items")
	def clickPayItems() {
		println("\n I click pay items")
		WebUI.click(findTestObject('Object Repository/Cart/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/span_Bayar'))
		WebUI.verifyElementText(findTestObject('Object Repository/Cart/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/div_Login'),
				'Login')
		WebUI.closeBrowser()
	}
}