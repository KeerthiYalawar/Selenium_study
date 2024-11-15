package extentReport;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ToAttachScreenShot {

	@Test
	public void addScreenShot()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.flipkart.com/");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		String photo = ts.getScreenshotAs(OutputType.BASE64);
		
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_report/screenShotReport.html");
		//to change the background colour of the report to dart/black
	
		spark.config().setTheme(Theme.DARK);
		
		//to change the title of the report
		
		spark.config().setDocumentTitle("Extent Report");
		
		ExtentReports extReport = new ExtentReports();
		extReport.attachReporter(spark);
		
		//pass the method name in createtest method
		ExtentTest test = extReport.createTest("addScreenShot");
		
		test.log(Status.PASS, "adding ScreenShot to Report");
		test.addScreenCaptureFromBase64String(photo);
		extReport.flush();
	}
	
}
