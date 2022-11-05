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



class TransactionSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User is on the homepage")
	def isOnTheHomepage() {
		println("\n I is on the homepage")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
		WebUI.setText(findTestObject('Object Repository/Transaction_New/Page_frontend-web/input_Email_input-18'), 'dewiptrwlndri26@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Transaction_New/Page_frontend-web/input_Password_input-21'), 'Dewisukasuka123')
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/span_Login'))
	}
	@When("User clicks profil icon at navbar")
	def clicksProfilIconAtNavbar() {
		println("\n I clicks profil icon at navbar")
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-user t_f0827e'))
	}
	@Then("User clicks transaction")
	def clicksTransaction() {
		println("\n I clicks transaction")
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/div_Transaksi'))
		WebUI.doubleClick(findTestObject('Object Repository/Transaction_New/Page_frontend-web/div_AltaShop0'))
		WebUI.verifyElementText(findTestObject('Object Repository/Transaction_New/Page_frontend-web/td_No data available'), 'No data available')
		WebUI.closeBrowser()
	}
	@Given("User is on homepage")
	def isOnHomepage() {
		println("\n I is on homepage")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/')
	}
	@Then("User clicks arrow icon in navbar")
	def clicksArrowIconInNavbar() {
		println("\n I clicks arrow icon in navbar")
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-sign-i_3d16a9'))
		WebUI.verifyElementText(findTestObject('Object Repository/Transaction_New/Page_frontend-web/div_Login'), 'Login')
		WebUI.closeBrowser()
	}
	@Given("User on transaction page")
	def OnTransactionPage() {
		println("\n I on transaction page")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
		WebUI.setText(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/input_Email_input-18'),
				'dewiptrwlndri26@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/input_Password_input-21'),
				'Dewisukasuka123')
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/button_Login'))
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-user t_f0827e'))
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/div_Transaksi'))
		WebUI.doubleClick(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/div_AltaShop0'))
	}
	@Then("User organize products based on high and low")
	def organizeProductBasedOnHighAndLow() {
		println("\n I organize products based on high and low")
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/i_Produk_v-icon notranslate v-data-table-he_8db174'))
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/i_Produk_v-icon notranslate v-data-table-he_8db174_1'))
		WebUI.verifyElementText(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/td_No data available'),
				'No data available')
		WebUI.closeBrowser()
	}
	@Given("User on the transaction page")
	def OnTheTransactionPage() {
		println("\n I on the transaction page")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
		WebUI.setText(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/input_Email_input-18'),
				'dewiptrwlndri26@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/input_Password_input-21'),
				'Dewisukasuka123')
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/span_Login'))
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-user t_f0827e'))
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/div_Transaksi'))
		WebUI.doubleClick(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/div_AltaShop0'))
	}
	@Then("User organize price based on high and low")
	def organizePriceBasedOnHighAndLow() {
		println("\n I organize price based on high and low")
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/i_Harga_v-icon notranslate v-data-table-hea_4f5547'))
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/i_Harga_v-icon notranslate v-data-table-hea_4f5547_1'))
		WebUI.verifyElementText(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/td_No data available'),
				'No data available')
		WebUI.closeBrowser()
	}
	@Given("User is on transaction page")
	def isOnTransactionPage() {
		println("\n I is on transaction page")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
		WebUI.setText(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/input_Email_input-18'),
				'dewiptrwlndri26@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/input_Password_input-21'),
				'Dewisukasuka123')
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/span_Login'))
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-user t_f0827e'))
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/div_Transaksi'))
		WebUI.doubleClick(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/div_AltaShop0'))
	}
	@Then("User organize amount based on high and low")
	def organizeAmountBasedOnHighAndLow() {
		println("\n I organize amount based on high and low")
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/i_Banyaknya_v-icon notranslate v-data-table_53cca4'))
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/i_Banyaknya_v-icon notranslate v-data-table_53cca4_1'))
		WebUI.verifyElementText(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/td_No data available'),
				'No data available')
		WebUI.closeBrowser()
	}
	@Given("User is on the transaction page")
	def isOnTheTransactionPage() {
		println("\n I is on transaction page")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
		WebUI.setText(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/input_Email_input-18'),
				'dewiptrwlndri26@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/input_Password_input-21'),
				'Dewisukasuka123')
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/span_Login'))
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-user t_f0827e'))
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/div_Transaksi'))
		WebUI.doubleClick(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/div_AltaShop0'))
	}
	@Then("User organize sub total based on high and low")
	def organizeSubTotalBasedOnHighAndLow() {
		println("\n I organize sub total based on high and low")
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/i_Sub-total_v-icon notranslate v-data-table_e7a03f'))
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/i_Sub-total_v-icon notranslate v-data-table_e7a03f_1'))
		WebUI.verifyElementText(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/td_No data available'),
				'No data available')
		WebUI.closeBrowser()
	}
	@Given("User in transaction page")
	def inTransactionPage() {
		println("\n I in transaction page")
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
		WebUI.setText(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/input_Email_input-18'),
				'dewiptrwlndri26@gmail.com')
		WebUI.setText(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/input_Password_input-21'),
				'Dewisukasuka123')
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/span_Login'))
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-user t_f0827e'))
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/div_Transaksi'))
		WebUI.doubleClick(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/div_AltaShop0'))
	}
	@Then("Choose rows")
	def chooseRows() {
		println("\n I choose rows")
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/i_Rows per page_v-icon notranslate fas fa-c_c04830'))
		WebUI.click(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/div_5'))
		WebUI.verifyElementText(findTestObject('Object Repository/Transaction_New/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/Page_frontend-web/td_No data available'),
				'No data available')
		WebUI.closeBrowser()
	}
}