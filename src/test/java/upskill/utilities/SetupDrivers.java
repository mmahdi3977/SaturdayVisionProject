package upskill.utilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;


public class SetupDrivers {

	public static WebDriver driver; 							// initializing driver ***VERY IMPORTANT***

	public static void setupDriver() {

//		System.setProperty("webdriver.chrome.driver", "C:\\Upskill\\chromedriver2.exe"); // chrome driver from local machine

		WebDriverManager.chromedriver().setup();				// getting chrome driver from cloud - Boni Garcia plugin from cloud
		ChromeOptions options = new ChromeOptions(); 			// initializing chrome options

		options.addArguments("--start-maximized");				// add argument to maximize browser
		options.addArguments("--disable-notifications");		// add argument to disable notifications
//		options.addArguments("-- headless");					// headless execution

		driver = new ChromeDriver(options);						// initializing Chrome driver
		driver.get("https://www.ebay.com/");					// loading the page
		
//		webDriver driver = new ChromeDriver();					// How you initialize a new web driver (interview question)

	}

	public static WebDriver getDriver() {						// return driver to call
		return driver;
	}

	public static void tearDownDriver() {
		driver.close();											// closing current driver
		driver.quit();											// closing all driver

	}

}