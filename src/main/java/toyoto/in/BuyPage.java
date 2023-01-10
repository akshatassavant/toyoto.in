package toyoto.in;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BuyPage {
	 @FindBy(xpath = "//a[@class='nav-link navbar-toggle'][contains(.,'Models')]")
	 public WebElement lnk_models;
	 
	 @FindBy(xpath = "(//p[contains(.,'Buy Online')])[23]")
	 public WebElement lnk_buyonline;
	 
	 @FindBy(xpath = "//span[contains(.,'Configure & Buy')]")
	 public WebElement lnk_configure_buy;
	 
	 @FindBy(xpath = "//span[contains(.,'Configure & Buy')]")
	 public WebElement lnk_choose;
	 
	 @FindBy(xpath = "//span[contains(.,'Available now')]")
	 public WebElement lnk_availablenow;
	 
	 @FindBy(xpath = "//span[contains(.,'Buy now')]")
	 public WebElement lnk_buynow;
	 
	 
}
