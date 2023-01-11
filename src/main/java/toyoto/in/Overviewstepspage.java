package toyoto.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Overviewstepspage {
	

WebDriver driver;

public Overviewstepspage(WebDriver driver) {
    this.driver = driver;
    PageFactory.initElements(driver, this);
}
	 @FindBy(xpath = "(//span[contains(.,'Make your choices')])[1]")
	 public WebElement lnk_makeyourchoice;
	 
	 @FindBy(xpath = "//select[contains(@name,'area')]")
	 public WebElement ddl_area;
	 
	 @FindBy(xpath = "//div[@class='col-lg-4'][contains(.,'Showroom Select')]")
	 public WebElement ddl_showroom;
	 
	 @FindBy(xpath = "//input[contains(@value,'Confirm')]")
	 public WebElement lnk_confirm;
	 
	 @FindBy(xpath = "(//span[contains(.,'Select your finance')])[2]")
	 public WebElement lnk_selectyourfinance;
	 
	 @FindBy(xpath = "(//span[contains(.,'Pay deposit')])[1]")
	 public WebElement lnk_deposit;
	 
	 @FindBy(xpath = "//button[contains(.,'Register Now')]")
	 public WebElement lnk_registernow;

	 
}
