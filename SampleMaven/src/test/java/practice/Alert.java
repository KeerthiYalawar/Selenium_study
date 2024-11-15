package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Alert {

	@Test
	
	public void handlealert()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://www.shoppersstack.com/products_page/23");
		driver.findElement(By.name("compare")).click();
		
		Set<String> allWindowHandles = driver.getWindowHandles();
		for(String s:allWindowHandles)
		{
		  	driver.switchTo().window(s);
		  	String url = driver.getCurrentUrl();
		  	
		  	if (url.contains("flipkart"))
		  	{
		  		break;
		  	}
		}
		
		driver.manage().window().maximize();
		
		}
		
		
		
		

		
	}
	

