package extentReport;

import java.time.LocalDateTime;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ToLearnExtentReport {
@Test
public void report() {
	String timeStamp = LocalDateTime.now().toString().replace(":","");
	//Create an instance of ExtentSparkReporter
	
	ExtentSparkReporter spark = new ExtentSparkReporter("./HTML_report/extentReport"+timeStamp+".html");

	//Create an instance of ExtentReports
	ExtentReports extReport = new ExtentReports();

	//attach an instance of extentSparkReporter to ExtentReport
	extReport.attachReporter(spark);

	//Create an instance of ExtentTest
	ExtentTest test = extReport.createTest("report");

	//cal log() to provide status and log message
	test.log(Status.PASS, "log message added into Report");
	test.log(Status.INFO, "Open Browser");

	//call flush() to write messages in to destination
	extReport.flush();
	}
	




}
