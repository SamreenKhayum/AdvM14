package food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class pizzahut_Test 
{
@Test
public void launch()
{
	WebDriver driver=new ChromeDriver();
	Reporter.log("pizza website");
	driver.get("https://www.pizzahut.co.in/");
	driver.close();
}
}
