package toyoto.in;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InitialSetup {

	public static WebDriver driver=null;
	
	
	public void driverSetup() throws InterruptedException
	{
	ChromeOptions chromeOptions = new ChromeOptions();
	chromeOptions.addArguments("--disable-notifications");
	//WebDriverManager.chromedriver().setup();
	//driver=new ChromeDriver();
	System.setProperty("webdriver.chrome.driver", "D:\\Chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(chromeOptions);
	System.out.println("launch chrome browser");
	driver.get("https://www.toyota.ae/en/");
	Thread.sleep(2000);
		 
	          
	}
	
	
	

}
