package extentReport;

import java.time.LocalDateTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Script01 {
@Test
public void script1() throws InterruptedException
{
	WebDriver driver;
	ScreenshotMethod ss=new ScreenshotMethod();
	LocalDateTime datetime=LocalDateTime.now();
	String date = datetime.toString().replace(":", "-");
	ExtentReports reports= new ExtentReports();
	ExtentSparkReporter report=new ExtentSparkReporter("./reports/"+date+".html");
	reports.attachReporter(report);
	ExtentTest test = reports.createTest("LogIn");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	test.log(Status.INFO,"browser is maximised");
	driver.get("https://demowebshop.tricentis.com/");
	test.log(Status.INFO,"browser is launched demowebshop");
	driver.findElement(By.linkText("Log in")).click();
	test.log(Status.INFO,"login to demo webshop");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("samreenqureshik31@gmail.com");
	test.log(Status.INFO,"entered the email");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("#Password")).sendKeys("12345678");//two ways of writing using css selector if it is id # is used,if class . is used 
	test.log(Status.INFO,"entered password");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector("input[value='Log in']")).click();
	test.log(Status.INFO,"logged into demo webshop");
	Thread.sleep(5000);
	try {
		if(driver.findElement(By.linkText("Log Out")).isDisplayed()) {
			test.pass(MediaEntityBuilder.createScreenCaptureFromPath(ss.takeScreenshot(driver)).build());
	}}
	catch(Exception e)
	{
			test.fail(MediaEntityBuilder.createScreenCaptureFromPath(ss.takeScreenshot(driver)).build());
	}
	reports.flush();
}
}
