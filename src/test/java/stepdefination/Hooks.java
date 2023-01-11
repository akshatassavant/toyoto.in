package stepdefination;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks extends BasePage{
	@Before //Cucumber Before Hook
	public static void setupDriver() throws Exception {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(chromeOptions);
		System.out.println("launch chrome browser");
		driver.manage().window().maximize();
		driver.get("https://www.toyota.ae/en/");
		screenshot.takeSnapShot(driver, fileWithPath);
		Thread.sleep(2000);
	}

	@After // Cucumber After hook
	public static void quitDriver() throws Exception {
		driver.quit();
}
}