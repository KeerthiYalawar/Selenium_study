package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyboardActions {

	@Test
	public void keyboard()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions action=new Actions(driver);
		driver.get("https://demowebshop.tricentis.com/");
		WebElement electronis = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		//electronis.click();
		action.moveToElement(electronis).perform();
		driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[1]")).click();
		
		
		
		
	}
}
