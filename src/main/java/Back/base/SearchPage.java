package Back.base;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SearchPage {
	
	private WebDriver driver;
	By searchBar = By.id("searchbox");
	By filterbyname = By.id ("searchsubmit");
	By clearfilterbutton = By.xpath(".//a[@name='Clear text']");
	
	//Constructor
	public  SearchPage (WebDriver driver)
	{
		this.driver = driver ;
	}	
	
	public void search (String text)
	{
		search (text, true);
	}
	
	//overload method
		public void search (String text,boolean waitforfilter)
		{
			clear ();
			driver.findElement(searchBar).sendKeys(text);
			
			if (waitforfilter)
			{
				WebDriverWait wait = new WebDriverWait (driver, 5);
				wait.until(ExpectedConditions.presenceOfElementLocated(hiddenBooks));
			}
		}
		
		//to clear the value in filter textbox 
		public void clear()
		{
			driver.findElement(searchBar).clear();
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.numberOfElementsToBe(hiddenBooks, 0));
		}
		
		public boolean doesAllVisibleBooksContainsTitle (String text)
		{
			return doesAllVisibleNamesContains (text, "title");
		}

}
