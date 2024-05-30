package food;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;


public class dominos_Test 
{
@Test
public void launch()
{
	WebDriver driver=new ChromeDriver();
	Reporter.log("dominos website");
	driver.get("https://www.dominos.co.in/");
	driver.close();
}
}
