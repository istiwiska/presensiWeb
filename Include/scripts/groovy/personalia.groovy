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



class personalia {
	@Given("user on homepage with validID")
	def user_on_homepage_with_validid() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://pressensi.com/login/')
		WebUI.maximizeWindow()
		WebUI.setText(findTestObject('Object Repository/Page_Pressensi.com  Log in/input_Sign In_username'), "220102")
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Pressensi.com  Log in/input_Sign In_password'), "iGDxf8hSRT4=")
		WebUI.click(findTestObject('Object Repository/Page_Pressensi.com  Log in/button_Sign in'))
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Pressensi.com  Log in/div_Login Success'), 4)
	}

	@And("user click personalia")
	def user_click_personalia() {
		WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Pressensi.com  Dashboard/a_Personalia'))
		WebUI.click(findTestObject('Object Repository/Page_Pressensi.com  Dashboard/a_Personalia'))
	}

	@Then("user click button (.*)")
	def user_click_button(String condition) {
		if(condition=="copy") {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Pressensi.com  Dashboard/button_Copy'),4)
			WebUI.click(findTestObject('Object Repository/Page_Pressensi.com  Dashboard/button_Copy'))
			println("User click copy button")
		}
		else if (condition=="csv") {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Pressensi.com  Dashboard/button_CSV'),4)
			WebUI.click(findTestObject('Object Repository/Page_Pressensi.com  Dashboard/button_CSV'))
			println("User click csv button")
		}
		else if (condition=="excel") {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Pressensi.com  Dashboard/button_Excel'),4)
			WebUI.click(findTestObject('Object Repository/Page_Pressensi.com  Dashboard/button_Excel'))
			println("User click excel button")
		}
		else if (condition=="pdf") {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Pressensi.com  Dashboard/button_PDF'),4)
			WebUI.click(findTestObject('Object Repository/Page_Pressensi.com  Dashboard/button_PDF'))
			println("User click pdf button")
		}
		else if (condition=="print") {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Pressensi.com  Dashboard/button_Print'),4)
			WebUI.click(findTestObject('Object Repository/Page_Pressensi.com  Dashboard/button_Print'))
			println("User click print button")
			WebUI.closeWindowIndex(1)
			WebUI.delay(1)
			WebUI.switchToWindowIndex(0)
			WebUI.delay(1)
		}
		else {
			println ("System Error")
		}
	}

	@Then("user click asc dsc in (.*) coloumn")
	def user_click_asc_dsc(String condition) {
		if(condition=="namaStaff") {
			WebUI.doubleClick(findTestObject('Object Repository/Page_Pressensi.com  Dashboard/th_Nama Staff'))
			println("User click nama staff coloumn")
		}
		else if (condition=="jabatan") {
			WebUI.doubleClick(findTestObject('Object Repository/Page_Pressensi.com  Dashboard/th_Jabatan'))
			println("User click jabatan coloumn")
		}
		else {
			println ("System Error")
		}
	}

	@Then("user should get success")
	def user_should_get_success() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Pressensi.com  Dashboard/th_Nama Staff'),4)
		WebUI.closeBrowser()
	}
}