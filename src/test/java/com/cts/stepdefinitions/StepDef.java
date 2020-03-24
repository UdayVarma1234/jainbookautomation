package com.cts.stepdefinitions;

import org.openqa.selenium.WebDriver;
import com.cts.Launchwebdriver.LaunchWebdriver;
import com.cts.Pages.CartPage;
import com.cts.Pages.HomePage;
import com.cts.Pages.LoginPage;
import com.cts.Pages.OrderPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDef {
	WebDriver driver;

	@Given("I have browser with jain book agency")
	public void i_have_browser_with_jain_book_agency() {
		LaunchWebdriver.setup();
		this.driver = LaunchWebdriver.driver;
	}

	@When("I should select book and I should add to cart and I should select location {string} and I should login {string},{string} and I should select payment method")
	public void i_should_select_book_and_I_should_add_to_cart_and_I_should_select_location_and_I_should_login_and_I_should_select_payment_method(
			String string, String string2, String string3) throws Throwable {

		HomePage.addtoCart(driver);
		CartPage.selectLocation(driver, string, string2, string3);
		OrderPage.paymentMethod(driver);

	}

	@Then("Assert on presence of element {string}")
	public void assert_on_presence_of_element(String string) {
		OrderPage.paymentAssertion(driver, string);

	}

	@When("I should click on hotbargin and I should click on search and enter the book title {string}")
	public void i_should_click_on_hotbargin_and_I_should_click_on_search_and_enter_the_book_title(String string) {
		HomePage.clickHotBargin(driver, string);
	}

	@Then("Assert on presence of book {string}")
	public void assert_on_presence_of_book(String string) {
		HomePage.bookAssert(driver, string);

	}

	@When("I should click on subscription and I should enter my mail {string}")
	public void i_should_click_on_subscription_and_I_should_enter_my_mail(String string) {
		HomePage.subscription(driver, string);
	}

	@Then("I should check subscriber mail is present or not {string}")
	public void i_should_check_subscriber_mail_is_present_or_not(String string) {
		HomePage.mailPresent(driver, string);

	}

	@When("I should select book and add to cart")
	public void i_should_select_book_and_add_to_cart() throws Throwable {
	  HomePage.addtoCart(driver);
	}

	@Then("I should remove book from cart")
	public void i_should_remove_book_from_cart() {
		CartPage.removeCart(driver);
	}

	@When("I should login {string},{string} with valid crediential")
	public void i_should_login_with_valid_crediential(String string, String string2) throws Throwable {
		LoginPage.login(driver, string, string2);
	}

	@Then("I should logout from the page")
	public void i_should_logout_from_the_page() {
		HomePage.logout(driver);
	}

}
