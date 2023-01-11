package stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Then;
import junit.framework.Assert;
import toyoto.in.*;

public class Test_step_defination_overviewstep extends BasePage {
	WebDriver driver;
	Overviewstepspage Overviewstepspage=new Overviewstepspage(driver);

	@Then("validate the product is added to the cart")
	public void validate_the_product_is_added_to_the_cart() {
		driver.findElement(By.xpath("//img[@alt='Shopping Cart']")).click();
		Assert.assertEquals("2.5L CAMRY 2023", driver.findElement(By.xpath("(//div[contains(.,'2.5L CAMRY 2023')])[22]")));
	}

	@Then("click on Make your choices button and choose {string} and {string}")
	public void click_on_make_your_choices_button_and_choose_and(String area, String showroom) {
		Overviewstepspage.lnk_makeyourchoice.click();
		
		Select area1=new Select(Overviewstepspage.ddl_area);
		area1.selectByVisibleText(area);
		Select showroom1=new Select(Overviewstepspage.ddl_showroom);
		showroom1.selectByVisibleText(showroom);
		Overviewstepspage.lnk_confirm.click();
		
	}

	@Then("click on select finance")
	public void click_on_select_finance() {
		Overviewstepspage.lnk_selectyourfinance.click();
	}

	@Then("click on pay deposit")
	public void click_on_pay_deposit() {
		Overviewstepspage.lnk_deposit.click(); 
	}

	@Then("click on register now")
	public void click_on_register_now() {
		Overviewstepspage.lnk_registernow.click();
	}

	
}
