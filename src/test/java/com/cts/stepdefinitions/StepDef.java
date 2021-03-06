package com.cts.stepdefinitions;


import org.openqa.selenium.WebDriver;
import com.cts.Launchwebdriver.LaunchWebdriver;
import com.cts.Pages.CartPage;
import com.cts.Pages.HomePage;
import com.cts.Pages.LoginPage;
import com.cts.Pages.OrderPage;
import com.cts.utils.ReadExcel;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver driver;
	// objects for constructors
	LaunchWebdriver LU = new LaunchWebdriver();
	HomePage HP = new HomePage();
	CartPage CP = new CartPage();
	LoginPage LP = new LoginPage();
	OrderPage OP = new OrderPage();

	@Given("I have browser with jain book agency")
	public void i_have_browser_with_jain_book_agency() {
		LU.setup();
		this.driver = LU.driver;
	}

	@When("I should select book and I should add to cart and I should select location {string} and I should login {string},{string} and I should select payment method")
	public void i_should_select_book_and_I_should_add_to_cart_and_I_should_select_location_and_I_should_login_and_I_should_select_payment_method(
			String string, String string2, String string3) throws Throwable {
		//Add to cart
		HP.addtoCart(driver);
		//Selecting location and login for placing order
		CP.selectLocation(driver, string, string2, string3);
		//Selecting payment method
		OP.paymentMethod(driver);

	}

	@Then("Assert on presence of element {string}")
	public void assert_on_presence_of_element(String string) {
		//Checking weather payment method is selected or not
		OP.paymentAssertion(driver, string);
		//Taking screenshot and quit the browser
		LU.termination();

	}

	@When("I should click on hotbargin and I should click on search and enter the book title {string}")
	public void i_should_click_on_hotbargin_and_I_should_click_on_search_and_enter_the_book_title(String string)
			throws Throwable {
		//Clicking in Hotbargin and search book with title
		HP.clickHotBargin(driver, string);
	}

	@Then("Assert on presence of book {string}")
	public void assert_on_presence_of_book(String string) throws Throwable {
		//Check weather book is present or not
		HP.bookAssert(driver, string);
		//Taking screenshot and quit the browser
		LU.termination();

	}

	@When("I should click on subscription and I should enter my mail {string}")
	public void i_should_click_on_subscription_and_I_should_enter_my_mail(String string) {
		//Add mail to subscribe
		HP.subscription(driver, string);
	}

	@Then("I should check subscriber mail is present or not {string}")
	public void i_should_check_subscriber_mail_is_present_or_not(String string) {
		//Check weather mail is subscribed or not
		HP.mailPresent(driver, string);
		//Taking screenshot and quit the browser
		LU.termination();
	}

	@When("I should select book and add to cart")
	public void i_should_select_book_and_add_to_cart() throws Throwable {
		//Add to cart
		HP.addtoCart(driver);
	}

	@Then("I should remove book from cart")
	public void i_should_remove_book_from_cart() {
		//Remove from cart
		CP.removeCart(driver);
		//Taking screenshot and quit the browser
		LU.termination();
	}

	@When("I enter wrong login details from Excel {string} with SheetName {string}.")
	public void i_enter_wrong_login_details_from_Excel_with_SheetName(String string, String string2) throws Throwable {
		//Reading data from excel sheet 
		String str[][] = ReadExcel.getSheetIntoStringArray(string, string2);
		//Login with valid data
		LP.login(driver, str[0][0], str[0][1]);
	}

	@Then("I should logout from the page")
	public void i_should_logout_from_the_page() {
	    //Logout form the existing account 
		HP.logout(driver);
		//Taking screenshot and quit the browser
		LU.termination();
	}
}