package stepdefination;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import toyoto.in.*;

public class Test_step_defination_buy_now extends BasePage{
	WebDriver driver;
	screenshot screenshot=new screenshot();
	
	BuyPage user=new BuyPage(driver);
	
	
	@Given("^user navigates to toyoto car website$")
	public void user_navigates_to_toyoto_car_website() throws InterruptedException {
		InitialSetup initial=new InitialSetup();
		System.out.println("initial");
        initial.driverSetup();
		
		
	}

	@Then("^click on Moduls menu$")
	public void click_on_moduls_menu() throws Exception {
		System.out.println("click on models");
		user.lnk_models.click();
		screenshot.takeSnapShot(driver, fileWithPath);
	
	}

	@Then("^click on Buy Online from list of cars$")
	public void click_on_buy_online_from_list_of_cars() {
	    user.lnk_buyonline.click();
	}

	@Then("^click on Configure & Buy button$")
	public void click_on_configure_buy_button() {
		user.lnk_configure_buy.click();
	}

	@Then("^click Choose and available now button$")
	public void click_choose_and_available_now_button() {
		user.lnk_choose.click();
		user.lnk_availablenow.click();
		
	}

	@Then("^click on Buy now button and add to cart$")
	public void click_on_buy_now_button_and_add_to_cart() {
	
		user.lnk_buynow.click();
	}

}
