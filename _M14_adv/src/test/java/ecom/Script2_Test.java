package ecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script2_Test {
	@Test
	public void Script02() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Books")).click();
		Reporter.log("Books is clcked");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@value='Add to cart'][1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.partialLinkText("Shopping cart")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("termsofservice")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("checkout")).click();
		driver.findElement(By.xpath("//input[@value='Checkout as Guest']")).click();
		driver.close();
		}
}
