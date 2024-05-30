package ecom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Script3_Test
{
	@Test
	public void Script03() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.findElement(By.id("gender-female")).click();
		
		driver.findElement(By.xpath("//input[@class='text-box single-line']")).sendKeys("Samreen");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys("Qureshi");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("samreenqureshik551@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("12345678");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys("12345678");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Register']")).click();
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//input[@value='Continue']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.linkText("Log in")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[name='Email']")).sendKeys("samreenqureshik31@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("#Password")).sendKeys("12345678");//two ways of writing using css selector if it is id # is used,if class . is used 
//		Thread.sleep(2000);
		
//		driver.findElement(By.id("RememberMe")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.cssSelector("input[value='Log in']")).click();
//		Thread.sleep(5000);
		driver.get("https://demowebshop.tricentis.com/register");

		driver.close();
	}
}
