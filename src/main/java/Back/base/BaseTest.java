package Back.base;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {
	
protected static WebDriver driver;
	
	@BeforeClass
	public static void setup ()
	{
		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
		driver= new ChromeDriver ();
		driver.get("http://computer-database.herokuapp.com/computers");
	}
	
	@AfterClass
	public static void TearDown ()
	{
		driver.quit();
	}

}
