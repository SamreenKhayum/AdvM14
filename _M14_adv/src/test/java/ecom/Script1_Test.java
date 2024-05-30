package ecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script1_Test {
	@Test
	public void Script01() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		Reporter.log("Books is clcked");
		Thread.sleep(3000);
		driver.close();
		//mvn clear, mvn validate, mvn compile, ,
		//mvn test which will execute only IT.xml becuse in pom IT.xml suite is there
		//if we remove suite in pom and give mvn test it will excute all 9 scripts
	}
}
