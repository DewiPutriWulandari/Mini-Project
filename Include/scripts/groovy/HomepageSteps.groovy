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
	@Given("User on the home page")
	def onTheHomepage() {
		println("\n I on the home page")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
		WebUI.setText(findTestObject('Object Repository/Homepage/Page_frontend-web/input_Email_input-18'), 'dewiptrwlndri26@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Homepage/Page_frontend-web/input_Password_input-21'), 'Dewisukasuka123')
		WebUI.click(findTestObject('Object Repository/Homepage/Page_frontend-web/span_Login'))
	}
	@Then("User click detail products")
	def clickDetailProducts() {
		println("\n I view product detail product")
		WebUI.click(findTestObject('Object Repository/Homepage/Page_frontend-web/span_Detail'))
		WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_frontend-web/p_Sony PS5'), 'Sony PS5')
		WebUI.closeBrowser()
	}
	@Given("User is on the home page")
	def isOnTheHomepage() {
		println("\n I is on the homepage")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
		WebUI.setText(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/input_Email_input-18'), 'dewiptrwlndri26@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/input_Password_input-21'),
				'Dewisukasuka123')
		WebUI.click(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/span_Login'))
	}
	@When("User click buy products")
	def clickBuyProducts() {
		println("\n I click buy products")
		WebUI.click(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/span_Beli'))
	}
	@Then("User click cart")
	def clickCart() {
		println("\n I successfully add item to cart")
		WebUI.click(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-shoppi_c66ce9'))
		WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-shoppi_c66ce9'),
				'')
		WebUI.closeBrowser()
	}
	@Given("User navigates to homepage")
	def navigatesToHomepage() {
		println("\n I navigates to homepage")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
		WebUI.setText(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/Page_frontend-web/input_Email_input-18'),
				'dewiptrwlndri26@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/Page_frontend-web/input_Password_input-21'),
				'Dewisukasuka123')
		WebUI.click(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/Page_frontend-web/button_Login'))
	}
	@When("User click select category")
	def clickSelectCategory() {
		println("\n I select category")
		WebUI.click(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/Page_frontend-web/div_AltaShop_v-select__selections'))
	}
	@And("User choose category")
	def chooseCategory() {
		println("\n I choose category")
		WebUI.click(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/Page_frontend-web/div_gaming'))
	}
	@Then("User find the selected items")
	def findTheSelectedItems() {
		println("\n I find the selected items")
		WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/Page_frontend-web/div_Products is empty'),
				'Products is empty!')
		WebUI.closeBrowser()
	}
	@Given("User has finished selected a category")
	def hasFinishedSelectedACategory() {
		println("\n I has finished selected a category")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
		WebUI.setText(findTestObject('Object Repository/Homepage_New/Page_frontend-web/input_Email_input-18'), 'dewiptrwlndri26@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Homepage_New/Page_frontend-web/input_Password_input-21'), 'Dewisukasuka123')
		WebUI.click(findTestObject('Object Repository/Homepage_New/Page_frontend-web/span_Login'))
		WebUI.click(findTestObject('Object Repository/Homepage_New/Page_frontend-web/div_AltaShop_v-input__icon v-input__icon--append'))
		WebUI.click(findTestObject('Object Repository/Homepage_New/Page_frontend-web/div_gaming'))
	}
	@When("User click the cross icon")
	def clickTheCrossIcon() {
		println("\n I click the cross icon")
		WebUI.click(findTestObject('Object Repository/Homepage_New/Page_frontend-web/button_gaming_v-icon notranslate v-icon--li_c78751'))
	}
	@Then("User see all product in homepage")
	def seeAllProductInHomepage() {
		println("\n I see all product in homepage")
		WebUI.verifyElementText(findTestObject('Object Repository/Homepage_New/Page_frontend-web/div_AltaShop_v-select__selections'),
				'')
		WebUI.closeBrowser()
	}
	@Given("User navigates to the homepage")
	def navigatesToTheHomepage() {
		println("\n I navigates to the homepage")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
		WebUI.click(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/div_Email'))
		WebUI.setText(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/input_Email_input-18'),
				'dewiptrwlndri26@gmail.com')
		WebUI.click(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/div_Password'))
		WebUI.setText(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/input_Password_input-21'),
				'Dewisukasuka123')
		WebUI.click(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/span_Login'))
	}
	@When("User click detail")
	def clickDetail() {
		println("\n I click detail")
		WebUI.click(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/span_Detail'))
	}
	@And("User give rating product")
	def giveRatingProduct() {
		println("\n I give rating product")
		WebUI.click(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/button_gaming_v-icon notranslate v-icon--li_4f0478'))
		WebUI.click(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/button_gaming_v-icon notranslate v-icon--li_4f0478'))
	}
	@Then("User click altashop")
	def clickAltashop() {
		println("\n I click altashop")
		WebUI.click(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/h3_AltaShop'))
		WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/div_5'),
				'5')
		WebUI.closeBrowser()
	}
	@Given("User has finished rated the product")
	def hasFinishedRatedTheProduct() {
		println("\n I has finished rated the product")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
		WebUI.setText(findTestObject('Object Repository/Homepage3/Page_frontend-web/Page_frontend-web/input_Email_input-18'), 'dewiptrwlndri26@gmail.com')
		WebUI.click(findTestObject('Object Repository/Homepage3/Page_frontend-web/Page_frontend-web/div_Password'))
		WebUI.setText(findTestObject('Object Repository/Homepage3/Page_frontend-web/Page_frontend-web/input_Password_input-21'),
				'Dewisukasuka123')
		WebUI.click(findTestObject('Object Repository/Homepage3/Page_frontend-web/Page_frontend-web/span_Login'))
		WebUI.click(findTestObject('Object Repository/Homepage3/Page_frontend-web/Page_frontend-web/button_Detail'))
	}
	@When("User change product rating")
	def changeProductRating() {
		println("\n I change product rating")
		WebUI.click(findTestObject('Object Repository/Homepage3/Page_frontend-web/Page_frontend-web/button_gaming_v-icon notranslate v-icon--li_4f0478'))
	}
	@Then("User clicks altashop")
	def clicksAltashop() {
		println("\n I clicks altashop")
		WebUI.click(findTestObject('Object Repository/Homepage3/Page_frontend-web/Page_frontend-web/h3_AltaShop'))
		WebUI.verifyElementText(findTestObject('Object Repository/Homepage3/Page_frontend-web/Page_frontend-web/div_4'), '4')
		WebUI.closeBrowser()
	}
	@Given("User finished product rating change")
	def finishedProductRatingChange() {
		println("\n I finished product rating change")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
		WebUI.setText(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/input_Email_input-18'),
				'dewiptrwlndri26@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/input_Password_input-21'),
				'Dewisukasuka123')
		WebUI.click(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/span_Login'))
		WebUI.click(findTestObject('Homepage/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/span_Detail'))
	}
	@Then("User click icon alta shop")
	def clickIconAltaShop() {
		println("\n I click icon alta shop")
		WebUI.click(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/h3_AltaShop'))
		WebUI.verifyElementText(findTestObject('Object Repository/Homepage/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/h3_AltaShop'),
				'AltaShop')
		WebUI.closeBrowser()
	}
}