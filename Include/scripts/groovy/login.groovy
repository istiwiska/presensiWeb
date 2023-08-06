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



class login {
	@Given("user navigate to presensi.com")
	def user_navigate_to_presensi_com() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://pressensi.com/login/')
		WebUI.maximizeWindow()
	}

	@And("user enter username as (.*) and password as (.*)")
	def user_enter_username_and_password(String username, String password) {
		WebUI.setText(findTestObject('Object Repository/Page_Pressensi.com  Log in/input_Sign In_username'), username)
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Pressensi.com  Log in/input_Sign In_password'), password)
	}

	@When("user click sign in button")
	def user_click_sign_in_button() {
		WebUI.click(findTestObject('Object Repository/Page_Pressensi.com  Log in/button_Sign in'))
	}

	@Then("user verify the (.*) in step")
	def user_verify_the_status_in_step(String condition) {
		if(condition=="loginSuccess") {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Pressensi.com  Log in/div_Login Success'), 4)
			println("Login Success")
		}
		else if (condition=="passwordNotValid") {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Pressensi.com  Log in/div_Username dan password tidak cocok'), 4)
			println("Password not valid")
		}
		else if (condition=="emailNotValid") {
			WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Pressensi.com  Log in/div_Username dan password tidak cocok'), 4)
			println("Password not valid")
		}
		else {
			println ("System Error")
		}

		WebUI.closeBrowser()
	}
}